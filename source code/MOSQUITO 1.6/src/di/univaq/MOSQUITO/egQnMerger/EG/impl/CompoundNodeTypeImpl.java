/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getSplitNode <em>Split Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getPardoNode <em>Pardo Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getCaseNode <em>Case Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getRepetitionNode <em>Repetition Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundNodeTypeImpl extends EObjectImpl implements CompoundNodeType {
	/**
	 * The cached value of the '{@link #getSplitNode() <em>Split Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitNode()
	 * @generated
	 * @ordered
	 */
	protected CPSNodeType splitNode = null;

	/**
	 * The cached value of the '{@link #getPardoNode() <em>Pardo Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPardoNode()
	 * @generated
	 * @ordered
	 */
	protected CPSNodeType pardoNode = null;

	/**
	 * The cached value of the '{@link #getCaseNode() <em>Case Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseNode()
	 * @generated
	 * @ordered
	 */
	protected CPSNodeType caseNode = null;

	/**
	 * The cached value of the '{@link #getRepetitionNode() <em>Repetition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionNode()
	 * @generated
	 * @ordered
	 */
	protected RepNodeType repetitionNode = null;

	/**
	 * The cached value of the '{@link #getResourceRequirement() <em>Resource Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList resourceRequirement = null;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

        ///////////////////////////////////////////
        protected String[] devicesNames;
        protected float[] totalResources;
        
        public void setDevicesNames(String[] names) {
            this.devicesNames = names;
        }
        
        public void setTotalResources(float[] totRes) {
            this.totalResources = totRes;
        }
        
        public String[] getDevicesNames() {
            return this.devicesNames;
        }
        
        public float[] getTotalResources() {
            return this.totalResources;
        }
        
        ///////////////////////////////////
        
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.COMPOUND_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSNodeType getSplitNode() {
		return splitNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplitNode(CPSNodeType newSplitNode, NotificationChain msgs) {
		CPSNodeType oldSplitNode = splitNode;
		splitNode = newSplitNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE, oldSplitNode, newSplitNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitNode(CPSNodeType newSplitNode) {
		if (newSplitNode != splitNode) {
			NotificationChain msgs = null;
			if (splitNode != null)
				msgs = ((InternalEObject)splitNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE, null, msgs);
			if (newSplitNode != null)
				msgs = ((InternalEObject)newSplitNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE, null, msgs);
			msgs = basicSetSplitNode(newSplitNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE, newSplitNode, newSplitNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSNodeType getPardoNode() {
		return pardoNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPardoNode(CPSNodeType newPardoNode, NotificationChain msgs) {
		CPSNodeType oldPardoNode = pardoNode;
		pardoNode = newPardoNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE, oldPardoNode, newPardoNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPardoNode(CPSNodeType newPardoNode) {
		if (newPardoNode != pardoNode) {
			NotificationChain msgs = null;
			if (pardoNode != null)
				msgs = ((InternalEObject)pardoNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE, null, msgs);
			if (newPardoNode != null)
				msgs = ((InternalEObject)newPardoNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE, null, msgs);
			msgs = basicSetPardoNode(newPardoNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE, newPardoNode, newPardoNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSNodeType getCaseNode() {
		return caseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseNode(CPSNodeType newCaseNode, NotificationChain msgs) {
		CPSNodeType oldCaseNode = caseNode;
		caseNode = newCaseNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE, oldCaseNode, newCaseNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseNode(CPSNodeType newCaseNode) {
		if (newCaseNode != caseNode) {
			NotificationChain msgs = null;
			if (caseNode != null)
				msgs = ((InternalEObject)caseNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE, null, msgs);
			if (newCaseNode != null)
				msgs = ((InternalEObject)newCaseNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE, null, msgs);
			msgs = basicSetCaseNode(newCaseNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE, newCaseNode, newCaseNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepNodeType getRepetitionNode() {
		return repetitionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitionNode(RepNodeType newRepetitionNode, NotificationChain msgs) {
		RepNodeType oldRepetitionNode = repetitionNode;
		repetitionNode = newRepetitionNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE, oldRepetitionNode, newRepetitionNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionNode(RepNodeType newRepetitionNode) {
		if (newRepetitionNode != repetitionNode) {
			NotificationChain msgs = null;
			if (repetitionNode != null)
				msgs = ((InternalEObject)repetitionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE, null, msgs);
			if (newRepetitionNode != null)
				msgs = ((InternalEObject)newRepetitionNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE, null, msgs);
			msgs = basicSetRepetitionNode(newRepetitionNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE, newRepetitionNode, newRepetitionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceRequirement() {
		if (resourceRequirement == null) {
			resourceRequirement = new EObjectContainmentEList(ResourceRequirementType.class, this, DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT);
		}
		return resourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeName(String newNodeName) {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.COMPOUND_NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE:
				return basicSetSplitNode(null, msgs);
			case DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE:
				return basicSetPardoNode(null, msgs);
			case DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE:
				return basicSetCaseNode(null, msgs);
			case DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE:
				return basicSetRepetitionNode(null, msgs);
			case DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT:
				return ((InternalEList)getResourceRequirement()).basicRemove(otherEnd, msgs);
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
			case DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE:
				return getSplitNode();
			case DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE:
				return getPardoNode();
			case DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE:
				return getCaseNode();
			case DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE:
				return getRepetitionNode();
			case DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT:
				return getResourceRequirement();
			case DevicesPackage.COMPOUND_NODE_TYPE__NODE_NAME:
				return getNodeName();
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
			case DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE:
				setSplitNode((CPSNodeType)newValue);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE:
				setPardoNode((CPSNodeType)newValue);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE:
				setCaseNode((CPSNodeType)newValue);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE:
				setRepetitionNode((RepNodeType)newValue);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				getResourceRequirement().addAll((Collection)newValue);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
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
			case DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE:
				setSplitNode((CPSNodeType)null);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE:
				setPardoNode((CPSNodeType)null);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE:
				setCaseNode((CPSNodeType)null);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE:
				setRepetitionNode((RepNodeType)null);
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				return;
			case DevicesPackage.COMPOUND_NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
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
			case DevicesPackage.COMPOUND_NODE_TYPE__SPLIT_NODE:
				return splitNode != null;
			case DevicesPackage.COMPOUND_NODE_TYPE__PARDO_NODE:
				return pardoNode != null;
			case DevicesPackage.COMPOUND_NODE_TYPE__CASE_NODE:
				return caseNode != null;
			case DevicesPackage.COMPOUND_NODE_TYPE__REPETITION_NODE:
				return repetitionNode != null;
			case DevicesPackage.COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT:
				return resourceRequirement != null && !resourceRequirement.isEmpty();
			case DevicesPackage.COMPOUND_NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
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
		result.append(" (nodeName: ");
		result.append(nodeName);
		result.append(')');
		return result.toString();
	}

} //CompoundNodeTypeImpl