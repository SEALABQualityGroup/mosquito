/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType#getSoftwareResource <em>Software Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSoftwareResourcesType()
 * @model extendedMetaData="name='SoftwareResources_._type' kind='elementOnly'"
 * @generated
 */
public interface SoftwareResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Software Resource</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Resource</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSoftwareResourcesType_SoftwareResource()
	 * @model type="Devices.SoftwareResourceType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SoftwareResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSoftwareResource();

} // SoftwareResourcesType