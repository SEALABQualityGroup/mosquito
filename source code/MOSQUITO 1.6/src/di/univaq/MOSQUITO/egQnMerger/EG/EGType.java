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
 * A representation of the model object '<em><b>EG Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getGroup <em>Group</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getBasicNode <em>Basic Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getExpandedNode <em>Expanded Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getLinkNode <em>Link Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSynchronizationNode <em>Synchronization Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getResourceRequirement <em>Resource Requirement</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getCompoundNode <em>Compound Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getArc <em>Arc</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getEGname <em>EGname</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG <em>Is Main EG</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getModificationDateTime <em>Modification Date Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getStartNode <em>Start Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSWmodelname <em>SWmodelname</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType()
 * @model extendedMetaData="name='EG_type' kind='elementOnly'"
 * @generated
 */
public interface EGType extends EObject {
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_Group()
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_BasicNode()
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_ExpandedNode()
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_LinkNode()
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_SynchronizationNode()
	 * @model type="Devices.SynchroNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SynchronizationNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getSynchronizationNode();

	/**
	 * Returns the value of the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Requirement</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_ResourceRequirement()
	 * @model type="Devices.ResourceRequirementType4" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceRequirement' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getResourceRequirement();

	/**
	 * Returns the value of the '<em><b>Compound Node</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Node</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_CompoundNode()
	 * @model type="Devices.CompoundNodeType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundNode' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList getCompoundNode();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_Arc()
	 * @model type="Devices.ArcType" containment="true"
	 *        extendedMetaData="kind='element' name='Arc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getArc();

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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_EGname()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='EGname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEGname();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getEGname <em>EGname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGname</em>' attribute.
	 * @see #getEGname()
	 * @generated
	 */
	void setEGname(String value);

	/**
	 * Returns the value of the '<em><b>Is Main EG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main EG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main EG</em>' attribute.
	 * @see #isSetIsMainEG()
	 * @see #unsetIsMainEG()
	 * @see #setIsMainEG(boolean)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_IsMainEG()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='IsMainEG' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsMainEG();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG <em>Is Main EG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main EG</em>' attribute.
	 * @see #isSetIsMainEG()
	 * @see #unsetIsMainEG()
	 * @see #isIsMainEG()
	 * @generated
	 */
	void setIsMainEG(boolean value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG <em>Is Main EG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMainEG()
	 * @see #isIsMainEG()
	 * @see #setIsMainEG(boolean)
	 * @generated
	 */
	void unsetIsMainEG();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG <em>Is Main EG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Main EG</em>' attribute is set.
	 * @see #unsetIsMainEG()
	 * @see #isIsMainEG()
	 * @see #setIsMainEG(boolean)
	 * @generated
	 */
	boolean isSetIsMainEG();

	/**
	 * Returns the value of the '<em><b>Modification Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date Time</em>' attribute.
	 * @see #setModificationDateTime(Object)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_ModificationDateTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='ModificationDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getModificationDateTime();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getModificationDateTime <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date Time</em>' attribute.
	 * @see #getModificationDateTime()
	 * @generated
	 */
	void setModificationDateTime(Object value);

	/**
	 * Returns the value of the '<em><b>Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Node</em>' attribute.
	 * @see #setStartNode(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_StartNode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='StartNode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getStartNode <em>Start Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Node</em>' attribute.
	 * @see #getStartNode()
	 * @generated
	 */
	void setStartNode(String value);

	/**
	 * Returns the value of the '<em><b>SWmodelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SWmodelname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SWmodelname</em>' attribute.
	 * @see #setSWmodelname(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getEGType_SWmodelname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SWmodelname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSWmodelname();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSWmodelname <em>SWmodelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SWmodelname</em>' attribute.
	 * @see #getSWmodelname()
	 * @generated
	 */
	void setSWmodelname(String value);

} // EGType