package di.univaq.MOSQUITO.trasformation.egTrasformation;


import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.Vector;

import org.w3c.dom.Document;

import Devices.ArcType;
import Devices.BasicNodeType;
import Devices.CPSNodeType;
import Devices.CompoundNodeType;
import Devices.DevicesFactory;
import Devices.EGType;
import Devices.ExpandedNodeType;
import Devices.PSType;
import Devices.RepNodeType;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.Parser.Omondo.ParserSequence;
import di.univaq.MOSQUITO.Parser.Plastic.ParserSequencePlastic;
import di.univaq.MOSQUITO.Parser.UML2.ParserSequenceUML2;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class ComplexNode extends XmlDocumentSection {

	private int count = 0;
	private Vector operands;
	private MOSQUITOUtils mUtils;
		
	public ComplexNode(Vector parsersSequence, PSType perfScen, DevicesFactory eg, Vector fileNames, Vector documents, LogManager log, MOSQUITOUtils mUtils){
		super(perfScen, eg, parsersSequence, fileNames, documents, log);
		this.mUtils = mUtils;
		operands = new Vector();
	}

	public void setReturnName(Vector elemPars) {
		for(int j = 0; j < elemPars.size(); j++) {
	        if(elemPars.get(j) instanceof Instance) {
	            Instance insPather = (Instance)elemPars.get(j);  
	            Vector messages = insPather.getMessages();
	            for(int i = 0; i < messages.size(); i++) {
	                Messages mes = (Messages) messages.get(i);
	 		            if(mes.isReturning()) {
	        	            mes.loadNumberSequence(elemPars);
	        	        }
	 		        }
	            }
	        }
		}

	public void createComplexNode(CompoundNodePrincipal cn) {
		if(parsers.size() < cn.getUseCaseName().size()) {
			log.addInfo(PropertiesManager.getProperties("e19"));
			System.out.println("Impossibile caricare tutti gli scenari specificati nello use case diagram");
		}
		for(int i = 0; i < cn.getUseCaseName().size(); i++) {
			String nomeScen = cn.getUseCaseName().get(i).toString();
			for(int j = 0; j < parsers.size(); j++) {
			    Parser pSeq = (Parser)parsers.get(j);
			    this.elements = pSeq.getElements();
   	            //setReturnName(elements);  // ho aggiunto questo per la gestione dei messaggi di ritorno
			    if(this.findScenarioLabel().toLowerCase().equals(nomeScen.toLowerCase())) {
				    createComplexNode(i, pSeq);
				    }
			    }
			}
		//createSimpleOperands(operands);
		}

	public void createSimpleOperands(Vector operands) {
		for(int i = 0; i < operands.size(); i++) {
			Operand op = (Operand) operands.get(i);
			createSecondaryNodes(op);
		}
	}

    //	adesso so che per gli elementi all'interno di elements il nome da associare + executionGraph[i]
	public void createComplexNode(int index, Parser pSeq) {
		EGType exgraph = eg.createEGType();
		exgraph.setEGname("ExecutionGraph"+ (index+1));
		exgraph.setIsMainEG(false);
		createComplexNode(null, exgraph, pSeq);
	}

	public void createComplexNode(Object node, EGType exgraph, Parser pSeq) {
		Vector allNodes = new Vector();
		Vector fragments = new Vector();
        Vector basicNode = new Vector();
		Vector compounds = new Vector();
		if(node!=null) {
		    allNodes.add(node);
		}
		setFragGer();
		for(int i = 0; i < elements.size(); i++) {
			
			
			if(elements.get(i) instanceof Instance) {
			   
				Instance ins = (Instance)elements.get(i);
				//scorro tutti i messaggi
				for(int j = 0; j < ins.getMessages().size(); j++) {
					
					Messages m = (Messages)ins.getMessages().get(j);
					if(!m.getName().equals("")) {  // ho aggiunto questo per non gestire i messaggi di ritorno
					if(m.getRoot() == null ) {
						allNodes.add(m);
						BasicNodeType bNode = eg.createBasicNodeType();
						bNode.setNodeName(m.getName());
						basicNode.add(bNode);
					}
					else {				   
                        // il messaggio si trova in un fragment, vedo se ho già settato il compound node
					    if(!exist(m.getRoot(), fragments)) {
							count++;
							Fragment frag = m.getRoot();
							frag.setIndexNode(count);
							fragments.add(m.getRoot());
							compounds.addAll(createCompoundNode(exgraph, m.getRoot(), count));
						}
					}
				}
			}
		}
	}
		createBasicNodeSection(basicNode, exgraph);
		// qui creo la sezione Arc
		allNodes = reorderMessages(allNodes);
		//attenzione dopo la insertFragment, il vettore fragments può essere modificato, quindi se si decidesse di riutilizzarlo in seguito è necessario effettuare una copia prima
		allNodes = insertFragment(allNodes, fragments);
		createArcSection(allNodes, exgraph);
		perfScen.getExecutionGraph().add(exgraph);
		if(compounds.size() != 0)
		    createSimpleOperands(compounds);
		processFragRef(exgraph, allNodes.lastElement(), pSeq);
		setStartNode(allNodes, exgraph);
	}

	public void setStartNode(Vector allNodes, EGType exgraph ) {
	
		if(allNodes.get(0) instanceof Messages) {
		    Messages x = (Messages)allNodes.get(0);
		    exgraph.setStartNode(x.getName());
		}
		else {
		    Fragment frag = (Fragment) allNodes.get(0);
		    exgraph.setStartNode(frag.getName()+frag.getIndexNode()+"");
		    }
	}


	public void processFragRef(EGType exgraph, Object node, Parser pSeq) {
		String nameFile = pSeq.getPathRef();
	
		Parser pS; 
		
		if(!nameFile.equals("")) {
			int index = nameFile.lastIndexOf("\\");
			
			Document doc = getDocument(nameFile.substring(index+1, nameFile.length()));
			//nameFile = path+nameFile.substring(index+1, nameFile.length());
			  pS = new ParserSequence(doc,pSeq.getLog());
		}
		else{
			Object ref = pSeq.getReferToUML2();
			if(ref != null){
			   if(ref instanceof org.eclipse.uml2.Interaction)
			      pS = new ParserSequencePlastic((org.eclipse.uml2.Interaction)pSeq.getReferToUML2(),pSeq.getLog(), mUtils);
			   else
				  pS = new ParserSequenceUML2((org.eclipse.uml2.uml.Interaction)pSeq.getReferToUML2(),pSeq.getUtils(), pSeq.getLog());
			}
			else{
				return;
			}
		}
		
			this.elements = pS.getElements();
			if(node instanceof Messages) {
				Messages mex = (Messages) node;
				mex.setSequenceNumber("0");
				node = mex;
			}
			else{
				Fragment fr = (Fragment) node;
				Fragment temp = fr;
				fr.setLocation("0,0","0,0");
				node = fr;
				fr = temp;
			}
			createComplexNode(node, exgraph, pS);
		
	}

	public void createSecondaryNodes(Operand op) {
		Vector compounds = new Vector();
		Vector allNodes = new Vector();
		if(op.getMessages().size()+ op.getFragments().size() > 1 || op.getFragments().size() == 1 ) {
			EGType exgraph = eg.createEGType();
		    exgraph.setEGname(op.getEgName());
			exgraph.setIsMainEG(false);
			for(int i = 0; i < op.getMessages().size(); i++) {
				Messages m = (Messages) op.getMessages().get(i);
				if(!m.getName().equals("")) {  // ho aggiunto questo per non gestire i messaggi di ritorno
				    BasicNodeType bNode = eg.createBasicNodeType();
				    bNode.setNodeName(m.getName());
				    exgraph.getBasicNode().add(bNode);
				}
			}
			
			allNodes = reorderMessages(op.getMessages());
			if(op.getFragments().size() > 0) {
				// metto in clone perche non voglio apportare modifiche al vettore di fragments
				Vector clone = new Vector();
				clone.addAll(op.getFragments());
				allNodes = insertFragment(allNodes, clone);
				int newCount = getFirstIndex(allNodes);
			    for(int i = 0; i < op.getFragments().size(); i++) {
			    	//count++;
			        Fragment f = (Fragment) op.getFragments().get(i);
			    	compounds.addAll(createCompoundNode(exgraph, f , /*count*/ newCount));
			    	newCount++;
			    }
			}
			setStartNode(allNodes, exgraph);
		    createArcSection(allNodes, exgraph);
		    
		    if(compounds.size()>0) {
		    	this.createSimpleOperands(compounds);
		    }
			perfScen.getExecutionGraph().add(exgraph);
		}
	
	}
	
	public int getFirstIndex(Vector allNodes) {
		for(int i = 0; i < allNodes.size(); i++ ){
			if(allNodes.get(i) instanceof Fragment) {
				return ((Fragment)allNodes.get(i)).getIndexNode();
			}
		}
		return count;
	}
	
	public String getName(Object node) {
		String nome="";
		if(node instanceof Messages)
			nome = ((Messages)node).getName();
		else{
			int fRagindex =((Fragment)node).getIndexNode();
			nome = ((Fragment)node).getName();
			nome += fRagindex+"";
		}
		return nome;
	}

	public void createBasicNodeSection(Vector basicNode, EGType exgraph) {
		for(int i = 0; i < basicNode.size(); i++) {
			BasicNodeType bNode = (BasicNodeType) basicNode.get(i);
			exgraph.getBasicNode().add(bNode);
		}
	}

	// vado a reperire tutti i differenti operandi presenti dentro un fragment e li aggiungo nel compound.
	public Vector createCompoundNode(EGType exgraph, Fragment frag, int count) {
		int countOperand = 0; 
		boolean flag = false;
		Vector compoundsNodeOp = new Vector();
		CompoundNodeType cmpNode = eg.createCompoundNodeType();
		cmpNode.setNodeName(frag.getName()+(count+""));
		exgraph.getCompoundNode().add(cmpNode);
	    for(int j = 0; j < elements.size(); j++) {
	    	if(elements.get(j) instanceof Instance) {
	    	    Instance ins = (Instance)elements.get(j);
		        for(int i= 0 ; i < ins.getMessages().size(); i++) {
			        Messages mex = (Messages) ins.getMessages().get(i);
					if(mex.getRoot() != null) {          
					if (!mex.getName().equals("")) {   // ho aggiunto questo per non gestire i messaggi di ritorno.			        	
			        
					    Fragment father = mex.getPather().fragFather;        	
			        	// se il messaggio si trova in un compound il cui padre e' uguale al fragment di rif
			        	// oppure se il messaggio si trova in un compound il cui padre e' un region che si trova
			        	// subito dentro il fragment di rif.
			            if(frag.equals(father) || (father.getType().equals("region") && frag.getChild(father.fragFather))) {
			            	int operIndex = existOperand(mex.getPather(),  compoundsNodeOp);
			                	if(operIndex != -1) {
				                    Operand op = (Operand) compoundsNodeOp.get(operIndex);
				                    // inserisco un nuovo messaggio all'interno dell'operando che ho gia' individuato
					                op.addMessages(mex);
					             	String prob = mex.getLabel();
					             	String probability = getProb(prob, "pastep");
			        		    if(!probability.equals("")) {
					                op.setProbability(probability);
					            }
					        }
			             else {
			        		countOperand ++;
			        		String numOperand = this.numberUtility(countOperand);
			        		String prob = mex.getLabel();
			        		String probability = getProb(prob, "pastep");
			        		String name = father.getName();
			        		if(father.getName().equals("region"))
			        			name = "par";
			        		Operand op = new Operand(name, mex.getPather());
			        		
			        		if(!probability.equals("")) {
			        		    op.setProbability(probability);
			        		}
			        		op.setNumber(numOperand);
			        		op.setFragmentCounting(count);
			        		op.addMessages(mex);
			        		operands.add(op);
			        		compoundsNodeOp.add(op);
			        		}
			              }

			               // ho trovato un messaggio interno a un fragment annidato nel fragment frag
			               else {
			            	  
			            	   if((!father.getType().equals("region")) && frag.getChild(father.fragFather)) {
			            		   count++;
			            		   father.setIndexNode(count);
			            		   int operIndex = existOperand(father.fragFather,  compoundsNodeOp);
				                	if(operIndex != -1) {
				                		Operand op = (Operand) compoundsNodeOp.get(operIndex);
				                		op.setFragment(father);
				                	}
				                	else {
				                		countOperand ++;
						        		String numOperand = this.numberUtility(countOperand);
						        		
						        		//controllare bene qui
						        		Operand op = new Operand(frag.getName(), father.fragFather);
						        		op.setNumber(numOperand);
						        		op.setFragmentCounting(count);
						        		op.setFragment(father);
						        		
						        		operands.add(op);
						        		compoundsNodeOp.add(op);
				                	}
			            	   }
			            	   else {
			            		   // ci sono fragment con all'interno solo altri fragment
			            		   flag = true;
			            	   }
			               }
			           }
					}       
		        }
	    	}
	    }
	    
	        if(flag) {
	        	
	            flag = false;
	    	    Vector ops = frag.getChildNotCompound();
	    	    Vector notExist = notExist(ops, compoundsNodeOp);
	    	    if(frag.getType().equals("par")) {
	    	    	// mi inserisc i fragment all'interno dei fragment region
	    	    	notExist.addAll(frag.getFragIntoRegion());
	    	    }
	    	    if(notExist.size()!=0) { 
	    	       for(int i = 0; i < notExist.size(); i++) {
	    	    	   count++;
	    	           Fragment fr = (Fragment)notExist.get(i);
	    	           fr.setIndexNode(count);
	    	           frag.findFragApp(fr, null);
	    	           int operIndex = existOperand(fr.fragFather,  compoundsNodeOp);
	    	           if(operIndex != -1) {
	    	        	   Operand op = (Operand) compoundsNodeOp.get(operIndex);
	    	        	   op.setFragment(fr);
	    	           }
	    	           else {
	    	        	    countOperand ++;
	    			   		String numOperand = this.numberUtility(countOperand);
	    			   		//controllare bene qui
	    			   		Operand op = new Operand(frag.getType(), fr.fragFather);
	    			   		op.setNumber(numOperand);
	    			   		op.setFragmentCounting(count);
	    			   		op.setFragment(fr);
	    			   		operands.add(op);
	    			   		compoundsNodeOp.add(op);
		        			}
	    	       		}
	    	    	}
	    		}
	        	createCompoundsElements(frag, compoundsNodeOp, cmpNode);
	        	return compoundsNodeOp;
		}
	
	
	public Vector notExist(Vector ops, Vector compounds) {
		Vector toReturn = new Vector();
		boolean exist = false;
		for(int i = 0; i < compounds.size(); i++) {
			Operand op = (Operand)compounds.get(i);
			Vector frags = op.getFragments();
			for(int j = 0 ; j < ops.size(); j++){
				for(int h = 0; h < frags.size(); h++) {
					if(ops.get(j).equals(frags.get(h))) {
						exist = true;
						break;
					}
				}
				if(!exist)
					toReturn.add(ops.get(j));
				else
					exist = false;
			}
		}
		if(compounds.size() == 0) {
			toReturn.addAll(ops);
		}
		for(int i = 0; i < toReturn.size(); i++) {
			Fragment f = (Fragment) toReturn.get(i);
			if(f.getType().equals("region")){
			    toReturn.remove(i);
			    i--;
			}
		}
		return toReturn;
	}

	public void createCompoundsElements(Fragment frag, Vector compoundsNodeOp, CompoundNodeType cmpNode) {
		Object internalNode = null;

		if(frag.getName().equals("alt")||frag.getName().equals("opt")) {
			internalNode = eg.createCPSNodeType();
			cmpNode.setCaseNode((CPSNodeType) internalNode);
		}

        if(frag.getName().equals("loop")) {
        	internalNode = eg.createRepNodeType();
        	String repetitionFactor = getProb(frag.getLabel(),"pastep");
        	if(!repetitionFactor.equals(""))
        	((RepNodeType)internalNode).setRepetitionFactor(Float.parseFloat(repetitionFactor));
        	cmpNode.setRepetitionNode((RepNodeType) internalNode);
        	
		}

        if(frag.getName().equals("par")) {
        	internalNode = eg.createCPSNodeType();
        	cmpNode.setPardoNode((CPSNodeType) internalNode);
		}
        String count = "";
        float totalProbability = 0;
		for(int i = 0; i < compoundsNodeOp.size(); i++) { 
			Object node = null;
			Operand op = (Operand)compoundsNodeOp.get(i);
			count = op.getFragmentCounting();
			if(op.getMessages().size() + op.getFragments().size() > 1 || op.getFragments().size() >= 1 ) {
				node = eg.createExpandedNodeType();
			    ((ExpandedNodeType)node).setEGname(op.getEgName());
			    ((ExpandedNodeType)node).setNodeName(op.getNodeName());
			    if(!op.getProbability().equals("")) {
			    	float prob;
			    	try{
			    	   prob = Float.parseFloat(op.getProbability());
			    	}
			    	catch(Exception e) {
			    		prob = 0;
			    	}
			    	totalProbability += prob;
			        ((ExpandedNodeType)node).setProbability(prob);
			    }
		     }
			else {
				if(op.getMessages().size()==1) {
					Messages m = (Messages) op.getMessages().get(0);
					node = eg.createBasicNodeType();
					((BasicNodeType)node).setNodeName(m.getName());
					if(!op.getProbability().equals("")) {
						float prob;
						try {
						    prob = Float.parseFloat(op.getProbability());
						}
						catch(Exception e) {
							prob = 0;
						}
				    	totalProbability += prob;
					    ((BasicNodeType)node).setProbability(prob);
					}
				}
			}
			setCompoundElements(internalNode, node);
		}
		if (totalProbability < 1.0 && (frag.getName().equals("opt")||frag.getName().equals("alt"))) {
			float prob = (float) (1.0 - totalProbability);
			BasicNodeType node = eg.createBasicNodeType();
			node.setNodeName("basicNodenull" + count);
			node.setProbability(prob);
			setCompoundElements(internalNode, node);
		}
		
	}

	public void setCompoundElements(Object internalNode, Object node) {
		
		if ((internalNode instanceof CPSNodeType) && (node instanceof ExpandedNodeType)) {
			((CPSNodeType) internalNode).getExpandedNode().add((ExpandedNodeType)node);
		}

		if ((internalNode instanceof CPSNodeType) && (node instanceof BasicNodeType)) {
			((CPSNodeType) internalNode).getBasicNode().add((BasicNodeType)node);
		}

		if ((internalNode instanceof RepNodeType) && (node instanceof BasicNodeType)) {
			((RepNodeType) internalNode).setBasicNode((BasicNodeType)node);
		}

		if ((internalNode instanceof RepNodeType && node instanceof ExpandedNodeType)) {
			((RepNodeType) internalNode).setExpandedNode((ExpandedNodeType)node);
		}
	}

	public void createArcSection(Vector nodes, EGType exgraph) {
        for(int i = 0; i < nodes.size()-1; i++) {
        	ArcType arc = eg.createArcType();
        	String nameFrom =  getName(nodes.get(i));
        	arc.setFromNode(nameFrom);
        	String nameTo = getName(nodes.get(i+1));
        	arc.setToNode(nameTo);
        	exgraph.getArc().add(arc);
        }
	}

/*	public void stampa(Vector elems) {
		for(int i = 0; i < elems.size(); i++) {
			Messages m = (Messages)elems.get(i);
			System.out.println(m.getName());
		}
	}*/
	
	/**
	 * Restituisce il vettore riordinato dei messaggi,
	 * compresi i messaggi di ritorno.
	 * 
	 * @param mex il vettore di tutti i messaggi disordinato.
	 * @return il vettore di messaggi riordnato.
	 */
	public Vector reorderMessages(Vector mex) {
		Vector toReturn = new Vector();	
		// messaggi non di ritorno.
		Vector notReturning = getMex(mex, false);
		// messaggi di ritorno
		Vector returningMes = getMex(mex, true);
		notReturning = reorder(notReturning);
		

		returningMes = reorder(returningMes);
		while(notReturning.size()!=0 && returningMes.size()!=0) {
			Messages returnedMex = (Messages) returningMes.firstElement();
			Messages notReturnedMex = (Messages) notReturning.firstElement();
	    	if(notReturnedMex.getSequenceNumber().contains(returnedMex.getSequenceNumber())) {
	    		toReturn.add(notReturnedMex);
	    	    notReturning.remove(0);
	    	}
	    	else {
	    		int index = getMaxReturnedMexIndex(notReturnedMex.getSequenceNumber(), returningMes);
	    		Messages m = (Messages) returningMes.get(index);
	    		toReturn.add(m);
	    		returningMes.remove(index);
	    	}
	    }
		if(notReturning.size()!= 0) {
			toReturn.addAll(notReturning);
		}
		if(returningMes.size()!= 0) {
			returningMes = invert(returningMes);
			toReturn.addAll(returningMes);
		}
		return toReturn;
	}
	

	public Vector insertFragment(Vector allNodes, Vector fragments) {
		Vector returnVector = new Vector();
		while(allNodes.size()!=0 && fragments.size()!=0) {
			int fIndex = getFragmentMinimum(fragments);
			Fragment frag = (Fragment) fragments.get(fIndex);
			Messages m = (Messages) allNodes.firstElement();
			// qui controllo la posizione dei fragment rispetto ai messaggi
			if(frag.getY1() <  m.getY1() && frag.getX1() < m.getX1()) {
				returnVector.add(frag);
				fragments.remove(fIndex);
			}
			else{
				returnVector.add(m);
				allNodes.remove(0);
			}
		}
		
		if(allNodes.size()== 0 && fragments.size()!= 0) {
			Vector app = new Vector();
			app.addAll(fragments);
			Vector reorderedFrags = reorderFrag(app);
			returnVector.addAll(reorderedFrags);
		}
		if(allNodes.size()!= 0 && fragments.size()== 0) { 
			returnVector.addAll(allNodes);
		}
		return returnVector; 
	}

	public Vector reorderFrag(Vector frags) {
		Vector toReturn = new Vector();
		while(frags.size()!=0) {
			int fIndex = getFragmentMinimum(frags);
			Fragment fr = (Fragment) frags.get(fIndex);
			toReturn.add(fr);
			frags.remove(fIndex);
		}
		return toReturn;
	}
	
	public int getFragmentMinimum(Vector frags) {
		if(frags.size() > 0) {
			Fragment fragMinimum = (Fragment) frags.get(0);
			int minimumIndex = 0;
	    for(int i = 1; i < frags.size(); i++) {
	    	Fragment frag = (Fragment) frags.get(i);
	    	if(frag.getY1() < fragMinimum.getY1()) {
	    		fragMinimum = frag;
	    		minimumIndex = i;
	    	}
		}
	    return minimumIndex;
		}
		return -1;
	}
	


	public boolean exist(Fragment f, Vector allElements) {
		for(int i = 0; i < allElements.size(); i++ ) {
			if(allElements.get(i).equals(f))
				return true;
		}
		return false;
	}
	
	public int existOperand(Fragment f, Vector operand) {
		for(int i = 0; i < operand.size(); i++ ) {
			Operand op = (Operand)operand.get(i);
			if(op.getFragment().equals(f)) {
				return i;
			}
		}
		return -1;
	}
	
	public String numberUtility(int n) {
		switch(n){
		case 1:
			return "Primo";
		case 2:
			return "Secondo";
		case 3: 
			return "Terzo";
		case 4:
			return "Quarto";
		case 5:
			return "Quinto";
		case 6:
			return "Sesto";
		}
		return "Undefined";
	}
}
