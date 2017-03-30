package di.univaq.MOSQUITO.server;

import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.uml.Model;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import PmifSchema.util.PmifSchemaXMLProcessor;
import di.univaq.MOSQUITO.MetaModReadWrite.EgSwComponentReader;
import di.univaq.MOSQUITO.MetaModReadWrite.EgWriterReader;
import di.univaq.MOSQUITO.MetaModReadWrite.QnHwComponentReader;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.Parser.Omondo.ParserComponent;
import di.univaq.MOSQUITO.Parser.Omondo.ParserSequence;
import di.univaq.MOSQUITO.Parser.Omondo.ParserUseCase;
import di.univaq.MOSQUITO.Parser.Plastic.ParserComponentPlastic;
import di.univaq.MOSQUITO.Parser.Plastic.ParserSequencePlastic;
import di.univaq.MOSQUITO.Parser.Plastic.ParserUseCasePlastic;
import di.univaq.MOSQUITO.Parser.UML2.ParserComponentUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserDeployment;
import di.univaq.MOSQUITO.Parser.UML2.ParserSequenceUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserUseCaseUML2;
import di.univaq.MOSQUITO.egQnMerger.main.startMergeQnEg;
import di.univaq.MOSQUITO.trasformation.egTrasformation.EgXmlDocument;
import di.univaq.MOSQUITO.trasformation.qnTrasformation.QNXmlDocument;
import di.univaq.MOSQUITO.trasformation.qnhwTrasformation.QNHWTrasformation;
import di.univaq.MOSQUITO.utility.BeanDevices;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;


public class RmiServerImpl  {
	
	private Vector interactions;
	
	private LogManager log;
	
	private String randomNumber = "";
	
	private MOSQUITOUtils mUtils;
	
	//windows machine
	private final String FOLDER = "c:/windows/temp/MOSQUITO_f/";
	
	
	// linux sealab machine
	//private final String FOLDER = /home/sealab/MOSQUITO_files/;
	
	public RmiServerImpl() {
	
		interactions = new Vector();
		log = new LogManager();
		
	}
	
	/**
	 * This method create the xmi parsers used for the output generation.
	 * 
	 * @param docs The xmi documents to process.
	 * @param extensions the extensions of all the passed files.
	 * @param fileNames the Name of all passed files. 
	 * @return a collection of parsers.
	 */
	public Vector genParsers(Vector docs, Vector extensions, Vector fileNames) {
		Vector parsers = new Vector();
		// the size of docs and extensions are the same
		for(int i = 0; i < docs.size(); i++) {
	    	String ext = (String)extensions.get(i);
	    	Document doc = (Document) docs.get(i);
	    	String fileName = (String)fileNames.get(i);
	    	if(ext.equals("uud")) {
	    		parsers.add(new ParserUseCase(doc,log));
	    	}
	    	if(ext.equals("usd")) {
	    		parsers.add(new ParserSequence(doc,log));
	    	}
	    	if(ext.equals("upd")) {
	    		parsers.add(new ParserComponent(doc,log));
	    	}
	    	if (!ext.equals("upd")&& !ext.equals("usd") && !ext.equals("uud") ){
	    		System.out.println("The file "+  fileName + " is not valid for the trasformation");
	    		log.addInfo(PropertiesManager.getProperties("e22")+" "+ fileName + " "+PropertiesManager.getProperties("e23"));
	    	}
	    }
	    return parsers;
	}
	
	public void createFiles(Vector documents, Vector fileNames) {
		
		randomNumber = System.currentTimeMillis()+"/";
	    File f = new File(FOLDER+randomNumber);
	    f.mkdirs();
		for (int i = 0; i < documents.size(); i++ ) {
			 try {
				 String fileOutputName = fileNames.get(i).toString();
			     Document doc = (Document)documents.get(i);
			     TransformerFactory tFactory = TransformerFactory.newInstance();
		         Transformer transformer = tFactory.newTransformer();
		         DOMSource source = new DOMSource(doc);
		   
		         FileOutputStream outFile = new FileOutputStream(FOLDER+randomNumber+ fileOutputName);
		         StreamResult result = new StreamResult(outFile);
		         transformer.transform(source, result); 
		         outFile.close();
			 }
				catch (IOException e) {
					System.out.println("errore IO" + e.getMessage());
					log.addError(PropertiesManager.getProperties("e15")+" "+ e.getMessage());
				}
				catch(TransformerException e ){
					System.out.println("errore durante la trasformazione " + e.getMessage());
					log.addError(PropertiesManager.getProperties("e16")+" "+ e.getMessage());
				}
		}
	}
	
	
	public void createFileUML2V2(Vector fileString, Vector fileNames ) {
		randomNumber = System.currentTimeMillis()+"/";
	    File f = new File(FOLDER+randomNumber);
	    f.mkdirs(); 
		for (int i = 0; i < fileString.size(); i++ ) {
			
			    String fileOutputName = fileNames.get(i).toString();
			    String text = (String)fileString.get(i);
		        saveFile(FOLDER+randomNumber+ fileOutputName,text);

		}
	}
	
