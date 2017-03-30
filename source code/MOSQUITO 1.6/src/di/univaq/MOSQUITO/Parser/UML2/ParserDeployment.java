package di.univaq.MOSQUITO.Parser.UML2;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Property;

import di.univaq.MOSQUITO.DataStructures.Deployment.DepNode;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class ParserDeployment extends Parser {

	private Vector<DepNode> elements;

	private Vector<Node> nodes;

	public ParserDeployment(Model model, EclipseUML2UtilV2 utils, LogManager log) {
		super(utils, log);
		elements = new Vector<DepNode>();
		nodes = new Vector<Node>();
		loadFirstLevelDeployment(model);
		loadNodesProperties();
	}

	// Carica tutti i nodi che si triovano sul primo livello di un deployment
	// diagram
	public void loadFirstLevelDeployment(org.eclipse.uml2.uml.Package pck) {
		List l = pck.eContents();
		for (int i = 0; i < l.size(); i++) {
			EObject e = (EObject) l.get(i);
			if (e instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package pack = (org.eclipse.uml2.uml.Package) e;
				loadFirstLevelDeployment(pack);
			}
			if (e instanceof Node) {
				Node node = (Node) e;
				DepNode depNode = new DepNode(log);
				depNode.setName(node.getName());
				depNode.setFullName(node.getName());
				this.elements.add(depNode);
				this.nodes.add(node);
			}
		}
	}

	// Carica tutte le caratteristiche interne di un deployment diagram
	public void loadNodesProperties() {
		// System.out.println(nodes.size());
		for (int i = 0; i < nodes.size(); i++) {
			loadNodesProperties(nodes.get(i), elements.get(i));
		}
	}

	// node è il nodo al primo livello
	public void loadNodesProperties(Node node, DepNode depNode) {

		for (Iterator<EObject> i = node.eAllContents(); i.hasNext();) {

			EObject e = (EObject) i.next();
			// se l'oggetto rappresenta un artefatto
			if (e instanceof Deployment) {
				Deployment dep = (Deployment) e;
				List l = dep.getDeployedArtifacts();
				for (int j = 0; j < l.size(); j++) {
					Artifact art = (Artifact) l.get(j);
					depNode.addArtefact(art.getName());
				}
			}
			// se l'oggetto rappresenta una relazione fra nodi reperisco il nome
			// della relazione e l'adiacente
			else if (e instanceof Property) {
				Property prop = (Property) e;
				// Il nome della relazione non viene al momento utilizato nella
				// trasformazione quindi non lo inserisco nella struttura dati
				// String relationName = prop.getName();
				String parentNodeName = prop.getType().getName();
				DepNode parentNode = getNode(parentNodeName);
				depNode.addParentNode(parentNode);
			}

			// se all'interno del nodo corrente sono presenti altri nodi
			else if (e instanceof Node) {
				Node internalNode = (Node) e;
				// this.getUtils().getPropertyValue(internalNode, "PA",
				// StereotypeName, propertyValue);
				DepNode internalDepNode = new DepNode(log);
				internalDepNode.setName(internalNode.getName());
				internalDepNode.setFullName(depNode.getName() + "_" + internalNode.getName());
				setSteretypeProperties(internalNode, internalDepNode );
				depNode.addInternalNode(internalDepNode);
			}
		}
	}

	private DepNode getNode(String nodeName) {
		for (DepNode node : this.getElements()) {
			if (node.getName().equals(nodeName)) {
				return node;
			}
		}
		return null;

	}

	public Vector<DepNode> getElements() {
		return elements;
	}
	
	
	public void setSteretypeProperties(Node uml2Node, DepNode node) {
		if(utils.isPahostSter(uml2Node,"paHost")){
			node.setQuantity(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paHost", "PAmultiplicity"));
			node.setPASchedulingPolicy(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paHost", "PAschdPolicy"));
			node.setServiceTimeAndTimeUnit(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paHost", "PArate"));
			node.setPahost(true);
		}
		else if(utils.isPahostSter(uml2Node,"paResource")) {
			node.setQuantity(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paResource", "PAmultiplicity"));
			node.setPASchedulingPolicy(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paResource", "PAschdPolicy"));
			node.setServiceTimeAndTimeUnit(utils.getPropertyValueNoError(uml2Node,"PAprofile", "paResource", "PAaxTime"));
			node.setPahost(false);
		}
		else {
			System.out.println("All'elemento " + uml2Node.getName() + " non è applicato lo stereotipo richiesto" ); 
	    	log.addInfo(PropertiesManager.getProperties("e6") +" "+ uml2Node.getName() +" "+ PropertiesManager.getProperties("e7"));
			node.setPahost(false);
		}
	}
}
