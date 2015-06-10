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
 * A representation of the literals of the enumeration '<em><b>FONT STYLE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getFONT_STYLE()
 * @model
 * @generated
 */
public enum FONT_STYLE implements Enumerator
{
  /**
   * The '<em><b>BOLD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOLD_VALUE
   * @generated
   * @ordered
   */
  BOLD(0, "BOLD", "BOLD"),

  /**
   * The '<em><b>ITALIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ITALIC_VALUE
   * @generated
   * @ordered
   */
  ITALIC(1, "ITALIC", "ITALIC"),

  /**
   * The '<em><b>STRIKED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRIKED_VALUE
   * @generated
   * @ordered
   */
  STRIKED(2, "STRIKED", "STRIKED"),

  /**
   * The '<em><b>NORMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORMAL_VALUE
   * @generated
   * @ordered
   */
  NORMAL(3, "NORMAL", "NORMAL");

  /**
   * The '<em><b>BOLD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOLD
   * @model
   * @generated
   * @ordered
   */
  public static final int BOLD_VALUE = 0;

  /**
   * The '<em><b>ITALIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ITALIC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ITALIC
   * @model
   * @generated
   * @ordered
   */
  public static final int ITALIC_VALUE = 1;

  /**
   * The '<em><b>STRIKED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRIKED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRIKED
   * @model
   * @generated
   * @ordered
   */
  public static final int STRIKED_VALUE = 2;

  /**
   * The '<em><b>NORMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORMAL
   * @model
   * @generated
   * @ordered
   */
  public static final int NORMAL_VALUE = 3;

  /**
   * An array of all the '<em><b>FONT STYLE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FONT_STYLE[] VALUES_ARRAY =
    new FONT_STYLE[]
    {
      BOLD,
      ITALIC,
      STRIKED,
      NORMAL,
    };

  /**
   * A public read-only list of all the '<em><b>FONT STYLE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FONT_STYLE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FONT STYLE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FONT_STYLE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FONT_STYLE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FONT STYLE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FONT_STYLE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FONT_STYLE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FONT STYLE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FONT_STYLE get(int value)
  {
    switch (value)
    {
      case BOLD_VALUE: return BOLD;
      case ITALIC_VALUE: return ITALIC;
      case STRIKED_VALUE: return STRIKED;
      case NORMAL_VALUE: return NORMAL;
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
  private FONT_STYLE(int value, String name, String literal)
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
  
} //FONT_STYLE
