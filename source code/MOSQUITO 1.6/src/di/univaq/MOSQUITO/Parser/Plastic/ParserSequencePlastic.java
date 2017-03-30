/*
 * ParserSequence.java
 *
 * Created on 7 agosto 2006, 14.05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser.Plastic;


import it.univaq.di.plastic.uml.modelreader.model.componentview.MessageInfo;
import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.List;
import java.util.Vector;

import org.eclipse.uml2.CombinedFragment;
import org.eclipse.uml2.Interaction;
import org.eclipse.uml2.InteractionOccurrence;
import org.eclipse.uml2.InteractionOperand;

import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.ParserUML2;
import di.univaq.MOSQUITO.utility.LogManager;


/**
 *
 * @author Fabio Calvarese
 */
public class ParserSequencePlastic extends ParserUML2 {
	
	
	
    /** Creates a new instance of ParserSequence */
    public ParserSequencePlastic(Interaction interaction, LogManager log, MOSQUITOUtils mUtils) {
        super(log, mUtils);
        // Creo la struttura dati di tipo grafo istanze + messaggi e imposto il Vettore di elements
    	createGraph(interaction);
        //printEncapsulation();
    	// tutti i sequence number dei messaggi di ritorno vengono resi uguali ai sequence number di chi l'ha generato.  	
    	//printSequenceNumber();
    	changeSequenceNumberOfReturnMessages();
    	//printSequenceNumber();
    	// riporto i sequence diagram nel formato di omondo per non dover modificare il blocco di trasformazione
    	// che è stato proggettato per il parser di Omondo che unsa un altro formato di sequence number.
    	changeSequenceNumberInOmondoFormat();
    	loadAnnidatedFragment(interaction);
    	setAllRegionFragments();
        //printFragmentEncapsulation();
        //printEncapsulation();
      
    }

    public void printSequenceNumber(){
    	for(int i = 0; i <messages.size(); i++) {
    		Messages mex = (Messages) messages.get(i);
    		System.out.println(mex.getSequenceNumber());
    	}
    }
    
    public void createGraph(Interaction interaction) {
    	//System.out.println("Nome dell'interaction " + interaction.getName());
    	// Value è un valore fittizio per evitare un controllo che si avrebbe con str vuoto
    	String[] str = {"value"};
    	elements.add(new Label(interaction.getName(),str));
    	Vector<MessageInfo> messageInfo = mUtils.getAllMessagesInfo(interaction, eUtils);
    	for(int i = 0; i < messageInfo.size(); i++) {
    	    MessageInfo mexInf = messageInfo.get(i);
    	    Instance instanceFrom = getInstance(mexInf.getFrom().getName());
    		Instance instanceTo = getInstance(mexInf.getTo().getName());
    		// suppongo sempre che il messaggio con sequence  uguale a uno esce dall'attore del sequence
    		if(i==0)
    		    instanceFrom.setActor();
    		// System.out.println("Messaggio " + mexInf.getOperation());
    		 Messages mex = new Messages(mexInf.getOperation());           
    		 String appliedStereotype = mexInf.getStereotype();
    		 mex.setSequenceNumber(mexInf.getSequenceNumber());
    		 //setto i messaggi di ritorno se mexInf.isReadable() == true allora messaggio normale 
    	     mex.setIsReturned(!mexInf.isReadable()); 
    	     //imposto così perchè in UML2 non ho bisogno poi di ricreare la sequenza dei messaggi di ritorno
    	     mex.setReturning("");
    		 messages.add(mex);
    		 instanceFrom.addNears(instanceTo,mex,appliedStereotype);
    	 }
    }

    public void printEncapsulation() {
        for(int i = 0 ; i <elements.size(); i++) {
            if(elements.get(i) instanceof Instance) {
                Instance ins = (Instance) elements.get(i);
                System.out.println("Dall'istanza " + ins.getName());
                Vector messages = ins.getMessages();
                for(int j = 0; j <messages.size(); j++) {
                    Messages mes = (Messages) messages.get(j);
                    System.out.println("Mesaggi uscenti " + mes.getName());
                    if(mes.getRoot()!= null) {
                        System.out.println("Root del messaggio " + mes.getName() + " = " + mes.getRoot().getName());
                        System.out.println("Padre del messaggio " + mes.getName() + " = " + mes.getPather().getName() );
                    }
                    else{
                         System.out.println("Root del messaggio " + mes.getName() + " = " + mes.getRoot());
                         System.out.println("Padre del messaggio " + mes.getName() + " = " + mes.getPather());
                    }
                }
            }
        }
    }

