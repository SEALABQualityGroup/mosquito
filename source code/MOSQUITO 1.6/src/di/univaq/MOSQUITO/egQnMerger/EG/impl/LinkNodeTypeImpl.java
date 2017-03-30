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
import di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl#getPerformanceScenarioFilename <em>Performance Scenario Filename</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl#getPerformanceScenarioName <em>Performance Scenario Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkNodeTypeImpl extends EObjectImpl implements LinkNodeType {
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
	 * The default value of the '{@link #getPerformanceScenarioFilename() <em>Performance Scenario Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceScenarioFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_SCENARIO_FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceScenarioFilename() <em>Performance Scenario Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceScenarioFilename()
	 * @generated
	 * @ordered
	 */
	protected String performanceScenarioFilename = PERFORMANCE_SCENARIO_FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceScenarioName() <em>Performance Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceScenarioName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_SCENARIO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceScenarioName() <em>Performance Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceScenarioName()
	 * @generated
	 * @ordered
	 */
	protected String performanceScenarioName = PERFORMANCE_SCENARIO_NAME_EDEFAULT;

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
	protected LinkNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.LINK_NODE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.LINK_NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceScenarioFilename() {
		return performanceScenarioFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceScenarioFilename(String newPerformanceScenarioFilename) {
		String oldPerformanceScenarioFilename = performanceScenarioFilename;
		performanceScenarioFilename = newPerformanceScenarioFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME, oldPerformanceScenarioFilename, performanceScenarioFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceScenarioName() {
		return performanceScenarioName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceScenarioName(String newPerformanceScenarioName) {
		String oldPerformanceScenarioName = performanceScenarioName;
		performanceScenarioName = newPerformanceScenarioName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME, oldPerformanceScenarioName, performanceScenarioName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.LINK_NODE_TYPE__PROBABILITY, oldProbability, probability, !oldProbabilityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.LINK_NODE_TYPE__PROBABILITY, oldProbability, PROBABILITY_EDEFAULT, oldProbabilityESet));
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
			case DevicesPackage.LINK_NODE_TYPE__NODE_NAME:
				return getNodeName();
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME:
				return getPerformanceScenarioFilename();
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME:
				return getPerformanceScenarioName();
			case DevicesPackage.LINK_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.LINK_NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME:
				setPerformanceScenarioFilename((String)newValue);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME:
				setPerformanceScenarioName((String)newValue);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.LINK_NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME:
				setPerformanceScenarioFilename(PERFORMANCE_SCENARIO_FILENAME_EDEFAULT);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME:
				setPerformanceScenarioName(PERFORMANCE_SCENARIO_NAME_EDEFAULT);
				return;
			case DevicesPackage.LINK_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.LINK_NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME:
				return PERFORMANCE_SCENARIO_FILENAME_EDEFAULT == null ? performanceScenarioFilename != null : !PERFORMANCE_SCENARIO_FILENAME_EDEFAULT.equals(performanceScenarioFilename);
			case DevicesPackage.LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME:
				return PERFORMANCE_SCENARIO_NAME_EDEFAULT == null ? performanceScenarioName != null : !PERFORMANCE_SCENARIO_NAME_EDEFAULT.equals(performanceScenarioName);
			case DevicesPackage.LINK_NODE_TYPE__PROBABILITY:
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
		result.append(" (nodeName: ");
		result.append(nodeName);
		result.append(", performanceScenarioFilename: ");
		result.append(performanceScenarioFilename);
		result.append(", performanceScenarioName: ");
		result.append(performanceScenarioName);
		result.append(", probability: ");
		if (probabilityESet) result.append(probability); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LinkNodeTypeImpl