/*
 * CannotDeriveQNMWorkloadTypeException.java
 *
 * Created on 21 maggio 2007, 15.26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.exceptions;

import PmifSchema.ClosedWorkloadType;
import PmifSchema.OpenWorkloadType;

/**
 *
 * @author Dave Wilson
 */
public class CannotDeriveQNMWorkloadTypeException extends Exception {
    
    
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public CannotDeriveQNMWorkloadTypeException(OpenWorkloadType openWorkload) {
        super("Cannot derive the type of the " + openWorkload.getWorkloadName() + " workload.");
    }
    
    public CannotDeriveQNMWorkloadTypeException(ClosedWorkloadType closedWorkload) {
        super("Cannot derive the think device of the " + closedWorkload.getWorkloadName() + " workload.");
    }
    
    public CannotDeriveQNMWorkloadTypeException(di.univaq.MOSQUITO.egQnMerger.EG.PSType ps) {
        super("Cannot transform the " + ps.getScenarioName() + " Performance Scenario in a workload: \n" +
              ps.getScenarioName() + " InterarrivalTime = " + ps.getInterarrivalTime() +
              "; " + ps.getScenarioName() + " NumberOfJobs = " + ps.getNumberOfJobs());
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
