/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;

//ex DevicesPackageImpl



import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import di.univaq.MOSQUITO.egQnMerger.EG.ArcType;
import di.univaq.MOSQUITO.egQnMerger.EG.BasicNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.CPSNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.CompoundNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.DeviceFeatureType;
import di.univaq.MOSQUITO.egQnMerger.EG.DeviceType;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesFactory;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.DevicesType;
import di.univaq.MOSQUITO.egQnMerger.EG.DocumentRoot;
import di.univaq.MOSQUITO.egQnMerger.EG.EGType;
import di.univaq.MOSQUITO.egQnMerger.EG.ExpandedNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.LinkNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.OMElementType;
import di.univaq.MOSQUITO.egQnMerger.EG.OverheadMatrixType;
import di.univaq.MOSQUITO.egQnMerger.EG.PSType;
import di.univaq.MOSQUITO.egQnMerger.EG.PartnerTypeType;
import di.univaq.MOSQUITO.egQnMerger.EG.ProcessingNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.ProcessingOverheadType;
import di.univaq.MOSQUITO.egQnMerger.EG.ProjectType;
import di.univaq.MOSQUITO.egQnMerger.EG.RepNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType1;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType2;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType3;
import di.univaq.MOSQUITO.egQnMerger.EG.ResourceRequirementType4;
import di.univaq.MOSQUITO.egQnMerger.EG.SchedulingPolicyType;
import di.univaq.MOSQUITO.egQnMerger.EG.SoftwareResourceType;
import di.univaq.MOSQUITO.egQnMerger.EG.SoftwareResourcesType;
import di.univaq.MOSQUITO.egQnMerger.EG.SynchroNodeType;
import di.univaq.MOSQUITO.egQnMerger.EG.util.DevicesValidator;


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
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpsNodeTypeEClass = null;

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
	private EClass egTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandedNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass omElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadMatrixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingOverheadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchroNodeTypeEClass = null;

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
	private EEnum partnerTypeTypeEEnum = null;

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
	private EDataType partnerTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positivefloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positivefloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType probabilityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType probabilityTypeObjectEDataType = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spePriorityTypeEDataType = null;

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
     * 
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
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_FromNode() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_ToNode() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicNodeType() {
		return basicNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicNodeType_NodeName() {
		return (EAttribute)basicNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicNodeType_Probability() {
		return (EAttribute)basicNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundNodeType() {
		return compoundNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundNodeType_SplitNode() {
		return (EReference)compoundNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundNodeType_PardoNode() {
		return (EReference)compoundNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundNodeType_CaseNode() {
		return (EReference)compoundNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundNodeType_RepetitionNode() {
		return (EReference)compoundNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundNodeType_ResourceRequirement() {
		return (EReference)compoundNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundNodeType_NodeName() {
		return (EAttribute)compoundNodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPSNodeType() {
		return cpsNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPSNodeType_Group() {
		return (EAttribute)cpsNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPSNodeType_BasicNode() {
		return (EReference)cpsNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPSNodeType_ExpandedNode() {
		return (EReference)cpsNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPSNodeType_LinkNode() {
		return (EReference)cpsNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPSNodeType_SynchronizationNode() {
		return (EReference)cpsNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPSNodeType_ResourceRequirement() {
		return (EReference)cpsNodeTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getDocumentRoot_ProcessingOverhead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Project() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGType() {
		return egTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_Group() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_BasicNode() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_ExpandedNode() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_LinkNode() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_SynchronizationNode() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_ResourceRequirement() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_CompoundNode() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGType_Arc() {
		return (EReference)egTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_EGname() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_IsMainEG() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_ModificationDateTime() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_StartNode() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEGType_SWmodelname() {
		return (EAttribute)egTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandedNodeType() {
		return expandedNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandedNodeType_EGname() {
		return (EAttribute)expandedNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandedNodeType_NodeName() {
		return (EAttribute)expandedNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandedNodeType_Probability() {
		return (EAttribute)expandedNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkNodeType() {
		return linkNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkNodeType_NodeName() {
		return (EAttribute)linkNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkNodeType_PerformanceScenarioFilename() {
		return (EAttribute)linkNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkNodeType_PerformanceScenarioName() {
		return (EAttribute)linkNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkNodeType_Probability() {
		return (EAttribute)linkNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMElementType() {
		return omElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMElementType_AmountOfService() {
		return (EAttribute)omElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMElementType_DeviceName() {
		return (EAttribute)omElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMElementType_ResourceName() {
		return (EAttribute)omElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverheadMatrixType() {
		return overheadMatrixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverheadMatrixType_OMElement() {
		return (EReference)overheadMatrixTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingNodeType() {
		return processingNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingNodeType_NodeName() {
		return (EAttribute)processingNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingNodeType_Probability() {
		return (EAttribute)processingNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingOverheadType() {
		return processingOverheadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingOverheadType_SoftwareResources() {
		return (EReference)processingOverheadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingOverheadType_Devices() {
		return (EReference)processingOverheadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingOverheadType_OverheadMatrix() {
		return (EReference)processingOverheadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectType() {
		return projectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_PerformanceScenario() {
		return (EReference)projectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_ProcessingOverhead() {
		return (EReference)projectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_ProjectName() {
		return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSType() {
		return psTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSType_ExecutionGraph() {
		return (EReference)psTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSType_InterarrivalTime() {
		return (EAttribute)psTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSType_NumberOfJobs() {
		return (EAttribute)psTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSType_Priority() {
		return (EAttribute)psTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSType_ScenarioName() {
		return (EAttribute)psTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSType_SWmodelfilename() {
		return (EAttribute)psTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepNodeType() {
		return repNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepNodeType_BasicNode() {
		return (EReference)repNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepNodeType_ExpandedNode() {
		return (EReference)repNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepNodeType_LinkNode() {
		return (EReference)repNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepNodeType_SynchronizationNode() {
		return (EReference)repNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepNodeType_ResourceRequirement() {
		return (EReference)repNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepNodeType_RepetitionFactor() {
		return (EAttribute)repNodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirementType() {
		return resourceRequirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirementType1() {
		return resourceRequirementType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirementType2() {
		return resourceRequirementType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirementType3() {
		return resourceRequirementType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRequirementType3_ResourceName() {
		return (EAttribute)resourceRequirementType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRequirementType3_UnitsOfService() {
		return (EAttribute)resourceRequirementType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirementType4() {
		return resourceRequirementType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResourcesType() {
		return softwareResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResourcesType_SoftwareResource() {
		return (EReference)softwareResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResourceType() {
		return softwareResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareResourceType_ResourceName() {
		return (EAttribute)softwareResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchroNodeType() {
		return synchroNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_MyType() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_NodeName() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_PartnerName() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_PartnerPerfFileName() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_PartnerPerfScenarioName() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_PartnerType() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroNodeType_Probability() {
		return (EAttribute)synchroNodeTypeEClass.getEStructuralFeatures().get(6);
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
	public EEnum getPartnerTypeType() {
		return partnerTypeTypeEEnum;
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
	public EDataType getPartnerTypeTypeObject() {
		return partnerTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositivefloat() {
		return positivefloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositivefloatObject() {
		return positivefloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProbabilityType() {
		return probabilityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProbabilityTypeObject() {
		return probabilityTypeObjectEDataType;
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
	public EDataType getSPEPriorityType() {
		return spePriorityTypeEDataType;
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
		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__FROM_NODE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TO_NODE);

		basicNodeTypeEClass = createEClass(BASIC_NODE_TYPE);
		createEAttribute(basicNodeTypeEClass, BASIC_NODE_TYPE__NODE_NAME);
		createEAttribute(basicNodeTypeEClass, BASIC_NODE_TYPE__PROBABILITY);

		compoundNodeTypeEClass = createEClass(COMPOUND_NODE_TYPE);
		createEReference(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__SPLIT_NODE);
		createEReference(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__PARDO_NODE);
		createEReference(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__CASE_NODE);
		createEReference(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__REPETITION_NODE);
		createEReference(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT);
		createEAttribute(compoundNodeTypeEClass, COMPOUND_NODE_TYPE__NODE_NAME);

		cpsNodeTypeEClass = createEClass(CPS_NODE_TYPE);
		createEAttribute(cpsNodeTypeEClass, CPS_NODE_TYPE__GROUP);
		createEReference(cpsNodeTypeEClass, CPS_NODE_TYPE__BASIC_NODE);
		createEReference(cpsNodeTypeEClass, CPS_NODE_TYPE__EXPANDED_NODE);
		createEReference(cpsNodeTypeEClass, CPS_NODE_TYPE__LINK_NODE);
		createEReference(cpsNodeTypeEClass, CPS_NODE_TYPE__SYNCHRONIZATION_NODE);
		createEReference(cpsNodeTypeEClass, CPS_NODE_TYPE__RESOURCE_REQUIREMENT);

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
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROCESSING_OVERHEAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROJECT);

		egTypeEClass = createEClass(EG_TYPE);
		createEAttribute(egTypeEClass, EG_TYPE__GROUP);
		createEReference(egTypeEClass, EG_TYPE__BASIC_NODE);
		createEReference(egTypeEClass, EG_TYPE__EXPANDED_NODE);
		createEReference(egTypeEClass, EG_TYPE__LINK_NODE);
		createEReference(egTypeEClass, EG_TYPE__SYNCHRONIZATION_NODE);
		createEReference(egTypeEClass, EG_TYPE__RESOURCE_REQUIREMENT);
		createEReference(egTypeEClass, EG_TYPE__COMPOUND_NODE);
		createEReference(egTypeEClass, EG_TYPE__ARC);
		createEAttribute(egTypeEClass, EG_TYPE__EGNAME);
		createEAttribute(egTypeEClass, EG_TYPE__IS_MAIN_EG);
		createEAttribute(egTypeEClass, EG_TYPE__MODIFICATION_DATE_TIME);
		createEAttribute(egTypeEClass, EG_TYPE__START_NODE);
		createEAttribute(egTypeEClass, EG_TYPE__SWMODELNAME);

		expandedNodeTypeEClass = createEClass(EXPANDED_NODE_TYPE);
		createEAttribute(expandedNodeTypeEClass, EXPANDED_NODE_TYPE__EGNAME);
		createEAttribute(expandedNodeTypeEClass, EXPANDED_NODE_TYPE__NODE_NAME);
		createEAttribute(expandedNodeTypeEClass, EXPANDED_NODE_TYPE__PROBABILITY);

		linkNodeTypeEClass = createEClass(LINK_NODE_TYPE);
		createEAttribute(linkNodeTypeEClass, LINK_NODE_TYPE__NODE_NAME);
		createEAttribute(linkNodeTypeEClass, LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME);
		createEAttribute(linkNodeTypeEClass, LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME);
		createEAttribute(linkNodeTypeEClass, LINK_NODE_TYPE__PROBABILITY);

		omElementTypeEClass = createEClass(OM_ELEMENT_TYPE);
		createEAttribute(omElementTypeEClass, OM_ELEMENT_TYPE__AMOUNT_OF_SERVICE);
		createEAttribute(omElementTypeEClass, OM_ELEMENT_TYPE__DEVICE_NAME);
		createEAttribute(omElementTypeEClass, OM_ELEMENT_TYPE__RESOURCE_NAME);

		overheadMatrixTypeEClass = createEClass(OVERHEAD_MATRIX_TYPE);
		createEReference(overheadMatrixTypeEClass, OVERHEAD_MATRIX_TYPE__OM_ELEMENT);

		processingNodeTypeEClass = createEClass(PROCESSING_NODE_TYPE);
		createEAttribute(processingNodeTypeEClass, PROCESSING_NODE_TYPE__NODE_NAME);
		createEAttribute(processingNodeTypeEClass, PROCESSING_NODE_TYPE__PROBABILITY);

		processingOverheadTypeEClass = createEClass(PROCESSING_OVERHEAD_TYPE);
		createEReference(processingOverheadTypeEClass, PROCESSING_OVERHEAD_TYPE__SOFTWARE_RESOURCES);
		createEReference(processingOverheadTypeEClass, PROCESSING_OVERHEAD_TYPE__DEVICES);
		createEReference(processingOverheadTypeEClass, PROCESSING_OVERHEAD_TYPE__OVERHEAD_MATRIX);

		projectTypeEClass = createEClass(PROJECT_TYPE);
		createEReference(projectTypeEClass, PROJECT_TYPE__PERFORMANCE_SCENARIO);
		createEReference(projectTypeEClass, PROJECT_TYPE__PROCESSING_OVERHEAD);
		createEAttribute(projectTypeEClass, PROJECT_TYPE__PROJECT_NAME);

		psTypeEClass = createEClass(PS_TYPE);
		createEReference(psTypeEClass, PS_TYPE__EXECUTION_GRAPH);
		createEAttribute(psTypeEClass, PS_TYPE__INTERARRIVAL_TIME);
		createEAttribute(psTypeEClass, PS_TYPE__NUMBER_OF_JOBS);
		createEAttribute(psTypeEClass, PS_TYPE__PRIORITY);
		createEAttribute(psTypeEClass, PS_TYPE__SCENARIO_NAME);
		createEAttribute(psTypeEClass, PS_TYPE__SWMODELFILENAME);

		repNodeTypeEClass = createEClass(REP_NODE_TYPE);
		createEReference(repNodeTypeEClass, REP_NODE_TYPE__BASIC_NODE);
		createEReference(repNodeTypeEClass, REP_NODE_TYPE__EXPANDED_NODE);
		createEReference(repNodeTypeEClass, REP_NODE_TYPE__LINK_NODE);
		createEReference(repNodeTypeEClass, REP_NODE_TYPE__SYNCHRONIZATION_NODE);
		createEReference(repNodeTypeEClass, REP_NODE_TYPE__RESOURCE_REQUIREMENT);
		createEAttribute(repNodeTypeEClass, REP_NODE_TYPE__REPETITION_FACTOR);

		resourceRequirementTypeEClass = createEClass(RESOURCE_REQUIREMENT_TYPE);

		resourceRequirementType1EClass = createEClass(RESOURCE_REQUIREMENT_TYPE1);

		resourceRequirementType2EClass = createEClass(RESOURCE_REQUIREMENT_TYPE2);

		resourceRequirementType3EClass = createEClass(RESOURCE_REQUIREMENT_TYPE3);
		createEAttribute(resourceRequirementType3EClass, RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME);
		createEAttribute(resourceRequirementType3EClass, RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE);

		resourceRequirementType4EClass = createEClass(RESOURCE_REQUIREMENT_TYPE4);

		softwareResourcesTypeEClass = createEClass(SOFTWARE_RESOURCES_TYPE);
		createEReference(softwareResourcesTypeEClass, SOFTWARE_RESOURCES_TYPE__SOFTWARE_RESOURCE);

		softwareResourceTypeEClass = createEClass(SOFTWARE_RESOURCE_TYPE);
		createEAttribute(softwareResourceTypeEClass, SOFTWARE_RESOURCE_TYPE__RESOURCE_NAME);

		synchroNodeTypeEClass = createEClass(SYNCHRO_NODE_TYPE);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__MY_TYPE);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__NODE_NAME);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__PARTNER_NAME);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__PARTNER_TYPE);
		createEAttribute(synchroNodeTypeEClass, SYNCHRO_NODE_TYPE__PROBABILITY);

		// Create enums
		deviceFeatureTypeEEnum = createEEnum(DEVICE_FEATURE_TYPE);
		partnerTypeTypeEEnum = createEEnum(PARTNER_TYPE_TYPE);
		schedulingPolicyTypeEEnum = createEEnum(SCHEDULING_POLICY_TYPE);

		// Create data types
		deviceFeatureTypeObjectEDataType = createEDataType(DEVICE_FEATURE_TYPE_OBJECT);
		deviceNameTypeEDataType = createEDataType(DEVICE_NAME_TYPE);
		nonnegativefloatEDataType = createEDataType(NONNEGATIVEFLOAT);
		nonnegativefloatObjectEDataType = createEDataType(NONNEGATIVEFLOAT_OBJECT);
		partnerTypeTypeObjectEDataType = createEDataType(PARTNER_TYPE_TYPE_OBJECT);
		positivefloatEDataType = createEDataType(POSITIVEFLOAT);
		positivefloatObjectEDataType = createEDataType(POSITIVEFLOAT_OBJECT);
		probabilityTypeEDataType = createEDataType(PROBABILITY_TYPE);
		probabilityTypeObjectEDataType = createEDataType(PROBABILITY_TYPE_OBJECT);
		schedulingPolicyTypeObjectEDataType = createEDataType(SCHEDULING_POLICY_TYPE_OBJECT);
		serviceUnitsTypeEDataType = createEDataType(SERVICE_UNITS_TYPE);
		spePriorityTypeEDataType = createEDataType(SPE_PRIORITY_TYPE);
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
		resourceRequirementTypeEClass.getESuperTypes().add(this.getResourceRequirementType3());
		resourceRequirementType1EClass.getESuperTypes().add(this.getResourceRequirementType3());
		resourceRequirementType2EClass.getESuperTypes().add(this.getResourceRequirementType3());
		resourceRequirementType4EClass.getESuperTypes().add(this.getResourceRequirementType3());

		// Initialize classes and features; add operations and parameters
		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_FromNode(), theXMLTypePackage.getIDREF(), "fromNode", null, 1, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArcType_ToNode(), theXMLTypePackage.getIDREF(), "toNode", null, 1, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicNodeTypeEClass, BasicNodeType.class, "BasicNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, BasicNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicNodeType_Probability(), this.getProbabilityType(), "probability", null, 0, 1, BasicNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundNodeTypeEClass, CompoundNodeType.class, "CompoundNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundNodeType_SplitNode(), this.getCPSNodeType(), null, "splitNode", null, 0, 1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundNodeType_PardoNode(), this.getCPSNodeType(), null, "pardoNode", null, 0, 1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundNodeType_CaseNode(), this.getCPSNodeType(), null, "caseNode", null, 0, 1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundNodeType_RepetitionNode(), this.getRepNodeType(), null, "repetitionNode", null, 0, 1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundNodeType_ResourceRequirement(), this.getResourceRequirementType(), null, "resourceRequirement", null, 0, -1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, CompoundNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpsNodeTypeEClass, CPSNodeType.class, "CPSNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPSNodeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CPSNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPSNodeType_BasicNode(), this.getBasicNodeType(), null, "basicNode", null, 0, -1, CPSNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCPSNodeType_ExpandedNode(), this.getExpandedNodeType(), null, "expandedNode", null, 0, -1, CPSNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCPSNodeType_LinkNode(), this.getLinkNodeType(), null, "linkNode", null, 0, -1, CPSNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCPSNodeType_SynchronizationNode(), this.getSynchroNodeType(), null, "synchronizationNode", null, 0, -1, CPSNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCPSNodeType_ResourceRequirement(), this.getResourceRequirementType2(), null, "resourceRequirement", null, 0, -1, CPSNodeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEReference(getDocumentRoot_ProcessingOverhead(), this.getProcessingOverheadType(), null, "processingOverhead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Project(), this.getProjectType(), null, "project", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(egTypeEClass, EGType.class, "EGType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEGType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_BasicNode(), this.getBasicNodeType(), null, "basicNode", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_ExpandedNode(), this.getExpandedNodeType(), null, "expandedNode", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_LinkNode(), this.getLinkNodeType(), null, "linkNode", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_SynchronizationNode(), this.getSynchroNodeType(), null, "synchronizationNode", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_ResourceRequirement(), this.getResourceRequirementType4(), null, "resourceRequirement", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_CompoundNode(), this.getCompoundNodeType(), null, "compoundNode", null, 0, -1, EGType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGType_Arc(), this.getArcType(), null, "arc", null, 0, -1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGType_EGname(), theXMLTypePackage.getID(), "eGname", null, 1, 1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGType_IsMainEG(), theXMLTypePackage.getBoolean(), "isMainEG", null, 1, 1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGType_ModificationDateTime(), theXMLTypePackage.getDateTime(), "modificationDateTime", null, 0, 1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGType_StartNode(), theXMLTypePackage.getIDREF(), "startNode", null, 1, 1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEGType_SWmodelname(), theXMLTypePackage.getString(), "sWmodelname", null, 0, 1, EGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expandedNodeTypeEClass, ExpandedNodeType.class, "ExpandedNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpandedNodeType_EGname(), theXMLTypePackage.getIDREF(), "eGname", null, 1, 1, ExpandedNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpandedNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, ExpandedNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpandedNodeType_Probability(), this.getProbabilityType(), "probability", null, 0, 1, ExpandedNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkNodeTypeEClass, LinkNodeType.class, "LinkNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, LinkNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkNodeType_PerformanceScenarioFilename(), theXMLTypePackage.getAnyURI(), "performanceScenarioFilename", null, 1, 1, LinkNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkNodeType_PerformanceScenarioName(), theXMLTypePackage.getString(), "performanceScenarioName", null, 0, 1, LinkNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkNodeType_Probability(), this.getProbabilityType(), "probability", null, 0, 1, LinkNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omElementTypeEClass, OMElementType.class, "OMElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMElementType_AmountOfService(), this.getNonnegativefloat(), "amountOfService", null, 1, 1, OMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMElementType_DeviceName(), theXMLTypePackage.getIDREF(), "deviceName", null, 1, 1, OMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMElementType_ResourceName(), theXMLTypePackage.getIDREF(), "resourceName", null, 1, 1, OMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overheadMatrixTypeEClass, OverheadMatrixType.class, "OverheadMatrixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverheadMatrixType_OMElement(), this.getOMElementType(), null, "oMElement", null, 1, -1, OverheadMatrixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingNodeTypeEClass, ProcessingNodeType.class, "ProcessingNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, ProcessingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNodeType_Probability(), this.getProbabilityType(), "probability", null, 0, 1, ProcessingNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingOverheadTypeEClass, ProcessingOverheadType.class, "ProcessingOverheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingOverheadType_SoftwareResources(), this.getSoftwareResourcesType(), null, "softwareResources", null, 1, 1, ProcessingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingOverheadType_Devices(), this.getDevicesType(), null, "devices", null, 1, 1, ProcessingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingOverheadType_OverheadMatrix(), this.getOverheadMatrixType(), null, "overheadMatrix", null, 1, 1, ProcessingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectTypeEClass, ProjectType.class, "ProjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectType_PerformanceScenario(), this.getPSType(), null, "performanceScenario", null, 1, -1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectType_ProcessingOverhead(), this.getProcessingOverheadType(), null, "processingOverhead", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectType_ProjectName(), theXMLTypePackage.getString(), "projectName", null, 1, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psTypeEClass, PSType.class, "PSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSType_ExecutionGraph(), this.getEGType(), null, "executionGraph", null, 1, -1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSType_InterarrivalTime(), this.getPositivefloat(), "interarrivalTime", null, 1, 1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSType_NumberOfJobs(), theXMLTypePackage.getPositiveInteger(), "numberOfJobs", null, 1, 1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSType_Priority(), this.getSPEPriorityType(), "priority", null, 0, 1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSType_ScenarioName(), theXMLTypePackage.getString(), "scenarioName", null, 1, 1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSType_SWmodelfilename(), theXMLTypePackage.getAnyURI(), "sWmodelfilename", null, 1, 1, PSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repNodeTypeEClass, RepNodeType.class, "RepNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepNodeType_BasicNode(), this.getBasicNodeType(), null, "basicNode", null, 0, 1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepNodeType_ExpandedNode(), this.getExpandedNodeType(), null, "expandedNode", null, 0, 1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepNodeType_LinkNode(), this.getLinkNodeType(), null, "linkNode", null, 0, 1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepNodeType_SynchronizationNode(), this.getSynchroNodeType(), null, "synchronizationNode", null, 0, 1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepNodeType_ResourceRequirement(), this.getResourceRequirementType1(), null, "resourceRequirement", null, 0, -1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepNodeType_RepetitionFactor(), this.getPositivefloat(), "repetitionFactor", null, 1, 1, RepNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementTypeEClass, ResourceRequirementType.class, "ResourceRequirementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceRequirementType1EClass, ResourceRequirementType1.class, "ResourceRequirementType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceRequirementType2EClass, ResourceRequirementType2.class, "ResourceRequirementType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceRequirementType3EClass, ResourceRequirementType3.class, "ResourceRequirementType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRequirementType3_ResourceName(), theXMLTypePackage.getIDREF(), "resourceName", null, 1, 1, ResourceRequirementType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRequirementType3_UnitsOfService(), this.getNonnegativefloat(), "unitsOfService", null, 1, 1, ResourceRequirementType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementType4EClass, ResourceRequirementType4.class, "ResourceRequirementType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareResourcesTypeEClass, SoftwareResourcesType.class, "SoftwareResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareResourcesType_SoftwareResource(), this.getSoftwareResourceType(), null, "softwareResource", null, 1, -1, SoftwareResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareResourceTypeEClass, SoftwareResourceType.class, "SoftwareResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareResourceType_ResourceName(), theXMLTypePackage.getID(), "resourceName", null, 1, 1, SoftwareResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchroNodeTypeEClass, SynchroNodeType.class, "SynchroNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchroNodeType_MyType(), this.getPartnerTypeType(), "myType", "SynchronousCall", 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_NodeName(), theXMLTypePackage.getID(), "nodeName", null, 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_PartnerName(), theXMLTypePackage.getString(), "partnerName", null, 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_PartnerPerfFileName(), theXMLTypePackage.getAnyURI(), "partnerPerfFileName", null, 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_PartnerPerfScenarioName(), theXMLTypePackage.getString(), "partnerPerfScenarioName", null, 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_PartnerType(), this.getPartnerTypeType(), "partnerType", "SynchronousCall", 1, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchroNodeType_Probability(), this.getProbabilityType(), "probability", null, 0, 1, SynchroNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceFeatureTypeEEnum, DeviceFeatureType.class, "DeviceFeatureType");
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.FCFS_LITERAL);
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.NON_FCFS_DEMAND_SPEC_LITERAL);
		addEEnumLiteral(deviceFeatureTypeEEnum, DeviceFeatureType.NON_FCFS_TIME_SPEC_LITERAL);

		initEEnum(partnerTypeTypeEEnum, PartnerTypeType.class, "PartnerTypeType");
		addEEnumLiteral(partnerTypeTypeEEnum, PartnerTypeType.SYNCHRONOUS_CALL_LITERAL);
		addEEnumLiteral(partnerTypeTypeEEnum, PartnerTypeType.DEFERRED_SYNCHRONOUS_CALL_LITERAL);
		addEEnumLiteral(partnerTypeTypeEEnum, PartnerTypeType.ASYNCHRONOUS_CALL_LITERAL);
		addEEnumLiteral(partnerTypeTypeEEnum, PartnerTypeType.NO_REPLY_LITERAL);
		addEEnumLiteral(partnerTypeTypeEEnum, PartnerTypeType.REPLY_LITERAL);

		initEEnum(schedulingPolicyTypeEEnum, SchedulingPolicyType.class, "SchedulingPolicyType");
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.FCFS_LITERAL);
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.PS_LITERAL);
		addEEnumLiteral(schedulingPolicyTypeEEnum, SchedulingPolicyType.IS_LITERAL);

		// Initialize data types
		initEDataType(deviceFeatureTypeObjectEDataType, DeviceFeatureType.class, "DeviceFeatureTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceNameTypeEDataType, String.class, "DeviceNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonnegativefloatEDataType, float.class, "Nonnegativefloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonnegativefloatObjectEDataType, Float.class, "NonnegativefloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(partnerTypeTypeObjectEDataType, PartnerTypeType.class, "PartnerTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positivefloatEDataType, float.class, "Positivefloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positivefloatObjectEDataType, Float.class, "PositivefloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(probabilityTypeEDataType, float.class, "ProbabilityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(probabilityTypeObjectEDataType, Float.class, "ProbabilityTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schedulingPolicyTypeObjectEDataType, SchedulingPolicyType.class, "SchedulingPolicyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceUnitsTypeEDataType, String.class, "ServiceUnitsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(spePriorityTypeEDataType, BigInteger.class, "SPEPriorityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (arcTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Arc_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getArcType_FromNode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FromNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getArcType_ToNode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ToNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (basicNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BasicNode_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBasicNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBasicNodeType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Probability",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (compoundNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CompoundNode_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCompoundNodeType_SplitNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SplitNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundNodeType_PardoNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PardoNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundNodeType_CaseNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CaseNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundNodeType_RepetitionNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RepetitionNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundNodeType_ResourceRequirement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceRequirement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompoundNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (cpsNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CPSNode_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCPSNodeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCPSNodeType_BasicNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BasicNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getCPSNodeType_ExpandedNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExpandedNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getCPSNodeType_LinkNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LinkNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getCPSNodeType_SynchronizationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SynchronizationNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getCPSNodeType_ResourceRequirement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceRequirement",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
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
		  (getDocumentRoot_ProcessingOverhead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessingOverhead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Project(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Project",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (egTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EG_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEGType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEGType_BasicNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BasicNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_ExpandedNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExpandedNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_LinkNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LinkNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_SynchronizationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SynchronizationNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_ResourceRequirement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceRequirement",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_CompoundNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompoundNode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEGType_Arc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Arc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEGType_EGname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EGname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEGType_IsMainEG(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IsMainEG",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEGType_ModificationDateTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ModificationDateTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEGType_StartNode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "StartNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEGType_SWmodelname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SWmodelname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (expandedNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExpandedNode_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExpandedNodeType_EGname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EGname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExpandedNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExpandedNodeType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Probability",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (linkNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LinkNode_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLinkNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkNodeType_PerformanceScenarioFilename(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PerformanceScenarioFilename",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkNodeType_PerformanceScenarioName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PerformanceScenarioName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkNodeType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Probability",
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
		  (omElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OMElement_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOMElementType_AmountOfService(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AmountOfService",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOMElementType_DeviceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DeviceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOMElementType_ResourceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ResourceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (overheadMatrixTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OverheadMatrix_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOverheadMatrixType_OMElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OMElement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (partnerTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "partnerType_type"
		   });		
		addAnnotation
		  (partnerTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "partnerType_type:Object",
			 "baseType", "partnerType_type"
		   });		
		addAnnotation
		  (positivefloatEDataType, 
		   source, 
		   new String[] {
			 "name", "positivefloat",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0"
		   });		
		addAnnotation
		  (positivefloatObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "positivefloat:Object",
			 "baseType", "positivefloat"
		   });		
		addAnnotation
		  (probabilityTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "probability_type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0",
			 "maxInclusive", "1"
		   });		
		addAnnotation
		  (probabilityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "probability_type:Object",
			 "baseType", "probability_type"
		   });		
		addAnnotation
		  (processingNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessingNode_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProcessingNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProcessingNodeType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Probability",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (processingOverheadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessingOverhead_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProcessingOverheadType_SoftwareResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoftwareResources",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProcessingOverheadType_Devices(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Devices",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProcessingOverheadType_OverheadMatrix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OverheadMatrix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (projectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Project_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProjectType_PerformanceScenario(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PerformanceScenario",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProjectType_ProcessingOverhead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessingOverhead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProjectType_ProjectName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Project_Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (psTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PS_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPSType_ExecutionGraph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExecutionGraph",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPSType_InterarrivalTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "InterarrivalTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPSType_NumberOfJobs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NumberOfJobs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPSType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Priority",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPSType_ScenarioName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ScenarioName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPSType_SWmodelfilename(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SWmodelfilename",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (repNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RepNode_type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRepNodeType_BasicNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BasicNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRepNodeType_ExpandedNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExpandedNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRepNodeType_LinkNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LinkNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRepNodeType_SynchronizationNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SynchronizationNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRepNodeType_ResourceRequirement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceRequirement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRepNodeType_RepetitionFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RepetitionFactor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resourceRequirementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRequirement_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (resourceRequirementType1EClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRequirement_._1_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (resourceRequirementType2EClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRequirement_._2_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (resourceRequirementType3EClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRequirement_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getResourceRequirementType3_ResourceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ResourceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResourceRequirementType3_UnitsOfService(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UnitsOfService",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resourceRequirementType4EClass, 
		   source, 
		   new String[] {
			 "name", "ResourceRequirement_._3_._type",
			 "kind", "empty"
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
		addAnnotation
		  (softwareResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SoftwareResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoftwareResourcesType_SoftwareResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoftwareResource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (softwareResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SoftwareResource_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSoftwareResourceType_ResourceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ResourceName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spePriorityTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SPE_priority_type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "1",
			 "maxInclusive", "15"
		   });		
		addAnnotation
		  (synchroNodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SynchroNode_type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSynchroNodeType_MyType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "myType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_NodeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NodeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_PartnerName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partnerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_PartnerPerfFileName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partnerPerfFileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_PartnerPerfScenarioName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partnerPerfScenarioName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_PartnerType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partnerType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSynchroNodeType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Probability",
			 "namespace", "##targetNamespace"
		   });
	}

} //DevicesPackageImpl
