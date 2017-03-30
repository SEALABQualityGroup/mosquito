package di.univaq.MOSQUITO.Parser.Plastic;

import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.Vector;

import org.eclipse.uml2.Actor;
import org.eclipse.uml2.Association;
import org.eclipse.uml2.UseCase;

import di.univaq.MOSQUITO.DataStructures.UseCase.ChildTree;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;


public class ParserUseCasePlastic extends Parser {
	

	// questo vettore contirne tuttta l'informazione strutturata dello use case diagram.
	private Vector tree;

	/**
	 * @param args
	 */
	public ParserUseCasePlastic(LogManager log, MOSQUITOUtils mUtils){
		super(log, mUtils);
	    tree = new Vector();
		createMultiGraph();
		//stampaTree();
	}

	/**
	 * @return  Returns the tree.
	 * @uml.property  name="tree"
	 */
	public Vector getTree() {
		return this.tree;
	}

	public void createMultiGraph() {
		Vector assoc = mUtils.getAllAssociation();
		for(int i = 0; i < assoc.size(); i++) {
			Association association = (Association)assoc.get(i);
			Vector actorUseCase = mUtils.getMembersOfAssociation(association);
			UseCase useCase = getUseCase(actorUseCase);
			di.univaq.MOSQUITO.DataStructures.UseCase.UseCase use;
			int index;
			if((index = existUseCase(useCase)) == -1) {
				use = new di.univaq.MOSQUITO.DataStructures.UseCase.UseCase(useCase.getName(), new String[0]);
				tree.add(use);
			}
			else {
				use = (di.univaq.MOSQUITO.DataStructures.UseCase.UseCase)tree.get(index);
			}
			Actor actor = getActor(actorUseCase);
			String accesUser = mUtils.getAppliedStereotype(actor,"REuser","REaccessprob",eUtils);
			String assocProb = mUtils.getAppliedStereotype(association,"REserviceUsage","REserviceprob",eUtils);
			
			// Questa è la stereotipizzazione utilizzata in Omondo, in questo modo non modifico il blocco di trasformazione
			accesUser = "<<REuser>>\n{ReAccessProb=" +accesUser+"}";
			assocProb = "<<REuser>>\n{ReService="+assocProb+"}";
			
			ChildTree child = new ChildTree();
			di.univaq.MOSQUITO.DataStructures.UseCase.Actor mosquitoActor = new di.univaq.MOSQUITO.DataStructures.UseCase.Actor(actor.getName(), new String [0]);
			mosquitoActor.setAccessProb(accesUser);
			child.setAttore(mosquitoActor);
			child.setLabels(assocProb);
			use.setChildren(child);
		}
	}

	/**
	 * Il vettore obj è composto di esattamente due elementi
	 * in particolare uno è di tipo UseCase e l'altro di tipo Actor.
	 * Questo metodo deve reperire e restituire lo UseCAse
	 * @param obj
	 * @return
	 */
	public UseCase getUseCase(Vector obj) {
		Object first = obj.get(0);
		Object second = obj.get(1);
		if(first instanceof UseCase)
			return (UseCase)first;
		else
			return (UseCase)second;
	}

	public Actor getActor(Vector obj) {
		Object first = obj.get(0);
		Object second = obj.get(1);
		if(first instanceof Actor)
			return (Actor)first;
		else
			return (Actor)second;
	}

	/**
	 * 
	 * @param usecase Attenzione il tipo di usecase è di eclipseuml2 e non della struttura dati di MOSQUITO
	 * @return
	 */
	public int existUseCase(UseCase usecase){
		for(int i = 0; i < tree.size(); i++) {
			di.univaq.MOSQUITO.DataStructures.UseCase.UseCase treeUseCase = (di.univaq.MOSQUITO.DataStructures.UseCase.UseCase)tree.get(i);
			if(treeUseCase.getName().equals(usecase.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void stampaTree() {
		for (int i = 0; i < tree.size(); i++) {
			di.univaq.MOSQUITO.DataStructures.UseCase.UseCase useCase = (di.univaq.MOSQUITO.DataStructures.UseCase.UseCase) tree.get(i);
			System.out.println("Nome Caso d'uso " + useCase.getName());
			Vector v = useCase.getChildren();
			for (int j = 0; j < v.size(); j++) {
				ChildTree c = (ChildTree) v.get(j);
				di.univaq.MOSQUITO.DataStructures.UseCase.Actor a = c.getAttore();
				System.out.println(" Nome attore associato " + a.getName());
				System.out.println(" Prob di accesso attore "+ a.getAccessProb());
				System.out.println(" Probabilita' associazione  "+ c.getLabels());
			}
		}
	}
}
