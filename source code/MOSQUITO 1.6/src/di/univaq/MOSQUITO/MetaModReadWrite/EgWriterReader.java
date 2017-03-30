package di.univaq.MOSQUITO.MetaModReadWrite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.xml.sax.InputSource;

import Devices.DeviceFeatureType;
import Devices.DeviceType;
import Devices.DevicesFactory;
import Devices.DevicesType;
import Devices.OMElementType;
import Devices.OverheadMatrixType;
import Devices.ProcessingOverheadType;
import Devices.ResourceRequirementType;
import Devices.ResourceRequirementType2;
import Devices.ResourceRequirementType4;
import Devices.SchedulingPolicyType;
import Devices.SoftwareResourceType;
import Devices.SoftwareResourcesType;
import Devices.impl.BasicNodeTypeImpl;
import Devices.impl.CPSNodeTypeImpl;
import Devices.impl.CompoundNodeTypeImpl;
import Devices.impl.DocumentRootImpl;
import Devices.impl.EGTypeImpl;
import Devices.impl.SynchroNodeTypeImpl;
import Devices.util.DevicesXMLProcessor;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class EgWriterReader {
	
	DevicesFactory dev;
	
	private String[] units;
	private String[] hwDevices;
	private Object[][] hwMatrix;
	private Object[][] hwFeaturesMatrix;
	private Object[][] swMatrix;
	
	private LogManager log;
	                     
	public EgWriterReader(Object[][] hwMatrix, Object[][] hwFeaturesMatrix, Object[][] swMatrix, String[] units, String[] hwDevices, LogManager log) {
		this.log = log;
		this.units = units;
		this.hwDevices = hwDevices;
		this.hwMatrix = hwMatrix;
		this.hwFeaturesMatrix = hwFeaturesMatrix;
		this.swMatrix = swMatrix;

		dev = DevicesFactory.eINSTANCE;
		
	}
	
   /* public EgWriterReader() {
    	dev = DevicesFactory.eINSTANCE;
    }*/

	public Resource setSoftwareRes(ProcessingOverheadType pHov, /*String[][]resRequirement,*/ String fileName) {
		DevicesXMLProcessor xmlDoc = new DevicesXMLProcessor();
		InputSource input = new InputSource(fileName);
		Resource resource = null;
		try {
		   resource = xmlDoc.load(input, null);
		   insertResourceRequirements(resource);
		   List l = resource.getContents();
		   Iterator it = l.iterator();
		   while(it.hasNext()) {
			  DocumentRootImpl p = (DocumentRootImpl)it.next();
			  p.getProject().setProcessingOverhead(pHov);
		   }
	    }catch(IOException e) {
	    	log.addError(e.getMessage());
	    	e.printStackTrace();
	    }
	    return resource;
	}
	
//	public void printPather(Object obj, String nodeName) {
//		if(obj instanceof EGTypeImpl)
//		    System.out.println("----------------> " +  ((EGTypeImpl)obj).getEGname() + "  padredi " + nodeName );
//		else if(obj instanceof CPSNodeTypeImpl)
//		    System.out.println("----------------> " +  ((CPSNodeTypeImpl)obj) + "  padredi " + nodeName );
//		else 
//			System.out.println(obj);
		
//		if(obj instanceof ExecutionGraphNodeTypeImpl) {
//			
//		}
//	}
	
	public void insertResourceReqTonode(Object obj, Object[] swAmount) {
		for(int i=0; i < swAmount.length; i++) {
			
			if(obj instanceof EGTypeImpl) {
				ResourceRequirementType4 resource =  dev.createResourceRequirementType4();// .createResourceRequirementType();
				resource.setResourceName(units[i]);
				resource.setUnitsOfService(Float.valueOf(swAmount[i].toString()));
				EGTypeImpl egtype =  ((EGTypeImpl)obj);
			    egtype.getResourceRequirement().add(resource);
			   
			}
			else if(obj instanceof CPSNodeTypeImpl){
				ResourceRequirementType2 resource =  dev.createResourceRequirementType2();// .createResourceRequirementType();
				resource.setResourceName(units[i]);
				resource.setUnitsOfService(Float.valueOf(swAmount[i].toString()));
			    ((CPSNodeTypeImpl)obj).getResourceRequirement().add(resource);
			}
			else if(obj instanceof CompoundNodeTypeImpl) {
				ResourceRequirementType resource =  dev.createResourceRequirementType();// .createResourceRequirementType();
				resource.setResourceName(units[i]);
				resource.setUnitsOfService(Float.valueOf(swAmount[i].toString()));
			    ((CompoundNodeTypeImpl)obj).getResourceRequirement().add(resource);
			}
		}
	}
	
	public void insertResourceRequirements(Resource resource) {
		int count =0;
		 TreeIterator iterator = resource.getAllContents();
		   while(iterator.hasNext()) {
			   Object obj = iterator.next(); 			
				if(obj instanceof BasicNodeTypeImpl) {
					BasicNodeTypeImpl node = (BasicNodeTypeImpl)obj;
					Object ob = node.eContainer();
					insertResourceReqTonode(ob, swMatrix[count]);
					count++;
					//printPather(ob , node.getNodeName());
					
				}
				if(obj instanceof SynchroNodeTypeImpl){
					SynchroNodeTypeImpl node = (SynchroNodeTypeImpl)obj;
					Object ob = node.eContainer();
					insertResourceReqTonode(ob,  swMatrix[count]);
					count++;
					//printPather(ob , node.getNodeName());
				}
				
				// il nodo compound contiene sempre CPSNodeType o RepNodeType che hanno applicati i ResourceRequirements
				if(obj instanceof CompoundNodeTypeImpl) {
					//CompoundNodeTypeImpl node = (CompoundNodeTypeImpl)obj;				
					insertResourceReqTonode(obj,  swMatrix[count]);
					count++;
					/*Object ob = node.eContainer();
					System.out.println(ob);*/
				}	   
		   
		   }
	}

	public ProcessingOverheadType createProcessingOverheade(Vector<SoftwareResourceType> allRes, Vector<DeviceType> allDev) {
		ProcessingOverheadType pType = dev.createProcessingOverheadType();
		SoftwareResourcesType sRes = createSoftwareResources(allRes);
		DevicesType devices = createDevices(allDev);
		OverheadMatrixType oVMat = createOverheadMatrix(allRes,allDev);
		pType.setSoftwareResources(sRes);
		pType.setDevices(devices);
		pType.setOverheadMatrix(oVMat);
		return pType;
	}
	
	public SoftwareResourcesType createSoftwareResources(Vector<SoftwareResourceType> softwareResources) {
		SoftwareResourcesType res = dev.createSoftwareResourcesType();
		for(SoftwareResourceType softwareResource : softwareResources) {
		    res.getSoftwareResource().add(softwareResource);
		}
		return res;
	}
	
	public DevicesType createDevices(Vector<DeviceType> devices) {
		DevicesType devsType = dev.createDevicesType();
		for(DeviceType device: devices) {
			devsType.getDevice().add(device);
		}
		return devsType;
	}
	
	/*public OverheadMatrixType createOverheadMatrix(Vector<OMElementType> ovRows) {
		OverheadMatrixType ovMatrix = dev.createOverheadMatrixType();
		for(OMElementType OMElement: ovRows) {
			ovMatrix.getOMElement().add(OMElement);
		}
		return ovMatrix;
	}*/
	
	public OverheadMatrixType createOverheadMatrix(Vector<SoftwareResourceType> sRes, Vector<DeviceType> devs) {
		OverheadMatrixType ovMatrix = dev.createOverheadMatrixType();
		//int rowCount =0;
		//int colCount = 0;
		for(int i = 0; i < sRes.size(); i++) {//SoftwareResourceType resource : sRes ) {
			//System.out.println("---> " + resource.getResourceName());
			SoftwareResourceType resource =  (SoftwareResourceType)sRes.get(i);
			for(int j = 0; j < devs.size(); j++) {// DeviceType device : devs ) {
				 DeviceType device = (DeviceType)devs.get(j);
				OMElementType ome = dev.createOMElementType();
				ome.setResourceName(resource.getResourceName());
				ome.setDeviceName(device.getDeviceName());
				//System.out.println("---> " + device.getDeviceName());
				ome.setAmountOfService(Float.valueOf(hwMatrix[i][j].toString()));
				ovMatrix.getOMElement().add(ome);
				//colCount ++;
			}
			//rowCount ++;
			//colCount = 0;
		}
		return ovMatrix;
	}
	 
   // A partire dai campi della classe, 
   public Vector<SoftwareResourceType> createSoftwareResType() {
	  // SoftwareResourcesType res = dev.createSoftwareResourcesType();
	   Vector<SoftwareResourceType> softwareResources = new Vector<SoftwareResourceType>();
	   for(int i = 0; i < units.length; i++) {
		   SoftwareResourceType sRes = dev.createSoftwareResourceType();
		   sRes.setResourceName(units[i]);
		  // res.getSoftwareResource().add(sRes);
		   softwareResources.add(sRes);
	   }
	   return softwareResources;
   }
   
   public Vector<DeviceType> createDevicesType() {
	   Vector<DeviceType> devices = new Vector<DeviceType>();
	   for(int i = 0; i < hwFeaturesMatrix.length; i++){
		   DeviceType device = dev.createDeviceType();
		   device.setDeviceName(hwDevices[i]);
		   device.setDeviceFeature(DeviceFeatureType.getByName(hwFeaturesMatrix[i][0].toString()));
		   device.setQuantity(BigInteger.valueOf(Long.valueOf(hwFeaturesMatrix[i][1].toString())));
		   device.setSchedulingPolicy(SchedulingPolicyType.getByName(hwFeaturesMatrix[i][2].toString()));
		   device.setServiceUnits(hwFeaturesMatrix[i][3].toString());
		   device.setServiceTime(Float.valueOf(hwFeaturesMatrix[i][4].toString()));
		   devices.add(device);
	   }
	   return devices;
   }
   
   
   
   public String annoteEG(String fileName) {
	   Vector<SoftwareResourceType> resources = createSoftwareResType();
	   Vector<DeviceType> devices = createDevicesType();
	   ProcessingOverheadType pHov = createProcessingOverheade(resources,devices);
	   //   String[][] resourceReqMatrix = setResMatrix();
	   Resource r = setSoftwareRes(pHov,/*resourceReqMatrix, */fileName);
		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
			r.save(buffer,null);
			return buffer.toString();
		}
		catch(IOException e) {
			log.addError(PropertiesManager.getProperties("e20")+" " + e.getMessage());
			System.out.println("Errore nella bufferizzazione dell'output " + e.getMessage());
			return null;
	  }
   }
	
	
	
