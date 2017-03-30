/*
 * Fragment.java
 *
 * Created on 8 agosto 2006, 11.23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.DataStructures.Sequence;



import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Step;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;

/**
 * @author  Fabio Calvarese
 */
public class Fragment extends Elem {
    
    private Vector condition;
    private Elem pather;
    private int indexNode;
    private String label;
    public boolean used;
    public Fragment fragFather = null;
    private static Vector otherElseCase;
    private int firstMessage;
    private int lastMessage;
    
    /** Creates a new instance of Fragment */
    public Fragment(String type) {
        super(type);
        condition = new Vector();
        setPather(null);
        used = false;
        firstMessage = -1;
        lastMessage = -1;
    }
    
    public void setFirstMessage(String index) {
    	try {
    		firstMessage = Integer.parseInt(index)-1;
    	}
    	catch(Exception e) {
    		firstMessage = -1;
    	}
    }
    
    public void setLastMessage(String index) {
    	try {
    		lastMessage = Integer.parseInt(index)-1;
    	}
    	catch(Exception e) {
    		lastMessage = -1;
    	}
    }
    
    /**
	 * @param label  The label to set.
	 * @uml.property  name="label"
	 */
    public void setLabel(String label) {
    	this.label = label;
    }
    
    /**
	 * @return  Returns the label.
	 * @uml.property  name="label"
	 */
    public String getLabel() {
    	return this.label;
    }
    
    public static Vector getOtherElseCase() {
    	return otherElseCase;
    }

    /**
	 * @param indexNode  The indexNode to set.
	 * @uml.property  name="indexNode"
	 */
    public void setIndexNode(int index) {
    	this.indexNode = index;
    }

    /**
	 * @return  Returns the indexNode.
	 * @uml.property  name="indexNode"
	 */
    public int getIndexNode() {
    	return this.indexNode;
    }

    public String getType() {
        return this.getName();
    }

    public void setType(String type) {
        this.name = type;
    }

    public void setCondition(String condition) {
        this.condition.add(condition);
    }

    public void setFragment(Fragment frag) {
        this.children.add(frag);
    }
    
    public void resetFragmnetChild() {
    	this.children = new Vector();
    }

    /**
	 * @return  Returns the pather.
	 * @uml.property  name="pather"
	 */
    public Elem getPather() {
        return pather;
    }

    public void findFragApp(Fragment fr, Fragment prev) {  
    	if(this.equals(fr)){
    		fr.fragFather = prev;
    	}
    	for(int i = 0; i < this.getChildren().size(); i++) {
    		Fragment f = (Fragment) this.getChildren().get(i);
    		f.findFragApp(fr , this);
    	}
 	}

    public Fragment getFragPather() {
    	if(this.fragFather == null)
    		return null;
    	Fragment f = this.fragFather;
    	return f.fragFather;
    }

    /*
     * Devo controllare se il messaggio che ritengo essere l'else non si trova in un else di un antenato 
     */
    public boolean checkIfElseIsOfParent(Fragment ifComp, Fragment elseRoot) {  	
    	
    	Fragment ifCompFather = ifComp.fragFather;
    	// else puro quindi � giusto
    	Fragment father = this.fragFather;
    	while(father != null) {
    	    if(father.equals(ifCompFather)) {
    		    return false;
    		}
    	    father = father.fragFather;
    	}
    	
    	// else non appartenente ad ifComp, quindi non giusto
    	Fragment app = this;
    	while(app != null) {
    		
    	     if(elseRoot.checkIfInElse(app, 0)) {
    			return true;
    	     }
    		app = app.fragFather;
    	}	
    	return false;
    }

    
    public Fragment getFatherFrag() {
    	
    	Fragment f = this.fragFather;
    	if(f == null)
    		return null;
    		
    	f = f.fragFather;
    	
    	if(f == null)
    		return null;
    	    	
    	return f;
    	
    }
    
