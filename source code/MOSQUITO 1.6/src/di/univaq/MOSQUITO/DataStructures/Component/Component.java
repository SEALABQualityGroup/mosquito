/*
 * Component.java
 *
 * Created on 12 agosto 2006, 12.30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Component;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Association;
import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.utility.PropertiesManager;

/**
 * @author  Fabio Calvarese
 */
public class Component extends Elem {

    // interfaccie messe a disposizione da questa componente
    private Vector interfaces;

    // etichette sulle interfaccie
    private Vector labels;

    // etichette associate ai componenti.
    private String componentLabel;

    // questo flag previene i cicli infiniti durante la scansione del component
    public boolean visited;
    
    
    // Vettore di appoggio utilizzato da parser per EclipseUML2
    private Vector <org.eclipse.uml2.uml.Interface> UML2provideInterfaces;
    
    // Vettore di appoggio utilizzato dal parser per Eclipse UML2
    private Vector <org.eclipse.uml2.uml.Interface> UML2requiredInterfaces;
    
    // Vettore di appoggio utilizzato dal parser par le Operation.
    private Vector <org.eclipse.uml2.uml.Operation> UML2Operations;
    
    /** Creates a new instance of Component */
    public Component(String name, String[] target) {
        super(name, target);
        interfaces = new Vector();
        labels = new Vector();
        visited = false;
    }
    
    public Component(String name) {
    	super(name);
    	interfaces = new Vector();
        labels = new Vector();
        visited = false;
    }
    
  

    /**
	 * @return  Returns the interfaces.
	 * @uml.property  name="interfaces"
	 */
    public Vector getInterfaces() {
        return interfaces;
    }
    
    
    /**
	 * @return  Returns the operations provided from this component.
	 * @uml.property  name="interfaces"
	 */
    public Vector<org.eclipse.uml2.uml.Operation> getUML2Operations() {
    	return UML2Operations;
    }
    
    public void setUML2Operartions(Vector<org.eclipse.uml2.uml.Operation> operations) {
    	this.UML2Operations = new Vector<org.eclipse.uml2.uml.Operation>();
    	this.UML2Operations.addAll(operations);
    }
    
    public void setUML2providedInterfaces(Vector<org.eclipse.uml2.uml.Interface> provInterf) {
    	this.UML2provideInterfaces = new Vector<org.eclipse.uml2.uml.Interface>();
    	UML2provideInterfaces.addAll(provInterf);
    	
    }
    
    public Vector<org.eclipse.uml2.uml.Interface>getUML2providedInterfaces() {
    	return UML2provideInterfaces;
    }
    
    public void setUML2requiredInterfaces(Vector<org.eclipse.uml2.uml.Interface> reqInterf) {
    	this.UML2requiredInterfaces = new Vector<org.eclipse.uml2.uml.Interface>();
    	UML2requiredInterfaces.addAll(reqInterf);
    }
    
    public Vector<org.eclipse.uml2.uml.Interface>  getUML2requiredInterfaces() {
    	return UML2requiredInterfaces;
    }

    public void setInterfaces(Interface interfaces) {
        this.interfaces.add(interfaces);
    }

    /**
	 * @return  Returns the labels.
	 * @uml.property  name="labels"
	 */
    public Vector getLabels() {
        return labels;
    }

    /**
     * Aggiunge al vettore labels un'altra etichetta associata alla interfaccia
     * @param label l'etichetta che è stata letta.
     */
    public void setLabels(String label) {
        this.labels.add(label);
    }
    
    public void loadNeighbours(Vector elements) {
        String componentLabel = findLabel(elements);
        this.setComponentLabel(componentLabel);
        // Carico le interfaccie del componente
        loadInterfaces(elements);
        // Carico le componenti che utilizzano l'interfaccia di questa componente
        loadComponent(elements);
    }
    
