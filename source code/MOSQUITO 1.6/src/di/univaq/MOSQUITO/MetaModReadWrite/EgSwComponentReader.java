package di.univaq.MOSQUITO.MetaModReadWrite;

import java.io.IOException;
import java.util.Vector;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.xml.sax.InputSource;

import Devices.impl.BasicNodeTypeImpl;
import Devices.impl.CompoundNodeTypeImpl;
import Devices.impl.RepNodeTypeImpl;
import Devices.impl.SynchroNodeTypeImpl;
import Devices.util.DevicesXMLProcessor;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class EgSwComponentReader {

	private Vector<String> swDevices;
	private LogManager log;
	
	public EgSwComponentReader(LogManager log){
		swDevices = new Vector<String>();
		this.log = log;
	}

	public void readDevices(String path) {
		DevicesXMLProcessor dev = new DevicesXMLProcessor();
		InputSource input = new InputSource(path);
	    try {
		   Resource resource = dev.load(input, null);
		   TreeIterator iterator = resource.getAllContents();

		   while(iterator.hasNext()) {
			   Object obj = iterator.next(); 
			   //System.out.println(obj);
				
				if(obj instanceof BasicNodeTypeImpl) {
					BasicNodeTypeImpl node = (BasicNodeTypeImpl)obj;
					Object ob = node.eContainer();
					//System.out.println(ob);
					swDevices.add(node.getNodeName());
				}
				if(obj instanceof SynchroNodeTypeImpl){
					SynchroNodeTypeImpl node = (SynchroNodeTypeImpl)obj;
					swDevices.add(node.getNodeName());
				}
				
				// il nodo compound contiene sempre CPSNodeType o RepNodeType che hanno applicati i ResourceRequirements
				if(obj instanceof CompoundNodeTypeImpl) {
					CompoundNodeTypeImpl node = (CompoundNodeTypeImpl)obj;
					swDevices.add(node.getNodeName());
				}	   
		   
		   }
	    }catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e32")+" " + e.getMessage());
			System.out.println("Error during opening of the input model " + e.getMessage());
	    }
	}
	
	public Vector<String> getDevices() {
		return this.swDevices;
	}
	
	/*public static void main(String[] args) {
		EgSwComponentReader egReader = new EgSwComponentReader(new LogManager());
		egReader.readDevices("C:/workspace/MOSQUITO 1.6/lavoro_Arcelli/esempi/EG_withRR.xml");
	}*/
	
}