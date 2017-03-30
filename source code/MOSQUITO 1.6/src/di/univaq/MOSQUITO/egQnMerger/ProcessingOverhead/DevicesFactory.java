/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage
 * @generated
 */
public interface DevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicesFactory eINSTANCE = di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.impl.DevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	DevicesType createDevicesType();

	/**
	 * Returns a new object of class '<em>Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Type</em>'.
	 * @generated
	 */
	DeviceType createDeviceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>OM Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OM Element Type</em>'.
	 * @generated
	 */
	OMElementType createOMElementType();

	/**
	 * Returns a new object of class '<em>Overhead Matrix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overhead Matrix Type</em>'.
	 * @generated
	 */
	OverheadMatrixType createOverheadMatrixType();

	/**
	 * Returns a new object of class '<em>Processing Overhead Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Overhead Type</em>'.
	 * @generated
	 */
	ProcessingOverheadType createProcessingOverheadType();

	/**
	 * Returns a new object of class '<em>Software Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resources Type</em>'.
	 * @generated
	 */
	SoftwareResourcesType createSoftwareResourcesType();

	/**
	 * Returns a new object of class '<em>Software Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resource Type</em>'.
	 * @generated
	 */
	SoftwareResourceType createSoftwareResourceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicesPackage getDevicesPackage();

} //DevicesFactory
