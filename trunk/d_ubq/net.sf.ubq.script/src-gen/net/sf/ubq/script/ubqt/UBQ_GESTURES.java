/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UBQ GESTURES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUBQ_GESTURES()
 * @model
 * @generated
 */
public enum UBQ_GESTURES implements Enumerator
{
  /**
   * The '<em><b>ONE SINGLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_SINGLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_SINGLE_TAP(0, "ONE_SINGLE_TAP", "ONE_SINGLE_TAP"),

  /**
   * The '<em><b>ONE DOUBLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_DOUBLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_DOUBLE_TAP(1, "ONE_DOUBLE_TAP", "ONE_DOUBLE_TAP"),

  /**
   * The '<em><b>ONE TRIPLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_TRIPLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_TRIPLE_TAP(2, "ONE_TRIPLE_TAP", "ONE_TRIPLE_TAP"),

  /**
   * The '<em><b>TWO SINGLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_SINGLE_TAP_VALUE
   * @generated
   * @ordered
   */
  TWO_SINGLE_TAP(3, "TWO_SINGLE_TAP", "TWO_SINGLE_TAP"),

  /**
   * The '<em><b>TWO DOUBLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_DOUBLE_TAP_VALUE
   * @generated
   * @ordered
   */
  TWO_DOUBLE_TAP(4, "TWO_DOUBLE_TAP", "TWO_DOUBLE_TAP"),

  /**
   * The '<em><b>TWO TRIPLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_TRIPLE_TAP_VALUE
   * @generated
   * @ordered
   */
  TWO_TRIPLE_TAP(5, "TWO_TRIPLE_TAP", "TWO_TRIPLE_TAP"),

  /**
   * The '<em><b>ONE HOLD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD(6, "ONE_HOLD", "ONE_HOLD"),

  /**
   * The '<em><b>TWO HOLD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_HOLD_VALUE
   * @generated
   * @ordered
   */
  TWO_HOLD(7, "TWO_HOLD", "TWO_HOLD"),

  /**
   * The '<em><b>THREE HOLD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THREE_HOLD_VALUE
   * @generated
   * @ordered
   */
  THREE_HOLD(8, "THREE_HOLD", "THREE_HOLD"),

  /**
   * The '<em><b>ONE DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_DRAG_VALUE
   * @generated
   * @ordered
   */
  ONE_DRAG(9, "ONE_DRAG", "ONE_DRAG"),

  /**
   * The '<em><b>TWO DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_DRAG_VALUE
   * @generated
   * @ordered
   */
  TWO_DRAG(10, "TWO_DRAG", "TWO_DRAG"),

  /**
   * The '<em><b>THREE DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THREE_DRAG_VALUE
   * @generated
   * @ordered
   */
  THREE_DRAG(11, "THREE_DRAG", "THREE_DRAG"),

  /**
   * The '<em><b>ONE HOLD ONE DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_DRAG_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_ONE_DRAG(12, "ONE_HOLD_ONE_DRAG", "ONE_HOLD_ONE_DRAG"),

  /**
   * The '<em><b>ONE HOLD TWO DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_DRAG_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_TWO_DRAG(13, "ONE_HOLD_TWO_DRAG", "ONE_HOLD_TWO_DRAG"),

  /**
   * The '<em><b>TWO HOLD ONE DRAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWO_HOLD_ONE_DRAG_VALUE
   * @generated
   * @ordered
   */
  TWO_HOLD_ONE_DRAG(14, "TWO_HOLD_ONE_DRAG", "TWO_HOLD_ONE_DRAG"),

