/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage
 * @generated
 */
public class DevicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevicesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicesSwitch modelSwitch =
		new DevicesSwitch() {
			public Object caseDevicesType(DevicesType object) {
				return createDevicesTypeAdapter();
			}
			public Object caseDeviceType(DeviceType object) {
				return createDeviceTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseOMElementType(OMElementType object) {
				return createOMElementTypeAdapter();
			}
			public Object caseOverheadMatrixType(OverheadMatrixType object) {
				return createOverheadMatrixTypeAdapter();
			}
			public Object caseProcessingOverheadType(ProcessingOverheadType object) {
				return createProcessingOverheadTypeAdapter();
			}
			public Object caseSoftwareResourcesType(SoftwareResourcesType object) {
				return createSoftwareResourcesTypeAdapter();
			}
			public Object caseSoftwareResourceType(SoftwareResourceType object) {
				return createSoftwareResourceTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesType
	 * @generated
	 */
	public Adapter createDevicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType <em>OM Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType
	 * @generated
	 */
	public Adapter createOMElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType <em>Overhead Matrix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.OverheadMatrixType
	 * @generated
	 */
	public Adapter createOverheadMatrixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType <em>Processing Overhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.ProcessingOverheadType
	 * @generated
	 */
	public Adapter createProcessingOverheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType <em>Software Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourcesType
	 * @generated
	 */
	public Adapter createSoftwareResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType <em>Software Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType
	 * @generated
	 */
	public Adapter createSoftwareResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DevicesAdapterFactory
