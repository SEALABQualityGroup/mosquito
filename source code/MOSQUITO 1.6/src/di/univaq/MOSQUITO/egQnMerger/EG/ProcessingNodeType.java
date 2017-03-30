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
 * A representation of the model object '<em><b>Processing Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingNodeType()
 * @model extendedMetaData="name='ProcessingNode_type' kind='empty'"
 * @generated
 */
public interface ProcessingNodeType extends EObject {
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingNodeType_NodeName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='NodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingNodeType_Probability()
	 * @model unique="false" unsettable="true" dataType="Devices.ProbabilityType"
	 *        extendedMetaData="kind='attribute' name='Probability' namespace='##targetNamespace'"
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability <em>Probability</em>}' attribute.
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
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbability()
	 * @see #getProbability()
	 * @see #setProbability(float)
	 * @generated
	 */
	void unsetProbability();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability <em>Probability</em>}' attribute is set.
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
        
        public float[] getTotalResources();
} // ProcessingNodeType