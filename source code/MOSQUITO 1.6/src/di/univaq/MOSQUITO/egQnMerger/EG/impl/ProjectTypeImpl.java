/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import di.univaq.MOSQUITO.egQnMerger.EG.DevicesPackage;
import di.univaq.MOSQUITO.egQnMerger.EG.PSType;
import di.univaq.MOSQUITO.egQnMerger.EG.ProcessingOverheadType;
import di.univaq.MOSQUITO.egQnMerger.EG.ProjectType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl#getPerformanceScenario <em>Performance Scenario</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl#getProcessingOverhead <em>Processing Overhead</em>}</li>
 *   <li>{@link di.univaq.MOSQUITO.egQnMerger.Devices.impl.ProjectTypeImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectTypeImpl extends EObjectImpl implements ProjectType {
	/**
	 * The cached value of the '{@link #getPerformanceScenario() <em>Performance Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceScenario()
	 * @generated
	 * @ordered
	 */
	protected EList performanceScenario = null;

	/**
	 * The cached value of the '{@link #getProcessingOverhead() <em>Processing Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingOverhead()
	 * @generated
	 * @ordered
	 */
	protected ProcessingOverheadType processingOverhead = null;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.PROJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPerformanceScenario() {
		if (performanceScenario == null) {
			performanceScenario = new EObjectContainmentEList(PSType.class, this, DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO);
		}
		return performanceScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingOverheadType getProcessingOverhead() {
		return processingOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingOverhead(ProcessingOverheadType newProcessingOverhead, NotificationChain msgs) {
		ProcessingOverheadType oldProcessingOverhead = processingOverhead;
		processingOverhead = newProcessingOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD, oldProcessingOverhead, newProcessingOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingOverhead(ProcessingOverheadType newProcessingOverhead) {
		if (newProcessingOverhead != processingOverhead) {
			NotificationChain msgs = null;
			if (processingOverhead != null)
				msgs = ((InternalEObject)processingOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD, null, msgs);
			if (newProcessingOverhead != null)
				msgs = ((InternalEObject)newProcessingOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD, null, msgs);
			msgs = basicSetProcessingOverhead(newProcessingOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD, newProcessingOverhead, newProcessingOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.PROJECT_TYPE__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO:
				return ((InternalEList)getPerformanceScenario()).basicRemove(otherEnd, msgs);
			case DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD:
				return basicSetProcessingOverhead(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO:
				return getPerformanceScenario();
			case DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD:
				return getProcessingOverhead();
			case DevicesPackage.PROJECT_TYPE__PROJECT_NAME:
				return getProjectName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO:
				getPerformanceScenario().clear();
				getPerformanceScenario().addAll((Collection)newValue);
				return;
			case DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD:
				setProcessingOverhead((ProcessingOverheadType)newValue);
				return;
			case DevicesPackage.PROJECT_TYPE__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO:
				getPerformanceScenario().clear();
				return;
			case DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD:
				setProcessingOverhead((ProcessingOverheadType)null);
				return;
			case DevicesPackage.PROJECT_TYPE__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevicesPackage.PROJECT_TYPE__PERFORMANCE_SCENARIO:
				return performanceScenario != null && !performanceScenario.isEmpty();
			case DevicesPackage.PROJECT_TYPE__PROCESSING_OVERHEAD:
				return processingOverhead != null;
			case DevicesPackage.PROJECT_TYPE__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //ProjectTypeImpl