    public boolean haveSameParallel(Fragment fElse){
    	
    	if(fElse == null)
    		return false;
    	Fragment fElseFatherCompartment = fElse.getFatherFrag();
    	Fragment thisFatherCompartment = this.getFatherFrag();
    	if(fElseFatherCompartment == null || thisFatherCompartment == null){
    		return false;
    	}
    	else{
    		Fragment fElseParFather = fElseFatherCompartment.fragFather;
    		Fragment thisAltFather = thisFatherCompartment.fragFather;
    		
    		if(fElseParFather.equals(thisAltFather))
    			return true;
    	}
    	return false;
    	
    }
    
    public String getProbability(Vector steps) {
    	otherElseCase = new Vector();
    	String prob ="";
    	// adesso frag
    	Fragment f = this.fragFather;
    	if(f != null)
    		//adesso compartment
    		f = f.fragFather;
        
    	if(f != null)
    		//adesso alt
    		f = f.fragFather;
    	    Fragment fApp = f;
    	while(f!=null) {
    		if(f.getType().equals("alt") && !f.getLabel().equals("")) {
    			 prob += "*"+XmlDocumentSection.getProb(f.getLabel(),"pastep");
    		}
    		f = f.fragFather;
    	}
    	
    	prob = prob.replaceFirst("\\*","");
    	
    	while(fApp!=null) {
    		
    		if(fApp.getType().equals("alt") && !fApp.getLabel().equals("")) {
    			 String probElse = XmlDocumentSection.getProb(fApp.getLabel(),"pastep");
    			 Fragment fElse;
    			 if((fElse = fApp.getElse())!= null){
    				 Step stp = fElse.getFirstStep(steps);
    				 String app = prob.replaceAll(probElse,"1-"+probElse);
    				 int index = app.indexOf("1-"+probElse);
    				 //System.out.println(index);
    				 probElse = app.substring(index);
    				 otherElseCase.add(stp);
    				 otherElseCase.add(probElse);
    			 }
    		}
    		fApp = fApp.fragFather;
    	}
    	
    	return prob;
    }
    
    public Fragment getElse() {
    	
    	if(this.getChildren().size()==2) {
    	    Fragment fChild = (Fragment)this.getChildren().get(1);
    	    if(!fChild.equals(this))
    	    	return fChild;
    	}
    	return null;
    }
    
    // questo metodo viene applicato solo a fragment di tipo par
    public Vector getFragIntoRegion() {
    	Vector toReturn = new Vector();
    	Fragment frag = (Fragment)this.getChildren().get(0);
    	Vector regions = frag.getChildren();
    	for(int i = 0; i < regions.size(); i++) {
    		Fragment f = (Fragment)regions.get(i);
    		toReturn.addAll(f.getChildsOfRegion());
    	}
    	return toReturn;
    }

    public boolean checkIfIsRegion() {
    	
    	if(this == null)
    		return false;
    	if(this.fragFather.getType().equals("region"))
    		return true;
    	return false;
    	
    	
    }
    
    
    
    
    
    /*
     * Controllo se il fragment corrente discende da qualche else
     */
    public boolean checkIfElseDescendent() {
    	Fragment app = this.fragFather;
    	while(app!= null) {
    		if(app.getChildren().size() == 2 && app.getType().equals("alt")) {
    		    Fragment possibleElse = (Fragment) app.getChildren().get(1);
    		    if(possibleElse.equals(this))
    		    	return true;
    		    if(possibleElse.visitChild(this,0))
    		    	return true;
    		}
    		app = app.fragFather;
    	}
    	return false;
    }

    public boolean getChild(Fragment f) {
    	for(int i = 0; i < this.getChildren().size(); i++) {
    		Fragment fref = (Fragment) this.getChildren().get(i);
    		if(fref.equals(f))
    			return true;
    	}
    	return false;
    }

    /*
     *   Controllo se il corrente else Compound � contenuto in un else compund di un alternative fragment
     */
    public boolean checkIfInElse(Fragment f, int index) {
    	if (index < this.getChildren().size()) {
    		Fragment fref = (Fragment) this.getChildren().get(index);
    		if(fref.equals(f) && index == 1 && fref.getName().equals("compartment")) {
    		    return true;
    		}
    		return (fref.checkIfInElse(f, 0) || this.checkIfInElse(f, index+1));
    	}
    	return false;
    }

