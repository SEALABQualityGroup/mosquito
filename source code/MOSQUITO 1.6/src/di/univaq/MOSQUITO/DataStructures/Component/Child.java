/*
 * Child.java
 *
 * Created on 12 agosto 2006, 17.21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Component;

/**
 * @author  Fabio Calvarese
 */
public class Child {
    
    private Interface interf;
    private Component component;
    private String label;
    
    public Child(Interface interf, Component comp, String str) {
        this.setInterf(interf);
        this.setComponent(comp);
        this.setLabel(str);
    }

    /**
	 * @return  Returns the interf.
	 * @uml.property  name="interf"
	 */
    public Interface getInterf() {
        return interf;
    }

    /**
	 * @param interf  The interf to set.
	 * @uml.property  name="interf"
	 */
    public void setInterf(Interface interf) {
        this.interf = interf;
    }

    /**
	 * @return  Returns the component.
	 * @uml.property  name="component"
	 */
    public Component getComponent() {
        return component;
    }

    /**
	 * @param component  The component to set.
	 * @uml.property  name="component"
	 */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
	 * @return  Returns the label.
	 * @uml.property  name="label"
	 */
    public String getLabel() {
        return label;
    }

    /**
	 * @param label  The label to set.
	 * @uml.property  name="label"
	 */
    public void setLabel(String label) {
        this.label = label;
    }
    
}
