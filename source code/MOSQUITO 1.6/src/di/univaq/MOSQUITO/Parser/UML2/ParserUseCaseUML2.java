package di.univaq.MOSQUITO.Parser.UML2;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;

import di.univaq.MOSQUITO.DataStructures.UseCase.ChildTree;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;

public class ParserUseCaseUML2 extends Parser{
	
	private Vector tree;
	
	public ParserUseCaseUML2(Model model,EclipseUML2UtilV2 utils, LogManager log){
		super(utils,log);
		tree = new Vector();
		loadUseCaseDiagram(model);
	}
	
	/**
	 * @return  Returns the tree.
	 * @uml.property  name="tree"
	 */
	public Vector getTree() {
		return this.tree;
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
	
    public void loadUseCaseDiagram(org.eclipse.uml2.uml.Package pck) {
    	for (Iterator<EObject> i = pck.eAllContents(); i.hasNext();) {
			EObject e = (EObject) i.next();

			/*if (e instanceof UseCase) {
				UseCase usecase = (UseCase) e;
				//System.out.println("Use Case " + usecase.getName());
			}

			if (e instanceof Actor) {
				Actor actor = (Actor) e;
				//System.out.println("Attore " + actor.getName());
			}*/

			if (e instanceof Association) {
				Association assoc = (Association) e;
				Vector members = getMembersOfAssociation(assoc);
				if(members.size() == 0)
					continue;
				UseCase useCase = getUseCase(members);
				di.univaq.MOSQUITO.DataStructures.UseCase.UseCase use;	
			    int index;
			    if((index = existUseCase(useCase)) == -1) {
			    	use = new di.univaq.MOSQUITO.DataStructures.UseCase.UseCase(useCase.getName(), new String[0]);
			    	tree.add(use);
			    }
			    else {
			    	use = (di.univaq.MOSQUITO.DataStructures.UseCase.UseCase)tree.get(index);
			    }
			    Actor actor = getActor(members);
			    
			    String accesUser = utils.getPropertyValue(actor, "REprofile", "REuser","REaccessprob");
			    String assocProb = utils.getPropertyValue(assoc, "REprofile", "REserviceUsage","REserviceprob");
			    
							    
			    accesUser = "<<REuser>>\n{ReAccessProb=" +accesUser+"}";
			    assocProb = "<<REuser>>\n{ReService="+assocProb+"}"; 
			    //String accesUser="";
			    //String assocProb="";
			    
			    ChildTree child = new ChildTree();
				di.univaq.MOSQUITO.DataStructures.UseCase.Actor mosquitoActor = new di.univaq.MOSQUITO.DataStructures.UseCase.Actor(actor.getName(), new String [0]);
				mosquitoActor.setAccessProb(accesUser);
				child.setAttore(mosquitoActor);
				child.setLabels(assocProb);
				use.setChildren(child);
			}
		}
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
    
 /*   public void AssociationExtreme(Vector members){
    
		for(int i = 0; i < members.size(); i++ ) {
			Object obj = members.get(i);
			System.out.println("Estremo " + i);
			if(obj instanceof Actor) {
				Actor act = (Actor) obj;
				//System.out.print(" = attore " + act.getName());
			}
			if(obj instanceof UseCase) {
				UseCase useCase = (UseCase) obj;
				//System.out.print(" = use case " + useCase.getName());
			}
		}
		
	}*/
	
	
	public Vector getMembersOfAssociation(Association assoc) {
		Vector members = new Vector();
		EList listMember = assoc.getMemberEnds();
		for(int j = 0; j < listMember.size(); j++) {
			Property prop = (Property)listMember.get(j);
			if (prop.getType() instanceof UseCase) {
				UseCase useCase = (UseCase) prop.getType();
				members.add(useCase);
				continue;
			}
			
			if(prop.getType() instanceof Actor) {
				Actor actor = (Actor) prop.getType();
				members.add(actor);
			}
		}
		return members;
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

}
