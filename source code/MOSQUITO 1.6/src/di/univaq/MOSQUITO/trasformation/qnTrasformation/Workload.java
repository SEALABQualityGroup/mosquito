package di.univaq.MOSQUITO.trasformation.qnTrasformation;

import java.util.Vector;

import QNM2MetaMod.ClosedWorkloadType;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import QNM2MetaMod.TimeUnitsType;
import QNM2MetaMod.TransitType;
import QNM2MetaMod.WorkloadType;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class Workload extends XmlDocumentSection {

	private WorkloadType workload;

	public Workload(Vector parsersSequence, QNMType qn, QNM2MetaModFactory df, LogManager log) {
		super(qn, df, parsersSequence, log);
		workload = df.createWorkloadType();
	}

	public void createWorkloadSection() {
		for (int j = 0; j < parsers.size(); j++) {
			elements = ((Parser)parsers.get(j)).getElements();
			String labelScenario = findScenarioLabel();
			for (int i = 0; i < elements.size(); i++) {
				if (elements.get(i) instanceof Instance) {
					Instance ins = (Instance) elements.get(i);
					if (ins.isAnActor()) {
						ClosedWorkloadType cw = createClosedWorkload(ins, labelScenario);
						workload.getClosedWorkload().add(cw);
					}
				}
			}
		}
		qn.getWorkload().add(workload);
	}

	public ClosedWorkloadType createClosedWorkload(Instance ins, String labelScenario) {
		for (int i = 0; i < ins.getMessages().size(); i++) {
			Messages message = (Messages) ins.getMessages().get(i);
			String messagesLabel = ins.getLabels().get(i).toString();
			ClosedWorkloadType cw = df.createClosedWorkloadType();
			cw.setNumberOfJobs(getNumberOfJobs(messagesLabel));
			cw.setThinkDevice("ThinkDevice");
			String[] timeAndUnits = getThinkTimeAndUnits(messagesLabel);
			cw.setThinkTime(Float.parseFloat(timeAndUnits[0]));
			cw.setTimeUnits(TimeUnitsType.get(timeAndUnits[1]));
            cw.setWorkloadName(labelScenario);
            TransitType t = df.createTransitType();
            //devo impostare la probabilitï¿½ ma devo vedere prima come gestire i fragment
            t.setProbability("1");
            t.setTo(((Instance)ins.getChildren().get(i)).getName());
            t.setToService(message.getName());
            cw.getTransit().add(t);
            return cw;
		}
		return null;
	}

	public String getNumberOfJobs(String label) {
		String labelTemp = label.toLowerCase();
		int firstIndex = labelTemp.indexOf("=");
		int secondIndex = labelTemp.indexOf(",");
		if (firstIndex == -1 || secondIndex == -1) {
			System.out.println("Uno stereotipo <<PAclosedLoad>> non è stato definito correttamente");
			log.addError(PropertiesManager.getProperties("e21"));
			return "";
		}
		return label.substring(firstIndex + 1, secondIndex);
	}
}
