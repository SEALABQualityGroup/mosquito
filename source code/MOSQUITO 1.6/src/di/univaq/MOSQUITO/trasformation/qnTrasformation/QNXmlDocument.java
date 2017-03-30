package di.univaq.MOSQUITO.trasformation.qnTrasformation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import QNM2MetaMod.DocumentRoot;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import QNM2MetaMod.util.QNM2MetaModResourceFactoryImpl;
import di.univaq.MOSQUITO.Parser.Omondo.ParserComponent;
import di.univaq.MOSQUITO.Parser.Omondo.ParserSequence;
import di.univaq.MOSQUITO.Parser.Plastic.ParserComponentPlastic;
import di.univaq.MOSQUITO.Parser.Plastic.ParserSequencePlastic;
import di.univaq.MOSQUITO.Parser.UML2.ParserComponentUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserSequenceUML2;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class QNXmlDocument {
	
	private Vector parsersComponent;
	private Vector parsersSequence;

	public QNXmlDocument(Vector parsers) {
		this.parsersComponent = new Vector();
		this.parsersSequence = new Vector();
		getParsers(parsers);
	}

	/**
	 * 
	 * @param documents se l'input di MOSQUITO è di Omondo documents contiene gli org.w3c.Document di tutti i file di input
	 *        compreso i component diagram, mentre se l'input è Eclipse uml2 allora documents contiene gli Interaction degli use case diagram
	 * @param fileNames
	 * @return
	 */
	public String cretateDocumentXml(Vector documents, Vector fileNames, LogManager log) {
		//String pathOutput = "C:\\windows\\temp\\QNoutput.xml";
		ResourceSet resourceSet = new ResourceSetImpl();
		QNM2MetaModFactory df = QNM2MetaModFactory.eINSTANCE;
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		DocumentRoot root = df.createDocumentRoot();
		FeatureMap rootMixed = root.getMixed();
		EStructuralFeature rootNodeFeature = extendedMetaData.demandFeature( null, "QueueingNetworkModel", true);
		QNMType qn = df.createQNMType();
		qn.setName("Reti di code");
		ServicesCenter sc = new ServicesCenter(parsersComponent, parsersSequence, qn, df,log);
		sc.createServicesCenterSection();
		Workload wl = new Workload(parsersSequence, qn, df, log);
	    wl.createWorkloadSection();
	    Arc arc = new Arc(parsersSequence, qn, df, log);
	    arc.setDataforArcSection();
	    ServiceRequest sReq = new ServiceRequest(parsersSequence, qn, df, documents, fileNames, parsersComponent,log);
	    sReq.createServiceRequestSection();
	    arc.createArcSection(sReq);
		rootMixed.add(rootNodeFeature, qn);
		FeatureMapUtil.addText(rootMixed, "\n");
		QNM2MetaModResourceFactoryImpl res = new QNM2MetaModResourceFactoryImpl();
		Resource resource = res.createResource(URI.createFileURI(""));
		resource.getContents().add(root);
		
		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
			resource.save(buffer ,null);
			return buffer.toString();
			}
		catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e20")+" " + e.getMessage());
			System.out.println("Errore nella bufferizzazione dell'output " + e.getMessage());
			return null;
		}
		//openFileXml(pathOutput);
		}

	public void getParsers(Vector parsers) {

		for(int i = 0; i < parsers.size(); i++) {
			if(parsers.get(i) instanceof ParserComponent || parsers.get(i) instanceof ParserComponentPlastic || parsers.get(i) instanceof ParserComponentUML2) {
				parsersComponent.add(parsers.get(i));
			}
			if(parsers.get(i) instanceof ParserSequence || parsers.get(i) instanceof ParserSequencePlastic || parsers.get(i) instanceof ParserSequenceUML2) {
				parsersSequence.add(parsers.get(i));
			}
		//	if(parsers.get(i) instanceof ParserUseCase) {
			//	parsersUseCase.add(parsers.get(i));
		//	}
		}
	}
	
	/*public void openFileXml(String filename){
		  try{
	           Runtime.getRuntime().exec("\"C:\\Programmi\\Internet Explorer\\iexplore.exe\"" +  "\"" + filename + "\"");
	       }
	       catch(Exception e){
	    	  
	    	   System.out.println( e.getMessage());
	       }
	}*/
}
