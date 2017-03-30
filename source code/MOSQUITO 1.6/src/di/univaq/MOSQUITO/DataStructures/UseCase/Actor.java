/*
 * Actor.java
 *
 * Created on 1 agosto 2006, 14.22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.UseCase;

import di.univaq.MOSQUITO.DataStructures.Elem;

/**
 *
 * @author Fabio Calvarese
 */
public class Actor extends Elem{
    
    // probabilit� di fare accesso al sistema
    private String probAccess;
    
    /** Creates a new instance of Actor */
    public Actor(String name, String[] target) {
        super(name, target);
    }
    
    public void setAccessProb(String accessProb) {
        this.probAccess = accessProb;
    }
    
    public String getAccessProb() {
        return this.probAccess;
    }
        
   
}
