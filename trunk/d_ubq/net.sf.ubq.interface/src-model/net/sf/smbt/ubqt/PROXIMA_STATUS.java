/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROXIMA STATUS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getPROXIMA_STATUS()
 * @model
 * @generated
 */
public enum PROXIMA_STATUS implements Enumerator {
	/**
	 * The '<em><b>DEACTIVATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEACTIVATED(0, "DEACTIVATED", "DEACTIVATED"),

	/**
	 * The '<em><b>ACTIVATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATED_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATED(1, "ACTIVATED", "ACTIVATED"),

	/**
	 * The '<em><b>DISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(2, "DISABLED", "DISABLED");

	/**
	 * The '<em><b>DEACTIVATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEACTIVATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEACTIVATED_VALUE = 0;

	/**
	 * The '<em><b>ACTIVATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATED_VALUE = 1;

	/**
	 * The '<em><b>DISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 2;

	/**
	 * An array of all the '<em><b>PROXIMA STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PROXIMA_STATUS[] VALUES_ARRAY =
		new PROXIMA_STATUS[] {
			DEACTIVATED,
			ACTIVATED,
			DISABLED,
		};

	/**
	 * A public read-only list of all the '<em><b>PROXIMA STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PROXIMA_STATUS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PROXIMA STATUS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STATUS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_STATUS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA STATUS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STATUS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_STATUS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA STATUS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STATUS get(int value) {
		switch (value) {
			case DEACTIVATED_VALUE: return DEACTIVATED;
			case ACTIVATED_VALUE: return ACTIVATED;
			case DISABLED_VALUE: return DISABLED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PROXIMA_STATUS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PROXIMA_STATUS
