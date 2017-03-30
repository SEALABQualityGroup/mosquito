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
public class ExecutionGraphNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public ExecutionGraphNotFoundException(String EGName) {
        super("Cannot find " + EGName + " Execution Graph.");
    }
    
    public ExecutionGraphNotFoundException(String PSName, String EGName) {
        super("Cannot find " + EGName + " Execution Graph in " + PSName + " Performance Scenario.");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
