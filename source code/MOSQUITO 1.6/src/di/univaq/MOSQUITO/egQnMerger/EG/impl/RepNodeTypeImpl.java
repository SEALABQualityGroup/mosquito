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

import di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType1;
import di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rep Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl#getRepetitionFactor <em>Repetition Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepNodeTypeImpl extends EObjectImpl implements RepNodeType {
	/**
	 * The cached value of the '{@link #getBasicNode() <em>Basic Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicNode()
	 * @generated
	 * @ordered
	 */
	protected BasicNodeType basicNode = null;

	/**
	 * The cached value of the '{@link #getExpandedNode() <em>Expanded Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandedNode()
	 * @generated
	 * @ordered
	 */
	protected ExpandedNodeType expandedNode = null;

	/**
	 * The cached value of the '{@link #getLinkNode() <em>Link Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkNode()
	 * @generated
	 * @ordered
	 */
	protected LinkNodeType linkNode = null;

	/**
	 * The cached value of the '{@link #getSynchronizationNode() <em>Synchronization Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationNode()
	 * @generated
	 * @ordered
	 */
	protected SynchroNodeType synchronizationNode = null;

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
	 * The default value of the '{@link #getRepetitionFactor() <em>Repetition Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float REPETITION_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRepetitionFactor() <em>Repetition Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionFactor()
	 * @generated
	 * @ordered
	 */
	protected float repetitionFactor = REPETITION_FACTOR_EDEFAULT;

	/**
	 * This is true if the Repetition Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repetitionFactorESet = false;

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
	protected RepNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.REP_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNodeType getBasicNode() {
		return basicNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicNode(BasicNodeType newBasicNode, NotificationChain msgs) {
		BasicNodeType oldBasicNode = basicNode;
		basicNode = newBasicNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__BASIC_NODE, oldBasicNode, newBasicNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicNode(BasicNodeType newBasicNode) {
		if (newBasicNode != basicNode) {
			NotificationChain msgs = null;
			if (basicNode != null)
				msgs = ((InternalEObject)basicNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__BASIC_NODE, null, msgs);
			if (newBasicNode != null)
				msgs = ((InternalEObject)newBasicNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__BASIC_NODE, null, msgs);
			msgs = basicSetBasicNode(newBasicNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__BASIC_NODE, newBasicNode, newBasicNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeType getExpandedNode() {
		return expandedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpandedNode(ExpandedNodeType newExpandedNode, NotificationChain msgs) {
		ExpandedNodeType oldExpandedNode = expandedNode;
		expandedNode = newExpandedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE, oldExpandedNode, newExpandedNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandedNode(ExpandedNodeType newExpandedNode) {
		if (newExpandedNode != expandedNode) {
			NotificationChain msgs = null;
			if (expandedNode != null)
				msgs = ((InternalEObject)expandedNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE, null, msgs);
			if (newExpandedNode != null)
				msgs = ((InternalEObject)newExpandedNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE, null, msgs);
			msgs = basicSetExpandedNode(newExpandedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE, newExpandedNode, newExpandedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkNodeType getLinkNode() {
		return linkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkNode(LinkNodeType newLinkNode, NotificationChain msgs) {
		LinkNodeType oldLinkNode = linkNode;
		linkNode = newLinkNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__LINK_NODE, oldLinkNode, newLinkNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkNode(LinkNodeType newLinkNode) {
		if (newLinkNode != linkNode) {
			NotificationChain msgs = null;
			if (linkNode != null)
				msgs = ((InternalEObject)linkNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__LINK_NODE, null, msgs);
			if (newLinkNode != null)
				msgs = ((InternalEObject)newLinkNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__LINK_NODE, null, msgs);
			msgs = basicSetLinkNode(newLinkNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__LINK_NODE, newLinkNode, newLinkNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchroNodeType getSynchronizationNode() {
		return synchronizationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizationNode(SynchroNodeType newSynchronizationNode, NotificationChain msgs) {
		SynchroNodeType oldSynchronizationNode = synchronizationNode;
		synchronizationNode = newSynchronizationNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE, oldSynchronizationNode, newSynchronizationNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizationNode(SynchroNodeType newSynchronizationNode) {
		if (newSynchronizationNode != synchronizationNode) {
			NotificationChain msgs = null;
			if (synchronizationNode != null)
				msgs = ((InternalEObject)synchronizationNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE, null, msgs);
			if (newSynchronizationNode != null)
				msgs = ((InternalEObject)newSynchronizationNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE, null, msgs);
			msgs = basicSetSynchronizationNode(newSynchronizationNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE, newSynchronizationNode, newSynchronizationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceRequirement() {
		if (resourceRequirement == null) {
			resourceRequirement = new EObjectContainmentEList(ResourceRequirementType1.class, this, DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT);
		}
		return resourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRepetitionFactor() {
		return repetitionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionFactor(float newRepetitionFactor) {
		float oldRepetitionFactor = repetitionFactor;
		repetitionFactor = newRepetitionFactor;
		boolean oldRepetitionFactorESet = repetitionFactorESet;
		repetitionFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR, oldRepetitionFactor, repetitionFactor, !oldRepetitionFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepetitionFactor() {
		float oldRepetitionFactor = repetitionFactor;
		boolean oldRepetitionFactorESet = repetitionFactorESet;
		repetitionFactor = REPETITION_FACTOR_EDEFAULT;
		repetitionFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR, oldRepetitionFactor, REPETITION_FACTOR_EDEFAULT, oldRepetitionFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepetitionFactor() {
		return repetitionFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.REP_NODE_TYPE__BASIC_NODE:
				return basicSetBasicNode(null, msgs);
			case DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE:
				return basicSetExpandedNode(null, msgs);
			case DevicesPackage.REP_NODE_TYPE__LINK_NODE:
				return basicSetLinkNode(null, msgs);
			case DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE:
				return basicSetSynchronizationNode(null, msgs);
			case DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT:
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
			case DevicesPackage.REP_NODE_TYPE__BASIC_NODE:
				return getBasicNode();
			case DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE:
				return getExpandedNode();
			case DevicesPackage.REP_NODE_TYPE__LINK_NODE:
				return getLinkNode();
			case DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE:
				return getSynchronizationNode();
			case DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT:
				return getResourceRequirement();
			case DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR:
				return new Float(getRepetitionFactor());
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
			case DevicesPackage.REP_NODE_TYPE__BASIC_NODE:
				setBasicNode((BasicNodeType)newValue);
				return;
			case DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE:
				setExpandedNode((ExpandedNodeType)newValue);
				return;
			case DevicesPackage.REP_NODE_TYPE__LINK_NODE:
				setLinkNode((LinkNodeType)newValue);
				return;
			case DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE:
				setSynchronizationNode((SynchroNodeType)newValue);
				return;
			case DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				getResourceRequirement().addAll((Collection)newValue);
				return;
			case DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR:
				setRepetitionFactor(((Float)newValue).floatValue());
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
			case DevicesPackage.REP_NODE_TYPE__BASIC_NODE:
				setBasicNode((BasicNodeType)null);
				return;
			case DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE:
				setExpandedNode((ExpandedNodeType)null);
				return;
			case DevicesPackage.REP_NODE_TYPE__LINK_NODE:
				setLinkNode((LinkNodeType)null);
				return;
			case DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE:
				setSynchronizationNode((SynchroNodeType)null);
				return;
			case DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				return;
			case DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR:
				unsetRepetitionFactor();
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
			case DevicesPackage.REP_NODE_TYPE__BASIC_NODE:
				return basicNode != null;
			case DevicesPackage.REP_NODE_TYPE__EXPANDED_NODE:
				return expandedNode != null;
			case DevicesPackage.REP_NODE_TYPE__LINK_NODE:
				return linkNode != null;
			case DevicesPackage.REP_NODE_TYPE__SYNCHRONIZATION_NODE:
				return synchronizationNode != null;
			case DevicesPackage.REP_NODE_TYPE__RESOURCE_REQUIREMENT:
				return resourceRequirement != null && !resourceRequirement.isEmpty();
			case DevicesPackage.REP_NODE_TYPE__REPETITION_FACTOR:
				return isSetRepetitionFactor();
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
		result.append(" (repetitionFactor: ");
		if (repetitionFactorESet) result.append(repetitionFactor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RepNodeTypeImpl