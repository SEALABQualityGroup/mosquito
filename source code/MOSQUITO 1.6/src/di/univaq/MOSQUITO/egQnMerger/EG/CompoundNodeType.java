/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getSplitNode <em>Split Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getPardoNode <em>Pardo Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getCaseNode <em>Case Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getRepetitionNode <em>Repetition Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getNodeName <em>Node Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType()
 * @model extendedMetaData="name='CompoundNode_type' kind='elementOnly'"
 * @generated
 */
public interface CompoundNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Split Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Node</em>' containment reference.
	 * @see #setSplitNode(CPSNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_SplitNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SplitNode' namespace='##targetNamespace'"
	 * @generated
	 */
	CPSNodeType getSplitNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getSplitNode <em>Split Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Node</em>' containment reference.
	 * @see #getSplitNode()
	 * @generated
	 */
	void setSplitNode(CPSNodeType value);

	/**
	 * Returns the value of the '<em><b>Pardo Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pardo Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pardo Node</em>' containment reference.
	 * @see #setPardoNode(CPSNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_PardoNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PardoNode' namespace='##targetNamespace'"
	 * @generated
	 */
	CPSNodeType getPardoNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getPardoNode <em>Pardo Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pardo Node</em>' containment reference.
	 * @see #getPardoNode()
	 * @generated
	 */
	void setPardoNode(CPSNodeType value);

	/**
	 * Returns the value of the '<em><b>Case Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Node</em>' containment reference.
	 * @see #setCaseNode(CPSNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_CaseNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CaseNode' namespace='##targetNamespace'"
	 * @generated
	 */
	CPSNodeType getCaseNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getCaseNode <em>Case Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Node</em>' containment reference.
	 * @see #getCaseNode()
	 * @generated
	 */
	void setCaseNode(CPSNodeType value);

	/**
	 * Returns the value of the '<em><b>Repetition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Node</em>' containment reference.
	 * @see #setRepetitionNode(RepNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_RepetitionNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RepetitionNode' namespace='##targetNamespace'"
	 * @generated
	 */
	RepNodeType getRepetitionNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getRepetitionNode <em>Repetition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Node</em>' containment reference.
	 * @see #getRepetitionNode()
	 * @generated
	 */
	void setRepetitionNode(RepNodeType value);

	/**
	 * Returns the value of the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Requirement</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_ResourceRequirement()
	 * @model type="Devices.ResourceRequirementType" containment="true"
	 *        extendedMetaData="kind='element' name='ResourceRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getResourceRequirement();

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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCompoundNodeType_NodeName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='NodeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

        public void setDevicesNames(String[] names);
        
        public void setTotalResources(float[] totRes);
        
        public String[] getDevicesNames();
        
        public float[] getTotalResources();
        
} // CompoundNodeType