    public boolean visitChild(Fragment f, int index) { 	
    	if(index < this.getChildren().size()) {
    		Fragment fref = (Fragment) this.getChildren().get(index);
    		if(fref.equals(f)) {
    		    return true;	
    		}
    		return (fref.visitChild(f, 0)|| this.visitChild(f, index+1));
    	}
    	return false;
    }

     public void setAllFragFather(int index) {
    	if(index < this.getChildren().size()) {
    		Fragment fref = (Fragment) this.getChildren().get(index);
    		fref.fragFather = this;
    		fref.setAllFragFather(0);
    		this.setAllFragFather(index+1);
    	}
    }

    public Vector getChildNotCompound() {
    	Vector toReturn = new Vector();
    	for(int i = 0; i < this.getChildren().size(); i++) {
    		Fragment f = (Fragment) this.getChildren().get(i);
    		for(int j = 0; j< f.getChildren().size(); j++) {
    			toReturn.add(f.getChildren().get(j));
    		}
    	}
    	return toReturn;
    }
    
    
    // questo metodo viene chiamato solo per fragment di tipo region che hanno sicuro un unico compound
    public Vector getChildsOfRegion(){
    	Fragment f = (Fragment)this.getChildren().get(0);
    	if(f.getChildren().size()!=0) {
    		return f.getChildren();
    	}
    	    return new Vector();
    }
    
    
    /**
	 * @param pather  The pather to set.
	 * @uml.property  name="pather"
	 */
    public void setPather(Elem pather) {
        this.pather = pather;
        this.setFragPather((Fragment)pather);
    }

    public Fragment getPatherOfRegion(Messages m) {
    	if(m.getRoot() == null)
    		return null;
    	if(this.fragFather == null){
    		return null;
    		}
    	m.getRoot().findFragApp(this.fragFather, null);
    	if(!this.fragFather.getType().equals("compartment"))
    		return this.fragFather;
    	else {
    		return this.fragFather.getPatherOfRegion(m);
    	}
    }
   
    /**
     * This method applied to a region fragment return the parallel fragment compartment that is the pather.
     * 
     */
    public Fragment getParallelFragOfRegion() {
    	 // father is the region
         Fragment father = this.fragFather;
         if(father == null)
        	 return null;
         // father is the parallel compartment
         father = father.fragFather;
         if(father == null)
        	 return null;
         return father;
    }
    
    public Fragment getParallelFrag() {
    	Fragment f = this;
    	while (f != null) {
    		if(f.getType().equals("par"))
    			return f;
    	    
    		f= f.fragFather;
    	}
    	
    	return null;
    }
    
    public boolean checkIfSameParallel(Fragment fragElse){
    	Fragment ifParFrag = this.getParallelFrag();
    	Fragment elseParFrag = fragElse.getParallelFrag();
    	if(ifParFrag == null || elseParFrag == null)
    		return false;
    	
    	if(ifParFrag.equals(elseParFrag))
    		return true;
    	return false;
    }
    
    public boolean checkIfSameRegion(Fragment fragElse){
    	Fragment ifParFrag = this.getRegionDescendent();
    	Fragment elseParFrag = fragElse.getRegionDescendent();
    	if(ifParFrag == null || elseParFrag == null)
    		return false;
    	
    	if(ifParFrag.equals(elseParFrag))
    		return true;
    	return false;
    }
    
    
   public Fragment getRegionDescendent(){
    	
    	Fragment f = this; 
    	while(f != null) {
    		if(f.getType().equals("region")){
    			return f;
    		}
    		f = f.fragFather;
    	}
    	return null;
    }
   
    public boolean checkIfIsRegionDescendent(){
    	
    	Fragment f = this; 
    	while(f != null) {
    		if(f.getType().equals("region")){
    			return true;
    		}
    		f = f.fragFather;
    	}
    	return false;
    }
    
