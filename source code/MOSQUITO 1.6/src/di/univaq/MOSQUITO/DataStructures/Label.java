/*
 * Label.java
 *
 * Created on 1 agosto 2006, 15.34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures;

/**
 *
 * @author Fabio Calvarese
 */
public class Label extends Elem{

    /** Creates a new instance of Etichetta */
    public Label(String note, String[] target) {
        super(note, target);
    }
    
    public void setNote(String note) {
        this.name = note;
    }
    
    public String getNote() {
        return this.name;
    }
        
}
