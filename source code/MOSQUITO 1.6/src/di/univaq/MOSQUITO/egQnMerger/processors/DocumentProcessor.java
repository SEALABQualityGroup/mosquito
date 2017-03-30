/*
 * DocumentProcessor.java
 *
 * Created on 24 novembre 2006, 17.29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.processors;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import PmifSchema.ArcType;
import PmifSchema.ClosedWorkloadType;
import PmifSchema.DemandServType;
import PmifSchema.DocumentRoot;
import PmifSchema.ForkTransitType;
import PmifSchema.JoinTransitType;
import PmifSchema.NodeType;
import PmifSchema.OpenWorkloadType;
import PmifSchema.PmifSchemaFactory;
import PmifSchema.QNMType;
import PmifSchema.ServerType;
import PmifSchema.ServiceRequestType;
import PmifSchema.SinkNodeType;
import PmifSchema.SourceNodeType;
import PmifSchema.TimeServType;
import PmifSchema.TimeUnitsType;
import PmifSchema.TransitType;
import PmifSchema.WorkUnitServType;
import PmifSchema.WorkUnitServerType;
import PmifSchema.WorkloadType;
import PmifSchema.impl.PmifSchemaFactoryImpl;
import PmifSchema.util.PmifSchemaXMLProcessor;
import QNM2MetaMod.QueueType;
import di.univaq.MOSQUITO.egQnMerger.EG.PSType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType1;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType2;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType3;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType4;
import di.univaq.MOSQUITO.egQnMerger.EG.impl.CPSNodeTypeImpl;
import di.univaq.MOSQUITO.egQnMerger.EG.impl.CompoundNodeTypeImpl;
import di.univaq.MOSQUITO.egQnMerger.EG.impl.EGTypeImpl;
import di.univaq.MOSQUITO.egQnMerger.exceptions.CannotDeriveQNMWorkloadTypeException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.DeviceNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.ExecutionGraphNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.GenericException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.MyFileNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.NodeNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.PartnerNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.PerformanceScenarioNotFoundException;
import di.univaq.MOSQUITO.egQnMerger.exceptions.StartNodeNotFoundException;


/**
 * This class relizes a processor with wich parametrize a
 * Queueing Network Model, starting with its structure's specification.
 * To do this, it uses some methods for acquiring and reducing the Project.
 * The Project and the QNM specification are described by two XML files that
 * must be specified when the constructor is called or later, but after
 * the parametrization.
 *
 * @author Dave Wilson
 */
public class DocumentProcessor {
    
    private URI projectUri, qnmUri;
    private Resource projectDocument, qnmDocument;
    private di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor dProcessor;
    private di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot projectDocRoot;
    private di.univaq.MOSQUITO.egQnMerger.EG.ProjectType project;
    private di.univaq.MOSQUITO.egQnMerger.EG.PSType actualPS;
    private PmifSchemaXMLProcessor qnmProcessor;
    private DocumentRoot qnmDocRoot;
    private QNMType qnm;
    public final int SHORTEST_PATH = 1;
    public final int LONGEST_PATH = 2;
    public final int AVERAGE_PATH = 3;
    private int pathType = SHORTEST_PATH;
    
    /**
     * Creates a new instance of DocumentProcessor
     */
    public DocumentProcessor(String projectFile, String qnmFile) throws MyFileNotFoundException, IOException {
        this.projectUri = URI.createFileURI(projectFile);
        this.qnmUri = URI.createFileURI(qnmFile);
        this.dProcessor = new di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor();
        this.qnmProcessor = new PmifSchemaXMLProcessor();
        try {
            //Loads projectFile
            this.projectDocument = dProcessor.load(projectUri.path(), null);
            //Loads qnmFile
            this.qnmDocument = qnmProcessor.load(qnmUri.path(), null);
            //Gets the projectDocument root
            this.projectDocRoot = (di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot) projectDocument.getContents().get(0);
            this.project = (di.univaq.MOSQUITO.egQnMerger.EG.ProjectType) projectDocRoot.getProject();
            if(this.project != null) {         
                this.actualPS = (PSType) projectDocRoot.getProject().getPerformanceScenario().get(0);
                this.actualPS.setScenarioName("Workload_1");
            }
            else 
                throw new IOException();
            //Gets the qnmDocument root
            this.qnmDocRoot = (DocumentRoot) qnmDocument.getContents().get(0);
            this.qnm = (QNMType) qnmDocRoot.getQueueingNetworkModel();
            if(this.qnm == null) throw new IOException();
            
        } catch (FileNotFoundException ex) {
            throw new MyFileNotFoundException(ex.getMessage());
        }
    }
    
    /**
     * Creates a new instance of DocumentProcessor
     */
    public DocumentProcessor(String projectFile) throws MyFileNotFoundException, IOException {
        this.projectUri = URI.createFileURI(projectFile);
        this.dProcessor = new di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor();
        try {
            //Loads projectFile
            this.projectDocument = dProcessor.load(projectUri.path(), null);
            //Gets the document root
            this.projectDocRoot = (di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot) projectDocument.getContents().get(0);
            this.project = (di.univaq.MOSQUITO.egQnMerger.EG.ProjectType) projectDocRoot.getProject();
            if(this.project != null){       
                this.actualPS = (PSType) projectDocRoot.getProject().getPerformanceScenario().get(0);
                this.actualPS.setScenarioName("Workload_1");
            }
            else 
                throw new IOException();
            
        } catch (FileNotFoundException ex) {
            throw new MyFileNotFoundException(ex.getMessage());
        }
        
    }
    
    /**
     * Creates a new instance of DocumentProcessor
     */
    public DocumentProcessor() {
        this.dProcessor = new di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor();
        this.qnmProcessor = new PmifSchemaXMLProcessor();
    }
    
    /**
     * This method loads the file containing the project, previously setted
     * using setProjectUri method.
     */
    public void loadProjectFile() throws IOException {
        if(projectUri != null) {
            //Loads projectFile
            this.projectDocument = dProcessor.load(projectUri.path(), null);
            //Gets the projectDocument root
            this.projectDocRoot = (di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot) projectDocument.getContents().get(0);
            this.project = (di.univaq.MOSQUITO.egQnMerger.EG.ProjectType) projectDocRoot.getProject();
            if(this.project != null) {          
                this.actualPS = (PSType) projectDocRoot.getProject().getPerformanceScenario().get(0);
                this.actualPS.setScenarioName("Workload_1");
            }
            else 
                throw new IOException();
        }
    }
    
    /**
     * This method removes all the references to a file containing the project.
     */
    public void removeProjectFile() {
        this.projectUri = null;
        this.projectDocument = null;
        this.projectDocRoot = null;
        this.project = null;
        this.dProcessor = null;
    }
    
    /**
     * This method loads the file containing the QNM, previously setted
     * using setQnmUri method.
     */
    public void loadQNMFile() throws IOException {
        if(qnmUri != null) {
            //Loads qnmFile
            this.qnmDocument = qnmProcessor.load(qnmUri.path(), null);
            //Gets the qnmDocument root
            this.qnmDocRoot = (DocumentRoot) qnmDocument.getContents().get(0);
            this.qnm = (QNMType) qnmDocRoot.getQueueingNetworkModel();
            if(this.qnm == null) throw new IOException();
        }
    }
    
    /**
     * This method removes all the references to a file containing the QNM.
     */
    public void removeQNMFile() {
        this.qnmUri = null;
        this.qnmDocument = null;
        this.qnmDocRoot = null;
        this.qnm = null;
        
        this.qnmProcessor = null;
    }
    
    /**
     * This method is used to set the pathType attribute.
     * @param newPathType The pathType to set.
     */
    public void setPathType(int newPathType) {
        this.pathType = newPathType;
    }
    
    /**
     * This method is used to get the URI of the file containing the project.
     * @return The URI of the file containing the project.
     */
    public URI getProjectUri() {
        return this.projectUri;
    }
    
    /**
     * This method is used to set the URI of the file containing the project.
     * @param projectUri The URI of the file containing the project.
     */
    public void setProjectUri(URI projectUri) {
        this.projectUri = projectUri;
    }
    
    /**
     * This method is used to get the URI of the file containing the project.
     * like a String.
     * @return The String format of the URI of the file containing the project.
     */
    public String getProjectUriString() {
        return this.projectUri.toString();
    }
    
    /**
     * This method is used to get the URI of the file containing the QNM.
     * @return The URI of the file containing the QNM.
     */
    public URI getQNMUri() {
        return this.qnmUri;
    }
    
    /**
     * This method is used to set the URI of the file containing the QNM.
     * @param qnmUri The URI of the file containing the QNM.
     */
    public void setQNMUri(URI qnmUri) {
        this.qnmUri = qnmUri;
    }
    
    /**
     * This method is used to get the URI of the file containing the QNM.
     * like a String.
     * @return The String format of the URI of the file containing the QNM.
     */
    public String getQNMUriString() {
        return this.qnmUri.toString();
    }
    
    /**
     * This method sets the references to the file containing the project and
     * loads it.
     * @param projectFile The absolute path of the file containing the project.
     */
    public void setProjectFile(String projectFile) throws MyFileNotFoundException, IOException {
        this.projectUri = URI.createFileURI(projectFile);
        this.dProcessor = new di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor();
        try {
            //Loads projectFile
            this.projectDocument = dProcessor.load(projectUri.path(), null);
            //Gets the document root
            this.projectDocRoot = (di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot) projectDocument.getContents().get(0);
            this.project = (di.univaq.MOSQUITO.egQnMerger.EG.ProjectType) projectDocRoot.getProject();
            if(this.project != null) {         
                this.actualPS = (PSType) projectDocRoot.getProject().getPerformanceScenario().get(0);
                this.actualPS.setScenarioName("Workload_1");
            }
            else 
                throw new IOException();
            
        } catch (FileNotFoundException ex) {
            throw new MyFileNotFoundException(ex.getMessage());
        } 
    }
    
    /**
     * This method sets the references to the file containing the QNM and
     * loads it.
     * @param qnmFile The absolute path of the file containing the QNM.
     */
    public void setQnmFile(String qnmFile) throws MyFileNotFoundException, IOException {
        this.qnmUri = URI.createFileURI(qnmFile);
        this.qnmProcessor = new PmifSchemaXMLProcessor();
        try {
            //Loads qnmFile
            this.qnmDocument = qnmProcessor.load(qnmUri.path(), null);
            //Gets the qnmDocument root
            this.qnmDocRoot = (DocumentRoot) qnmDocument.getContents().get(0);
            this.qnm = (QNMType) qnmDocRoot.getQueueingNetworkModel();
            if(this.qnm == null) throw new IOException();
            
        } catch (FileNotFoundException ex) {
            throw new MyFileNotFoundException(ex.getMessage());
        }
    }
    
    /**
     * This method sets the references to the files containing the project
     * and the QNM and loads them.
     * @param projectFile The absolute path of the file containing the project.
     * @param qnmFile The absolute path of the file containing the QNM.
     */
    public void setFiles(String projectFile, String qnmFile) throws MyFileNotFoundException, IOException {
        this.projectUri = URI.createFileURI(projectFile);
        this.qnmUri = URI.createFileURI(qnmFile);
        this.dProcessor = new di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesXMLProcessor();
        this.qnmProcessor = new PmifSchemaXMLProcessor();
        try {
            //Loads projectFile
            this.projectDocument = dProcessor.load(projectUri.path(), null);
            //Loads qnmFile
            this.qnmDocument = qnmProcessor.load(qnmUri.path(), null);
            //Gets the projectDocument root
            this.projectDocRoot = (di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot) projectDocument.getContents().get(0);
            this.project = (di.univaq.MOSQUITO.egQnMerger.EG.ProjectType) projectDocRoot.getProject();
            if(this.project != null)   {         
                this.actualPS = (PSType) projectDocRoot.getProject().getPerformanceScenario().get(0);
                this.actualPS.setScenarioName("Workload_1");
            }
            else 
                throw new IOException();
            //Gets the qnmDocument root
            this.qnmDocRoot = (DocumentRoot) qnmDocument.getContents().get(0);
            this.qnm = (QNMType) qnmDocRoot.getQueueingNetworkModel();
            if(this.qnm == null) throw new IOException();
            
        } catch (FileNotFoundException ex) {
            throw new MyFileNotFoundException(ex.getMessage());
        }
    }
    
    
    /**
     * This method is used to get the devices names.
     * @return A String[] containing the devices names.
    **/
    private String[] getDevicesNames() {
        String[] devicesNames = null;
        di.univaq.MOSQUITO.egQnMerger.EG.DevicesType dt = project.getProcessingOverhead().getDevices();
        EList dl = dt.getDevice();
        for (int i = 0; i < dl.size(); i++) {
            devicesNames = addToArray(devicesNames, ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getDeviceName());
        }
        
        return devicesNames;
    }
    
    public int getChildIndex(List eContents, Object actualElement) {
    	int count = 0;
    	for(int i = 0; i < eContents.size(); i++){
    		Object obj = eContents.get(i);
    		if(obj instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.BasicNodeTypeImpl){
    			if(obj.equals(actualElement)) {
    				return count;
    			}
    			count ++;
    		}
    		else if(obj instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.SynchroNodeTypeImpl){
    			if(obj.equals(actualElement)) {
    				return count;
    			}
    			count ++;
    		}
    		else if(obj instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.LinkNodeTypeImpl){
    			if(obj.equals(actualElement)) {
    				return count;
    			}
    			count ++;
    		}
    		else if(obj instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.RepNodeTypeImpl){
    			if(obj.equals(actualElement)) {
    				return count;
    			}
    			count ++;
    		}
    		else if(obj instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.CPSNodeTypeImpl){
    			if(obj.equals(actualElement)) {
    				return count;
    			}
    			count ++;
    		}
    	}
    	return -1;
    }
    
    public float[] readResourceReqTonode(Object fatherNode, Object actualElement) {
  
         	
		 if(fatherNode instanceof EGTypeImpl) {
			 EGTypeImpl egtype =  ((EGTypeImpl)fatherNode);		
			 int nodeNumber = egtype.getBasicNode().size() + egtype.getSynchronizationNode().size() + egtype.getLinkNode().size();
			 int totalResReqNumber = egtype.getResourceRequirement().size();
			 int resourceRequirementNum = totalResReqNumber/nodeNumber;
			 List resReq = egtype.getResourceRequirement();
			 int childIndex = getChildIndex(egtype.eContents(),actualElement); 
			 return getUnitArray(resReq, childIndex, resourceRequirementNum);
		 }
	     if(fatherNode instanceof CPSNodeTypeImpl) {
			 CPSNodeTypeImpl cpsNode =  ((CPSNodeTypeImpl)fatherNode);		
			 int nodeNumber = cpsNode.getBasicNode().size() + cpsNode.getSynchronizationNode().size();
			 int totalResReqNumber = cpsNode.getResourceRequirement().size();
			 int resourceRequirementNum = totalResReqNumber/nodeNumber;
			 List resReq = cpsNode.getResourceRequirement();
			 int childIndex = getChildIndex(cpsNode.eContents(),actualElement); 
			 return getUnitArray(resReq, childIndex, resourceRequirementNum);
		 }
		 if(fatherNode instanceof CompoundNodeTypeImpl) {
		    CompoundNodeTypeImpl cpnNode =  ((CompoundNodeTypeImpl)fatherNode);
		    int nodeNumber = existNode(cpnNode);
		    int totalResReqNumber = cpnNode.getResourceRequirement().size();
			int resourceRequirementNum = totalResReqNumber/nodeNumber;
			List resReq = cpnNode.getResourceRequirement();
			int childIndex = getChildIndex(cpnNode.eContents(),actualElement); 
			return getUnitArray(resReq, childIndex, resourceRequirementNum);
		}
		return null;
		 
	 }
	 
	 private int existNode(CompoundNodeTypeImpl egtype) {
		 int count = 0;
		 if(egtype.getCaseNode()!=null) {
			 count ++;
		 }
		 if(egtype.getPardoNode()!=null) {
			 count ++;
		 }
		 if( egtype.getRepetitionNode()!=null) {
			 count ++;
		 }
		 if( egtype.getSplitNode()!=null) {
			 count ++;
		 }
		 return count;
	 }
	 
	 public float[] getUnitArray(List resReq, int startIndex, int endIndex ) {
//		 System.out. println("lunghezza lista " + resReq.size());
//		 System.out.println("start index " + startIndex);
//		 System.out.println("end index " + endIndex);
//		 System.out.println("-----------------------");
	
		 List currentRes = resReq.subList(startIndex * endIndex , endIndex*(startIndex+1));

		 float[] result = new float[currentRes.size()];
		 for(int i = 0; i < currentRes.size(); i++) {
			 
			 Object obj = currentRes.get(i);
			 
			 if(obj instanceof ResourceRequirementType) {
				 result[i] = ((ResourceRequirementType)obj).getUnitsOfService();
			 }else if(obj instanceof ResourceRequirementType1) {
				 result[i] = ((ResourceRequirementType1)obj).getUnitsOfService();
			 }
			 else if(obj instanceof ResourceRequirementType2) {
				 result[i] = ((ResourceRequirementType2)obj).getUnitsOfService();
			 }
			 else if(obj instanceof ResourceRequirementType3) {
				 result[i] = ((ResourceRequirementType3)obj).getUnitsOfService();
			 }
			 else if(obj instanceof ResourceRequirementType4){
				 result[i] = ((ResourceRequirementType4)obj).getUnitsOfService();
			 }
		 }
		 return result;
	 }
    
    
    
