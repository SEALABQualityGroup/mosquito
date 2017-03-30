/*
 * ParserUseCase.java
 *
 * Created on 31 luglio 2006, 15.08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser.Omondo;

import java.util.Vector;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import di.univaq.MOSQUITO.DataStructures.Association;
import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.UseCase.Actor;
import di.univaq.MOSQUITO.DataStructures.UseCase.ChildTree;
import di.univaq.MOSQUITO.DataStructures.UseCase.UseCase;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;


/**
 * @author  Fabio Calvarese
 */
public class ParserUseCase extends Parser {

	// questo vettore contirne tuttta l'informazione strutturata dello use case diagram.
	private Vector tree;

	/** Creates a new instance of ParserUseCase */
	public ParserUseCase(Document doc, LogManager log) {
		super("errore nel parsing delo use case diagram", "editmodel:UseCaseDiagramEditModel",log);
		tree = new Vector();
		loadXMLFile(doc);
		generateMultiTree();
	}

	/**
	 * @return  Returns the tree.
	 * @uml.property  name="tree"
	 */
	public Vector getTree() {
		return this.tree;
	}

	protected void loadDiagramElements(Element tempEl) {
		if (tempEl.getNodeName().equals("children")) {
			Elem genericElement = null;
			String type = tempEl.getAttribute("xsi:type");
			String targetConnection = tempEl.getAttribute("targetConnections");
			// divido le varie etichette di connessione
			String[] targets = targetConnection.split("//");

			// carico le etichette
			if (type.equals("editmodel:NotepadEditModel")) {
				String note = tempEl.getAttribute("note");
				genericElement = new Label(note, targets);
				// System.out.println(note);
			}

			// carico gli use case
			if (type.equals("editmodel:UseCaseEditModel")) {
				String name = tempEl.getAttribute("itemName");
				genericElement = new UseCase(name, targets);
				// System.out.println(name);
			}

			// carico gli attori
			if (type.equals("editmodel:UseCaseActorEditModel")) {
				String name = tempEl.getAttribute("itemName");
				genericElement = new Actor(name, targets);
				// System.out.println(name);
			}
			loadSourceConnections(tempEl, genericElement);
			elements.add(genericElement);
		}
	}

	public void generateMultiTree() {
		for (int i = 0; i < this.elements.size(); i++) {
			Object el = elements.get(i);
			if (el instanceof UseCase) {
				UseCase useCase = (UseCase) el;
				Vector children = findAssociatedElements(useCase);
				useCase.setChildren(children);
				tree.add(useCase);
				continue;
			}
		}
		// stampaTree();
	}

	public Vector findAssociatedElements(UseCase useCase) {
		Vector child1 = findEnteringActors(useCase.getTargetConnection());
		Vector child2 = findOutgoingActors(useCase.getSourceConnection());
		child1.addAll(child2);
		return child1;
	}

	public void stampaTree() {
		for (int i = 0; i < tree.size(); i++) {
			UseCase useCase = (UseCase) tree.get(i);
			System.out.println("Nome Caso d'uso " + useCase.getName());
			Vector v = useCase.getChildren();
			for (int j = 0; j < v.size(); j++) {
				ChildTree c = (ChildTree) v.get(j);
				Actor a = c.getAttore();
				System.out.println(" Nome attore associato " + a.getName());
				System.out.println(" Prob di accesso attore "+ a.getAccessProb());
				System.out.println(" Probabilita' associazione  "+ c.getLabels());
			}
		}
	}

	public Vector findOutgoingActors(Vector sourceConnections) {
		Vector useCaseChilds = new Vector();
		// scorro le associazioni
		for (int i = 0; i < sourceConnections.size(); i++) {
			// scorro gli elementi
			for (int j = 0; j < elements.size(); j++) {
				Object elem = elements.get(j);
				if (elem instanceof Actor) {
					Actor attore = (Actor) elem;
					Association assoc = (Association) sourceConnections.get(i);
					if (attore.checkEnteringAssoc(assoc)) {
						useCaseChilds.add(createChild(attore, assoc));
					}
				}
			}
		}
		return useCaseChilds;
	}

	public Vector findEnteringActors(String[] targets) {
		Vector useCaseChilds = new Vector();
		for (int j = 0; j < targets.length; j++) {
			for (int i = 0; i < elements.size(); i++) {
				if (elements.get(i) instanceof Actor) {
					Actor attore = (Actor) elements.get(i);
					Association assTemp = attore.check(targets[j]);
					// controllo se esiste un attore associato al caso d'uso
					if (assTemp != null) {

						useCaseChilds.add(createChild(attore, assTemp));
					}
				}
			}
		}
		return useCaseChilds;
	}

	public ChildTree createChild(Actor attore, Association assTemp) {
		ChildTree child = new ChildTree();
		String[] targActor = attore.getTargetConnection();
		String labelActor = findLabel(targActor);
		attore.setAccessProb(labelActor);
		String[] associationTarget = assTemp.getTargetConnection();
		String labelAssoc = findLabel(associationTarget);
		child.setAttore(attore);
		child.setLabels(labelAssoc);
		return child;
	}

	public String findLabel(String[] targActor) {
		for (int j = 0; j < targActor.length; j++) {
			for (int i = 0; i < elements.size(); i++) {
				if (elements.get(i) instanceof Label) {
					Label lab = (Label) elements.get(i);
					if (lab.check(targActor[j]) != null) { 
						return lab.getName();
					}
				}
			}
		}
		return "";
	}
}
