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
public class DeviceNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public DeviceNotFoundException(String deviceName) {
        super("Cannot find the Device " + deviceName + ".");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
