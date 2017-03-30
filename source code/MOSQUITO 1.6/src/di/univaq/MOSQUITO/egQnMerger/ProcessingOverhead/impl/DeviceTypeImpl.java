/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl;


import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DeviceFeatureType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DeviceType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.SchedulingPolicyType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getDeviceFeature <em>Device Feature</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl#getServiceUnits <em>Service Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceTypeImpl extends EObjectImpl implements DeviceType {
	/**
	 * The default value of the '{@link #getDeviceFeature() <em>Device Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFeature()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceFeatureType DEVICE_FEATURE_EDEFAULT = DeviceFeatureType.FCFS_LITERAL;

	/**
	 * The cached value of the '{@link #getDeviceFeature() <em>Device Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFeature()
	 * @generated
	 * @ordered
	 */
	protected DeviceFeatureType deviceFeature = DEVICE_FEATURE_EDEFAULT;

	/**
	 * This is true if the Device Feature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceFeatureESet = false;

	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingPolicyType SCHEDULING_POLICY_EDEFAULT = SchedulingPolicyType.FCFS_LITERAL;

	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicyType schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;

	/**
	 * This is true if the Scheduling Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingPolicyESet = false;

	/**
	 * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final float SERVICE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected float serviceTime = SERVICE_TIME_EDEFAULT;

	/**
	 * This is true if the Service Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceTimeESet = false;

	/**
	 * The default value of the '{@link #getServiceUnits() <em>Service Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceUnits() <em>Service Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnits()
	 * @generated
	 * @ordered
	 */
	protected String serviceUnits = SERVICE_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFeatureType getDeviceFeature() {
		return deviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceFeature(DeviceFeatureType newDeviceFeature) {
		DeviceFeatureType oldDeviceFeature = deviceFeature;
		deviceFeature = newDeviceFeature == null ? DEVICE_FEATURE_EDEFAULT : newDeviceFeature;
		boolean oldDeviceFeatureESet = deviceFeatureESet;
		deviceFeatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE, oldDeviceFeature, deviceFeature, !oldDeviceFeatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeviceFeature() {
		DeviceFeatureType oldDeviceFeature = deviceFeature;
		boolean oldDeviceFeatureESet = deviceFeatureESet;
		deviceFeature = DEVICE_FEATURE_EDEFAULT;
		deviceFeatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE, oldDeviceFeature, DEVICE_FEATURE_EDEFAULT, oldDeviceFeatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeviceFeature() {
		return deviceFeatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		BigInteger oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyType getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(SchedulingPolicyType newSchedulingPolicy) {
		SchedulingPolicyType oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy == null ? SCHEDULING_POLICY_EDEFAULT : newSchedulingPolicy;
		boolean oldSchedulingPolicyESet = schedulingPolicyESet;
		schedulingPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY, oldSchedulingPolicy, schedulingPolicy, !oldSchedulingPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchedulingPolicy() {
		SchedulingPolicyType oldSchedulingPolicy = schedulingPolicy;
		boolean oldSchedulingPolicyESet = schedulingPolicyESet;
		schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;
		schedulingPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY, oldSchedulingPolicy, SCHEDULING_POLICY_EDEFAULT, oldSchedulingPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchedulingPolicy() {
		return schedulingPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTime(float newServiceTime) {
		float oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		boolean oldServiceTimeESet = serviceTimeESet;
		serviceTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__SERVICE_TIME, oldServiceTime, serviceTime, !oldServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceTime() {
		float oldServiceTime = serviceTime;
		boolean oldServiceTimeESet = serviceTimeESet;
		serviceTime = SERVICE_TIME_EDEFAULT;
		serviceTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.DEVICE_TYPE__SERVICE_TIME, oldServiceTime, SERVICE_TIME_EDEFAULT, oldServiceTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceTime() {
		return serviceTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceUnits() {
		return serviceUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUnits(String newServiceUnits) {
		String oldServiceUnits = serviceUnits;
		serviceUnits = newServiceUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.DEVICE_TYPE__SERVICE_UNITS, oldServiceUnits, serviceUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE:
				return getDeviceFeature();
			case DevicesPackage.DEVICE_TYPE__DEVICE_NAME:
				return getDeviceName();
			case DevicesPackage.DEVICE_TYPE__QUANTITY:
				return getQuantity();
			case DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY:
				return getSchedulingPolicy();
			case DevicesPackage.DEVICE_TYPE__SERVICE_TIME:
				return new Float(getServiceTime());
			case DevicesPackage.DEVICE_TYPE__SERVICE_UNITS:
				return getServiceUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE:
				setDeviceFeature((DeviceFeatureType)newValue);
				return;
			case DevicesPackage.DEVICE_TYPE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case DevicesPackage.DEVICE_TYPE__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY:
				setSchedulingPolicy((SchedulingPolicyType)newValue);
				return;
			case DevicesPackage.DEVICE_TYPE__SERVICE_TIME:
				setServiceTime(((Float)newValue).floatValue());
				return;
			case DevicesPackage.DEVICE_TYPE__SERVICE_UNITS:
				setServiceUnits((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE:
				unsetDeviceFeature();
				return;
			case DevicesPackage.DEVICE_TYPE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case DevicesPackage.DEVICE_TYPE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY:
				unsetSchedulingPolicy();
				return;
			case DevicesPackage.DEVICE_TYPE__SERVICE_TIME:
				unsetServiceTime();
				return;
			case DevicesPackage.DEVICE_TYPE__SERVICE_UNITS:
				setServiceUnits(SERVICE_UNITS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevicesPackage.DEVICE_TYPE__DEVICE_FEATURE:
				return isSetDeviceFeature();
			case DevicesPackage.DEVICE_TYPE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case DevicesPackage.DEVICE_TYPE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case DevicesPackage.DEVICE_TYPE__SCHEDULING_POLICY:
				return isSetSchedulingPolicy();
			case DevicesPackage.DEVICE_TYPE__SERVICE_TIME:
				return isSetServiceTime();
			case DevicesPackage.DEVICE_TYPE__SERVICE_UNITS:
				return SERVICE_UNITS_EDEFAULT == null ? serviceUnits != null : !SERVICE_UNITS_EDEFAULT.equals(serviceUnits);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deviceFeature: ");
		if (deviceFeatureESet) result.append(deviceFeature); else result.append("<unset>");
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", schedulingPolicy: ");
		if (schedulingPolicyESet) result.append(schedulingPolicy); else result.append("<unset>");
		result.append(", serviceTime: ");
		if (serviceTimeESet) result.append(serviceTime); else result.append("<unset>");
		result.append(", serviceUnits: ");
		result.append(serviceUnits);
		result.append(')');
		return result.toString();
	}

} //DeviceTypeImpl