//	public void test() {
//
//		Vector<SoftwareResourceType> softwareResources = new Vector<SoftwareResourceType>();
//		SoftwareResourceType sRes1 = dev.createSoftwareResourceType();
//		sRes1.setResourceName("Resource1");
//		SoftwareResourceType sRes2 = dev.createSoftwareResourceType();
//		sRes2.setResourceName("Resource2");
//		SoftwareResourceType sRes3 = dev.createSoftwareResourceType();
//		sRes3.setResourceName("Resource3");
//		softwareResources.add(sRes1);
//		softwareResources.add(sRes2);
//		softwareResources.add(sRes3);
//		Vector<DeviceType> devices= new Vector<DeviceType>();
//		DeviceType device = dev.createDeviceType();
//		device.setDeviceName("Device1");
//		device.setDeviceFeature(DeviceFeatureType.NON_FCFS_TIME_SPEC_LITERAL);
//		device.setQuantity(BigInteger.ONE);
//		device.setSchedulingPolicy(SchedulingPolicyType.FCFS_LITERAL);
//		device.setServiceUnits("sec");
//		device.setServiceTime(Float.valueOf(2));
//		DeviceType device1 = dev.createDeviceType();
//		device1.setDeviceName("Device2");
//		device1.setDeviceFeature(DeviceFeatureType.NON_FCFS_TIME_SPEC_LITERAL);
//		device1.setQuantity(BigInteger.ONE);
//		device1.setSchedulingPolicy(SchedulingPolicyType.FCFS_LITERAL);
//		device1.setServiceUnits("sec");
//		device1.setServiceTime(Float.valueOf(2));
//		DeviceType device2 = dev.createDeviceType();
//		device2.setDeviceName("Device3");
//		device2.setDeviceFeature(DeviceFeatureType.NON_FCFS_TIME_SPEC_LITERAL);
//		device2.setQuantity(BigInteger.ONE);
//		device2.setSchedulingPolicy(SchedulingPolicyType.FCFS_LITERAL);
//		device2.setServiceUnits("sec");
//		device2.setServiceTime(Float.valueOf(2));
//		devices.add(device);
//		devices.add(device1);
//		devices.add(device2);
//		ProcessingOverheadType pHov = createProcessingOverheade(softwareResources,devices);
//		
//		
//		
//		//restituisce la matrice di resourceRequirements
//		String[][] resourceReqMatrix = setResMatrix();
//		
//		
//		String fileName= "C:/workspace/MOSQUITO 1.6/Modelli/esempi Arcelli modificati/EG_withdrawal_2.xml";
//		//Resource r = setSoftwareRes(pHov, resourceReqMatrix, fileName);
//		//FileOutputStream output = new FileOutputStream("c:/ex.xml");
//		   try {
//			r.save(System.out, null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	// da modificare
//	public String[][] setResMatrix() {
//		String[] resArray = {"Risorsa_1","1","Risorsa_2","2","Risorsa_3","3","Risorsa_4","4","Risorsa_5","5"};		
//		String[][]resourceMatrix= new String[100][10];
//		
//         for(int i = 0; i < 100; i++) {
//			
//        	 resourceMatrix[i] = resArray;
//		}
//		return resourceMatrix;
//	}
	
	

	/*public static void main(String[] args) {
		new EgWriterReader().test();
		
	}*/
	
}
