package di.univaq.MOSQUITO.trasformation;

import java.util.Vector;

import org.eclipse.uml2.Interaction;
import org.w3c.dom.Document;

import Devices.DevicesFactory;
import Devices.PSType;
import QNM2MetaMod.QNM2MetaModFactory;
import QNM2MetaMod.QNMType;
import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;

public abstract class XmlDocumentSection {
	
	protected Vector elements;
	
	protected Vector parsers;

	protected QNMType qn;

	protected QNM2MetaModFactory df;
	
	protected PSType perfScen;
	
	protected DevicesFactory eg;
	
	protected Vector fileNames;
	
	protected Vector documents;
	
	protected LogManager log;
		

	public XmlDocumentSection(Vector parsers, QNMType qn, QNM2MetaModFactory df, LogManager log ){
		// considero che si possano utilizzare piu' component diagram
		elements = new Vector();
		for(int i = 0; i < parsers.size(); i++) {
			Parser p = (Parser)parsers.get(i);
		 	this.elements.addAll(p.getElements());
		}
		this.qn = qn;
		this.df = df;
		this.log = log;
	}

	public XmlDocumentSection(QNMType qn, QNM2MetaModFactory df, Vector parsers, LogManager log ) {
		this.parsers = parsers;
		this.qn = qn;
		this.df = df;
		this.log = log;
	}
	
	public XmlDocumentSection(QNMType qn, QNM2MetaModFactory df, Vector parsers, Vector documents, Vector fileNames, LogManager log) {
		this.parsers = parsers;
		this.qn = qn;
		this.df = df;
		this.fileNames = fileNames;
		this.documents = documents;
		this.log = log;
	}
	
	public XmlDocumentSection(PSType perfScen, DevicesFactory eg, Vector parsers, LogManager log){
		this.parsers = parsers;
		this.perfScen = perfScen;
		this.eg = eg;
		this.log = log;
	}

	public XmlDocumentSection(PSType perfScen, DevicesFactory eg, Vector parsers, Vector fileNames, Vector documents, LogManager log){
		this.parsers = parsers;
		this.perfScen = perfScen;
		this.eg = eg;
		this.fileNames = fileNames;
		this.documents = documents;
		this.log = log;
	}

	public static boolean checkStereotype(String label, String stereotype) {
		if(label!=null)
		    return label.toLowerCase().contains(stereotype.toLowerCase());
		return false;
	}

	public String findScenarioLabel() {
        for(int i = 0; i < elements.size(); i++ ) {
        	if(elements.get(i) instanceof Label) {
        		Label label = (Label) elements.get(i);
        		if(label.getTargetConnection().length == 1 && label.getSourceConnection().size() == 0)
        			return label.getNote();	
        	}
        }
        return "";
	}

	public String findScenarioLabel(Vector elems) {
        for(int i = 0; i < elems.size(); i++ ) {
        	if(elems.get(i) instanceof Label) {
        		Label label = (Label) elems.get(i);
        		if(label.getTargetConnection().length == 1 && label.getSourceConnection().size() == 0)
        		    return label.getNote();	
        	}
        }
        return "";
	}

	public String[] getThinkTimeAndUnits(String label) {
		if(label.equals("")){
			return new String[]{"0",""};
		}
		try{
        String[] splitted = label.split(",");
        String[] returnValue = new String[2];
        returnValue[0] = splitted[splitted.length-2].replaceAll("\\(","");
	    returnValue[1] = splitted[splitted.length-1].replaceAll("'","");
	    returnValue[1] = returnValue[1].replaceAll("}","");
	    returnValue[1] = returnValue[1].replaceAll(" ","");
	    returnValue[1] = returnValue[1].replaceAll("\\)","");
	    returnValue[1] = returnValue[1].toLowerCase();
		return returnValue;
		}
		catch(Exception e) {
			return new String[]{"0",""};
		}
	}

	public static String getProb(String prob, String stereotype){
		if(checkStereotype(prob, stereotype)){
			int firstIndex = prob.indexOf("=");
			int secondIndex =prob.indexOf("}");
			if(firstIndex != -1 && secondIndex != -1)
				return prob.substring(firstIndex+1, secondIndex);
		}
		return "";
	}

