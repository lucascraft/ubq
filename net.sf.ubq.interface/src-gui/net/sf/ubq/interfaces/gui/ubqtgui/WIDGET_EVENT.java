/**
 * <copyright>
 * </copyright>
 *
 * $Id: WIDGET_EVENT.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WIDGET EVENT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getWIDGET_EVENT()
 * @model
 * @generated
 */
public enum WIDGET_EVENT implements Enumerator {
	/**
	 * The '<em><b>HOVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOVER_VALUE
	 * @generated
	 * @ordered
	 */
	HOVER(3, "HOVER", "HOVER"), /**
	 * The '<em><b>UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(1, "UP", "UP"),

	/**
	 * The '<em><b>ENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER(4, "ENTER", "ENTER"), /**
	 * The '<em><b>DRAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAG_VALUE
	 * @generated
	 * @ordered
	 */
	DRAG(2, "DRAG", "DRAG"),

	/**
	 * The '<em><b>LEAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	LEAVE(5, "LEAVE", "LEAVE"), /**
	 * The '<em><b>DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(0, "DOWN", "DOWN");

	/**
	 * The '<em><b>HOVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOVER_VALUE = 3;

	/**
	 * The '<em><b>UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 1;

	/**
	 * The '<em><b>ENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_VALUE = 4;

	/**
	 * The '<em><b>DRAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAG_VALUE = 2;

	/**
	 * The '<em><b>LEAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAVE_VALUE = 5;

	/**
	 * The '<em><b>DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 0;

	/**
	 * An array of all the '<em><b>WIDGET EVENT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WIDGET_EVENT[] VALUES_ARRAY =
		new WIDGET_EVENT[] {
			HOVER,
			UP,
			ENTER,
			DRAG,
			LEAVE,
			DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>WIDGET EVENT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WIDGET_EVENT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>WIDGET EVENT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WIDGET_EVENT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WIDGET_EVENT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WIDGET EVENT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WIDGET_EVENT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WIDGET_EVENT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WIDGET EVENT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WIDGET_EVENT get(int value) {
		switch (value) {
			case HOVER_VALUE: return HOVER;
			case UP_VALUE: return UP;
			case ENTER_VALUE: return ENTER;
			case DRAG_VALUE: return DRAG;
			case LEAVE_VALUE: return LEAVE;
			case DOWN_VALUE: return DOWN;
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
	private WIDGET_EVENT(int value, String name, String literal) {
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
	
} //WIDGET_EVENT