    public void loadInterfaces(Vector elements) {
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof Interface) {
                Interface interf = (Interface)elements.get(i);
                Association assoc = null;
                if(((assoc = interf.check(this.getTargetConnection()))!= null)
                || ((assoc = this.check(interf.getTargetConnection()))!=null)) {
                    if(assoc.getType().equals("editmodel:ComponentRealizeEditModel")) {
                        interfaces.add(interf);
                        String associatedLabel = interf.findLabel(elements);
                        labels.add(associatedLabel);
                    }
                }
            }
        }
    }
    
    public void loadComponent(Vector elements) {
        for(int i = 0; i < elements.size(); i++) {
            for(int j = 0; j < this.interfaces.size(); j++) {
                if(elements.get(i) instanceof Component) {
                    Component componente = (Component) elements.get(i);
                    Interface interf = (Interface) interfaces.get(j);
                    Association assoc = null;
                    if(((assoc = interf.check(componente.getTargetConnection()))!= null)
                    || ((assoc = componente.check(interf.getTargetConnection()))!=null)) {
                        if(assoc.getType().equals("editmodel:DependencyEditModel")) {
                            String associatedLabel = interf.findLabel(elements);
                            children.add(new Child(interf , componente , associatedLabel));
                        }
                    }
                }
            }
        }
    }
    
    /**
	 * @return  Returns the componentLabel.
	 * @uml.property  name="componentLabel"
	 */
    public String getComponentLabel() {
        return componentLabel;
    }
    
    /**
	 * @param componentLabel  The componentLabel to set.
	 * @uml.property  name="componentLabel"
	 */
    public void setComponentLabel(String componentLabel) {
        this.componentLabel = componentLabel;
    }
    
    public boolean isTheRightComponent(String componentName) {
    	
    	if(this.getName().equals(componentName))
    		return true;
    	return false;
    }
    
    
    //********************* metodi usati da Parser ComponantUML2**************/
    public org.eclipse.uml2.uml.Operation getOperation(org.eclipse.uml2.uml.Interface interf){
    	
    	for(int i = 0; i < this.UML2Operations.size(); i++) {
    		org.eclipse.uml2.uml.Operation operation = UML2Operations.get(i);
    				
    		if(operation.getType() instanceof org.eclipse.uml2.uml.Interface ) {
    			
    			org.eclipse.uml2.uml.Interface tempInt = (org.eclipse.uml2.uml.Interface) operation.getType();
    			
    			if(tempInt.equals(interf))
    				return operation;
    		
    		}
    		
    	}
    	return null;
    }
        
    public Vector<Child> getCompomponentConnection(Vector<Component> allComp,EclipseUML2UtilV2 utils) {
    	Vector<Child> toReturn = new Vector<Child>();
    	for(int u = 0; u < this.UML2requiredInterfaces.size(); u++) {
    		org.eclipse.uml2.uml.Interface interf = this.UML2requiredInterfaces.get(u);
    		
    		Child child = getChildOwned(allComp, interf, utils);
    		if(child != null) {
    			toReturn.add(child);
    		}
    	}
    	return toReturn;
    }
    
    private Child getChildOwned(Vector<Component> allComp, org.eclipse.uml2.uml.Interface requiredInterf, EclipseUML2UtilV2 utils) {
    	for(int i = 0; i < allComp.size(); i++) {
    		Component comp = allComp.get(i);
    		for(int u = 0; u < comp.getUML2providedInterfaces().size(); u++) {
    			org.eclipse.uml2.uml.Interface providedInt = comp.getUML2providedInterfaces().get(u);
    			if(providedInt.equals(requiredInterf)){
    				org.eclipse.uml2.uml.Operation operation = comp.getOperation(providedInt);
    	    		String sterValue="";
    	    		if(operation != null) {
    	    			String paDemand = utils.getPropertyValue(operation, "PAprofile","paStep","PAdemand");
    					String paDelay = utils.getPropertyValue(operation, "PAprofile","paStep","PAdelay");
    					
    					sterValue = utils.getStereotypeServiceTyme("paStep", paDemand, paDelay);
    	    		}
    	    		return new Child(new Interface(providedInt.getName()),comp,sterValue);
    			}
    		}
    	}
    	return null;
    }
    
}


