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
 * A representation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getPerformanceScenario <em>Performance Scenario</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProcessingOverhead <em>Processing Overhead</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProjectType()
 * @model extendedMetaData="name='Project_type' kind='elementOnly'"
 * @generated
 */
public interface ProjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link di.univaq.MOSQUITO.egQnMerger.Devices.PSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Scenario</em>' containment reference list.
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProjectType_PerformanceScenario()
	 * @model type="Devices.PSType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PerformanceScenario' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getPerformanceScenario();

	/**
	 * Returns the value of the '<em><b>Processing Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment describing your root element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing Overhead</em>' containment reference.
	 * @see #setProcessingOverhead(ProcessingOverheadType)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProjectType_ProcessingOverhead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcessingOverhead' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessingOverheadType getProcessingOverhead();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProcessingOverhead <em>Processing Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Overhead</em>' containment reference.
	 * @see #getProcessingOverhead()
	 * @generated
	 */
	void setProcessingOverhead(ProcessingOverheadType value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getProjectType_ProjectName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Project_Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link di.univaq.MOSQUITO.egQnMerger.Devices.ProjectType#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

} // ProjectType