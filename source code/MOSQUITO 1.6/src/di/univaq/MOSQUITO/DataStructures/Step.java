package di.univaq.MOSQUITO.DataStructures;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;



public class Step {
	
	private Instance from;
	private Instance to;
	private Messages mex;
	private static String scenarioLabel;
	
	
	public Step(Instance from, Instance to, Messages mex) {
		this.from = from;
		this.to = to;
		this.mex = mex;
	}

	public static void setScenarioLab(String label) {
		scenarioLabel = label;
	}

	public static String getScenario() {
		return scenarioLabel;
	}

	public Instance getFrom() {
		return this.from;
	}

	public Instance getTo(){
		return this.to;
	}

	public Messages getMex() {
		return this.mex;
	}

	public void setFrom(Instance from) {
		this.from = from;
	}

	public void setTo(Instance to) {
		this.to = to;
	}
	
	/**
	 * This method return the step after this step in the Vector of steps 
	 * 
	 */
	public Step getNextStep(Vector steps) {
		for(int i = 0; i < steps.size()-1; i++) {
			Step stp1 = (Step) steps.get(i);
			Messages ifMex = stp1.getMex();
			Fragment ifComp = ifMex.getPather();
			Step stp2 = (Step) steps.get(i+1);
			Messages elseMex = stp2.getMex();
			Fragment elseComp = elseMex.getPather();
			if(/* this.equals(stp1) && */!this.equals(stp2)) {
				
				if(elseComp==null)
					return stp2;
			//devo controllare se stp2 si trova in un else del padre
				if(!elseComp.checkIfElseIsOfParent(ifComp, elseMex.getRoot())) {
					
					if(elseComp.fragFather.getName().equals("region"))
						return new Step(new Instance(""), new Instance("Fork"), new Messages("Fork"));
				    return stp2;
				}
			}
		}
		return null;
	}
	
	public boolean checkIfIsRegion(){
		Messages m = this.getMex();
		Fragment f = m.getPather();
		if(f == null)
			return false;
		return f.checkIfIsRegion();
	}
	
	public boolean checkIfHaveParentRegion() {
		Messages m = this.getMex();
		Fragment f = m.getPather();
		if(f == null)
			return false;
		return f.checkIfIsRegionDescendent();
	}
	
	
	public boolean checkIfSameRegion(Step stp) {
		
		Fragment fr1 = this.getStepFragment();
		Fragment fr2 = stp.getStepFragment();
		if(fr1 == null || fr2 == null) {
			return false;
		}
		return fr1.checkIfSameRegion(fr2);
	}
	
	public Fragment getStepFragment() {
		Messages m = this.getMex();
		return m.getPather();
	}
	
	public boolean nextStepIsAlt(Step nextStep){
		Fragment nextFrag = nextStep.getStepFragment();
		Fragment prevFrag = this.getStepFragment();
		
		//pu� darsi che prevFrag non � mai null
		if(nextFrag == null || prevFrag == null) {
			return false;
		}
			
		if(nextFrag.fragFather.getType().equals("alt")) {
			if(!nextFrag.visitChild(prevFrag,0));
			    return true;
		}
		return false;
		
		
	}
}
