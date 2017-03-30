/*
 * Messages.java
 *
 * Created on 7 agosto 2006, 13.32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Sequence;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Association;

/**
 * @author  Fabio Calvarese
 */
public class Messages extends Association {
    
    private String sequenceNumber;
    // indica se il messaggio e' di ritorno
    private boolean isReturned;
    // se true significa che dopo this message c'e' un return message
    private String returning;
    private String synchronization;
    private Fragment root;
    private Fragment pather;
    public boolean visitated;
    private String serviceLabel = "";
    public boolean forkedMessage = false;
    private String associatedLabel = "";
    private String prob = "";
   // private static int count = 0;
    
    /** Creates a new instance of Messages */
    public Messages(String target, String source) {
        super(target, source);
        sequenceNumber = "-1";
        setPather(null);
        setRoot(null);
        setIsReturned(false);
        visitated = false;
    }

    public Messages(String name){
    	this.setName(name);
    	sequenceNumber = "-1";
        setPather(null);
        setRoot(null);
        setIsReturned(false);
        visitated = false;
    }
    
    public void setLabel(String associatedlabel) {
    	this.associatedLabel = associatedlabel;
    }

    public String getLabel() {
    	return this.associatedLabel;
    }

    public void setProb(String prob) {
    	this.prob = prob;
    }
    
    public String getProb() {
    	return this.prob;
    }

    public boolean less(Messages mess) {
        if(mess == null)
        	return true;
    	String[] partSeqThis = this.getSequenceNumber().split("\\.");
    	String[] partSeqMess = mess.getSequenceNumber().split("\\.");
    	if (partSeqThis.length < partSeqMess.length) {
    		partSeqThis = setSeqLength(partSeqMess, partSeqThis );
    	}
    	if(partSeqThis.length > partSeqMess.length)
    		partSeqMess = setSeqLength(partSeqThis , partSeqMess);
    	int thisSequence = Integer.parseInt(createString(partSeqThis));
    	int mesSeq = Integer.parseInt(createString(partSeqMess));
    	if(thisSequence < mesSeq)
    		return true;
    	return false;
    }

    public boolean max(Messages mess) {
    	if(mess == null)
         	return true;
     	String[] partSeqThis = this.getSequenceNumber().split("\\.");
     	String[] partSeqMess = mess.getSequenceNumber().split("\\.");
     	if (partSeqThis.length < partSeqMess.length) {
     		partSeqThis = setSeqLength(partSeqMess, partSeqThis );
     	}
     	if(partSeqThis.length > partSeqMess.length)
     		partSeqMess = setSeqLength(partSeqThis , partSeqMess);
     	int thisSequence = Integer.parseInt(createString(partSeqThis));
     	int mesSeq = Integer.parseInt(createString(partSeqMess));
     	if(thisSequence > mesSeq)
     		return true;
     	return false;
    }
    
    public String createString(String[] sequence){
    	String toReturn ="";
    	for(int i = 0; i < sequence.length; i++) {
    		toReturn += sequence[i];
    	}
    	return toReturn;
    }
    
    public String[] setSeqLength(String[] partSeqMess, String[]  partSeqThis ) {
    	int length = partSeqMess.length - partSeqThis.length;
		String[] str = new String[partSeqThis.length + length];
		for (int i = 0; i < partSeqThis.length; i++) {
			str[i] = partSeqThis[i];
		}
		for(int i = partSeqThis.length; i < partSeqThis.length + length; i++) {
			str[i] = "0";
		}
		return str;
    }

   

    /**
	 * @param synchronization  The synchronization to set.
	 * @uml.property  name="synchronization"
	 */
    public void setSynchronization(String sync) {
    	this.synchronization = sync;
    }
    
    /**
	 * @param serviceLabel  The serviceLabel to set.
	 * @uml.property  name="serviceLabel"
	 */
    public void setServiceLabel(String service){
    	this.serviceLabel = service;
    }
    
    /**
	 * @param returning  The returning to set.
	 * @uml.property  name="returning"
	 */
    public void setReturning(String returning) {
    	this.returning = returning;
    }
    
