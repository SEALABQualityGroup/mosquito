/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.OMElementType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl#getAmountOfService <em>Amount Of Service</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMElementTypeImpl extends EObjectImpl implements OMElementType {
	/**
	 * The default value of the '{@link #getAmountOfService() <em>Amount Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfService()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_OF_SERVICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountOfService() <em>Amount Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfService()
	 * @generated
	 * @ordered
	 */
	protected float amountOfService = AMOUNT_OF_SERVICE_EDEFAULT;

	/**
	 * This is true if the Amount Of Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountOfServiceESet = false;

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
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.OM_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountOfService() {
		return amountOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfService(float newAmountOfService) {
		float oldAmountOfService = amountOfService;
		amountOfService = newAmountOfService;
		boolean oldAmountOfServiceESet = amountOfServiceESet;
		amountOfServiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE, oldAmountOfService, amountOfService, !oldAmountOfServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmountOfService() {
		float oldAmountOfService = amountOfService;
		boolean oldAmountOfServiceESet = amountOfServiceESet;
		amountOfService = AMOUNT_OF_SERVICE_EDEFAULT;
		amountOfServiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE, oldAmountOfService, AMOUNT_OF_SERVICE_EDEFAULT, oldAmountOfServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmountOfService() {
		return amountOfServiceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.OM_ELEMENT_TYPE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.OM_ELEMENT_TYPE__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE:
				return new Float(getAmountOfService());
			case DevicesPackage.OM_ELEMENT_TYPE__DEVICE_NAME:
				return getDeviceName();
			case DevicesPackage.OM_ELEMENT_TYPE__RESOURCE_NAME:
				return getResourceName();
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
			case DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE:
				setAmountOfService(((Float)newValue).floatValue());
				return;
			case DevicesPackage.OM_ELEMENT_TYPE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case DevicesPackage.OM_ELEMENT_TYPE__RESOURCE_NAME:
				setResourceName((String)newValue);
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
			case DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE:
				unsetAmountOfService();
				return;
			case DevicesPackage.OM_ELEMENT_TYPE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case DevicesPackage.OM_ELEMENT_TYPE__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
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
			case DevicesPackage.OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE:
				return isSetAmountOfService();
			case DevicesPackage.OM_ELEMENT_TYPE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case DevicesPackage.OM_ELEMENT_TYPE__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
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
		result.append(" (amountOfService: ");
		if (amountOfServiceESet) result.append(amountOfService); else result.append("<unset>");
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(')');
		return result.toString();
	}

} //OMElementTypeImpl