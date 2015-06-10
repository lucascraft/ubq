/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROXIMA FUNCTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getPROXIMA_FUNCTION()
 * @model
 * @generated
 */
public enum PROXIMA_FUNCTION implements Enumerator {
	/**
	 * The '<em><b>KNOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOB_VALUE
	 * @generated
	 * @ordered
	 */
	KNOB(0, "KNOB", "KNOB"),

	/**
	 * The '<em><b>GATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE_VALUE
	 * @generated
	 * @ordered
	 */
	GATE(1, "GATE", "GATE"),

	/**
	 * The '<em><b>SWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(2, "SWITCH", "SWITCH"),

	/**
	 * The '<em><b>TOGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOGGLE(3, "TOGGLE", "TOGGLE"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "NONE", "NONE");

	/**
	 * The '<em><b>KNOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KNOB_VALUE = 0;

	/**
	 * The '<em><b>GATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATE_VALUE = 1;

	/**
	 * The '<em><b>SWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 2;

	/**
	 * The '<em><b>TOGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOGGLE_VALUE = 3;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>PROXIMA FUNCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PROXIMA_FUNCTION[] VALUES_ARRAY =
		new PROXIMA_FUNCTION[] {
			KNOB,
			GATE,
			SWITCH,
			TOGGLE,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>PROXIMA FUNCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PROXIMA_FUNCTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PROXIMA FUNCTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_FUNCTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_FUNCTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA FUNCTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_FUNCTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_FUNCTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA FUNCTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_FUNCTION get(int value) {
		switch (value) {
			case KNOB_VALUE: return KNOB;
			case GATE_VALUE: return GATE;
			case SWITCH_VALUE: return SWITCH;
			case TOGGLE_VALUE: return TOGGLE;
			case NONE_VALUE: return NONE;
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
	private PROXIMA_FUNCTION(int value, String name, String literal) {
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
	
} //PROXIMA_FUNCTION
