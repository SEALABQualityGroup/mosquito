/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.util;

//ex DevicesValidator


import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import di.univaq.MOSQUITO.egQnMerger.EG.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * 
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage
 * @generated 
 */
public class DevicesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DevicesValidator INSTANCE = new DevicesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Devices";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return DevicesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case DevicesPackage.ARC_TYPE:
				return validateArcType((ArcType)value, diagnostics, context);
			case DevicesPackage.BASIC_NODE_TYPE:
				return validateBasicNodeType((BasicNodeType)value, diagnostics, context);
			case DevicesPackage.COMPOUND_NODE_TYPE:
				return validateCompoundNodeType((CompoundNodeType)value, diagnostics, context);
			case DevicesPackage.CPS_NODE_TYPE:
				return validateCPSNodeType((CPSNodeType)value, diagnostics, context);
			case DevicesPackage.DEVICES_TYPE:
				return validateDevicesType((DevicesType)value, diagnostics, context);
			case DevicesPackage.DEVICE_TYPE:
				return validateDeviceType((DeviceType)value, diagnostics, context);
			case DevicesPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DevicesPackage.EG_TYPE:
				return validateEGType((EGType)value, diagnostics, context);
			case DevicesPackage.EXPANDED_NODE_TYPE:
				return validateExpandedNodeType((ExpandedNodeType)value, diagnostics, context);
			case DevicesPackage.LINK_NODE_TYPE:
				return validateLinkNodeType((LinkNodeType)value, diagnostics, context);
			case DevicesPackage.OM_ELEMENT_TYPE:
				return validateOMElementType((OMElementType)value, diagnostics, context);
			case DevicesPackage.OVERHEAD_MATRIX_TYPE:
				return validateOverheadMatrixType((OverheadMatrixType)value, diagnostics, context);
			case DevicesPackage.PROCESSING_NODE_TYPE:
				return validateProcessingNodeType((ProcessingNodeType)value, diagnostics, context);
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE:
				return validateProcessingOverheadType((ProcessingOverheadType)value, diagnostics, context);
			case DevicesPackage.PROJECT_TYPE:
				return validateProjectType((ProjectType)value, diagnostics, context);
			case DevicesPackage.PS_TYPE:
				return validatePSType((PSType)value, diagnostics, context);
			case DevicesPackage.REP_NODE_TYPE:
				return validateRepNodeType((RepNodeType)value, diagnostics, context);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE:
				return validateResourceRequirementType((ResourceRequirementType)value, diagnostics, context);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE1:
				return validateResourceRequirementType1((ResourceRequirementType1)value, diagnostics, context);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE2:
				return validateResourceRequirementType2((ResourceRequirementType2)value, diagnostics, context);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3:
				return validateResourceRequirementType3((ResourceRequirementType3)value, diagnostics, context);
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE4:
				return validateResourceRequirementType4((ResourceRequirementType4)value, diagnostics, context);
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE:
				return validateSoftwareResourcesType((SoftwareResourcesType)value, diagnostics, context);
			case DevicesPackage.SOFTWARE_RESOURCE_TYPE:
				return validateSoftwareResourceType((SoftwareResourceType)value, diagnostics, context);
			case DevicesPackage.SYNCHRO_NODE_TYPE:
				return validateSynchroNodeType((SynchroNodeType)value, diagnostics, context);
			case DevicesPackage.DEVICE_FEATURE_TYPE:
				return validateDeviceFeatureType((DeviceFeatureType)value, diagnostics, context);
			case DevicesPackage.PARTNER_TYPE_TYPE:
				return validatePartnerTypeType((PartnerTypeType)value, diagnostics, context);
			case DevicesPackage.SCHEDULING_POLICY_TYPE:
				return validateSchedulingPolicyType((SchedulingPolicyType)value, diagnostics, context);
			case DevicesPackage.DEVICE_FEATURE_TYPE_OBJECT:
				return validateDeviceFeatureTypeObject((DeviceFeatureType)value, diagnostics, context);
			case DevicesPackage.DEVICE_NAME_TYPE:
				return validateDeviceNameType((String)value, diagnostics, context);
			case DevicesPackage.NONNEGATIVEFLOAT:
				return validateNonnegativefloat(((Float)value).floatValue(), diagnostics, context);
			case DevicesPackage.NONNEGATIVEFLOAT_OBJECT:
				return validateNonnegativefloatObject((Float)value, diagnostics, context);
			case DevicesPackage.PARTNER_TYPE_TYPE_OBJECT:
				return validatePartnerTypeTypeObject((PartnerTypeType)value, diagnostics, context);
			case DevicesPackage.POSITIVEFLOAT:
				return validatePositivefloat(((Float)value).floatValue(), diagnostics, context);
			case DevicesPackage.POSITIVEFLOAT_OBJECT:
				return validatePositivefloatObject((Float)value, diagnostics, context);
			case DevicesPackage.PROBABILITY_TYPE:
				return validateProbabilityType(((Float)value).floatValue(), diagnostics, context);
			case DevicesPackage.PROBABILITY_TYPE_OBJECT:
				return validateProbabilityTypeObject((Float)value, diagnostics, context);
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return validateSchedulingPolicyTypeObject((SchedulingPolicyType)value, diagnostics, context);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return validateServiceUnitsType((String)value, diagnostics, context);
			case DevicesPackage.SPE_PRIORITY_TYPE:
				return validateSPEPriorityType((BigInteger)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcType(ArcType arcType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(arcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicNodeType(BasicNodeType basicNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(basicNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundNodeType(CompoundNodeType compoundNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(compoundNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPSNodeType(CPSNodeType cpsNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(cpsNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevicesType(DevicesType devicesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(devicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceType(DeviceType deviceType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(deviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGType(EGType egType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(egType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpandedNodeType(ExpandedNodeType expandedNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(expandedNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkNodeType(LinkNodeType linkNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(linkNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMElementType(OMElementType omElementType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(omElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverheadMatrixType(OverheadMatrixType overheadMatrixType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(overheadMatrixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingNodeType(ProcessingNodeType processingNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(processingNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingOverheadType(ProcessingOverheadType processingOverheadType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(processingOverheadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectType(ProjectType projectType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(projectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSType(PSType psType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(psType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepNodeType(RepNodeType repNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(repNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequirementType(ResourceRequirementType resourceRequirementType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceRequirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequirementType1(ResourceRequirementType1 resourceRequirementType1, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceRequirementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequirementType2(ResourceRequirementType2 resourceRequirementType2, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceRequirementType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequirementType3(ResourceRequirementType3 resourceRequirementType3, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceRequirementType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequirementType4(ResourceRequirementType4 resourceRequirementType4, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(resourceRequirementType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareResourcesType(SoftwareResourcesType softwareResourcesType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(softwareResourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareResourceType(SoftwareResourceType softwareResourceType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(softwareResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchroNodeType(SynchroNodeType synchroNodeType, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(synchroNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceFeatureType(DeviceFeatureType deviceFeatureType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerTypeType(PartnerTypeType partnerTypeType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicyType(SchedulingPolicyType schedulingPolicyType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceFeatureTypeObject(DeviceFeatureType deviceFeatureTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceNameType(String deviceNameType, DiagnosticChain diagnostics, Map context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(deviceNameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeviceNameType_MaxLength(deviceNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Device Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceNameType_MaxLength(String deviceNameType, DiagnosticChain diagnostics, Map context) {
		int length = deviceNameType.length();  
		boolean result = length <= 32;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(DevicesPackage.Literals.DEVICE_NAME_TYPE, deviceNameType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonnegativefloat(float nonnegativefloat, DiagnosticChain diagnostics, Map context) {
		boolean result = validateNonnegativefloat_Min(nonnegativefloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonnegativefloat_Min
	 */
	public static final float NONNEGATIVEFLOAT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Nonnegativefloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonnegativefloat_Min(float nonnegativefloat, DiagnosticChain diagnostics, Map context) {
		boolean result = nonnegativefloat >= NONNEGATIVEFLOAT__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(DevicesPackage.Literals.NONNEGATIVEFLOAT, new Float(nonnegativefloat), new Float(NONNEGATIVEFLOAT__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonnegativefloatObject(Float nonnegativefloatObject, DiagnosticChain diagnostics, Map context) {
		boolean result = validateNonnegativefloat_Min(nonnegativefloatObject.floatValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerTypeTypeObject(PartnerTypeType partnerTypeTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositivefloat(float positivefloat, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePositivefloat_Min(positivefloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositivefloat_Min
	 */
	public static final float POSITIVEFLOAT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Positivefloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositivefloat_Min(float positivefloat, DiagnosticChain diagnostics, Map context) {
		boolean result = positivefloat >= POSITIVEFLOAT__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(DevicesPackage.Literals.POSITIVEFLOAT, new Float(positivefloat), new Float(POSITIVEFLOAT__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositivefloatObject(Float positivefloatObject, DiagnosticChain diagnostics, Map context) {
		boolean result = validatePositivefloat_Min(positivefloatObject.floatValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilityType(float probabilityType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateProbabilityType_Min(probabilityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbabilityType_Max(probabilityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProbabilityType_Min
	 */
	public static final float PROBABILITY_TYPE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Probability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilityType_Min(float probabilityType, DiagnosticChain diagnostics, Map context) {
		boolean result = probabilityType >= PROBABILITY_TYPE__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(DevicesPackage.Literals.PROBABILITY_TYPE, new Float(probabilityType), new Float(PROBABILITY_TYPE__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProbabilityType_Max
	 */
	public static final float PROBABILITY_TYPE__MAX__VALUE = 1.0F;

	/**
	 * Validates the Max constraint of '<em>Probability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilityType_Max(float probabilityType, DiagnosticChain diagnostics, Map context) {
		boolean result = probabilityType <= PROBABILITY_TYPE__MAX__VALUE;
		if (!result && diagnostics != null) 
			reportMaxViolation(DevicesPackage.Literals.PROBABILITY_TYPE, new Float(probabilityType), new Float(PROBABILITY_TYPE__MAX__VALUE), true, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilityTypeObject(Float probabilityTypeObject, DiagnosticChain diagnostics, Map context) {
		boolean result = validateProbabilityType_Min(probabilityTypeObject.floatValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateProbabilityType_Max(probabilityTypeObject.floatValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicyTypeObject(SchedulingPolicyType schedulingPolicyTypeObject, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceUnitsType(String serviceUnitsType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateServiceUnitsType_MaxLength(serviceUnitsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Service Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceUnitsType_MaxLength(String serviceUnitsType, DiagnosticChain diagnostics, Map context) {
		int length = serviceUnitsType.length();  
		boolean result = length <= 8;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(DevicesPackage.Literals.SERVICE_UNITS_TYPE, serviceUnitsType, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPEPriorityType(BigInteger spePriorityType, DiagnosticChain diagnostics, Map context) {
		boolean result = validateSPEPriorityType_Min(spePriorityType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSPEPriorityType_Max(spePriorityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSPEPriorityType_Min
	 */
	public static final BigInteger SPE_PRIORITY_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>SPE Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPEPriorityType_Min(BigInteger spePriorityType, DiagnosticChain diagnostics, Map context) {
		boolean result = spePriorityType.compareTo(SPE_PRIORITY_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null) 
			reportMinViolation(DevicesPackage.Literals.SPE_PRIORITY_TYPE, spePriorityType, SPE_PRIORITY_TYPE__MIN__VALUE, true, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSPEPriorityType_Max
	 */
	public static final BigInteger SPE_PRIORITY_TYPE__MAX__VALUE = new BigInteger("15");

	/**
	 * Validates the Max constraint of '<em>SPE Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSPEPriorityType_Max(BigInteger spePriorityType, DiagnosticChain diagnostics, Map context) {
		boolean result = spePriorityType.compareTo(SPE_PRIORITY_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null) 
			reportMaxViolation(DevicesPackage.Literals.SPE_PRIORITY_TYPE, spePriorityType, SPE_PRIORITY_TYPE__MAX__VALUE, true, diagnostics, context);
		return result; 
	}

} //DevicesValidator
