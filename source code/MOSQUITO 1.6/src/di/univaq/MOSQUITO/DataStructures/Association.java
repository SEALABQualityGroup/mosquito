/*
 * Association.java
 *
 * Created on 2 agosto 2006, 10.05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures;


/**
 * @author  Fabio Calvarese
 */
public class Association extends Elem{

    private String type ="";

    private String sourceConnection;

    /** Creates a new instance of Association */
    public Association(String target, String source) {
    
    	super("", target.split("//"));
        String[] app  = source.split("/@");
        int length = app[app.length-1].length();
        int all_Length= source.length();
        sourceConnection = source.substring(0, all_Length - (length+2));
    }
    
    public Association(){}

    public String getSourceEnd() {
        return this.sourceConnection;
    }

    /**
	 * @return  Returns the type.
	 * @uml.property  name="type"
	 */
    public String getType() {
        return type;
    }

    /**
	 * @param type  The type to set.
	 * @uml.property  name="type"
	 */
    public void setType(String type) {
        this.type = type;
    }
    
}
