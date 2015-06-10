/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PROXIMA STYLE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getPROXIMA_STYLE()
 * @model
 * @generated
 */
public enum PROXIMA_STYLE implements Enumerator {
	/**
	 * The '<em><b>DISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISC_VALUE
	 * @generated
	 * @ordered
	 */
	DISC(0, "DISC", "DISC"),

	/**
	 * The '<em><b>SQUARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(1, "SQUARE", "SQUARE"),

	/**
	 * The '<em><b>HEXAGON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON_VALUE
	 * @generated
	 * @ordered
	 */
	HEXAGON(2, "HEXAGON", "HEXAGON"),

	/**
	 * The '<em><b>OCTOSTAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTOSTAR_VALUE
	 * @generated
	 * @ordered
	 */
	OCTOSTAR(3, "OCTOSTAR", "OCTOSTAR"),

	/**
	 * The '<em><b>HEXASTAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXASTAR_VALUE
	 * @generated
	 * @ordered
	 */
	HEXASTAR(4, "HEXASTAR", "HEXASTAR"),

	/**
	 * The '<em><b>OCTOGON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTOGON_VALUE
	 * @generated
	 * @ordered
	 */
	OCTOGON(5, "OCTOGON", "OCTOGON");

	/**
	 * The '<em><b>DISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISC_VALUE = 0;

	/**
	 * The '<em><b>SQUARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQUARE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 1;

	/**
	 * The '<em><b>HEXAGON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEXAGON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEXAGON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXAGON_VALUE = 2;

	/**
	 * The '<em><b>OCTOSTAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCTOSTAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTOSTAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCTOSTAR_VALUE = 3;

	/**
	 * The '<em><b>HEXASTAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEXASTAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEXASTAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXASTAR_VALUE = 4;

	/**
	 * The '<em><b>OCTOGON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCTOGON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTOGON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCTOGON_VALUE = 5;

	/**
	 * An array of all the '<em><b>PROXIMA STYLE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PROXIMA_STYLE[] VALUES_ARRAY =
		new PROXIMA_STYLE[] {
			DISC,
			SQUARE,
			HEXAGON,
			OCTOSTAR,
			HEXASTAR,
			OCTOGON,
		};

	/**
	 * A public read-only list of all the '<em><b>PROXIMA STYLE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PROXIMA_STYLE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PROXIMA STYLE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STYLE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_STYLE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA STYLE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STYLE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PROXIMA_STYLE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PROXIMA STYLE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PROXIMA_STYLE get(int value) {
		switch (value) {
			case DISC_VALUE: return DISC;
			case SQUARE_VALUE: return SQUARE;
			case HEXAGON_VALUE: return HEXAGON;
			case OCTOSTAR_VALUE: return OCTOSTAR;
			case HEXASTAR_VALUE: return HEXASTAR;
			case OCTOGON_VALUE: return OCTOGON;
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
	private PROXIMA_STYLE(int value, String name, String literal) {
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
	
} //PROXIMA_STYLE
