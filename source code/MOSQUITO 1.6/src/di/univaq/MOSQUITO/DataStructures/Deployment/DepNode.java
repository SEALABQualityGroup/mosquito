package di.univaq.MOSQUITO.DataStructures.Deployment;

import java.util.Vector;

import di.univaq.MOSQUITO.utility.LogManager;
import di.univaq.MOSQUITO.utility.PropertiesManager;

public class DepNode {
	
	private String name;
	private String fullName;
	
	private Vector <String> artefacts;
	private Vector <DepNode> internalNodes;
	private Vector <DepNode> parentNode;
	private String stereotypeValue;
	
	private LogManager log;
	
	// se true la risora è una risorsa attiva altrimenti una risorsa passiva
	private boolean isPahost;
	private long quantity = 1;
	private String timeUnits;
	private float serviceTime = 0;
	private String PASchedulingPolicy;
	
	private final String NODETERMINAL = "TERMINAL"; 
	private final String CPU = "CPU";
	private final String DISK = "DISK";
	
	
	// i nodi collegati mediante relazione a this DeplyNode
	private Vector <DepNode> realtedNode;
	
	// i nomi delle relazioni appartenenti a this node
	private Vector <String> relationsName;
	
	public DepNode(LogManager log) {
		this.artefacts = new Vector<String>();
		this.internalNodes = new Vector <DepNode>();
		this.parentNode = new Vector <DepNode>();
		this.log = log;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addArtefact(String artefact) {
		this.artefacts.add(artefact);
	}
	
	public Vector<String> getartefacts() {
		return this.artefacts;
	}
	
	public void addInternalNode(DepNode node) {
		this.internalNodes.add(node);
	}
	
	/*
	 * Return the list of all the nodes internal at this node
	 */
	public Vector<DepNode> getInternalNodes() {
		return this.internalNodes;
	}

	public void setRelatedNode(DepNode relatedNode) {
		this.realtedNode.add(relatedNode);
		
	}
	public Vector<DepNode> getRealtedNode() {
		return realtedNode;
	}

	public void setRelationsName(String relationName) {
		this.relationsName.add(relationName);
	}
	public Vector<String> getRelationsName() {
		return relationsName;
	}

	/*
	 * Return the list of all nodes connected at this node.
	 */
	public Vector<DepNode> getParentNode() {
		return parentNode;
	}

	public void addParentNode(DepNode parentNode) {
		this.parentNode.add(parentNode);
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		quantity = quantity.replaceAll("\\[", ""); 
		quantity = quantity.replaceAll("\\]", ""); 
		if(!quantity.equals("") && !quantity.equals("0")) {
			try {
			   long value = Long.parseLong(quantity);
			   this.quantity = value;
			}
			catch(NumberFormatException e)  {
				System.out.println("Il valore " + quantity +" non è un valore valido per il tag PAmultiplicity");
				log.addInfo(PropertiesManager.getProperties("e25") +" "+ quantity +" "+ PropertiesManager.getProperties("e26"));
			}
		}
	}

	public float getServiceTime() {
		return serviceTime;
	}

	
	public void setServiceTimeAndTimeUnit(String sterValue){
		sterValue = sterValue.replaceAll("\\[", "");
		sterValue = sterValue.replaceAll("\\]", "");
		if(!sterValue.equals("")) {
			String[] elems = sterValue.split(",");
			String servTime = elems[elems.length-2];
			servTime = servTime.replaceAll("\\(","");
			setServiceTime(servTime);
			
			String timeUnit =  elems[elems.length-1];
			timeUnit = timeUnit.replaceAll("\\'", "");
			timeUnit = timeUnit.replaceAll("\\)", "");
			setTimeUnits(timeUnit);
		}
	}
	
	
	public void setServiceTime(String serviceTime) {
		
		serviceTime = serviceTime.replaceAll("\\[", "");
		serviceTime = serviceTime.replaceAll("\\]", "");
		if(!serviceTime.equals("")) {
			try {
			   float value = Float.parseFloat(serviceTime);
			   this.serviceTime = value;
			}
			catch(NumberFormatException e)  {
				System.out.println("Il valore " + serviceTime +" non è un valore valido. Inserire un numero decimale valido");
				log.addInfo(PropertiesManager.getProperties("e25") +" "+ serviceTime +" "+ PropertiesManager.getProperties("e27"));
			}
		}
	}

	public String getTimeUnits() {
		return timeUnits;
	}

	public void setTimeUnits(String timeUnits) {
		
		this.timeUnits = timeUnits;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getStereotypeValue() {
		return stereotypeValue;
	}

	public void setStereotypeValue(String stereotypeValue) {
		this.stereotypeValue = stereotypeValue;
	}

	public boolean isPahost() {
		return isPahost;
	}

	public void setPahost(boolean isPahost) {
		this.isPahost = isPahost;
	}

	public String getPASchedulingPolicy() {
		return PASchedulingPolicy;
	}

	public void setPASchedulingPolicy(String schedulingPolicy) {
		schedulingPolicy = schedulingPolicy.replaceAll("\\[", ""); 
		schedulingPolicy = schedulingPolicy.replaceAll("\\]", ""); 
		PASchedulingPolicy = schedulingPolicy;
	}
	
	public boolean existTerminal() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(NODETERMINAL)) {
				return true;
			}
		}
		return false;
	}
	
	public DepNode getTerminal() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(NODETERMINAL)) {
				return internalNode;
			}
		}
		return null;
	}
	
	public long getCpuNumber() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(CPU)) {
				return internalNode.getQuantity();
			}
		}
		return 0;
	}

	public long getDiskNumber() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(DISK)) {
				return internalNode.getQuantity();
			}
		}
		return 0;
	}
	
	public DepNode getCpu() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(CPU)) {
				return internalNode;
			}
		}
		System.out.println("CPU resource not found for the node " + this.getName());
		log.addError(PropertiesManager.getProperties("e28")+" " + this.getName());
		return null;
	}

	public DepNode getDisk() {
		for(DepNode internalNode: internalNodes) {
			if(internalNode.getName().toUpperCase().equals(DISK)) {
				return internalNode;
			}
		}
		return null;
	}
	
	public DepNode getExitPoint() {
	    
		int internalNodeNumber = this.getInternalNodes().size();
		if(internalNodeNumber == 1) {
			return this.getInternalNodes().get(0);
		}
		else {
			DepNode terminalNode = this.getTerminal();
			if (terminalNode != null) {
				return terminalNode;
			}
			else {
				return this.getCpu();
			}
		}
		
	}
	
	public boolean isTerminal() {
		return this.getName().toUpperCase().equals(this.NODETERMINAL);
	}

}
