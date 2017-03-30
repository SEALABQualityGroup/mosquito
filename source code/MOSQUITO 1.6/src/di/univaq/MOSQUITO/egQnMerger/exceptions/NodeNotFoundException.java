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
public class NodeNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public NodeNotFoundException(String graphName, String nodeName) {
        super("Cannot find " + nodeName + " node in " + graphName + " Execution Graph.");
    }
    
    public NodeNotFoundException(String PSFileName, String PSName, String nodeName) {
        super("Cannot find " + nodeName + " node in " + PSName + " Performance Scenario. \n" + 
               "Performance Scenario file name: " + PSFileName);
    }
    
    public NodeNotFoundException(di.univaq.MOSQUITO.egQnMerger.EG.PSType ps, String nodeName) {
        super("Cannot find " + nodeName + " node in " + ps.getScenarioName() + " Performance Scenario.");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
