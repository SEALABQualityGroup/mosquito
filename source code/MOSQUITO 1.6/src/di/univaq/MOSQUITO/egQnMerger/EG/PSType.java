/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getExecutionGraph <em>Execution Graph</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime <em>Interarrival Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getNumberOfJobs <em>Number Of Jobs</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getPriority <em>Priority</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getSWmodelfilename <em>SWmodelfilename</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType()
 * @model extendedMetaData="name='PS_type' kind='elementOnly'"
 * @generated
 */
public interface PSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Graph</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Graph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Graph</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_ExecutionGraph()
	 * @model type="Devices.EGType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExecutionGraph' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getExecutionGraph();

	/**
	 * Returns the value of the '<em><b>Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interarrival Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interarrival Time</em>' attribute.
	 * @see #isSetInterarrivalTime()
	 * @see #unsetInterarrivalTime()
	 * @see #setInterarrivalTime(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_InterarrivalTime()
	 * @model unique="false" unsettable="true" dataType="Devices.Positivefloat" required="true"
	 *        extendedMetaData="kind='attribute' name='InterarrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	float getInterarrivalTime();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime <em>Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interarrival Time</em>' attribute.
	 * @see #isSetInterarrivalTime()
	 * @see #unsetInterarrivalTime()
	 * @see #getInterarrivalTime()
	 * @generated
	 */
	void setInterarrivalTime(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime <em>Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterarrivalTime()
	 * @see #getInterarrivalTime()
	 * @see #setInterarrivalTime(float)
	 * @generated
	 */
	void unsetInterarrivalTime();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime <em>Interarrival Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interarrival Time</em>' attribute is set.
	 * @see #unsetInterarrivalTime()
	 * @see #getInterarrivalTime()
	 * @see #setInterarrivalTime(float)
	 * @generated
	 */
	boolean isSetInterarrivalTime();

	/**
	 * Returns the value of the '<em><b>Number Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Jobs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Jobs</em>' attribute.
	 * @see #setNumberOfJobs(BigInteger)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_NumberOfJobs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='NumberOfJobs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfJobs();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getNumberOfJobs <em>Number Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Jobs</em>' attribute.
	 * @see #getNumberOfJobs()
	 * @generated
	 */
	void setNumberOfJobs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigInteger)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_Priority()
	 * @model unique="false" dataType="Devices.SPEPriorityType"
	 *        extendedMetaData="kind='attribute' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Name</em>' attribute.
	 * @see #setScenarioName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_ScenarioName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ScenarioName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScenarioName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getScenarioName <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Name</em>' attribute.
	 * @see #getScenarioName()
	 * @generated
	 */
	void setScenarioName(String value);

	/**
	 * Returns the value of the '<em><b>SWmodelfilename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SWmodelfilename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SWmodelfilename</em>' attribute.
	 * @see #setSWmodelfilename(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPSType_SWmodelfilename()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='SWmodelfilename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSWmodelfilename();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getSWmodelfilename <em>SWmodelfilename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SWmodelfilename</em>' attribute.
	 * @see #getSWmodelfilename()
	 * @generated
	 */
	void setSWmodelfilename(String value);
        
        public void setDevicesNames(String[] names);
        
        public void setTotalResources(float[] totRes);
        
        public String[] getDevicesNames();
        
        public float[] getTotalResources();
        
        public float getTotalResources(String deviceName);

} // PSType