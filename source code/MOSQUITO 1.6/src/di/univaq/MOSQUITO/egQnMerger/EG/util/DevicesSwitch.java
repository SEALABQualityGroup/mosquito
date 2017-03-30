/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.util;

//ex Devices Switch


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import di.univaq.MOSQUITO.egQnMerger.EG.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage
 * @generated 
 */
public class DevicesSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesSwitch() {
		if (modelPackage == null) {
			modelPackage = DevicesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DevicesPackage.ARC_TYPE: {
				ArcType arcType = (ArcType)theEObject;
				Object result = caseArcType(arcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.BASIC_NODE_TYPE: {
				BasicNodeType basicNodeType = (BasicNodeType)theEObject;
				Object result = caseBasicNodeType(basicNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.COMPOUND_NODE_TYPE: {
				CompoundNodeType compoundNodeType = (CompoundNodeType)theEObject;
				Object result = caseCompoundNodeType(compoundNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.CPS_NODE_TYPE: {
				CPSNodeType cpsNodeType = (CPSNodeType)theEObject;
				Object result = caseCPSNodeType(cpsNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.DEVICES_TYPE: {
				DevicesType devicesType = (DevicesType)theEObject;
				Object result = caseDevicesType(devicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.DEVICE_TYPE: {
				DeviceType deviceType = (DeviceType)theEObject;
				Object result = caseDeviceType(deviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.EG_TYPE: {
				EGType egType = (EGType)theEObject;
				Object result = caseEGType(egType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.EXPANDED_NODE_TYPE: {
				ExpandedNodeType expandedNodeType = (ExpandedNodeType)theEObject;
				Object result = caseExpandedNodeType(expandedNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.LINK_NODE_TYPE: {
				LinkNodeType linkNodeType = (LinkNodeType)theEObject;
				Object result = caseLinkNodeType(linkNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.OM_ELEMENT_TYPE: {
				OMElementType omElementType = (OMElementType)theEObject;
				Object result = caseOMElementType(omElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.OVERHEAD_MATRIX_TYPE: {
				OverheadMatrixType overheadMatrixType = (OverheadMatrixType)theEObject;
				Object result = caseOverheadMatrixType(overheadMatrixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.PROCESSING_NODE_TYPE: {
				ProcessingNodeType processingNodeType = (ProcessingNodeType)theEObject;
				Object result = caseProcessingNodeType(processingNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.PROCESSING_OVERHEAD_TYPE: {
				ProcessingOverheadType processingOverheadType = (ProcessingOverheadType)theEObject;
				Object result = caseProcessingOverheadType(processingOverheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.PROJECT_TYPE: {
				ProjectType projectType = (ProjectType)theEObject;
				Object result = caseProjectType(projectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.PS_TYPE: {
				PSType psType = (PSType)theEObject;
				Object result = casePSType(psType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.REP_NODE_TYPE: {
				RepNodeType repNodeType = (RepNodeType)theEObject;
				Object result = caseRepNodeType(repNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE: {
				ResourceRequirementType resourceRequirementType = (ResourceRequirementType)theEObject;
				Object result = caseResourceRequirementType(resourceRequirementType);
				if (result == null) result = caseResourceRequirementType3(resourceRequirementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE1: {
				ResourceRequirementType1 resourceRequirementType1 = (ResourceRequirementType1)theEObject;
				Object result = caseResourceRequirementType1(resourceRequirementType1);
				if (result == null) result = caseResourceRequirementType3(resourceRequirementType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE2: {
				ResourceRequirementType2 resourceRequirementType2 = (ResourceRequirementType2)theEObject;
				Object result = caseResourceRequirementType2(resourceRequirementType2);
				if (result == null) result = caseResourceRequirementType3(resourceRequirementType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE3: {
				ResourceRequirementType3 resourceRequirementType3 = (ResourceRequirementType3)theEObject;
				Object result = caseResourceRequirementType3(resourceRequirementType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.RESOURCE_REQUIREMENT_TYPE4: {
				ResourceRequirementType4 resourceRequirementType4 = (ResourceRequirementType4)theEObject;
				Object result = caseResourceRequirementType4(resourceRequirementType4);
				if (result == null) result = caseResourceRequirementType3(resourceRequirementType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.SOFTWARE_RESOURCES_TYPE: {
				SoftwareResourcesType softwareResourcesType = (SoftwareResourcesType)theEObject;
				Object result = caseSoftwareResourcesType(softwareResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.SOFTWARE_RESOURCE_TYPE: {
				SoftwareResourceType softwareResourceType = (SoftwareResourceType)theEObject;
				Object result = caseSoftwareResourceType(softwareResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicesPackage.SYNCHRO_NODE_TYPE: {
				SynchroNodeType synchroNodeType = (SynchroNodeType)theEObject;
				Object result = caseSynchroNodeType(synchroNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArcType(ArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Basic Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Basic Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicNodeType(BasicNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Compound Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compound Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompoundNodeType(CompoundNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>CPS Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>CPS Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCPSNodeType(CPSNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevicesType(DevicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeviceType(DeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EG Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EG Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEGType(EGType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expanded Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expanded Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpandedNodeType(ExpandedNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Link Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Link Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkNodeType(LinkNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>OM Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>OM Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOMElementType(OMElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Overhead Matrix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Overhead Matrix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOverheadMatrixType(OverheadMatrixType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Processing Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Processing Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessingNodeType(ProcessingNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Processing Overhead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Processing Overhead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessingOverheadType(ProcessingOverheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Project Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProjectType(ProjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePSType(PSType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rep Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rep Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepNodeType(RepNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceRequirementType(ResourceRequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Requirement Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Requirement Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceRequirementType1(ResourceRequirementType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Requirement Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Requirement Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceRequirementType2(ResourceRequirementType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Requirement Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Requirement Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceRequirementType3(ResourceRequirementType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resource Requirement Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resource Requirement Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceRequirementType4(ResourceRequirementType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Software Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Software Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSoftwareResourcesType(SoftwareResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Software Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Software Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSoftwareResourceType(SoftwareResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Synchro Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Synchro Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchroNodeType(SynchroNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //DevicesSwitch
