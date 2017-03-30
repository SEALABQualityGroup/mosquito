package di.univaq.MOSQUITO.trasformation.egTrasformation;

import java.util.Vector;

import Devices.CPSNodeType;
import Devices.CompoundNodeType;
import Devices.DevicesFactory;
import Devices.EGType;
import Devices.ExpandedNodeType;
import Devices.PSType;
import di.univaq.MOSQUITO.DataStructures.UseCase.Actor;
import di.univaq.MOSQUITO.DataStructures.UseCase.ChildTree;
import di.univaq.MOSQUITO.DataStructures.UseCase.UseCase;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;

public class CompoundNodePrincipal extends XmlDocumentSection {

	
    private Vector probUseCases;
    private Vector nameUseCase;
	
	public CompoundNodePrincipal(Vector parsersUseCase, PSType perfScen, DevicesFactory eg,LogManager log) {
		
		super(perfScen, eg, parsersUseCase,log);
		this.probUseCases = new Vector();
		this.nameUseCase = new Vector();
	}

	public void createCompoundNode() {
		
		EGType exgType = eg.createEGType();
		exgType.setEGname("principale");
		exgType.setIsMainEG(true);
		exgType.setStartNode("compoundNodePrincipale");
		CompoundNodeType cmpNType = eg.createCompoundNodeType();
		cmpNType.setNodeName("compoundNodePrincipale");
		CPSNodeType caseNode = eg.createCPSNodeType();
		for(int i = 0; i < parsers.size(); i++) {
			Parser parser = (Parser)parsers.get(i);
			calcolaProbs(parser.getTree());
			for(int j = 0; j < probUseCases.size(); j++) {
				ExpandedNodeType expNode = eg.createExpandedNodeType();
				expNode.setEGname("ExecutionGraph"+(j+1));
				expNode.setNodeName(nameUseCase.get(j).toString());
				expNode.setProbability(Float.parseFloat(probUseCases.get(j).toString()));
				caseNode.getExpandedNode().add(expNode);
			}
			cmpNType.setCaseNode(caseNode);
			exgType.getCompoundNode().add(cmpNType);
		}
		perfScen.getExecutionGraph().add(exgType);
	}

	public void calcolaProbs(Vector tree) {
		/*if(tree == null)
			return;*/
		for (int i = 0; i < tree.size(); i++) {
			UseCase useCase = (UseCase) tree.get(i);
			nameUseCase.add(useCase.getName());
			Vector v = useCase.getChildren();
			float prob = 0; 
			for (int j = 0; j < v.size(); j++) {
				ChildTree c = (ChildTree) v.get(j);
				Actor a = c.getAttore();
				
				String probActor = getProb(a.getAccessProb(), "reuser");
				if(probActor.equals(""))
					probActor = "0";
				String probAssociation = getProb(c.getLabels(), "reuser");
				if(probAssociation.equals(""))
					probAssociation = "0";
				prob += (Float.parseFloat(probActor) * Float.parseFloat(probAssociation));
				
			}
			probUseCases.add(new Float(prob));
		}
	}

	public Vector getUseCaseName() {
		return this.nameUseCase;
	}

}
