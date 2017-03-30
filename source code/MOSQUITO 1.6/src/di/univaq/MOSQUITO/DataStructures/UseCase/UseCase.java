/*
 * UseCase.java
 *
 * Created on 1 agosto 2006, 14.24
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
public class UseCase extends Elem{

    /** Creates a new instance of UseCase */
    public UseCase(String name, String[] target ) {
        super(name, target);
    }
    
    public void setChildren(ChildTree child) {
    	this.children.add(child);
    }
}
