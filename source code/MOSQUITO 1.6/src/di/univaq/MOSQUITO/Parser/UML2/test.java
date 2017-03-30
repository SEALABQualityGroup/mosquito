package di.univaq.MOSQUITO.Parser.UML2;

import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import di.univaq.MOSQUITO.server.RmiServerImpl;

public class test {
	
	
	String path = "C:\\Documents and Settings\\Fabio Calvarese\\Desktop\\ECommerceSystem2\\";
	String f1 = "ECommerceSystem.uml";
	String f2 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.ADprofile.profile.uml"; 
	String f3 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.Analysis_Models.PAprofile.profile.uml";
	String f4 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.Analysis_Models.REprofile.profile.uml";
	String f5 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.Analysis_Models.RSAprofile.profile.uml";
	String f6 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.Analysis_Models.SAprofile.profile.uml";
	String f7 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.General_Resource_Modeling_Framework.RTresourceModeling.profile.uml";
	String f8 = "UML_Profile_for_Schedulabilty,_Performance_and_Time_Specification.profile.uml";
	String f9 = "UML_Standard_Profile.MagicDraw_Profile.DSL_Customization.profile.uml";
	String f10 = "UML_Standard_Profile.MagicDraw_Profile.profile.uml";
	String f11 = "UML_Standard_Profile.UML_Standard_Profile.profile.uml";
	String f12 = "UML_Standard_Profile.Validation_Profile.profile.uml";
	
	public static void main(String[] args) {
        new test().doTest();
	}
	
	public void doTest() {
	    Vector list = new Vector();
	    Vector list2 = new Vector();
		Vector documents = new Vector();
	    list.add(path+f1);
		list.add(path+f2);
		list.add(path+f2);
		list.add(path+f3);
		list.add(path+f4);
		list.add(path+f5);
		list.add(path+f6);
		list.add(path+f7);
		list.add(path+f8);
		list.add(path+f9);
		list.add(path+f10);
		list.add(path+f11);
		list.add(path+f12);
		
		
		list2.add(f1);
		list2.add(f2);
		list2.add(f2);
		list2.add(f3);
		list2.add(f4);
		list2.add(f5);
		list2.add(f6);
		list2.add(f7);
		list2.add(f8);
		list2.add(f9);
		list2.add(f10);
		list2.add(f11);
		list2.add(f12);
		

		for(int i = 0; i < list.size(); i++) {
	    	Document doc = null;
            DocumentBuilderFactory p = DocumentBuilderFactory.newInstance();
            p.setValidating(false);
            DocumentBuilder parser;
			try {
				parser = p.newDocumentBuilder();
			
            doc = parser.parse(list.get(i).toString());
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	//se ho selezionato un file con estenzione .uml2 prendo in considerazione solo quello.
            documents.add(doc);
	    	}
		
		RmiServerImpl server = new RmiServerImpl();
		//System.out.println(server.QN_GenerationUML2V2(documents, list2, "ECommerceSystem.uml"));
		
	//	System.out.println(server.EG_GenerationUML2V2(documents, list2, "ECommerceSystem.uml"));
        }
	

}
