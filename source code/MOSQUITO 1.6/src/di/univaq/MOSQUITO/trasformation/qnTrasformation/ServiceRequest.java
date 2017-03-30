package di.univaq.MOSQUITO.trasformation.qnTrasformation;

import java.math.BigInteger;
import java.util.Vector;

import QNM2MetaMod.CapacityType;
import QNM2MetaMod.NodeType;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import QNM2MetaMod.QueueType;
import QNM2MetaMod.SchedulingType;
import QNM2MetaMod.ServerType;
import QNM2MetaMod.ServiceRequestType;
import QNM2MetaMod.TimeServType;
import QNM2MetaMod.TimeUnitsType;
import QNM2MetaMod.TransitFromType;
import QNM2MetaMod.TransitType;
import di.univaq.MOSQUITO.DataStructures.Step;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;

public class ServiceRequest extends XmlDocumentSection {

	private ServiceRequestType sReq;

	private Vector from;

	private Vector to;
	
	private Vector componentElems;
	
	private boolean flag = false;
	
	private String probFather;
	
	private boolean flagRef;

	public ServiceRequest(Vector parsersSequence, QNMType qn, QNM2MetaModFactory df, Vector documents, Vector fileNames, Vector parsersComponent, LogManager log) {
		super(qn, df, parsersSequence, documents, fileNames,log);
		this.sReq = df.createServiceRequestType();
		from = new Vector();   // da riempire con tutte le componenti che fanno uscire un arco
		to = new Vector();     // da riempire con tutte le componenti che fanno entrare un arco
		componentElems = new Vector();
		for(int i = 0; i< parsersComponent.size(); i++) {
			Parser p = (Parser) parsersComponent.get(i);
			componentElems.addAll(p.getElements());
		}
	}

	public void createServiceRequestSection() {
		for (int i = 0; i < parsers.size(); i++) {
			flagRef = false;
			Parser ps = (Parser) parsers.get(i);
			Vector ordinatedSteps = createMessageStruct(ps);
		    ordinatedSteps.addAll(referenceFragManage(ps));
		    addLastStep(ordinatedSteps);
		 //   stampa(ordinatedSteps);
			createOutput(ordinatedSteps);
		}
		qn.getServiceRequest().add(sReq);
	}

	public Vector referenceFragManage(Parser ps) {
		String nameFile = ps.getPathRef();
		int index = nameFile.lastIndexOf("\\");
		nameFile = nameFile.substring(index + 1, nameFile.length());
	    //System.out.println(nameFile);
		//	System.out.println(f.getAbsoluteFile());
        //	System.out.println(ps.getPathRef());
		Parser pRef = null;
		if(nameFile.equals("")) {
			Object ref = ps.getReferToUML2();
			if(ref!= null ) {
				// eclipse uml versione 1
				if(ref instanceof org.eclipse.uml2.Interaction)
				   pRef = getParserPlastic((org.eclipse.uml2.Interaction)ps.getReferToUML2());
				// eclipse uml versione 2
				else
				   pRef = getParserUML2((org.eclipse.uml2.uml.Interaction)ps.getReferToUML2());
			}
			else {
				return new Vector();
			}
		}
		else {
	    //Document doc = this.getDocument(nameFile);
		 pRef = getParser(nameFile);
		 }
		if(pRef==null)
			return new Vector();
		flagRef = true;
		//this.insertLabels(pRef);
		return createMessageStruct(pRef);
	}

   //reorder only the steps not returning
	public Vector reorder(Vector steps, Vector messages) {
		Vector toReturn = new Vector();
		while(messages.size()!=0) {
			int min = this.getMinimum(messages);
			toReturn.add(steps.get(min));
			steps.remove(min);
			messages.remove(min);
		}
		return toReturn;
	}

