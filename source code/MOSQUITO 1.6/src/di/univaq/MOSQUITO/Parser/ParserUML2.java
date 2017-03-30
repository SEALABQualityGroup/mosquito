package di.univaq.MOSQUITO.Parser;

import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class ParserUML2 extends Parser{
	
	
	protected Vector messages;
	
    public ParserUML2(LogManager log, MOSQUITOUtils mUtils) {
		
		super(log, mUtils);
		messages = new Vector();
	}
	
	public ParserUML2(EclipseUML2UtilV2 utils, LogManager log) {
		
		super(utils, log);
		messages = new Vector();
	}
	
	   /**
     * Per uniformare i sequence number di UML2 a quelli di Omondo procedo con 
     * questo primo step. Trasformo i numeri di sequenza dei messaggi di ritorno 
     * uguali a quelli dei call messages di chi l'ha generato
     * 
     */
    public void changeSequenceNumberOfReturnMessages(){
    	if(chekIfExistsAllReturnMessage()) {
    		Vector temp = new Vector();
    		temp.addAll(messages);
    		changeSequenceOfSet(temp);
    	}
    	else{
            System.out.println("Error, The number of call messages are not the same of the return ones");
            log.addError(PropertiesManager.getProperties("e14"));
    	}
    }
    
    public void changeSequenceOfSet(Vector temp){
    	for(int i = 0; i < temp.size()-1; i++) {
    		Messages mex1 = (Messages) temp.get(i);
    		Messages mex2 = (Messages) temp.get(i+1);
    		// il secondo e' sempre di ritorno
    		if((mex1.isIsReturned() || mex2.isIsReturned())) {
    			//System.out.println(mex1.getSequenceNumber() + " -------------> " + mex2.getSequenceNumber());
    		    mex2.setSequenceNumber(mex1.getSequenceNumber());
    		    temp.remove(i);
    		    //rimuovo il successivo no i+1 perchè temp si è rimpicciolito
    		    temp.remove(i);
    		    changeSequenceOfSet(temp);
    		    break;
    		}
    	}
    }
    
    public boolean chekIfExistsAllReturnMessage(){
    	
    	int counterCallMessages = 0;
    	int counterReturnMessages = 0;
    	for(int i = 0; i < messages.size(); i++) {
    		Messages mex = (Messages) messages.get(i);
    		if(mex.isIsReturned())
    			counterCallMessages ++;
    		else
    			counterReturnMessages ++;
    	}
    	
    	return (counterCallMessages == counterReturnMessages);
    }
    
    /**
     * Essendo la parte di trasformazione progettata appositamente per lavorare su export di Omondo,
     * si è deciso di uniformare l'input di Eclipse UMl2 a quello di Omondo onde non dover modificare
     * la componente di trasformazione
     * 
     */
    public void changeSequenceNumberInOmondoFormat(){
    	int count = 0;
    	String nextSeq = "";
    	
    	for(int i = 0; i < messages.size(); i++) {
    	 
    		Messages mex = (Messages) messages.get(i);
    		int seqNum = Integer.parseInt(mex.getSequenceNumber());
    		
    		//System.out.println("Sequenza originale " + seqNum);
    		if(count == seqNum) {
    			mex.setSequenceNumber(nextSeq);
    			//System.out.println("Sequenza fissata " + nextSeq);
    			continue;
    		}

    		if(count +1 == seqNum) {
    			nextSeq = addNextSeq(nextSeq);
    			mex.setSequenceNumber(nextSeq);
    			//System.out.println("Sequenza fissata " + nextSeq);
                count++;
                continue;
    		}

            if(count > seqNum) {
    			nextSeq = decNextSeq(nextSeq);
    			mex.setSequenceNumber(nextSeq);
    			//System.out.println("Sequenza fissata " + nextSeq);
                count--;
    		}
            
            // il sequence number è più alto di 
            else {
            	
            	// adesso se ad esempio next seq era 1.1 -->>> adesso è 1.2 
            	nextSeq = incrementLifeLine(nextSeq);
            	count = seqNum;
            	mex.setSequenceNumber(nextSeq);
            	//System.out.println("Sequenza fissata " + nextSeq);
            }
    	}
    }
    
    public String incrementLifeLine(String nextSeq) {
    	//System.out.println("Entrato " + nextSeq);
    	String toReturn="";
    	String[] elems = nextSeq.split("\\.");
    	for(int i = 0; i < elems.length-1; i++) {
    		toReturn += "."+elems[i];
    	}
    	int lastElem = Integer.parseInt(elems[elems.length-1]);
    	lastElem++;
    	toReturn += "."+Integer.toString(lastElem);
    	toReturn = toReturn.replaceFirst(".","");
    	//System.out.println("Uscito " + toReturn);
    	return toReturn;
    }

     public String decNextSeq(String nextSeq) {
    	//System.out.println("Entrato " + nextSeq); 
    	String[] elems = nextSeq.split("\\.");
    	String toReturn="";
    	for(int i = 0; i < elems.length-1; i++) {
    		toReturn += "."+elems[i];
    	}
    	toReturn = toReturn.replaceFirst(".","");
    	//System.out.println("Uscito " + toReturn);
    	return toReturn;
    }

    public String addNextSeq(String nextSeq) {
    	
    	if(nextSeq.equals("")){
    		
    	return "1";
    	}
    	return nextSeq+=".1";
    }

}
