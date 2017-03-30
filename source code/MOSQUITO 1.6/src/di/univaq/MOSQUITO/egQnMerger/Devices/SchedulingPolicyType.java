/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.Devices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scheduling Policy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getSchedulingPolicyType()
 * @model
 * @generated
 */
public final class SchedulingPolicyType extends AbstractEnumerator {
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
	 * The '<em><b>PS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PS = 1;

	/**
	 * The '<em><b>IS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS = 2;

	/**
	 * The '<em><b>FCFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FCFS
	 * @generated
	 * @ordered
	 */
	public static final SchedulingPolicyType FCFS_LITERAL = new SchedulingPolicyType(FCFS, "FCFS", "FCFS");

	/**
	 * The '<em><b>PS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PS
	 * @generated
	 * @ordered
	 */
	public static final SchedulingPolicyType PS_LITERAL = new SchedulingPolicyType(PS, "PS", "PS");

	/**
	 * The '<em><b>IS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS
	 * @generated
	 * @ordered
	 */
	public static final SchedulingPolicyType IS_LITERAL = new SchedulingPolicyType(IS, "IS", "IS");

	/**
	 * An array of all the '<em><b>Scheduling Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulingPolicyType[] VALUES_ARRAY =
		new SchedulingPolicyType[] {
			FCFS_LITERAL,
			PS_LITERAL,
			IS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduling Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling Policy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyType get(int value) {
		switch (value) {
			case FCFS: return FCFS_LITERAL;
			case PS: return PS_LITERAL;
			case IS: return IS_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SchedulingPolicyType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SchedulingPolicyType