	public boolean saveFile(String fileName, String fileString) 
	{ 
		PrintWriter out = null;
	  try 
	  { 
	      out = new PrintWriter( 
	      new BufferedOutputStream(new FileOutputStream(fileName))); 
	      out.print(fileString); 
	      out.close(); 
	  }catch (FileNotFoundException e){ 
	      System.out.println("Save File Error: "+e.getMessage()); 
	      log.addError(PropertiesManager.getProperties("e17")+" "+ e.getMessage());
	      return false; 
	  } 
	  if (out.checkError()) 
	 {  
		System.out.println("Out of memory."); 
		log.addError(PropertiesManager.getProperties("e18"));
	    return false;
	  } 

	return true; 
	}
		
	/**
	 * This method start the creation of the parser starting by the UML2 export V1 Plastic profiled.
	 * 
	 * @param url the absoluute path of the export .uml2
	 * @return The set of parsers created.
	 */
	public Vector genParserUML2(String fileName) {
		Vector parsers = new Vector();
		mUtils = new MOSQUITOUtils();
		new Parser(fileName, log, mUtils);
		
		interactions = mUtils.getAllInteractions();
		for(int i = 0; i < interactions.size(); i++) {
		    Interaction interaction = (Interaction) interactions.get(i);
			parsers.add(new ParserSequencePlastic(interaction,log, mUtils));
		}
		// Tutti i comonent diagram sono inseriti in un determinato package quindi li parso in un solo colpo
		parsers.add(new ParserComponentPlastic(log, mUtils));
		parsers.add(new ParserUseCasePlastic(log, mUtils));
		return parsers;
	}
	
	
	/**
	 * This method start the creation of the parser starting by the UML2 export V2.
	 * 
	 * @param url the absoluute path of the export .uml2
	 * @return The set of parsers created.
	 */
	public Vector genParserUML2V2(String fileName){
		Vector parsers = new Vector();
		EclipseUML2UtilV2 eclipseUtil = new EclipseUML2UtilV2(log);
		Model model = eclipseUtil.loadModel(fileName);
		
		for (Iterator<EObject> i = model.eAllContents(); i.hasNext();) {
			EObject e = (EObject) i.next();
			if(e instanceof org.eclipse.uml2.uml.Interaction) {
				org.eclipse.uml2.uml.Interaction inter = (org.eclipse.uml2.uml.Interaction)e;
				parsers.add(new ParserSequenceUML2(inter, eclipseUtil, this.log));
				interactions.add(inter);
		    }
		}
		// Tutti i component diagram sono inseriti in un determinato package quindi li parso in un solo colpo
		parsers.add(new ParserComponentUML2(model, eclipseUtil,this.log));
		parsers.add(new ParserUseCaseUML2(model, eclipseUtil,this.log));
		return parsers;
	}
	
		
	/**
	 * This method start the generation of the Execution Graph (Prima - UML) usinf the Omondo expot how import.
	 * 
	 * @param docs  The collections of org.w3c.dom.Document to process.
	 * @param extensions the extention of all the files in input
	 * @param fileNames the names of the files passed in input from the client
	 * @return the document xml of an execution graph
	 */
     public Vector EG_Generation(Vector docs, Vector extensions, Vector fileNames) { 
    	String result="";
    	try {
	    	Vector parsers = this.genParsers(docs, extensions, fileNames);
			result = new EgXmlDocument(parsers).cretateDocumentXml(docs, fileNames, log, null);
    	}
    	catch(Exception e) {
    		errorManager(e);
		 } 
		return getReturnList(result);
	 }
     
     
 	/**
 	 * This method start the generation of the Execution Graph (Prima - UML) starting from an
 	 * eclipse uml v1 export Plastic profiled.
 	 * using the EclipseUML2 export how input.
 	 * 
 	 * @param filename The full path of the Eclipse UML2 export.
 	 * @return the document xml of an execution graph
 	 */
     public Vector EG_GenerationUML2(Vector documents, Vector fileNames, String modelFileName) {
    	 String result="";
    	 try {
	    	 createFiles(documents, fileNames);
	    	 Vector parsers = this.genParserUML2(FOLDER+randomNumber+modelFileName);
	    	 result = new EgXmlDocument(parsers).cretateDocumentXml(new Vector(), new Vector(),log, mUtils);
    	 }
    	 catch(Exception e) {
    		 errorManager(e);
		 } 
 		 return getReturnList(result);
     }
     
