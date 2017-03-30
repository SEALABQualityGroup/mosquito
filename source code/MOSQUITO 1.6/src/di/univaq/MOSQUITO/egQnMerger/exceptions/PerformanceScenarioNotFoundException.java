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
public class PerformanceScenarioNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public PerformanceScenarioNotFoundException(String PSName) {
        super("Cannot find " + PSName + " Performance Scenario.");
    }
    
    public PerformanceScenarioNotFoundException(String PSFileName, String PSName) {
        super("Cannot find " + PSName + " Performance Scenario in " + PSFileName + ".");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
