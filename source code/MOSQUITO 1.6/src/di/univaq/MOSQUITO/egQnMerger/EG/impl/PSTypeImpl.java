/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;


import java.math.BigInteger;

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

import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.EGType;
import di.univaq.MOSQUITO.egQnMerger.EG.PSType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getExecutionGraph <em>Execution Graph</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getInterarrivalTime <em>Interarrival Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getNumberOfJobs <em>Number Of Jobs</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl#getSWmodelfilename <em>SWmodelfilename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSTypeImpl extends EObjectImpl implements PSType {
	/**
	 * The cached value of the '{@link #getExecutionGraph() <em>Execution Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionGraph()
	 * @generated
	 * @ordered
	 */
	protected EList executionGraph = null;

	/**
	 * The default value of the '{@link #getInterarrivalTime() <em>Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERARRIVAL_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterarrivalTime() <em>Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected float interarrivalTime = INTERARRIVAL_TIME_EDEFAULT;

	/**
	 * This is true if the Interarrival Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interarrivalTimeESet = false;

	/**
	 * The default value of the '{@link #getNumberOfJobs() <em>Number Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJobs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_JOBS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfJobs() <em>Number Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJobs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfJobs = NUMBER_OF_JOBS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioName()
	 * @generated
	 * @ordered
	 */
	protected String scenarioName = SCENARIO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSWmodelfilename() <em>SWmodelfilename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWmodelfilename()
	 * @generated
	 * @ordered
	 */
	protected static final String SWMODELFILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSWmodelfilename() <em>SWmodelfilename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWmodelfilename()
	 * @generated
	 * @ordered
	 */
	protected String sWmodelfilename = SWMODELFILENAME_EDEFAULT;

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
        
        public float getTotalResources(String deviceName) {
            int i = 0;
            boolean found = false;
            while((i < getDevicesNames().length) && (!found)) {
                if(getDevicesNames()[i].equals(deviceName))
                    found = true;
                else
                    i++;
            }
            return getTotalResources()[i];
        }
        ///////////////////////////////////
        
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.PS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExecutionGraph() {
		if (executionGraph == null) {
			executionGraph = new EObjectContainmentEList(EGType.class, this, DevicesPackage.PS_TYPE__EXECUTION_GRAPH);
		}
		return executionGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInterarrivalTime() {
		return interarrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterarrivalTime(float newInterarrivalTime) {
		float oldInterarrivalTime = interarrivalTime;
		interarrivalTime = newInterarrivalTime;
		boolean oldInterarrivalTimeESet = interarrivalTimeESet;
		interarrivalTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PS_TYPE__INTERARRIVAL_TIME, oldInterarrivalTime, interarrivalTime, !oldInterarrivalTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterarrivalTime() {
		float oldInterarrivalTime = interarrivalTime;
		boolean oldInterarrivalTimeESet = interarrivalTimeESet;
		interarrivalTime = INTERARRIVAL_TIME_EDEFAULT;
		interarrivalTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicesPackage.PS_TYPE__INTERARRIVAL_TIME, oldInterarrivalTime, INTERARRIVAL_TIME_EDEFAULT, oldInterarrivalTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterarrivalTime() {
		return interarrivalTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfJobs() {
		return numberOfJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfJobs(BigInteger newNumberOfJobs) {
		BigInteger oldNumberOfJobs = numberOfJobs;
		numberOfJobs = newNumberOfJobs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PS_TYPE__NUMBER_OF_JOBS, oldNumberOfJobs, numberOfJobs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PS_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioName() {
		return scenarioName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioName(String newScenarioName) {
		String oldScenarioName = scenarioName;
		scenarioName = newScenarioName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PS_TYPE__SCENARIO_NAME, oldScenarioName, scenarioName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSWmodelfilename() {
		return sWmodelfilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSWmodelfilename(String newSWmodelfilename) {
		String oldSWmodelfilename = sWmodelfilename;
		sWmodelfilename = newSWmodelfilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PS_TYPE__SWMODELFILENAME, oldSWmodelfilename, sWmodelfilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.PS_TYPE__EXECUTION_GRAPH:
				return ((InternalEList)getExecutionGraph()).basicRemove(otherEnd, msgs);
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
			case DevicesPackage.PS_TYPE__EXECUTION_GRAPH:
				return getExecutionGraph();
			case DevicesPackage.PS_TYPE__INTERARRIVAL_TIME:
				return new Float(getInterarrivalTime());
			case DevicesPackage.PS_TYPE__NUMBER_OF_JOBS:
				return getNumberOfJobs();
			case DevicesPackage.PS_TYPE__PRIORITY:
				return getPriority();
			case DevicesPackage.PS_TYPE__SCENARIO_NAME:
				return getScenarioName();
			case DevicesPackage.PS_TYPE__SWMODELFILENAME:
				return getSWmodelfilename();
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
			case DevicesPackage.PS_TYPE__EXECUTION_GRAPH:
				getExecutionGraph().clear();
				getExecutionGraph().addAll((Collection)newValue);
				return;
			case DevicesPackage.PS_TYPE__INTERARRIVAL_TIME:
				setInterarrivalTime(((Float)newValue).floatValue());
				return;
			case DevicesPackage.PS_TYPE__NUMBER_OF_JOBS:
				setNumberOfJobs((BigInteger)newValue);
				return;
			case DevicesPackage.PS_TYPE__PRIORITY:
				setPriority((BigInteger)newValue);
				return;
			case DevicesPackage.PS_TYPE__SCENARIO_NAME:
				setScenarioName((String)newValue);
				return;
			case DevicesPackage.PS_TYPE__SWMODELFILENAME:
				setSWmodelfilename((String)newValue);
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
			case DevicesPackage.PS_TYPE__EXECUTION_GRAPH:
				getExecutionGraph().clear();
				return;
			case DevicesPackage.PS_TYPE__INTERARRIVAL_TIME:
				unsetInterarrivalTime();
				return;
			case DevicesPackage.PS_TYPE__NUMBER_OF_JOBS:
				setNumberOfJobs(NUMBER_OF_JOBS_EDEFAULT);
				return;
			case DevicesPackage.PS_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case DevicesPackage.PS_TYPE__SCENARIO_NAME:
				setScenarioName(SCENARIO_NAME_EDEFAULT);
				return;
			case DevicesPackage.PS_TYPE__SWMODELFILENAME:
				setSWmodelfilename(SWMODELFILENAME_EDEFAULT);
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
			case DevicesPackage.PS_TYPE__EXECUTION_GRAPH:
				return executionGraph != null && !executionGraph.isEmpty();
			case DevicesPackage.PS_TYPE__INTERARRIVAL_TIME:
				return isSetInterarrivalTime();
			case DevicesPackage.PS_TYPE__NUMBER_OF_JOBS:
				return NUMBER_OF_JOBS_EDEFAULT == null ? numberOfJobs != null : !NUMBER_OF_JOBS_EDEFAULT.equals(numberOfJobs);
			case DevicesPackage.PS_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case DevicesPackage.PS_TYPE__SCENARIO_NAME:
				return SCENARIO_NAME_EDEFAULT == null ? scenarioName != null : !SCENARIO_NAME_EDEFAULT.equals(scenarioName);
			case DevicesPackage.PS_TYPE__SWMODELFILENAME:
				return SWMODELFILENAME_EDEFAULT == null ? sWmodelfilename != null : !SWMODELFILENAME_EDEFAULT.equals(sWmodelfilename);
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
		result.append(" (interarrivalTime: ");
		if (interarrivalTimeESet) result.append(interarrivalTime); else result.append("<unset>");
		result.append(", numberOfJobs: ");
		result.append(numberOfJobs);
		result.append(", priority: ");
		result.append(priority);
		result.append(", scenarioName: ");
		result.append(scenarioName);
		result.append(", sWmodelfilename: ");
		result.append(sWmodelfilename);
		result.append(')');
		return result.toString();
	}

} //PSTypeImpl