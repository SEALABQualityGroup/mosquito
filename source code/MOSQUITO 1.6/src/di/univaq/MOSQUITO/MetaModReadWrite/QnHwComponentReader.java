package di.univaq.MOSQUITO.MetaModReadWrite;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.resource.Resource;
import org.xml.sax.InputSource;

import PmifSchema.impl.DocumentRootImpl;
import PmifSchema.impl.NodeTypeImpl;
import PmifSchema.impl.ServerTypeImpl;
import PmifSchema.impl.WorkUnitServerTypeImpl;
import PmifSchema.util.PmifSchemaXMLProcessor;
import di.univaq.MOSQUITO.utility.BeanDevices;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class QnHwComponentReader {
	
	private Vector<BeanDevices> devices;
	private LogManager log;
	
	public QnHwComponentReader(LogManager log){
		devices = new Vector<BeanDevices>();
		this.log = log;
	}

	public void readDevices(String path) {
		PmifSchemaXMLProcessor p = new PmifSchemaXMLProcessor();
		InputSource input = new InputSource(path);
	    try {
		   Resource resource = p.load(input, null);
		   List l = resource.getContents();
		   Iterator it = l.iterator();
		   while(it.hasNext()) {
			   DocumentRootImpl doc = (DocumentRootImpl)it.next();
			   List nodes = doc.getQueueingNetworkModel().getNode();
			   visit(nodes);
		   }
	    }catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e32")+" " + e.getMessage());
			System.out.println("Error during opening of the input model " + e.getMessage());
	    }
	}

	public void visit(List elems) {
		Iterator nodeIterator = elems.iterator();
		while(nodeIterator.hasNext()) {
			Object obj = nodeIterator.next();
			if(obj instanceof NodeTypeImpl) {
				NodeTypeImpl node = (NodeTypeImpl)obj;
				visit(node.getServer());
				visit(node.getWorkUnitServer());
			}
			else if(obj instanceof ServerTypeImpl) {
				ServerTypeImpl server = (ServerTypeImpl) obj;
				BeanDevices bean = new BeanDevices();
				bean.setQuantity(server.getQuantity().toString());
				bean.setSchedulingPolicy(server.getSchedulingPolicy().toString());
				bean.setName(server.getName());
				devices.add(bean);
			}
			else if(obj instanceof WorkUnitServerTypeImpl) {
				WorkUnitServerTypeImpl workUnit = (WorkUnitServerTypeImpl) obj;
				BeanDevices bean = new BeanDevices();
				bean.setSchedulingPolicy(workUnit.getSchedulingPolicy().toString());
				bean.setServiceTime(Float.toString(workUnit.getServiceTime()));
				bean.setTimeUnits(workUnit.getTimeUnits().toString());
				bean.setQuantity(workUnit.getQuantity().toString());
				bean.setName(workUnit.getName());
				devices.add(bean);
			}
		}
	}

	public Vector<BeanDevices> getDevices() {
		return this.devices;
	}
	


}
