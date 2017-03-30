package di.univaq.MOSQUITO.trasformation.egTrasformation;

import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
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

import Devices.DevicesFactory;
import Devices.DocumentRoot;
import Devices.PSType;
import Devices.ProjectType;
import Devices.util.DevicesResourceFactoryImpl;
import di.univaq.MOSQUITO.Parser.Omondo.ParserSequence;
import di.univaq.MOSQUITO.Parser.Omondo.ParserUseCase;
import di.univaq.MOSQUITO.Parser.Plastic.ParserSequencePlastic;
import di.univaq.MOSQUITO.Parser.Plastic.ParserUseCasePlastic;
import di.univaq.MOSQUITO.Parser.UML2.ParserSequenceUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserUseCaseUML2;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class EgXmlDocument {
	

	private Vector parsersSequence;
	private Vector parsersUseCase;
	
	public EgXmlDocument(Vector parsers){
		
		this.parsersSequence = new Vector();
		this.parsersUseCase = new Vector();
		getParsers(parsers);
	}

	public String cretateDocumentXml(Vector documents, Vector fileNames, LogManager log, MOSQUITOUtils mUtils) {
		ResourceSet resourceSet = new ResourceSetImpl();
		DevicesFactory  eg = DevicesFactory.eINSTANCE;
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		// il documentRoot non e' di tipo orgw3cdoom
		DocumentRoot root = eg.createDocumentRoot();
		FeatureMap rootMixed = root.getMixed();
	    EStructuralFeature rootNodeFeature = extendedMetaData.demandFeature(null, "Project", true);
		ProjectType pt = eg.createProjectType();
		pt.setProjectName("Execution Graph");
		PSType perfScen = eg.createPSType();
		perfScen.setInterarrivalTime(0);
		perfScen.setNumberOfJobs(BigInteger.valueOf(100));
		perfScen.setScenarioName("");  // da vedere che metterci
		perfScen.setSWmodelfilename(""); // da vedere che metterci
		CompoundNodePrincipal cn = new CompoundNodePrincipal(parsersUseCase, perfScen, eg, log);	
		cn.createCompoundNode();
		ComplexNode cpxNode = new ComplexNode(parsersSequence, perfScen, eg, fileNames, documents, log, mUtils);
		cpxNode.createComplexNode(cn);
		pt.getPerformanceScenario().add(perfScen);
		rootMixed.add(rootNodeFeature, pt);
		FeatureMapUtil.addText(rootMixed, "\n");
		DevicesResourceFactoryImpl res = new DevicesResourceFactoryImpl();
	    Resource resource = res.createResource(URI.createFileURI(""));
		resource.getContents().add(root);
        try{
        	ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
	        resource.save(buffer ,null);
	        return buffer.toString();
		}catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e20")+" " + e.getMessage());
			System.out.println("Errore nella bufferizzazione dell'output " + e.getMessage());
			return null;
		}
	    
	}
	
	public void getParsers(Vector parsers) {
		for(int i = 0; i < parsers.size(); i++) {
			if(parsers.get(i) instanceof ParserSequence || parsers.get(i) instanceof ParserSequencePlastic ||  parsers.get(i) instanceof ParserSequenceUML2 ) {
				parsersSequence.add(parsers.get(i));
			}
			if(parsers.get(i) instanceof ParserUseCase || parsers.get(i) instanceof ParserUseCasePlastic || parsers.get(i) instanceof ParserUseCaseUML2) {
				parsersUseCase.add(parsers.get(i));
			}
		
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
