/*
 * GenericException.java
 *
 * Created on 13 marzo 2007, 15.32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.exceptions;

/**
 *
 * @author Dave Wilson
 */
public class GenericException extends Exception {
    
    /** Creates a new instance of GenericException */
    public GenericException() {
        super("Generic error.");
    }
    
    public String toString() {
        return this.getMessage();
    }
    
}
