/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.*;


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
			case DevicesPackage.DEVICES_TYPE: return createDevicesType();
			case DevicesPackage.DEVICE_TYPE: return createDeviceType();
			case DevicesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DevicesPackage.OM_ELEMENT_TYPE: return createOMElementType();
			case DevicesPackage.OVERHEAD_MATRIX_TYPE: return createOverheadMatrixType();
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE: return createProcessingOverheadType();
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE: return createSoftwareResourcesType();
			case DevicesPackage.SOFTWARE_RESOURCE_TYPE: return createSoftwareResourceType();
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
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return createSchedulingPolicyTypeObjectFromString(eDataType, initialValue);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return createServiceUnitsTypeFromString(eDataType, initialValue);
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
			case DevicesPackage.SCHEDULING_POLICY_TYPE_OBJECT:
				return convertSchedulingPolicyTypeObjectToString(eDataType, instanceValue);
			case DevicesPackage.SERVICE_UNITS_TYPE:
				return convertServiceUnitsTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public ProcessingOverheadType createProcessingOverheadType() {
		ProcessingOverheadTypeImpl processingOverheadType = new ProcessingOverheadTypeImpl();
		return processingOverheadType;
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
