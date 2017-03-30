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
 * A representation of the model object '<em><b>Rep Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor <em>Repetition Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType()
 * @model extendedMetaData="name='RepNode_type' kind='elementOnly'"
 * @generated
 */
public interface RepNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Node</em>' containment reference.
	 * @see #setBasicNode(BasicNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_BasicNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BasicNode' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicNodeType getBasicNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getBasicNode <em>Basic Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Node</em>' containment reference.
	 * @see #getBasicNode()
	 * @generated
	 */
	void setBasicNode(BasicNodeType value);

	/**
	 * Returns the value of the '<em><b>Expanded Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expanded Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded Node</em>' containment reference.
	 * @see #setExpandedNode(ExpandedNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_ExpandedNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExpandedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeType getExpandedNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getExpandedNode <em>Expanded Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded Node</em>' containment reference.
	 * @see #getExpandedNode()
	 * @generated
	 */
	void setExpandedNode(ExpandedNodeType value);

	/**
	 * Returns the value of the '<em><b>Link Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Node</em>' containment reference.
	 * @see #setLinkNode(LinkNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_LinkNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LinkNode' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkNodeType getLinkNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getLinkNode <em>Link Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Node</em>' containment reference.
	 * @see #getLinkNode()
	 * @generated
	 */
	void setLinkNode(LinkNodeType value);

	/**
	 * Returns the value of the '<em><b>Synchronization Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Node</em>' containment reference.
	 * @see #setSynchronizationNode(SynchroNodeType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_SynchronizationNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SynchronizationNode' namespace='##targetNamespace'"
	 * @generated
	 */
	SynchroNodeType getSynchronizationNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getSynchronizationNode <em>Synchronization Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Node</em>' containment reference.
	 * @see #getSynchronizationNode()
	 * @generated
	 */
	void setSynchronizationNode(SynchroNodeType value);

	/**
	 * Returns the value of the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Requirement</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_ResourceRequirement()
	 * @model type="Devices.ResourceRequirementType1" containment="true"
	 *        extendedMetaData="kind='element' name='ResourceRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getResourceRequirement();

	/**
	 * Returns the value of the '<em><b>Repetition Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Factor</em>' attribute.
	 * @see #isSetRepetitionFactor()
	 * @see #unsetRepetitionFactor()
	 * @see #setRepetitionFactor(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getRepNodeType_RepetitionFactor()
	 * @model unique="false" unsettable="true" dataType="Devices.Positivefloat" required="true"
	 *        extendedMetaData="kind='attribute' name='RepetitionFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	float getRepetitionFactor();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor <em>Repetition Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Factor</em>' attribute.
	 * @see #isSetRepetitionFactor()
	 * @see #unsetRepetitionFactor()
	 * @see #getRepetitionFactor()
	 * @generated
	 */
	void setRepetitionFactor(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor <em>Repetition Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepetitionFactor()
	 * @see #getRepetitionFactor()
	 * @see #setRepetitionFactor(float)
	 * @generated
	 */
	void unsetRepetitionFactor();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor <em>Repetition Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repetition Factor</em>' attribute is set.
	 * @see #unsetRepetitionFactor()
	 * @see #getRepetitionFactor()
	 * @see #setRepetitionFactor(float)
	 * @generated
	 */
	boolean isSetRepetitionFactor();

        public void setDevicesNames(String[] names);
        
        public void setTotalResources(float[] totRes);
        
        public String[] getDevicesNames();
        
        public float[] getTotalResources();
} // RepNodeType