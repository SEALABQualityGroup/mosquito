/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.Devices.impl;



import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType;
import di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType;
import di.univaq.MOSQUITO.egQnMerger.Devices.DevicesFactory;
import di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType;
import di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot;
import di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType;
import di.univaq.MOSQUITO.egQnMerger.Devices.util.DevicesValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicesPackageImpl extends EPackageImpl implements DevicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceFeatureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceFeatureTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonnegativefloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonnegativefloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schedulingPolicyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceUnitsTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevicesPackageImpl() {
		super(eNS_URI, DevicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevicesPackage init() {
		if (isInited) return (DevicesPackage)EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI);

		// Obtain or create and register package
		DevicesPackageImpl theDevicesPackage = (DevicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DevicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DevicesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevicesPackage.createPackageContents();

		// Initialize created meta-data
		theDevicesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDevicesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DevicesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDevicesPackage.freeze();

		return theDevicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicesType() {
		return devicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicesType_Device() {
		return (EReference)devicesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_DeviceFeature() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_DeviceName() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_Quantity() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_SchedulingPolicy() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_ServiceTime() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_ServiceUnits() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Devices() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceFeatureType() {
		return deviceFeatureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingPolicyType() {
		return schedulingPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceFeatureTypeObject() {
		return deviceFeatureTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceNameType() {
		return deviceNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonnegativefloat() {
		return nonnegativefloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonnegativefloatObject() {
		return nonnegativefloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSchedulingPolicyTypeObject() {
		return schedulingPolicyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceUnitsType() {
		return serviceUnitsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesFactory getDevicesFactory() {
		return (DevicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		devicesTypeEClass = createEClass(DEVICES_TYPE);
		createEReference(devicesTypeEClass, DEVICES_TYPE__DEVICE);

		deviceTypeEClass = createEClass(DEVICE_TYPE);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__DEVICE_FEATURE);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__DEVICE_NAME);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__QUANTITY);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__SCHEDULING_POLICY);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__SERVICE_TIME);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__SERVICE_UNITS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEVICES);

		// Create enums
		deviceFeatureTypeEEnum = createEEnum(DEVICE_FEATURE_TYPE);
		schedulingPolicyTypeEEnum = createEEnum(SCHEDULING_POLICY_TYPE);

		// Create data types
		deviceFeatureTypeObjectEDataType = createEDataType(DEVICE_FEATURE_TYPE_OBJECT);
		deviceNameTypeEDataType = createEDataType(DEVICE_NAME_TYPE);
		nonnegativefloatEDataType = createEDataType(NONNEGATIVEFLOAT);
		nonnegativefloatObjectEDataType = createEDataType(NONNEGATIVEFLOAT_OBJECT);
		schedulingPolicyTypeObjectEDataType = createEDataType(SCHEDULING_POLICY_TYPE_OBJECT);
		serviceUnitsTypeEDataType = createEDataType(SERVICE_UNITS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(devicesTypeEClass, DevicesType.class, "DevicesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevicesType_Device(), this.getDeviceType(), null, "device", null, 1, -1, DevicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceType_DeviceFeature(), this.getDeviceFeatureType(), "deviceFeature", "FCFS", 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_DeviceName(), this.getDeviceNameType(), "deviceName", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_Quantity(), theXMLTypePackage.getNonNegativeInteger(), "quantity", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_SchedulingPolicy(), this.getSchedulingPolicyType(), "schedulingPolicy", "FCFS", 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_ServiceTime(), this.getNonnegativefloat(), "serviceTime", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceType_ServiceUnits(), this.getServiceUnitsType(), "serviceUnits", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Devices(), this.getDevicesType(), null, "devices", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceFeatureTypeEEnum, DeviceFeatureType.class, "DeviceFeatureType");
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.FCFS_LITERAL);
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.NON_FCFS_DEMAND_SPEC_LITERAL);
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.NON_FCFS_TIME_SPEC_LITERAL);

		initEEnum(schedulingPolicyTypeEEnum, SchedulingPolicyType.class, "SchedulingPolicyType");
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.FCFS_LITERAL);
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.PS_LITERAL);
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.IS_LITERAL);

		// Initialize data types
		initEDataType(deviceFeatureTypeObjectEDataType, DeviceFeatureType.class, "DeviceFeatureTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceNameTypeEDataType, String.class, "DeviceNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonnegativefloatEDataType, float.class, "Nonnegativefloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonnegativefloatObjectEDataType, Float.class, "NonnegativefloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schedulingPolicyTypeObjectEDataType, SchedulingPolicyType.class, "SchedulingPolicyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceUnitsTypeEDataType, String.class, "ServiceUnitsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (deviceFeatureTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DeviceFeature_type"
		   });		
		addAnnotation
		  (deviceFeatureTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DeviceFeature_type:Object",
			 "baseType", "DeviceFeature_type"
		   });		
		addAnnotation
		  (deviceNameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "DeviceName_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#ID",
			 "maxLength", "32"
		   });		
		addAnnotation
		  (devicesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Devices_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDevicesType_Device(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Device",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (deviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Device_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDeviceType_DeviceFeature(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DeviceFeature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceType_DeviceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DeviceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceType_SchedulingPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SchedulingPolicy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceType_ServiceTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ServiceTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceType_ServiceUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ServiceUnits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Devices(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Devices",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nonnegativefloatEDataType, 
		   source, 
		   new String[] {
			 "name", "nonnegativefloat",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0"
		   });		
		addAnnotation
		  (nonnegativefloatObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "nonnegativefloat:Object",
			 "baseType", "nonnegativefloat"
		   });		
		addAnnotation
		  (schedulingPolicyTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "SchedulingPolicy_type"
		   });		
		addAnnotation
		  (schedulingPolicyTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SchedulingPolicy_type:Object",
			 "baseType", "SchedulingPolicy_type"
		   });		
		addAnnotation
		  (serviceUnitsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ServiceUnits_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "8"
		   });
	}

} //DevicesPackageImpl
