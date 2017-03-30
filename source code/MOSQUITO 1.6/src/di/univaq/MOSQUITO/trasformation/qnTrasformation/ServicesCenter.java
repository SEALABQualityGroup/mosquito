package di.univaq.MOSQUITO.trasformation.qnTrasformation;

import java.math.BigInteger;
import java.util.Vector;

import QNM2MetaMod.CapacityType;
import QNM2MetaMod.NodeType;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import QNM2MetaMod.QueueType;
import QNM2MetaMod.ServerType;
import di.univaq.MOSQUITO.DataStructures.Component.Child;
import di.univaq.MOSQUITO.DataStructures.Component.Component;
import di.univaq.MOSQUITO.DataStructures.Component.Interface;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;



public class ServicesCenter extends XmlDocumentSection {

	private NodeType node;

	private Vector parsersSequence;

	public ServicesCenter(Vector parsersComponent, Vector parsersSequence,
			QNMType qn, QNM2MetaModFactory df, LogManager log) {
		super(parsersComponent, qn, df, log);
		node = df.createNodeType();
		this.parsersSequence = parsersSequence;
	}

	public void createServicesCenterSection() {
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) instanceof Component) {
				Component comp = (Component) elements.get(i);
				visit(comp);
			}
		}
		node.getServer().add(createThinkingDevice());
		qn.getNode().add(node);
	}

	// Visita in ampiezza dell'albero
	public void visit(Component comp) {
		if (!comp.visited) {
			comp.visited = true;
			CapacityType serverType = getType(comp);
			/*//inserito
			if(serverType.equals(CapacityType.ZERO_LITERAL)) {
				//fine inserito*/
			ServerType	server = createServer(comp);	
			//System.out.println("Interfaccie caricate " + comp.getInterfaces().size());
			for (int i = 0; i < comp.getInterfaces().size(); i++) {
				Interface interf = (Interface) comp.getInterfaces().get(i);
                // carica le etichette sulle interfacce sui messaggi dei
				// sequence diagram
				laodLabelInMessages(i, comp);
				QueueType queue = df.createQueueType();
				queue.setCapacity(serverType);
				queue.setName(interf.getName());
				server.getQueue().add(queue);
			}
			createInternalActions(server, serverType);
			node.getServer().add(server);
			/*}
			//inserito
			else{
				WorkUnitServerType workServer = df.createWorkUnitServerType();
				workServer.setName(comp.getName());
				workServer.setQuantity(BigInteger.ONE);
				node.getWorkUnitServer().add(workServer);
			}
			//fine inserito*/
			for (int i = 0; i < comp.getChildren().size(); i++) {
				Child c = (Child) comp.getChildren().get(i);
				visit(c.getComponent());
			}
		}
	}

	public void laodLabelInMessages(int index, Component comp) {
		for (int z = 0; z < parsersSequence.size(); z++) {
			Parser ps = (Parser) parsersSequence.get(z);
			for (int i = 0; i < ps.getElements().size(); i++) {
				if (ps.getElements().get(i) instanceof Instance) {
					Instance ins = (Instance) ps.getElements().get(i);
					for (int j = 0; j < ins.getMessages().size(); j++) {
						Instance insch = (Instance) ins.getChildren().get(j);
						if (insch.getName().toLowerCase().equals(comp.getName().toLowerCase())) {
							Messages mes = (Messages) ins.getMessages().get(j);
							Interface inter = (Interface)comp.getInterfaces().get(index);
							//System.out.println(mes.getName());
							//System.out.println(inter.getName());
							
							if (mes.getName().toLowerCase().equals(inter.getName().toLowerCase())) {
								//System.out.println("label " + comp.getLabels().get(index).toString() +" nel messaggio "+ mes.getName());
								mes.setServiceLabel(comp.getLabels().get(index).toString());
							}
						}
					}
				}
			}
		}
	}

	public void createInternalActions(ServerType server, CapacityType serverType) {
		if (serverType.equals(CapacityType.ZERO_LITERAL)) {
			QueueType queue = df.createQueueType();
			queue.setCapacity(serverType);
			queue.setName("InternalActions");
			server.getQueue().add(queue);
		}
	}

	public ServerType createThinkingDevice() {
		ServerType server = df.createServerType();
		server.setName("ThinkDevice");
		server.setQuantity(BigInteger.ONE);
		QueueType queue = df.createQueueType();
		queue.setCapacity(CapacityType.ZERO_LITERAL);
		queue.setName("ThinkDevice");
		server.getQueue().add(queue);
		return server;
	}

/*	public Object createServer(Component comp) {
		if(getType(comp).equals( CapacityType.INFINITE_LITERAL)){
			WorkUnitServerType work = df.createWorkUnitServerType();
			work.setName(comp.getName());
		    work.setQuantity(BigInteger.ONE);
		    return work;
		}
		else {
		    
			ServerType server = df.createServerType();
		    server.setName(comp.getName());
		    server.setQuantity(BigInteger.ONE);
		    return server;
		}
		
	}*/
	
	public ServerType createServer(Component comp) {
		ServerType server = df.createServerType();		    
		server.setName(comp.getName());
		server.setQuantity(BigInteger.ONE);
		return server;
	}

	public CapacityType getType(Component comp) {
		String labelComponent = comp.getComponentLabel();
		if (labelComponent.equals("")) {
			return CapacityType.ZERO_LITERAL;
		}
		int startIndex = labelComponent.lastIndexOf("<<");
		int lastIndex = labelComponent.lastIndexOf(">>");
		if (startIndex == -1 || lastIndex == -1) {
			log.addInfo(PropertiesManager.getProperties("e24"));
			return CapacityType.ZERO_LITERAL;
		}
		String stereotype = labelComponent.substring(startIndex + 2, lastIndex);
		stereotype = stereotype.replaceAll(" ", ""); 
		// System.out.println("Lo stereotipo e' "+ stereotype);
		if (stereotype.toLowerCase().equals("pahost")) {
			loadComponentLabelInInstance(labelComponent, comp.getName());
			return CapacityType.INFINITE_LITERAL;
		}
		return CapacityType.ZERO_LITERAL;
	}

	public void loadComponentLabelInInstance(String label, String componentName) {
		boolean flag = false;
		
		for (int i = 0; i < parsersSequence.size(); i++) {
			Parser ps = (Parser) parsersSequence.get(i);
			for (int j = 0; j < ps.getElements().size(); j++) {
				if (ps.getElements().get(j) instanceof Instance) {
					Instance ins = (Instance) ps.getElements().get(j);
					if (ins.getName().toLowerCase().equals(
							componentName.toLowerCase())) {
						
						flag = true;
						ins.setServicePolicy(label);
						break;
					}
				}
			}
		}
		if(!flag) {
			log.addInfo( PropertiesManager.getProperties("e22") +" " + componentName+ " "+ PropertiesManager.getProperties("e23"));
		}
	}
}
