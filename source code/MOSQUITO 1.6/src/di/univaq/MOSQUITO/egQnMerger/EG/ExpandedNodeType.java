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
 * A representation of the model object '<em><b>Expanded Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getEGname <em>EGname</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getExpandedNodeType()
 * @model extendedMetaData="name='ExpandedNode_type' kind='empty'"
 * @generated
 */
public interface ExpandedNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>EGname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGname</em>' attribute.
	 * @see #setEGname(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getExpandedNodeType_EGname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='EGname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEGname();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getEGname <em>EGname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGname</em>' attribute.
	 * @see #getEGname()
	 * @generated
	 */
	void setEGname(String value);

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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getExpandedNodeType_NodeName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='NodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getNodeName <em>Node Name</em>}' attribute.
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getExpandedNodeType_Probability()
	 * @model unique="false" unsettable="true" dataType="Devices.ProbabilityType"
	 *        extendedMetaData="kind='attribute' name='Probability' namespace='##targetNamespace'"
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability <em>Probability</em>}' attribute.
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
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbability()
	 * @see #getProbability()
	 * @see #setProbability(float)
	 * @generated
	 */
	void unsetProbability();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability <em>Probability</em>}' attribute is set.
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
        
        public void setDerivedResources(float[] derivedRes);
        
        public String[] getDevicesNames();
        
        public float[] getDerivedResources();
        
        public float[] getWeightedDerivedResources();
} // ExpandedNodeType