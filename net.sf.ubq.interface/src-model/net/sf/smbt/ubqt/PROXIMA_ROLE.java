/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROXIMA ROLE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getPROXIMA_ROLE()
 * @model
 * @generated
 */
public enum PROXIMA_ROLE implements Enumerator {
	/**
	 * The '<em><b>SIN OSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_OSC_VALUE
	 * @generated
	 * @ordered
	 */
	SIN_OSC(0, "SIN_OSC", "SIN_OSC"),

	/**
	 * The '<em><b>SQR OSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQR_OSC_VALUE
	 * @generated
	 * @ordered
	 */
	SQR_OSC(1, "SQR_OSC", "SQR_OSC"),

	/**
	 * The '<em><b>TRI OSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRI_OSC_VALUE
	 * @generated
	 * @ordered
	 */
	TRI_OSC(2, "TRI_OSC", "TRI_OSC"),

	/**
	 * The '<em><b>SAW OSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAW_OSC_VALUE
	 * @generated
	 * @ordered
	 */
	SAW_OSC(3, "SAW_OSC", "SAW_OSC"),

	/**
	 * The '<em><b>SAMPLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLER_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLER(4, "SAMPLER", "SAMPLER"),

	/**
	 * The '<em><b>SEQUENCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCER_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCER(5, "SEQUENCER", "SEQUENCER"),

	/**
	 * The '<em><b>TEMPO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPO_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPO(6, "TEMPO", "TEMPO"),

	/**
	 * The '<em><b>PHASOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASOR_VALUE
	 * @generated
	 * @ordered
	 */
	PHASOR(7, "PHASOR", "PHASOR"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(8, "NONE", "NONE");

	/**
	 * The '<em><b>SIN OSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIN OSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIN_OSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIN_OSC_VALUE = 0;

	/**
	 * The '<em><b>SQR OSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQR OSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQR_OSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQR_OSC_VALUE = 1;

	/**
	 * The '<em><b>TRI OSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRI OSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRI_OSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRI_OSC_VALUE = 2;

	/**
	 * The '<em><b>SAW OSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAW OSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAW_OSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAW_OSC_VALUE = 3;

	/**
	 * The '<em><b>SAMPLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMPLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLER_VALUE = 4;

	/**
	 * The '<em><b>SEQUENCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQUENCER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCER_VALUE = 5;

	/**
	 * The '<em><b>TEMPO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPO_VALUE = 6;

	/**
	 * The '<em><b>PHASOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHASOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHASOR_VALUE = 7;

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
	public static final int NONE_VALUE = 8;

	/**
	 * An array of all the '<em><b>PROXIMA ROLE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PROXIMA_ROLE[] VALUES_ARRAY =
		new PROXIMA_ROLE[] {
			SIN_OSC,
			SQR_OSC,
			TRI_OSC,
			SAW_OSC,
			SAMPLER,
			SEQUENCER,
			TEMPO,
			PHASOR,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>PROXIMA ROLE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PROXIMA_ROLE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PROXIMA ROLE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_ROLE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_ROLE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA ROLE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_ROLE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_ROLE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA ROLE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_ROLE get(int value) {
		switch (value) {
			case SIN_OSC_VALUE: return SIN_OSC;
			case SQR_OSC_VALUE: return SQR_OSC;
			case TRI_OSC_VALUE: return TRI_OSC;
			case SAW_OSC_VALUE: return SAW_OSC;
			case SAMPLER_VALUE: return SAMPLER;
			case SEQUENCER_VALUE: return SEQUENCER;
			case TEMPO_VALUE: return TEMPO;
			case PHASOR_VALUE: return PHASOR;
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
	private PROXIMA_ROLE(int value, String name, String literal) {
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
	
} //PROXIMA_ROLE
