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
 * A representation of the model object '<em><b>Software Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSoftwareResourceType()
 * @model extendedMetaData="name='SoftwareResource_._type' kind='empty'"
 * @generated
 */
public interface SoftwareResourceType extends EObject {
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
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSoftwareResourceType_ResourceName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='ResourceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.SoftwareResourceType#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // SoftwareResourceType