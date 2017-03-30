package di.univaq.MOSQUITO.utility;

import java.io.Serializable;

public class BeanDevices implements Serializable {

	
	private String name;
	private String quantity;
	private String schedulingPolicy;
	private String deviceFeatures;
	private String serviceTime;
	private String errors;
	private String timeUnits;
	

	public String getTimeUnits() {
		return timeUnits;
	}

	public void setTimeUnits(String timeUnits) {
		this.timeUnits = timeUnits;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSchedulingPolicy() {
		return schedulingPolicy;
	}

	public void setSchedulingPolicy(String schedulingPolicy) {
		this.schedulingPolicy = schedulingPolicy;
	}

	public String getDeviceFeatures() {
		return deviceFeatures;
	}

	public void setDeviceFeatures(String deviceFeatures) {
		this.deviceFeatures = deviceFeatures;
	}

	public String getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
}
