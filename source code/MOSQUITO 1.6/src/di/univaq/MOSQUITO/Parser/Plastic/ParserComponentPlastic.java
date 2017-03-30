/*
 * ParserComponent.java
 *
 * Created on 12 agosto 2006, 12.55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package di.univaq.MOSQUITO.Parser.Plastic;

import it.univaq.di.plastic.uml.modelreader.model.componentview.ComponentInfo;
import it.univaq.di.plastic.uml.modelreader.model.componentview.InterfaceInfo;
import it.univaq.di.plastic.uml.modelreader.utils.MOSQUITOUtils;

import java.util.Vector;

import di.univaq.MOSQUITO.DataStructures.Component.Child;
import di.univaq.MOSQUITO.DataStructures.Component.Component;
import di.univaq.MOSQUITO.DataStructures.Component.Interface;
import di.univaq.MOSQUITO.Parser.Parser;
import di.univaq.MOSQUITO.utility.LogManager;



/**
 *
 * @author Fabio Calvarese
 */
public class ParserComponentPlastic extends Parser {
	    
    /** Creates a new instance of ParserComponent */
    public ParserComponentPlastic(LogManager log, MOSQUITOUtils mUtils) {
    	 super(log, mUtils);
    	 Vector componentsInfo = mUtils.getAllComponentsInfo(eUtils);
   	     loadDiagramElements(componentsInfo);
   	     // SE IL PRINT è ATTIVO POI NON FUNZIONA PIU' LA TRASFORMAZIONE XKE' IL FLAG "visited" VIENE IMPOSTATO A TRUe
   	     // A FINE STAMPA BISOGNEREBBE REIMPOSTARLO A FALSE
         //    printGraph();
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
      
     public String loadStereotype(ComponentInfo compInfo){
    	 
    	 if(compInfo.getStereotypeName().equals(""))
    		 return "";
    	 return compInfo.getStereotypeName()+"\n{PAschdPolicy='"+compInfo.getProperties().get("PAschdPolicy")+"'}";
    	 
     }
     
     public static String getStereotypeServiceTyme(InterfaceInfo intInfo) {
   	  if(intInfo.getStereotypeName().equals(""))
   		  return "";
   	  if(!intInfo.getProperties().get("PAdemand").equals("[]")) {
   		  String app = intInfo.getProperties().get("PAdemand").toString().replace("[","");
   		  app = app.replace("]","");
   		  return intInfo.getStereotypeName() +"\n{PAdemand="+app+"}";
   	  }
   	  
   	  if(!intInfo.getProperties().get("PAdelay").equals("[]")){
   		  String app = intInfo.getProperties().get("PAdelay").toString().replace("[","");
   		
   		  app = app.replace("]","");
   		  return intInfo.getStereotypeName() +"\n{PAdelay="+app+"}";
   	  }
		 
   	  return "";
    }
    
      
      
     public void createElemList(Vector componentsInfo) {
    	 
    	  for(int i= 0; i < componentsInfo.size(); i++) {
    		  ComponentInfo compInfo = (ComponentInfo)componentsInfo.get(i);
    		  String componentName = compInfo.getName();
    		  Component genericElement = new Component(componentName);
    		  elements.add(genericElement);
    	  }
     
     }
     
      
      public Component getComponentByName(String componentName) {
    	  for(int i = 0; i< elements.size(); i++ ) {
    		
    	      Component comp = (Component) elements.get(i);
    		  if(comp.isTheRightComponent(componentName))
    			  return comp;
    	  
    	  }
           return null;
      }
     
     
      protected void loadDiagramElements(Vector componentsInfo) {
    	  createElemList(componentsInfo);
    	  for(int i= 0; i < componentsInfo.size(); i++) {
      		  ComponentInfo compInfo = (ComponentInfo)componentsInfo.get(i);
    		  String componentName = compInfo.getName();
    		  Component comp = getComponentByName(componentName);
    		  comp.setComponentLabel(loadStereotype(compInfo));
    		  Vector interfaceInfo = compInfo.getProvidedInterfacesInfo();
    		  for(int j=0; j < interfaceInfo.size(); j++ ){
    			  
    			  InterfaceInfo intInfo =(InterfaceInfo)interfaceInfo.get(j); 
    			  comp.setInterfaces(new Interface(intInfo.getName()));
    			  comp.setLabels(getStereotypeServiceTyme(intInfo));
    		  }
     		  Vector interfInformations = compInfo.getRequiredInterfacesInfo();
     		  Vector owners = new Vector();
    		  for(int y = 0; y < interfInformations.size(); y++){
    			  InterfaceInfo intInfo = (InterfaceInfo)interfInformations.get(y); 			  
    			  String compOwnerName = intInfo.getOwnerComponent().getName();
    			  Component tmp = getComponentByName(compOwnerName);
    			  String stereotype = getStereotypeServiceTyme(intInfo);
    			  Child c = new Child(new Interface(intInfo.getName()),tmp,stereotype);
    			  owners.add(c);
    		  }
    		  comp.setChildren(owners);
    	  }
        }
      
   
}