     /**
   	 * This method start the generation of the Execution Graph (Prima - UML) starting from an
   	 * eclipse uml ve export.
   	 * using the EclipseUML2 export how input.
   	 * 
   	 * @param filename The full path of the Eclipse UML2 export.
   	 * @return the document xml of an execution graph
   	 */
       public Vector EG_GenerationUML2V2(byte[] zippedStream,String modelFileName) {
    	   String result="";
    	   try {
	    	   //createFileUML2V2(stringDoc, fileNames);
    		   unzip(zippedStream);
	      	   Vector parsers = this.genParserUML2V2(FOLDER+randomNumber+modelFileName);
	      	   result = new EgXmlDocument(parsers).cretateDocumentXml(new Vector(), new Vector(),log, null);
    	   }
    	   catch(Exception e) {
    		   errorManager(e);
  		   } 
  		 return getReturnList(result);
       }

     /**
 	 * This method start the generation of the Queue Network (SAPONE) starting from an
 	 * eclipse uml v1 export Plastic profiled.
 	 * @param docs  The collections of org.w3c.dom.Document to process.
 	 * @param extensions the extention of all the files in input
 	 * @param fileNames the names of the files passed in input from the client
 	 * @return the document xml of an execution graph
 	 */
     public Vector QN_Generation(Vector docs, Vector extensions, Vector fileNames) {
    	 String result="";
    	 try {
	    	 Vector returnList = new Vector();
	    	 Vector parsers = this.genParsers(docs, extensions, fileNames);
	    	 result = new QNXmlDocument(parsers).cretateDocumentXml(docs, fileNames,log);
	     }
    	 catch(Exception e) {
    		 errorManager(e);
 		 } 
		 return getReturnList(result);
     }

     /**
  	 * This method start the generation of the Queue Network (SAPONE) starting from an
  	 * eclipse uml v2 export.
  	 * @param docs  The collections of org.w3c.dom.Document to process.
  	 * @param extensions the extention of all the files in input
  	 * @param fileNames the names of the files passed in input from the client
  	 * @return the document xml of an execution graph
  	 */
     public Vector QN_GenerationUML2V2(byte[] zippedStream, String modelFileName) {
    	 String result="";
    	 try {
	    	// createFileUML2V2(stringDoc, fileNames);
	    	 unzip(zippedStream);
	    	 Vector parsers = this.genParserUML2V2(FOLDER + randomNumber + modelFileName);
	    	 result = new QNXmlDocument(parsers).cretateDocumentXml(interactions , new Vector(), log);
	    	 
    	 }
    	 catch(Exception e) {
    		 errorManager(e);
 		 } 
    	 return getReturnList(result);
     }

     /**
  	 * This method start the generation of the Queue Network (SAPONE) using the Omondo export how input.
  	 * 
  	 * @param docs The collections of org.w3c.dom.Document to process.
  	 * @param extensions the extention of all the files in input
  	 * @param fileNames the names of the files passed in input from the client
  	 * @return the document xml of an execution graph
  	 */
     public Vector QN_GenerationUML2(Vector documents, Vector fileNames, String modelFileName) {
    	 String result="";
    	 try {
	    	 createFiles(documents, fileNames);
	    	 Vector parsers = this.genParserUML2(FOLDER + randomNumber + modelFileName);
	    	 result = new QNXmlDocument(parsers).cretateDocumentXml(interactions , new Vector(), log);
    	 }
    	 catch(Exception e) {
    		 errorManager(e);
 		 }
    	 return getReturnList(result);
     }

     /**
      * 
      * Start the generation of a queue network platform dependent
      */
  public Vector QN_HW_Generation(byte[] zippedStream, String modelFileName) {
		 
	  String result="";
 	 try {
	    	//createFileUML2V2(stringDoc, fileNames); 
 		 
 		    unzip(zippedStream);
	    	String fileName = FOLDER + randomNumber + modelFileName;
	 		EclipseUML2UtilV2 eclipseUtil = new EclipseUML2UtilV2(log);
	 		Model model = eclipseUtil.loadModel(fileName);
	 		ParserDeployment parser = new ParserDeployment(model, eclipseUtil, log);
	    	result = new QNHWTrasformation().createQNHWResult(parser,log); 
 	 }
 	 catch(Exception e) {
 		 errorManager(e);
		 } 
 	 return getReturnList(result);
   }
  
  /*
   * This method return all the hardware resource of the pmif file loaded
   * 
   */
  public Vector getHardwareDevices(byte[] zippedStream, String modelFileName) {
	  Vector<BeanDevices> results = new Vector<BeanDevices>();
	  try {
		  unzip(zippedStream);
	      String fileName = FOLDER + randomNumber + modelFileName;
	      QnHwComponentReader pmifReader = new QnHwComponentReader(log);
	      pmifReader.readDevices(fileName);
	      results = pmifReader.getDevices();
	      // il file di log sempre all'ultima posizione del vettore.
	      BeanDevices bError = new BeanDevices();
	      bError.setErrors(log.getError());
	      results.add(bError);
	  }catch(Exception e) {
		  errorManager(e);
	  }
	  return results;
  }
  
