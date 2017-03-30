/*
 * ParserComponent.java
 *
 * Created on 12 agosto 2006, 12.55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser.Omondo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Label;
import di.univaq.MOSQUITO.DataStructures.Component.Child;
import di.univaq.MOSQUITO.DataStructures.Component.Component;
import di.univaq.MOSQUITO.DataStructures.Component.Interface;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;


/**
 *
 * @author Fabio Calvarese
 */
public class ParserComponent extends Parser {
    
    /** Creates a new instance of ParserComponent */
    public ParserComponent(Document doc, LogManager log) {
        super("errore durante il parsing del component diagram", "editmodel:ComponentDiagramEditModel",log);
        loadXMLFile(doc);
        createGraph();
     //   System.out.println();
     //   System.out.println("Stampa degli elementi del component diagram");
     //   System.out.println();
     //   printGraph();
    }
    
    
    public void printGraph() {
        for(int i = 0; i < elements.size(); i++){
            if(elements.get(i) instanceof Component){
                Component comp = (Component) elements.get(i);
                print(comp);
            }
        }
    }

    // Visita in ampiezza dell'albero
    public void print(Component comp) {
    	if (!comp.visited) {
    		comp.visited = true;
        System.out.println("componente " + comp.getName());
        System.out.println(comp.getComponentLabel());
        for(int i = 0; i < comp.getChildren().size(); i++){
            Child c = (Child) comp.getChildren().get(i);
            
            // print(c.getComponent());
             System.out.println("interfaccia " + c.getInterf().getName());
             System.out.println("label " + c.getLabel());
              //System.out.println("figlio " );
        }
        
        for(int i = 0; i < comp.getChildren().size(); i++){
            Child c = (Child) comp.getChildren().get(i); 
            print(c.getComponent());
           }
    	}
    }
    
      protected void loadDiagramElements(Element tempEl) {
        if(tempEl.getNodeName().equals("children")) {
            Elem genericElement = null;
            String type = tempEl.getAttribute("xsi:type");
            String targetConnection = tempEl.getAttribute("targetConnections");
            // divido le varie etichette di connessione
            String[] targets = targetConnection.split("//");

            if (type.equals("editmodel:NotepadEditModel")) {
                String note = tempEl.getAttribute("note");
                genericElement = new Label(note, targets);
            }

            if (type.equals("editmodel:ComponentEditModel")) {
                String note = tempEl.getAttribute("itemName");
                genericElement = new Component(note, targets);
            }

            if(type.equals("editmodel:ComponentInterfaceEditModel")) {
                String name = tempEl.getAttribute("interfaceName");
                genericElement = new Interface(name, targets);
            }

            loadSourceConnections(tempEl, genericElement);
            elements.add(genericElement);
        }
    }

    public void createGraph() {
        for(int i = 0; i < elements.size(); i++) {
            if(elements.get(i) instanceof Component) {
                Component component = (Component)elements.get(i);
                component.loadNeighbours(elements);
            }
        }
    }
}
