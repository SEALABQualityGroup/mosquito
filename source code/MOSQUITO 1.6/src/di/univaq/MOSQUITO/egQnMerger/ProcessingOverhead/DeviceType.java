/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature <em>Device Feature</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceUnits <em>Service Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType()
 * @model extendedMetaData="name='Device_type' kind='empty'"
 * @generated
 */
public interface DeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Feature</b></em>' attribute.
	 * The default value is <code>"FCFS"</code>.
	 * The literals are from the enumeration {@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Feature</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see #isSetDeviceFeature()
	 * @see #unsetDeviceFeature()
	 * @see #setDeviceFeature(DeviceFeatureType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_DeviceFeature()
	 * @model default="FCFS" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='DeviceFeature' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceFeatureType getDeviceFeature();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature <em>Device Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Feature</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DeviceFeatureType
	 * @see #isSetDeviceFeature()
	 * @see #unsetDeviceFeature()
	 * @see #getDeviceFeature()
	 * @generated
	 */
	void setDeviceFeature(DeviceFeatureType value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature <em>Device Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceFeature()
	 * @see #getDeviceFeature()
	 * @see #setDeviceFeature(DeviceFeatureType)
	 * @generated
	 */
	void unsetDeviceFeature();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceFeature <em>Device Feature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Feature</em>' attribute is set.
	 * @see #unsetDeviceFeature()
	 * @see #getDeviceFeature()
	 * @see #setDeviceFeature(DeviceFeatureType)
	 * @generated
	 */
	boolean isSetDeviceFeature();

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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_DeviceName()
	 * @model unique="false" id="true" dataType="Devices.DeviceNameType" required="true"
	 *        extendedMetaData="kind='attribute' name='DeviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_Quantity()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='Quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * The default value is <code>"FCFS"</code>.
	 * The literals are from the enumeration {@link di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see #isSetSchedulingPolicy()
	 * @see #unsetSchedulingPolicy()
	 * @see #setSchedulingPolicy(SchedulingPolicyType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_SchedulingPolicy()
	 * @model default="FCFS" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='SchedulingPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	SchedulingPolicyType getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.SchedulingPolicyType
	 * @see #isSetSchedulingPolicy()
	 * @see #unsetSchedulingPolicy()
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicyType value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchedulingPolicy()
	 * @see #getSchedulingPolicy()
	 * @see #setSchedulingPolicy(SchedulingPolicyType)
	 * @generated
	 */
	void unsetSchedulingPolicy();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scheduling Policy</em>' attribute is set.
	 * @see #unsetSchedulingPolicy()
	 * @see #getSchedulingPolicy()
	 * @see #setSchedulingPolicy(SchedulingPolicyType)
	 * @generated
	 */
	boolean isSetSchedulingPolicy();

	/**
	 * Returns the value of the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time</em>' attribute.
	 * @see #isSetServiceTime()
	 * @see #unsetServiceTime()
	 * @see #setServiceTime(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_ServiceTime()
	 * @model unique="false" unsettable="true" dataType="Devices.Nonnegativefloat" required="true"
	 *        extendedMetaData="kind='attribute' name='ServiceTime' namespace='##targetNamespace'"
	 * @generated
	 */
	float getServiceTime();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' attribute.
	 * @see #isSetServiceTime()
	 * @see #unsetServiceTime()
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceTime()
	 * @see #getServiceTime()
	 * @see #setServiceTime(float)
	 * @generated
	 */
	void unsetServiceTime();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceTime <em>Service Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Time</em>' attribute is set.
	 * @see #unsetServiceTime()
	 * @see #getServiceTime()
	 * @see #setServiceTime(float)
	 * @generated
	 */
	boolean isSetServiceTime();

	/**
	 * Returns the value of the '<em><b>Service Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Units</em>' attribute.
	 * @see #setServiceUnits(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceType_ServiceUnits()
	 * @model unique="false" dataType="Devices.ServiceUnitsType" required="true"
	 *        extendedMetaData="kind='attribute' name='ServiceUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceUnits();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.DeviceType#getServiceUnits <em>Service Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Units</em>' attribute.
	 * @see #getServiceUnits()
	 * @generated
	 */
	void setServiceUnits(String value);

} // DeviceType