  /**
   * The '<em><b>ONE HOLD ONE SINGLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_SINGLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_ONE_SINGLE_TAP(15, "ONE_HOLD_ONE_SINGLE_TAP", "ONE_HOLD_ONE_SINGLE_TAP"),

  /**
   * The '<em><b>ONE HOLD TWO SINGLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_SINGLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_TWO_SINGLE_TAP(16, "ONE_HOLD_TWO_SINGLE_TAP", "ONE_HOLD_TWO_SINGLE_TAP"),

  /**
   * The '<em><b>ONE HOLD ONE DOUBLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_DOUBLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_ONE_DOUBLE_TAP(17, "ONE_HOLD_ONE_DOUBLE_TAP", "ONE_HOLD_ONE_DOUBLE_TAP"),

  /**
   * The '<em><b>ONE HOLD TWO DOUBLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_DOUBLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_TWO_DOUBLE_TAP(18, "ONE_HOLD_TWO_DOUBLE_TAP", "ONE_HOLD_TWO_DOUBLE_TAP"),

  /**
   * The '<em><b>ONE HOLD ONE TRIPLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_TRIPLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_ONE_TRIPLE_TAP(19, "ONE_HOLD_ONE_TRIPLE_TAP", "ONE_HOLD_ONE_TRIPLE_TAP"),

  /**
   * The '<em><b>ONE HOLD TWO TRIPLE TAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_TRIPLE_TAP_VALUE
   * @generated
   * @ordered
   */
  ONE_HOLD_TWO_TRIPLE_TAP(20, "ONE_HOLD_TWO_TRIPLE_TAP", "ONE_HOLD_TWO_TRIPLE_TAP"),

  /**
   * The '<em><b>VALID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALID_VALUE
   * @generated
   * @ordered
   */
  VALID(21, "VALID", "VALID"),

  /**
   * The '<em><b>DISCARDED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISCARDED_VALUE
   * @generated
   * @ordered
   */
  DISCARDED(22, "DISCARDED", "DISCARDED");

  /**
   * The '<em><b>ONE SINGLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE SINGLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_SINGLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_SINGLE_TAP_VALUE = 0;

  /**
   * The '<em><b>ONE DOUBLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE DOUBLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_DOUBLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_DOUBLE_TAP_VALUE = 1;

  /**
   * The '<em><b>ONE TRIPLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE TRIPLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_TRIPLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_TRIPLE_TAP_VALUE = 2;

  /**
   * The '<em><b>TWO SINGLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO SINGLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_SINGLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_SINGLE_TAP_VALUE = 3;

  /**
   * The '<em><b>TWO DOUBLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO DOUBLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_DOUBLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_DOUBLE_TAP_VALUE = 4;

  /**
   * The '<em><b>TWO TRIPLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO TRIPLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_TRIPLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_TRIPLE_TAP_VALUE = 5;

  /**
   * The '<em><b>ONE HOLD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_VALUE = 6;

  /**
   * The '<em><b>TWO HOLD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO HOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_HOLD
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_HOLD_VALUE = 7;

  /**
   * The '<em><b>THREE HOLD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>THREE HOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THREE_HOLD
   * @model
   * @generated
   * @ordered
   */
  public static final int THREE_HOLD_VALUE = 8;

  /**
   * The '<em><b>ONE DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_DRAG_VALUE = 9;

  /**
   * The '<em><b>TWO DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_DRAG_VALUE = 10;

  /**
   * The '<em><b>THREE DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>THREE DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THREE_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int THREE_DRAG_VALUE = 11;

  /**
   * The '<em><b>ONE HOLD ONE DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD ONE DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_ONE_DRAG_VALUE = 12;

  /**
   * The '<em><b>ONE HOLD TWO DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD TWO DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_TWO_DRAG_VALUE = 13;

  /**
   * The '<em><b>TWO HOLD ONE DRAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWO HOLD ONE DRAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWO_HOLD_ONE_DRAG
   * @model
   * @generated
   * @ordered
   */
  public static final int TWO_HOLD_ONE_DRAG_VALUE = 14;

  /**
   * The '<em><b>ONE HOLD ONE SINGLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD ONE SINGLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_SINGLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_ONE_SINGLE_TAP_VALUE = 15;

  /**
   * The '<em><b>ONE HOLD TWO SINGLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD TWO SINGLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_SINGLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_TWO_SINGLE_TAP_VALUE = 16;

  /**
   * The '<em><b>ONE HOLD ONE DOUBLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD ONE DOUBLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_DOUBLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_ONE_DOUBLE_TAP_VALUE = 17;

  /**
   * The '<em><b>ONE HOLD TWO DOUBLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD TWO DOUBLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_DOUBLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_TWO_DOUBLE_TAP_VALUE = 18;

  /**
   * The '<em><b>ONE HOLD ONE TRIPLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD ONE TRIPLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_ONE_TRIPLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_ONE_TRIPLE_TAP_VALUE = 19;

  /**
   * The '<em><b>ONE HOLD TWO TRIPLE TAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE HOLD TWO TRIPLE TAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_HOLD_TWO_TRIPLE_TAP
   * @model
   * @generated
   * @ordered
   */
  public static final int ONE_HOLD_TWO_TRIPLE_TAP_VALUE = 20;

