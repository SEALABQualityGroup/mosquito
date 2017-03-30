package di.univaq.MOSQUITO.trasformation.qnhwTrasformation;

import java.math.BigInteger;
import java.util.Vector;

import PmifSchema.NodeType;
import PmifSchema.PmifSchemaFactory;
import PmifSchema.QNMType;
import PmifSchema.SchedulingType;
import PmifSchema.ServerType;
import PmifSchema.SinkNodeType;
import PmifSchema.SourceNodeType;
import PmifSchema.TimeUnitsType;
import PmifSchema.WorkUnitServerType;
import di.univaq.MOSQUITO.DataStructures.Deployment.DepNode;
import di.univaq.MOSQUITO.Parser.UML2.ParserDeployment;
import di.univaq.MOSQUITO.utility.LogManager;

public class ServicesCenter extends OutputSection{
	


	public ServicesCenter( QNMType qn, PmifSchemaFactory pmif, LogManager log){
		super(qn, pmif, log);
	}
	
	public void createServicesCenterSection(ParserDeployment parser) {
		Vector<DepNode> deploymentNodes =  parser.getElements();
		NodeType node = pmif.createNodeType();
		for(DepNode deployNode: deploymentNodes) {
			Vector<DepNode> intNodes = deployNode.getInternalNodes();
			for(DepNode intNode: intNodes) {
				
				if(intNode.getServiceTime() == 0) {
					createServer(intNode , node);
				//	node.getServer().add(servType);
				}
				else {
				    createWorkUnitServer(intNode, node);
				    //node.getWorkUnitServer().add(work);
				}
			}
		}
		
		addInitAndFineNode(node);
		qn.getNode().add(node);
	}
	
	public void addInitAndFineNode(NodeType node) {
		SourceNodeType source = pmif.createSourceNodeType();
		SinkNodeType sink = pmif.createSinkNodeType();
		source.setName("Init");
		sink.setName("Fini");
		node.getSourceNode().add(source);
		node.getSinkNode().add(sink);
	}
	
	private void createServer(DepNode deployNode, NodeType node) {
		if(deployNode.isTerminal()) 
			createTerminalServer(deployNode, node);
		else {
			for(int i=0; i < deployNode.getQuantity(); i++) {
				ServerType server = pmif.createServerType();		    
				server.setName(deployNode.getFullName()+"_"+i);
				server.setQuantity(BigInteger.ONE);
				if(server.getName().contains("DELAY")) {
					server.setSchedulingPolicy(SchedulingType.getByName("IS"));
				}
				else {
					server.setSchedulingPolicy(SchedulingType.getByName(deployNode.getPASchedulingPolicy()));
				}
				node.getServer().add(server);
			}
		}
	}
	
	private void createWorkUnitServer(DepNode deployNode, NodeType node) {
		if(deployNode.isTerminal()) 
			createTerminalWorkUnitServer(deployNode, node);
		else {
			for(int i=0; i < deployNode.getQuantity(); i++) {
				WorkUnitServerType server = pmif.createWorkUnitServerType();  
				server.setName(deployNode.getFullName()+"_"+i);
				server.setQuantity(BigInteger.ONE);
				server.setServiceTime(deployNode.getServiceTime());
				server.setTimeUnits(TimeUnitsType.getByName(deployNode.getTimeUnits()));
				if(server.getName().contains("DELAY")) {
					server.setSchedulingPolicy(SchedulingType.getByName("IS"));
				}
				else {
					server.setSchedulingPolicy(SchedulingType.getByName(deployNode.getPASchedulingPolicy()));
				}
				node.getWorkUnitServer().add(server);
			}
		}
	}
	
	
	// il terminale è sempre uno quindi non tengo conto della quantità
	private void createTerminalServer(DepNode deployNode, NodeType node) {
			ServerType server = pmif.createServerType();		    
			server.setName(deployNode.getFullName());
			server.setQuantity(BigInteger.valueOf(deployNode.getQuantity()));
			server.setSchedulingPolicy(SchedulingType.getByName("IS"));
			node.getServer().add(server);
	}
	
	
	// il terminale è sempre uno quindi non tengo conto della quantità
	private void createTerminalWorkUnitServer(DepNode deployNode, NodeType node) {
			WorkUnitServerType server = pmif.createWorkUnitServerType();  
			server.setName(deployNode.getFullName());
			server.setServiceTime(deployNode.getServiceTime());
			server.setTimeUnits(TimeUnitsType.getByName(deployNode.getTimeUnits()));
			//server.setSchedulingPolicy(SchedulingType.getByName(deployNode.getPASchedulingPolicy()));
			server.setSchedulingPolicy(SchedulingType.getByName("IS"));
			server.setQuantity(BigInteger.valueOf(deployNode.getQuantity()));
			node.getWorkUnitServer().add(server);
	}
}
