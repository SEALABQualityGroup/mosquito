/*
 * Elem.java
 *
 * Created on 1 agosto 2006, 14.05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Association;

/**
 * @author  Fabio Calvarese
 */
public abstract class Elem implements Element{
    
    // nome del corrente nodo.
    protected String name;
    
    // elementi associati al corrente nodo del grafo.
    protected Vector children;
    
    // id di riferimento per le associazioni entranti.
    protected String[] targets;
    
    // id di riferimento per le associazioni uscenti.
    protected Vector sourceConnection;
    
    // posizione x primo punto.
    protected int x1 = 0;
    // posizione y primo punto.
    protected int y1 = 0;
    // posizione x secondo punto.
    protected int x2 = 0;
    // posizione y secondo punto.
    protected int y2 = 0;
    
    public Elem(){}
    /** Creates a new instance of Element */
    public Elem(String name, String[] target) {
        children = new Vector();
        sourceConnection = new Vector();
        this.name = name;
        setTargets(target);
    }

    // costruttore per instance
    public Elem(String name) {
        children = new Vector();
        sourceConnection = new Vector();
        this.name = name;
    }

    // questo metodo elabora i targets
    /* (non-Javadoc)
	 * @see DataStructures.Inter#setTargets(java.lang.String[])
	 */
    
    public void setTargets(String[] target) {
        for(int i = 1; i < target.length; i++) {
            target[i] = "//"+target[i];
            target[i] = target[i].replaceAll(" ", "");
        }
        this.targets = target;
    }
    
    
    public void setNormalTarget(String[] target) {
        this.targets = target;
    }
    
    public void addAssociation(Association association) {
        this.sourceConnection.add(association);
    }
    
    public String[] getTargetConnection() {
        return this.targets;
    }
    
    /* (non-Javadoc)
	 * @see DataStructures.Inter#setChildren(java.util.Vector)
	 */
    public void setChildren(Vector childs) {
        this.children = childs;
    }
    
    /**
	 * @return  Returns the children.
	 * @uml.property  name="children"
	 */
    public Vector getChildren() {
        return this.children;
    }
    
    /**
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
    public String getName() {
        return this.name;
    }
    
    /**
	 * @return  Returns the sourceConnection.
	 * @uml.property  name="sourceConnection"
	 */
    public Vector getSourceConnection() {
        return this.sourceConnection;
    }
    
    public Association check(String[] targets) {
        for(int i = 0; i < targets.length; i++) {
            Association assoc = check(targets[i]);
            if( assoc!= null) {
                return assoc;
            }
        }
        return null;
    }
    
    public Association check(String target) {
        if(sourceConnection != null) {
            for(int i = 0; i < sourceConnection.size(); i++){
                String sourceEnd = ((Association) sourceConnection.get(i)).getSourceEnd();
                if(sourceEnd.equals(target))
                    return (Association) sourceConnection.get(i);
            }
        }
        return null;
    }
    
    public boolean checkEnteringAssoc(Association as) {
        String sourceEnd = as.getSourceEnd();
        for(int i = 0; i < getTargetConnection().length; i++) {
            if(getTargetConnection()[i].equals(sourceEnd))
                return true;
        }
        return false;
    }
    
    /* (non-Javadoc)
	 * @see DataStructures.Inter#setLocation(java.lang.String, java.lang.String)
	 */
    public void setLocation(String location, String size) {
        this.x1  = Integer.parseInt(location.substring(0, location.indexOf(",")));
        this.y1  =  Integer.parseInt(location.substring(location.indexOf(",")+1, location.length()));
        this.x2  = Integer.parseInt(size.substring(0, size.indexOf(",")));
        this.y2  =  Integer.parseInt(size.substring(size.indexOf(",")+1, size.length()));
    }
    
    public String findLabel(Vector elements) {
        for(int j = 0; j < this.getTargetConnection().length; j++) {
            for(int i = 0; i < elements.size(); i++) {
                if(elements.get(i) instanceof Label) {
                    Label lab = (Label) elements.get(i);
                    if(lab.check(this.getTargetConnection()[j]) != null) {
                        return lab.getName();
                    }
                }
            }
        }
        return "";
    }
    
       /**
	 * @return  Returns the x1.
	 * @uml.property  name="x1"
	 */
    public int getX1() {
        return this.x1;
    }

    /**
	 * @return  Returns the y1.
	 * @uml.property  name="y1"
	 */
    public int getY1() {
        return this.y1;
    }
    
    /**
	 * @return  Returns the x2.
	 * @uml.property  name="x2"
	 */
    public int getX2() {
        return this.x2;
    }
    
    /**
	 * @return  Returns the y2.
	 * @uml.property  name="y2"
	 */
    public int getY2() {
        return this.y2;
    }

    /**
	 * @param x1  The x1 to set.
	 * @uml.property  name="x1"
	 */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
	 * @param y1  The y1 to set.
	 * @uml.property  name="y1"
	 */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
	 * @param x2  The x2 to set.
	 * @uml.property  name="x2"
	 */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
	 * @param y2  The y2 to set.
	 * @uml.property  name="y2"
	 */
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    
    /*
     * Alcuni elementi non fanno uso di tale metodo, quindi � stata
     * effettuata tale implementazione astratta.
     * 
     */
    public void loadNeighbours(Vector elements) {
    }
}
