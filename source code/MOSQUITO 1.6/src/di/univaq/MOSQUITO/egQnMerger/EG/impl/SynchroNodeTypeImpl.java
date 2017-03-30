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
import di.univaq.MOSQUITO.egQnMerger.EG.PartnerTypeType;
import di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchro Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getMyType <em>My Type</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getPartnerPerfFileName <em>Partner Perf File Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getPartnerPerfScenarioName <em>Partner Perf Scenario Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getPartnerType <em>Partner Type</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchroNodeTypeImpl extends EObjectImpl implements SynchroNodeType {
	/**
	 * The default value of the '{@link #getMyType() <em>My Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyType()
	 * @generated
	 * @ordered
	 */
	protected static final PartnerTypeType MY_TYPE_EDEFAULT = PartnerTypeType.SYNCHRONOUS_CALL_LITERAL;

	/**
	 * The cached value of the '{@link #getMyType() <em>My Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyType()
	 * @generated
	 * @ordered
	 */
	protected PartnerTypeType myType = MY_TYPE_EDEFAULT;

	/**
	 * This is true if the My Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myTypeESet = false;

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
	 * The default value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected String partnerName = PARTNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerPerfFileName() <em>Partner Perf File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerPerfFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_PERF_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerPerfFileName() <em>Partner Perf File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerPerfFileName()
	 * @generated
	 * @ordered
	 */
	protected String partnerPerfFileName = PARTNER_PERF_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerPerfScenarioName() <em>Partner Perf Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerPerfScenarioName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_PERF_SCENARIO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerPerfScenarioName() <em>Partner Perf Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerPerfScenarioName()
	 * @generated
	 * @ordered
	 */
	protected String partnerPerfScenarioName = PARTNER_PERF_SCENARIO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerType() <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerType()
	 * @generated
	 * @ordered
	 */
	protected static final PartnerTypeType PARTNER_TYPE_EDEFAULT = PartnerTypeType.SYNCHRONOUS_CALL_LITERAL;

	/**
	 * The cached value of the '{@link #getPartnerType() <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerType()
	 * @generated
	 * @ordered
	 */
	protected PartnerTypeType partnerType = PARTNER_TYPE_EDEFAULT;

	/**
	 * This is true if the Partner Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partnerTypeESet = false;

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
        
        public float[] getWeightedTotalResources() {
            float[] weightedTotalResources = new float[this.totalResources.length];
            for(int i = 0; i < totalResources.length; i++) {
                weightedTotalResources[i] = this.totalResources[i] * this.getProbability();
            }
            return weightedTotalResources;
        }
        ///////////////////////////////////
        
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchroNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.SYNCHRO_NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerTypeType getMyType() {
		return myType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyType(PartnerTypeType newMyType) {
		PartnerTypeType oldMyType = myType;
		myType = newMyType == null ? MY_TYPE_EDEFAULT : newMyType;
		boolean oldMyTypeESet = myTypeESet;
		myTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE, oldMyType, myType, !oldMyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyType() {
		PartnerTypeType oldMyType = myType;
		boolean oldMyTypeESet = myTypeESet;
		myType = MY_TYPE_EDEFAULT;
		myTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE, oldMyType, MY_TYPE_EDEFAULT, oldMyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyType() {
		return myTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerName(String newPartnerName) {
		String oldPartnerName = partnerName;
		partnerName = newPartnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_NAME, oldPartnerName, partnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerPerfFileName() {
		return partnerPerfFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerPerfFileName(String newPartnerPerfFileName) {
		String oldPartnerPerfFileName = partnerPerfFileName;
		partnerPerfFileName = newPartnerPerfFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME, oldPartnerPerfFileName, partnerPerfFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerPerfScenarioName() {
		return partnerPerfScenarioName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerPerfScenarioName(String newPartnerPerfScenarioName) {
		String oldPartnerPerfScenarioName = partnerPerfScenarioName;
		partnerPerfScenarioName = newPartnerPerfScenarioName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME, oldPartnerPerfScenarioName, partnerPerfScenarioName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerTypeType getPartnerType() {
		return partnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerType(PartnerTypeType newPartnerType) {
		PartnerTypeType oldPartnerType = partnerType;
		partnerType = newPartnerType == null ? PARTNER_TYPE_EDEFAULT : newPartnerType;
		boolean oldPartnerTypeESet = partnerTypeESet;
		partnerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE, oldPartnerType, partnerType, !oldPartnerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartnerType() {
		PartnerTypeType oldPartnerType = partnerType;
		boolean oldPartnerTypeESet = partnerTypeESet;
		partnerType = PARTNER_TYPE_EDEFAULT;
		partnerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE, oldPartnerType, PARTNER_TYPE_EDEFAULT, oldPartnerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartnerType() {
		return partnerTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY, oldProbability, probability, !oldProbabilityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY, oldProbability, PROBABILITY_EDEFAULT, oldProbabilityESet));
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
			case DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE:
				return getMyType();
			case DevicesPackage.SYNCHRO_NODE_TYPE__NODE_NAME:
				return getNodeName();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_NAME:
				return getPartnerName();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME:
				return getPartnerPerfFileName();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME:
				return getPartnerPerfScenarioName();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE:
				return getPartnerType();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE:
				setMyType((PartnerTypeType)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_NAME:
				setPartnerName((String)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME:
				setPartnerPerfFileName((String)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME:
				setPartnerPerfScenarioName((String)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE:
				setPartnerType((PartnerTypeType)newValue);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE:
				unsetMyType();
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_NAME:
				setPartnerName(PARTNER_NAME_EDEFAULT);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME:
				setPartnerPerfFileName(PARTNER_PERF_FILE_NAME_EDEFAULT);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME:
				setPartnerPerfScenarioName(PARTNER_PERF_SCENARIO_NAME_EDEFAULT);
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE:
				unsetPartnerType();
				return;
			case DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY:
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
			case DevicesPackage.SYNCHRO_NODE_TYPE__MY_TYPE:
				return isSetMyType();
			case DevicesPackage.SYNCHRO_NODE_TYPE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_NAME:
				return PARTNER_NAME_EDEFAULT == null ? partnerName != null : !PARTNER_NAME_EDEFAULT.equals(partnerName);
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME:
				return PARTNER_PERF_FILE_NAME_EDEFAULT == null ? partnerPerfFileName != null : !PARTNER_PERF_FILE_NAME_EDEFAULT.equals(partnerPerfFileName);
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME:
				return PARTNER_PERF_SCENARIO_NAME_EDEFAULT == null ? partnerPerfScenarioName != null : !PARTNER_PERF_SCENARIO_NAME_EDEFAULT.equals(partnerPerfScenarioName);
			case DevicesPackage.SYNCHRO_NODE_TYPE__PARTNER_TYPE:
				return isSetPartnerType();
			case DevicesPackage.SYNCHRO_NODE_TYPE__PROBABILITY:
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
		result.append(" (myType: ");
		if (myTypeESet) result.append(myType); else result.append("<unset>");
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", partnerName: ");
		result.append(partnerName);
		result.append(", partnerPerfFileName: ");
		result.append(partnerPerfFileName);
		result.append(", partnerPerfScenarioName: ");
		result.append(partnerPerfScenarioName);
		result.append(", partnerType: ");
		if (partnerTypeESet) result.append(partnerType); else result.append("<unset>");
		result.append(", probability: ");
		if (probabilityESet) result.append(probability); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SynchroNodeTypeImpl