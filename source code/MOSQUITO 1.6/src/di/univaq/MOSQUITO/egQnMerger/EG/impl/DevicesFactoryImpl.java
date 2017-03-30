/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;

//ex DevicesFactoryImpl


import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import di.univaq.MOSQUITO.egQnMerger.EG.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicesFactoryImpl extends EFactoryImpl implements DevicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevicesFactory init() {
		try {
			DevicesFactory theDevicesFactory = (DevicesFactory)EPackage.Registry.INSTANCE.getEFactory("file:/C:/LabProgInt/ProveEMF/xsd/Devices.xsd"); 
			if (theDevicesFactory != null) {
				return theDevicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DevicesPackage.ARC_TYPE: return createArcType();
			case DevicesPackage.BASIC_NODE_TYPE: return createBasicNodeType();
			case DevicesPackage.COMPOUND_NODE_TYPE: return createCompoundNodeType();
			case DevicesPackage.CPS_NODE_TYPE: return createCPSNodeType();
			case DevicesPackage.DEVICES_TYPE: return createDevicesType();
			case DevicesPackage.DEVICE_TYPE: return createDeviceType();
			case DevicesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DevicesPackage.EG_TYPE: return createEGType();
			case DevicesPackage.EXPANDED_NODE_TYPE: return createExpandedNodeType();
			case DevicesPackage.LINK_NODE_TYPE: return createLinkNodeType();
			case DevicesPackage.OM_ELEMENT_TYPE: return createOMElementType();
			case DevicesPackage.OVERHEAD_MATRIX_TYPE: return createOverheadMatrixType();
			case DevicesPackage.PROCESSING_NODE_TYPE: return createProcessingNodeType();
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE: return createProcessingOverheadType();
			case DevicesPackage.PROJECT_TYPE: return createProjectType();
			case DevicesPackage.PS_TYPE: return createPSType();
			case DevicesPackage.REP_NODE_TYPE: return createRepNodeType();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE: return createResourceRequirementType();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE1: return createResourceRequirementType1();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE2: return createResourceRequirementType2();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3: return createResourceRequirementType3();
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE4: return createResourceRequirementType4();
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE: return createSoftwareResourcesType();
			case DevicesPackage.SOFTWARE_RESOURCE_TYPE: return createSoftwareResourceType();
			case DevicesPackage.SYNCHRO_NODE_TYPE: return createSynchroNodeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DevicesPackage.DEVICE_FEATURE_TYPE:
				return createDeviceFeatureTypeFromString(eDataType, initialValue);
			case DevicesPackage.PARTNER_TYPE_TYPE:
				return createPartnerTypeTypeFromString(eDataType, initialValue);
			case DevicesPackage.SCHEDULING_POLICY_TYPE:
				return createSchedulingPolicyTypeFromString(eDataType, initialValue);
			case DevicesPackage.DEVICE_FEATURE_TYPE_OBJECT:
				return createDeviceFeatureTypeObjectFromString(eDataType, initialValue);
			case DevicesPackage.DEVICE_NAME_TYPE:
				return createDeviceNameTypeFromString(eDataType, initialValue);
			case DevicesPackage.NONNEGATIVEFLOAT:
				return createNonnegativefloatFromString(eDataType, initialValue);
			case DevicesPackage.NONNEGATIVEFLOAT_OBJECT:
				return createNonnegativefloatObjectFromString(eDataType, initialValue);
			case DevicesPackage.PARTNER_TYPE_TYPE_OBJECT:
				return createPartnerTypeTypeObjectFromString(eDataType, initialValue);
			case DevicesPackage.POSITIVEFLOAT:
				return createPositivefloatFromString(eDataType, initialValue);
			case DevicesPackage.POSITIVEFLOAT_OBJECT:
				return createPositivefloatObjectFromString(eDataType, initialValue);
			case DevicesPackage.PROBABILITY_TYPE:
				return createProbabilityTypeFromString(eDataType, initialValue);
			case DevicesPackage.PROBABILITY_TYPE_OBJECT:
				return createProbabilityTypeObjectFromString(eDataType, initialValue);
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return createSchedulingPolicyTypeObjectFromString(eDataType, initialValue);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return createServiceUnitsTypeFromString(eDataType, initialValue);
			case DevicesPackage.SPE_PRIORITY_TYPE:
				return createSPEPriorityTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DevicesPackage.DEVICE_FEATURE_TYPE:
				return convertDeviceFeatureTypeToString(eDataType, instanceValue);
			case DevicesPackage.PARTNER_TYPE_TYPE:
				return convertPartnerTypeTypeToString(eDataType, instanceValue);
			case DevicesPackage.SCHEDULING_POLICY_TYPE:
				return convertSchedulingPolicyTypeToString(eDataType, instanceValue);
			case DevicesPackage.DEVICE_FEATURE_TYPE_OBJECT:
				return convertDeviceFeatureTypeObjectToString(eDataType, instanceValue);
			case DevicesPackage.DEVICE_NAME_TYPE:
				return convertDeviceNameTypeToString(eDataType, instanceValue);
			case DevicesPackage.NONNEGATIVEFLOAT:
				return convertNonnegativefloatToString(eDataType, instanceValue);
			case DevicesPackage.NONNEGATIVEFLOAT_OBJECT:
				return convertNonnegativefloatObjectToString(eDataType, instanceValue);
			case DevicesPackage.PARTNER_TYPE_TYPE_OBJECT:
				return convertPartnerTypeTypeObjectToString(eDataType, instanceValue);
			case DevicesPackage.POSITIVEFLOAT:
				return convertPositivefloatToString(eDataType, instanceValue);
			case DevicesPackage.POSITIVEFLOAT_OBJECT:
				return convertPositivefloatObjectToString(eDataType, instanceValue);
			case DevicesPackage.PROBABILITY_TYPE:
				return convertProbabilityTypeToString(eDataType, instanceValue);
			case DevicesPackage.PROBABILITY_TYPE_OBJECT:
				return convertProbabilityTypeObjectToString(eDataType, instanceValue);
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return convertSchedulingPolicyTypeObjectToString(eDataType, instanceValue);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return convertServiceUnitsTypeToString(eDataType, instanceValue);
			case DevicesPackage.SPE_PRIORITY_TYPE:
				return convertSPEPriorityTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNodeType createBasicNodeType() {
		BasicNodeTypeImpl basicNodeType = new BasicNodeTypeImpl();
		return basicNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundNodeType createCompoundNodeType() {
		CompoundNodeTypeImpl compoundNodeType = new CompoundNodeTypeImpl();
		return compoundNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSNodeType createCPSNodeType() {
		CPSNodeTypeImpl cpsNodeType = new CPSNodeTypeImpl();
		return cpsNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesType createDevicesType() {
		DevicesTypeImpl devicesType = new DevicesTypeImpl();
		return devicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceType() {
		DeviceTypeImpl deviceType = new DeviceTypeImpl();
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGType createEGType() {
		EGTypeImpl egType = new EGTypeImpl();
		return egType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedNodeType createExpandedNodeType() {
		ExpandedNodeTypeImpl expandedNodeType = new ExpandedNodeTypeImpl();
		return expandedNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkNodeType createLinkNodeType() {
		LinkNodeTypeImpl linkNodeType = new LinkNodeTypeImpl();
		return linkNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMElementType createOMElementType() {
		OMElementTypeImpl omElementType = new OMElementTypeImpl();
		return omElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadMatrixType createOverheadMatrixType() {
		OverheadMatrixTypeImpl overheadMatrixType = new OverheadMatrixTypeImpl();
		return overheadMatrixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeType createProcessingNodeType() {
		ProcessingNodeTypeImpl processingNodeType = new ProcessingNodeTypeImpl();
		return processingNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingOverheadType createProcessingOverheadType() {
		ProcessingOverheadTypeImpl processingOverheadType = new ProcessingOverheadTypeImpl();
		return processingOverheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType createProjectType() {
		ProjectTypeImpl projectType = new ProjectTypeImpl();
		return projectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSType createPSType() {
		PSTypeImpl psType = new PSTypeImpl();
		return psType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepNodeType createRepNodeType() {
		RepNodeTypeImpl repNodeType = new RepNodeTypeImpl();
		return repNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirementType createResourceRequirementType() {
		ResourceRequirementTypeImpl resourceRequirementType = new ResourceRequirementTypeImpl();
		return resourceRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirementType1 createResourceRequirementType1() {
		ResourceRequirementType1Impl resourceRequirementType1 = new ResourceRequirementType1Impl();
		return resourceRequirementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirementType2 createResourceRequirementType2() {
		ResourceRequirementType2Impl resourceRequirementType2 = new ResourceRequirementType2Impl();
		return resourceRequirementType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirementType3 createResourceRequirementType3() {
		ResourceRequirementType3Impl resourceRequirementType3 = new ResourceRequirementType3Impl();
		return resourceRequirementType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirementType4 createResourceRequirementType4() {
		ResourceRequirementType4Impl resourceRequirementType4 = new ResourceRequirementType4Impl();
		return resourceRequirementType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResourcesType createSoftwareResourcesType() {
		SoftwareResourcesTypeImpl softwareResourcesType = new SoftwareResourcesTypeImpl();
		return softwareResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResourceType createSoftwareResourceType() {
		SoftwareResourceTypeImpl softwareResourceType = new SoftwareResourceTypeImpl();
		return softwareResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchroNodeType createSynchroNodeType() {
		SynchroNodeTypeImpl synchroNodeType = new SynchroNodeTypeImpl();
		return synchroNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFeatureType createDeviceFeatureTypeFromString(EDataType eDataType, String initialValue) {
		DeviceFeatureType result = DeviceFeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerTypeType createPartnerTypeTypeFromString(EDataType eDataType, String initialValue) {
		PartnerTypeType result = PartnerTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartnerTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyType createSchedulingPolicyTypeFromString(EDataType eDataType, String initialValue) {
		SchedulingPolicyType result = SchedulingPolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFeatureType createDeviceFeatureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (DeviceFeatureType)createDeviceFeatureTypeFromString(DevicesPackage.Literals.DEVICE_FEATURE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceFeatureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceFeatureTypeToString(DevicesPackage.Literals.DEVICE_FEATURE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDeviceNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonnegativefloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonnegativefloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonnegativefloatObjectFromString(EDataType eDataType, String initialValue) {
		return (Float)createNonnegativefloatFromString(DevicesPackage.Literals.NONNEGATIVEFLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonnegativefloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonnegativefloatToString(DevicesPackage.Literals.NONNEGATIVEFLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerTypeType createPartnerTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (PartnerTypeType)createPartnerTypeTypeFromString(DevicesPackage.Literals.PARTNER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartnerTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPartnerTypeTypeToString(DevicesPackage.Literals.PARTNER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositivefloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositivefloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositivefloatObjectFromString(EDataType eDataType, String initialValue) {
		return (Float)createPositivefloatFromString(DevicesPackage.Literals.POSITIVEFLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositivefloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositivefloatToString(DevicesPackage.Literals.POSITIVEFLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createProbabilityTypeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createProbabilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (Float)createProbabilityTypeFromString(DevicesPackage.Literals.PROBABILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProbabilityTypeToString(DevicesPackage.Literals.PROBABILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyType createSchedulingPolicyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (SchedulingPolicyType)createSchedulingPolicyTypeFromString(DevicesPackage.Literals.SCHEDULING_POLICY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingPolicyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchedulingPolicyTypeToString(DevicesPackage.Literals.SCHEDULING_POLICY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceUnitsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceUnitsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSPEPriorityTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPEPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesPackage getDevicesPackage() {
		return (DevicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static DevicesPackage getPackage() {
		return DevicesPackage.eINSTANCE;
	}

} //DevicesFactoryImpl
