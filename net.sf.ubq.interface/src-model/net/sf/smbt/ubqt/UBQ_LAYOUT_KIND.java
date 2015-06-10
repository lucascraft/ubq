/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UBQ LAYOUT KIND</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getUBQ_LAYOUT_KIND()
 * @model
 * @generated
 */
public enum UBQ_LAYOUT_KIND implements Enumerator {
	/**
	 * The '<em><b>UBQ ROW LAYOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBQ_ROW_LAYOUT_VALUE
	 * @generated
	 * @ordered
	 */
	UBQ_ROW_LAYOUT(0, "UBQ_ROW_LAYOUT", "UBQ_ROW_LAYOUT"),

	/**
	 * The '<em><b>UBQ FILL LAYOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBQ_FILL_LAYOUT_VALUE
	 * @generated
	 * @ordered
	 */
	UBQ_FILL_LAYOUT(1, "UBQ_FILL_LAYOUT", "UBQ_FILL_LAYOUT");

	/**
	 * The '<em><b>UBQ ROW LAYOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UBQ ROW LAYOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBQ_ROW_LAYOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UBQ_ROW_LAYOUT_VALUE = 0;

	/**
	 * The '<em><b>UBQ FILL LAYOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UBQ FILL LAYOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBQ_FILL_LAYOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UBQ_FILL_LAYOUT_VALUE = 1;

	/**
	 * An array of all the '<em><b>UBQ LAYOUT KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UBQ_LAYOUT_KIND[] VALUES_ARRAY =
		new UBQ_LAYOUT_KIND[] {
			UBQ_ROW_LAYOUT,
			UBQ_FILL_LAYOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>UBQ LAYOUT KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UBQ_LAYOUT_KIND> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>UBQ LAYOUT KIND</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_LAYOUT_KIND get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UBQ_LAYOUT_KIND result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UBQ LAYOUT KIND</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_LAYOUT_KIND getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UBQ_LAYOUT_KIND result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UBQ LAYOUT KIND</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_LAYOUT_KIND get(int value) {
		switch (value) {
			case UBQ_ROW_LAYOUT_VALUE: return UBQ_ROW_LAYOUT;
			case UBQ_FILL_LAYOUT_VALUE: return UBQ_FILL_LAYOUT;
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
	private UBQ_LAYOUT_KIND(int value, String name, String literal) {
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
	
} //UBQ_LAYOUT_KIND
