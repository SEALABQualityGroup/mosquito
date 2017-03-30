/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.Devices.util;


import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import di.univaq.MOSQUITO.egQnMerger.Devices.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
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
			case DevicesPackage.DEVICES_TYPE:
				return validateDevicesType((DevicesType)value, diagnostics, context);
			case DevicesPackage.DEVICE_TYPE:
				return validateDeviceType((DeviceType)value, diagnostics, context);
			case DevicesPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DevicesPackage.DEVICE_FEATURE_TYPE:
				return validateDeviceFeatureType((DeviceFeatureType)value, diagnostics, context);
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
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return validateSchedulingPolicyTypeObject((SchedulingPolicyType)value, diagnostics, context);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return validateServiceUnitsType((String)value, diagnostics, context);
			default: 
				return true;
		}
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
	public boolean validateDeviceFeatureType(DeviceFeatureType deviceFeatureType, DiagnosticChain diagnostics, Map context) {
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

} //DevicesValidator
