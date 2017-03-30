/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType3;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Requirement Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl#getUnitsOfService <em>Units Of Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRequirementType3Impl extends EObjectImpl implements ResourceRequirementType3 {
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
	 * The default value of the '{@link #getUnitsOfService() <em>Units Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfService()
	 * @generated
	 * @ordered
	 */
	protected static final float UNITS_OF_SERVICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnitsOfService() <em>Units Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfService()
	 * @generated
	 * @ordered
	 */
	protected float unitsOfService = UNITS_OF_SERVICE_EDEFAULT;

	/**
	 * This is true if the Units Of Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsOfServiceESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirementType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.RESOURCE_REQUIREMENT_TYPE3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnitsOfService() {
		return unitsOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitsOfService(float newUnitsOfService) {
		float oldUnitsOfService = unitsOfService;
		unitsOfService = newUnitsOfService;
		boolean oldUnitsOfServiceESet = unitsOfServiceESet;
		unitsOfServiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE, oldUnitsOfService, unitsOfService, !oldUnitsOfServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnitsOfService() {
		float oldUnitsOfService = unitsOfService;
		boolean oldUnitsOfServiceESet = unitsOfServiceESet;
		unitsOfService = UNITS_OF_SERVICE_EDEFAULT;
		unitsOfServiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE, oldUnitsOfService, UNITS_OF_SERVICE_EDEFAULT, oldUnitsOfServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnitsOfService() {
		return unitsOfServiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME:
				return getResourceName();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE:
				return new Float(getUnitsOfService());
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
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE:
				setUnitsOfService(((Float)newValue).floatValue());
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
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE:
				unsetUnitsOfService();
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
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE:
				return isSetUnitsOfService();
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
		result.append(" (resourceName: ");
		result.append(resourceName);
		result.append(", unitsOfService: ");
		if (unitsOfServiceESet) result.append(unitsOfService); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResourceRequirementType3Impl