  /*
   * This method return all the software resources of the Spmif file loaded
   * 
   */
  public Vector getSoftwareDevices(byte[] zippedStream, String modelFileName) {
	  Vector<String> results = new Vector<String>();
	  try {
		  unzip(zippedStream);
	      String fileName = FOLDER + randomNumber + modelFileName;
	      EgSwComponentReader egReader = new EgSwComponentReader(log);
	      egReader.readDevices(fileName);
	      results = egReader.getDevices();
	      // il file di log sempre all'ultima posizione del vettore.
		  results.add(log.getError());
	  }catch(Exception e) {
		  errorManager(e);
	  }
	  return results;
  }
  
  /**
   * This method return an Execution Graph annotated with all the SPE information.
   * The EG is now ready to be used to load workloads and service requests in the QN.
   * 
   * @param zippedStream
   * @param modelFileName
   * @param hwMatrix
   * @param hwFeaturesMatrix
   * @param swMatrix
   * @param units
   * @param hwDevices
   * @return
   */
  public Vector getAnnotatedEg(byte[] zippedStream, String modelFileName, Object[][] hwMatrix, Object[][] hwFeaturesMatrix, Object[][] swMatrix, String[] units, String[] hwDevices){
	  String result="";
	  try {
		  unzip(zippedStream);
	      String fileName = FOLDER + randomNumber + modelFileName;
		  EgWriterReader egWriter = new EgWriterReader(hwMatrix,hwFeaturesMatrix,swMatrix,units,hwDevices, log);
		  result = egWriter.annoteEG(fileName);
	  }catch(Exception e) {
		  errorManager(e);
		  //e.printStackTrace();
	  }  
	  return getReturnList(result);
  }
  
  public Vector MergeEgQn(byte[] zippedStream, Vector fileNames) {
	  ByteArrayOutputStream buffer = null;
	  try {
		  unzip(zippedStream);
		  String egFileName = FOLDER + randomNumber + fileNames.get(0).toString();
		  String qnFileName = FOLDER + randomNumber + fileNames.get(1).toString();
		  new startMergeQnEg(egFileName, qnFileName);
		  
		  PmifSchemaXMLProcessor xmlDoc = new PmifSchemaXMLProcessor();
		  InputSource input = new InputSource(qnFileName);
		  Resource resource = null;
		  resource = xmlDoc.load(input, null);
		  buffer = new ByteArrayOutputStream(); 
		  resource.save(buffer, null);
	  }
	  catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e20")+" " + e.getMessage());
			System.out.println("Errore nella bufferizzazione dell'output " + e.getMessage());
	  }
	  catch(Exception e) {
		  errorManager(e);
	  }
	  return getReturnList(buffer.toString());
  }
  
  public Vector getReturnList(String result) {
	  Vector returnList = new Vector();
	  if(!log.getError().equals("")) {
		 returnList.add(log.getError());
	  }
	  if(!result.equals("")) {
		  returnList.add(result);
	   }
	  return returnList;
  }
  
  public void errorManager(Exception e) {
	  log.addError(e.getMessage());
	  log.addLine("");
	  log.addLine("************************* STACK TRACE SECTION *************************** ");
	  log.addLine("");
	  StackTraceElement[] stack = e.getStackTrace();
	  for(int i = 0; i < stack.length; i++) {
		 log.addErrorStack("occours in " + stack[i].getClassName() + ", method " + stack[i].getMethodName() + ", Line " + stack[i].getLineNumber());
	  }
  }  
  
 public void unzip(byte[] input) {
	  try
	  {
		  
		 ByteArrayInputStream bytes = new ByteArrayInputStream(input);
	     BufferedOutputStream output = null;
	     ZipInputStream zis = new ZipInputStream(bytes);
	     //ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
	     ZipEntry entry;
	     randomNumber = System.currentTimeMillis()+"/";
		 File f = new File(FOLDER+randomNumber);
		 f.mkdirs(); 
	     while((entry = zis.getNextEntry()) != null)
	     {
	        int count;
	        byte dati[] = new byte[1024];
	        FileOutputStream fos = new FileOutputStream(FOLDER+randomNumber+entry.getName());
	        output = new BufferedOutputStream(fos, 1024);
	        while ((count = zis.read(dati, 0, 1024))!= -1)
	        {
	           output.write(dati, 0, count);
	        }

	        output.flush();
	        output.close();
	     }
	     zis.close();
	  }catch(IOException e){
		  e.printStackTrace();
	  }
  
	  
  }
  
}