  /**
   * The '<em><b>VALID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VALID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALID
   * @model
   * @generated
   * @ordered
   */
  public static final int VALID_VALUE = 21;

  /**
   * The '<em><b>DISCARDED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DISCARDED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISCARDED
   * @model
   * @generated
   * @ordered
   */
  public static final int DISCARDED_VALUE = 22;

  /**
   * An array of all the '<em><b>UBQ GESTURES</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UBQ_GESTURES[] VALUES_ARRAY =
    new UBQ_GESTURES[]
    {
      ONE_SINGLE_TAP,
      ONE_DOUBLE_TAP,
      ONE_TRIPLE_TAP,
      TWO_SINGLE_TAP,
      TWO_DOUBLE_TAP,
      TWO_TRIPLE_TAP,
      ONE_HOLD,
      TWO_HOLD,
      THREE_HOLD,
      ONE_DRAG,
      TWO_DRAG,
      THREE_DRAG,
      ONE_HOLD_ONE_DRAG,
      ONE_HOLD_TWO_DRAG,
      TWO_HOLD_ONE_DRAG,
      ONE_HOLD_ONE_SINGLE_TAP,
      ONE_HOLD_TWO_SINGLE_TAP,
      ONE_HOLD_ONE_DOUBLE_TAP,
      ONE_HOLD_TWO_DOUBLE_TAP,
      ONE_HOLD_ONE_TRIPLE_TAP,
      ONE_HOLD_TWO_TRIPLE_TAP,
      VALID,
      DISCARDED,
    };

  /**
   * A public read-only list of all the '<em><b>UBQ GESTURES</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UBQ_GESTURES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>UBQ GESTURES</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UBQ_GESTURES get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UBQ_GESTURES result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UBQ GESTURES</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UBQ_GESTURES getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UBQ_GESTURES result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UBQ GESTURES</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UBQ_GESTURES get(int value)
  {
    switch (value)
    {
      case ONE_SINGLE_TAP_VALUE: return ONE_SINGLE_TAP;
      case ONE_DOUBLE_TAP_VALUE: return ONE_DOUBLE_TAP;
      case ONE_TRIPLE_TAP_VALUE: return ONE_TRIPLE_TAP;
      case TWO_SINGLE_TAP_VALUE: return TWO_SINGLE_TAP;
      case TWO_DOUBLE_TAP_VALUE: return TWO_DOUBLE_TAP;
      case TWO_TRIPLE_TAP_VALUE: return TWO_TRIPLE_TAP;
      case ONE_HOLD_VALUE: return ONE_HOLD;
      case TWO_HOLD_VALUE: return TWO_HOLD;
      case THREE_HOLD_VALUE: return THREE_HOLD;
      case ONE_DRAG_VALUE: return ONE_DRAG;
      case TWO_DRAG_VALUE: return TWO_DRAG;
      case THREE_DRAG_VALUE: return THREE_DRAG;
      case ONE_HOLD_ONE_DRAG_VALUE: return ONE_HOLD_ONE_DRAG;
      case ONE_HOLD_TWO_DRAG_VALUE: return ONE_HOLD_TWO_DRAG;
      case TWO_HOLD_ONE_DRAG_VALUE: return TWO_HOLD_ONE_DRAG;
      case ONE_HOLD_ONE_SINGLE_TAP_VALUE: return ONE_HOLD_ONE_SINGLE_TAP;
      case ONE_HOLD_TWO_SINGLE_TAP_VALUE: return ONE_HOLD_TWO_SINGLE_TAP;
      case ONE_HOLD_ONE_DOUBLE_TAP_VALUE: return ONE_HOLD_ONE_DOUBLE_TAP;
      case ONE_HOLD_TWO_DOUBLE_TAP_VALUE: return ONE_HOLD_TWO_DOUBLE_TAP;
      case ONE_HOLD_ONE_TRIPLE_TAP_VALUE: return ONE_HOLD_ONE_TRIPLE_TAP;
      case ONE_HOLD_TWO_TRIPLE_TAP_VALUE: return ONE_HOLD_TWO_TRIPLE_TAP;
      case VALID_VALUE: return VALID;
      case DISCARDED_VALUE: return DISCARDED;
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
  private UBQ_GESTURES(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //UBQ_GESTURES
