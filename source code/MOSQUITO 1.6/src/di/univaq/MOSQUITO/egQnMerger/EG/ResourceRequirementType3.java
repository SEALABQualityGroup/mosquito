/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirement Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService <em>Units Of Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getResourceRequirementType3()
 * @model extendedMetaData="name='ResourceRequirement_type' kind='empty'"
 * @generated
 */
public interface ResourceRequirementType3 extends EObject {
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getResourceRequirementType3_ResourceName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ResourceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

	/**
	 * Returns the value of the '<em><b>Units Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units Of Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units Of Service</em>' attribute.
	 * @see #isSetUnitsOfService()
	 * @see #unsetUnitsOfService()
	 * @see #setUnitsOfService(float)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getResourceRequirementType3_UnitsOfService()
	 * @model unique="false" unsettable="true" dataType="Devices.Nonnegativefloat" required="true"
	 *        extendedMetaData="kind='attribute' name='UnitsOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	float getUnitsOfService();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService <em>Units Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of Service</em>' attribute.
	 * @see #isSetUnitsOfService()
	 * @see #unsetUnitsOfService()
	 * @see #getUnitsOfService()
	 * @generated
	 */
	void setUnitsOfService(float value);

	/**
	 * Unsets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService <em>Units Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitsOfService()
	 * @see #getUnitsOfService()
	 * @see #setUnitsOfService(float)
	 * @generated
	 */
	void unsetUnitsOfService();

	/**
	 * Returns whether the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ResourceRequirementType3#getUnitsOfService <em>Units Of Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units Of Service</em>' attribute is set.
	 * @see #unsetUnitsOfService()
	 * @see #getUnitsOfService()
	 * @see #setUnitsOfService(float)
	 * @generated
	 */
	boolean isSetUnitsOfService();

} // ResourceRequirementType3