package di.univaq.MOSQUITO.utility;


public class LogManager {
		
   private String log="";
	
	public void addError(String error) {
		log +="\r\nERROR: " + error;
	}
	
	public void addLine(String message) {
		log +="\r\n"+ message;
	}
	
	public void addErrorStack(String error) {
		log +="\r\n - Error " + error;
	}
	
	public void addInfo(String info) {
		log +="\r\nWARNING: " + info;
	}
	
	public String getError() {
		return log.replaceFirst("\r\n", "");
	}
	
}
