package di.univaq.MOSQUITO.Parser.UML2;




import java.util.List;
import java.util.Vector;

import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;

import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.ParserUML2;
import di.univaq.MOSQUITO.utility.LogManager;

public class ParserSequenceUML2 extends ParserUML2 {
	
	
	public ParserSequenceUML2(Interaction interaction,EclipseUML2UtilV2 utils, LogManager log) {
		super(utils,log);
		loadSequenceDiagram(interaction);
		//printEncapsulation();
    	// tutti i sequence number dei messaggi di ritorno vengono resi uguali ai sequence number di chi l'ha generato.  	
    	//printSequenceNumber();
    	changeSequenceNumberOfReturnMessages();
    	//printSequenceNumber();
    	// riporto i sequence diagram nel formato di omondo per non dover modificare il blocco di trasformazione
    	// che è stato proggettato per il parser di Omondo che usa un altro formato di sequence number.
    	changeSequenceNumberInOmondoFormat();
    	loadAnnidatedFragment(interaction);
    	setAllRegionFragments();
    	//printFragmentEncapsulation();
    	//printEncapsulation();
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
	
	/* public void printEncapsulation() {
	        for(int i = 0 ; i <elements.size(); i++) {
	            if(elements.get(i) instanceof Instance) {
	                Instance ins = (Instance) elements.get(i);
	                System.out.println("Dall'istanza " + ins.getName());
	                Vector messages = ins.getMessages();
	                for(int j = 0; j <messages.size(); j++) {
	                    Messages mes = (Messages) messages.get(j);
	                    System.out.println("Mesaggio uscente " + mes.getName());
	                    System.out.println("Stereotipo " + mes.getLabel());
	                }
	            
	            }
	        }
	    }*/
    
    
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
	
	public void loadSequenceDiagram(Interaction inter) {
		int count = 1;
		// Value è un valore fittizio per evitare un controllo che si avrebbe con str vuoto
		String[] str = {"value"};
		elements.add(new Label(inter.getName(),str));
				
		Vector<NamedElement> elements = new Vector<NamedElement>(inter.getOwnedMembers());
		for(NamedElement ne : elements) {
		    if(ne instanceof Message) {
		    	
			    Messages mex = null;
				Message msg = (Message)ne;
				NamedElement signature = msg.getSignature();
				// messaggio di tipo call message
				if(signature != null) {
					if(signature instanceof Operation) {
						Operation op = (Operation)signature;
					    //System.out.println(op.getName());
					    mex = new Messages(op.getName());
					    mex.setIsReturned(false); 
					}
				}
			    else {
			        //System.out.println("messaggio di ritorno");
			        mex = new Messages("");
			        mex.setIsReturned(true); 
				}
				String appliedStereotype = utils.getAppliedStereotype(msg);
				
				mex.setReturning("");
				mex.setSequenceNumber(Integer.toString(count));
				messages.add(mex);
										
			    MessageEnd sendMessageEnd = msg.getSendEvent();
			    MessageEnd receiveMessageEnd = msg.getReceiveEvent();
				Instance instanceFrom = null;
				Instance instanceTo = null;
				//System.out.println(sendMessageEnd);
				if(sendMessageEnd instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification event = (MessageOccurrenceSpecification)sendMessageEnd;
					Vector<Lifeline> coveredLifelines = new Vector<Lifeline>(event.getCovereds());
					for(Lifeline coveredLifeline : coveredLifelines) {
						ConnectableElement coveredElement = coveredLifeline.getRepresents();
						coveredLifeline.setName(coveredElement.getName());
				    	//	msgInfo.setFrom(coveredLifeline);
						//	System.out.println("Parte Da " + coveredElement.getType().getName());
						String insName = getInstanceName(coveredElement);
					    instanceFrom = getInstance(insName);
					    if(count==1)
						    instanceFrom.setActor();
						}
					}
				if(receiveMessageEnd instanceof MessageOccurrenceSpecification) {
					MessageOccurrenceSpecification event = (MessageOccurrenceSpecification)receiveMessageEnd;
					Vector<Lifeline> coveredLifelines = new Vector<Lifeline>(event.getCovereds());
					//DUBBIO PERCHE' POSSONO ESSERCI PIù COVERED?
					for(Lifeline coveredLifeline : coveredLifelines) {
						ConnectableElement coveredElement = coveredLifeline.getRepresents();
						coveredLifeline.setName(coveredElement.getName());
						//msgInfo.setTo(coveredLifeline);
						//System.out.println("Arriva a  " + coveredElement.getType().getName());
						String insName = getInstanceName(coveredElement);
						instanceTo = getInstance(insName);
						}
				}
				instanceFrom.addNears(instanceTo,mex,appliedStereotype);
				count ++;
				}
		   
				
		      }
			}
	//	}
//	}
	
	public String getInstanceName(ConnectableElement coveredElement) {
		String insName ="";
		if(coveredElement.getType()==null)
			insName = coveredElement.getName();
		else
			insName = coveredElement.getType().getName();
		return insName;
	}
	
	  public void loadAnnidatedFragment(Interaction inter) {
			List listOfFrag = inter.getFragments();
			for(int i = 0; i < listOfFrag.size(); i++) {

				if(listOfFrag.get(i) instanceof CombinedFragment) {
				    CombinedFragment comFrag = (CombinedFragment)listOfFrag.get(i);
				    loadChildOfFragment(comFrag, null);
				}
			
				if(listOfFrag.get(i) instanceof InteractionUse) {
					InteractionUse intOcurrence = (InteractionUse)listOfFrag.get(i);
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
	        	    String firstMessage = utils.getPropertyValue(op,"PAprofile","InteractionOperand", "firstMessage");
	        	    String lastMessage = utils.getPropertyValue(op,"PAprofile","InteractionOperand", "lastMessage");
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
}


