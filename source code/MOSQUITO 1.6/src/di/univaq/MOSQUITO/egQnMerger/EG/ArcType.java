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
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getFromNode <em>From Node</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getToNode <em>To Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getArcType()
 * @model extendedMetaData="name='Arc_type' kind='empty'"
 * @generated
 */
public interface ArcType extends EObject {
	/**
	 * Returns the value of the '<em><b>From Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' attribute.
	 * @see #setFromNode(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getArcType_FromNode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='FromNode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFromNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getFromNode <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' attribute.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(String value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' attribute.
	 * @see #setToNode(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getArcType_ToNode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ToNode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getToNode();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ArcType#getToNode <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' attribute.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(String value);

} // ArcType