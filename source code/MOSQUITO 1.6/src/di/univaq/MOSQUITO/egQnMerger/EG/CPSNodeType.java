/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPS Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getGroup <em>Group</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getResourceRequirement <em>Resource Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType()
 * @model extendedMetaData="name='CPSNode_type' kind='elementOnly'"
 * @generated
 */
public interface CPSNodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Basic Node</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Node</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_BasicNode()
	 * @model type="Devices.BasicNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BasicNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getBasicNode();

	/**
	 * Returns the value of the '<em><b>Expanded Node</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expanded Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded Node</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_ExpandedNode()
	 * @model type="Devices.ExpandedNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExpandedNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getExpandedNode();

	/**
	 * Returns the value of the '<em><b>Link Node</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Node</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_LinkNode()
	 * @model type="Devices.LinkNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinkNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getLinkNode();

	/**
	 * Returns the value of the '<em><b>Synchronization Node</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Node</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_SynchronizationNode()
	 * @model type="Devices.SynchroNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SynchronizationNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getSynchronizationNode();

	/**
	 * Returns the value of the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Requirement</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getCPSNodeType_ResourceRequirement()
	 * @model type="Devices.ResourceRequirementType2" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceRequirement' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getResourceRequirement();

        public void setDevicesNames(String[] names);
        
        public void setTotalResources(float[] totRes);
        
        public String[] getDevicesNames();
        
        public float[] getTotalResources();
} // CPSNodeType