    public void setAllRegionFragments() {	
    	for(int i = 0; i < elements.size(); i++) {
    		if(elements.get(i) instanceof Fragment) {
    			Fragment fr = (Fragment)elements.get(i);
    			if (fr.getPather() == null) {
    				setRegionFragments(fr);
    			}
    		}
    	}
    }

    public void setRegionFragments(Fragment fr) {
    	Vector app;
    	if(fr.getType().equals("par")) {
    		app = fr.getChildren();
    		Fragment operand = new Fragment("compartment");
    		fr.resetFragmnetChild();
    		fr.setFragment(operand);
    		operand.setFragPather(fr);
    		for(int i = 0; i < app.size(); i++) {
    			Fragment fragRegion = new Fragment("region");
    			operand.setFragment(fragRegion);
    			fragRegion.setPather(operand);
    			Fragment operandOfRegion = (Fragment)app.get(i);
    			fragRegion.setFragment(operandOfRegion);
    			operandOfRegion.setPather(fragRegion);
    		}
    	}
    	for(int i = 0; i < fr.getChildren().size(); i++) {
    		Fragment frag = (Fragment) fr.getChildren().get(i);
    		setRegionFragments(frag);
    	}
    }

    public void printFragmentEncapsulation() {
    	for(int i = 0; i < elements.size(); i++) {
    		if(elements.get(i) instanceof Fragment) {
    			Fragment fr = (Fragment)elements.get(i);
    			if (fr.getPather() == null) {
    				printFragmentAndChilds(fr);
    			}
    		}
    	}
    }

    public void printFragmentAndChilds(Fragment fr) {	
    	System.out.println("Tipo " + fr.getType());
    /*	if(fr.getPather() == null)
    		System.out.println("null");
    	else
    	System.out.println("Tipo del padre " + fr.getPather().getName());*/
    	for(int i = 0; i< fr.getChildren().size(); i++)  {
    		Fragment frag = (Fragment) fr.getChildren().get(i);
    		printFragmentAndChilds(frag);
    	}
    }

    public void loadAnnidatedFragment(Interaction inter) {
		List listOfFrag = inter.getFragments();
		for(int i = 0; i < listOfFrag.size(); i++) {

			if(listOfFrag.get(i) instanceof CombinedFragment) {
			    CombinedFragment comFrag = (CombinedFragment)listOfFrag.get(i);
			    loadChildOfFragment(comFrag, null);
			}
			
			if(listOfFrag.get(i) instanceof InteractionOccurrence) {
				InteractionOccurrence intOcurrence = (InteractionOccurrence)listOfFrag.get(i);
				referTo = intOcurrence.getRefersTo();
			}
		}
	}
    
    public void loadChildOfFragment(CombinedFragment combFrag, Fragment pather) {
    	Fragment frag = new Fragment(combFrag.getInteractionOperator().getName());
    	elements.add(frag);
        frag.setPather(pather);
        // aggiungo il figlio dell'operando
        if(pather != null)
            pather.setFragment(frag);
        List combOperandsList = combFrag.getOperands();
        for(int j = 0 ; j < combOperandsList.size(); j++) {
            if(combOperandsList.get(j) instanceof InteractionOperand) {
        	    InteractionOperand op = (InteractionOperand)combOperandsList.get(j);        	  
        	    String firstMessage = mUtils.getAppliedStereotype(op, "InteractionOperand", "firstMessage", eUtils);
        	    String lastMessage = mUtils.getAppliedStereotype(op, "InteractionOperand" , "lastMessage", eUtils);
        	    Fragment operand = new Fragment("compartment");
        	    elements.add(operand);
        	    frag.setFragment(operand);
        	    operand.setPather(frag);
        	    operand.setFirstMessage(firstMessage);
        	    operand.setLastMessage(lastMessage);
        	    operand.setMessageInclusion(this.messages);
        	    loadChildOfOperand(op, operand);
        	    }
            }
        }
    
    public void loadChildOfOperand(InteractionOperand op, Fragment pather) {
    	for(int i = 0; i < op.getFragments().size(); i++ ) {
    		if(op.getFragments().get(i) instanceof CombinedFragment) {
    			CombinedFragment combFrag = (CombinedFragment)op.getFragments().get(i);
    			loadChildOfFragment(combFrag, pather);	
    		}
    	}
    }
    
      
}
