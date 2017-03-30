/*
 * UseOfDocumentProcessorWithoutGraphic.java
 *
 * Created on 13 giugno 2007, 16.39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.egQnMerger.main;

import di.univaq.MOSQUITO.egQnMerger.processors.*;

/**
 *
 * @author Dave Wilson
 */
public class startMergeQnEg {
    
    /**
     * Creates a new instance of UseOfDocumentProcessorWithoutGraphic
     */
    public startMergeQnEg(String egFile, String qnFile) {
    	start(egFile, qnFile);
    }
    
    public void start (String egFile, String qnFile) {
        new DocumentProcessor().parametrize(egFile, qnFile);
    }
    
}
