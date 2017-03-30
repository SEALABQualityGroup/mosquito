/*
 * ChildTree.java
 *
 * Created on 3 agosto 2006, 10.47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.UseCase;

/**
 * @author  Fabio Calvarese
 */
public class ChildTree {

    // attore associato al caso d'uso.
    private Actor attore;

    // inserisco solo lo stereotipo che mi interessa
    private String labels;

    /** Creates a new instance of ChildTree */
    public ChildTree() {
    }

    /**
	 * @return  Returns the attore.
	 * @uml.property  name="attore"
	 */
    public Actor getAttore() {
        return attore;
    }

    /**
	 * @param attore  The attore to set.
	 * @uml.property  name="attore"
	 */
    public void setAttore(Actor attore) {
        this.attore = attore;
    }

    /**
	 * @return  Returns the labels.
	 * @uml.property  name="labels"
	 */
    public String getLabels() {
        return labels;
    }

    /**
	 * @param labels  The labels to set.
	 * @uml.property  name="labels"
	 */
    public void setLabels(String labels) {
        this.labels = labels;
    }
}
