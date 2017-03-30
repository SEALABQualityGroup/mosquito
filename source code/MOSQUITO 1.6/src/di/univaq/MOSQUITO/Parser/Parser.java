/*
 * Parser.java
 *
 * Created on 4 agosto 2006, 14.21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser;

import it.univaq.di.plastic.uml.modelreader.utils.EclipseUML2Util;
import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.Vector;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import di.univaq.MOSQUITO.DataStructures.Association;
import di.univaq.MOSQUITO.DataStructures.Elem;
import di.univaq.MOSQUITO.DataStructures.Sequence.Instance;
import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

/**
 * @author  Fabio Calvarese
 */
public class Parser {

    protected Vector elements;
    private String errors;
    private String rootElem;
    protected String labelRef = "";
    protected String pathRef = "";
    protected Object referTo;
    protected EclipseUML2UtilV2 utils;
    protected LogManager log;
    protected MOSQUITOUtils mUtils;
    protected EclipseUML2Util eUtils;

    private Parser(){
    }
    
    /** Creates a new instance of Parser */
    public Parser(String errors, String rootElem, LogManager log) {
        this.elements = new Vector();
        this.errors = errors;
        this.rootElem = rootElem;
        referTo = null;
        this.log = log;
    }

    // invocato dai parser di Plastic
    public Parser(LogManager log, MOSQUITOUtils mUtils) {
        this.elements = new Vector();
        this.mUtils = mUtils;
        this.eUtils = new EclipseUML2Util();
        referTo = null;
        this.log = log;
    }

    public Parser(EclipseUML2UtilV2 utils, LogManager log) {
        this.elements = new Vector();
        referTo = null;
        this.utils = utils;
        this.log = log;
    }
    
  /*  public Parser(ModelReader reader) {
        this.elements = new Vector();
        MOSQUITOUtils.setReader(reader);
        //loadUML2Export(fileToParse);
        referTo = null;
    }*/
    
    // invocato dai parser di Plastic
    public Parser(String fileName, LogManager log, MOSQUITOUtils mUtils) {
        this.elements = new Vector();
        this.mUtils = mUtils;
        this.eUtils = new EclipseUML2Util();
       // MOSQUITOUtils.setReader(reader);
        loadUML2Export(fileName);
        referTo = null;
        this.log = log;
    }

    public Object getReferToUML2() {
    	return referTo;
    }

    /**
	 * @return  Returns the elements.
	 * @uml.property  name="elements"
	 */
    public Vector getElements() {
    	return this.elements;
    }

    /**
	 * @return  Returns the pathRef.
	 * @uml.property  name="pathRef"
	 */
    public String getPathRef() {
    	return this.pathRef;
    }
    
    public EclipseUML2UtilV2 getUtils() {
    	return this.utils;
    }
    
    public LogManager getLog() {
    	return this.log;
    }
    
    public void loadXMLFile(Document doc) {
        try {
            Element root = doc.getDocumentElement();
            if (root.getNodeName().equals(rootElem)) {
                NodeList n = root.getChildNodes();
                for(int i = 0; i < n.getLength(); i++){
                    Node nodo = n.item(i);
                   
                   /*  in questa sezione di codice vado a ricercare gli elementi
                       fondamentali del diagramma che si trovano allo stesso
                       livello dell'albero xml */
                    if (nodo instanceof Element){
                        Element tempEl =(Element)nodo;
                        loadDiagramElements(tempEl);
                    }
                }
            } else {
                System.out.println("Formato del file non valido");
                log.addError(PropertiesManager.getProperties("e11"));
            }
        } catch (Exception e) {
        	
        
            System.out.println("Errore nel caricamento dei dati");
            System.out.println(errors);
            System.out.println("Per ultriori informazioni consutare la guida o contatare fabi82@jumpy.it");
            log.addError(PropertiesManager.getProperties("e12"));
            log.addError(errors);
            log.addError(PropertiesManager.getProperties("e13"));
        }
    }

    protected void loadDiagramElements(Element el){}

     public void  loadSourceConnections(Element el, Elem genericElement) {
        NodeList sourceNodeList = el.getElementsByTagName("sourceConnections");
        for(int i = 0; i < sourceNodeList.getLength(); i++) {
            Element sourceElem = (Element) sourceNodeList.item(i);
            String targetConnection = sourceElem.getAttribute("targetConnections");
            String sourceEnd = sourceElem.getAttribute("sourceEnd");
            String type = sourceElem.getAttribute("xsi:type");
            Association sourceConnection = new Association(targetConnection, sourceEnd);
            sourceConnection.setType(type);
            genericElement.addAssociation(sourceConnection);
        }
    }
     
     public Vector getTree(){
    	 return null;
     }
     
     // carica il modello e inizializza il lettore per l'export UMLV1 profilato con Plastic.
     public void loadUML2Export(String url) {
  		String modelPath = url;
 		String umlPluginPath = "lib/org.eclipse.uml2_1.1.1.jar";
 		String umlResourcePath = "lib/org.eclipse.uml2.resources_1.1.0.jar";
   	  	mUtils.loadModel(modelPath,umlPluginPath,umlResourcePath, eUtils);
   	  	// Vector componentsInfo = SAPOneUtils.getAllComponentsInfo();
   	    // loadDiagramElements(componentsInfo);
     }
     
     /**
      *  This method is able to create the Instance if it doesn't exist
      *  or get it from elments Vector otherwise.
      *  
      * @param instanceName The Name of the instance to get.
      */
     public Instance getInstance(String instanceName) {
     	int index = existInstance(instanceName);
     	if(index!= -1){
     		return (Instance)elements.get(index);
     	}
     	else {
     		Instance ins = new Instance(instanceName);
     		elements.add(ins);
     		return ins;
     	}
     }
     
     /**
      * This method find the instance name  
      * 
      * 
      */
     public int existInstance(String name) {
         for(int i = 0; i < this.elements.size(); i++) {
     		if(elements.get(i) instanceof Instance) {
     			Instance ins = (Instance)elements.get(i);
     			if(ins.getName().equals(name))
     				return i;
     		}
     	}
         return -1;
     }

}
