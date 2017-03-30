import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;

import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.Parser.UML2.ParserComponentUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserSequenceUML2;
import di.univaq.MOSQUITO.Parser.UML2.ParserUseCaseUML2;
import di.univaq.MOSQUITO.utility.LogManager;

public class test {
		
	Vector list = new Vector();
	String location;
	Vector fileNames = new Vector();
	Vector extentions = new Vector();
	Vector documents = new Vector();

	public static void main(String[] args) {
		LogManager log = new LogManager();
		EclipseUML2UtilV2 utils = new EclipseUML2UtilV2(log);		
		Model model = utils.loadModel("C:/Documents and Settings/Fabio Calvarese/Desktop/ECommerceSystem2/ECommerceSystem.uml");
		//new test().testUML2Component(model,utils,log);
		new test().testUML2UseCase(model,utils,log);
		//new test().testUML2Sequence(model,utils,log);
	}

	public void testUML2Component(Model model, EclipseUML2UtilV2 utils,LogManager log) {
		new ParserComponentUML2(model,utils,log);
	}

	public void testUML2UseCase(Model model,EclipseUML2UtilV2 utils,LogManager log) {
		//Model model = EclipseUML2UtilV2.loadModel("C:/Documents and Settings/Fabio Calvarese/Desktop/ECommerceSystem2/ECommerceSystem.uml");
		ParserUseCaseUML2 parserUseCase = new ParserUseCaseUML2(model,utils,log);
		//parserUseCase.loadUseCaseDiagram(model);
		parserUseCase.stampaTree();
	}

	public void testUML2Sequence(Model model,EclipseUML2UtilV2 utils, LogManager log) {
		for (Iterator<EObject> i = model.eAllContents(); i.hasNext();) {
			EObject e = (EObject) i.next();
			if(e instanceof Interaction) {
				Interaction inter = (Interaction)e;
		        ParserSequenceUML2 parserSequence = new ParserSequenceUML2(inter,utils,log);
		        
			}
		}
	}
}
