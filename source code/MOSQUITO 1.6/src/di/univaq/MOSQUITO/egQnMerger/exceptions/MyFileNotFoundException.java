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
public class MyFileNotFoundException extends Exception {
    
    /** Creates a new instance of CannotDeriveQNMWorkloadTypeException */
    public MyFileNotFoundException(String message/*fileName*/) {
        super(message/*"Cannot find the file: " + fileName + "."*/);
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