    //reorder all the steps
	public Vector reorderAll(Vector notReturningSteps, Vector returningSteps) {
		Vector returnVector = new Vector();
		// caso in cui non devo riordinare niente.
		if(returningSteps.size()==0)
			return notReturningSteps;
		returnVector.add(notReturningSteps.remove(0));
		String currentSeq = "1";
		while(notReturningSteps.size()!=0 || returningSteps.size()!=0 ) {
			String ipoteticNextSeq ="";
			// devo controllare perch� se no da errore null pointer
			if(notReturningSteps.size()!=0){
		        ipoteticNextSeq = getFirstMessages(notReturningSteps).getSequenceNumber();
			}
			else
				ipoteticNextSeq = "-1";
		    if(existNext(currentSeq , ipoteticNextSeq)) {
				    returnVector.add(notReturningSteps.remove(0));
				    currentSeq = ipoteticNextSeq;   
				    }
			else {
				while(returningSteps.size()!=0) {
					// caso in cui esiste il messaggio di ritorno diretto
					int index = getStep(returningSteps, currentSeq);
					if(index!=-1 ) {
						returnVector.add(returningSteps.remove(index));
					    // non aggiorno la sequenza xk� non � cambiata
					}
					// caso in cui riparte un altro messaggio in avanti dallo stesso busy
					
					ipoteticNextSeq = this.getNextSequence(currentSeq);
					
					index = getStep(notReturningSteps, ipoteticNextSeq);
					if(index!=-1) {
						returnVector.add(notReturningSteps.remove(index));
						currentSeq = ipoteticNextSeq;
						break;
			     }
			     // caso in cui torno sulla lifeline precedente con il messaggio di ritorno
			     currentSeq = this.cutNextSequence(currentSeq); 			    
			     }
			 }
			
		 }
		return returnVector;
	}

	public Messages getFirstMessages(Vector steps) {
		Step step = (Step)steps.firstElement();
		return step.getMex();
	}

	/**
	 *  This method cut the last message sequence index.
	 *  For example if the current ndex is 1.1.1 this method
	 *  will return 1.1
	 * 
	 */	
	public String cutNextSequence(String currentSequence) {	
		String app="";  
		String[] a = currentSequence.split("\\.");
        	for(int i=0; i < a.length-1; i++) {	
        		app+="."+a[i];
        	}
        	app = app.replaceFirst(".","");
        	return app;
        	
	}

	/**
	 * It return the nextSequence
	 * for example if the current sequence is 1.1.1 the method
	 * will return 1.1.2
	 * 
	 */
	public String getNextSequence(String currentSequence) {
		int lastElemIndex = currentSequence.lastIndexOf(".");
		String lastElem = currentSequence.substring(lastElemIndex+1);
		int lastElemToInt = Integer.parseInt(lastElem);
		lastElemToInt ++;
        String app="";  
		String[] a = currentSequence.split("\\.");
	        for(int i=0; i < a.length-1; i++) {	
	         app+=a[i]+".";
	       }
	        app+=lastElemToInt;
		return app;
	}

	/**
	 * This method return true if exist a sequent message false otherwise
	 * 
	 * Example exist("1.1.2","1.1.2.1") return true becouse the prefix is equal
	 * and the suffix is .1
	 * 
	 *  
	 */
	public boolean existNext(String currentSeq, String ipoteticNextSeq) {
	     String prefix = cutNextSequence(ipoteticNextSeq);
	     if(prefix.equals(currentSeq)) {
	        String suffix = ipoteticNextSeq.replaceFirst(prefix,"");
	     if(suffix.equals(".1"))
	         return true;
	     }
	        return false;
	}

	/**
	 * Return the reserched step index with the desidered index
	 * 
	 * return The index if exist -1 otherwise.
	 */
	public int getStep(Vector steps, String sequence) {
		for(int i = 0; i < steps.size(); i++) {
			Step step = (Step) steps.get(i);
			Messages m = step.getMex();
			if(m.getSequenceNumber().equals(sequence)){
				return i;
			}
		}
		return -1;
	}

	/**
	 * This method create a ordinate sequence of message to riproduce the Sequence diagram.
	 * 
	 */
	public Vector createMessageStruct(Parser ps) {
		
		Vector stepSequence = new Vector();
		Vector messageSequence = new Vector();
		Vector returningStepSequence = new Vector();
		elements = ps.getElements();
		this.setFragGer();
		String scenario = this.findScenarioLabel();
		if(!this.flagRef)
		    Step.setScenarioLab(scenario);
	
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) instanceof Instance) {
				Instance ins = (Instance) elements.get(i);
				for (int j = 0; j < ins.getMessages().size(); j++) {	
					Messages m = (Messages) ins.getMessages().get(j);
					Instance insChild = (Instance) ins.getChildren().get(j);
					if(!m.isIsReturned()) {
					    stepSequence.add(new Step(ins, insChild, m));
					    String prob = ins.getLabels().get(j).toString();
					    m.setProb(prob);
					    messageSequence.add(m);
					}
					else{
						if((ins.isDelay() || insChild.isDelay())&& (!ins.isAnActor()&& !insChild.isAnActor())) {
							/*if(insChild.isAnActor()) {
								m.setName("ThinkDevice");
							}
							else {*/
							
							
							m.setName("InternalAction");
							//}
							returningStepSequence.add(new Step(ins, insChild, m));
						}
					}
				}
			}
		}
		
		stepSequence = reorder (stepSequence, messageSequence);
		stepSequence = reorderAll(stepSequence, returningStepSequence);
		//delInvalidInstance(stepSequence);
		//addLastStep(stepSequence);
		return stepSequence;
	}

	public void stampa(Vector stepSequence) {
		for(int i = 0; i < stepSequence.size(); i++) {
		    Step step = (Step)stepSequence.get(i);
		    System.out.println("Ins " + step.getFrom().getName());
	        System.out.println("Mex " + step.getMex().getName());		      
		    System.out.println("Ins " + step.getTo().getName());
		    System.out.println();
	    }
	}

	/**
	 *  This method del all the instance that do not call noting sevice.
	 *  That can occour when in the sequence diagram there is a return message that is not child of
	 *  a not return message.
	 */
