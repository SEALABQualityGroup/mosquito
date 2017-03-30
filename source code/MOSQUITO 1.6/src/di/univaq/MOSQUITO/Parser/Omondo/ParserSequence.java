/*
 * ParserSequence.java
 *
 * Created on 7 agosto 2006, 14.05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser.Omondo;

import java.util.Vector;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.Sequence.Fragment;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.DataStructures.Sequence.Messages;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;


/**
 *
 * @author Fabio Calvarese
 */
public class ParserSequence extends Parser {

    /** Creates a new instance of ParserSequence */
    public ParserSequence(Document doc, LogManager log) {
        super("errore durante il parsing del sequence diagram", "editmodel:SequenceDiagramEditModel", log);
        loadXMLFile(doc);
        createGraph();
        setAllMessagesLocation();
        setAllFragLocation();
        encapsulateMessages();
      //  printEncapsulation();
      //  System.out.println();
      //  System.out.println("elementi del sequence");
      //  System.out.println();
      //  printEncapsulation();
      //  System.out.println();
    }

    public void printEncapsulation() {
        for(int i = 0 ; i <elements.size(); i++) {
            if(elements.get(i) instanceof Instance) {
                Instance ins = (Instance) elements.get(i);
                Vector messages = ins.getMessages();
                for(int j = 0; j <messages.size(); j++) {
                    Messages mes = (Messages) messages.get(j);
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

    public void printFragmentEncaps() {
    	
    }
    
    public void  setAllMessagesLocation() {
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof Instance) {
                Instance ins = (Instance) elements.get(i);
                setMessagesLocation(ins);
            }
        }
    }

    public void setMessagesLocation(Instance ins) {
        for(int i = 0; i < ins.getChildren().size(); i++) {
            Instance child =(Instance) ins.getChildren().get(i);
            Messages m = (Messages)ins.getMessages().get(i);
            if (m.visitated == false) {
                m.visitated = true;
                int xRel = m.getX1();
                int yRel = m.getY1();
                m.setX1(xRel + ins.getX());
                m.setY1(yRel + ins.getY());
                m.setX2(xRel + child.getX());
                m.setY2(yRel + child.getY());
                // se voglio stampare l'albero dei messaggi devo decommentare
                //System.out.println(ins.getName() +"--> " + child.getName());
                setMessagesLocation(child);
            }
        }
    }

    public void setAllFragLocation() {
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof Fragment) {
                Fragment frag = (Fragment) elements.get(i);
                setAllFragLocation(frag,0,0);
            }
        }
    }

    public void setAllFragLocation(Fragment frag, int x, int y) {
    	frag.setLabel(frag.findLabel(elements));
        frag.setX1(frag.getX1() + x);
        frag.setY1(frag.getY1() + y);
        frag.setX2(frag.getX2() + frag.getX1());
        frag.setY2(frag.getY2() + frag.getY1());
        for(int i = 0; i < frag.getChildren().size(); i++) {
            Fragment child =(Fragment) frag.getChildren().get(i);
            setAllFragLocation(child, frag.getX1(), frag.getY1());
        }
    }

    protected void loadDiagramElements(Element tempEl) {
        if(tempEl.getNodeName().equals("children")) {
            Elem genericElement = null;
            String type = tempEl.getAttribute("xsi:type");
            
            if (type.equals("editmodel:NotepadEditModel")) {
                String targetConnection = tempEl.getAttribute("targetConnections");
                // divido le varie etichette di connessione
                String[] targets = targetConnection.split("//");
                String note = tempEl.getAttribute("note");
                genericElement = new Label(note, targets);
                super.loadSourceConnections(tempEl, genericElement);
            }
            
            if(type.equals("editmodel:FrameEditModel")) {
                genericElement = loadAnnidatedFragment(tempEl);
            }
            
            if(type.equals("editmodel:ResourceLinkEditModel")) {
            	this.labelRef = tempEl.getAttribute("name");
            	this.pathRef = tempEl.getAttribute("url");
            }

            if(type.equals("editmodel:ActorEditModel")||
                    type.equals("editmodel:InstanceEditModel")) {
                String location = tempEl.getAttribute("location");
                String size = tempEl.getAttribute("size");
                String name = tempEl.getAttribute("itemName");
                genericElement = new Instance(name);
                genericElement.setLocation(location, size);
                // qui carico le sourceConnection e i targetConnection.
                NodeList lista = tempEl.getChildNodes();
                Vector listaTarget = new Vector();
                // qui scorro tutti i messaggi uscenti
                for(int i = 0; i < lista.getLength(); i++) {
                    if(lista.item(i) instanceof Element) {
                        Element el = (Element)lista.item(i);
                        String target = el.getAttribute("targetConnections");                  
                        if(!target.equals("")) {
                        	String[] targets = target.split("//");
                        	for(int t = 0; t < targets.length; t++) {
                                listaTarget.add(targets[t]);
                        	}
                        }
                        this.loadSourceConnections(el, genericElement);
                    }
                }
                genericElement.setTargets((String[])listaTarget.toArray(new String[0]));
                //faccio questa operazione perch� ho preferito non utilizzare
                //un'altra classe identica � fare il cast
                if(type.equals("editmodel:ActorEditModel"))
                    ((Instance)genericElement).setActor();
            }
            // carico i messaggi.
            elements.add(genericElement);
        }
    }

