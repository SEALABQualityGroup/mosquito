/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.OMElementType;
import di.univaq.MOSQUITO.egQnMerger.EG.OverheadMatrixType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overhead Matrix Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OverheadMatrixTypeImpl#getOMElement <em>OM Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverheadMatrixTypeImpl extends EObjectImpl implements OverheadMatrixType {
	/**
	 * The cached value of the '{@link #getOMElement() <em>OM Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOMElement()
	 * @generated
	 * @ordered
	 */
	protected EList oMElement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverheadMatrixTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.OVERHEAD_MATRIX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOMElement() {
		if (oMElement == null) {
			oMElement = new EObjectContainmentEList(OMElementType.class, this, DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT);
		}
		return oMElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT:
				return ((InternalEList)getOMElement()).basicRemove(otherEnd, msgs);
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
			case DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT:
				return getOMElement();
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
			case DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT:
				getOMElement().clear();
				getOMElement().addAll((Collection)newValue);
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
			case DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT:
				getOMElement().clear();
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
			case DevicesPackage.OVERHEAD_MATRIX_TYPE__OM_ELEMENT:
				return oMElement != null && !oMElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OverheadMatrixTypeImpl