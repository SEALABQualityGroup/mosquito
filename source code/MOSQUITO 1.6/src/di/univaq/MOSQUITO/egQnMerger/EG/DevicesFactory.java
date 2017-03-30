/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

//ex DevicesFactory

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage
 * @generated
 */
public interface DevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicesFactory eINSTANCE = di.univaq.MOSQUITO.egQnMerger.EG.impl.DevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Type</em>'.
	 * @generated
	 */
	ArcType createArcType();

	/**
	 * Returns a new object of class '<em>Basic Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Node Type</em>'.
	 * @generated
	 */
	BasicNodeType createBasicNodeType();

	/**
	 * Returns a new object of class '<em>Compound Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Node Type</em>'.
	 * @generated
	 */
	CompoundNodeType createCompoundNodeType();

	/**
	 * Returns a new object of class '<em>CPS Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPS Node Type</em>'.
	 * @generated
	 */
	CPSNodeType createCPSNodeType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	DevicesType createDevicesType();

	/**
	 * Returns a new object of class '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type</em>'.
	 * @generated
	 */
	DeviceType createDeviceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>EG Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EG Type</em>'.
	 * @generated
	 */
	EGType createEGType();

	/**
	 * Returns a new object of class '<em>Expanded Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expanded Node Type</em>'.
	 * @generated
	 */
	ExpandedNodeType createExpandedNodeType();

	/**
	 * Returns a new object of class '<em>Link Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Node Type</em>'.
	 * @generated
	 */
	LinkNodeType createLinkNodeType();

	/**
	 * Returns a new object of class '<em>OM Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OM Element Type</em>'.
	 * @generated
	 */
	OMElementType createOMElementType();

	/**
	 * Returns a new object of class '<em>Overhead Matrix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overhead Matrix Type</em>'.
	 * @generated
	 */
	OverheadMatrixType createOverheadMatrixType();

	/**
	 * Returns a new object of class '<em>Processing Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Node Type</em>'.
	 * @generated
	 */
	ProcessingNodeType createProcessingNodeType();

	/**
	 * Returns a new object of class '<em>Processing Overhead Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Overhead Type</em>'.
	 * @generated
	 */
	ProcessingOverheadType createProcessingOverheadType();

	/**
	 * Returns a new object of class '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Type</em>'.
	 * @generated
	 */
	ProjectType createProjectType();

	/**
	 * Returns a new object of class '<em>PS Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Type</em>'.
	 * @generated
	 */
	PSType createPSType();

	/**
	 * Returns a new object of class '<em>Rep Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rep Node Type</em>'.
	 * @generated
	 */
	RepNodeType createRepNodeType();

	/**
	 * Returns a new object of class '<em>Resource Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement Type</em>'.
	 * @generated
	 */
	ResourceRequirementType createResourceRequirementType();

	/**
	 * Returns a new object of class '<em>Resource Requirement Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement Type1</em>'.
	 * @generated
	 */
	ResourceRequirementType1 createResourceRequirementType1();

	/**
	 * Returns a new object of class '<em>Resource Requirement Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement Type2</em>'.
	 * @generated
	 */
	ResourceRequirementType2 createResourceRequirementType2();

	/**
	 * Returns a new object of class '<em>Resource Requirement Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement Type3</em>'.
	 * @generated
	 */
	ResourceRequirementType3 createResourceRequirementType3();

	/**
	 * Returns a new object of class '<em>Resource Requirement Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement Type4</em>'.
	 * @generated
	 */
	ResourceRequirementType4 createResourceRequirementType4();

	/**
	 * Returns a new object of class '<em>Software Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resources Type</em>'.
	 * @generated
	 */
	SoftwareResourcesType createSoftwareResourcesType();

	/**
	 * Returns a new object of class '<em>Software Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resource Type</em>'.
	 * @generated
	 */
	SoftwareResourceType createSoftwareResourceType();

	/**
	 * Returns a new object of class '<em>Synchro Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchro Node Type</em>'.
	 * @generated
	 */
	SynchroNodeType createSynchroNodeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicesPackage getDevicesPackage();

} //DevicesFactory
