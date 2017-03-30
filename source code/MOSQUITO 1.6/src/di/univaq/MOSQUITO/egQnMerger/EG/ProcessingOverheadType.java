/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.ecore.EObject;

import di.univaq.MOSQUITO.egQnMerger.EG.DevicesType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Overhead Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getSoftwareResources <em>Software Resources</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getDevices <em>Devices</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getOverheadMatrix <em>Overhead Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingOverheadType()
 * @model extendedMetaData="name='ProcessingOverhead_type' kind='elementOnly'"
 * @generated
 */
public interface ProcessingOverheadType extends EObject {
	/**
	 * Returns the value of the '<em><b>Software Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Resources</em>' containment reference.
	 * @see #setSoftwareResources(SoftwareResourcesType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingOverheadType_SoftwareResources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SoftwareResources' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftwareResourcesType getSoftwareResources();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getSoftwareResources <em>Software Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Resources</em>' containment reference.
	 * @see #getSoftwareResources()
	 * @generated
	 */
	void setSoftwareResources(SoftwareResourcesType value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment describing your root element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference.
	 * @see #setDevices(DevicesType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingOverheadType_Devices()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Devices' namespace='##targetNamespace'"
	 * @generated
	 */
	DevicesType getDevices();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getDevices <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' containment reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(DevicesType value);

	/**
	 * Returns the value of the '<em><b>Overhead Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Matrix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Matrix</em>' containment reference.
	 * @see #setOverheadMatrix(OverheadMatrixType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProcessingOverheadType_OverheadMatrix()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OverheadMatrix' namespace='##targetNamespace'"
	 * @generated
	 */
	OverheadMatrixType getOverheadMatrix();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType#getOverheadMatrix <em>Overhead Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead Matrix</em>' containment reference.
	 * @see #getOverheadMatrix()
	 * @generated
	 */
	void setOverheadMatrix(OverheadMatrixType value);

} // ProcessingOverheadType