	public void setFragGer() {
		/*for(int i = 0; i < this.elements.size(); i++) {
			if(elements.get(i) instanceof Instance) {
				Instance ins = (Instance) elements.get(i);
				for(int j = 0; j < ins.getMessages().size(); j++) {
					Messages mex = (Messages)ins.getMessages().get(j);
					if(mex.getRoot() != null) {
				        mex.getRoot().findFragApp(mex.getPather(), null);
				        mex.getRoot().findFragApp(mex.getPather().fragFather, null);
					}
				}
			}
		}*/
		//aggiunto
		for(int i = 0; i < this.elements.size(); i++ ) {
			
			if(elements.get(i) instanceof Fragment) {
				Fragment f = (Fragment) this.elements.get(i);
				f.setAllFragFather(0);
			}
		}
	}
	
	

	public int getMinimum(Vector allMessages) {
		if(allMessages.size() > 0) {
		    Messages minimumMex =(Messages) allMessages.get(0);
		    int minimumIndex = 0;
		for(int i = 1; i < allMessages.size(); i++) {
			Messages m = (Messages) allMessages.get(i);
			if (m.less(minimumMex)) {
				minimumMex = m;
				minimumIndex = i;
			}
		}
		 return minimumIndex;
		}
		return -1;
	}
	

	public Document getDocument(String fileName) {
		for(int i = 0; i < this.fileNames.size(); i++) {
			String tempFileName =  this.fileNames.get(i).toString();
			if(fileName.toLowerCase().equals(tempFileName.toLowerCase())) {
                return (Document)this.documents.get(i);
			}
		}
		return null;
	}
	
	public Vector getSequenceFileNames(Vector fileNames) {
		Vector toReturn = new Vector();
		for(int i = 0; i < fileNames.size(); i++) {
			String fileName = fileNames.get(i).toString();
			if(fileName.endsWith(".usd"))
				toReturn.add(fileName);
		}
		
		return toReturn;
	}
	
	public Parser getParser(String fileName) {
		Vector fileNameSequence = getSequenceFileNames(fileNames);
		for(int i = 0; i < fileNameSequence.size(); i++) {
			String tempFileName = fileNameSequence.get(i).toString();
			if(fileName.toLowerCase().equals(tempFileName.toLowerCase())) {
				return (Parser)this.parsers.get(i);
			}
		}
		return null;
	}

	
	public Parser getParserPlastic(Interaction inter) {
		for(int i = 0; i < this.documents.size(); i++) {
			Interaction interaction = (Interaction) documents.get(i);
			if(inter.equals(interaction)){
				return (Parser)this.parsers.get(i);
			}
		}
		return null;
	}
	
	public Parser getParserUML2(org.eclipse.uml2.uml.Interaction inter) {
		for(int i = 0; i < this.documents.size(); i++) {
			org.eclipse.uml2.uml.Interaction interaction = (org.eclipse.uml2.uml.Interaction) documents.get(i);
			if(inter.equals(interaction)){
				return (Parser)this.parsers.get(i);
			}
		}
		return null;
	}

    public int getMaxReturnedMexIndex(String sequence, Vector elem) {
		int index = -1;
		for(int i = 0; i < elem.size(); i++) {
			Messages m = (Messages)elem.get(i);
			if(!sequence.contains(m.getSequenceNumber())) {
				index = i;
			}
			else{
				return index;
			}
		}
		return index;
	}
	
	public Vector reorder(Vector mex) {
		Vector toReturn = new Vector();
		while (mex.size()!=0) {
			int min = getMinimum(mex);
		    toReturn.add(mex.get(min));
		    mex.remove(min);
		}
		return toReturn;
	}
	
	public Vector invert(Vector returningMes) {
		Vector toReturn = new Vector();
		for(int i = returningMes.size()-1; i >= 0; i--) {
			toReturn.add(returningMes.get(i));
		}
		return toReturn;
	}
	
	public Vector getMex(Vector mex, boolean returning) {
		Vector toReturn = new Vector();
		for(int i = 0; i < mex.size(); i++) {
			Messages m = (Messages)mex.get(i);
			if(m.isIsReturned() == returning) {
				toReturn.add(m);
			}
		}
		return toReturn;
	}
	
	public LogManager getLog() {
		return this.log;
	}
}
