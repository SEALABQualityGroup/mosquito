package di.univaq.MOSQUITO.Parser;



import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;


/**
*
* @author Luca & Fabio
*/
public class EclipseUML2UtilV2 {
   
   public boolean DEBUG = true;
   public ResourceSet RESOURCE_SET = new ResourceSetImpl();
   public PrintWriter out = new PrintWriter(System.out);
   public HashMap<String, Profile> profiles;
   public LogManager log;
  
   public EclipseUML2UtilV2(LogManager log) {
	   this.log = log;
   }
   
// carica il modello e inizializza il lettore per l'export UML2_V2
	public Model loadModel(String inputModel) {
		init();
		URI modelUri = URI.createURI("file:/" + inputModel);
		System.out.println(modelUri.toString()); 
		Model mdl = (Model) load(modelUri);
		profiles = get_Profile(mdl.getAllAppliedProfiles());
		return mdl;

	}

 
/**************PROFILI*********************/
   
   
   /*
    * Restituisce il valore del tag dello stereotiopo appartenente al profilo specificato
    * 
    * @params elelemt Il nome dell'elemento del modello a cui bisogan essere reperito il valore
    * @params Profile Il profilo su cui ricercare lo stereotipo
    * @params StereotypeName Il nome dello stereotipo da ricercare
    * @params propertyValeue Il nome dalla proprietà da ricercare nello stereotipo
    */
   public  String getPropertyValue(NamedElement element, String profName, String StereotypeName, String propertyValue) {
	   
       String returnValue = "";
       Profile prof = profiles.get(profName);
       Stereotype requiredStereotype = prof.getOwnedStereotype(StereotypeName, true, false);
       if(requiredStereotype == null) {
    	   System.out.println("Stereotipo non trovato: " + StereotypeName);
    	   log.addInfo(PropertiesManager.getProperties("e1"));
    	   return"";
       }
       if(element.isStereotypeApplied(requiredStereotype)) {
    	   
    	   try {
    	      returnValue = element.getValue(requiredStereotype, propertyValue).toString();
    	   }
    	   catch(IllegalArgumentException e){
    		   System.out.println("La proprietà " + propertyValue + " non è una proprietà valida");
    		   log.addInfo(PropertiesManager.getProperties("e2") +" "+ propertyValue +" "+ PropertiesManager.getProperties("e3"));
    	   }
    	   catch(Exception e){
    		   System.out.println("Lo stereotipo "+ StereotypeName +" non è correttamente applicato all'elemento " + element.getName());
    		   log.addInfo(PropertiesManager.getProperties("e4") +" "+ StereotypeName +" "+ PropertiesManager.getProperties("e5")+ " " +element.getName());
    	   }
       }else{
    	   System.out.println("All'elemento " + element.getName() + " non è applicato lo stereotipo richiesto" ); 
    	   log.addInfo(PropertiesManager.getProperties("e6") +" "+ element.getName() +" "+ PropertiesManager.getProperties("e7"));
       }
	   return returnValue;
	   
   }
   
   public boolean isPahostSter(NamedElement element, String stereotypeName) {
	   Profile prof = profiles.get("PAprofile");
       Stereotype requiredStereotype = prof.getOwnedStereotype(stereotypeName, true, false);
       if(requiredStereotype == null) {
    	   System.out.println("Stereotipo non trovato: " + stereotypeName);
    	   log.addInfo(PropertiesManager.getProperties("e1"));
    	   return false;
       }
       if(element.isStereotypeApplied(requiredStereotype)) {
    	   return true;
       }
       return false;
   }
   
   
   public  String getPropertyValueNoError(NamedElement element, String profName, String StereotypeName, String propertyValue) {
	   
       String returnValue = "";
       Profile prof = profiles.get(profName);
       Stereotype requiredStereotype = prof.getOwnedStereotype(StereotypeName, true, false);
       if(requiredStereotype == null) {
    	   System.out.println("Stereotipo non trovato: " + StereotypeName);
    	   log.addInfo(PropertiesManager.getProperties("e1"));
    	   return"";
       }
       if(element.isStereotypeApplied(requiredStereotype)) {
    	   
    	   try {
    	      returnValue = element.getValue(requiredStereotype, propertyValue).toString();
    	   }
    	   catch(IllegalArgumentException e){
    		  
    	   }
    	   catch(Exception e){
    		  
    	   }
       }
	   return returnValue;
	   
   }
   

   public  HashMap<String, Profile> get_Profile(List allProfile) {
	HashMap profiles = new HashMap<String, Profile>();
	   for(int i = 0; i < allProfile.size(); i++){
			Profile prof =  (Profile)allProfile.get(i);
			profiles.put(prof.getName(), prof);
       }
	   return profiles;
   }

   public  Object getStereotypePropertyValue(NamedElement namedElement, Stereotype stereotype, Property property) {
   	   Object value = namedElement.getValue(stereotype, property.getName());
   	   System.out.println("Value of stereotype property '" + property.getQualifiedName()+ "' on element '" + namedElement.getQualifiedName() + "' is "+ String.valueOf(value) + ".");
       log.addInfo(PropertiesManager.getProperties("e8") +" "+ property.getQualifiedName() +" "+ PropertiesManager.getProperties("e9")+ " is " + String.valueOf(value));
   	return value;
   }

//   
//   /*********************************/
//   /**
//    * Set the URI for loading UML2 resources such as
//    * UML metamodel, UML basic profile, UML primitive types
//    * <br>
//    * Example of URI is
//    * "jar:file:/D:/eclipse3.1.1/plugins/org.eclipse.uml2.uml.resources_1.1.0.jar!/"
//    * where this jar comes from UML2 plugin
//    *
//    */
   public  void init(URI URI) {
       registerResourceFactories();
       registerPathmaps(URI);
   }
   
