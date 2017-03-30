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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPS Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl#getResourceRequirement <em>Resource Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPSNodeTypeImpl extends EObjectImpl implements CPSNodeType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

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
	protected CPSNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.CPS_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DevicesPackage.CPS_NODE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBasicNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.CPS_NODE_TYPE__BASIC_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExpandedNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.CPS_NODE_TYPE__EXPANDED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.CPS_NODE_TYPE__LINK_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSynchronizationNode() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.CPS_NODE_TYPE__SYNCHRONIZATION_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResourceRequirement() {
		return ((FeatureMap)getGroup()).list(DevicesPackage.Literals.CPS_NODE_TYPE__RESOURCE_REQUIREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.CPS_NODE_TYPE__GROUP:
				return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
			case DevicesPackage.CPS_NODE_TYPE__BASIC_NODE:
				return ((InternalEList)getBasicNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.CPS_NODE_TYPE__EXPANDED_NODE:
				return ((InternalEList)getExpandedNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.CPS_NODE_TYPE__LINK_NODE:
				return ((InternalEList)getLinkNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.CPS_NODE_TYPE__SYNCHRONIZATION_NODE:
				return ((InternalEList)getSynchronizationNode()).basicRemove(otherEnd, msgs);
			case DevicesPackage.CPS_NODE_TYPE__RESOURCE_REQUIREMENT:
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
			case DevicesPackage.CPS_NODE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DevicesPackage.CPS_NODE_TYPE__BASIC_NODE:
				return getBasicNode();
			case DevicesPackage.CPS_NODE_TYPE__EXPANDED_NODE:
				return getExpandedNode();
			case DevicesPackage.CPS_NODE_TYPE__LINK_NODE:
				return getLinkNode();
			case DevicesPackage.CPS_NODE_TYPE__SYNCHRONIZATION_NODE:
				return getSynchronizationNode();
			case DevicesPackage.CPS_NODE_TYPE__RESOURCE_REQUIREMENT:
				return getResourceRequirement();
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
			case DevicesPackage.CPS_NODE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DevicesPackage.CPS_NODE_TYPE__BASIC_NODE:
				getBasicNode().clear();
				getBasicNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.CPS_NODE_TYPE__EXPANDED_NODE:
				getExpandedNode().clear();
				getExpandedNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.CPS_NODE_TYPE__LINK_NODE:
				getLinkNode().clear();
				getLinkNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.CPS_NODE_TYPE__SYNCHRONIZATION_NODE:
				getSynchronizationNode().clear();
				getSynchronizationNode().addAll((Collection)newValue);
				return;
			case DevicesPackage.CPS_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
				getResourceRequirement().addAll((Collection)newValue);
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
			case DevicesPackage.CPS_NODE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DevicesPackage.CPS_NODE_TYPE__BASIC_NODE:
				getBasicNode().clear();
				return;
			case DevicesPackage.CPS_NODE_TYPE__EXPANDED_NODE:
				getExpandedNode().clear();
				return;
			case DevicesPackage.CPS_NODE_TYPE__LINK_NODE:
				getLinkNode().clear();
				return;
			case DevicesPackage.CPS_NODE_TYPE__SYNCHRONIZATION_NODE:
				getSynchronizationNode().clear();
				return;
			case DevicesPackage.CPS_NODE_TYPE__RESOURCE_REQUIREMENT:
				getResourceRequirement().clear();
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
			case DevicesPackage.CPS_NODE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DevicesPackage.CPS_NODE_TYPE__BASIC_NODE:
				return !getBasicNode().isEmpty();
			case DevicesPackage.CPS_NODE_TYPE__EXPANDED_NODE:
				return !getExpandedNode().isEmpty();
			case DevicesPackage.CPS_NODE_TYPE__LINK_NODE:
				return !getLinkNode().isEmpty();
			case DevicesPackage.CPS_NODE_TYPE__SYNCHRONIZATION_NODE:
				return !getSynchronizationNode().isEmpty();
			case DevicesPackage.CPS_NODE_TYPE__RESOURCE_REQUIREMENT:
				return !getResourceRequirement().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CPSNodeTypeImpl