    // Restituisce l'else case
    public Step checkInAnotherAltWithElse(Vector app) {
    	
    	Fragment frAlt = this.fragFather;
    	if(frAlt == null) {
    		return null;
    	}
    	if(frAlt.getType().equals("alt")) {
    		// se esiste un else ci devono essere 2 figli e il secondo figlio deve essere diverso dal corrente
    		if(frAlt.getChildren().size() == 2) {
    			Fragment elseF = (Fragment)frAlt.getChildren().get(1);
    			if(!elseF.equals(this)) {
    				Step st = elseF.getFirstStep(app);
    				return st;
    				}
    			}
    		else {
    			app = getSubList(app);

    			for(int i = 0; i < app.size(); i++ ) {
    				Step stp = (Step) app.get(i);
    				Messages m = stp.getMex();	
    				Fragment f = m.getPather();
    				if(f == null) {
    					return stp;
    				}
    				if(!f.equals(this)) 
    					return stp;
    				}
    			}
    		}
    	return null;
    	}

    public Vector getSubList(Vector steps) {
    	
    	int index = -1;
    	for(int i = 0; i< steps.size(); i++) {
    		
    		Step stp = (Step) steps.get(i);
    		Messages m = stp.getMex();
    		
    		Fragment f = m.getPather();
    		if (m == null ){
    			break;
    		}
    		if(f.equals(this)) {
    			index = i;
    			break;
    		}
    	}
    	Vector app = new Vector();
    	app.addAll(steps.subList(index, steps.size()));
    	return app;
    	
    }

    public Step getFirstMessageOut(Vector steps) {
    	
    	for(int i = 0; i < steps.size(); i++) {
    		
    		Step stp = (Step) steps.get(i);
    		Messages m = stp.getMex();
    		
    		Fragment f = m.getPather();
    		if(f == null)
    			return stp;
    		if(!f.equals(this))
    			return stp;
    		
    	}
    	return null;
    	
    }
    
    public Step getFirstStep(Vector step) {
    	for(int i = 0; i < step.size(); i++) {
    		Step stp = (Step) step.get(i);
    		Messages mex = stp.getMex();
    		Fragment frApp = mex.getPather();
    		
    		if (frApp == null) {
    		    return null;
    		}
    		
    		if(this.equals(frApp)){
    			return stp;
    		}
    
    		if (this.visitChild(frApp,0)){
    			return stp;
    		}
    	}
    	return null;
    }
    
    public Step getLastStep(Vector steps) {
    	for(int i = 0; i < steps.size()-1; i++) {
    		
    		Step stp = (Step) steps.get(i);
    		Messages mex = stp.getMex();
    		Fragment fr = mex.getPather();
    		
    		
    		Step stp2 = (Step) steps.get(i+1);
    		Messages mex2 = stp2.getMex();
    		Fragment fr2 = mex2.getPather();
    		
    		if(fr2 == null) {
    			fr2 = new Fragment("");
    		}
    		if(this.visitChild(fr,0) && !this.visitChild(fr2,0)) {
    			return stp;
    		}
    	}
    	return null;
    }
    
    
    // nuovometodo
    public void setFragPather(Fragment frag) {
    	this.fragFather = frag;
    }
    
    public void setMessageInclusion(Vector messages) {
    	// se first e last message indicano una porzione dell'array messages
    	if(checkValidMessageIndex(messages)) {
    	    Fragment root = getRoot();
    	for(int i = firstMessage; i <= lastMessage; i++){
    		Messages m = (Messages)messages.get(i);
    		m.setPather(this);
    		m.setRoot(root);
    		}
    	}
    }
        
    public boolean checkValidMessageIndex(Vector messages) {
    	if (firstMessage >= 0 && firstMessage < messages.size()) {
    		if (lastMessage >= 0 && lastMessage < messages.size()) {
    			if(firstMessage<=lastMessage)
    				return true;
    		}
    	}
    	return false;
    }
    
    public Fragment getRoot() {
    	
    	Fragment pather =(Fragment)this.getPather();
    	
    	if(pather != null) {
    		return pather.getRoot();
    	}
    	else
    		return this;
    }
}