    /**
	 * @return  Returns the returning.
	 * @uml.property  name="returning"
	 */
    public String getReturning() {
    	return this.returning;
    }
    
    public boolean isReturning() {
    	if(this.returning.equals(""))
    			return false;
    	return true;
    }
    
    /**
	 * @return  Returns the serviceLabel.
	 * @uml.property  name="serviceLabel"
	 */
    public String getServiceLabel() {
    	return this.serviceLabel;
    }
    
    public String getSyncronization() {
    	if (this.synchronization.equals("")) {
    		return "synchronous";
    	}
    	return synchronization;
    }
    
    /**
	 * @param sequenceNumber  The sequenceNumber to set.
	 * @uml.property  name="sequenceNumber"
	 */
    public void setSequenceNumber(String sequenceNumber) {
    	// il messaggio di return non ha sequence number 
        if(!sequenceNumber.equals("")) 
            this.sequenceNumber = sequenceNumber;
    }
    
    /**
	 * @return  Returns the sequenceNumber.
	 * @uml.property  name="sequenceNumber"
	 */
    public String getSequenceNumber() {
        return this.sequenceNumber;
    }
    
    public boolean isIsReturned() {
        return isReturned;
    }
    
    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }
    

    public void setName(String name) {
    	
        this.name = name;
     /*  if(name!=""){
       	this.name+=count;
            count++;
        }*/
    }

    public void setLocation(String location) {
        this.setX1(Integer.parseInt(location.substring(0, location.indexOf(","))));
        this.setY1(Integer.parseInt(location.substring(location.indexOf(",")+1, location.length())));
    }

    public void addYLocation(String location) {
    	if(!location.equals(""))
    	this.setY1(Integer.parseInt(location.substring(location.indexOf(",")+1, location.length()))+ this.getY1());
    }

    public boolean checkEnterInFrag(Fragment frag) {
        if(this.x1 >= frag.getX1() && this.x1 <= frag.getX2() ) {
            if(this.y1 >= frag.getY1() && this.y1 <= frag.getY2())
                if(this.x2 >= frag.getX1() && this.x2 <= frag.getX2() )
                    if(this.y2 >= frag.getY1() && this.y2 <= frag.getY2()) {
                //System.out.println("Il messaggio " + this.getName()+ " dentro " + frag.getName());
                return true;
                    }
        }
        return false;
    }

    public void loadFrag(Fragment frag) {
        for(int i = 0; i < frag.getChildren().size(); i++) {
            Fragment frChild = (Fragment) frag.getChildren().get(i);
            if (this.checkEnterInFrag(frChild)) {
                this.pather = frChild;
                loadFrag(frChild);
            }
        }
        return;
    }

    public void loadNumberSequence(Vector elements) {
    	for(int i = 0; i < elements.size(); i++) {
    		if(elements.get(i) instanceof Instance) {
    			Instance ins = (Instance) elements.get(i);
    			for(int j = 0; j < ins.getMessages().size(); j++) {
    				Messages m = (Messages) ins.getMessages().get(j);
    				if(m.getSourceEnd().equals(this.getReturning())) {
    				    m.sequenceNumber = this.sequenceNumber;
    				    //Lariga successiva deve essere inserita se si utilizzano i messaggidiritorno in XPRIT
    				    // m.name = this.name + "Reply";
    				    return;
    				}
    			}
    		}
    	}
    }

    /**
	 * @return  Returns the root.
	 * @uml.property  name="root"
	 */
    public Fragment getRoot() {
        return root;
    }

    /**
	 * @param root  The root to set.
	 * @uml.property  name="root"
	 */
    public void setRoot(Fragment root) {
        this.root = root;
    }

    /**
	 * @return  Returns the pather.
	 * @uml.property  name="pather"
	 */
    public Fragment getPather() {
        return pather;
    }

    /**
	 * @param pather  The pather to set.
	 * @uml.property  name="pather"
	 */
    public void setPather(Fragment pather) {
        this.pather = pather;
    }
    
    public Fragment getFragPrevius() {
    	if(this.getPather()==null)
    		return null;
    	return this.getPather().fragFather;
    }
}
