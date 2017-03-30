package di.univaq.MOSQUITO.Parser.UML2;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Realization;

import di.univaq.MOSQUITO.DataStructures.Component.Child;
import di.univaq.MOSQUITO.DataStructures.Component.Component;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;


public class ParserComponentUML2 extends Parser {
	
	
	public ParserComponentUML2(Model model,EclipseUML2UtilV2 utils, LogManager log){
		super(utils, log);
		loadComponentDiagram(model);
	}
	
	public void loadComponentDiagram(org.eclipse.uml2.uml.Package pck) {
		Vector<Component> allComp = new Vector<Component>();
		for (Iterator<EObject> i = pck.eAllContents(); i.hasNext();) {
			EObject e = (EObject) i.next();
			if (e instanceof org.eclipse.uml2.uml.Component) {
				org.eclipse.uml2.uml.Component cmp = (org.eclipse.uml2.uml.Component) e;	
				Component mosquitoComp = new Component(cmp.getName());
				String tagValue = utils.getPropertyValueNoError(cmp, "PAprofile","paHost","PAschdPolicy");
				
				mosquitoComp.setComponentLabel(formatStereotypeValue("paHost", tagValue));
                this.elements.add(mosquitoComp);
				List cmpContents = cmp.eContents();
				Vector<Operation> provided_operation = getProvidedOperation(cmpContents);
				mosquitoComp.setUML2Operartions(provided_operation);
				for(int j=0; j < provided_operation.size(); j++ ) {
					Operation operation =  provided_operation.get(j);
					mosquitoComp.setInterfaces(new di.univaq.MOSQUITO.DataStructures.Component.Interface(operation.getName()));
					String paDemand = utils.getPropertyValue(operation, "PAprofile","paStep","PAdemand");
					String paDelay = utils.getPropertyValue(operation, "PAprofile","paStep","PAdelay");
					
					String sterValue = utils.getStereotypeServiceTyme("paStep", paDemand, paDelay);
					
					mosquitoComp.setLabels(sterValue);
	    		}
				   Vector<Interface> provided_interfaces = getProvidedInterfaces(cmpContents);
                   Vector<Interface> allInterface = getProvidedAndRequiredInterfaces(cmp);
				   Vector<Interface> required_interfaces = getRequiredInterfaces(allInterface, provided_interfaces);
				   mosquitoComp.setUML2providedInterfaces(provided_interfaces);
				   mosquitoComp.setUML2requiredInterfaces(required_interfaces);
				   allComp.add(mosquitoComp);
			}
		}
		loadComponentChildren(allComp);
		
		// Attenzione se la print viene abilitata la struttura dati non si popola per il flag che viene impostato quindi la trasformazione non sarà corretta
		//printGraph();
	}
	
	
	public void loadComponentChildren(Vector<Component> allComp){
		for(int i = 0; i < allComp.size(); i++) {
			Component cmp = allComp.get(i);
			Vector<Child> ownedComp = cmp.getCompomponentConnection(allComp,utils);
			cmp.setChildren(ownedComp);
		}
	}
	
	
	  public void printGraph() {
		  for(int i = 0; i < elements.size(); i++){
			  if(elements.get(i) instanceof Component){
				  Component comp = (Component) elements.get(i);
	              print(comp);
	              System.out.println();
	              }
			  }
		  }
	
	
	 // Visita in ampiezza dell'albero
    public void print(Component comp) {
    	if (!comp.visited) {
    		comp.visited = true;
    		  System.out.println("componente " + comp.getName());
    	        System.out.println(comp.getComponentLabel());
        for(int i = 0; i < comp.getChildren().size(); i++){
            Child c = (Child) comp.getChildren().get(i);
            // print(c.getComponent());
             System.out.println("interfaccia " + c.getInterf().getName());
             System.out.println("label " + c.getLabel());
              //System.out.println("figlio " );
        }
        
        for(int i = 0; i < comp.getChildren().size(); i++){
            Child c = (Child) comp.getChildren().get(i); 
            print(c.getComponent());
           }
    	}
        
    }
	

	/*
	 * System.out.println(mdl.getName());
	 * 
	 * for(int i = 0; i < mdl.getAllAppliedProfiles().size(); i++){ Profile prof =
	 * (Profile)mdl.getAllAppliedProfiles().get(i);
	 * System.out.println(prof.getName());
	 */
	public Vector<Interface> getRequiredInterfaces(
			Vector<Interface> allInterface,
			Vector<Interface> provided_interfaces) {
		Vector<Interface> required_interface = new Vector<Interface>();
		for (int r = 0; r < provided_interfaces.size(); r++) {
			allInterface.removeElement(provided_interfaces.get(r));
		}
		for (int r = 0; r < allInterface.size(); r++) {
			Interface interf = allInterface.get(r);
			required_interface.add(interf);
		}
		return required_interface;
	}

	public Vector<Interface> getProvidedInterfaces(List componentContents) {
		Vector<Interface> provided_interfaces = new Vector<Interface>();
		for (int index = 0; index < componentContents.size(); index++) {
			Object elemento = componentContents.get(index);
			if (elemento instanceof Realization) {
				Realization operation = (Realization) elemento;
				List l = operation.getSuppliers();
				for (int w = 0; w < l.size(); w++) {
					if (l.get(w) instanceof Interface) {
						Interface inter = (Interface) l.get(w);
						provided_interfaces.add(inter);
					}
				}
			}
		}
		return provided_interfaces;
	}
	
	public Vector<Operation> getProvidedOperation(List componentContents) {
		Vector<Operation> provided_operations = new Vector<Operation>();
		for (int index = 0; index < componentContents.size(); index++) {
			Object elemento = componentContents.get(index);
		    if (elemento instanceof Operation) {
			    Operation op = (Operation)elemento;		        
		        provided_operations.add(op);
		   }
		}
		return provided_operations;
	}

	public Vector<Interface> getProvidedAndRequiredInterfaces(org.eclipse.uml2.uml.Component cmp) {
		Vector<Interface> allInterface = new Vector<Interface>();
		List list = cmp.getClientDependencies();
		//System.out.println("Owner "+cmp.getOwnedElements());
		for (int i = 0; i < list.size(); i++) {
			Dependency dep = (Dependency) list.get(i);
			Vector<NamedElement> suppliers = new Vector<NamedElement>(dep.getSuppliers());
			for (NamedElement ne : suppliers) {
				if (ne instanceof Interface) {
					Interface interf = (Interface) ne;
					allInterface.add(interf);	
				}
			}
		}
		return allInterface;
	}
	
	  public String formatStereotypeValue(String sterName, String tagValue){
	    	 
		 if("".equals(tagValue))
	  		 return "";
		 
	    	 return "<<"+sterName+">>\n{PAschdPolicy='"+tagValue+"'}"; 
	  }
}