    /**
     * This method computes the total resources required by each Basic, Synchro,
     * CPS or Repetition node in the graph.
     * If the node is a Link, Expanded or Compound node, then it computes
     * the total resources required by the EG or PS referred by it.
     * @param subGraph The EList containing the graph of which compute the
                       total resources required.
    **/
    private void acquireGraph(EList subGraph) throws PerformanceScenarioNotFoundException, ExecutionGraphNotFoundException, PartnerNotFoundException, StartNodeNotFoundException, NodeNotFoundException, GenericException, MyFileNotFoundException, IOException {
        String[] devicesNames = getDevicesNames();
        float[] units = null;
        
        //Takes the entire content of the graph (what's in XML tags)
        Object lastNode = subGraph.get(0);
       
        //REAL WORK
        for(int i = 0; i < subGraph.size(); i++) {           
                // Takes only the xNode and ResourcesRequirement tags
               
                Object actualElement = subGraph.get(i);
                if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.BasicNodeTypeImpl) {
	                di.univaq.MOSQUITO.egQnMerger.EG.impl.BasicNodeTypeImpl node = (di.univaq.MOSQUITO.egQnMerger.EG.impl.BasicNodeTypeImpl)actualElement;
	   				Object ob = node.eContainer();
	   				units = readResourceReqTonode(ob,actualElement);
	   			    float[] totResActualNode = computeTotalResources(project.getProcessingOverhead().getOverheadMatrix(), units);
	   				((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualElement).setTotalResources(totResActualNode);
	   			}
                
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.RepNodeTypeImpl) {
	                di.univaq.MOSQUITO.egQnMerger.EG.impl.RepNodeTypeImpl node = (di.univaq.MOSQUITO.egQnMerger.EG.impl.RepNodeTypeImpl)actualElement;
	   				Object ob = node.eContainer();
	   				units = readResourceReqTonode(ob,actualElement);
	   			    float[] totResActualNode = computeTotalResources(project.getProcessingOverhead().getOverheadMatrix(), units);
	   				((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) actualElement).setTotalResources(totResActualNode);
	   			}
                
	   			 
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.SynchroNodeTypeImpl) {
	   			    di.univaq.MOSQUITO.egQnMerger.EG.impl.SynchroNodeTypeImpl node = (di.univaq.MOSQUITO.egQnMerger.EG.impl.SynchroNodeTypeImpl)actualElement;
	   				Object ob = node.eContainer();
	   				units = readResourceReqTonode(ob,actualElement);
	   			    float[] totResActualNode = computeTotalResources(project.getProcessingOverhead().getOverheadMatrix(), units);
	   				((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).setTotalResources(totResActualNode);
	   		    }
	   			
	   			// il nodo compound contiene sempre CPSNodeType o RepNodeType che hanno applicati i ResourceRequirements
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.CompoundNodeTypeImpl) {
	   				CompoundNodeTypeImpl node = (CompoundNodeTypeImpl)actualElement;	
	   				
	   				List cpsNodes = node.eContents();
	   				for(int h = 0; h < cpsNodes.size(); h++) {
	   					if(cpsNodes.get(h) instanceof  di.univaq.MOSQUITO.egQnMerger.EG.impl.CPSNodeTypeImpl) {
	   						units = readResourceReqTonode(actualElement,cpsNodes.get(h));
	   					    float[] totResActualNode = computeTotalResources(project.getProcessingOverhead().getOverheadMatrix(), units);
	   					    ((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) cpsNodes.get(h)).setTotalResources(totResActualNode);
	   					}
	   				}
	   			}

                
                //// controllo su quale nodo itero il processo
                /* if the actual element is a BasicNode:
                        lastNode = actualElement
                        sets the deviceNames array
                   (the ResourceRequirements following this BasicNode will be processed
                    by the blocks above) */
                if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.BasicNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) lastNode).setDevicesNames(devicesNames);
                }

                /* if the actual element is a LinkNode:
                        lastNode = actualElement
                        sets the deviceNames array
                        derives the total resources for this LinkNode acquiring
                        and reducing the Performance Scenario associated to it */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.LinkNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) lastNode).setDevicesNames(devicesNames);
                    
                    String PSFileName = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) lastNode).getPerformanceScenarioFilename();
                    String PSName = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) lastNode).getPerformanceScenarioName();
                    
                    di.univaq.MOSQUITO.egQnMerger.EG.PSType ps = getPerformanceScenario(PSFileName, PSName);
                    if(ps != null) {
                        ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) lastNode).setDerivedResources(acquireAndReducePS(ps));
                    }
                }
                
                /* if the actual element is an ExpandedNode:
                        lastNode = actualElement
                        sets the deviceNames array
                        derives the total resources for this ExpandedNode acquiring
                        and reducing the Execution Graph associated to it */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.ExpandedNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) lastNode).setDevicesNames(devicesNames);
                    String refEGName = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) lastNode).getEGname();
                    di.univaq.MOSQUITO.egQnMerger.EG.EGType refNodeGraph = getExecutionGraph(actualPS.getScenarioName(), refEGName);
                    if(refNodeGraph != null) {
                        EList refNodeList = refNodeGraph.eContents();
                        acquireGraph(refNodeList);
                        float[] graphResources = reduceGraph(refNodeGraph);
                        ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) lastNode).setDerivedResources(graphResources);
                    }
                }
                
                /* if the actual element is a SynchroNode (Send Node):
                        lastNode = actualElement
                        sets the deviceNames array
                    (the ResourceRequirements following this SynchroNode will be processed
                     by the blocks above)
                        if the partner's total resources have been not yet derived:
                            acquires the Performance Scenario of the partner (this will be
                            useful in reduction phase)
                        else nothing
                    else (is a Receive Node) nothing */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.SynchroNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) lastNode).setDevicesNames(devicesNames);

                    try {
                        di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType partner = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) getNode(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getPartnerPerfFileName(),
                               ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getPartnerPerfScenarioName(),
                               ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getPartnerName()));
                        if((partner.getTotalResources() == null) &&
                           (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getMyType().getName().equals("SynchronousCall")) ||
                            (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getMyType().getName().equals("DeferredSynchronousCall")) ||
                            (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement).getMyType().getName().equals("AsynchronousCall"))) {
                                String PSFileName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) lastNode).getPartnerPerfFileName();
                                String PSName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) lastNode).getPartnerPerfScenarioName();

                                di.univaq.MOSQUITO.egQnMerger.EG.PSType ps = getPerformanceScenario(PSFileName, PSName);
                                if(ps != null)
                                    acquirePS(ps);
                        }
                    } catch(NodeNotFoundException e) {
                        throw new PartnerNotFoundException(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualElement));
                    }    
                    
                }
                
                /* if the actual element is a CPSNode:
                        lastNode = actualElement
                        sets the deviceNames array
                    (the ResourceRequirements following this CPSNode will be processed
                     by the blocks above)
                        acquires the sub-graph inside this CPSNode (this will be
                        useful in reduction phase) */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.CPSNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) lastNode).setDevicesNames(devicesNames);
                    acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) lastNode).eContents());   
                }
                
                /* if the actual element is a RepetitionNode:
                        lastNode = actualElement
                        sets the deviceNames array
                    (the ResourceRequirements following this CPSNode will be NOT 
                     processed by the blocks above)
                        acquires the sub-graph inside this RepetitionNode (this will be
                        useful in reduction phase) */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.RepNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) actualElement;
                    ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).setDevicesNames(devicesNames);
                    acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).eContents());
                    
                    // because the sub-graph inside a RepetitionNode is composed
                    // only by one node, sets the total resources for the RepetitionNode
                    // equals to the total resources of the node in the sub-graph, that
                    // had been as soon as calculated
                    if(((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getBasicNode() != null)
                            ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).setTotalResources(
                                    (((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getBasicNode()).getTotalResources());
                    else if(((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getExpandedNode() != null)
                                ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).setTotalResources(
                                    (((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getExpandedNode()).getDerivedResources());
                    else if(((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getLinkNode() != null)
                                ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).setTotalResources(
                                    (((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getLinkNode()).getDerivedResources());
                    else if(((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getSynchronizationNode() != null)
                                ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).setTotalResources(
                                    (((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) lastNode).getSynchronizationNode()).getTotalResources());
                }
                
                /* if the actual element is a CompoundNode:
                        lastNode = actualElement
                        acquires the sub-graph inside this CompoundNode (this will be
                        useful in reduction phase) */
                else if(actualElement instanceof di.univaq.MOSQUITO.egQnMerger.EG.impl.CompoundNodeTypeImpl) {
                    lastNode = (di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) actualElement;
                    acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) lastNode).eContents());
                }
        }
    }
    
    
    /** 
     * This method is used to acquire and reduce a scenario.
     * @param scenario The scenario to acquire and reduce.
     * @return A float[] containing the total resource requirements
     *         for the scenario.
    **/    
    private float[] acquireAndReducePS(di.univaq.MOSQUITO.egQnMerger.EG.PSType scenario) throws PerformanceScenarioNotFoundException, ExecutionGraphNotFoundException, PartnerNotFoundException, StartNodeNotFoundException, NodeNotFoundException, GenericException, MyFileNotFoundException, IOException {
        // processes only the mainEG of the Performance Scenario
        boolean trovato = false;
        EList egl = scenario.getExecutionGraph();
        int i = 0;
        while((i < egl.size()) && (!trovato)) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(0)).isIsMainEG()) {
                trovato = true;
            }
            i++;
        }
        scenario.setDevicesNames(getDevicesNames());
        acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(i - 1)).eContents());
        scenario.setTotalResources(reduceGraph((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(i - 1)));

        return scenario.getTotalResources();
    }    
    
    
    /**
     * This method is used to acquire a scenario without necessarly reduce it.
     * @param scenario The scenario to acquire.
    **/        
    private void acquirePS(di.univaq.MOSQUITO.egQnMerger.EG.PSType scenario) throws PerformanceScenarioNotFoundException, ExecutionGraphNotFoundException, PartnerNotFoundException, StartNodeNotFoundException, NodeNotFoundException, GenericException, MyFileNotFoundException, IOException {
        // processes only the mainEG of the Performance Scenario
        boolean trovato = false;
        EList egl = scenario.getExecutionGraph();
        int i = 0;
        while((i < egl.size()) && (!trovato)) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(0)).isIsMainEG()) {
                trovato = true;
            }
            i++;
        }
        scenario.setDevicesNames(getDevicesNames());
        acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(i - 1)).eContents());
    }

    
    /**
     * This method is used to reduce a well defined Execution Graph.
     * @param graph The graph to reduce. 
    **/
    private float[] reduceGraph(di.univaq.MOSQUITO.egQnMerger.EG.EGType graph) throws PartnerNotFoundException, StartNodeNotFoundException, ExecutionGraphNotFoundException, PerformanceScenarioNotFoundException, NodeNotFoundException, GenericException, MyFileNotFoundException, IOException {
        float[] totGraphRes = null;
        EList arcList = graph.getArc();
        EObject startNode = getStartNodeObject(graph);
        totGraphRes = new float[getDevicesNames().length];  //graph total resources
        String[] devicesNames = getDevicesNames();          //devices names
        EObject actualNode = startNode;                     //actual node = first node
        di.univaq.MOSQUITO.egQnMerger.EG.ArcType[] nextArcs = null;                       //next arcs array
        di.univaq.MOSQUITO.egQnMerger.EG.ArcType selectedArc = null;                      //choised arc among next arcs
        String lastDestination = null;                      //last node processed

        // processes the start node
        // Note: it cannot be neither a CPSNode nor a RepetitionNode because
        // these are in a CompoundNode
        /* if the start node is a BasicNode:
                sums the BasicNode's total resources with the graph's total resources
                lastDestination = the BasicNode */
        if(startNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) {
            totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) startNode).getTotalResources());
            lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) startNode).getNodeName();
        }

        /* if the start node is a LinkNode:
                sums the LinkNode's derived resources with the graph's total resources
                lastDestination = the LinkNode */
        else if(startNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) {
            totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) startNode).getDerivedResources());
            lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) startNode).getNodeName();
        }

        /* if the start node is an ExpandedNode:
                sums the ExpandedNode's total resources with the graph's total resources
                lastDestination = the ExpandedNode */
        else if(startNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) {
            totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) startNode).getDerivedResources());
            lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) startNode).getNodeName();
        }

        /* if the start node is a SynchroNode (Send Node):
                acquires the partner's Performance Scenario
                sums the SynchroNode's total resources with the partner's total resources
                and the graph's total resources
                lastDestination = the SynchroNode */
        else if(startNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) {                
            //totGraphRes = sumArrays(totGraphRes, ((EG.SynchroNodeType) startNode).getTotalResources());
            di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType partner = null;
            // if the SynchroNode is a Send Node -> obtains the partner
            if(!((((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getMyType().getName().equals("Reply")) ||
                (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getMyType().getName().equals("NoReply")))) {
                    String PSFileName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getPartnerPerfFileName();
                    String PSName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getPartnerPerfScenarioName();
                    DocumentProcessor dpSynchro = new DocumentProcessor(PSFileName);
                    di.univaq.MOSQUITO.egQnMerger.EG.PSType ps = dpSynchro.getPerformanceScenario(PSName);

                    if(ps != null) {
                        dpSynchro.acquirePS(ps);
                        try {
                            partner = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) dpSynchro.getNode(ps, ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getPartnerName()));
                            // if startNode is a send node -> 
                            // totGraphRes = sumArrays(totGraphRes, sumArrays(startNode.getTotalResources, partner.getTotalResources))
                            totGraphRes = sumArrays(totGraphRes, 
                                sumArrays(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getTotalResources(), ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) partner).getTotalResources()));
                        } catch (NodeNotFoundException ex) {
                            throw new PartnerNotFoundException((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode);
                        }

                    }
            }

            lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) startNode).getNodeName();
        }

        /* if the start node is a CompoundNode:
                sums the CompoundNode's reduction result with the graph's total resources
                lastDestination = the CompoundNode */
        else if(startNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) {
            totGraphRes = sumArrays(totGraphRes, reduceCompound((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) startNode));
            lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) startNode).getNodeName();
        }

        /* choices the next node and proceeds like above */
        while((getNextArcs(arcList, lastDestination) != null) && (arcList.size() != 0)) {
            selectedArc = selectArc(graph, getNextArcs(arcList, lastDestination));
            actualNode = getNode(graph, selectedArc.getToNode());

            /* if the actual node is a BasicNode:
                sums the BasicNode's total resources with the graph's total resources
                lastDestination = the BasicNode */
            if(actualNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) {
                totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualNode).getTotalResources());
                lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualNode).getNodeName();
            }

            /* if the actual node is a LinkNode:
                sums the LinkNode's derived resources with the graph's total resources
                lastDestination = the LinkNode */
            else if(actualNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) {
                totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualNode).getDerivedResources());
                lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualNode).getNodeName();
            }

            /* if the actual node is an ExpandedNode:
                sums the ExpandedNode's total resources with the graph's total resources
                lastDestination = the ExpandedNode */
            else if(actualNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) {
                totGraphRes = sumArrays(totGraphRes, ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualNode).getDerivedResources());
                lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualNode).getNodeName();
            }

            /* if the actual node is a SynchroNode (Send Node):
                acquires the partner's Performance Scenario
                sums the SynchroNode's total resources with the partner's total resources
                and the graph's total resources
                lastDestination = the SynchroNode */
            else if(actualNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) {
                //totGraphRes = sumArrays(totGraphRes, ((EG.SynchroNodeType) startNode).getTotalResources());
                di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType partner = null;
                // if the SynchroNode is a Send Node -> obtains the partner
                if(!((((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getMyType().getName().equals("Reply")) ||
                    (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getMyType().getName().equals("NoReply")))) {
                        String PSFileName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getPartnerPerfFileName();
                        String PSName = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getPartnerPerfScenarioName();
                        DocumentProcessor dpSynchro = new DocumentProcessor(PSFileName);
                        di.univaq.MOSQUITO.egQnMerger.EG.PSType ps = dpSynchro.getPerformanceScenario(PSName);

                        if(ps != null) {
                            dpSynchro.acquirePS(ps);
                            try {
                                partner = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) dpSynchro.getNode(ps, ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getPartnerName()));
                                // if actualNode is a send node -> 
                                // totGraphRes = sumArrays(totGraphRes, sumArrays(actualNode.getTotalResources, partner.getTotalResources))
                                totGraphRes = sumArrays(totGraphRes, 
                                    sumArrays(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getTotalResources(), ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) partner).getTotalResources()));
                            } catch (NodeNotFoundException ex) {
                                throw new PartnerNotFoundException((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode);
                            } 
                        }
                }

                lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualNode).getNodeName();
            }

            /* if the actual node is a CompoundNode:
                sums the CompoundNode's reduction result with the graph's total resources
                lastDestination = the CompoundNode */
            else if(actualNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) {
                totGraphRes = sumArrays(totGraphRes, reduceCompound((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) actualNode));
                lastDestination = ((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) actualNode).getNodeName();
            }
        }

        /* if there are not next arcs: nothing */
        if((getNextArcs(arcList, lastDestination) == null) && (arcList.size() != 0)) {

        }
               
        return totGraphRes;
    }

    
    /**
     * This method is used to reduce a CompoundNode.
     * @param node The CompoundNode to reduce.
     * @return A float[] that represents the total resources of the sub-graph
     *         contained in the CompoundNode. 
    **/
    private float[] reduceCompound(di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType node) throws GenericException {
        float[] totNodeResources = null;        // sub-graph's total resources
        
        /* if the CompoundNode contains a CaseNode:
                adds the CaseNode's total resources to the partial solution
                resolves the CaseNode's sub-graph and sums it's total resources with
                the partial solution */
        if(node.getCaseNode() != null) {
            float[] innerCaseNodeResources = new float[getDevicesNames().length];
            totNodeResources = node.getCaseNode().getTotalResources();
            EList caseList = node.getCaseNode().eContents();
            
            // on the basis of the pathType flag:
            //      choices a node connected to the CaseNode and sums its total resources
            //      with the partial solution
            if(caseList.size() > 0) {
            
                switch(pathType) {
                     case SHORTEST_PATH:
                         for(int i = 0; i < innerCaseNodeResources.length; i++) {
                            innerCaseNodeResources[i] = 1000000;
                         }
                         for(int i = 0; i < caseList.size(); i++) {
                                Object actualInnerCaseNode = caseList.get(i);
                                if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getTotalResources()) < sumArrayElements(innerCaseNodeResources)))
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getTotalResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getDerivedResources()) < sumArrayElements(innerCaseNodeResources))) 
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getDerivedResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getDerivedResources()) < sumArrayElements(innerCaseNodeResources))) 
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getDerivedResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getTotalResources()) < sumArrayElements(innerCaseNodeResources)))
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getTotalResources());
                         }

                         break;

                     case LONGEST_PATH:
                         for(int i = 0; i < innerCaseNodeResources.length; i++) {
                            innerCaseNodeResources[i] = 0;
                         }
                         for(int i = 0; i < caseList.size(); i++) {
                                Object actualInnerCaseNode = caseList.get(i);
                                if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) &&
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getTotalResources()) >= sumArrayElements(innerCaseNodeResources)))
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getTotalResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getDerivedResources()) >= sumArrayElements(innerCaseNodeResources))) 
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getDerivedResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getDerivedResources()) >= sumArrayElements(innerCaseNodeResources))) 
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getDerivedResources());
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getProbability() > 0) &&
                                        (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getTotalResources()) >= sumArrayElements(innerCaseNodeResources)))
                                            innerCaseNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getTotalResources());
                         }
                         break;

                     case AVERAGE_PATH:
                         for(int i = 0; i < caseList.size(); i++) {
                                Object actualInnerCaseNode = caseList.get(i);
                                if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) &&
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getProbability() > 0))
                                            innerCaseNodeResources = sumArrays(innerCaseNodeResources, (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerCaseNode).getWeightedTotalResources()));
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getProbability() > 0)) 
                                            innerCaseNodeResources = sumArrays(innerCaseNodeResources, (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerCaseNode).getWeightedDerivedResources()));
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getProbability() > 0)) 
                                            innerCaseNodeResources = sumArrays(innerCaseNodeResources, (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerCaseNode).getWeightedDerivedResources()));
                                else if((actualInnerCaseNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) && 
                                        (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getProbability() > 0))
                                            innerCaseNodeResources = sumArrays(innerCaseNodeResources, (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerCaseNode).getWeightedTotalResources()));
                         }
                         break;
                }
            
                totNodeResources = sumArrays(totNodeResources, innerCaseNodeResources);
            } 
            
        }
        
        /* if the CompoundNode contains a PardoNode:
                resolves the PardoNode's sub-graph and sums it's total resources with
                the partial solution
                (Note: the PardoNode's sub-graph is resolved considering the most
                       expensive parallel execution path among all of these) */
        else if(node.getPardoNode() != null) {
            float[] innerPardoNodeResources = new float[getDevicesNames().length];
            EList pardoList = node.getPardoNode().eContents();
            
            //sums the total resources of the most expensive sub-node to the partial solution
            if(pardoList.size() > 0) {
                for(int i = 0; i < innerPardoNodeResources.length; i++) {
                    innerPardoNodeResources[i] = 0;
                 }
                 for(int i = 0; i < pardoList.size(); i++) {
                        Object actualInnerPardoNode = pardoList.get(i);
                        if((actualInnerPardoNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) &&
                                (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerPardoNode).getProbability() > 0) &&
                                (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerPardoNode).getTotalResources()) >= sumArrayElements(innerPardoNodeResources)))
                                    innerPardoNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) actualInnerPardoNode).getTotalResources());
                        else if((actualInnerPardoNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) && 
                                (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerPardoNode).getProbability() > 0) &&
                                (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerPardoNode).getDerivedResources()) >= sumArrayElements(innerPardoNodeResources))) 
                                    innerPardoNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) actualInnerPardoNode).getDerivedResources());
                        else if((actualInnerPardoNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) && 
                                (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerPardoNode).getProbability() > 0) &&
                                (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerPardoNode).getDerivedResources()) >= sumArrayElements(innerPardoNodeResources))) 
                                    innerPardoNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) actualInnerPardoNode).getDerivedResources());
                        else if((actualInnerPardoNode instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) && 
                                (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerPardoNode).getProbability() > 0) &&
                                (sumArrayElements(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerPardoNode).getTotalResources()) >= sumArrayElements(innerPardoNodeResources)))
                                    innerPardoNodeResources = (((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) actualInnerPardoNode).getTotalResources());
                 }
            }
            totNodeResources = innerPardoNodeResources;
        }
        
        /* if the CompoundNode contains a SplitNode: */
        else if(node.getSplitNode() != null) {
            
        }
        
        /* if the CompoundNode contains a RepetitionNode:
                reduces the RepetitionNode's sub-graph
                multiplies its total resources with the repetition factor and
                sums the resulting total resources with the partial solution */
        else if(node.getRepetitionNode() != null) {
            totNodeResources = multArray(node.getRepetitionNode().getTotalResources(), node.getRepetitionNode().getRepetitionFactor());
        }
        
        return totNodeResources;
    }
    
    
    /**
     * This method is used to get an array of ArcType Objects that contains
     * the arcs in the arcList that are compatible with the last destination node.
     * @param arcList The arc list.
     * @param lastDestination The last node reached.
     * @return An EG.ArcType[] containing the compatible arcs.
    **/
    private static di.univaq.MOSQUITO.egQnMerger.EG.ArcType[] getNextArcs(EList arcList, String lastDestination) {
        di.univaq.MOSQUITO.egQnMerger.EG.ArcType[] matchingArcs = null;
        int count = 0;
        for(int i = 0; i < arcList.size(); i++) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.ArcType) arcList.get(i)).getFromNode().equals(lastDestination)) count++;
        }
        if(count > 0) {
            matchingArcs = new di.univaq.MOSQUITO.egQnMerger.EG.ArcType[count];
            int j = 0;
            for(int i = 0; i < arcList.size(); i++) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.ArcType) arcList.get(i)).getFromNode().equals(lastDestination)) {
                    matchingArcs[j] = ((di.univaq.MOSQUITO.egQnMerger.EG.ArcType) arcList.get(i));
                    j++;
                }
            }
        }
        return matchingArcs;
        
    }
    

    /**
     * This method is used to choice an arc from the compatible arcs array,
     * depending by the pathType flag.
     * @param arcs The compatible arcs array.
     * @param pathType The pathType flag.
     * @return The selected arc (Note: in the actual version of this method,
                                 it returns the first arc in the array).
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.ArcType selectArc(di.univaq.MOSQUITO.egQnMerger.EG.EGType graph, di.univaq.MOSQUITO.egQnMerger.EG.ArcType[] arcs) throws NodeNotFoundException {
        /*EG.ArcType selectedArc = null;
        if(arcs.length > 1) {
            switch(pathType) {
             case SHORTEST_PATH:
                 float minProbability = 100;
                 // seleziona l'arco il cui nodo di destinazione ha la probabilità minore
                 // ma se è 0??
                 for(int i = 0; i < arcs.length; i++) {
                    EObject actualDestNode = getNode(graph, ((EG.ArcType) arcs[i]).getToNode());
                    if((actualDestNode instanceof EG.BasicNodeType) & 
                            (((EG.BasicNodeType) actualDestNode).getProbability()) < minProbability) 
                                minProbability = ((EG.BasicNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.LinkNodeType) & 
                            (((EG.LinkNodeType) actualDestNode).getProbability()) < minProbability) 
                                minProbability = ((EG.LinkNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.ExpandedNodeType) & 
                            (((EG.ExpandedNodeType) actualDestNode).getProbability()) < minProbability) 
                                minProbability = ((EG.ExpandedNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.SynchroNodeType) & 
                            (((EG.SynchroNodeType) actualDestNode).getProbability()) < minProbability) 
                                minProbability = ((EG.SynchroNodeType) actualDestNode).getProbability();
                    selectedArc = arcs[i];
                 }
                 break;

             case LONGEST_PATH:
                 float maxProbability = 0;
                 // seleziona l'arco il cui nodo di destinazione ha la probabilità maggiore
                 for(int i = 0; i < arcs.length; i++) {
                    EObject actualDestNode = getNode(graph, ((EG.ArcType) arcs[i]).getToNode());
                    if((actualDestNode instanceof EG.BasicNodeType) & 
                            (((EG.BasicNodeType) actualDestNode).getProbability()) >= maxProbability) 
                                maxProbability = ((EG.BasicNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.LinkNodeType) & 
                            (((EG.LinkNodeType) actualDestNode).getProbability()) >= maxProbability) 
                                maxProbability = ((EG.LinkNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.ExpandedNodeType) & 
                            (((EG.ExpandedNodeType) actualDestNode).getProbability()) >= maxProbability) 
                                maxProbability = ((EG.ExpandedNodeType) actualDestNode).getProbability();
                    else if((actualDestNode instanceof EG.SynchroNodeType) & 
                            (((EG.SynchroNodeType) actualDestNode).getProbability()) >= maxProbability) 
                                maxProbability = ((EG.SynchroNodeType) actualDestNode).getProbability();
                    selectedArc = arcs[i];
                 }
                 break;
             // da implementare
             case AVERAGE_PATH:
                 break;
            }

            return selectedArc;
        }
        
        else */
            return arcs[0];
    }
    
    
    /**
     * This method is used to get a node specifying its name and its Execution Graph.
     * @param graph The Execution Graph.
     * @param nodeName The node name.
     * @return The node. 
    **/
    private static EObject getNode(di.univaq.MOSQUITO.egQnMerger.EG.EGType graph, String nodeName) throws NodeNotFoundException {
        EList graphContents = graph.eContents();
        int i = 0;
        while(i < graphContents.size()) {
            if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) graphContents.get(i)).getNodeName().equals(nodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) graphContents.get(i)).getNodeName().equals(nodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) graphContents.get(i)).getNodeName().equals(nodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) graphContents.get(i)).getNodeName().equals(nodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) graphContents.get(i)).getNodeName().equals(nodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) graphContents.get(i));
                }
            }
            i++;
        }
        throw new NodeNotFoundException(graph.getEGname(), nodeName);
    }
    
    
    /**
     * This method is used to get a node specifying its name and its Performance Scenario.
     * @param PSFileName The Performance Scenario's file name.
     * @param PSName The Performance Scenario's name.
     * @param nodeName The node name.
     * @return The node. 
    **/
    private static EObject getNode(String PSFileName, String PSName, String nodeName) throws NodeNotFoundException, PerformanceScenarioNotFoundException, MyFileNotFoundException, IOException {
        // creates a new Document Processor for the scenario
        DocumentProcessor dp = new DocumentProcessor(PSFileName);
        // obtains the Performance Scenario's Execution Graphs list
        EList egl = dp.getPerformanceScenario(PSFileName, PSName).getExecutionGraph();
        EObject node = null;
        di.univaq.MOSQUITO.egQnMerger.EG.EGType actualEG = null;
        int i = 0;
        // searches the node in the actual Execution Graph
        // Note: if the actual Execution Graph doesn't contain the node
        //       then the NodeNotFoundException is catched, but the
        //       research continues...
        while((i < egl.size())) {
            actualEG = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(i));
            try {
                node = dp.getNode(actualEG, nodeName);
                return node;
            } catch(NodeNotFoundException e) {
                
            }
            i++;
        }
        throw new NodeNotFoundException(PSFileName, PSName, nodeName);
    }
    
    
    /**
     * This method is used to get a node specifying its name, its Performance Scenario and its Execution Graph.
     * @param PSFileName The Performance Scenario's file name.
     * @param PSName The Performance Scenario's name.
     * @param EGName The Execution Graph's name.
     * @param nodeName The node name.
     * @return The node. 
    **/
    private static EObject getNode(String PSFileName, String PSName, String EGName, String nodeName) throws NodeNotFoundException, ExecutionGraphNotFoundException, MyFileNotFoundException, IOException {
        DocumentProcessor dp = new DocumentProcessor(PSFileName);
        return dp.getNode(dp.getExecutionGraph(EGName), nodeName);
    }
    
    
    /**
     * This method is used to get a node specifying its name and its Performance Scenario object.
     * @param ps The Performance Scenario object.
     * @param nodeName The node name.
     * @return The node. 
    **/
    private static EObject getNode(di.univaq.MOSQUITO.egQnMerger.EG.PSType ps, String nodeName) throws NodeNotFoundException {
        // obtains the Performance Scenario's Execution Graphs list
        EList egl = ps.getExecutionGraph();
        EObject node = null;
        di.univaq.MOSQUITO.egQnMerger.EG.EGType actualEG = null;
        int i = 0;
        // searches the node in the actual Execution Graph
        // Note: if the actual Execution Graph doesn't contain the node
        //       then the NodeNotFoundException is catched, but the
        //       research continues...
        while((i < egl.size())) {
            actualEG = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(i));
            try {
                node = getNode(actualEG, nodeName);
                return node;
            } catch(NodeNotFoundException e) {
                
            }
            i++;
        }
        throw new NodeNotFoundException(ps, nodeName);
    }
    
    
    /**
     * This method is used to compute the total resources of a node, using its
     * resource requirements.
     * @param overheadMatrix The overhead matrix.
     * @param units The resource requirements array of the node.
     * @return The total computer resources required by the node.
    **/
    private float[] computeTotalResources(di.univaq.MOSQUITO.egQnMerger.EG.OverheadMatrixType overheadMatrix, float[] units) {
        //number of rows is the number of devices
        int rows = project.getProcessingOverhead().getDevices().getDevice().size();
        //number of columns is the number of software resources + 1 (the last column is the Total Computer Resource column)
        int columns = project.getProcessingOverhead().getSoftwareResources().getSoftwareResource().size() + 1;
        
        float[][] totMatrix = new float[rows][columns];
        int count = 0;
        // Creating totMatrix but without the Total Computer Resources column
        for(int j = 0; j < totMatrix[0].length - 1; j++) {
            
            for(int i = 0; i < totMatrix.length; i++) {
                di.univaq.MOSQUITO.egQnMerger.EG.OMElementType actualElement = ((di.univaq.MOSQUITO.egQnMerger.EG.OMElementType) overheadMatrix.getOMElement().get(count));
                totMatrix[i][j] = actualElement.getAmountOfService() * units[j];
                count++;
                totMatrix[i][totMatrix[i].length - 1] = 0;
            }
        }
        // Setting the Total Computer Resources column
        for(int i = 0; i < totMatrix.length; i++) {
            for(int j = 0; j < totMatrix[i].length - 1; j++) {
                totMatrix[i][totMatrix[i].length - 1] = totMatrix[i][totMatrix[i].length - 1] + totMatrix[i][j];
            }
        }
        // Creating the Total Computer Resources array (totRes)
        float[] totRes = new float[totMatrix.length];
        for(int i = 0; i < totRes.length; i++) {
            totRes[i] = totMatrix[i][totMatrix[i].length -1];
        }
                
        return totRes;       
    }
        
    
    /**
     * This method is used to get a Performance Scenario specifying its name.
     * @param PSName The Performance Scenario name.
     * @return The Performance Scenario. 
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.PSType getPerformanceScenario(String PSName) throws PerformanceScenarioNotFoundException {
        // obtains the Performance Scenario's list from the root of the Project document
        EList psl = projectDocRoot.getProject().getPerformanceScenario();
        int j = 0;
        // searches the Performance Scenario in the list and returns it if exists
        while(j < psl.size()) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j)).getScenarioName().equals(PSName)) {
                return ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j));
            }
            j++;
        }
        // scenario not found -> throws Exception
        throw new PerformanceScenarioNotFoundException(PSName);
    } 
    
    
    /**
     * This method is used to get a Performance Scenario specifying its file name and its name.
     * @param PSFileName The Performance Scenario file name.
     * @param PSName The Performance Scenario name.
     * @return The Performance Scenario. 
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.PSType getPerformanceScenario(String PSFileName, String PSName) throws PerformanceScenarioNotFoundException, MyFileNotFoundException, IOException {
        // creates a new Document Processor for the Performance Scenario's file name
        DocumentProcessor appProcessor = new DocumentProcessor(PSFileName);
        // obtains the Performance Scenario's list from the root of the Project document
        EList psl = appProcessor.projectDocRoot.getProject().getPerformanceScenario();
        int j = 0;
        // searches the Performance Scenario in the list and returns it if exists
        while(j < psl.size()) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j)).getScenarioName().equals(PSName)) {
                return ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j));
            }
            j++;
        }
        // scenario not found -> throws Exception
        throw new PerformanceScenarioNotFoundException(PSFileName, PSName);
    }
    
    
    /**
     * This method is used to get an Execution Graph specifying its name.
     * @param EGName The Execution Graph's name.
     * @return The Execution Graph. 
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.EGType getExecutionGraph(String EGName) throws ExecutionGraphNotFoundException {
        // obtains the Execution Graph's list from the actual Performance Scenario
        EList egl = actualPS.eContents();
        int k = 0;
        // searches the Execution Graph in the list and returns it if exists
        while(k < egl.size()) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(k)).getEGname().equals(EGName)) {
                return (((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(k)));
            }
            k++;
        }
        // graph not found -> throws Exception
        throw new ExecutionGraphNotFoundException(EGName);
    }
    
    
    /**
     * This method is used to get an Execution Graph specifying its Performance Scenario's name and its name.
     * @param PSName The Performance Scenario's name.
     * @param EGName The Execution Graph's name.
     * @return The Execution Graph. 
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.EGType getExecutionGraph(String PSName, String EGName) throws ExecutionGraphNotFoundException {
        // obtains the Performance Scenario's list from the root of the Project document
        EList psl = projectDocRoot.getProject().getPerformanceScenario();
        EList egl = null;
        int j = 0, k = 0;
        // for each Performance Scenario:
        //      obtains the Execution Graph's list of the Performance Scenario j
        //      searches the Execution Graph in the list and returns it if exists
        while(j < psl.size()) {
            if(((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j)).getScenarioName().equals(PSName)) {
                egl = ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(j)).getExecutionGraph();
                while(k < egl.size()) {
                    if(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(k)).getEGname().equals(EGName)) {
                        return (((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(k)));
                    }
                    k++;
                }
            }
            j++;
        }
        // graph not found -> throws Exception
        throw new ExecutionGraphNotFoundException(PSName, EGName);
    }

            
    /**
     * This method is used to get the start node of an Execution Graph.
     * @param graph The Execution Graph.
     * @return The start node of the Execution Graph. 
    **/
    private EObject getStartNodeObject(di.univaq.MOSQUITO.egQnMerger.EG.EGType graph) throws StartNodeNotFoundException {
        String startNodeName = graph.getStartNode();
        EList graphContents = graph.eContents();
        int i = 0;
        while(i < graphContents.size()) {
            if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) graphContents.get(i)).getNodeName().equals(startNodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) graphContents.get(i)).getNodeName().equals(startNodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) graphContents.get(i)).getNodeName().equals(startNodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) graphContents.get(i)).getNodeName().equals(startNodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) graphContents.get(i));
                }
            }
            else if(graphContents.get(i) instanceof di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) {
                if(((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) graphContents.get(i)).getNodeName().equals(startNodeName)) {
                    return ((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) graphContents.get(i));
                }
            }
            i++;
        }
        
        throw new StartNodeNotFoundException(graph);
    }
    
    
    /**
     * This method is used to get a Device specifying its name.
     * @param deviceName The Device name.
     * @return The Device. 
    **/
    private di.univaq.MOSQUITO.egQnMerger.EG.DeviceType getDevice(String deviceName) throws DeviceNotFoundException {
        // obtains the Device's list from the devices list in the processing overhead of the project
        EList devicesList = project.getProcessingOverhead().getDevices().getDevice();
        int i = 0;
        di.univaq.MOSQUITO.egQnMerger.EG.DeviceType actualDevice = null;
        // searches the Device in the list and returns it if exists
        while(i < devicesList.size()) {
            actualDevice = (di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) devicesList.get(i);
            if(actualDevice.getDeviceName().equals(deviceName)) {
                return actualDevice;
            }
            i++;
        }
        // device not found -> throws Exception
        throw new DeviceNotFoundException(deviceName);
    }
    
    
    /**
     * This method processes the QNM and parametrizes it.
    **/
    private void processModel() throws CannotDeriveQNMWorkloadTypeException, IOException, DeviceNotFoundException {
        EList psList = project.getPerformanceScenario();    //list of performance scenarios
        
        if(psList.size() != 0) {
            // creates <Workload>
            WorkloadType workloadTag = PmifSchemaFactoryImpl.eINSTANCE.createWorkloadType();
            // creates <ServiceRequest>
            ServiceRequestType serviceRequestTag = PmifSchemaFactoryImpl.eINSTANCE.createServiceRequestType();
            
            // transforms each PerformanceScenario in a xWorkload, where x is:
            //      Open if the InterarrivalTime is greater than zero
            //              and the NumberOfJobs is zero;
            //      Closed if the InterArrivalTime is zero
            //                and the NumberOfJobs is greater than zero.
            //      throws a CannotDeriveQNMWorkloadTypeException otherwise.
            di.univaq.MOSQUITO.egQnMerger.EG.PSType actualPS = null;
            for(int i = 0; i < psList.size(); i++) {
                actualPS = ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psList.get(i));
                // the actualPS represents an OpenWorkload
                if((actualPS.getInterarrivalTime() > 0) && (actualPS.getNumberOfJobs().toString().equals("0"))) {
                    // creates <OpenWorkload>
                    OpenWorkloadType openWorkloadToAdd = PmifSchemaFactory.eINSTANCE.createOpenWorkloadType();
                    // sets the WorkloadName attribute value,
                    // that is equal to the EGName attribute value of the MainEG of the scenario 
                    openWorkloadToAdd.setWorkloadName(actualPS.getScenarioName());//getMainEG(actualPS.getScenarioName()).getEGname());
                    // sets the ArrivalRate attribute value,
                    // that is equal to the InterarrivalTime attribute value of the scenario
                    openWorkloadToAdd.setArrivalRate(actualPS.getInterarrivalTime());
                    // sets the TimeUnits attribute value, that is "sec"
                    openWorkloadToAdd.setTimeUnits(TimeUnitsType.SEC_LITERAL);
                    
                    // sets the ArrivesAt attribute value, that is "Init"
                    openWorkloadToAdd.setArrivesAt("Init");
                    // sets the DepartsAt attribute value, that is "Fini"
                    openWorkloadToAdd.setDepartsAt("Fini");
                                    
                    // creates <ServiceRequest> for the openWorkload
                    createServiceRequests(actualPS, openWorkloadToAdd, serviceRequestTag);
                                  
                    // adds <OpenWorkload> to <Workload>
                    workloadTag.getOpenWorkload().add(openWorkloadToAdd);
                   
                   
                }
                // the actualPS represents a ClosedWorkload
                else if ((actualPS.getInterarrivalTime() == 0) && ((!actualPS.getNumberOfJobs().equals("0")))) {
                    // creates <ClosedWorkload>
                    ClosedWorkloadType closedWorkloadToAdd = PmifSchemaFactoryImpl.eINSTANCE.createClosedWorkloadType();
                    // sets the WorkloadName attribute value,
                    // that is equal to the EGName attribute value of the MainEG of the scenario 
                    closedWorkloadToAdd.setWorkloadName(actualPS.getScenarioName());//getMainEG(actualPS.getScenarioName()).getEGname());
                    // sets the NumberOfJobs attribute value,
                    // that is equal to the NumberOfJobs attribute value of the scenario
                    closedWorkloadToAdd.setNumberOfJobs(actualPS.getNumberOfJobs());
                    // sets the TimeUnits attribute value, that is "sec"
                    closedWorkloadToAdd.setTimeUnits(TimeUnitsType.SEC_LITERAL);
                    
                    // sets the ThinkDevice (ThinkTime) attribute value,
                    // that is equal to the DeviceName (ServiceTime) attribute value of
                    // the first device having "ThinkDevice" as DeviceName attribute value
                    EList devicesList = project.getProcessingOverhead().getDevices().getDevice();
                    di.univaq.MOSQUITO.egQnMerger.EG.DeviceType actualDevice = null;
                    int j = 0;
                    boolean trovato = false;
                    while((j < devicesList.size()) && (!trovato)) {
                        actualDevice = (di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) devicesList.get(j);
                        if((actualDevice.getSchedulingPolicy().getName().equals("IS"))/* ||
                           (actualDevice.getDeviceName().equals("thinkDevice"))*/) {
                            closedWorkloadToAdd.setThinkDevice(actualDevice.getDeviceName());
                            closedWorkloadToAdd.setThinkTime(actualDevice.getServiceTime());                            
                            trovato = true;
                        }
                        j++;
                    }
                    if(closedWorkloadToAdd.getThinkDevice() == null) {
                        throw new CannotDeriveQNMWorkloadTypeException(closedWorkloadToAdd);
                    }
                    
                    // creates <ServiceRequest> for the closedWorkload
                    createServiceRequests(actualPS, closedWorkloadToAdd, serviceRequestTag);
                    // adds <ClosedWorkload> to <Workload>
                    workloadTag.getClosedWorkload().add(closedWorkloadToAdd);
                }
                else throw new CannotDeriveQNMWorkloadTypeException(actualPS);
                // adds <Workload> to the QNM
                qnm.getWorkload().add(workloadTag);
            }
            
            // adds the document root to the document
            qnmDocument.getContents().add(qnmDocRoot);
            // saves the document
            qnmDocument.save(null);
        }
        
    }
    
    
    /** 
     * This method is used to fill the ServiceRequest tag in input with the
     * service requests of the open workload in input, processing the actual
     * performance scenario.
     * @param actualPS The actual performance scenario must be processed.
     * @param openWorkload The open workload on wich actualPS is mapped.
     * @serviceRequestTag The ServiceRequest tag.
    **/
    private void createServiceRequests(di.univaq.MOSQUITO.egQnMerger.EG.PSType actualPS, OpenWorkloadType openWorkload, ServiceRequestType serviceRequestTag) throws DeviceNotFoundException {
        boolean[] bools = new boolean[actualPS.getTotalResources().length];
        di.univaq.MOSQUITO.egQnMerger.EG.DeviceType actualDevice = null;
        int j = 0;
        while(!terminated(actualPS.getDevicesNames(), bools)) {
            actualDevice = getDevice(actualPS.getDevicesNames()[j]);
            switch(actualDevice.getDeviceFeature().getValue()) {
                case di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_TIME_SPEC:
                    //adds <TimeServiceRequest> to <ServiceRequest>
                    TimeServType timeSR = PmifSchemaFactoryImpl.eINSTANCE.createTimeServType();

                    timeSR.setWorkloadName(actualPS.getScenarioName());
                    timeSR.setServerID(actualDevice.getDeviceName());
                    timeSR.setTimeUnits(toTimeUnits(actualDevice.getServiceUnits()));
                    long longNumOfVisitsT = new Float(actualPS.getTotalResources()[j]).longValue();
                    timeSR.setNumberOfVisits(BigInteger.valueOf(longNumOfVisitsT));
                    timeSR.setServiceTime(actualDevice.getServiceTime());
                    //timeSR.setService();            

                    /*
                    if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.FCFS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.FCFS_LITERAL);
                    }
                    else if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.IS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.IS_LITERAL);
                    }
                    else if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.PS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.PS_LITERAL);
                    }*/

                    float lastProbabilityT = 0;
                    ArcType[] nextArcsT = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), true);
                    
                    switch(nextArcsT.length) {
                        case 1:
                            TransitType transitToOneDeviceT = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToOneDevice.setService();
                            
                            transitToOneDeviceT.setProbability((float) 1.0);
                            
                            transitToOneDeviceT.setTo(nextArcsT[0].getToNode());
                            //transitToOneDevice.setFrom();
                            timeSR.getTransit().add(transitToOneDeviceT);
                            break;
                        
                        default:
                            TransitType transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();
                            
                            String[] nextDevicesNames = new String[nextArcsT.length];
                            for(int z = 0; z < nextArcsT.length; z++) {
                                nextDevicesNames[z] = nextArcsT[z].getToNode();
                            }
                            
                            boolean[] nextBools = new boolean[nextArcsT.length];
                            
                            int h = 0;
                            boolean trovato = false;
                            while(!terminated2(openWorkload, nextDevicesNames, nextBools)
                                    /*(h < nextArcsT.length) && (!trovato)*/) {
                                if(nextArcsT[h].getToNode().equals(openWorkload.getDepartsAt())) {
                                    
                                    transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();
                                    
                                    //transitToDevicesT.setService();

                                    lastProbabilityT = lastProbabilityT + 
                                            new Float(((Integer) 1).floatValue() / (timeSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesT.setProbability(new Float(
                                            ((Integer) 1).floatValue() / (timeSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesT.setTo(nextArcsT[h].getToNode());
                                    //transitToDevicesT.setFrom();
                                    timeSR.getTransit().add(transitToDevicesT);
                                    trovato = true;
                                    
                                    nextBools[h] = true;
                                }

                                else if(!(nextArcsT[h].getToNode().equals(openWorkload.getDepartsAt())) &&
                                   (getDevice(nextArcsT[h].getToNode()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                                        
                                    transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();

                                    //transitToDevicesT.setService();

                                    lastProbabilityT = lastProbabilityT + 
                                            new Float((actualPS.getTotalResources(nextArcsT[h].getToNode())) / (timeSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesT.setProbability(new Float(
                                            (actualPS.getTotalResources(nextArcsT[h].getToNode())) / (timeSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesT.setTo(nextArcsT[h].getToNode());
                                    //transitToDevicesT.setFrom();
                                    timeSR.getTransit().add(transitToDevicesT);

                                    nextBools[h] = true;
                                }
                                
                                transitToDevicesT = null;
                                h++;
                            }//while end
                                                        
                            int k = 0;
                            boolean found = false;
                            while((k < nextBools.length) && (!found)) {
                                if(nextBools[k] == false)
                                    found = true;
                                else
                                    k++;
                            }
                           
                            transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();

                            //transitToDevicesT.setService();

                            transitToDevicesT.setProbability(((float) 1) - lastProbabilityT);

                            transitToDevicesT.setTo(nextArcsT[k].getToNode());
                            //transitToDevicesT.setFrom();
                            timeSR.getTransit().add(transitToDevicesT);
                    }     
                    
                    serviceRequestTag.getTimeServiceRequest().add(timeSR);
                    break;

                case di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.FCFS:
                    //adds <WorkUnitServiceRequest> to <ServiceRequest>
                    WorkUnitServType workUnitSR = PmifSchemaFactoryImpl.eINSTANCE.createWorkUnitServType();

                    workUnitSR.setWorkloadName(actualPS.getScenarioName());
                    workUnitSR.setServerID(actualDevice.getDeviceName());
                    long longNumOfVisitsWU = new Float(actualPS.getTotalResources()[j]).longValue();
                    workUnitSR.setNumberOfVisits(BigInteger.valueOf(longNumOfVisitsWU));

                    float lastProbabilityWU = 0;
                    ArcType[] nextArcsWU = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), true);
                    
                    switch(nextArcsWU.length) {
                        case 1:
                            TransitType transitToOneDeviceWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToOneDeviceWU.setService();
                            
                            transitToOneDeviceWU.setProbability((float) 1.0);
                            
                            transitToOneDeviceWU.setTo(nextArcsWU[0].getToNode());
                            //transitToOneDeviceWU.setFrom();
                            workUnitSR.getTransit().add(transitToOneDeviceWU);
                            break;
                        
                        default:
                            
                            TransitType transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                            
                            String[] nextDevicesNames = new String[nextArcsWU.length];
                            for(int z = 0; z < nextArcsWU.length; z++) {
                                nextDevicesNames[z] = nextArcsWU[z].getToNode();
                            }
                            
                            boolean[] nextBools = new boolean[nextArcsWU.length];
                            int h = 0;
                            boolean trovato = false;
                            while(!terminated2(openWorkload, nextDevicesNames, nextBools)) {
                                if(nextArcsWU[h].getToNode().equals(openWorkload.getDepartsAt())) {
                                    
                                    transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                                    
                                    //transitToDevicesWU.setService();

                                    lastProbabilityWU = lastProbabilityWU + 
                                            new Float(((Integer) 1).floatValue() / (workUnitSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesWU.setProbability(new Float(
                                            ((Integer) 1).floatValue() / (workUnitSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesWU.setTo(nextArcsWU[h].getToNode());
                                    //transitToDevicesWU.setFrom();
                                    workUnitSR.getTransit().add(transitToDevicesWU);
                                    trovato = true;
                                    
                                    nextBools[h] = true;
                                }
                            
                                else if(!(nextArcsWU[h].getToNode().equals(openWorkload.getDepartsAt())) &&
                                   (getDevice(nextArcsWU[h].getToNode()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                                        
                                    transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();

                                    //transitToDevicesWU.setService();

                                    lastProbabilityWU = lastProbabilityWU + 
                                            new Float((actualPS.getTotalResources(nextArcsWU[h].getToNode())) / (workUnitSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesWU.setProbability(new Float(
                                            (actualPS.getTotalResources(nextArcsWU[h].getToNode())) / (workUnitSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesWU.setTo(nextArcsWU[h].getToNode());
                                    //transitToDevicesWU.setFrom();
                                    workUnitSR.getTransit().add(transitToDevicesWU);

                                    nextBools[h] = true;
                                }
                                
                                transitToDevicesWU = null;
                                h++;
                            }
                            
                            int k = 0;
                            boolean found = false;
                            while((k < nextBools.length) && (!found)) {
                                if(nextBools[k] == false)
                                    found = true;
                                else
                                    k++;
                            }
                           
                            transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();

                            //transitToDevicesWU.setService();

                            transitToDevicesWU.setProbability(((float) 1) - lastProbabilityWU);

                            transitToDevicesWU.setTo(nextArcsWU[k].getToNode());
                            //transitToDevicesWU.setFrom();
                            workUnitSR.getTransit().add(transitToDevicesWU);                     
                            
                    }                   
                    
                    serviceRequestTag.getWorkUnitServiceRequest().add(workUnitSR);
                    break;
            }
            
            bools[j] = true;
            j++;

            qnm.getServiceRequest().add(serviceRequestTag);
                    
        }
        
        // now, derives NumberOfVisits and <Transit> of the Devices with DeviceFeature = "NonFCFSDemandSpec"
        actualDevice = null;
        for(int k = 0; k < actualPS.getDevicesNames().length; k++) {
            actualDevice = getDevice(actualPS.getDevicesNames()[k]);
            if(actualDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC) {
                float lastNumberOfVisits = 0;
                int transitIndex = 0;
                boolean found = false;
                Object actualServiceRequest = null;
                for(int i = 0; i < qnm.getServiceRequest().size(); i++) {
                    actualServiceRequest = ((ServiceRequestType) qnm.getServiceRequest().get(i));
                    EList transitList = null;
                    TransitType actualTransit = null;
                        
                    EList timeSRList = ((ServiceRequestType) actualServiceRequest).getTimeServiceRequest();
                    TimeServType actualTimeSR = null;
                    for(int h = 0; h < timeSRList.size(); h++) {
                        actualTimeSR = (TimeServType) timeSRList.get(h);
                        
                        if((((TimeServType) actualTimeSR).getWorkloadName().equals(openWorkload.getWorkloadName())) && 
                           (getDevice(((TimeServType) actualTimeSR).getServerID()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                            transitIndex = 0;
                            found = false;
                            transitList = ((TimeServType) actualTimeSR).getTransit();
                            actualTransit = null;
                            while((transitIndex < transitList.size()) && (!found)) {
                                actualTransit = ((TransitType) transitList.get(transitIndex));
                                if(actualTransit.getTo().equals(actualDevice.getDeviceName())) {
                                    found = true;                                        
                                    lastNumberOfVisits = lastNumberOfVisits +
                                            new Float( actualTransit.getProbability() *
                                                       (((TimeServType) actualTimeSR).getNumberOfVisits().floatValue()) );
                                }
                                transitIndex++;
                            }
                        }
                    }
                    
                    EList workUnitSRList = ((ServiceRequestType) actualServiceRequest).getWorkUnitServiceRequest();
                    WorkUnitServType actualWorkUnitSR = null;
                    for(int h = 0; h < workUnitSRList.size(); h++) {
                        actualWorkUnitSR = (WorkUnitServType) workUnitSRList.get(h);
                        if((((WorkUnitServType) actualWorkUnitSR).getWorkloadName().equals(openWorkload.getWorkloadName())) && 
                           (getDevice(((WorkUnitServType) actualWorkUnitSR).getServerID()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                            transitIndex = 0;
                            found = false;
                            transitList = ((WorkUnitServType) actualWorkUnitSR).getTransit();
                            actualTransit = null;
                            while((transitIndex < transitList.size()) && (!found)) {
                                actualTransit = ((TransitType) transitList.get(transitIndex));
                                if(actualTransit.getTo().equals(actualDevice.getDeviceName())) {
                                    found = true;
                                    lastNumberOfVisits = lastNumberOfVisits +
                                            new Float( actualTransit.getProbability() *
                                                       (((WorkUnitServType) actualWorkUnitSR).getNumberOfVisits().floatValue()) );
                                }
                                transitIndex++;
                            }
                        }
                    }
                }
                
                DemandServType demandSR = PmifSchemaFactoryImpl.eINSTANCE.createDemandServType();

                demandSR.setWorkloadName(actualPS.getScenarioName());
                demandSR.setServerID(actualDevice.getDeviceName());
                demandSR.setTimeUnits(toTimeUnits(actualDevice.getServiceUnits()));
                
                java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
                java.math.MathContext mc = new java.math.MathContext(0, roundingMode);
                BigDecimal roundedNoVs = new BigDecimal(new Float(lastNumberOfVisits).longValue()).round(mc);
                BigInteger nov = roundedNoVs.toBigInteger();
                demandSR.setNumberOfVisits(roundedNoVs.toBigInteger());
                
                demandSR.setServiceDemand(new Float(actualDevice.getServiceTime() * (demandSR.getNumberOfVisits().floatValue())));
                
                TransitType transitToAdd = null;
                di.univaq.MOSQUITO.egQnMerger.EG.DeviceType nextDevice = null;
                ArcType[] nextArcs = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), true);
                for(int i = 0; i < nextArcs.length; i++) {
                    if(!(nextArcs[i].getToNode().equals(openWorkload.getDepartsAt()))) {
                        nextDevice = getDevice(nextArcs[i].getToNode());
                        
                        if((nextDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_TIME_SPEC) ||
                           (nextDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.FCFS)) {
                            
                            transitToAdd = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToAdd.setFrom(actualDevice.getDeviceName());
                            transitToAdd.setTo(nextDevice.getDeviceName());

                            ArcType[] nextDeviceNextArcs = getNextArcsQNM(qnm.getArc(), nextDevice.getDeviceName(), true);
                            int z = 0;
                            boolean trovato = false;
                            while((z < nextDeviceNextArcs.length) && (!trovato)) {
                                if(nextDeviceNextArcs[z].getToNode().equals(openWorkload.getDepartsAt()))
                                    trovato = true;
                                else
                                    z++;
                            }
                            if(trovato) {
                                transitToAdd.setProbability( new Float(((actualPS.getTotalResources(nextDevice.getDeviceName())) - 1) / (demandSR.getNumberOfVisits().floatValue())) );
                            }
                            else {
                                transitToAdd.setProbability( new Float((actualPS.getTotalResources(nextDevice.getDeviceName())) / (demandSR.getNumberOfVisits().floatValue())) );
                            }

                            //transitToAdd.setService());

                            demandSR.getTransit().add(transitToAdd);

                            transitToAdd = null;
                       }
                    }
                }
                         
                serviceRequestTag.getDemandServiceRequest().add(demandSR);
                
            }
            
        }        
        
        
        //adds <Transit> to each device d that is destination of the arc
        // ArrivesAt -> d
        TransitType transitToDevice = null;
        ArcType[] nextArcs = getNextArcsQNM(qnm.getArc(), openWorkload.getArrivesAt(), true);
        if(nextArcs.length == 1) {
            transitToDevice = PmifSchemaFactory.eINSTANCE.createTransitType();
            //transitToDevice.setService();
            //transitToDevice.setFrom(nextArcs[0].getFromNode());
            transitToDevice.setTo(nextArcs[0].getToNode());
            transitToDevice.setProbability((float) 1.0);
            openWorkload.getTransit().add(transitToDevice);
        }
        else {
            ArcType actualArc = null;
            for(int k = 0; k < nextArcs.length; k++) {
                actualArc = nextArcs[k];
                //if the actual arc is ArrivesAt -> d
                //      then adds <Transit To = d>
                transitToDevice = PmifSchemaFactory.eINSTANCE.createTransitType();
                //transitToDevice.setService();
                //transitToDevice.setFrom(actualArc.getFromNode());
                transitToDevice.setTo(actualArc.getToNode());

                int totalNumberOfVisits = getTotalNumberOfVisits(openWorkload.getWorkloadName(), serviceRequestTag);
                BigInteger actualNumberOfVisits = null;
                DemandServType actualDemandSR = null;
                for(int i = 0; i < serviceRequestTag.getDemandServiceRequest().size(); i++) {
                    actualDemandSR = (DemandServType) serviceRequestTag.getDemandServiceRequest().get(i);
                    if((actualDemandSR.getWorkloadName().equals(openWorkload.getWorkloadName())) &&
                       (actualDemandSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualDemandSR.getNumberOfVisits();
                        //float f = ((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits));
                        //transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }
                        else {
                        	transitToDevice.setProbability(new Float(actualNumberOfVisits.floatValue() / totalNumberOfVisits));
                        }
                        openWorkload.getTransit().add(transitToDevice);
                    }
                }

                TimeServType actualTimeSR = null;
                for(int i = 0; i < serviceRequestTag.getTimeServiceRequest().size(); i++) {
                    actualTimeSR = (TimeServType) serviceRequestTag.getTimeServiceRequest().get(i);
                    if((actualTimeSR.getWorkloadName().equals(openWorkload.getWorkloadName())) &&
                       (actualTimeSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualTimeSR.getNumberOfVisits();
                        //transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }
                        else {
                        	transitToDevice.setProbability(new Float(actualNumberOfVisits.floatValue() / totalNumberOfVisits));
                        }
                        openWorkload.getTransit().add(transitToDevice);
                    }
                }

                WorkUnitServType actualWorkUnitSR = null;
                for(int i = 0; i < serviceRequestTag.getWorkUnitServiceRequest().size(); i++) {
                    actualWorkUnitSR = (WorkUnitServType) serviceRequestTag.getWorkUnitServiceRequest().get(i);
                    if((actualWorkUnitSR.getWorkloadName().equals(openWorkload.getWorkloadName())) &&
                       (actualWorkUnitSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualWorkUnitSR.getNumberOfVisits();
                        //transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }else {
                        	transitToDevice.setProbability(new Float(actualNumberOfVisits.floatValue() / totalNumberOfVisits));
                        }
                        openWorkload.getTransit().add(transitToDevice);
                    }
                }
            }
        }
    }
    
    
    /** 
     * This method is used to fill the ServiceRequest tag in input with the
     * service requests of the closed workload in input, processing the actual
     * performance scenario.
     * @param actualPS The actual performance scenario must be processed.
     * @param closedWorkload The closed workload on wich actualPS is mapped.
     * @serviceRequestTag The ServiceRequest tag.
    **/
    private void createServiceRequests(di.univaq.MOSQUITO.egQnMerger.EG.PSType actualPS, ClosedWorkloadType closedWorkload, ServiceRequestType serviceRequestTag) throws DeviceNotFoundException {
        boolean[] bools = new boolean[actualPS.getTotalResources().length];
        di.univaq.MOSQUITO.egQnMerger.EG.DeviceType actualDevice = null;
        int j = 0;
        while(!terminated(actualPS.getDevicesNames(), bools)) {
            actualDevice = getDevice(actualPS.getDevicesNames()[j]);
            switch(actualDevice.getDeviceFeature().getValue()) {
                case di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_TIME_SPEC:
                    //adds <TimeServiceRequest> to <ServiceRequest>
                    TimeServType timeSR = PmifSchemaFactoryImpl.eINSTANCE.createTimeServType();

                    timeSR.setWorkloadName(actualPS.getScenarioName());
                    timeSR.setServerID(actualDevice.getDeviceName());
                    timeSR.setTimeUnits(toTimeUnits(actualDevice.getServiceUnits()));
                    long longNumOfVisitsT = new Float(actualPS.getTotalResources()[j]).longValue();
                    timeSR.setNumberOfVisits(BigInteger.valueOf(longNumOfVisitsT));
                    timeSR.setServiceTime(actualDevice.getServiceTime());
                    //timeSR.setService();            

                    /*
                    if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.FCFS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.FCFS_LITERAL);
                    }
                    else if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.IS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.IS_LITERAL);
                    }
                    else if(actualDevice.getSchedulingPolicy().getLiteral().equals(EG.SchedulingPolicyType.PS_LITERAL.getLiteral())) {
                        timeSR.setSchedulingPolicy(QNM.SchedulingType.PS_LITERAL);
                    }*/

                    float lastProbabilityT = 0;
                    ArcType[] nextArcsT = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), false);
                    
                    switch(nextArcsT.length) {
                        case 1:
                            TransitType transitToOneDeviceT = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToOneDevice.setService();
                            
                            transitToOneDeviceT.setProbability((float) 1.0);
                            
                            transitToOneDeviceT.setTo(nextArcsT[0].getToNode());
                            //transitToOneDevice.setFrom();
                            timeSR.getTransit().add(transitToOneDeviceT);
                            break;
                        
                        default:
                            TransitType transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();
                            
                            String[] nextDevicesNames = new String[nextArcsT.length];
                            for(int z = 0; z < nextArcsT.length; z++) {
                                nextDevicesNames[z] = nextArcsT[z].getToNode();
                            }
                            
                            boolean[] nextBools = new boolean[nextArcsT.length];
                            
                            int h = 0;
                            boolean trovato = false;
                            while(!terminated2(closedWorkload, nextDevicesNames, nextBools)
                                    /*(h < nextArcsT.length) && (!trovato)*/) {
                                if(nextArcsT[h].getToNode().equals(closedWorkload.getThinkDevice())) {
                                    
                                    transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();
                                    
                                    //transitToDevicesT.setService();

                                    lastProbabilityT = lastProbabilityT + 
                                            new Float(((Integer) 1).floatValue() / (timeSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesT.setProbability(new Float(((Integer) 1).floatValue() / (timeSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesT.setTo(nextArcsT[h].getToNode());
                                    //transitToDevicesT.setFrom();
                                    timeSR.getTransit().add(transitToDevicesT);
                                    trovato = true;
                                    
                                    nextBools[h] = true;
                                }

                                else if(!(nextArcsT[h].getToNode().equals(closedWorkload.getThinkDevice())) &&
                                   (getDevice(nextArcsT[h].getToNode()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                                        
                                    transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();

                                    //transitToDevicesT.setService();

                                    lastProbabilityT = lastProbabilityT + 
                                            new Float((actualPS.getTotalResources(nextArcsT[h].getToNode())) / (timeSR.getNumberOfVisits().floatValue()));
                                    transitToDevicesT.setProbability(new Float(
                                            (actualPS.getTotalResources(nextArcsT[h].getToNode())) / (timeSR.getNumberOfVisits().floatValue())));

                                    transitToDevicesT.setTo(nextArcsT[h].getToNode());
                                    //transitToDevicesT.setFrom();
                                    timeSR.getTransit().add(transitToDevicesT);

                                    nextBools[h] = true;
                                }
                                
                                transitToDevicesT = null;
                                h++;
                            }//while end
                                                        
                            int k = 0;
                            boolean found = false;
                            while((k < nextBools.length) && (!found)) {
                                if(nextBools[k] == false)
                                    found = true;
                                else
                                    k++;
                            }
                            // modifica aggiunta in attesa di chiariamnti da Davide
                           /*if(k>=nextBools.length)
                        	   k = nextBools.length-1;*/
                           
                            transitToDevicesT = PmifSchemaFactory.eINSTANCE.createTransitType();

                            //transitToDevicesT.setService();

                            transitToDevicesT.setProbability(((float) 1) - lastProbabilityT);
                            //System.out.println(" arrivato " + nextArcsT.length);
                           // System.out.println("------> " + nextArcsT[k].getToNode());
                            transitToDevicesT.setTo(nextArcsT[k].getToNode());
                            //transitToDevicesT.setFrom();
                            timeSR.getTransit().add(transitToDevicesT);
                    }     
                    
                    serviceRequestTag.getTimeServiceRequest().add(timeSR);
                    break;

                case di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.FCFS:
                    //adds <WorkUnitServiceRequest> to <ServiceRequest>
                    WorkUnitServType workUnitSR = PmifSchemaFactoryImpl.eINSTANCE.createWorkUnitServType();

                    workUnitSR.setWorkloadName(actualPS.getScenarioName());
                    workUnitSR.setServerID(actualDevice.getDeviceName());
                    long longNumOfVisitsWU = new Float(actualPS.getTotalResources()[j]).longValue();
                    workUnitSR.setNumberOfVisits(BigInteger.valueOf(longNumOfVisitsWU));

                    float lastProbabilityWU = 0;
                   // System.out.println("----> Devices name " + actualDevice.getDeviceName());
                    ArcType[] nextArcsWU = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), false);
                    
                    switch(nextArcsWU.length) {
                        case 1:
                            TransitType transitToOneDeviceWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToOneDeviceWU.setService();
                            
                            transitToOneDeviceWU.setProbability((float) 1.0);
                            
                            transitToOneDeviceWU.setTo(nextArcsWU[0].getToNode());
                            //transitToOneDeviceWU.setFrom();
                            workUnitSR.getTransit().add(transitToOneDeviceWU);
                            break;
                        
                        default:
                            
                            TransitType transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                            
                            String[] nextDevicesNames = new String[nextArcsWU.length];
                            for(int z = 0; z < nextArcsWU.length; z++) {
                                nextDevicesNames[z] = nextArcsWU[z].getToNode();
                            }
                            
                            
                            //System.out.println("Lunghezza vettore booleano "  + nextArcsWU.length);
                            boolean[] nextBools = new boolean[nextArcsWU.length];
                            int h = 0;
                            boolean trovato = false;
                            while(!terminated2(closedWorkload, nextDevicesNames, nextBools)) {
                                if(nextArcsWU[h].getToNode().equals(closedWorkload.getThinkDevice())) {
                                	//System.out.println("primo caso ");
                                    transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();
                                    
                                    //transitToDevicesWU.setService();

                                    lastProbabilityWU = lastProbabilityWU + 
                                            new Float(((Integer) 1).floatValue() / (workUnitSR.getNumberOfVisits().floatValue()));
                                   
                                    if(workUnitSR.getNumberOfVisits().floatValue() == 0) {
                                    	transitToDevicesWU.setProbability(new Float(0));
                                    }else {
                                        transitToDevicesWU.setProbability(new Float(
                                            ((Integer) 1).floatValue() / (workUnitSR.getNumberOfVisits().floatValue())));
                                    }
                                    transitToDevicesWU.setTo(nextArcsWU[h].getToNode());
                                    //transitToDevicesWU.setFrom();
                                    workUnitSR.getTransit().add(transitToDevicesWU);
                                    trovato = true;
                                    
                                    nextBools[h] = true;
                                }
                            
                                else if(!(nextArcsWU[h].getToNode().equals(closedWorkload.getThinkDevice())) &&
                                   (getDevice(nextArcsWU[h].getToNode()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                                      //  System.out.println("secondo caso ");
                                    transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();

                                    //transitToDevicesWU.setService();

                                    lastProbabilityWU = lastProbabilityWU + 
                                            new Float((actualPS.getTotalResources(nextArcsWU[h].getToNode())) / (workUnitSR.getNumberOfVisits().floatValue()));
                                    
                                    if(workUnitSR.getNumberOfVisits().floatValue()==0) {
                                    	transitToDevicesWU.setProbability(new Float(0));
                                    } else {
                                    	transitToDevicesWU.setProbability(new Float(
                                            (actualPS.getTotalResources(nextArcsWU[h].getToNode())) / (workUnitSR.getNumberOfVisits().floatValue())));
                                    }
                                    transitToDevicesWU.setTo(nextArcsWU[h].getToNode());
                                    //transitToDevicesWU.setFrom();
                                    workUnitSR.getTransit().add(transitToDevicesWU);

                                    nextBools[h] = true;
                                }
                                
                                transitToDevicesWU = null;
                                h++;
                            }
                            
                            int k = 0;
                            boolean found = false;
                            while((k < nextBools.length) && (!found)) {
                                if(nextBools[k] == false)
                                    found = true;
                                else
                                    k++;
                            }
                            
                            // modifica aggiunta in attesa di chiarimanti da Davide 
                            /*if(k>=nextBools.length)
                         	   k = nextBools.length-1;*/
                            
                            transitToDevicesWU = PmifSchemaFactory.eINSTANCE.createTransitType();

                            //transitToDevicesWU.setService();

                            transitToDevicesWU.setProbability(((float) 1) - lastProbabilityWU);

                            transitToDevicesWU.setTo(nextArcsWU[k].getToNode());
                            //transitToDevicesWU.setFrom();
                            workUnitSR.getTransit().add(transitToDevicesWU);                     
                    }                   
                    
                    serviceRequestTag.getWorkUnitServiceRequest().add(workUnitSR);
                    break;
            }
            
            bools[j] = true;
            j++;

            qnm.getServiceRequest().add(serviceRequestTag);
                    
        }
        
        // now, derives NumberOfVisits and <Transit> of the Devices with DeviceFeature = "NonFCFSDemandSpec"
        actualDevice = null;
        for(int k = 0; k < actualPS.getDevicesNames().length; k++) {
            actualDevice = getDevice(actualPS.getDevicesNames()[k]);
            if(actualDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC) {
                float lastNumberOfVisits = 0;
                int transitIndex = 0;
                boolean found = false;
                Object actualServiceRequest = null;
                for(int i = 0; i < qnm.getServiceRequest().size(); i++) {
                    actualServiceRequest = ((ServiceRequestType) qnm.getServiceRequest().get(i));
                    EList transitList = null;
                    TransitType actualTransit = null;
                        
                    EList timeSRList = ((ServiceRequestType) actualServiceRequest).getTimeServiceRequest();
                    TimeServType actualTimeSR = null;
                    for(int h = 0; h < timeSRList.size(); h++) {
                        actualTimeSR = (TimeServType) timeSRList.get(h);
                        
                        if((((TimeServType) actualTimeSR).getWorkloadName().equals(closedWorkload.getWorkloadName())) && 
                           (getDevice(((TimeServType) actualTimeSR).getServerID()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                            transitIndex = 0;
                            found = false;
                            transitList = ((TimeServType) actualTimeSR).getTransit();
                            actualTransit = null;
                            while((transitIndex < transitList.size()) && (!found)) {
                                actualTransit = ((TransitType) transitList.get(transitIndex));
                                if(actualTransit.getTo().equals(actualDevice.getDeviceName())) {
                                    found = true;                                        
                                    lastNumberOfVisits = lastNumberOfVisits +
                                            new Float( actualTransit.getProbability() *
                                                       (((TimeServType) actualTimeSR).getNumberOfVisits().floatValue()) );
                                }
                                transitIndex++;
                            }
                        }
                    }
                    
                    EList workUnitSRList = ((ServiceRequestType) actualServiceRequest).getWorkUnitServiceRequest();
                    WorkUnitServType actualWorkUnitSR = null;
                    for(int h = 0; h < workUnitSRList.size(); h++) {
                        actualWorkUnitSR = (WorkUnitServType) workUnitSRList.get(h);
                        if((((WorkUnitServType) actualWorkUnitSR).getWorkloadName().equals(closedWorkload.getWorkloadName())) && 
                           (getDevice(((WorkUnitServType) actualWorkUnitSR).getServerID()).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                            transitIndex = 0;
                            found = false;
                            transitList = ((WorkUnitServType) actualWorkUnitSR).getTransit();
                            actualTransit = null;
                            while((transitIndex < transitList.size()) && (!found)) {
                                actualTransit = ((TransitType) transitList.get(transitIndex));
                                if(actualTransit.getTo().equals(actualDevice.getDeviceName())) {
                                    found = true;
                                    lastNumberOfVisits = lastNumberOfVisits +
                                            new Float( actualTransit.getProbability() *
                                                       (((WorkUnitServType) actualWorkUnitSR).getNumberOfVisits().floatValue()) );
                                }
                                transitIndex++;
                            }
                        }
                    }
                }
                
                DemandServType demandSR = PmifSchemaFactoryImpl.eINSTANCE.createDemandServType();

                demandSR.setWorkloadName(actualPS.getScenarioName());
                demandSR.setServerID(actualDevice.getDeviceName());
                demandSR.setTimeUnits(toTimeUnits(actualDevice.getServiceUnits()));
                
                java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
                java.math.MathContext mc = new java.math.MathContext(0, roundingMode);
                BigDecimal roundedNoVs = new BigDecimal(new Float(lastNumberOfVisits).longValue()).round(mc);
                BigInteger nov = roundedNoVs.toBigInteger();
                demandSR.setNumberOfVisits(roundedNoVs.toBigInteger());
                
                demandSR.setServiceDemand(new Float(actualDevice.getServiceTime() * (demandSR.getNumberOfVisits().floatValue())));
                
                TransitType transitToAdd = null;
                di.univaq.MOSQUITO.egQnMerger.EG.DeviceType nextDevice = null;
                ArcType[] nextArcs = getNextArcsQNM(qnm.getArc(), actualDevice.getDeviceName(), false);
                for(int i = 0; i < nextArcs.length; i++) {
                    //if(!(nextArcs[i].getToNode().equals(closedWorkload.getThinkDevice()))) {
                        nextDevice = getDevice(nextArcs[i].getToNode());
                        
                        if((nextDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_TIME_SPEC) ||
                           (nextDevice.getDeviceFeature().getValue() == di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.FCFS)) {
                            
                            transitToAdd = PmifSchemaFactory.eINSTANCE.createTransitType();
                            //transitToAdd.setFrom(actualDevice.getDeviceName());
                            transitToAdd.setTo(nextDevice.getDeviceName());

                            /*
                            QNM.ArcType[] nextDeviceNextArcs = getNextArcsQNM(qnm.getArc(), nextDevice.getDeviceName());
                            int z = 0;
                            boolean trovato = false;
                            while((z < nextDeviceNextArcs.length) && (!trovato)) {
                                if(nextDeviceNextArcs[z].getToNode().equals(closedWorkload.getThinkDevice()))
                                    trovato = true;
                                else
                                    z++;
                            }
                            if(trovato) {
                                transitToAdd.setProbability( new Float(((actualPS.getTotalResources(nextDevice.getDeviceName())) - 1) / (demandSR.getNumberOfVisits().floatValue())) );
                            }
                            else {
                                transitToAdd.setProbability( new Float((actualPS.getTotalResources(nextDevice.getDeviceName())) / (demandSR.getNumberOfVisits().floatValue())) );
                            }
                            */
                            
                            if(demandSR.getNumberOfVisits().floatValue() == 0) {
                            	transitToAdd.setProbability( new Float(0));
                            }else { 
                               transitToAdd.setProbability( new Float((actualPS.getTotalResources(nextDevice.getDeviceName())) / (demandSR.getNumberOfVisits().floatValue())) );
                            }
                            //transitToAdd.setService());

                            demandSR.getTransit().add(transitToAdd);

                            transitToAdd = null;
                       }
                    //}
                }
                         
                serviceRequestTag.getDemandServiceRequest().add(demandSR);
                
            }
            
        }        
        
        
        //adds <Transit> to each device d that is destination of the arc
        // ArrivesAt -> d
        TransitType transitToDevice = null;
        ArcType[] nextArcs = getNextArcsQNM(qnm.getArc(), closedWorkload.getThinkDevice(), false);
        if(nextArcs.length == 1) {
            transitToDevice = PmifSchemaFactory.eINSTANCE.createTransitType();
            //transitToDevice.setService();
            //transitToDevice.setFrom(nextArcs[0].getFromNode());
            transitToDevice.setTo(nextArcs[0].getToNode());
            transitToDevice.setProbability((float) 1.0);
            closedWorkload.getTransit().add(transitToDevice);
        }
        else {
            ArcType actualArc = null;
            for(int k = 0; k < nextArcs.length; k++) {
                actualArc = nextArcs[k];
                //if the actual arc is ArrivesAt -> d
                //      then adds <Transit To = d>
                transitToDevice = PmifSchemaFactory.eINSTANCE.createTransitType();
                //transitToDevice.setService();
                //transitToDevice.setFrom(actualArc.getFromNode());
                transitToDevice.setTo(actualArc.getToNode());

                int totalNumberOfVisits = getTotalNumberOfVisits(closedWorkload.getWorkloadName(), serviceRequestTag);
                BigInteger actualNumberOfVisits = null;
                DemandServType actualDemandSR = null;
                for(int i = 0; i < serviceRequestTag.getDemandServiceRequest().size(); i++) {
                    actualDemandSR = (DemandServType) serviceRequestTag.getDemandServiceRequest().get(i);
                    if((actualDemandSR.getWorkloadName().equals(closedWorkload.getWorkloadName())) &&
                       (actualDemandSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualDemandSR.getNumberOfVisits();
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }else {
                        	transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());	
                        }
                        
                        closedWorkload.getTransit().add(transitToDevice);
                    }
                }

                TimeServType actualTimeSR = null;
                for(int i = 0; i < serviceRequestTag.getTimeServiceRequest().size(); i++) {
                    actualTimeSR = (TimeServType) serviceRequestTag.getTimeServiceRequest().get(i);
                    if((actualTimeSR.getWorkloadName().equals(closedWorkload.getWorkloadName())) &&
                       (actualTimeSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualTimeSR.getNumberOfVisits();
                        
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }else {
                        	transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());
                        }
                        closedWorkload.getTransit().add(transitToDevice);
                    }
                }

                WorkUnitServType actualWorkUnitSR = null;
                for(int i = 0; i < serviceRequestTag.getWorkUnitServiceRequest().size(); i++) {
                    actualWorkUnitSR = (WorkUnitServType) serviceRequestTag.getWorkUnitServiceRequest().get(i);
                    if((actualWorkUnitSR.getWorkloadName().equals(closedWorkload.getWorkloadName())) &&
                       (actualWorkUnitSR.getServerID().equals(transitToDevice.getTo()))) {
                        actualNumberOfVisits = actualWorkUnitSR.getNumberOfVisits();
                        if(totalNumberOfVisits == 0) {
                        	transitToDevice.setProbability(new Float(0));
                        }else {
                        	transitToDevice.setProbability(new Float((actualNumberOfVisits.floatValue()) / (totalNumberOfVisits)).floatValue());
                        }
                        closedWorkload.getTransit().add(transitToDevice);
                    }
                }
            }
        }
    }
    
    
    /**
     * This method is used to understand if remains only the Devices that
     * require DemandServiceRequests.
     * @param devicesNames The devices names.
     * @param bools An array of booleans that has a 1 to 1 relation with
     *              the devices names array.
     * @return true if all the devices that require TimeServiceRequest or
     *         WorkUnitServiceRequest have 1 in the booleans array.
    **/
    private boolean terminated(String[] devicesNames, boolean[] bools) throws DeviceNotFoundException {
        int i = 0;
        boolean found = false;
        while((i < bools.length) && (!found)) {
            if((bools[i] == false) &&
               (getDevice(devicesNames[i]).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)) {
                    return false;
            }
        
            i++;
        }
        return true;
    }
    
    
    /**
     * This method is the same of terminated but is adapted for an open workload.
     * @param openWorkload The open workload must be processed.
     * @param devicesNames The devices names.
     * @param bools An array of booleans that has a 1 to 1 relation with
     *              the devices names array.
     * @return true if all the devices that require TimeServiceRequest or
     *         WorkUnitServiceRequest have 1 in the booleans array.
    **/
    private boolean terminated2(OpenWorkloadType openWorkload, String[] devicesNames, boolean[] bools) throws DeviceNotFoundException {
        int i = 0;
        boolean found = false;
        while((i < bools.length) && (!found)) {
            if((bools[i] == false) && 
               (((devicesNames[i].equals(openWorkload.getArrivesAt())) ||
                (devicesNames[i].equals(openWorkload.getDepartsAt())) ||
                (getDevice(devicesNames[i]).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)))) {
                    return false;
            }
            i++;
        }
        return true;
    }
    
    
    /**
     * This method is the same of terminated but is adapted for a closed workload.
     * @param closedWorkload The closed workload must be processed.
     * @param devicesNames The devices names.
     * @param bools An array of booleans that has a 1 to 1 relation with
     *              the devices names array.
     * @return true if all the devices that require TimeServiceRequest or
     *         WorkUnitServiceRequest have 1 in the booleans array.
    **/
    private boolean terminated2(ClosedWorkloadType closedWorkload, String[] devicesNames, boolean[] bools) throws DeviceNotFoundException {
        int i = 0;
        boolean found = false;
        while((i < bools.length) && (!found)) {
            if((bools[i] == false) && 
               (((devicesNames[i].equals(closedWorkload.getThinkTime())) ||
                (getDevice(devicesNames[i]).getDeviceFeature().getValue() != di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType.NON_FCFS_DEMAND_SPEC)))) {
                    return false;
            }
            i++;
        }
        return true;
    }
    
    
    /**
     * This method is used to get an array of ArcType Objects that contains
     * the arcs in the arcList that are outing from the last destination node.
     * @param arcList The arc list.
     * @param lastDestination The last node reached.
     * @return A QNM.ArcType[] containing the compatible arcs.
    **/
    private static ArcType[] getNextArcsQNM(EList arcList, String lastDestination, boolean isAnOpenWorkload) {
        ArcType[] matchingArcs = null;
        int count = 0;
        if(isAnOpenWorkload) {
        	System.out.println("rete aperta");
            for(int i = 0; i < arcList.size(); i++) {
                if(((ArcType) arcList.get(i)).getFromNode().equals(lastDestination)) count++;
            }
            if(count > 0) {
                matchingArcs = new ArcType[count];
                int j = 0;
                for(int i = 0; i < arcList.size(); i++) {
                    if(((ArcType) arcList.get(i)).getFromNode().equals(lastDestination)) {
                        matchingArcs[j] = ((ArcType) arcList.get(i));
                        j++;
                    }
                }
            }
        }
        else {
        	//System.out.println("rete chiusa");
            for(int i = 0; i < arcList.size(); i++) {
                if(((ArcType) arcList.get(i)).getFromNode().equals(lastDestination) && !((ArcType) arcList.get(i)).getToNode().equals("Fini"))
                    count++;
            }
            if(count > 0) {
                matchingArcs = new ArcType[count];
                //System.out.println("Lunghezza vettore " + count);
                int j = 0;
                for(int i = 0; i < arcList.size(); i++) {
                    if(((ArcType) arcList.get(i)).getFromNode().equals(lastDestination) &&
                       !((ArcType) arcList.get(i)).getToNode().equals("Fini")) {
                        matchingArcs[j] = ((ArcType) arcList.get(i));
                        j++;
                    }
                }
            }
        }          
            
        return matchingArcs;
        
    }
    
    
    /**
     * This method is used to get an array of ArcType Objects that contains
     * the arcs in the arcList that are entering the last destination node.
     * @param arcList The arc list.
     * @param lastDestination The last node reached.
     * @return A QNM.ArcType[] containing the compatible arcs.
    **/
    private static ArcType[] getPredArcsQNM(EList arcList, String lastDestination) {
        ArcType[] matchingArcs = null;
        int count = 0;
        for(int i = 0; i < arcList.size(); i++) {
            if(((ArcType) arcList.get(i)).getToNode().equals(lastDestination)) count++;
        }
        if(count > 0) {
            matchingArcs = new ArcType[count];
            int j = 0;
            for(int i = 0; i < arcList.size(); i++) {
                if(((ArcType) arcList.get(i)).getToNode().equals(lastDestination)) {
                    matchingArcs[j] = ((ArcType) arcList.get(i));
                    j++;
                }
            }
        }
        return matchingArcs;
        
    }
    
    
    /**
     * This method is to get the total number of visits on the servers in the QNM.
     * @param workloadName The workload of wich we are searching
     *                     the total number of visits.
     * @param serviceRequests The ServiceRequestTag.
     * @return The total number of visits for the workload.
    **/
    private int getTotalNumberOfVisits(String workloadName, ServiceRequestType serviceRequests) {
        int totalNumberOfVisits = 0;
        
        DemandServType actualDemandSR = null;
        for(int i = 0; i < serviceRequests.getDemandServiceRequest().size(); i++) {
            actualDemandSR = (DemandServType) serviceRequests.getDemandServiceRequest().get(i);
            if(actualDemandSR.getWorkloadName().equals(workloadName)) {
                totalNumberOfVisits = totalNumberOfVisits + actualDemandSR.getNumberOfVisits().intValue();
            }
        }
        
        TimeServType actualTimeSR = null;
        for(int i = 0; i < serviceRequests.getTimeServiceRequest().size(); i++) {
            actualTimeSR = (TimeServType) serviceRequests.getTimeServiceRequest().get(i);
            if(actualTimeSR.getWorkloadName().equals(workloadName)) {
                totalNumberOfVisits = totalNumberOfVisits + actualTimeSR.getNumberOfVisits().intValue();
            }
        }
        
        WorkUnitServType actualWorkUnitSR = null;
        for(int i = 0; i < serviceRequests.getWorkUnitServiceRequest().size(); i++) {
            actualWorkUnitSR = (WorkUnitServType) serviceRequests.getWorkUnitServiceRequest().get(i);
            if(actualWorkUnitSR.getWorkloadName().equals(workloadName)) {
                totalNumberOfVisits = totalNumberOfVisits + actualWorkUnitSR.getNumberOfVisits().intValue();
            }
        }
        
        return totalNumberOfVisits;
    }
    
    
    /**
     * This method is used to convert a String in the corresponding TimeUnitsType.
     * @param timeUnitsString The String to convert.
     * @return The TimeUnitsType corresponding to timeUnitsString.
    **/
    private TimeUnitsType toTimeUnits(String timeUnitsString) {
        if(timeUnitsString.equals(TimeUnitsType.DAY1_LITERAL.getName())) {
            return TimeUnitsType.DAY1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.DAY_LITERAL.getName())) {
            return TimeUnitsType.DAY_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.HR1_LITERAL.getName())) {
            return TimeUnitsType.HR1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.HR_LITERAL.getName())) {
            return TimeUnitsType.HR_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.MIN1_LITERAL.getName())) {
            return TimeUnitsType.MIN1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.MIN_LITERAL.getName())) {
            return TimeUnitsType.MIN_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.MS1_LITERAL.getName())) {
            return TimeUnitsType.MS1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.MS_LITERAL.getName())) {
            return TimeUnitsType.MS_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.NS1_LITERAL.getName())) {
            return TimeUnitsType.NS1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.NS_LITERAL.getName())) {
            return TimeUnitsType.NS_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.SEC1_LITERAL.getName())) {
            return TimeUnitsType.SEC1_LITERAL;
        }
        else if(timeUnitsString.equals(TimeUnitsType.SEC_LITERAL.getName())) {
            return TimeUnitsType.SEC_LITERAL;
        }
        
        return null;
    }
    
    
    /**
     * This method is used to add a float value to a float array.
     * @param units The float array.
     * @param value The float value to add.
     * @return A new float[] with the added float value.
    **/
    private static float[] addToArray(float[] units, float value) {
        if(units == null) {
            return new float[] {value};
        }
        float[] newUnits = new float[units.length + 1];
        for(int i = 0; i < units.length; i++) {
            newUnits[i] = units[i];
        }
        newUnits[newUnits.length - 1] = value;
        return newUnits;
    }
    
    /**
     * This method is used to add a String to a String array.
     * @param units The String array.
     * @param value The String to add.
     * @return A new String[] with the added String.
    **/
    private static String[] addToArray(String[] units, String value) {
        if(units == null) {
            return new String[] {value};
        }
        String[] newUnits = new String[units.length + 1];
        for(int i = 0; i < units.length; i++) {
            newUnits[i] = units[i];
        }
        newUnits[newUnits.length - 1] = value;
        return newUnits;
    }
    
    /**
     * This method is used to multiply a float array with a float value.
     * @param units The float array.
     * @param value The float to add.
     * @return A new float[] with the multiplied values.
    **/
    private static float[] multArray(float[] array, float value) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * value;
        }
        return array;
    }
    
    /**
     * This method is used to add a float array to an another float array.
     * @param array The first array.
     * @param arrayToSum The float[] to add.
     * @return A new float[] with the added arrayToSum.
    **/
    private static float[] sumArrays(float[] array, float[] arrayToSum) throws GenericException {
        float[] newArray = new float[array.length];
        if(array.length == arrayToSum.length) {
            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i] + arrayToSum[i];
            }
            return newArray;
      
        }
        
        
        throw new GenericException();
        
    }
    
    /**
     * This method is used to add the elements of a float array.
     * @param array The array.
     * @return The sum of a float array's elements.
    **/
    private static float sumArrayElements(float[] array) {
        float sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    
    /**
     * This method acquires and reduces all the performance scenarios in the project
     * and parametrizes the QNM.
    **/
    public void parametrize() throws CannotDeriveQNMWorkloadTypeException, IOException, PerformanceScenarioNotFoundException, ExecutionGraphNotFoundException, DeviceNotFoundException, PartnerNotFoundException, StartNodeNotFoundException, NodeNotFoundException, GenericException, MyFileNotFoundException {
        EList psl = project.getPerformanceScenario();
        for(int i = 0; i < psl.size(); i++) {
            float[] actualPSResources = acquireAndReducePS((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i));
        }
        
        processModel();
    }
   
    /**
     * This method is used for parametrizing without a graphical interface.
     * @param projectFile The absolute path of the file containing the project.
     * @param qnmFile The absolute path of the file containing the QNM.
     **/
    public void parametrize(String projectFile, String qnmFile) {
        try {
            DocumentProcessor dp = new DocumentProcessor(projectFile, qnmFile);
            dp.parametrize();
            dp.print();
        } catch(Exception e) {
        	e.printStackTrace();
            //System.out.println(e.getMessage());
        }          
    }
    
    /**
     * This method is used to print all the information about the project,
     * the devices, the processing overhead and the parametrized QNM.
     **/
    public void print() {
        try {
            System.out.println("\nProjectName: " + projectDocRoot.getProject().getProjectName());
            System.out.println("-----------------------------------");
            System.out.println("Overhead");
            System.out.println("\tSoftwareResources");

            di.univaq.MOSQUITO.egQnMerger.EG.ProcessingOverheadType pot = project.getProcessingOverhead();
            di.univaq.MOSQUITO.egQnMerger.EG.SoftwareResourcesType srt = pot.getSoftwareResources();
            EList srl = srt.getSoftwareResource();
            for (int i = 0; i < srl.size(); i++) {
                System.out.println("\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.SoftwareResourceType) srt.getSoftwareResource().get(i)).getResourceName());
            }

            System.out.println();
            System.out.println("\tDevices (" + project.getProcessingOverhead().getDevices().getDevice().size() + ")");
            di.univaq.MOSQUITO.egQnMerger.EG.DevicesType dt = pot.getDevices();
            EList dl = dt.getDevice();
            for (int i = 0; i < dl.size(); i++) {
                System.out.println("\t\tDevice " + (i + 1));
                System.out.println("\t\t\tDeviceName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getDeviceName());
                System.out.println("\t\t\tDeviceFeature: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getDeviceFeature().getName());
                System.out.println("\t\t\tQuantity: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getQuantity());
                System.out.println("\t\t\tSchedulingPolicy: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getSchedulingPolicy().getName());
                System.out.println("\t\t\tServiceTime: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getServiceTime());
                System.out.println("\t\t\tServiceUnits: " + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) dt.getDevice().get(i)).getServiceUnits());
            }

            System.out.println("\n\tOverheadMatrix (" + dl.size() + 
                    " Devices x " + srl.size() + " SoftwareResources)");
            di.univaq.MOSQUITO.egQnMerger.EG.OverheadMatrixType omt = pot.getOverheadMatrix();
            EList oml = omt.getOMElement();
            for(int i = 0; i < oml.size(); i++) {
                System.out.println("\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.OMElementType)omt.getOMElement().get(i)).toString() + "\t");                
            }

            System.out.println("Scenarios (" + project.getPerformanceScenario().size() + ")");
            EList psl = project.getPerformanceScenario();
            for(int i = 0; i < psl.size(); i++) {
                System.out.println("\tScenario " + (i + 1));
                System.out.println("\t\tScenarioName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getScenarioName());
                System.out.println("\t\tInterArrivalTime: " + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getInterarrivalTime());
                System.out.println("\t\tNumberOfJobs: " + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getNumberOfJobs());
                System.out.println("\t\tPriority: " + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getPriority());
                System.out.println("\t\tSWModelFileName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getSWmodelfilename());

                // riduce lo scenario e ne stampa le risorse totali
                    System.out.println("\t\tTotalComputerResources: ");
                float[] actualPSResources = null;
                
                actualPSResources = acquireAndReducePS((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i));
                actualPSResources = ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getTotalResources();
                    for(int h = 0; h < actualPSResources.length; h++) {
                        System.out.print("\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                        System.out.println(actualPSResources[h]);
                    }

                System.out.println("\t\tEGs (" + ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getExecutionGraph().size() + "):");
                EList egl = ((di.univaq.MOSQUITO.egQnMerger.EG.PSType) psl.get(i)).getExecutionGraph();
                for(int j = 0; j < egl.size(); j++) {
                    System.out.println("\t\t\tEGName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getEGname());
                    System.out.println("\t\t\tStartNode: " + ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getStartNode());
                    System.out.println("\t\t\tisMainEG: " + ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).isIsMainEG());
                    System.out.println("\t\t\tmodificationDateTime: " + ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getModificationDateTime());
                    System.out.println("\t\t\tSWModelName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getSWmodelname());

                    acquireGraph(((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).eContents());

                    // riduce il grafo e ne stampa le risorse totali
                    System.out.println("\t\t\tTotalComputerResources: ");
                    float[] actualEGResources;
                    actualEGResources = reduceGraph((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j));
                    for(int h = 0; h < actualEGResources.length; h++) {
                        System.out.print("\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                        System.out.println(actualEGResources[h]);
                    }
                    
                    int numOfNodes = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getBasicNode().size() + 
                                        ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getCompoundNode().size() +
                                        ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getExpandedNode().size() + 
                                        ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getLinkNode().size() +
                                        ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getSynchronizationNode().size();
                    System.out.println("\t\t\tNodes (" + numOfNodes + "):");
                    EList nl = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getBasicNode();
                    for(int k = 0; k < ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getBasicNode().size(); k++) {
                        System.out.println("\t\t\t\tBasicNode #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl.get(k)).getNodeName());     
                        System.out.println("\t\t\t\t\tTotalComputerResources:");
                        float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl.get(k)).getTotalResources();
                        for(int h = 0; h < actualNodeResources.length; h++) {
                            System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                            System.out.println(actualNodeResources[h]);
                        }
                    }                             

                    nl = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getCompoundNode();

                    for(int k = 0; k < ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getCompoundNode().size(); k++) {
                        basePrint((di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType) nl.get(k));              
                    }
                    nl = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getExpandedNode();
                    for(int k = 0; k < ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getExpandedNode().size(); k++) {
                        System.out.println("\t\t\t\tExpandedNode #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl.get(k)).getNodeName());

                        System.out.println("\t\t\t\t\tTotalComputerResources:");
                        float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl.get(k)).getDerivedResources();
                        if(actualNodeResources != null) {
                            for(int h = 0; h < actualNodeResources.length; h++) {
                                System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                                System.out.println(actualNodeResources[h]);
                            }
                        }
                    }
                    nl = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getLinkNode();
                    for(int k = 0; k < ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getLinkNode().size(); k++) {
                        System.out.println("\t\t\t\tLinkNode #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl.get(k)).getNodeName());

                        System.out.println("\t\t\t\t\tTotalComputerResources:");
                        float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl.get(k)).getDerivedResources();
                        if(actualNodeResources != null) {
                            for(int h = 0; h < actualNodeResources.length; h++) {
                                System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                                System.out.println(actualNodeResources[h]);
                            }
                        }
                    }
                    nl = ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getSynchronizationNode();
                    for(int k = 0; k < ((di.univaq.MOSQUITO.egQnMerger.EG.EGType) egl.get(j)).getSynchronizationNode().size(); k++) {
                        System.out.println("\t\t\t\tSynchronizationNode #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl.get(k)).getNodeName());

                        System.out.println("\t\t\t\t\tTotalComputerResources:");
                        float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl.get(k)).getTotalResources();
                        for(int h = 0; h < actualNodeResources.length; h++) {
                            System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) pot.getDevices().getDevice().get(h)).getDeviceName() + ": ");
                            System.out.println(actualNodeResources[h]);
                        }

                    }

                }

            }
        
            System.out.println("\n\nQNMName: " + qnmDocRoot.getQueueingNetworkModel().getName());
            System.out.println("-----------------------------------");
            EList qnmTagNodeList = qnm.getNode();
            System.out.println("\tNodes (" + qnmTagNodeList.size() + "):\n");
            EList serverList = null;
            EList workUnitServerList = null;
            EList sourceNodeList = null;
            EList sinkNodeList = null;
            NodeType actualTagNode = null;
            for (int i = 0; i < qnmTagNodeList.size(); i++) {
                actualTagNode = (NodeType) qnmTagNodeList.get(i);
                serverList = actualTagNode.getServer();
                System.out.println("\t\tServers (" + serverList.size() + "):");
                ServerType actualServer = null;
                for(int j = 0; j < serverList.size(); j++) {
                    actualServer = (ServerType) serverList.get(j);
                    System.out.println("\t\t\tServer #" + (j + 1) + " :");
                    System.out.println("\t\t\t\tName: " + actualServer.getName());
                    System.out.println("\t\t\t\tQuantity: " + actualServer.getQuantity());

                    EList actualServerQueueList = actualServer.getQueue();
                    System.out.println("\t\t\t\tQueues (" + actualServerQueueList.size() + "):");
                    QueueType actualQueue = null;
                    for(int k = 0; k < actualServerQueueList.size(); k++) {
                        actualQueue = (QueueType) actualServerQueueList.get(k);
                        System.out.println("\t\t\t\t\tQueue #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\tName:" + actualQueue.getName());
                        System.out.println("\t\t\t\t\t\tCapacity:" + actualQueue.getCapacity());
                    }
                }

                workUnitServerList = actualTagNode.getWorkUnitServer();
                System.out.println("\t\tWorkUnitServers (" + workUnitServerList.size() + "):");
                WorkUnitServerType actualWUServer = null;
                for(int j = 0; j < workUnitServerList.size(); j++) {
                    actualWUServer = (WorkUnitServerType) workUnitServerList.get(j);
                    System.out.println("\t\t\tWorkUnitServer #" + (j + 1) + ":");
                    System.out.println("\t\t\t\tName: " + actualWUServer.getName());
                    System.out.println("\t\t\t\tQuantity: " + actualWUServer.getQuantity());
                    System.out.println("\t\t\t\tSchedulingPolicy: " + actualWUServer.getSchedulingPolicy());
                    System.out.println("\t\t\t\tServiceTime: " + actualWUServer.getServiceTime());
                    System.out.println("\t\t\t\tTimeUnits: " + actualWUServer.getTimeUnits());
                }

                sourceNodeList = actualTagNode.getSourceNode();
                System.out.println("\t\tSourceNodes (" + sourceNodeList.size() + "):");
                SourceNodeType actualSourceNode = null;
                for(int j = 0; j < sourceNodeList.size(); j++) {
                    actualSourceNode = (SourceNodeType) sourceNodeList.get(j);
                    System.out.println("\t\t\tSourceNode #" + (j + 1) + ":");
                    System.out.println("\t\t\t\tName: " + actualSourceNode.getName());
                }

                sinkNodeList = actualTagNode.getSinkNode();
                System.out.println("\t\tSinkNodes (" + sinkNodeList.size() + "):");
                SinkNodeType actualSinkNode = null;
                for(int j = 0; j < sinkNodeList.size(); j++) {
                    actualSinkNode = (SinkNodeType) sinkNodeList.get(j);
                    System.out.println("\t\t\tSinkNode #" + (j + 1) + ":");
                    System.out.println("\t\t\t\tName: " + actualSinkNode.getName());
                }

            }

            EList qnmArcList = qnm.getArc();
            System.out.println("\tArcs (" + qnmArcList.size() + "):\n");
            ArcType actualArc = null;
            for (int i = 0; i < qnmArcList.size(); i++) {
                actualArc = (ArcType) qnmArcList.get(i);
                System.out.println("\t\tArc #" + (i + 1) + ":");
                System.out.println("\t\t\tFrom: " + actualArc.getFromNode());
                System.out.println("\t\t\tTo: " + actualArc.getToNode());
            }

            EList qnmWorkloadList = qnm.getWorkload();
            System.out.println("\tWorkloads (" + qnmWorkloadList.size() + "):\n");
            WorkloadType actualWorkload = null;
            for (int i = 0; i < qnmWorkloadList.size(); i++) {
                actualWorkload = (WorkloadType) qnmWorkloadList.get(i);

                EList openWorkloadsList = actualWorkload.getOpenWorkload();
                System.out.println("\t\tOpenWorkloads (" + openWorkloadsList.size() + "):\n");
                OpenWorkloadType actualOpenWorkload = null;
                for(int j = 0; j < openWorkloadsList.size(); j++) {
                    actualOpenWorkload = (OpenWorkloadType) openWorkloadsList.get(j);
                    System.out.println("\t\t\tOpenWorkload #" + (j + 1) + ":");
                    System.out.println("\t\t\t\tName:" + actualOpenWorkload.getWorkloadName());
                    System.out.println("\t\t\t\tArrivalRate:" + actualOpenWorkload.getArrivalRate());
                    System.out.println("\t\t\t\tArrivesAt:" + actualOpenWorkload.getArrivesAt());
                    System.out.println("\t\t\t\tDepartsAt:" + actualOpenWorkload.getDepartsAt());
                    System.out.println("\t\t\t\tTimeUnits:" + actualOpenWorkload.getTimeUnits());

                    EList actualOpenWorkloadTransitList = actualOpenWorkload.getTransit();
                    System.out.println("\t\t\t\tTransits (" + actualOpenWorkloadTransitList.size() + "):");
                    TransitType actualTransit = null;
                    for(int k = 0; k < actualOpenWorkloadTransitList.size(); k++) {
                        actualTransit = (TransitType) actualOpenWorkloadTransitList.get(k);
                        System.out.println("\t\t\t\t\tTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\tService:" + actualTransit.getService());
                    }
                }

                EList closedWorkloadsList = actualWorkload.getClosedWorkload();
                System.out.println("\t\tClosedWorkloads (" + closedWorkloadsList.size() + "):\n");
                ClosedWorkloadType actualClosedWorkload = null;
                for(int j = 0; j < closedWorkloadsList.size(); j++) {
                    actualClosedWorkload = (ClosedWorkloadType) closedWorkloadsList.get(j);
                    System.out.println("\t\t\tClosedWorkload #" + (j + 1) + ":");
                    System.out.println("\t\t\t\tName:" + actualClosedWorkload.getWorkloadName());
                    System.out.println("\t\t\t\tNumberOfJobs:" + actualClosedWorkload.getNumberOfJobs());
                    System.out.println("\t\t\t\tThinkDevice:" + actualClosedWorkload.getThinkDevice());
                    System.out.println("\t\t\t\tThinkTime:" + actualClosedWorkload.getThinkTime());
                    System.out.println("\t\t\t\tTimeUnits:" + actualClosedWorkload.getTimeUnits());

                    EList actualClosedWorkloadTransitList = actualClosedWorkload.getTransit();
                    System.out.println("\t\t\t\tTransits (" + actualClosedWorkloadTransitList.size() + "):");
                    TransitType actualTransit = null;
                    for(int k = 0; k < actualClosedWorkloadTransitList.size(); k++) {
                        actualTransit = (TransitType) actualClosedWorkloadTransitList.get(k);
                        System.out.println("\t\t\t\t\tTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\tService:" + actualTransit.getService());
                    }
                }
            }

            EList qnmServiceRequestList = qnm.getServiceRequest();
            System.out.println("\n\tServiceRequests (" + qnmServiceRequestList.size() + "):\n");
            ServiceRequestType actualServiceRequest = null;
            for (int i = 0; i < qnmServiceRequestList.size(); i++) {
                actualServiceRequest = (ServiceRequestType) qnmServiceRequestList.get(i);
                System.out.println("\t\tServiceRequest #" + (i + 1) + ":");

                EList demandSRsList = actualServiceRequest.getDemandServiceRequest();
                System.out.println("\n\t\t\tDemandServiceRequests (" + demandSRsList.size() + "):");
                DemandServType actualDemandSR = null;
                for(int j = 0; j < demandSRsList.size(); j++) {
                    actualDemandSR = (DemandServType) demandSRsList.get(j);
                    System.out.println("\n\t\t\t\tDemandServiceRequest #" + (j + 1) + ":");
                    System.out.println("\t\t\t\t\tWorkloadName:" + actualDemandSR.getWorkloadName());
                    System.out.println("\t\t\t\t\tServerID:" + actualDemandSR.getServerID());
                    System.out.println("\t\t\t\t\tServiceDemand:" + actualDemandSR.getServiceDemand());
                    System.out.println("\t\t\t\t\tNumberOfVisits:" + actualDemandSR.getNumberOfVisits());
                    System.out.println("\t\t\t\t\tTimeUnits:" + actualDemandSR.getTimeUnits());

                    EList actualDemandSRTransitList = actualDemandSR.getTransit();
                    System.out.println("\t\t\t\t\tTransits (" + actualDemandSRTransitList.size() + "):");
                    TransitType actualTransit = null;
                    for(int k = 0; k < actualDemandSRTransitList.size(); k++) {
                        actualTransit = (TransitType) actualDemandSRTransitList.get(k);
                        System.out.println("\t\t\t\t\t\tTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\t\tService:" + actualTransit.getService());
                    }
                }

                EList timeSRsList = actualServiceRequest.getTimeServiceRequest();
                System.out.println("\n\t\t\tTimeServiceRequests (" + timeSRsList.size() + "):");
                TimeServType actualTimeSR = null;
                for(int j = 0; j < timeSRsList.size(); j++) {
                    actualTimeSR = (TimeServType) timeSRsList.get(j);
                    System.out.println("\n\t\t\t\tTimeServiceRequest #" + (j + 1) + ":");
                    System.out.println("\t\t\t\t\tWorkloadName:" + actualTimeSR.getWorkloadName());
                    System.out.println("\t\t\t\t\tServerID:" + actualTimeSR.getServerID());
                    System.out.println("\t\t\t\t\tServiceTime:" + actualTimeSR.getServiceTime());
                    System.out.println("\t\t\t\t\tNumberOfVisits:" + actualTimeSR.getNumberOfVisits());
                    System.out.println("\t\t\t\t\tTimeUnits:" + actualTimeSR.getTimeUnits());
                    System.out.println("\t\t\t\t\tSchedulingPolicy:" + actualTimeSR.getSchedulingPolicy().getName());
                    System.out.println("\t\t\t\t\tService:" + actualTimeSR.getService());

                    EList actualTimeSRTransitList = actualTimeSR.getTransit();
                    System.out.println("\t\t\t\t\tTransits (" + actualTimeSRTransitList.size() + "):");
                    TransitType actualTransit = null;
                    for(int k = 0; k < actualTimeSRTransitList.size(); k++) {
                        actualTransit = (TransitType) actualTimeSRTransitList.get(k);
                        System.out.println("\t\t\t\t\t\tTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\t\tService:" + actualTransit.getService());
                    }

                    EList actualTimeSRForkTransitList = actualTimeSR.getForkTransit();
                    System.out.println("\t\t\t\t\tForkTransits (" + actualTimeSRForkTransitList.size() + "):");
                    ForkTransitType actualForkTransit = null;
                    for(int k = 0; k < actualTimeSRForkTransitList.size(); k++) {
                        actualForkTransit = (ForkTransitType) actualTimeSRForkTransitList.get(k);
                        System.out.println("\n\t\t\t\t\t\tForkTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\t\tFrom:" + actualForkTransit.getFrom());
                        System.out.println("\t\t\t\t\t\t\tTo:" + actualForkTransit.getTo());
                        System.out.println("\t\t\t\t\t\t\tService:" + actualForkTransit.getService());
                    }

                    EList actualTimeSRJoinTransitList = actualTimeSR.getJoinTransit();
                    System.out.println("\t\t\t\t\tJoinTransits (" + actualTimeSRJoinTransitList.size() + "):");
                    JoinTransitType actualJoinTransit = null;
                    for(int k = 0; k < actualTimeSRJoinTransitList.size(); k++) {
                        actualJoinTransit = (JoinTransitType) actualTimeSRJoinTransitList.get(k);
                        System.out.println("\t\t\t\t\t\tJoinTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\t\tService:" + actualTransit.getService());
                    }
                }

                EList workUnitSRsList = actualServiceRequest.getWorkUnitServiceRequest();
                System.out.println("\n\t\t\tWorkUnitServiceRequests (" + workUnitSRsList.size() + "):");
                WorkUnitServType actualWorkUnitSR = null;
                for(int j = 0; j < workUnitSRsList.size(); j++) {
                    actualWorkUnitSR = (WorkUnitServType) workUnitSRsList.get(j);
                    System.out.println("\n\t\t\t\tWorkUnitServiceRequest #" + (j + 1) + ":");
                    System.out.println("\t\t\t\t\tWorkloadName:" + actualWorkUnitSR.getWorkloadName());
                    System.out.println("\t\t\t\t\tServerID:" + actualWorkUnitSR.getServerID());
                    System.out.println("\t\t\t\t\tNumberOfVisits:" + actualWorkUnitSR.getNumberOfVisits());

                    EList actualWorkUnitSRTransitList = actualWorkUnitSR.getTransit();
                    System.out.println("\t\t\t\t\tTransits (" + actualWorkUnitSRTransitList.size() + "):");
                    TransitType actualTransit = null;
                    for(int k = 0; k < actualWorkUnitSRTransitList.size(); k++) {
                        actualTransit = (TransitType) actualWorkUnitSRTransitList.get(k);
                        System.out.println("\t\t\t\t\t\tTransit #" + (k + 1) + ":");
                        System.out.println("\t\t\t\t\t\t\tFrom:" + actualTransit.getFrom());
                        System.out.println("\t\t\t\t\t\t\tTo:" + actualTransit.getTo());
                        System.out.println("\t\t\t\t\t\t\tProbability:" + actualTransit.getProbability());
                        System.out.println("\t\t\t\t\t\t\tService:" + actualTransit.getService());
                    }

                }

            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }          
        
    }
    
    /**
     * This method prints the informations about a Case, Pardo or Split Node (cpsNode).
     * @param cpsNode The cpsNode.
     **/
    public void basePrint(di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType cpsNode) {
        EList nl = cpsNode.getBasicNode();
        for(int k = 0; k < nl.size(); k++) {
            System.out.println("\t\t\t\t\t\tBasicNode #" + (k + 1) + ":");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl.get(k)).getNodeName());     
            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl.get(k)).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }                             

        nl = cpsNode.getExpandedNode();
        for(int k = 0; k < nl.size(); k++) {
            System.out.println("\t\t\t\t\t\tExpandedNode #" + (k + 1) + ":");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl.get(k)).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl.get(k)).getDerivedResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }

        }
        nl = cpsNode.getLinkNode();
        for(int k = 0; k < nl.size(); k++) {
            System.out.println("\t\t\t\t\t\tLinkNode #" + (k + 1) + ":");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl.get(k)).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl.get(k)).getDerivedResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }
        nl = cpsNode.getSynchronizationNode();
        for(int k = 0; k < nl.size(); k++) {
            System.out.println("\t\t\t\t\t\tSynchronizationNode #" + (k + 1) + ":");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl.get(k)).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            float[] actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl.get(k)).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }

        }
    }
    
    /**
     * This method prints the informations about a Repetiton Node (RepNode).
     * @param repNode The RepNode.
     **/
    public void basePrint(di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType repNode) {
        float[] actualNodeResources;
        Object nl = repNode.getBasicNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\t\tBasicNode:");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl).getNodeName());     
            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType) nl).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }              

        nl = repNode.getExpandedNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\t\tExpandedNode:");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType) nl).getDerivedResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }
        
        nl = repNode.getLinkNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\t\tLinkNode:");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType) nl).getDerivedResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }
        nl = repNode.getSynchronizationNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\t\tSynchronizationNode:");
            System.out.println("\t\t\t\t\t\t\tNodeName: " + ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl).getNodeName());

            System.out.println("\t\t\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType) nl).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
        }
    }
    
    /**
     * This method prints the informations about all the nodes in a Compound Node.
     * @param cNode The Compound Node.
     **/
    public void basePrint(di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType cNode) {
        System.out.println("\t\t\t\tCompoundNode:");
        Object nl = cNode.getCaseNode();
        float[] actualNodeResources;
        if(nl != null) {
            System.out.println("\t\t\t\t\tCPSNode:");
            System.out.println("\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) nl).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
            basePrint((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) nl);     
        }
        
        nl = cNode.getPardoNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\tCPSNode:");
            basePrint((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) nl);  
        }
        
        nl = cNode.getSplitNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\tCPSNode:");
            basePrint((di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType) nl);  
        }
        nl = cNode.getRepetitionNode();
        if(nl != null) {
            System.out.println("\t\t\t\t\tRepetitionNode:");
            System.out.println("\t\t\t\t\tTotalComputerResources:");
            actualNodeResources = ((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) nl).getTotalResources();
            for(int h = 0; h < actualNodeResources.length; h++) {
                System.out.print("\t\t\t\t\t\t" + ((di.univaq.MOSQUITO.egQnMerger.EG.DeviceType) project.getProcessingOverhead().getDevices().getDevice().get(h)).getDeviceName() + ": ");
                System.out.println(actualNodeResources[h]);
            }
            basePrint((di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType) nl);  
        }
    }
         
}