   public  void init() {
	   registerResourceFactories();
       registerPathmaps();
   }
   
   public  void registerResourceFactories() {
       Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
               UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
   }
   
//   /**
//    * Mapping logical URIs to the UML resource files (in the jar file)
//    * For example,
//    * pathmap://UML2_METAMODELS/
//    *    -> jar:file:/D:/eclipse3.1.1/plugins/org.eclipse.uml2.uml.resources_1.1.0.jar!/metamodels/
//    *
//    * Copied from the "Introduction to UML2 Profile" article
//    */
   void registerPathmaps(URI URI) {
       
       URIConverter uc = new URIConverterImpl();
       uc.URI_MAP.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),
               URI.appendSegment("libraries").appendSegment(""));
      
       uc.URI_MAP.put(
               URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.appendSegment(
               "metamodels").appendSegment(""));
       
       uc.URI_MAP.put(URI.createURI(UMLResource.PROFILES_PATHMAP),
               URI.appendSegment("profiles").appendSegment(""));
       
       RESOURCE_SET.setURIConverter(uc);
       RESOURCE_SET.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
       Map extensionToFactoryMap = RESOURCE_SET.getResourceFactoryRegistry().getExtensionToFactoryMap();
       extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
       extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
       extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
       
   }
  
   void registerPathmaps() {
      
      RESOURCE_SET.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
      Map extensionToFactoryMap = RESOURCE_SET.getResourceFactoryRegistry().getExtensionToFactoryMap();
      extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
      extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
      extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
      
  }


   public  org.eclipse.uml2.uml.Package load(URI uri) {
       org.eclipse.uml2.uml.Package package_ = null;
       
       try {
           Resource resource = RESOURCE_SET.getResource(uri, true);
           
           package_ = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(
                   resource.getContents(), UMLPackage.eINSTANCE.getPackage());
       } catch (WrappedException we) {
           System.out.println(we.getMessage());
       }
       return package_;
   }

	public  PrintWriter getOut() {
		return out;
	}
	
	public void setOut(PrintWriter out) {
		out = out;
	}
	
	public boolean isDEBUG() {
		return DEBUG;
	}
	
	public void setDEBUG(boolean debug) {
		DEBUG = debug;
	}
	
	public String getStereotypeServiceTyme(String sterName, String tagPaDemand, String tagPadelay) {
	 	if(!tagPaDemand.equals("[]")) {
	   	    String app = tagPaDemand.replace("[","");
	   	    app = app.replace("]","");
	   		return sterName +"\n{PAdemand="+app+"}";
	   	}
	   	  
	   	if(!tagPadelay.equals("[]")){
	   	    String app = tagPadelay.replace("[","");
	   		app = app.replace("]","");
	   		return sterName +"\n{PAdelay="+app+"}";
	   	}
	   	
	   				 
	   	return "";
	}
	
	
    public String getAppliedStereotype(Message msg) {
    	Profile prof = profiles.get("PAprofile");
    	Stereotype _PAstep = prof.getOwnedStereotype("PAstep", true, false);
    	Stereotype _PAclosedLoad  = prof.getOwnedStereotype("PAclosedLoad", true, false);
		if(msg.isStereotypeApplied(_PAstep)) {
		
			String paStep ="<<PAstep>>\n";
			Object _PAdelay = getProperty (_PAstep,"PAdelay",msg);
		
			if(!_PAdelay.toString().equals("[]")) {
				paStep += "{PAdelay="+_PAdelay.toString()+ "}";
				return paStep;
			}
			Object _PAdemand = getProperty (_PAstep,"PAdemand",msg);
			if(!_PAdemand.toString().equals("[]")) {
				paStep += "{PAdemand="+_PAdemand.toString()+ "}";
				return paStep;
		}
		Object _PAprob = getProperty(_PAstep,"PAprob",msg);	
			if(!_PAprob.toString().equals("[]")) {
				paStep += "{PAprob="+_PAprob.toString()+ "}";
				return paStep;
			}
		}
		if(msg.isStereotypeApplied(_PAclosedLoad)) {
		    Object _PApopulation = getProperty(_PAclosedLoad,"PApopulation",msg);
		    Object _PAextDelay = getProperty(_PAclosedLoad,"PAextDelay",msg);
		    String paClosedLoad ="<<PAclosedLoad>>\n";
		    
		if(!_PApopulation.equals("[]") && !_PAextDelay.equals("[]") ){
			paClosedLoad +="{PApopulation=";
			return paClosedLoad + _PApopulation.toString() + ",PAextDelay="+ _PAextDelay.toString()+"}";
			}
		}
		
		return "";
	}
    
    
    public String getProperty(Stereotype requiredStereotype, String propertyValue, NamedElement element ) {
    	String returnValue =""; 
      try {
      	      returnValue = element.getValue(requiredStereotype, propertyValue).toString();
      	   }
      	   catch(IllegalArgumentException e){
      		   System.out.println("La proprietà " + propertyValue + " non è una proprietà valida");
      		 log.addInfo(PropertiesManager.getProperties("e2") +" "+ propertyValue +" "+ PropertiesManager.getProperties("e3"));
      	   }
      	   catch(Exception e) {
      		   System.out.println("Lo stereotipo " + requiredStereotype.getName() + " non è correttamente applicato all'elemento " + element );
      		 log.addInfo(PropertiesManager.getProperties("e4") +" "+ requiredStereotype.getName() +" "+ PropertiesManager.getProperties("e5")+ " " +element);
      	   }
          	   
    	return returnValue;
    }
}

