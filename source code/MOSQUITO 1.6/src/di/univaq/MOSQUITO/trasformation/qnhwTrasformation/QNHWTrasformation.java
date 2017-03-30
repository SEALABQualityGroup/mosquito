package di.univaq.MOSQUITO.trasformation.qnhwTrasformation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import PmifSchema.DocumentRoot;
import PmifSchema.PmifSchemaFactory;
import PmifSchema.QNMType;
import PmifSchema.util.PmifSchemaResourceFactoryImpl;
import di.univaq.MOSQUITO.Parser.UML2.ParserDeployment;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;



public class QNHWTrasformation {
    
	public QNHWTrasformation(){}
	
	public String createQNHWResult(ParserDeployment parser, LogManager log){
		
		ResourceSet resourceSet = new ResourceSetImpl();
		PmifSchemaFactory pmif = PmifSchemaFactory.eINSTANCE;
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		DocumentRoot root = pmif.createDocumentRoot();
		
		FeatureMap rootMixed = root.getMixed();
		EStructuralFeature rootNodeFeature = extendedMetaData.demandFeature(null, "QueueingNetworkModel", true);
		
		QNMType qn =  pmif.createQNMType();
	  
		qn.setName("Queuing Network");
		
		ServicesCenter sc = new ServicesCenter(qn,pmif,log);
		sc.createServicesCenterSection(parser);
		
		Arc arc = new Arc(qn,pmif,log);
		arc.createArcSection(parser);
		
		rootMixed.add(rootNodeFeature, qn);
		FeatureMapUtil.addText(rootMixed, "\n");
		PmifSchemaResourceFactoryImpl res = new PmifSchemaResourceFactoryImpl();
		Resource resource = res.createResource(URI.createFileURI(""));
		resource.getContents().add(root);
		
		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
			resource.save(buffer,null);
			return buffer.toString();
		}
		catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e20")+" " + e.getMessage());
			System.out.println("Errore nella bufferizzazione dell'output " + e.getMessage());
			return null;
	  }
   }
}
