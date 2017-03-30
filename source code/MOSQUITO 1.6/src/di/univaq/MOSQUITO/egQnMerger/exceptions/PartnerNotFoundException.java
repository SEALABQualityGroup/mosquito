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
public class PartnerNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public PartnerNotFoundException(di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType synchroNode) {
        super("Cannot find " + synchroNode.getNodeName() + "'s partner: \n" +
                "Partner name: " + synchroNode.getPartnerName() +
                "; Partner's Performance Scenario file name: " + synchroNode.getPartnerPerfFileName() +
                "; Partner's Performance Scenario name: " + synchroNode.getPartnerPerfScenarioName());
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
