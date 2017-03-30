/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface DevicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Devices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/LabProgInt/ProveEMF/xsd/Devices.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Devices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicesPackage eINSTANCE = di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl.DevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDevicesType()
	 * @generated
	 */
	int DEVICES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_TYPE__DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl <em>Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Device Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__DEVICE_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__DEVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__SCHEDULING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__SERVICE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Service Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__SERVICE_UNITS = 5;

	/**
	 * The number of structural features of the '<em>Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DocumentRootImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEVICES = 3;

	/**
	 * The feature id for the '<em><b>Processing Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESSING_OVERHEAD = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl <em>OM Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getOMElementType()
	 * @generated
	 */
	int OM_ELEMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Amount Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_ELEMENT_TYPE__DEVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_ELEMENT_TYPE__RESOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>OM Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_ELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OverheadMatrixTypeImpl <em>Overhead Matrix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.OverheadMatrixTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getOverheadMatrixType()
	 * @generated
	 */
	int OVERHEAD_MATRIX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>OM Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_MATRIX_TYPE__OM_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Overhead Matrix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_MATRIX_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl <em>Processing Overhead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProcessingOverheadType()
	 * @generated
	 */
	int PROCESSING_OVERHEAD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Software Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_OVERHEAD_TYPE__DEVICES = 1;

	/**
	 * The feature id for the '<em><b>Overhead Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX = 2;

	/**
	 * The number of structural features of the '<em>Processing Overhead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_OVERHEAD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl <em>Software Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSoftwareResourcesType()
	 * @generated
	 */
	int SOFTWARE_RESOURCES_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Software Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Software Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourceTypeImpl <em>Software Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourceTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSoftwareResourceType()
	 * @generated
	 */
	int SOFTWARE_RESOURCE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_TYPE__RESOURCE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Software Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType <em>Device Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureType()
	 * @generated
	 */
	int DEVICE_FEATURE_TYPE = 8;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType <em>Scheduling Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyType()
	 * @generated
	 */
	int SCHEDULING_POLICY_TYPE = 9;

	/**
	 * The meta object id for the '<em>Device Feature Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureTypeObject()
	 * @generated
	 */
	int DEVICE_FEATURE_TYPE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Device Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceNameType()
	 * @generated
	 */
	int DEVICE_NAME_TYPE = 11;

	/**
	 * The meta object id for the '<em>Nonnegativefloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloat()
	 * @generated
	 */
	int NONNEGATIVEFLOAT = 12;

	/**
	 * The meta object id for the '<em>Nonnegativefloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloatObject()
	 * @generated
	 */
	int NONNEGATIVEFLOAT_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Scheduling Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyTypeObject()
	 * @generated
	 */
	int SCHEDULING_POLICY_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Service Units Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getServiceUnitsType()
	 * @generated
	 */
	int SERVICE_UNITS_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType
	 * @generated
	 */
	EClass getDevicesType();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType#getDevice()
	 * @see #getDevicesType()
	 * @generated
	 */
	EReference getDevicesType_Device();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType
	 * @generated
	 */
	EClass getDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature <em>Device Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Feature</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_DeviceFeature();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceName()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getQuantity()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_SchedulingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceUnits <em>Service Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Units</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceUnits()
	 * @see #getDeviceType()
	 * @generated
	 */
	EAttribute getDeviceType_ServiceUnits();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devices</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getDevices()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Devices();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getProcessingOverhead <em>Processing Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Overhead</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getProcessingOverhead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProcessingOverhead();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType <em>OM Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OM Element Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType
	 * @generated
	 */
	EClass getOMElementType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService <em>Amount Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Service</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService()
	 * @see #getOMElementType()
	 * @generated
	 */
	EAttribute getOMElementType_AmountOfService();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getDeviceName()
	 * @see #getOMElementType()
	 * @generated
	 */
	EAttribute getOMElementType_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getResourceName()
	 * @see #getOMElementType()
	 * @generated
	 */
	EAttribute getOMElementType_ResourceName();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType <em>Overhead Matrix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Matrix Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType
	 * @generated
	 */
	EClass getOverheadMatrixType();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType#getOMElement <em>OM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OM Element</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType#getOMElement()
	 * @see #getOverheadMatrixType()
	 * @generated
	 */
	EReference getOverheadMatrixType_OMElement();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType <em>Processing Overhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Overhead Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType
	 * @generated
	 */
	EClass getProcessingOverheadType();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getSoftwareResources <em>Software Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Resources</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getSoftwareResources()
	 * @see #getProcessingOverheadType()
	 * @generated
	 */
	EReference getProcessingOverheadType_SoftwareResources();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devices</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getDevices()
	 * @see #getProcessingOverheadType()
	 * @generated
	 */
	EReference getProcessingOverheadType_Devices();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getOverheadMatrix <em>Overhead Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overhead Matrix</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getOverheadMatrix()
	 * @see #getProcessingOverheadType()
	 * @generated
	 */
	EReference getProcessingOverheadType_OverheadMatrix();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType <em>Software Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resources Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType
	 * @generated
	 */
	EClass getSoftwareResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType#getSoftwareResource <em>Software Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Resource</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType#getSoftwareResource()
	 * @see #getSoftwareResourcesType()
	 * @generated
	 */
	EReference getSoftwareResourcesType_SoftwareResource();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType <em>Software Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resource Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType
	 * @generated
	 */
	EClass getSoftwareResourceType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType#getResourceName()
	 * @see #getSoftwareResourceType()
	 * @generated
	 */
	EAttribute getSoftwareResourceType_ResourceName();

	/**
	 * Returns the meta object for enum '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType <em>Device Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Feature Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @generated
	 */
	EEnum getDeviceFeatureType();

	/**
	 * Returns the meta object for enum '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType <em>Scheduling Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @generated
	 */
	EEnum getSchedulingPolicyType();

	/**
	 * Returns the meta object for data type '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType <em>Device Feature Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Feature Type Object</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @model instanceClass="Devices.DeviceFeatureType"
	 *        extendedMetaData="name='DeviceFeature_type:Object' baseType='DeviceFeature_type'" 
	 * @generated
	 */
	EDataType getDeviceFeatureTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Device Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DeviceName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#ID' maxLength='32'" 
	 * @generated
	 */
	EDataType getDeviceNameType();

	/**
	 * Returns the meta object for data type '<em>Nonnegativefloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nonnegativefloat</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='nonnegativefloat' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0'" 
	 * @generated
	 */
	EDataType getNonnegativefloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Nonnegativefloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nonnegativefloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='nonnegativefloat:Object' baseType='nonnegativefloat'" 
	 * @generated
	 */
	EDataType getNonnegativefloatObject();

	/**
	 * Returns the meta object for data type '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType <em>Scheduling Policy Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheduling Policy Type Object</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @model instanceClass="Devices.SchedulingPolicyType"
	 *        extendedMetaData="name='SchedulingPolicy_type:Object' baseType='SchedulingPolicy_type'" 
	 * @generated
	 */
	EDataType getSchedulingPolicyTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Units Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ServiceUnits_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='8'" 
	 * @generated
	 */
	EDataType getServiceUnitsType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevicesFactory getDevicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDevicesType()
		 * @generated
		 */
		EClass DEVICES_TYPE = eINSTANCE.getDevicesType();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES_TYPE__DEVICE = eINSTANCE.getDevicesType_Device();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl <em>Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DeviceTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceType()
		 * @generated
		 */
		EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '<em><b>Device Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__DEVICE_FEATURE = eINSTANCE.getDeviceType_DeviceFeature();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__DEVICE_NAME = eINSTANCE.getDeviceType_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__QUANTITY = eINSTANCE.getDeviceType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__SCHEDULING_POLICY = eINSTANCE.getDeviceType_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__SERVICE_TIME = eINSTANCE.getDeviceType_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_TYPE__SERVICE_UNITS = eINSTANCE.getDeviceType_ServiceUnits();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DocumentRootImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEVICES = eINSTANCE.getDocumentRoot_Devices();

		/**
		 * The meta object literal for the '<em><b>Processing Overhead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESSING_OVERHEAD = eINSTANCE.getDocumentRoot_ProcessingOverhead();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl <em>OM Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getOMElementType()
		 * @generated
		 */
		EClass OM_ELEMENT_TYPE = eINSTANCE.getOMElementType();

		/**
		 * The meta object literal for the '<em><b>Amount Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE = eINSTANCE.getOMElementType_AmountOfService();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM_ELEMENT_TYPE__DEVICE_NAME = eINSTANCE.getOMElementType_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM_ELEMENT_TYPE__RESOURCE_NAME = eINSTANCE.getOMElementType_ResourceName();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OverheadMatrixTypeImpl <em>Overhead Matrix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.OverheadMatrixTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getOverheadMatrixType()
		 * @generated
		 */
		EClass OVERHEAD_MATRIX_TYPE = eINSTANCE.getOverheadMatrixType();

		/**
		 * The meta object literal for the '<em><b>OM Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERHEAD_MATRIX_TYPE__OM_ELEMENT = eINSTANCE.getOverheadMatrixType_OMElement();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl <em>Processing Overhead Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProcessingOverheadType()
		 * @generated
		 */
		EClass PROCESSING_OVERHEAD_TYPE = eINSTANCE.getProcessingOverheadType();

		/**
		 * The meta object literal for the '<em><b>Software Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES = eINSTANCE.getProcessingOverheadType_SoftwareResources();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_OVERHEAD_TYPE__DEVICES = eINSTANCE.getProcessingOverheadType_Devices();

		/**
		 * The meta object literal for the '<em><b>Overhead Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX = eINSTANCE.getProcessingOverheadType_OverheadMatrix();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl <em>Software Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSoftwareResourcesType()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCES_TYPE = eINSTANCE.getSoftwareResourcesType();

		/**
		 * The meta object literal for the '<em><b>Software Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE = eINSTANCE.getSoftwareResourcesType_SoftwareResource();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourceTypeImpl <em>Software Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourceTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSoftwareResourceType()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCE_TYPE = eINSTANCE.getSoftwareResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE_TYPE__RESOURCE_NAME = eINSTANCE.getSoftwareResourceType_ResourceName();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType <em>Device Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureType()
		 * @generated
		 */
		EEnum DEVICE_FEATURE_TYPE = eINSTANCE.getDeviceFeatureType();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType <em>Scheduling Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyType()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY_TYPE = eINSTANCE.getSchedulingPolicyType();

		/**
		 * The meta object literal for the '<em>Device Feature Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureTypeObject()
		 * @generated
		 */
		EDataType DEVICE_FEATURE_TYPE_OBJECT = eINSTANCE.getDeviceFeatureTypeObject();

		/**
		 * The meta object literal for the '<em>Device Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceNameType()
		 * @generated
		 */
		EDataType DEVICE_NAME_TYPE = eINSTANCE.getDeviceNameType();

		/**
		 * The meta object literal for the '<em>Nonnegativefloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloat()
		 * @generated
		 */
		EDataType NONNEGATIVEFLOAT = eINSTANCE.getNonnegativefloat();

		/**
		 * The meta object literal for the '<em>Nonnegativefloat Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloatObject()
		 * @generated
		 */
		EDataType NONNEGATIVEFLOAT_OBJECT = eINSTANCE.getNonnegativefloatObject();

		/**
		 * The meta object literal for the '<em>Scheduling Policy Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyTypeObject()
		 * @generated
		 */
		EDataType SCHEDULING_POLICY_TYPE_OBJECT = eINSTANCE.getSchedulingPolicyTypeObject();

		/**
		 * The meta object literal for the '<em>Service Units Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getServiceUnitsType()
		 * @generated
		 */
		EDataType SERVICE_UNITS_TYPE = eINSTANCE.getServiceUnitsType();

	}

} //DevicesPackage
