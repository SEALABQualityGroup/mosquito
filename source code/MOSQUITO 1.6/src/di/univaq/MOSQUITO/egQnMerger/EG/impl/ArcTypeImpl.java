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

import di.univaq.MOSQUITO.egQnMerger.EG.ArcType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl#getToNode <em>To Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcTypeImpl extends EObjectImpl implements ArcType {
	/**
	 * The default value of the '{@link #getFromNode() <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected String fromNode = FROM_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToNode() <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected String toNode = TO_NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.ARC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromNode(String newFromNode) {
		String oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.ARC_TYPE__FROM_NODE, oldFromNode, fromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNode(String newToNode) {
		String oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.ARC_TYPE__TO_NODE, oldToNode, toNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.ARC_TYPE__FROM_NODE:
				return getFromNode();
			case DevicesPackage.ARC_TYPE__TO_NODE:
				return getToNode();
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
			case DevicesPackage.ARC_TYPE__FROM_NODE:
				setFromNode((String)newValue);
				return;
			case DevicesPackage.ARC_TYPE__TO_NODE:
				setToNode((String)newValue);
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
			case DevicesPackage.ARC_TYPE__FROM_NODE:
				setFromNode(FROM_NODE_EDEFAULT);
				return;
			case DevicesPackage.ARC_TYPE__TO_NODE:
				setToNode(TO_NODE_EDEFAULT);
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
			case DevicesPackage.ARC_TYPE__FROM_NODE:
				return FROM_NODE_EDEFAULT == null ? fromNode != null : !FROM_NODE_EDEFAULT.equals(fromNode);
			case DevicesPackage.ARC_TYPE__TO_NODE:
				return TO_NODE_EDEFAULT == null ? toNode != null : !TO_NODE_EDEFAULT.equals(toNode);
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
		result.append(" (fromNode: ");
		result.append(fromNode);
		result.append(", toNode: ");
		result.append(toNode);
		result.append(')');
		return result.toString();
	}

} //ArcTypeImpl