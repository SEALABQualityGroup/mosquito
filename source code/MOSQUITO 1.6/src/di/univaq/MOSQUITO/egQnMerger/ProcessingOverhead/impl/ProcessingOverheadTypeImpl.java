/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.DevicesType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.OverheadMatrixType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.ProcessingOverheadType;
import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.SoftwareResourcesType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Overhead Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl#getSoftwareResources <em>Software Resources</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl#getOverheadMatrix <em>Overhead Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingOverheadTypeImpl extends EObjectImpl implements ProcessingOverheadType {
	/**
	 * The cached value of the '{@link #getSoftwareResources() <em>Software Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareResources()
	 * @generated
	 * @ordered
	 */
	protected SoftwareResourcesType softwareResources = null;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected DevicesType devices = null;

	/**
	 * The cached value of the '{@link #getOverheadMatrix() <em>Overhead Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadMatrix()
	 * @generated
	 * @ordered
	 */
	protected OverheadMatrixType overheadMatrix = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingOverheadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.PROCESSING_OVERHEAD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResourcesType getSoftwareResources() {
		return softwareResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareResources(SoftwareResourcesType newSoftwareResources, NotificationChain msgs) {
		SoftwareResourcesType oldSoftwareResources = softwareResources;
		softwareResources = newSoftwareResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES, oldSoftwareResources, newSoftwareResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareResources(SoftwareResourcesType newSoftwareResources) {
		if (newSoftwareResources != softwareResources) {
			NotificationChain msgs = null;
			if (softwareResources != null)
				msgs = ((InternalEObject)softwareResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES, null, msgs);
			if (newSoftwareResources != null)
				msgs = ((InternalEObject)newSoftwareResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES, null, msgs);
			msgs = basicSetSoftwareResources(newSoftwareResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES, newSoftwareResources, newSoftwareResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesType getDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevices(DevicesType newDevices, NotificationChain msgs) {
		DevicesType oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES, oldDevices, newDevices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(DevicesType newDevices) {
		if (newDevices != devices) {
			NotificationChain msgs = null;
			if (devices != null)
				msgs = ((InternalEObject)devices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES, null, msgs);
			if (newDevices != null)
				msgs = ((InternalEObject)newDevices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES, null, msgs);
			msgs = basicSetDevices(newDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES, newDevices, newDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadMatrixType getOverheadMatrix() {
		return overheadMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverheadMatrix(OverheadMatrixType newOverheadMatrix, NotificationChain msgs) {
		OverheadMatrixType oldOverheadMatrix = overheadMatrix;
		overheadMatrix = newOverheadMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX, oldOverheadMatrix, newOverheadMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverheadMatrix(OverheadMatrixType newOverheadMatrix) {
		if (newOverheadMatrix != overheadMatrix) {
			NotificationChain msgs = null;
			if (overheadMatrix != null)
				msgs = ((InternalEObject)overheadMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX, null, msgs);
			if (newOverheadMatrix != null)
				msgs = ((InternalEObject)newOverheadMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX, null, msgs);
			msgs = basicSetOverheadMatrix(newOverheadMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX, newOverheadMatrix, newOverheadMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES:
				return basicSetSoftwareResources(null, msgs);
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES:
				return basicSetDevices(null, msgs);
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX:
				return basicSetOverheadMatrix(null, msgs);
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
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES:
				return getSoftwareResources();
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES:
				return getDevices();
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX:
				return getOverheadMatrix();
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
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES:
				setSoftwareResources((SoftwareResourcesType)newValue);
				return;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES:
				setDevices((DevicesType)newValue);
				return;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX:
				setOverheadMatrix((OverheadMatrixType)newValue);
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
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES:
				setSoftwareResources((SoftwareResourcesType)null);
				return;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES:
				setDevices((DevicesType)null);
				return;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX:
				setOverheadMatrix((OverheadMatrixType)null);
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
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES:
				return softwareResources != null;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__DEVICES:
				return devices != null;
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX:
				return overheadMatrix != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessingOverheadTypeImpl