package di.univaq.MOSQUITO.trasformation.qnTrasformation;

import java.util.Vector;

import QNM2MetaMod.ArcType;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.trasformation.XmlDocumentSection;
import di.univaq.MOSQUITO.utility.LogManager;

public class Arc extends XmlDocumentSection {
	
	private Vector from;
	private Vector to;
	
    
	public Arc(Vector parsersSequence, QNMType qn, QNM2MetaModFactory df, LogManager log) {
		super(qn, df,parsersSequence, log);
		from = new Vector();
		to = new Vector();
		
		
	}
	
	
	public void setDataforArcSection() {
		for(int i = 0; i < parsers.size(); i++) {
			Parser ps = (Parser)parsers.get(i);
			setFlagVisit(ps);
			loadConncetions(ps.getElements());
		}
	
		
		//createXmlSection();
	}
	
	public void createArcSection(ServiceRequest sr) {
		from = sr.getFromVector();
		to = sr.getToVector();
		deleteDuplicate();
		createXmlSection();
	}
	
	public void createXmlSection() {
		for(int i = 0; i < from.size(); i++) {
			ArcType arc = df.createArcType();
			arc.setFromNode(from.get(i).toString());
			arc.setToNode(to.get(i).toString());
			qn.getArc().add(arc);
		}
	}
	
	public void setFlagVisit(Parser ps){
		for(int i = 0; i < ps.getElements().size(); i++){
			if(ps.getElements().get(i) instanceof Instance) {
				Instance ins = (Instance)ps.getElements().get(i);
				for(int j = 0; j < ins.getMessages().size(); j++){
				    Messages mes = (Messages)ins.getMessages().get(j);
					mes.visitated = false;
				}
			}
		}
	}

	public void loadConncetions(Vector elements) {
		this.elements = elements;
		for(int i = 0; i < elements.size(); i++){
			if(elements.get(i) instanceof Instance){
				Instance ins = (Instance)elements.get(i);
				visit(ins);
			}
		}
	}

	public void visit(Instance ins) {
		for(int i = 0; i < ins.getChildren().size(); i++) {
			Messages mes = (Messages) ins.getMessages().get(i);
			if (!mes.visitated && !mes.isIsReturned()) {
		        mes.visitated = true;
		        // dato che i messaggi di ritorno non hanno il sequence number lo imposto adesso
		        if(mes.isReturning()) {
		        	mes.loadNumberSequence(elements);
		        }
		        Instance insto = (Instance) ins.getChildren().get(i);
			    visit(insto);
			}
		}
	}

	public void deleteDuplicate() {
		/*System.out.println("Lunghezza from " + from.size() );
		System.out.println("Lunghezza to " + to.size());
		for(int i=0; i< from.size(); i++) {
			System.out.println(from.get(i).toString() +"  " +  to.get(i).toString());
		}*/
		Vector tempFrom = new Vector();
		Vector tempTo = new Vector();
		for(int i = 0; i < from.size(); i++) {
			if(!presence(from.get(i), tempFrom, to.get(i), tempTo)) {
				tempFrom.add(from.get(i));
			    tempTo.add(to.get(i));
			}
		}
		from = tempFrom;
		to = tempTo;
	}

	public boolean presence(Object elemFrom, Vector setFrom, Object elemTo, Vector setTo) {
		for(int i = 0; i < setFrom.size(); i++) {
		    String elFr = elemFrom.toString().toLowerCase();
		    String elTo = elemTo.toString().toLowerCase();
		    String iElFr = setFrom.get(i).toString().toLowerCase();
		    String iElTo = setTo.get(i).toString().toLowerCase();
			if((elFr.equals(iElFr) && elTo.equals(iElTo)))
				return true;
		}
		return false;
	}
}
