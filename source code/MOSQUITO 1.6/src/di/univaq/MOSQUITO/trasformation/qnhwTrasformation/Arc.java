package di.univaq.MOSQUITO.trasformation.qnhwTrasformation;

import java.util.Vector;

import PmifSchema.ArcType;
import PmifSchema.PmifSchemaFactory;
import PmifSchema.QNMType;
import di.univaq.MOSQUITO.DataStructures.Deployment.DepNode;
import di.univaq.MOSQUITO.Parser.UML2.ParserDeployment;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class Arc extends OutputSection{

    public Arc(QNMType qn, PmifSchemaFactory pmif, LogManager log){
    	super(qn, pmif, log);
    }
	
	public void createArcSection(ParserDeployment parser) {
		
		// controllare la presenza di un solo nodo terminal altrimenti warning
		
		
		checkTerminalNode(parser);
			
			
		
		
		
		for( DepNode node:parser.getElements()){
			
			
			/*
			 * un nodo è complesso se contiene più di un device.
			 * I nodi complessi possono essere formati da terminal CPU e DISK.
			 * la cpu è obbligatoria.
			 */ 
			createComplexNodeTopology(node);
			
			/*
			 * I nodi semplici sono formati da un unico device come ad esempio la sola CPU
			 * 
			 */
			createSimpleNodeTopology(node);
			
			/*
			 * Aggiungo sempre il source node e il sink node connessi all'unico nodo terminal obbligatorio.
			 * 
			 */
			createSourceAndsinkNode(node);
		}
		
	}
	
	public void createSourceAndsinkNode(DepNode node){
		Vector internalNodes = node.getInternalNodes();
		for(int i = 0; i < internalNodes.size(); i++) {
		    DepNode intNode = (DepNode)internalNodes.get(i);
			if(intNode.isTerminal()) {
				
				// da init a terminal
				String terminalName = intNode.getFullName();
				ArcType arc = pmif.createArcType();
				arc.setFromNode("Init");
				arc.setToNode(terminalName);
				qn.getArc().add(arc);
				
				// da terminal a Fini
				
				ArcType arc2 = pmif.createArcType();
				arc2.setFromNode(terminalName);
				arc2.setToNode("Fini");
				qn.getArc().add(arc2);
			}
		}
	}
	
	public void checkTerminalNode(ParserDeployment parser) {
		int count = 0;
		for( DepNode node:parser.getElements()){
			if(node.getTerminal()!=null) {
				count ++;
			}	
		}
		
		if(count == 0) {
			System.out.println("Error, the deployment diagram do not present a terminal node.");
			log.addError(PropertiesManager.getProperties("e30"));
		}
		if(count >1) {
			System.out.println("Error, In a deployment diadram is possible to use only a terminal node.");
			log.addError(PropertiesManager.getProperties("e31"));
		}
		
	}
	
	/*
	 * Per ogni nodo vado a creare la sezione della rete di code inerente ai devices interni al nodo.
	 * Questo metodo tratta solo le connessioni interne al nodo passato come argomento.
	 * 
	 */
	public void createComplexNodeTopology(DepNode node) {
		if(node.getInternalNodes().size() > 1) {
			DepNode  cpuNode = node.getCpu();
			DepNode  diskNode = node.getDisk();
			
			if(cpuNode == null) {
				System.out.println("Error,it is not possible to parse composite node without CPU devices. The result queuing network may be irregular.");
				log.addError(PropertiesManager.getProperties("e29"));
				return;
			}
			else {
				create_NODE_EXIT_Connection(node, cpuNode);
			}
			
			if(diskNode != null) {
				create_CPU_DISK_Comunication(cpuNode, diskNode);
				create_DISK_CPU_Comunication(diskNode, cpuNode);
			}
			
			// esiste il nodo terminal allora la topologia ne deve tenere conto
			DepNode terminalNode = node.getTerminal();
			if(terminalNode != null) {
				create_CPU_TERMINAL_Comunication(cpuNode, terminalNode);
				create_TERMINAL_CPU_Comunication(terminalNode, cpuNode);
			}
		}
	}

	public void createSimpleNodeTopology(DepNode node) {
		if(node.getInternalNodes().size() == 1) {
			DepNode internalNode = node.getInternalNodes().get(0);
			create_NODE_EXIT_Connection(node, internalNode);
		}
		
	}

	
	public void create_MANY_TO_MANY_Connection(DepNode nodeFrom, DepNode nodeTo) {
		long fromNumber = nodeFrom.getQuantity();
		long toNumber = nodeTo.getQuantity();
		for(int i = 0; i < fromNumber; i++ ) {
			for(int j = 0; j < toNumber; j++ ) {
				 ArcType arc = pmif.createArcType();
				 arc.setFromNode(nodeFrom.getFullName()+"_"+i);
				 arc.setToNode(nodeTo.getFullName()+"_"+j);
				 qn.getArc().add(arc);
			}
		}
	}
	
	public void create_MANY_TO_ONE_Connection(DepNode fromNode, DepNode toNode) {
		long numberMult = fromNode.getQuantity();
		for(int i = 0; i < numberMult; i++ ){
			ArcType arc = pmif.createArcType();
			arc.setFromNode(fromNode.getFullName()+"_"+i);
			arc.setToNode(toNode.getFullName());
			qn.getArc().add(arc);
		}
	}
	
	
	
	// questo metodo crea i collegamenti fra tutte le CPU e tutti i dischi 
	public void create_CPU_DISK_Comunication(DepNode cpuNode, DepNode diskNode) {
		create_MANY_TO_MANY_Connection(cpuNode,diskNode);
		/*long cpuNumber = cpuNode.getQuantity();
		long diskNumber = diskNode.getQuantity();
		for(int i = 0; i < cpuNumber; i++ ) {
			for(int j = 0; j < diskNumber; j++ ) {
				 ArcType arc = pmif.createArcType();
				 arc.setFromNode(cpuNode.getFullName()+"_"+i);
				 arc.setToNode(diskNode.getFullName()+"_"+j);
				 qn.getArc().add(arc);
			}
		}*/
	}
	
	//creazione dei collegamenti fra tutte le cpu e il nodo terminal.
	public void create_CPU_TERMINAL_Comunication(DepNode cpuNode, DepNode terminal) {
		long cpuNumber = cpuNode.getQuantity();
		for(int i = 0; i < cpuNumber; i++ ) {
			ArcType arc = pmif.createArcType();
			arc.setFromNode(cpuNode.getFullName()+"_"+i);
			arc.setToNode(terminal.getFullName());
			qn.getArc().add(arc);
		}
	}
	
	// crea i collegamenti fra il nodo terminal e le cpu.
	public void create_TERMINAL_CPU_Comunication(DepNode terminal, DepNode cpuNode ) {
		long cpuNumber = cpuNode.getQuantity();
		for(int i = 0; i < cpuNumber; i++ ){
			ArcType arc = pmif.createArcType();
			arc.setFromNode(terminal.getFullName());
			arc.setToNode(cpuNode.getFullName()+"_"+i);
			qn.getArc().add(arc);
		}
	}
	
	// crea la i collegamenti fra i dischi e le cpu. 
	public void create_DISK_CPU_Comunication(DepNode diskNode, DepNode cpuNode) {
		create_MANY_TO_MANY_Connection(diskNode, cpuNode);
		/*long diskNumber = diskNode.getQuantity();
		long cpuNumber = cpuNode.getQuantity();
		for(int i = 0; i < diskNumber; i++ ){
			for(int j = 0; j < cpuNumber; j++ ) {
				ArcType arc = pmif.createArcType();
				arc.setFromNode(diskNode.getFullName()+"_"+i);
				arc.setToNode(cpuNode.getFullName()+"_"+j);
				qn.getArc().add(arc);
			}
		}*/
	}
	
	public void create_NODE_EXIT_Connection(DepNode patherNode, DepNode genNode) {
		//reperisco i nodi collegati al nodo pather
		Vector <DepNode> parents = patherNode.getParentNode();
		for(int j = 0; j < parents.size(); j++) {
		   DepNode parentNode = parents.get(j);
		   DepNode exitPoint = parentNode.getExitPoint();
		   
		   if(exitPoint.isTerminal()) {
			   this.create_MANY_TO_ONE_Connection(genNode, exitPoint);
		   }
		   else {
		       this.create_MANY_TO_MANY_Connection(genNode, exitPoint);
		   }
		}
	}
}


