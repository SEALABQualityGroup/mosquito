/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.SoftwareResourceType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.SoftwareResourcesType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl#getSoftwareResource <em>Software Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareResourcesTypeImpl extends EObjectImpl implements SoftwareResourcesType {
	/**
	 * The cached value of the '{@link #getSoftwareResource() <em>Software Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareResource()
	 * @generated
	 * @ordered
	 */
	protected EList softwareResource = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.SOFTWARE_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSoftwareResource() {
		if (softwareResource == null) {
			softwareResource = new EObjectContainmentEList(SoftwareResourceType.class, this, DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE);
		}
		return softwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE:
				return ((InternalEList)getSoftwareResource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE:
				return getSoftwareResource();
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
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE:
				getSoftwareResource().clear();
				getSoftwareResource().addAll((Collection)newValue);
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
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE:
				getSoftwareResource().clear();
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
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE:
				return softwareResource != null && !softwareResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareResourcesTypeImpl