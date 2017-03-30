/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OM Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService <em>Amount Of Service</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOMElementType()
 * @model extendedMetaData="name='OMElement_type' kind='empty'"
 * @generated
 */
public interface OMElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Service</em>' attribute.
	 * @see #isSetAmountOfService()
	 * @see #unsetAmountOfService()
	 * @see #setAmountOfService(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOMElementType_AmountOfService()
	 * @model unique="false" unsettable="true" dataType="Devices.Nonnegativefloat" required="true"
	 *        extendedMetaData="kind='attribute' name='AmountOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	float getAmountOfService();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService <em>Amount Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Service</em>' attribute.
	 * @see #isSetAmountOfService()
	 * @see #unsetAmountOfService()
	 * @see #getAmountOfService()
	 * @generated
	 */
	void setAmountOfService(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService <em>Amount Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmountOfService()
	 * @see #getAmountOfService()
	 * @see #setAmountOfService(float)
	 * @generated
	 */
	void unsetAmountOfService();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getAmountOfService <em>Amount Of Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount Of Service</em>' attribute is set.
	 * @see #unsetAmountOfService()
	 * @see #getAmountOfService()
	 * @see #setAmountOfService(float)
	 * @generated
	 */
	boolean isSetAmountOfService();

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOMElementType_DeviceName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='DeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getOMElementType_ResourceName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ResourceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.OMElementType#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // OMElementType