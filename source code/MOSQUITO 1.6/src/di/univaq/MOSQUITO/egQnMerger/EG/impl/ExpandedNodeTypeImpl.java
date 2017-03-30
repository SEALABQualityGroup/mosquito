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
import di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expanded Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl#getEGname <em>EGname</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpandedNodeTypeImpl extends EObjectImpl implements ExpandedNodeType {
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

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final float PROBABILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected float probability = PROBABILITY_EDEFAULT;

	/**
	 * This is true if the Probability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabilityESet = false;

        ///////////////////////////////////////////
        protected String[] devicesNames;
        protected float[] derivedResources;
        
        public void setDevicesNames(String[] names) {
            this.devicesNames = names;
        }
        
        public void setDerivedResources(float[] derivedRes) {
            this.derivedResources = derivedRes;
        }
        
        public String[] getDevicesNames() {
            return this.devicesNames;
        }
        
        public float[] getDerivedResources() {
            return this.derivedResources;
        }
        
        public float[] getWeightedDerivedResources() {
            float[] weightedDerivedResources = new float[this.derivedResources.length];
            for(int i = 0; i < derivedResources.length; i++) {
                weightedDerivedResources[i] = this.derivedResources[i] * this.getProbability();
            }
            return weightedDerivedResources;
        }
        ///////////////////////////////////
        
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpandedNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.EXPANDED_NODE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EXPANDED_NODE_TYPE__EGNAME, oldEGname, eGname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EXPANDED_NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(float newProbability) {
		float oldProbability = probability;
		probability = newProbability;
		boolean oldProbabilityESet = probabilityESet;
		probabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY, oldProbability, probability, !oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbability() {
		float oldProbability = probability;
		boolean oldProbabilityESet = probabilityESet;
		probability = PROBABILITY_EDEFAULT;
		probabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY, oldProbability, PROBABILITY_EDEFAULT, oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbability() {
		return probabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.EXPANDED_NODE_TYPE__EGNAME:
				return getEGname();
			case DevicesPackage.EXPANDED_NODE_TYPE__NODE_NAME:
				return getNodeName();
			case DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY:
				return new Float(getProbability());
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
			case DevicesPackage.EXPANDED_NODE_TYPE__EGNAME:
				setEGname((String)newValue);
				return;
			case DevicesPackage.EXPANDED_NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY:
				setProbability(((Float)newValue).floatValue());
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
			case DevicesPackage.EXPANDED_NODE_TYPE__EGNAME:
				setEGname(EGNAME_EDEFAULT);
				return;
			case DevicesPackage.EXPANDED_NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY:
				unsetProbability();
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
			case DevicesPackage.EXPANDED_NODE_TYPE__EGNAME:
				return EGNAME_EDEFAULT == null ? eGname != null : !EGNAME_EDEFAULT.equals(eGname);
			case DevicesPackage.EXPANDED_NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case DevicesPackage.EXPANDED_NODE_TYPE__PROBABILITY:
				return isSetProbability();
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
		result.append(" (eGname: ");
		result.append(eGname);
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", probability: ");
		if (probabilityESet) result.append(probability); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExpandedNodeTypeImpl