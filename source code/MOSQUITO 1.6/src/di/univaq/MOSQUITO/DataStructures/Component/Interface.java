/*
 * Interface.java
 *
 * Created on 12 agosto 2006, 12.43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Component;

import di.univaq.MOSQUITO.DataStructures.Elem;

/**
 *
 * @author Fabio Calvarese
 */
public class Interface extends Elem {

    /** Creates a new instance of Instance */
    public Interface(String name, String[] targets) {
        super(name, targets);
    }
    public Interface(String name){
    	super(name);
    }
}
