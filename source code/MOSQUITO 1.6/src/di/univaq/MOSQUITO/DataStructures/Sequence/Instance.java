/*
 * Instance.java
 *
 * Created on 7 agosto 2006, 13.31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Sequence;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Label;

/**
 * @author  Fabio Calvarese
 */
public class Instance extends Elem {

	// se true this class rappresenta un utente altrim una istanza
	private boolean actor = false;

	// Vettore dei messaggi che portano alle istanze associate (il vettore di
	// Instance � children in Elem)
	private Vector messages;

	// Etichette sulle associazioni
	private Vector labels;

	// Service policy viene utilizzato per controllare se e' un nodo delay e per
	// la politica di servizio
	private String servicePolicy = "";
	
	private Vector pasteps;
	
	private int pastepIndex = -1;

	/** Creates a new instance of Instance */
	public Instance(String name) {
		super(name);
		messages = new Vector();
		labels = new Vector();
		pasteps = new Vector();
	}

	public void setActor() {
		actor = true;
	}

	public void addStepIndex() {
		pastepIndex ++;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public boolean isAnActor() {
		return this.actor;
	}
	
	public void setStep(Vector step) {
		this.pasteps = step;
	}

	public String getStep() {
		try{
		   return pasteps.get(pastepIndex).toString();
		}
		catch(IndexOutOfBoundsException e){
			return "";
		}
	}
	
	public boolean isDelay() {
		if(this.getServicePolicy().equals("IS"))
		    return true;
	    return false;
	}
	
	/**
	 * @param servicePolicy  The servicePolicy to set.
	 * @uml.property  name="servicePolicy"
	 */
	public void setServicePolicy(String servicePolicy) {
		
		if(!servicePolicy.equals("")) {
		   int startIndex = servicePolicy.indexOf("'");
		   int endIndex = servicePolicy.indexOf("'",startIndex+1);
		   if(startIndex!= -1 && endIndex != -1) {
			   this.servicePolicy = servicePolicy.substring(startIndex+1, endIndex);
			   return;
		   }
		}
		this.servicePolicy = "IS";
	}

	/**
	 * @return  Returns the servicePolicy.
	 * @uml.property  name="servicePolicy"
	 */
	public String getServicePolicy() {
		if(this.servicePolicy.equals(""))
		    return "IS";
		return this.servicePolicy;
	}

	/**
	 * @return  Returns the messages.
	 * @uml.property  name="messages"
	 */
	public Vector getMessages() {
		return messages;
	}

	/**
	 * @return  Returns the labels.
	 * @uml.property  name="labels"
	 */
	public Vector getLabels() {
		return this.labels;
	}

	public int getX() {
		return this.x1;
	}

	public int getY() {
		return this.y1;
	}

	public void addNears(Instance near, Messages message, String label) {
		this.children.add(near);
		this.getMessages().add(message);
		message.setLabel(label);
		this.labels.add(label);
	}

	public Vector getAnotherMessage(String seq) {
		Vector toReturn = new Vector();
		for(int i = 0; i < this.getMessages().size(); i++) {
			Messages m = (Messages)this.getMessages().get(i);
			if(m.isIsReturned() && m.getSequenceNumber().equals(seq)) {
				Instance insFather = (Instance)this.getChildren().get(i);
				int anotherMessageIndex = insFather.getNextMessageNormal(m.getSequenceNumber());
				if(anotherMessageIndex != -1) {
					toReturn.add(insFather);
					toReturn.add(new Integer(anotherMessageIndex));
					return toReturn;
				}
				else {
					return insFather.getAnotherMessage(delLastPoint(seq));
				}
			}
		}
		return toReturn;
	}
	
	public String delLastPoint(String seq) {
		int index = seq.lastIndexOf(".");
		if(index!=-1) {
		return seq.substring(0,index);
		}
		return "";
	}

	// inserisce in this nodo i vicini e le rispettive etichette associate alle associazioni
	public void loadNeighbours(Vector elementi) {
		for (int i = 0; i < getSourceConnection().size(); i++) {
			for (int j = 0; j < elementi.size(); j++) {
				if (elementi.get(j) instanceof Instance) {
					Instance possAdj = (Instance) elementi.get(j);
					Messages message = (Messages) getSourceConnection().get(i);
					if (possAdj.checkEnteringAssoc(message)) {					
						// devo reperire l'etichetta collegata all'associazione
						String label = message.findLabel(elementi);
						this.addNears(possAdj, message, label);
					}
				}
			}
		}
	}

	public int getFirstMesIndex(){
		for(int i = 0; i < this.getMessages().size(); i++ ) {
			Messages mes = (Messages) this.getMessages().get(i);
			if(mes.getSequenceNumber().equals("1")) {
				return i;
			}
		}
		return -1;
	}

	 public Vector findMoreLabel(/*String[] targActor, */Vector elements) {
	     Vector toReturn = new Vector();   
		 for(int j = 0; j < this.getTargetConnection().length; j++) {
	            for(int i = 0; i < elements.size(); i++) {
	                if(elements.get(i) instanceof Label) {
	                    Label lab = (Label) elements.get(i);
	                    if(lab.check(this.getTargetConnection()[j]) != null) {  // qui pu� essere inserito il controllo sul contenuto dell'etichetta
	                        toReturn.add(lab.getName());
	                    }
	                }
	            }
	        }
	        return toReturn;
	    }

	public int findNextMessage(String sequenceNumber) {
		boolean flag = false;
		String[] parts = sequenceNumber.split("\\.");
		for (int i = 0; i < getMessages().size(); i++) {
			Messages mes = (Messages) getMessages().get(i);
			String seqNum = mes.getSequenceNumber();
			String[] partsSeqMes = seqNum.split("\\.");
			if (partsSeqMes.length == parts.length + 1) {
				for (int j = 0; j < partsSeqMes.length - 1; j++) {
					if (!partsSeqMes[j].equals(parts[j])) {
						flag = true;
						break;
					}
				}
				// questo vuol dire che la prima parte � uguale
				if (!flag) {
					if (partsSeqMes[partsSeqMes.length - 1].equals("1"))
						return i;
				} else {
					flag = false;
				}

			}
		}
		return -1;
	}

	public int getPrevMessageReturning(String sequenceNumber) {
		boolean flag = false;
		String[] parts = sequenceNumber.split("\\.");
		for (int i = 0; i < getMessages().size(); i++) {
			Messages mes = (Messages) getMessages().get(i);
			String seqNum = mes.getSequenceNumber();
			String[] partsSeqMes = seqNum.split("\\.");
			if (partsSeqMes.length == parts.length - 1) {
				for (int j = 0; j < partsSeqMes.length; j++) {
					if (!partsSeqMes[j].equals(parts[j])) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					return i;
				} else {
					flag = false;
				}
			}
		}
		return -1;
	}
	
	public int getReturnMessage (String sequenceNumber) {
		for(int i = 0; i < this.getMessages().size(); i++) {
			Messages m = (Messages) this.getMessages().get(i);
			String sequence = m.getSequenceNumber();
			if(sequence.equals(sequenceNumber))
				return i;
		}
		return -1;
	}
	
	public int getNextMessageNormal(String sequenceNumber) {
		boolean flag = false;
		String[] parts = sequenceNumber.split("\\.");
		for (int i = 0; i < getMessages().size(); i++) {
			Messages mes = (Messages) getMessages().get(i);
			String seqNum = mes.getSequenceNumber();
			String[] partsSeqMes = seqNum.split("\\.");
			if (partsSeqMes.length == parts.length) {
				for (int j = 0; j < partsSeqMes.length-1; j++) {
					if (!partsSeqMes[j].equals(parts[j])) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					int el1 = Integer.parseInt(parts[parts.length-1]);
					//System.out.println(el1);
					int el2 = Integer.parseInt(partsSeqMes[parts.length-1]);
					//System.out.println(el1);
					if(el1 + 1 == el2)
					    return i;
				} else {
					flag = false;
				}
			}
		}
		return -1;
	}
	
	/*public String getSchedulingPolicy() {
		if(this.getSchedulingPolicy()) {
		    int firstIndex = this.getSchedulingPolicy();
		    int secondIndex
		}
	}*/

}
