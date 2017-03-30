/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

//ex DevicesPackage

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
	DevicesPackage eINSTANCE = di.univaq.MOSQUITO.egQnMerger.EG.impl.DevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__FROM_NODE = 0;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TO_NODE = 1;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.BasicNodeTypeImpl <em>Basic Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.BasicNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getBasicNodeType()
	 * @generated
	 */
	int BASIC_NODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_TYPE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_TYPE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Basic Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl <em>Compound Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getCompoundNodeType()
	 * @generated
	 */
	int COMPOUND_NODE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Split Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__SPLIT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Pardo Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__PARDO_NODE = 1;

	/**
	 * The feature id for the '<em><b>Case Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__CASE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Repetition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__REPETITION_NODE = 3;

	/**
	 * The feature id for the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE__NODE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Compound Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_NODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl <em>CPS Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getCPSNodeType()
	 * @generated
	 */
	int CPS_NODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Basic Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__BASIC_NODE = 1;

	/**
	 * The feature id for the '<em><b>Expanded Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__EXPANDED_NODE = 2;

	/**
	 * The feature id for the '<em><b>Link Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__LINK_NODE = 3;

	/**
	 * The feature id for the '<em><b>Synchronization Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__SYNCHRONIZATION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE__RESOURCE_REQUIREMENT = 5;

	/**
	 * The number of structural features of the '<em>CPS Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_NODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDevicesType()
	 * @generated
	 */
	int DEVICES_TYPE = 4;

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
	int DEVICE_TYPE = 5;

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
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl <em>EG Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getEGType()
	 * @generated
	 */
	int EG_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Basic Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__BASIC_NODE = 1;

	/**
	 * The feature id for the '<em><b>Expanded Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__EXPANDED_NODE = 2;

	/**
	 * The feature id for the '<em><b>Link Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__LINK_NODE = 3;

	/**
	 * The feature id for the '<em><b>Synchronization Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__SYNCHRONIZATION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__RESOURCE_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Compound Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__COMPOUND_NODE = 6;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__ARC = 7;

	/**
	 * The feature id for the '<em><b>EGname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__EGNAME = 8;

	/**
	 * The feature id for the '<em><b>Is Main EG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__IS_MAIN_EG = 9;

	/**
	 * The feature id for the '<em><b>Modification Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__MODIFICATION_DATE_TIME = 10;

	/**
	 * The feature id for the '<em><b>Start Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__START_NODE = 11;

	/**
	 * The feature id for the '<em><b>SWmodelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE__SWMODELNAME = 12;

	/**
	 * The number of structural features of the '<em>EG Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl <em>Expanded Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getExpandedNodeType()
	 * @generated
	 */
	int EXPANDED_NODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>EGname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_NODE_TYPE__EGNAME = 0;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_NODE_TYPE__NODE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_NODE_TYPE__PROBABILITY = 2;

	/**
	 * The number of structural features of the '<em>Expanded Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANDED_NODE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl <em>Link Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getLinkNodeType()
	 * @generated
	 */
	int LINK_NODE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_TYPE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Performance Scenario Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME = 1;

	/**
	 * The feature id for the '<em><b>Performance Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME = 2;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_TYPE__PROBABILITY = 3;

	/**
	 * The number of structural features of the '<em>Link Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl <em>OM Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.OMElementTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getOMElementType()
	 * @generated
	 */
	int OM_ELEMENT_TYPE = 10;

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
	int OVERHEAD_MATRIX_TYPE = 11;

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
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingNodeTypeImpl <em>Processing Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProcessingNodeType()
	 * @generated
	 */
	int PROCESSING_NODE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_TYPE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_TYPE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Processing Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl <em>Processing Overhead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingOverheadTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProcessingOverheadType()
	 * @generated
	 */
	int PROCESSING_OVERHEAD_TYPE = 13;

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
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl <em>Project Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Performance Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__PERFORMANCE_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Processing Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__PROCESSING_OVERHEAD = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__PROJECT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Project Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl <em>PS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPSType()
	 * @generated
	 */
	int PS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Execution Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__EXECUTION_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__INTERARRIVAL_TIME = 1;

	/**
	 * The feature id for the '<em><b>Number Of Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__NUMBER_OF_JOBS = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__SCENARIO_NAME = 4;

	/**
	 * The feature id for the '<em><b>SWmodelfilename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE__SWMODELFILENAME = 5;

	/**
	 * The number of structural features of the '<em>PS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl <em>Rep Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getRepNodeType()
	 * @generated
	 */
	int REP_NODE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Basic Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__BASIC_NODE = 0;

	/**
	 * The feature id for the '<em><b>Expanded Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__EXPANDED_NODE = 1;

	/**
	 * The feature id for the '<em><b>Link Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__LINK_NODE = 2;

	/**
	 * The feature id for the '<em><b>Synchronization Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__SYNCHRONIZATION_NODE = 3;

	/**
	 * The feature id for the '<em><b>Resource Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__RESOURCE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Repetition Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE__REPETITION_FACTOR = 5;

	/**
	 * The number of structural features of the '<em>Rep Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_NODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl <em>Resource Requirement Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType3()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT_TYPE3 = 20;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Resource Requirement Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE3_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementTypeImpl <em>Resource Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE__RESOURCE_NAME = RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE__UNITS_OF_SERVICE = RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE;

	/**
	 * The number of structural features of the '<em>Resource Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE_FEATURE_COUNT = RESOURCE_REQUIREMENT_TYPE3_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType1Impl <em>Resource Requirement Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType1Impl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType1()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT_TYPE1 = 18;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE1__RESOURCE_NAME = RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE1__UNITS_OF_SERVICE = RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE;

	/**
	 * The number of structural features of the '<em>Resource Requirement Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE1_FEATURE_COUNT = RESOURCE_REQUIREMENT_TYPE3_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType2Impl <em>Resource Requirement Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType2Impl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType2()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT_TYPE2 = 19;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE2__RESOURCE_NAME = RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE2__UNITS_OF_SERVICE = RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE;

	/**
	 * The number of structural features of the '<em>Resource Requirement Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE2_FEATURE_COUNT = RESOURCE_REQUIREMENT_TYPE3_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType4Impl <em>Resource Requirement Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType4Impl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType4()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT_TYPE4 = 21;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE4__RESOURCE_NAME = RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE4__UNITS_OF_SERVICE = RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE;

	/**
	 * The number of structural features of the '<em>Resource Requirement Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_TYPE4_FEATURE_COUNT = RESOURCE_REQUIREMENT_TYPE3_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl <em>Software Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SoftwareResourcesTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSoftwareResourcesType()
	 * @generated
	 */
	int SOFTWARE_RESOURCES_TYPE = 22;

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
	int SOFTWARE_RESOURCE_TYPE = 23;

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
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl <em>Synchro Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSynchroNodeType()
	 * @generated
	 */
	int SYNCHRO_NODE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>My Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__MY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__NODE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__PARTNER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Partner Perf File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Partner Perf Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME = 4;

	/**
	 * The feature id for the '<em><b>Partner Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__PARTNER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE__PROBABILITY = 6;

	/**
	 * The number of structural features of the '<em>Synchro Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRO_NODE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType <em>Device Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureType()
	 * @generated
	 */
	int DEVICE_FEATURE_TYPE = 25;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType <em>Partner Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPartnerTypeType()
	 * @generated
	 */
	int PARTNER_TYPE_TYPE = 26;

	/**
	 * The meta object id for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType <em>Scheduling Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyType()
	 * @generated
	 */
	int SCHEDULING_POLICY_TYPE = 27;

	/**
	 * The meta object id for the '<em>Device Feature Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceFeatureTypeObject()
	 * @generated
	 */
	int DEVICE_FEATURE_TYPE_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Device Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getDeviceNameType()
	 * @generated
	 */
	int DEVICE_NAME_TYPE = 29;

	/**
	 * The meta object id for the '<em>Nonnegativefloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloat()
	 * @generated
	 */
	int NONNEGATIVEFLOAT = 30;

	/**
	 * The meta object id for the '<em>Nonnegativefloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getNonnegativefloatObject()
	 * @generated
	 */
	int NONNEGATIVEFLOAT_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Partner Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPartnerTypeTypeObject()
	 * @generated
	 */
	int PARTNER_TYPE_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Positivefloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPositivefloat()
	 * @generated
	 */
	int POSITIVEFLOAT = 33;

	/**
	 * The meta object id for the '<em>Positivefloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPositivefloatObject()
	 * @generated
	 */
	int POSITIVEFLOAT_OBJECT = 34;

	/**
	 * The meta object id for the '<em>Probability Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProbabilityType()
	 * @generated
	 */
	int PROBABILITY_TYPE = 35;

	/**
	 * The meta object id for the '<em>Probability Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProbabilityTypeObject()
	 * @generated
	 */
	int PROBABILITY_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Scheduling Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSchedulingPolicyTypeObject()
	 * @generated
	 */
	int SCHEDULING_POLICY_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Service Units Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getServiceUnitsType()
	 * @generated
	 */
	int SERVICE_UNITS_TYPE = 38;

	/**
	 * The meta object id for the '<em>SPE Priority Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSPEPriorityType()
	 * @generated
	 */
	int SPE_PRIORITY_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getFromNode()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_FromNode();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getToNode()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_ToNode();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType <em>Basic Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType
	 * @generated
	 */
	EClass getBasicNodeType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType#getNodeName()
	 * @see #getBasicNodeType()
	 * @generated
	 */
	EAttribute getBasicNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.BasicNodeType#getProbability()
	 * @see #getBasicNodeType()
	 * @generated
	 */
	EAttribute getBasicNodeType_Probability();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType <em>Compound Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType
	 * @generated
	 */
	EClass getCompoundNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getSplitNode <em>Split Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getSplitNode()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EReference getCompoundNodeType_SplitNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getPardoNode <em>Pardo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pardo Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getPardoNode()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EReference getCompoundNodeType_PardoNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getCaseNode <em>Case Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getCaseNode()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EReference getCompoundNodeType_CaseNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getRepetitionNode <em>Repetition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getRepetitionNode()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EReference getCompoundNodeType_RepetitionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Requirement</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getResourceRequirement()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EReference getCompoundNodeType_ResourceRequirement();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CompoundNodeType#getNodeName()
	 * @see #getCompoundNodeType()
	 * @generated
	 */
	EAttribute getCompoundNodeType_NodeName();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType <em>CPS Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPS Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType
	 * @generated
	 */
	EClass getCPSNodeType();

	/**
	 * Returns the meta object for the attribute list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getGroup()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EAttribute getCPSNodeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getBasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getBasicNode()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EReference getCPSNodeType_BasicNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getExpandedNode <em>Expanded Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expanded Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getExpandedNode()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EReference getCPSNodeType_ExpandedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getLinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getLinkNode()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EReference getCPSNodeType_LinkNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getSynchronizationNode <em>Synchronization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronization Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getSynchronizationNode()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EReference getCPSNodeType_SynchronizationNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Requirement</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.CPSNodeType#getResourceRequirement()
	 * @see #getCPSNodeType()
	 * @generated
	 */
	EReference getCPSNodeType_ResourceRequirement();

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
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot#getProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Project();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType <em>EG Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType
	 * @generated
	 */
	EClass getEGType();

	/**
	 * Returns the meta object for the attribute list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getGroup()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getBasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getBasicNode()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_BasicNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getExpandedNode <em>Expanded Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expanded Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getExpandedNode()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_ExpandedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getLinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getLinkNode()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_LinkNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSynchronizationNode <em>Synchronization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronization Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSynchronizationNode()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_SynchronizationNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Requirement</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getResourceRequirement()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_ResourceRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getCompoundNode <em>Compound Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getCompoundNode()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_CompoundNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getArc()
	 * @see #getEGType()
	 * @generated
	 */
	EReference getEGType_Arc();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getEGname <em>EGname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EGname</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getEGname()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_EGname();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG <em>Is Main EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main EG</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#isIsMainEG()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_IsMainEG();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getModificationDateTime <em>Modification Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date Time</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getModificationDateTime()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_ModificationDateTime();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getStartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getStartNode()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_StartNode();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSWmodelname <em>SWmodelname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SWmodelname</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.EGType#getSWmodelname()
	 * @see #getEGType()
	 * @generated
	 */
	EAttribute getEGType_SWmodelname();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType <em>Expanded Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expanded Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType
	 * @generated
	 */
	EClass getExpandedNodeType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getEGname <em>EGname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EGname</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getEGname()
	 * @see #getExpandedNodeType()
	 * @generated
	 */
	EAttribute getExpandedNodeType_EGname();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getNodeName()
	 * @see #getExpandedNodeType()
	 * @generated
	 */
	EAttribute getExpandedNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ExpandedNodeType#getProbability()
	 * @see #getExpandedNodeType()
	 * @generated
	 */
	EAttribute getExpandedNodeType_Probability();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType <em>Link Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType
	 * @generated
	 */
	EClass getLinkNodeType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getNodeName()
	 * @see #getLinkNodeType()
	 * @generated
	 */
	EAttribute getLinkNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getPerformanceScenarioFilename <em>Performance Scenario Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Scenario Filename</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getPerformanceScenarioFilename()
	 * @see #getLinkNodeType()
	 * @generated
	 */
	EAttribute getLinkNodeType_PerformanceScenarioFilename();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getPerformanceScenarioName <em>Performance Scenario Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Scenario Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getPerformanceScenarioName()
	 * @see #getLinkNodeType()
	 * @generated
	 */
	EAttribute getLinkNodeType_PerformanceScenarioName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.LinkNodeType#getProbability()
	 * @see #getLinkNodeType()
	 * @generated
	 */
	EAttribute getLinkNodeType_Probability();

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
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType <em>Processing Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType
	 * @generated
	 */
	EClass getProcessingNodeType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getNodeName()
	 * @see #getProcessingNodeType()
	 * @generated
	 */
	EAttribute getProcessingNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingNodeType#getProbability()
	 * @see #getProcessingNodeType()
	 * @generated
	 */
	EAttribute getProcessingNodeType_Probability();

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
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType
	 * @generated
	 */
	EClass getProjectType();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getPerformanceScenario <em>Performance Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Scenario</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getPerformanceScenario()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_PerformanceScenario();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProcessingOverhead <em>Processing Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Overhead</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProcessingOverhead()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_ProcessingOverhead();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProjectName()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ProjectName();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType <em>PS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType
	 * @generated
	 */
	EClass getPSType();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getExecutionGraph <em>Execution Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Graph</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getExecutionGraph()
	 * @see #getPSType()
	 * @generated
	 */
	EReference getPSType_ExecutionGraph();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime <em>Interarrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interarrival Time</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getInterarrivalTime()
	 * @see #getPSType()
	 * @generated
	 */
	EAttribute getPSType_InterarrivalTime();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getNumberOfJobs <em>Number Of Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Jobs</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getNumberOfJobs()
	 * @see #getPSType()
	 * @generated
	 */
	EAttribute getPSType_NumberOfJobs();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getPriority()
	 * @see #getPSType()
	 * @generated
	 */
	EAttribute getPSType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getScenarioName <em>Scenario Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getScenarioName()
	 * @see #getPSType()
	 * @generated
	 */
	EAttribute getPSType_ScenarioName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getSWmodelfilename <em>SWmodelfilename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SWmodelfilename</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PSType#getSWmodelfilename()
	 * @see #getPSType()
	 * @generated
	 */
	EAttribute getPSType_SWmodelfilename();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType <em>Rep Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rep Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType
	 * @generated
	 */
	EClass getRepNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getBasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getBasicNode()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EReference getRepNodeType_BasicNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getExpandedNode <em>Expanded Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expanded Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getExpandedNode()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EReference getRepNodeType_ExpandedNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getLinkNode <em>Link Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getLinkNode()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EReference getRepNodeType_LinkNode();

	/**
	 * Returns the meta object for the containment reference '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getSynchronizationNode <em>Synchronization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronization Node</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getSynchronizationNode()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EReference getRepNodeType_SynchronizationNode();

	/**
	 * Returns the meta object for the containment reference list '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Requirement</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getResourceRequirement()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EReference getRepNodeType_ResourceRequirement();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor <em>Repetition Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Factor</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.RepNodeType#getRepetitionFactor()
	 * @see #getRepNodeType()
	 * @generated
	 */
	EAttribute getRepNodeType_RepetitionFactor();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType <em>Resource Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType
	 * @generated
	 */
	EClass getResourceRequirementType();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType1 <em>Resource Requirement Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement Type1</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType1
	 * @generated
	 */
	EClass getResourceRequirementType1();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType2 <em>Resource Requirement Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement Type2</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType2
	 * @generated
	 */
	EClass getResourceRequirementType2();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3 <em>Resource Requirement Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement Type3</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3
	 * @generated
	 */
	EClass getResourceRequirementType3();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getResourceName()
	 * @see #getResourceRequirementType3()
	 * @generated
	 */
	EAttribute getResourceRequirementType3_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService <em>Units Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Of Service</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService()
	 * @see #getResourceRequirementType3()
	 * @generated
	 */
	EAttribute getResourceRequirementType3_UnitsOfService();

	/**
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType4 <em>Resource Requirement Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement Type4</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType4
	 * @generated
	 */
	EClass getResourceRequirementType4();

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
	 * Returns the meta object for class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType <em>Synchro Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchro Node Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType
	 * @generated
	 */
	EClass getSynchroNodeType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType <em>My Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getMyType()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_MyType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getNodeName()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerName <em>Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerName()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_PartnerName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfFileName <em>Partner Perf File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Perf File Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfFileName()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_PartnerPerfFileName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfScenarioName <em>Partner Perf Scenario Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Perf Scenario Name</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerPerfScenarioName()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_PartnerPerfScenarioName();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType <em>Partner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getPartnerType()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_PartnerType();

	/**
	 * Returns the meta object for the attribute '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SynchroNodeType#getProbability()
	 * @see #getSynchroNodeType()
	 * @generated
	 */
	EAttribute getSynchroNodeType_Probability();

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
	 * Returns the meta object for enum '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType <em>Partner Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partner Type Type</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @generated
	 */
	EEnum getPartnerTypeType();

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
	 * Returns the meta object for data type '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType <em>Partner Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Partner Type Type Object</em>'.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
	 * @model instanceClass="Devices.PartnerTypeType"
	 *        extendedMetaData="name='partnerType_type:Object' baseType='partnerType_type'" 
	 * @generated
	 */
	EDataType getPartnerTypeTypeObject();

	/**
	 * Returns the meta object for data type '<em>Positivefloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positivefloat</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='positivefloat' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0'" 
	 * @generated
	 */
	EDataType getPositivefloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Positivefloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positivefloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='positivefloat:Object' baseType='positivefloat'" 
	 * @generated
	 */
	EDataType getPositivefloatObject();

	/**
	 * Returns the meta object for data type '<em>Probability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Probability Type</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='probability_type' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0' maxInclusive='1'" 
	 * @generated
	 */
	EDataType getProbabilityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Probability Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Probability Type Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='probability_type:Object' baseType='probability_type'" 
	 * @generated
	 */
	EDataType getProbabilityTypeObject();

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
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>SPE Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SPE Priority Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='SPE_priority_type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='1' maxInclusive='15'" 
	 * @generated
	 */
	EDataType getSPEPriorityType();

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
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ArcTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__FROM_NODE = eINSTANCE.getArcType_FromNode();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TO_NODE = eINSTANCE.getArcType_ToNode();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.BasicNodeTypeImpl <em>Basic Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.BasicNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getBasicNodeType()
		 * @generated
		 */
		EClass BASIC_NODE_TYPE = eINSTANCE.getBasicNodeType();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE_TYPE__NODE_NAME = eINSTANCE.getBasicNodeType_NodeName();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE_TYPE__PROBABILITY = eINSTANCE.getBasicNodeType_Probability();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl <em>Compound Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.CompoundNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getCompoundNodeType()
		 * @generated
		 */
		EClass COMPOUND_NODE_TYPE = eINSTANCE.getCompoundNodeType();

		/**
		 * The meta object literal for the '<em><b>Split Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_NODE_TYPE__SPLIT_NODE = eINSTANCE.getCompoundNodeType_SplitNode();

		/**
		 * The meta object literal for the '<em><b>Pardo Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_NODE_TYPE__PARDO_NODE = eINSTANCE.getCompoundNodeType_PardoNode();

		/**
		 * The meta object literal for the '<em><b>Case Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_NODE_TYPE__CASE_NODE = eINSTANCE.getCompoundNodeType_CaseNode();

		/**
		 * The meta object literal for the '<em><b>Repetition Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_NODE_TYPE__REPETITION_NODE = eINSTANCE.getCompoundNodeType_RepetitionNode();

		/**
		 * The meta object literal for the '<em><b>Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_NODE_TYPE__RESOURCE_REQUIREMENT = eINSTANCE.getCompoundNodeType_ResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_NODE_TYPE__NODE_NAME = eINSTANCE.getCompoundNodeType_NodeName();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl <em>CPS Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.CPSNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getCPSNodeType()
		 * @generated
		 */
		EClass CPS_NODE_TYPE = eINSTANCE.getCPSNodeType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPS_NODE_TYPE__GROUP = eINSTANCE.getCPSNodeType_Group();

		/**
		 * The meta object literal for the '<em><b>Basic Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_NODE_TYPE__BASIC_NODE = eINSTANCE.getCPSNodeType_BasicNode();

		/**
		 * The meta object literal for the '<em><b>Expanded Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_NODE_TYPE__EXPANDED_NODE = eINSTANCE.getCPSNodeType_ExpandedNode();

		/**
		 * The meta object literal for the '<em><b>Link Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_NODE_TYPE__LINK_NODE = eINSTANCE.getCPSNodeType_LinkNode();

		/**
		 * The meta object literal for the '<em><b>Synchronization Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_NODE_TYPE__SYNCHRONIZATION_NODE = eINSTANCE.getCPSNodeType_SynchronizationNode();

		/**
		 * The meta object literal for the '<em><b>Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_NODE_TYPE__RESOURCE_REQUIREMENT = eINSTANCE.getCPSNodeType_ResourceRequirement();

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
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROJECT = eINSTANCE.getDocumentRoot_Project();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl <em>EG Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.EGTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getEGType()
		 * @generated
		 */
		EClass EG_TYPE = eINSTANCE.getEGType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__GROUP = eINSTANCE.getEGType_Group();

		/**
		 * The meta object literal for the '<em><b>Basic Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__BASIC_NODE = eINSTANCE.getEGType_BasicNode();

		/**
		 * The meta object literal for the '<em><b>Expanded Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__EXPANDED_NODE = eINSTANCE.getEGType_ExpandedNode();

		/**
		 * The meta object literal for the '<em><b>Link Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__LINK_NODE = eINSTANCE.getEGType_LinkNode();

		/**
		 * The meta object literal for the '<em><b>Synchronization Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__SYNCHRONIZATION_NODE = eINSTANCE.getEGType_SynchronizationNode();

		/**
		 * The meta object literal for the '<em><b>Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__RESOURCE_REQUIREMENT = eINSTANCE.getEGType_ResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Compound Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__COMPOUND_NODE = eINSTANCE.getEGType_CompoundNode();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_TYPE__ARC = eINSTANCE.getEGType_Arc();

		/**
		 * The meta object literal for the '<em><b>EGname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__EGNAME = eINSTANCE.getEGType_EGname();

		/**
		 * The meta object literal for the '<em><b>Is Main EG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__IS_MAIN_EG = eINSTANCE.getEGType_IsMainEG();

		/**
		 * The meta object literal for the '<em><b>Modification Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__MODIFICATION_DATE_TIME = eINSTANCE.getEGType_ModificationDateTime();

		/**
		 * The meta object literal for the '<em><b>Start Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__START_NODE = eINSTANCE.getEGType_StartNode();

		/**
		 * The meta object literal for the '<em><b>SWmodelname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EG_TYPE__SWMODELNAME = eINSTANCE.getEGType_SWmodelname();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl <em>Expanded Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ExpandedNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getExpandedNodeType()
		 * @generated
		 */
		EClass EXPANDED_NODE_TYPE = eINSTANCE.getExpandedNodeType();

		/**
		 * The meta object literal for the '<em><b>EGname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANDED_NODE_TYPE__EGNAME = eINSTANCE.getExpandedNodeType_EGname();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANDED_NODE_TYPE__NODE_NAME = eINSTANCE.getExpandedNodeType_NodeName();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANDED_NODE_TYPE__PROBABILITY = eINSTANCE.getExpandedNodeType_Probability();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl <em>Link Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.LinkNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getLinkNodeType()
		 * @generated
		 */
		EClass LINK_NODE_TYPE = eINSTANCE.getLinkNodeType();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_TYPE__NODE_NAME = eINSTANCE.getLinkNodeType_NodeName();

		/**
		 * The meta object literal for the '<em><b>Performance Scenario Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_TYPE__PERFORMANCE_SCENARIO_FILENAME = eINSTANCE.getLinkNodeType_PerformanceScenarioFilename();

		/**
		 * The meta object literal for the '<em><b>Performance Scenario Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_TYPE__PERFORMANCE_SCENARIO_NAME = eINSTANCE.getLinkNodeType_PerformanceScenarioName();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_NODE_TYPE__PROBABILITY = eINSTANCE.getLinkNodeType_Probability();

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
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingNodeTypeImpl <em>Processing Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProcessingNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProcessingNodeType()
		 * @generated
		 */
		EClass PROCESSING_NODE_TYPE = eINSTANCE.getProcessingNodeType();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE_TYPE__NODE_NAME = eINSTANCE.getProcessingNodeType_NodeName();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE_TYPE__PROBABILITY = eINSTANCE.getProcessingNodeType_Probability();

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
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl <em>Project Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProjectType()
		 * @generated
		 */
		EClass PROJECT_TYPE = eINSTANCE.getProjectType();

		/**
		 * The meta object literal for the '<em><b>Performance Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__PERFORMANCE_SCENARIO = eINSTANCE.getProjectType_PerformanceScenario();

		/**
		 * The meta object literal for the '<em><b>Processing Overhead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__PROCESSING_OVERHEAD = eINSTANCE.getProjectType_ProcessingOverhead();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__PROJECT_NAME = eINSTANCE.getProjectType_ProjectName();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl <em>PS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.PSTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPSType()
		 * @generated
		 */
		EClass PS_TYPE = eINSTANCE.getPSType();

		/**
		 * The meta object literal for the '<em><b>Execution Graph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_TYPE__EXECUTION_GRAPH = eINSTANCE.getPSType_ExecutionGraph();

		/**
		 * The meta object literal for the '<em><b>Interarrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_TYPE__INTERARRIVAL_TIME = eINSTANCE.getPSType_InterarrivalTime();

		/**
		 * The meta object literal for the '<em><b>Number Of Jobs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_TYPE__NUMBER_OF_JOBS = eINSTANCE.getPSType_NumberOfJobs();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_TYPE__PRIORITY = eINSTANCE.getPSType_Priority();

		/**
		 * The meta object literal for the '<em><b>Scenario Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_TYPE__SCENARIO_NAME = eINSTANCE.getPSType_ScenarioName();

		/**
		 * The meta object literal for the '<em><b>SWmodelfilename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_TYPE__SWMODELFILENAME = eINSTANCE.getPSType_SWmodelfilename();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl <em>Rep Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.RepNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getRepNodeType()
		 * @generated
		 */
		EClass REP_NODE_TYPE = eINSTANCE.getRepNodeType();

		/**
		 * The meta object literal for the '<em><b>Basic Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REP_NODE_TYPE__BASIC_NODE = eINSTANCE.getRepNodeType_BasicNode();

		/**
		 * The meta object literal for the '<em><b>Expanded Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REP_NODE_TYPE__EXPANDED_NODE = eINSTANCE.getRepNodeType_ExpandedNode();

		/**
		 * The meta object literal for the '<em><b>Link Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REP_NODE_TYPE__LINK_NODE = eINSTANCE.getRepNodeType_LinkNode();

		/**
		 * The meta object literal for the '<em><b>Synchronization Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REP_NODE_TYPE__SYNCHRONIZATION_NODE = eINSTANCE.getRepNodeType_SynchronizationNode();

		/**
		 * The meta object literal for the '<em><b>Resource Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REP_NODE_TYPE__RESOURCE_REQUIREMENT = eINSTANCE.getRepNodeType_ResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Repetition Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REP_NODE_TYPE__REPETITION_FACTOR = eINSTANCE.getRepNodeType_RepetitionFactor();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementTypeImpl <em>Resource Requirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT_TYPE = eINSTANCE.getResourceRequirementType();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType1Impl <em>Resource Requirement Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType1Impl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType1()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT_TYPE1 = eINSTANCE.getResourceRequirementType1();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType2Impl <em>Resource Requirement Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType2Impl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType2()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT_TYPE2 = eINSTANCE.getResourceRequirementType2();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl <em>Resource Requirement Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType3Impl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType3()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT_TYPE3 = eINSTANCE.getResourceRequirementType3();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT_TYPE3__RESOURCE_NAME = eINSTANCE.getResourceRequirementType3_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Units Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT_TYPE3__UNITS_OF_SERVICE = eINSTANCE.getResourceRequirementType3_UnitsOfService();

		/**
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType4Impl <em>Resource Requirement Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.ResourceRequirementType4Impl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getResourceRequirementType4()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT_TYPE4 = eINSTANCE.getResourceRequirementType4();

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
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl <em>Synchro Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.SynchroNodeTypeImpl
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSynchroNodeType()
		 * @generated
		 */
		EClass SYNCHRO_NODE_TYPE = eINSTANCE.getSynchroNodeType();

		/**
		 * The meta object literal for the '<em><b>My Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__MY_TYPE = eINSTANCE.getSynchroNodeType_MyType();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__NODE_NAME = eINSTANCE.getSynchroNodeType_NodeName();

		/**
		 * The meta object literal for the '<em><b>Partner Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__PARTNER_NAME = eINSTANCE.getSynchroNodeType_PartnerName();

		/**
		 * The meta object literal for the '<em><b>Partner Perf File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__PARTNER_PERF_FILE_NAME = eINSTANCE.getSynchroNodeType_PartnerPerfFileName();

		/**
		 * The meta object literal for the '<em><b>Partner Perf Scenario Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__PARTNER_PERF_SCENARIO_NAME = eINSTANCE.getSynchroNodeType_PartnerPerfScenarioName();

		/**
		 * The meta object literal for the '<em><b>Partner Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__PARTNER_TYPE = eINSTANCE.getSynchroNodeType_PartnerType();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRO_NODE_TYPE__PROBABILITY = eINSTANCE.getSynchroNodeType_Probability();

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
		 * The meta object literal for the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType <em>Partner Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPartnerTypeType()
		 * @generated
		 */
		EEnum PARTNER_TYPE_TYPE = eINSTANCE.getPartnerTypeType();

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
		 * The meta object literal for the '<em>Partner Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.PartnerTypeType
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPartnerTypeTypeObject()
		 * @generated
		 */
		EDataType PARTNER_TYPE_TYPE_OBJECT = eINSTANCE.getPartnerTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Positivefloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPositivefloat()
		 * @generated
		 */
		EDataType POSITIVEFLOAT = eINSTANCE.getPositivefloat();

		/**
		 * The meta object literal for the '<em>Positivefloat Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getPositivefloatObject()
		 * @generated
		 */
		EDataType POSITIVEFLOAT_OBJECT = eINSTANCE.getPositivefloatObject();

		/**
		 * The meta object literal for the '<em>Probability Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProbabilityType()
		 * @generated
		 */
		EDataType PROBABILITY_TYPE = eINSTANCE.getProbabilityType();

		/**
		 * The meta object literal for the '<em>Probability Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getProbabilityTypeObject()
		 * @generated
		 */
		EDataType PROBABILITY_TYPE_OBJECT = eINSTANCE.getProbabilityTypeObject();

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

		/**
		 * The meta object literal for the '<em>SPE Priority Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see di.univaq.MOSQUITO.egQnMerger.Devices.impl.DevicesPackageImpl#getSPEPriorityType()
		 * @generated
		 */
		EDataType SPE_PRIORITY_TYPE = eINSTANCE.getSPEPriorityType();

	}

} //DevicesPackage
