package di.univaq.MOSQUITO.Parser.UML2;

import org.eclipse.uml2.uml.Model;

import di.univaq.MOSQUITO.Parser.EclipseUML2UtilV2;
import di.univaq.MOSQUITO.trasformation.qnhwTrasformation.QNHWTrasformation;
import di.univaq.MOSQUITO.utility.LogManager;

/**
 * @author Fabio Calvarese
 *
 */
public class DeploymentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LogManager log = new LogManager();
		String fileName = "C:/workspace/MOSQUITO 1.5/Modelli/ECommerceSystem2/ECommerceSystem.uml";
		EclipseUML2UtilV2 eclipseUtil = new EclipseUML2UtilV2(log);
		Model model = eclipseUtil.loadModel(fileName);
		ParserDeployment parser =new ParserDeployment(model, eclipseUtil, log);
		System.out.println(new QNHWTrasformation().createQNHWResult(parser,log));
	}
}
