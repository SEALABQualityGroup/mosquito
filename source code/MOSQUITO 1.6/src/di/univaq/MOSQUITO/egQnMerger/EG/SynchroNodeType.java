/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchro Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType <em>My Type</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfFileName <em>Partner Perf File Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfScenarioName <em>Partner Perf Scenario Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType <em>Partner Type</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType()
 * @model extendedMetaData="name='SynchroNode_type' kind='empty'"
 * @generated
 */
public interface SynchroNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>My Type</b></em>' attribute.
	 * The default value is <code>"SynchronousCall"</code>.
	 * The literals are from the enumeration {@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Type</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see #isSetMyType()
	 * @see #unsetMyType()
	 * @see #setMyType(PartnerTypeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_MyType()
	 * @model default="SynchronousCall" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='myType' namespace='##targetNamespace'"
	 * @generated
	 */
	PartnerTypeType getMyType();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType <em>My Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Type</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see #isSetMyType()
	 * @see #unsetMyType()
	 * @see #getMyType()
	 * @generated
	 */
	void setMyType(PartnerTypeType value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType <em>My Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyType()
	 * @see #getMyType()
	 * @see #setMyType(PartnerTypeType)
	 * @generated
	 */
	void unsetMyType();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType <em>My Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My Type</em>' attribute is set.
	 * @see #unsetMyType()
	 * @see #getMyType()
	 * @see #setMyType(PartnerTypeType)
	 * @generated
	 */
	boolean isSetMyType();

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_NodeName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='NodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Name</em>' attribute.
	 * @see #setPartnerName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_PartnerName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartnerName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerName <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Name</em>' attribute.
	 * @see #getPartnerName()
	 * @generated
	 */
	void setPartnerName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Perf File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Perf File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Perf File Name</em>' attribute.
	 * @see #setPartnerPerfFileName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_PartnerPerfFileName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerPerfFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartnerPerfFileName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfFileName <em>Partner Perf File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Perf File Name</em>' attribute.
	 * @see #getPartnerPerfFileName()
	 * @generated
	 */
	void setPartnerPerfFileName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Perf Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Perf Scenario Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Perf Scenario Name</em>' attribute.
	 * @see #setPartnerPerfScenarioName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_PartnerPerfScenarioName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerPerfScenarioName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartnerPerfScenarioName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfScenarioName <em>Partner Perf Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Perf Scenario Name</em>' attribute.
	 * @see #getPartnerPerfScenarioName()
	 * @generated
	 */
	void setPartnerPerfScenarioName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Type</b></em>' attribute.
	 * The default value is <code>"SynchronousCall"</code>.
	 * The literals are from the enumeration {@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Type</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see #isSetPartnerType()
	 * @see #unsetPartnerType()
	 * @see #setPartnerType(PartnerTypeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_PartnerType()
	 * @model default="SynchronousCall" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='partnerType' namespace='##targetNamespace'"
	 * @generated
	 */
	PartnerTypeType getPartnerType();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Type</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see #isSetPartnerType()
	 * @see #unsetPartnerType()
	 * @see #getPartnerType()
	 * @generated
	 */
	void setPartnerType(PartnerTypeType value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType <em>Partner Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartnerType()
	 * @see #getPartnerType()
	 * @see #setPartnerType(PartnerTypeType)
	 * @generated
	 */
	void unsetPartnerType();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType <em>Partner Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Partner Type</em>' attribute is set.
	 * @see #unsetPartnerType()
	 * @see #getPartnerType()
	 * @see #setPartnerType(PartnerTypeType)
	 * @generated
	 */
	boolean isSetPartnerType();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #isSetProbability()
	 * @see #unsetProbability()
	 * @see #setProbability(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSynchroNodeType_Probability()
	 * @model unique="false" unsettable="true" dataType="Devices.ProbabilityType"
	 *        extendedMetaData="kind='attribute' name='Probability' namespace='##targetNamespace'"
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #isSetProbability()
	 * @see #unsetProbability()
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbability()
	 * @see #getProbability()
	 * @see #setProbability(float)
	 * @generated
	 */
	void unsetProbability();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability <em>Probability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probability</em>' attribute is set.
	 * @see #unsetProbability()
	 * @see #getProbability()
	 * @see #setProbability(float)
	 * @generated
	 */
	boolean isSetProbability();

        public void setDevicesNames(String[] names);
        
        public void setTotalResources(float[] totRes);
        
        public String[] getDevicesNames();
        
        public float[] getTotalResources();
        
        public float[] getWeightedTotalResources();
} // SynchroNodeType