/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.univaq.MOSQUITO.egQnMerger.EG;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Partner Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see di.univaq.MOSQUITO.egQnMerger.Devices.DevicesPackage#getPartnerTypeType()
 * @model
 * @generated
 */
public final class PartnerTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Synchronous Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synchronous Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONOUS_CALL_LITERAL
	 * @model name="SynchronousCall"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_CALL = 0;

	/**
	 * The '<em><b>Deferred Synchronous Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deferred Synchronous Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFERRED_SYNCHRONOUS_CALL_LITERAL
	 * @model name="DeferredSynchronousCall"
	 * @generated
	 * @ordered
	 */
	public static final int DEFERRED_SYNCHRONOUS_CALL = 1;

	/**
	 * The '<em><b>Asynchronous Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynchronous Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCHRONOUS_CALL_LITERAL
	 * @model name="AsynchronousCall"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCHRONOUS_CALL = 2;

	/**
	 * The '<em><b>No Reply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Reply</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_REPLY_LITERAL
	 * @model name="NoReply"
	 * @generated
	 * @ordered
	 */
	public static final int NO_REPLY = 3;

	/**
	 * The '<em><b>Reply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reply</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLY_LITERAL
	 * @model name="Reply"
	 * @generated
	 * @ordered
	 */
	public static final int REPLY = 4;

	/**
	 * The '<em><b>Synchronous Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONOUS_CALL
	 * @generated
	 * @ordered
	 */
	public static final PartnerTypeType SYNCHRONOUS_CALL_LITERAL = new PartnerTypeType(SYNCHRONOUS_CALL, "SynchronousCall", "SynchronousCall");

	/**
	 * The '<em><b>Deferred Synchronous Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFERRED_SYNCHRONOUS_CALL
	 * @generated
	 * @ordered
	 */
	public static final PartnerTypeType DEFERRED_SYNCHRONOUS_CALL_LITERAL = new PartnerTypeType(DEFERRED_SYNCHRONOUS_CALL, "DeferredSynchronousCall", "DeferredSynchronousCall");

	/**
	 * The '<em><b>Asynchronous Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCHRONOUS_CALL
	 * @generated
	 * @ordered
	 */
	public static final PartnerTypeType ASYNCHRONOUS_CALL_LITERAL = new PartnerTypeType(ASYNCHRONOUS_CALL, "AsynchronousCall", "AsynchronousCall");

	/**
	 * The '<em><b>No Reply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_REPLY
	 * @generated
	 * @ordered
	 */
	public static final PartnerTypeType NO_REPLY_LITERAL = new PartnerTypeType(NO_REPLY, "NoReply", "NoReply");

	/**
	 * The '<em><b>Reply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLY
	 * @generated
	 * @ordered
	 */
	public static final PartnerTypeType REPLY_LITERAL = new PartnerTypeType(REPLY, "Reply", "Reply");

	/**
	 * An array of all the '<em><b>Partner Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PartnerTypeType[] VALUES_ARRAY =
		new PartnerTypeType[] {
			SYNCHRONOUS_CALL_LITERAL,
			DEFERRED_SYNCHRONOUS_CALL_LITERAL,
			ASYNCHRONOUS_CALL_LITERAL,
			NO_REPLY_LITERAL,
			REPLY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Partner Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Partner Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartnerTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartnerTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Partner Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartnerTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartnerTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Partner Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartnerTypeType get(int value) {
		switch (value) {
			case SYNCHRONOUS_CALL: return SYNCHRONOUS_CALL_LITERAL;
			case DEFERRED_SYNCHRONOUS_CALL: return DEFERRED_SYNCHRONOUS_CALL_LITERAL;
			case ASYNCHRONOUS_CALL: return ASYNCHRONOUS_CALL_LITERAL;
			case NO_REPLY: return NO_REPLY_LITERAL;
			case REPLY: return REPLY_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PartnerTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PartnerTypeType
