/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overhead Matrix Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType#getOMElement <em>OM Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOverheadMatrixType()
 * @model extendedMetaData="name='OverheadMatrix_type' kind='elementOnly'"
 * @generated
 */
public interface OverheadMatrixType extends EObject {
	/**
	 * Returns the value of the '<em><b>OM Element</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM Element</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOverheadMatrixType_OMElement()
	 * @model type="Devices.OMElementType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OMElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getOMElement();

} // OverheadMatrixType