/*	public void delInvalidInstance(Vector steps) {
		for(int i = 0; i < steps.size()-1; i++) {
			Step stp1 =(Step) steps.get(i);
			Step stp2 =(Step) steps.get(i+1);
			Messages m1 = stp1.getMex();
			Messages m2 = stp2.getMex();
			if(!m1.isIsReturned() && m2.isIsReturned()) {
				String seqm1 = m1.getSequenceNumber();
				String seqm2 = m2.getSequenceNumber();
				if(!seqm1.equals(seqm2)) {
					stp2.setFrom(stp1.getTo());
				}
			}
		}
	}*/

	/*
	 * This method must to add, if is necessary the return step to build a closed workload
	 * and it must to insert the think device in first position if exist an actor.
	 */
	public void addLastStep(Vector steps) {
		//if (this.flagRef)
			//return;
		Step firstStep = (Step) steps.get(0);
		Instance from = firstStep.getFrom();
		if(from.isAnActor()) {
			from.setName("ThinkDevice");
       //	aggiungo un elemento fittizio per dire che il primo elemento ha un servizio thinkDevice
			steps.add(0, new Step(new Instance(""), from, new Messages("ThinkDevice")));
		}
		Step lastStep = (Step) steps.lastElement();
		Instance to = lastStep.getTo();
		if (!from.equals(to)) {
			if(from.isAnActor())
			    steps.add(new Step(to, from, new Messages("ThinkDevice")));
			else {
				steps.add(new Step(to, from, new Messages("InternalAction")));
			}
		}
	}

	public void createOutput(Vector orderedSequence) {
		for(int i = 0; i < orderedSequence.size()-1; i++) {
			Step from = (Step)orderedSequence.get(i);
			Step to = (Step)orderedSequence.get(i+1);
			Vector remainingSeq = new Vector();
			remainingSeq.addAll(orderedSequence.subList(i,orderedSequence.size()));
			createTimeServType(from, to, remainingSeq);
		}
	}

    public void createTimeServType(Step from, Step to, Vector remainingSeq ) {
    	Messages mex1 = from.getMex();
    	Messages mex2 = to.getMex();
    	
    	// controllo se mex1 e mex2 si trovano sullo stesso compartment
    	if(checkInSameCompounds(mex1, mex2)) {
    		creatNormalStepsServType(from, to);
    	}
    	else {

    		String jump = checkTypeofJump(mex1, mex2);
    		// entro in fragment di tipo alt
    		if(jump.equals("entering_alt")) {
    			alternativeFragmentGen(remainingSeq);
    			return;
    		}

    		// entro in un fragment di tipo par
    		if(jump.equals("entering_region")) {
    			parallelFragmentGen(remainingSeq);
    		    addForkJoinServer();
    		}

    		// esco e vado a finire in un fragment di tipo alt
    		if(jump.equals("outgoing_alt")) {
    			alternativeFragmentGen(remainingSeq);
    			return;
    		}

    	//	if(jump.equals("outgoing_region")) {
    	//		System.out.println("devo gestire il par");
    	//	}

    		// ho l'ultimo messaggio del if case. Devo trovare il primo messaggio fuori dall'else se esiste
    		if(jump.equals("outgoing_elseCase")) {

    			int index = getFirstStep((new Vector(remainingSeq.subList(1,remainingSeq.size()))));
    			//Step nextStep = (Step)remainingSeq.get(index+1);
    			Vector newSeq = new Vector();
                newSeq.add(remainingSeq.firstElement());
                
                newSeq.addAll(remainingSeq.subList(index+1,remainingSeq.size()));
                Step s1 =(Step)newSeq.firstElement();
               /* if(s1.checkIfHaveParentRegion()) {
                	if(!nextStep.checkIfSameRegion(s1)){
                	creatNormalStepsServType(s1, new Step(new Instance("Join"), new Instance("Join"), new Messages("Join")));
                	return;
                	}
                }*/
                	
                Step s2 = (Step) newSeq.get(1);             
                createTimeServType(s1, s2, newSeq);
    			return;
    		}

    		// esco da un ifcase o da un else case e non rientro in nessun altro fragment
    		if(jump.equals("normal_outgoing")) {
    			creatNormalStepsServType(from, to);
    		}

    		// esco dall'if e fininsco in un par
    		if(jump.equals("outgoingInParFromIf")) {
    	        parallelFragmentGen(remainingSeq);   
    	        addForkJoinServer();
    		}

    		// esco dall'else e finisco in un par
    		if(jump.equals("outgoingInParFromElse")) {
    			creatNormalStepsServType(from, new Step(new Instance(""), new Instance("Fork"), new Messages("Fork")));
    		}
    	}
    }

    /*
     * Sono sicuro che mex1 e mex2 si trovano in fragment diversi
     */
    public String checkTypeofJump(Messages mex1, Messages mex2) {
    	Fragment f1 = mex1.getPather();
    	Fragment f2 = mex2.getPather();
    	
    	if (f1 == null && f2 != null) {
    		String type = f2.fragFather.getName();
    		return "entering_"+type;
    	}

    	if (f1 != null && f2 == null) {
    		//String type = f1.fragFather.getName();
    		if(f1.fragFather.getName().equals("region")) {
    			return "outgoing_region";
    		}
    		else
    			return "normal_outgoing";
    	}

    	String type = f2.fragFather.getName();
    	// se f2 e' interno ad f1
    	if(f1.visitChild(f2,0)) {
    		return "entering_"+type;
    	}

    	//il messaggio in f1 esce e il successivo si trova in un else
    	if(f2.checkIfElseDescendent()) {
    		return "outgoing_elseCase";
    	}

    	Fragment fFatherIf = f1.fragFather.fragFather;

    	// caso il messaggio successivo si trova direttamente sul padre del fragment dell'if
    	if(fFatherIf != null && fFatherIf.equals((f2)))
    		return "normal_outgoing";

    	if(type.equals("region") && !f1.checkIfElseDescendent() && !mex1.getRoot().equals(mex2.getRoot())){
    		return "outgoingInParFromIf";
    	}

    	if(type.equals("region") && f1.checkIfElseDescendent()&& !mex1.getRoot().equals(mex2.getRoot())) {
    		return "outgoingInParFromElse";
    	}
    	
    		return "outgoing_"+type;
    	}

    public boolean checkIFForkIsToAdd(Vector remainingStep) {
        Step from = (Step) remainingStep.get(0);
    	
    	Messages mFrom = from.getMex();
		Fragment fragFromComp = mFrom.getPather();
		// se ho gi� inserito il punto di fork all'uscita del precedente parallel-region oppure l'ho inserito quando ho gestito l'else case
		if(fragFromComp != null){
			Fragment fragFrom = fragFromComp.fragFather;
			
			
			if(fragFrom.getType().equals("region"))
				return true;
		}	
		
		from = (Step) remainingStep.get(1);
		mFrom = from.getMex();
		fragFromComp = mFrom.getPather();
		if(fragFromComp.checkIfElseDescendent())
			return true;
		return false;
		
    }
    
    
    
    public void managefragmentOfParallel(Fragment compartmentFrag, Vector remainingStep){
    
       Step from = (Step) remainingStep.get(0);
    	
    	if(checkIFForkIsToAdd(remainingStep))
    		return;
    	
    	if(compartmentFrag == null) {
    		creatNormalStepsServType(from, new Step(new Instance(""), new Instance ("Fork"), new Messages("Fork")));
    	    return;
    	}
    	
    	
    	
    	Fragment alternativeFrag = compartmentFrag.fragFather;
    	Step stp =(Step) remainingStep.get(1);
    	Messages m = stp.getMex();
    	if(alternativeFrag.getType().equals("alt") && !m.getLabel().equals("")){
    		String prob = m.getLabel();
    		Messages mFork = new Messages("Fork");
    		mFork.setProb(prob);
    		mFork.setPather(compartmentFrag);
    		Step stpFork = new Step(from.getTo(), new Instance("Fork"), mFork);
    		Vector app = new Vector();
    		app.addAll(remainingStep);
    		app.setElementAt(stpFork, 1);
    		alternativeFragmentGen(app);
    	}
    	
    	else{
    		
    		creatNormalStepsServType(from, new Step(new Instance(""), new Instance ("Fork"), new Messages("Fork")));
    	}
    }
    
    public void parallelFragmentGen(Vector remainingStep) {
    	
    	Vector first = new Vector();
    	Vector last = new Vector();
    	Step stp = (Step) remainingStep.get(1);
    	Messages mex = stp.getMex();
    	//System.out.println("Messaggio attivatore parallel" + mex.getName());
    	Fragment fatherOfRegion = mex.getPather();
    	//compartment delle region
		fatherOfRegion = fatherOfRegion.getParallelFragOfRegion();
		
        //gestisco il caso in cui il paralel si trova su un alt
		Fragment fragmentOfParallel = fatherOfRegion.getFatherFrag();
		managefragmentOfParallel(fragmentOfParallel, remainingStep);
	
		// In region Vector all the region frgment of the paralle fragment
		Vector regions = fatherOfRegion.getChildren();
		Vector app = new Vector();
		app.addAll(remainingStep.subList(1, remainingStep.size()));
		//System.out.println(regions.size());
		
		for(int i = 0; i < regions.size(); i++) {
			//Fragment frRegion =(Fragment) regions.get(i);
			//System.out.println("nome " + frRegion.getType());
		}
		for(int i = 0; i < regions.size(); i++) {
			Fragment frRegion =(Fragment) regions.get(i);
			// non serve prendere il figlio ci pensa getFirstStep
			first.add(frRegion.getFirstStep(app));
			last.add(frRegion.getLastStep(app));
		}
	
		Step lastStep = (Step)last.lastElement();
		int index = app.indexOf(lastStep);
	
		Step firstOut = lastStep.getNextStep(new Vector(app.subList(index, app.size())));
	
		//System.out.println("Il messaggio in uscita  dal join "+ lastStep.getMex().getName());
		
		createForkPoint(first);
		createJoinPoint(last, firstOut, lastStep, remainingStep);
		
    }
    
    

    public void createJoinPoint(Vector lasts, Step firstOut, Step lastStep, Vector remainingStep) {    	
         // se quando esco dal par trovo immediatamente un alt
    	TimeServType tServ;
    	if(lastStep.nextStepIsAlt(firstOut)) {
    		
    		Vector steps = new Vector();
    		Step joinStep = new Step(new Instance("Join"), new Instance ("Join"), new Messages("Join"));
    		int index = remainingStep.indexOf(firstOut);
    		steps.add(joinStep);
    		steps.addAll(remainingStep.subList(index, remainingStep.size()));
    		alternativeFragmentGen(steps);
    	
    		index = sReq.getTimeServiceRequest().size();
    		tServ = (TimeServType)sReq.getTimeServiceRequest().get(index-1);
    		
    	}
    	else {
    	    tServ = createNormalJoinPoint(firstOut);
    	}
		    for(int i = 0; i < lasts.size(); i++) {
		    	Step stp = (Step)lasts.get(i);
		    	Instance insChild = stp.getTo();
		    	Messages lastMex = stp.getMex();
		    	// per creare i link ultimo messaggio region to join.
		    	creatNormalStepsServType(stp, new Step(new Instance(""), new Instance ("Join"), new Messages("Join")));
		    	TransitFromType tFt = df.createTransitFromType();
		    	tFt.setFrom(insChild.getName());
		    	tFt.setFromService(lastMex.getName());
		    	tServ.getTransitFrom().add(tFt);
		    	}
		
		sReq.getTimeServiceRequest().add(tServ);
    }

    public TimeServType createNormalJoinPoint(Step lastStep) {
    	TimeServType tServ = df.createTimeServType();
 		tServ.setServerID("Join");
 		this.from.add("Join");
 		tServ.setService("Join");
 		tServ.setSchedulingPolicy(SchedulingType.get("IS"));
 		tServ.setServiceTime(0);
 		tServ.setTimeUnits(TimeUnitsType.SEC_LITERAL);
 		tServ.setWorkloadName(Step.getScenario());
 		TransitType t = df.createTransitType();
		t.setProbability("1");
		Instance toService = lastStep.getTo();
		Messages mex = lastStep.getMex();
		t.setTo(toService.getName());
		this.to.add(toService.getName());
		t.setToService(mex.getName());
		tServ.getTransit().add(t);
		return tServ;
    }

    public void createForkPoint(Vector forksteps) {
    	TimeServType tServ = df.createTimeServType();
 		tServ.setServerID("Fork");
 	
 		tServ.setService("Fork");
 		tServ.setSchedulingPolicy(SchedulingType.get("IS"));
 		tServ.setServiceTime(0);
 		tServ.setTimeUnits(TimeUnitsType.SEC_LITERAL);
 		tServ.setWorkloadName(Step.getScenario());
    	for(int i = 0; i < forksteps.size(); i++ ) {
    		this.from.add("Fork");
    		Step stp = (Step) forksteps.get(i);
    		Instance toService = stp.getTo();
    		Messages serviceTo = stp.getMex();
    		
    		tServ.setWorkloadName(Step.getScenario());
    		TransitType t = df.createTransitType();
    		//t.setProbability("1");			
    		t.setTo(toService.getName());
    		this.to.add(toService.getName());
    		t.setToService(serviceTo.getName());
    		tServ.getTransit().add(t);
    	}
    	sReq.getTimeServiceRequest().add(tServ);
    	
    }

    /*
     *  Add a server Fork and Join in the server section.
     */
    public void addForkJoinServer() {
    	if (flag == true)
    		return;
    	flag = true;
		// manca il controllo se gi� esiste
		NodeType n = (NodeType) qn.getNode().get(0);
		QueueType qTypeFork = df.createQueueType();
		qTypeFork.setCapacity(CapacityType.ZERO_LITERAL);
		qTypeFork.setName("Fork");
		ServerType server = df.createServerType();
		server.setName("Fork");
		server.setQuantity(BigInteger.ONE);
		server.getQueue().add(qTypeFork);
		ServerType serverJoin = df.createServerType();
		serverJoin.setName("Join");
		serverJoin.setQuantity(BigInteger.ONE);
		QueueType qTypeJoin = df.createQueueType();
		qTypeJoin.setCapacity(CapacityType.ZERO_LITERAL);
		qTypeJoin.setName("Join");
		serverJoin.getQueue().add(qTypeJoin);
		n.getServer().add(server);
		n.getServer().add(serverJoin);
	}

    /*
     * return the first step with the else fragment. 
     */
    public int getFirstStep(Vector steps) {
    	Step stp = (Step) steps.get(0);
    	Messages elseMex = stp.getMex();
    	Fragment fElse = elseMex.getPather();
    	for(int i = 0; i< steps.size(); i++) {
    		stp = (Step) steps.get(i);
    		Messages m = stp.getMex();
    		Fragment f = m.getPather();
    		if(f == null) {
    			return i;
    		}
    		if(!f.equals(fElse) && !f.visitChild(fElse, 0)) {
    			//if(!f.checkIfSameParallel(fElse))
    			    return i;
    		}
    	}
    	return -1;
    }

    /**
     * 
     * This method elaborate the alternative fragment
     * 
     * @param steps all the steps of the current sequence.
     *  the first eleement in step is thr last step that have not message in the Alternative fragment
     */
    public void alternativeFragmentGen(Vector steps) {
    	Vector elseCasesSteps = new Vector();
    	Step enteringstep = (Step)steps.firstElement();
    	//System.out.println("Messaggio attivatore " + enteringstep.getMex().getName());
        Step ifStep = (Step)steps.get(1);
        Messages ifMex = ifStep.getMex();
        //System.out.println("primo messaggio sull'if " + ifMex.getName());
        Fragment ifComp = ifMex.getPather();
        Vector sublist = new Vector();
        sublist.addAll(steps.subList(1, steps.size()));
        this.probFather = ifComp.getProbability(sublist);
        Step elseStep = null;
        for(int i = 2; i < steps.size(); i++) {
       
        	elseStep = (Step)steps.get(i);
        	Messages elseMex = elseStep.getMex();
        	Fragment elseComp = elseMex.getPather();
        	if(elseComp == null ) {
        		break;
        	}
        	// se ho trovato un messaggio in un fragment diverso
            if(!ifComp.equals(elseComp)) {
            	//non considero i messaggi interni a fragment a loro volta interni al fragment dell'if
        	    if(!ifComp.visitChild(elseComp, 0)) {
        	    	// non devo considerare i messaggi interni in un else compounds esterno al fragment corrente
        	    	if(!elseComp.checkIfElseIsOfParent(ifComp, elseMex.getRoot())) {
        	    		// caso in cui l'else � un alt con un altro else
        	    		Step annidatedElse;
        	    		Vector app = new Vector();
    	    			app.addAll(steps.subList(i, steps.size()));
    	    			while((annidatedElse = elseComp.checkInAnotherAltWithElse(app))!= null ) {
        	    			elseCasesSteps.add(annidatedElse);
        	    			//System.out.println("else annidato " + annidatedElse.getMex().getName());
        	    			ifMex = annidatedElse.getMex();
        	    			elseComp = ifMex.getPather();
        	    			// setrovo un messaggio fuori dai fragment
        	    			if(elseComp == null) {
        	    				break;
        	    			}
        	    		}
    	    			break;
        	    	}
        	    }
        	}
        }
      //  System.out.println("primo messaggio sull'else " + elseStep.getMex().getName());
  
        
        if(elseCasesSteps.size()==0) {
        	
        	elseStep = checkFirsStepOfNewRegion(elseStep, ifStep, steps);
        	elseStep = checkIfElseIsJoin(elseStep, ifStep);
        	
        }
             
        else{
        	 Step fApp = checkFirsStepOfNewRegion((Step)elseCasesSteps.lastElement(), ifStep, steps);
        	 elseCasesSteps.setElementAt(fApp,  elseCasesSteps.size()-1);
        	 fApp = checkIfElseIsJoin((Step)elseCasesSteps.lastElement(), ifStep);
        	 elseCasesSteps.setElementAt(fApp,  elseCasesSteps.size()-1);
        	 
        }
       
        createAltServType(enteringstep, ifStep , elseStep, elseCasesSteps);
     
    }
    
