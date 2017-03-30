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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.EG.ArcType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.EGType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EG Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getCompoundNode <em>Compound Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getEGname <em>EGname</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#isIsMainEG <em>Is Main EG</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getModificationDateTime <em>Modification Date Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getStartNode <em>Start Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl#getSWmodelname <em>SWmodelname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EGTypeImpl extends EObjectImpl implements EGType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList arc = null;

	/**
	 * The default value of the '{@link #getEGname() <em>EGname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGname()
	 * @generated
	 * @ordered
	 */
	protected static final String EGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEGname() <em>EGname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGname()
	 * @generated
	 * @ordered
	 */
	protected String eGname = EGNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMainEG() <em>Is Main EG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMainEG()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMainEG() <em>Is Main EG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMainEG()
	 * @generated
	 * @ordered
	 */
	protected boolean isMainEG = IS_MAIN_EG_EDEFAULT;

	/**
	 * This is true if the Is Main EG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMainEGESet = false;

	/**
	 * The default value of the '{@link #getModificationDateTime() <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODIFICATION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationDateTime() <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDateTime()
	 * @generated
	 * @ordered
	 */
	protected Object modificationDateTime = MODIFICATION_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartNode() <em>Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNode()
	 * @generated
	 * @ordered
	 */
	protected static final String START_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartNode() <em>Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNode()
	 * @generated
	 * @ordered
	 */
	protected String startNode = START_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSWmodelname() <em>SWmodelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWmodelname()
	 * @generated
	 * @ordered
	 */
	protected static final String SWMODELNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSWmodelname() <em>SWmodelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWmodelname()
	 * @generated
	 * @ordered
	 */
	protected String sWmodelname = SWMODELNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.EG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DevicesPackage.EG_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBasicNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__BASIC_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpandedNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__EXPANDED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__LINK_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSynchronizationNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__SYNCHRONIZATION_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceRequirement() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__RESOURCE_REQUIREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCompoundNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.EG_TYPE__COMPOUND_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList(ArcType.class, this, DevicesPackage.EG_TYPE__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEGname() {
		return eGname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGname(String newEGname) {
		String oldEGname = eGname;
		eGname = newEGname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EG_TYPE__EGNAME, oldEGname, eGname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMainEG() {
		return isMainEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMainEG(boolean newIsMainEG) {
		boolean oldIsMainEG = isMainEG;
		isMainEG = newIsMainEG;
		boolean oldIsMainEGESet = isMainEGESet;
		isMainEGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EG_TYPE__IS_MAIN_EG, oldIsMainEG, isMainEG, !oldIsMainEGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMainEG() {
		boolean oldIsMainEG = isMainEG;
		boolean oldIsMainEGESet = isMainEGESet;
		isMainEG = IS_MAIN_EG_EDEFAULT;
		isMainEGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.EG_TYPE__IS_MAIN_EG, oldIsMainEG, IS_MAIN_EG_EDEFAULT, oldIsMainEGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMainEG() {
		return isMainEGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModificationDateTime() {
		return modificationDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDateTime(Object newModificationDateTime) {
		Object oldModificationDateTime = modificationDateTime;
		modificationDateTime = newModificationDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EG_TYPE__MODIFICATION_DATE_TIME, oldModificationDateTime, modificationDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartNode() {
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartNode(String newStartNode) {
		String oldStartNode = startNode;
		startNode = newStartNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EG_TYPE__START_NODE, oldStartNode, startNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSWmodelname() {
		return sWmodelname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSWmodelname(String newSWmodelname) {
		String oldSWmodelname = sWmodelname;
		sWmodelname = newSWmodelname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EG_TYPE__SWMODELNAME, oldSWmodelname, sWmodelname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.EG_TYPE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__BASIC_NODE:
				return ((InternalEList)getBasicNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__EXPANDED_NODE:
				return ((InternalEList)getExpandedNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__LINK_NODE:
				return ((InternalEList)getLinkNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__SYNCHRONIZATION_NODE:
				return ((InternalEList)getSynchronizationNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__RESOURCE_REQUIREMENT:
				return ((InternalEList)getResourceRequirement()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__COMPOUND_NODE:
				return ((InternalEList)getCompoundNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.EG_TYPE__ARC:
				return ((InternalEList)getArc()).basicRemove(otherEnd, msgs);
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
			case DevicesPackage.EG_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DevicesPackage.EG_TYPE__BASIC_NODE:
				return getBasicNode();
			case DevicesPackage.EG_TYPE__EXPANDED_NODE:
				return getExpandedNode();
			case DevicesPackage.EG_TYPE__LINK_NODE:
				return getLinkNode();
			case DevicesPackage.EG_TYPE__SYNCHRONIZATION_NODE:
				return getSynchronizationNode();
			case DevicesPackage.EG_TYPE__RESOURCE_REQUIREMENT:
				return getResourceRequirement();
			case DevicesPackage.EG_TYPE__COMPOUND_NODE:
				return getCompoundNode();
			case DevicesPackage.EG_TYPE__ARC:
				return getArc();
			case DevicesPackage.EG_TYPE__EGNAME:
				return getEGname();
			case DevicesPackage.EG_TYPE__IS_MAIN_EG:
				return isIsMainEG() ? Boolean.TRUE : Boolean.FALSE;
			case DevicesPackage.EG_TYPE__MODIFICATION_DATE_TIME:
				return getModificationDateTime();
			case DevicesPackage.EG_TYPE__START_NODE:
				return getStartNode();
			case DevicesPackage.EG_TYPE__SWMODELNAME:
				return getSWmodelname();
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
			case DevicesPackage.EG_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DevicesPackage.EG_TYPE__BASIC_NODE:
				getBasicNode().clear();
				getBasicNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__EXPANDED_NODE:
				getExpandedNode().clear();
				getExpandedNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__LINK_NODE:
				getLinkNode().clear();
				getLinkNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__SYNCHRONIZATION_NODE:
				getSynchronizationNode().clear();
				getSynchronizationNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				getResourceRequirement().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__COMPOUND_NODE:
				getCompoundNode().clear();
				getCompoundNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__ARC:
				getArc().clear();
				getArc().addAll((Collection)newValue);
				return;
			case DevicesPackage.EG_TYPE__EGNAME:
				setEGname((String)newValue);
				return;
			case DevicesPackage.EG_TYPE__IS_MAIN_EG:
				setIsMainEG(((Boolean)newValue).booleanValue());
				return;
			case DevicesPackage.EG_TYPE__MODIFICATION_DATE_TIME:
				setModificationDateTime((Object)newValue);
				return;
			case DevicesPackage.EG_TYPE__START_NODE:
				setStartNode((String)newValue);
				return;
			case DevicesPackage.EG_TYPE__SWMODELNAME:
				setSWmodelname((String)newValue);
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
			case DevicesPackage.EG_TYPE__GROUP:
				getGroup().clear();
				return;
			case DevicesPackage.EG_TYPE__BASIC_NODE:
				getBasicNode().clear();
				return;
			case DevicesPackage.EG_TYPE__EXPANDED_NODE:
				getExpandedNode().clear();
				return;
			case DevicesPackage.EG_TYPE__LINK_NODE:
				getLinkNode().clear();
				return;
			case DevicesPackage.EG_TYPE__SYNCHRONIZATION_NODE:
				getSynchronizationNode().clear();
				return;
			case DevicesPackage.EG_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				return;
			case DevicesPackage.EG_TYPE__COMPOUND_NODE:
				getCompoundNode().clear();
				return;
			case DevicesPackage.EG_TYPE__ARC:
				getArc().clear();
				return;
			case DevicesPackage.EG_TYPE__EGNAME:
				setEGname(EGNAME_EDEFAULT);
				return;
			case DevicesPackage.EG_TYPE__IS_MAIN_EG:
				unsetIsMainEG();
				return;
			case DevicesPackage.EG_TYPE__MODIFICATION_DATE_TIME:
				setModificationDateTime(MODIFICATION_DATE_TIME_EDEFAULT);
				return;
			case DevicesPackage.EG_TYPE__START_NODE:
				setStartNode(START_NODE_EDEFAULT);
				return;
			case DevicesPackage.EG_TYPE__SWMODELNAME:
				setSWmodelname(SWMODELNAME_EDEFAULT);
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
			case DevicesPackage.EG_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DevicesPackage.EG_TYPE__BASIC_NODE:
				return !getBasicNode().isEmpty();
			case DevicesPackage.EG_TYPE__EXPANDED_NODE:
				return !getExpandedNode().isEmpty();
			case DevicesPackage.EG_TYPE__LINK_NODE:
				return !getLinkNode().isEmpty();
			case DevicesPackage.EG_TYPE__SYNCHRONIZATION_NODE:
				return !getSynchronizationNode().isEmpty();
			case DevicesPackage.EG_TYPE__RESOURCE_REQUIREMENT:
				return !getResourceRequirement().isEmpty();
			case DevicesPackage.EG_TYPE__COMPOUND_NODE:
				return !getCompoundNode().isEmpty();
			case DevicesPackage.EG_TYPE__ARC:
				return arc != null && !arc.isEmpty();
			case DevicesPackage.EG_TYPE__EGNAME:
				return EGNAME_EDEFAULT == null ? eGname != null : !EGNAME_EDEFAULT.equals(eGname);
			case DevicesPackage.EG_TYPE__IS_MAIN_EG:
				return isSetIsMainEG();
			case DevicesPackage.EG_TYPE__MODIFICATION_DATE_TIME:
				return MODIFICATION_DATE_TIME_EDEFAULT == null ? modificationDateTime != null : !MODIFICATION_DATE_TIME_EDEFAULT.equals(modificationDateTime);
			case DevicesPackage.EG_TYPE__START_NODE:
				return START_NODE_EDEFAULT == null ? startNode != null : !START_NODE_EDEFAULT.equals(startNode);
			case DevicesPackage.EG_TYPE__SWMODELNAME:
				return SWMODELNAME_EDEFAULT == null ? sWmodelname != null : !SWMODELNAME_EDEFAULT.equals(sWmodelname);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", eGname: ");
		result.append(eGname);
		result.append(", isMainEG: ");
		if (isMainEGESet) result.append(isMainEG); else result.append("<unset>");
		result.append(", modificationDateTime: ");
		result.append(modificationDateTime);
		result.append(", startNode: ");
		result.append(startNode);
		result.append(", sWmodelname: ");
		result.append(sWmodelname);
		result.append(')');
		return result.toString();
	}

} //EGTypeImpl