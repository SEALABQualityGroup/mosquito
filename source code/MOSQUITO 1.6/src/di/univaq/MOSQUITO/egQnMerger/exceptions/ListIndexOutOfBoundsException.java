/*
 * ListIndexOutOfBoundsException.java
 *
 * Created on 13 marzo 2007, 18.09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.exceptions;

/**
 *
 * @author Dave Wilson
 */
public class ListIndexOutOfBoundsException extends Exception {
    
    /** Creates a new instance of ListIndexOutOfBoundsException */
    public ListIndexOutOfBoundsException() {
    }
    
    public String toString() {
        return this.getMessage();
    }
}
