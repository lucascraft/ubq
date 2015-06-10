/**
 */
package net.sf.smbt.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UBQ EVENTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtPackage#getUBQ_EVENTS()
 * @model
 * @generated
 */
public enum UBQ_EVENTS implements Enumerator {
	/**
	 * The '<em><b>PROXIMA ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	PROXIMA_ADD(0, "PROXIMA_ADD", "PROXIMA_ADD"),

	/**
	 * The '<em><b>PROXIMA REMOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	PROXIMA_REMOVE(1, "PROXIMA_REMOVE", "PROXIMA_REMOVE"),

	/**
	 * The '<em><b>PROXIMA UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	PROXIMA_UPDATE(2, "PROXIMA_UPDATE", "PROXIMA_UPDATE"),

	/**
	 * The '<em><b>CURSOR ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_ADD(3, "CURSOR_ADD", "CURSOR_ADD"),

	/**
	 * The '<em><b>CURSOR REMOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_REMOVE(4, "CURSOR_REMOVE", "CURSOR_REMOVE"),

	/**
	 * The '<em><b>CURSOR UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_UPDATE(5, "CURSOR_UPDATE", "CURSOR_UPDATE"),

	/**
	 * The '<em><b>WIDGET SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_SELECTION(6, "WIDGET_SELECTION", "WIDGET_SELECTION"),

	/**
	 * The '<em><b>WIDGET DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_DOWN(7, "WIDGET_DOWN", "WIDGET_DOWN"),

	/**
	 * The '<em><b>WIDGET UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_UP_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_UP(8, "WIDGET_UP", "WIDGET_UP"),

	/**
	 * The '<em><b>WIDGET DRAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_DRAG_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_DRAG(9, "WIDGET_DRAG", "WIDGET_DRAG"),

	/**
	 * The '<em><b>WIDGET ENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_ENTER(10, "WIDGET_ENTER", "WIDGET_ENTER"),

	/**
	 * The '<em><b>WIDGET LEAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_LEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_LEAVE(11, "WIDGET_LEAVE", "WIDGET_LEAVE"),

	/**
	 * The '<em><b>WIDGET HOVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDGET_HOVER_VALUE
	 * @generated
	 * @ordered
	 */
	WIDGET_HOVER(12, "WIDGET_HOVER", "WIDGET_HOVER"),

	/**
	 * The '<em><b>INPUT CMD ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_CMD_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_CMD_ADD(13, "INPUT_CMD_ADD", "INPUT_CMD_ADD");

	/**
	 * The '<em><b>PROXIMA ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXIMA ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXIMA_ADD_VALUE = 0;

	/**
	 * The '<em><b>PROXIMA REMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXIMA REMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_REMOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXIMA_REMOVE_VALUE = 1;

	/**
	 * The '<em><b>PROXIMA UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXIMA UPDATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXIMA_UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXIMA_UPDATE_VALUE = 2;

	/**
	 * The '<em><b>CURSOR ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_ADD_VALUE = 3;

	/**
	 * The '<em><b>CURSOR REMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR REMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_REMOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_REMOVE_VALUE = 4;

	/**
	 * The '<em><b>CURSOR UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR UPDATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_UPDATE_VALUE = 5;

	/**
	 * The '<em><b>WIDGET SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_SELECTION_VALUE = 6;

	/**
	 * The '<em><b>WIDGET DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_DOWN_VALUE = 7;

	/**
	 * The '<em><b>WIDGET UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_UP_VALUE = 8;

	/**
	 * The '<em><b>WIDGET DRAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET DRAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_DRAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_DRAG_VALUE = 9;

	/**
	 * The '<em><b>WIDGET ENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET ENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_ENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_ENTER_VALUE = 10;

	/**
	 * The '<em><b>WIDGET LEAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET LEAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_LEAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_LEAVE_VALUE = 11;

	/**
	 * The '<em><b>WIDGET HOVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIDGET HOVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDGET_HOVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDGET_HOVER_VALUE = 12;

	/**
	 * The '<em><b>INPUT CMD ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INPUT CMD ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT_CMD_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_CMD_ADD_VALUE = 13;

	/**
	 * An array of all the '<em><b>UBQ EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UBQ_EVENTS[] VALUES_ARRAY =
		new UBQ_EVENTS[] {
			PROXIMA_ADD,
			PROXIMA_REMOVE,
			PROXIMA_UPDATE,
			CURSOR_ADD,
			CURSOR_REMOVE,
			CURSOR_UPDATE,
			WIDGET_SELECTION,
			WIDGET_DOWN,
			WIDGET_UP,
			WIDGET_DRAG,
			WIDGET_ENTER,
			WIDGET_LEAVE,
			WIDGET_HOVER,
			INPUT_CMD_ADD,
		};

	/**
	 * A public read-only list of all the '<em><b>UBQ EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UBQ_EVENTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>UBQ EVENTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_EVENTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UBQ_EVENTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UBQ EVENTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_EVENTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UBQ_EVENTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UBQ EVENTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UBQ_EVENTS get(int value) {
		switch (value) {
			case PROXIMA_ADD_VALUE: return PROXIMA_ADD;
			case PROXIMA_REMOVE_VALUE: return PROXIMA_REMOVE;
			case PROXIMA_UPDATE_VALUE: return PROXIMA_UPDATE;
			case CURSOR_ADD_VALUE: return CURSOR_ADD;
			case CURSOR_REMOVE_VALUE: return CURSOR_REMOVE;
			case CURSOR_UPDATE_VALUE: return CURSOR_UPDATE;
			case WIDGET_SELECTION_VALUE: return WIDGET_SELECTION;
			case WIDGET_DOWN_VALUE: return WIDGET_DOWN;
			case WIDGET_UP_VALUE: return WIDGET_UP;
			case WIDGET_DRAG_VALUE: return WIDGET_DRAG;
			case WIDGET_ENTER_VALUE: return WIDGET_ENTER;
			case WIDGET_LEAVE_VALUE: return WIDGET_LEAVE;
			case WIDGET_HOVER_VALUE: return WIDGET_HOVER;
			case INPUT_CMD_ADD_VALUE: return INPUT_CMD_ADD;
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
	private UBQ_EVENTS(int value, String name, String literal) {
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
	
} //UBQ_EVENTS
