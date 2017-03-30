package di.univaq.MOSQUITO.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

	private static Properties defaultProps;
	
	public PropertiesManager() {
	
		//String configurationFile = "C:/Programmi/apache-tomcat-6.0.13/webapps/MOSQUITO_CONF/errors.conf";
		String configurationFile = "C:/Program Files/Apache Software Foundation/Tomcat 6.0/webapps/MOSQUITO_CONF/errors.conf";
		defaultProps = new Properties();
		FileInputStream in;
		try {
			in = new FileInputStream(configurationFile);
			defaultProps.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperties(String propName){
		if (defaultProps == null) {
			new PropertiesManager();
		}	
		return defaultProps.getProperty(propName);
		
	}
}