//  se l'alternative fragment si trova dentro un region e se l'else � il join
    public Step checkIfElseIsJoin(Step elseStep, Step ifStep){
    	Fragment ifFrag = ifStep.getStepFragment();
    	Fragment elseFrag = elseStep.getStepFragment();
    	if(ifFrag == null || elseFrag == null) {
    		return elseStep;
    	}
    	if((elseFrag.checkIfIsRegionDescendent() && ifFrag.checkIfIsRegionDescendent() &&
    			!elseFrag.fragFather.equals(ifFrag.fragFather) )){
    		
    		
    		return new Step (new Instance("Join"), new Instance("Join"), new Messages("Join"));
    		
    	}
    	
    	if((ifFrag.checkIfIsRegionDescendent() && !elseFrag.equals(ifFrag) && !elseFrag.checkIfElseDescendent())){
    		return new Step (new Instance("Join"), new Instance("Join"), new Messages("Join"));
    	}
    	
    	return elseStep;
    	
    	
    }
    
    // se l'else � il primo messaggio interno ad un nuovo par fragment
    public Step checkFirsStepOfNewRegion(Step stepElse, Step ifStep, Vector steps) {
    	
    	Fragment ifFrag = ifStep.getStepFragment();
    	Fragment elseFrag = stepElse.getStepFragment();
    	
    	if(stepElse.checkIfIsRegion() && !ifFrag.checkIfSameParallel(elseFrag) ) {
            Vector stp2 = new Vector();
        	int index = steps.indexOf(stepElse);
        	stp2.addAll(steps.subList(index-1, steps.size()));
        	this.parallelFragmentGen(stp2);
           
        	return new Step(new Instance(""), new Instance("Fork"), new Messages("Fork"));
        }
    	
    	return stepElse;
    }
    

    /*
     * @param enteringStep The last step out of the fragment
     * @param to1 The if case 
     * @paeam to2 The else case
     * @param If exist another alt fragment in the else case, other else case must be procesed.
     */
    public void createAltServType(Step enteringStep, Step to1, Step to2, Vector possibleOtherElse ) {
    	Messages serviceStarting = enteringStep.getMex();
    	Instance serverId = enteringStep.getTo();
    	String scenario = Step.getScenario();
        TimeServType tServ = df.createTimeServType();
       
        tServ.setServerID(serverId.getName());
        this.from.add(serverId.getName());
        tServ.setService(serviceStarting.getName());
        tServ.setSchedulingPolicy(SchedulingType.get(serverId.getServicePolicy()));
      
        if(enteringStep.getFrom().getName().equals("")) {
			String paClosedLoad = serverId.getLabels().get(0).toString();
			createServiceTimeAndUnits(tServ, paClosedLoad, "paclosedLoad");
		}
		else {
		    createServiceTimeAndUnits(tServ, serviceStarting.getServiceLabel(), "pastep");
		}
       
        tServ.setWorkloadName(scenario);       
        Messages serviceTo = to1.getMex();
    	Instance toService = to1.getTo();
    	String base = this.probFather;
    	if(!base.equals(""))
    		base +="*";
   	    String prob = getProb(serviceTo.getProb(), "pastep");
	    tServ.getTransit().add(createToSection(base+prob, serviceTo, toService ));
	    boolean stop = false;
	    do {
	    	this.from.add(serverId.getName());
		    serviceTo = to2.getMex();
		    toService = to2.getTo();
		    String prob1 = getProb(serviceTo.getProb(), "pastep");
		    //prob1 puo' non esistere se non mi trovo in un altro alt quindi e' uguale ""
		  //  if(!prob1.equals(""))
		    //	prob1= "*"+prob1; 
		    String appProb="";
		    if(!prob.equals(""))
		    	 appProb ="(1-"+prob+")";
		    
		    if(!prob1.equals(""))
		    	 prob1 ="*"+prob1;
		    tServ.getTransit().add(createToSection(base + appProb + prob1, serviceTo, toService));
		    
		    if(!prob1.equals(""))
		    	 prob1 =prob1.replaceAll("\\*","");
		    
		    if(appProb.equals(""))
		    	base += appProb;
		    else
		     	base += appProb+"*";
		    prob = prob1.replaceAll("\\*","");
		    if(possibleOtherElse.size() != 0) {
		       to2 = (Step) possibleOtherElse.remove(0);
		    }
		    else {
		    	stop = true;
		    }
    	}
    	while(!stop);
	    for(int j = 0; j < Fragment.getOtherElseCase().size(); j = j+2 ) {
	    	this.from.add(serverId.getName());
			Step stp = (Step) Fragment.getOtherElseCase().get(j);
			Instance ins = stp.getTo();
			Messages mex = stp.getMex();
			String probElse = Fragment.getOtherElseCase().get(j+1).toString() ;
			tServ.getTransit().add(createToSection(probElse, mex, ins));
			
		}
		   sReq.getTimeServiceRequest().add(tServ);
    }

    public TransitType createToSection(String prob, Messages serviceTo, Instance toService) {
    	TransitType t = df.createTransitType();
    	t.setProbability(prob);
		t.setTo(toService.getName());
		this.to.add(toService.getName());
		t.setToService(serviceTo.getName());
	    return t;
    }

    /*
     * This method create a step sequence
     */
    public void creatNormalStepsServType(Step from, Step to) {
    	Messages serviceStarting = from.getMex();
    	Instance serverId = from.getTo();
    	Messages serviceTo = to.getMex();
    	Instance toService = to.getTo();
    	String scenario = Step.getScenario();
        TimeServType tServ = df.createTimeServType();
		tServ.setServerID(serverId.getName());
		this.from.add(serverId.getName());
		tServ.setService(serviceStarting.getName());
		tServ.setSchedulingPolicy(SchedulingType.get(serverId.getServicePolicy()));
		if(from.getFrom().getName().equals("")) {
			String paClosedLoad = serverId.getLabels().get(0).toString();
			createServiceTimeAndUnits(tServ, paClosedLoad, "paclosedLoad");
		}
		else {
		    createServiceTimeAndUnits(tServ, serviceStarting.getServiceLabel(), "pastep");
		}
		tServ.setWorkloadName(scenario);
		TransitType t = df.createTransitType();
		t.setProbability("1");			
		t.setTo(toService.getName());
		this.to.add(toService.getName());
		t.setToService(serviceTo.getName());
		tServ.getTransit().add(t);
		sReq.getTimeServiceRequest().add(tServ);
    }

    /**
     * This method is able to check tf the two messages in input are in the same Fragment compounds
     * 
     */
    public boolean checkInSameCompounds(Messages mex1, Messages mex2) {
    	Fragment f1 = mex1.getPather();
    	Fragment f2 = mex2.getPather();
    	if (f1 == null && f2 == null)
    		return true;
    	if (f1 == null && f2 != null)
    		return false;
    	if (f1 != null && f2 == null)
    		return false;
    	if(f1.equals(f2)){
    		return true;
    	}
    	else
    		return false;
    }
    
      

    public void createServiceTimeAndUnits(TimeServType tServ, String label,	String SterType) {
		if (checkStereotype(label, SterType)) {
			String[] timeAndUnits = getThinkTimeAndUnits(label);		
			tServ.setServiceTime(Float.parseFloat(timeAndUnits[0]));
			tServ.setTimeUnits(TimeUnitsType.get(timeAndUnits[1]));
		}
	}

	public Vector getFromVector() {
		return this.from;
	}

	public Vector getToVector() {
		return this.to;
	}

}