    public void encapsulateMessages() {
        for(int j = 0; j < elements.size(); j++) {
            for(int i = 0; i < elements.size(); i++) {
                if(elements.get(i) instanceof Instance && elements.get(j) instanceof Fragment) {
                    Vector messages = ((Instance)elements.get(i)).getMessages();  
                    for(int z = 0; z < messages.size(); z++) {
                        Messages messaggio = (Messages) messages.get(z);
                        Fragment frag = (Fragment) elements.get(j);
                        if(messaggio.checkEnterInFrag(frag)) {
                            messaggio.setRoot(frag);
                            messaggio.setPather(frag);
                            messaggio.loadFrag(frag);
                            // break;
                        }
                    }
                }
            }
        }
    }

    public void  loadSourceConnections(Element el, Elem genericElement) {
        String location = el.getAttribute("location");
        NodeList sourceNodeList = el.getElementsByTagName("sourceConnections");
        for(int i = 0; i < sourceNodeList.getLength(); i++) {
            Element sourceElem = (Element) sourceNodeList.item(i);
            String xsiType = sourceElem.getAttribute("xsi:type");
            String targetConnection = sourceElem.getAttribute("targetConnections");
            String sourceEnd = sourceElem.getAttribute("sourceEnd");
            String syncronization = sourceElem.getAttribute("synchronization");
            // System.out.println("source " + sourceEnd);
            String sequenceNumber = sourceElem.getAttribute("associatedSequenceNumber");
            String associatedRetunArrow = sourceElem.getAttribute("associatedReturnArrow");
            Messages sourceConnection = new Messages(targetConnection, sourceEnd);
            if(xsiType.equals("editmodel:ReturnArrowEditModel")) { 
            	sourceConnection.setIsReturned(true);
            }
            sourceConnection.setSynchronization(syncronization);
            sourceConnection.setSequenceNumber(sequenceNumber);
            sourceConnection.setReturning(associatedRetunArrow);
            String name = getMessageName(sourceElem);
            sourceConnection.setName(name);
            sourceConnection.setLocation(location);
            String locationY = getLocationY(sourceElem);
            sourceConnection.addYLocation(locationY);
            genericElement.addAssociation(sourceConnection);
            
        }
    }

    public String getMessageName(Element sourceConnection) {
        for(int i = 0; i < sourceConnection.getElementsByTagName("children").getLength(); i++) {
            Element el =(Element) sourceConnection.getElementsByTagName("children").item(i);
            String name = el.getAttribute("labelValue");
            if (!name.equals(""))
                return name;
        }
        return "";
    }
    
    
    public String getLocationY(Element sourceConnection) {
        for(int i = 0; i < sourceConnection.getElementsByTagName("children").getLength(); i++) {
            Element el =(Element) sourceConnection.getElementsByTagName("children").item(i);
            return  el.getAttribute("location");
        }
        return "";
    }

    public void createGraph() {
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof Instance) {
                Instance instance = (Instance)elements.get(i);                
                instance.setStep(instance.findMoreLabel(elements));
                instance.loadNeighbours(elements);
            }
        }
    }

    public Elem loadAnnidatedFragment(Element el) {
        String type = el.getAttribute("type");
        String xsiType = el.getAttribute("xsi:type");
        type = checkType(type, xsiType);
        String location = el.getAttribute("location");
        String size = el.getAttribute("size");
        Fragment frag = new Fragment(type);
        String targetsConn = el.getAttribute("targetConnections");
        frag.setTargets(targetsConn.split("//"));
        frag.setLocation(location, size);
        NodeList list = el.getChildNodes();
        for(int i = 0; i < list.getLength(); i++) {
            if(list.item(i) instanceof Element) {
                Element child = (Element)list.item(i);
                String condition = child.getAttribute("condition");
                frag.setCondition(condition);
                frag.setFragment((Fragment)loadAnnidatedFragment(child));
            }
        }
        return frag;
    }

    // perche' i fragment alt non hanno attributo type
    public String checkType(String type, String xsiType) {
        if(type.equals("")) {
            if(xsiType.equals("editmodel:FrameCompartmentEditModel")) {
                return "compartment";
            } else{
                return "alt";
            }
        }
        return type;
    }
    
}
