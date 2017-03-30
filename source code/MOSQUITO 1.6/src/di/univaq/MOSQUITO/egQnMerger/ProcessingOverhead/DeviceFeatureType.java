/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.ProcessingOverhead;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Feature Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getDeviceFeatureType()
 * @model
 * @generated
 */
public final class DeviceFeatureType extends AbstractEnumerator {
	/**
	 * The '<em><b>FCFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FCFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FCFS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FCFS = 0;

	/**
	 * The '<em><b>Non FCFS Demand Spec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non FCFS Demand Spec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_FCFS_DEMAND_SPEC_LITERAL
	 * @model name="NonFCFSDemandSpec"
	 * @generated
	 * @ordered
	 */
	public static final int NON_FCFS_DEMAND_SPEC = 1;

	/**
	 * The '<em><b>Non FCFS Time Spec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non FCFS Time Spec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_FCFS_TIME_SPEC_LITERAL
	 * @model name="NonFCFSTimeSpec"
	 * @generated
	 * @ordered
	 */
	public static final int NON_FCFS_TIME_SPEC = 2;

	/**
	 * The '<em><b>FCFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FCFS
	 * @generated
	 * @ordered
	 */
	public static final DeviceFeatureType FCFS_LITERAL = new DeviceFeatureType(FCFS, "FCFS", "FCFS");

	/**
	 * The '<em><b>Non FCFS Demand Spec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_FCFS_DEMAND_SPEC
	 * @generated
	 * @ordered
	 */
	public static final DeviceFeatureType NON_FCFS_DEMAND_SPEC_LITERAL = new DeviceFeatureType(NON_FCFS_DEMAND_SPEC, "NonFCFSDemandSpec", "NonFCFSDemandSpec");

	/**
	 * The '<em><b>Non FCFS Time Spec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_FCFS_TIME_SPEC
	 * @generated
	 * @ordered
	 */
	public static final DeviceFeatureType NON_FCFS_TIME_SPEC_LITERAL = new DeviceFeatureType(NON_FCFS_TIME_SPEC, "NonFCFSTimeSpec", "NonFCFSTimeSpec");

	/**
	 * An array of all the '<em><b>Device Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceFeatureType[] VALUES_ARRAY =
		new DeviceFeatureType[] {
			FCFS_LITERAL,
			NON_FCFS_DEMAND_SPEC_LITERAL,
			NON_FCFS_TIME_SPEC_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Feature Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceFeatureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceFeatureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Feature Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceFeatureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceFeatureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Feature Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceFeatureType get(int value) {
		switch (value) {
			case FCFS: return FCFS_LITERAL;
			case NON_FCFS_DEMAND_SPEC: return NON_FCFS_DEMAND_SPEC_LITERAL;
			case NON_FCFS_TIME_SPEC: return NON_FCFS_TIME_SPEC_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeviceFeatureType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DeviceFeatureType
