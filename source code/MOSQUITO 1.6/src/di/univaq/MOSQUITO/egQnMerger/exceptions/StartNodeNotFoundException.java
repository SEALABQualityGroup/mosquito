/*
 * CannotDeriveQNMWorkloadTypeException.java
 *
 * Created on 21 maggio 2007, 15.26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.exceptions;

/**
 *
 * @author Dave Wilson
 */
public class StartNodeNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public StartNodeNotFoundException(di.univaq.MOSQUITO.egQnMerger.EG.EGType graph) {
        super("Cannot find " + graph.getEGname() + "'s start node (" + graph.getStartNode() + ").");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
