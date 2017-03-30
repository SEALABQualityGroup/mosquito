package di.univaq.MOSQUITO.trasformation.egTrasformation;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;

/**
 * @author  Fabio Calvarese
 */
public class Operand {

	private Vector messages;
	private String operandName;
	private String number;
	private Fragment fragment;
	private String probability;
	private String fragmentCounting;
	private Vector fragments;
	
    public Operand(String operandName, Fragment frag) {
    	messages = new Vector();
    	fragments = new Vector();
    	this.operandName = operandName;
    	this.fragment = frag;
    	this.probability = "";
    }
    
    public void setFragmentCounting(int num){
    	fragmentCounting = num+"";
    }
    
    /**
	 * @return  Returns the fragmentCounting.
	 * @uml.property  name="fragmentCounting"
	 */
    public String getFragmentCounting(){
    	return this.fragmentCounting;
    }

    /**
	 * @return  Returns the number.
	 * @uml.property  name="number"
	 */
    public String getNumber(){
    	return this.number;
    }

    /**
	 * @param number  The number to set.
	 * @uml.property  name="number"
	 */
    public void setNumber(String number) {
    	this.number = number;
    }

    public void addMessages(Messages m) {
    	messages.add(m);
    }

    /**
	 * @return  Returns the messages.
	 * @uml.property  name="messages"
	 */
    public Vector getMessages() {
    	return this.messages;
    }
    
    /**
	 * @return  Returns the probability.
	 * @uml.property  name="probability"
	 */
    public String getProbability() {
    	return this.probability;
    }
    
    /**
	 * @param probability  The probability to set.
	 * @uml.property  name="probability"
	 */
    public void setProbability(String probability){
    	this.probability = probability;
    }

    /**
	 * @return  Returns the fragment.
	 * @uml.property  name="fragment"
	 */
    public Fragment getFragment(){
    	return this.fragment;
    }

    public String getName() {
    	return this.operandName;
    }
    
    public String getEgName(){
    	return "EG"+this.getName()+this.getNumber()+"Operand"+this.getFragmentCounting();
    }
    
    public String getNodeName(){
    	return "Expanded"+this.getName()+this.getNumber()+"Operand"+this.getFragmentCounting();
    }
    
    public void setFragment(Fragment f) {
    	for(int i = 0 ; i < this.fragments.size(); i++) {
    		Fragment fr =(Fragment) this.fragments.get(i);
    		if(fr.equals(f))
    			return;
    	}
    	fragments.add(f);
    }
    
    public Vector getFragments(){
    	return this.fragments;
    }
}
