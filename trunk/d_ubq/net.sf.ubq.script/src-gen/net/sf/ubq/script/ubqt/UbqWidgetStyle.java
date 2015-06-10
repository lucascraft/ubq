/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Widget Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getColorStyle <em>Color Style</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getFontStyleStyle <em>Font Style Style</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getBorderStyle <em>Border Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqWidgetStyle()
 * @model
 * @generated
 */
public interface UbqWidgetStyle extends EObject
{
  /**
   * Returns the value of the '<em><b>Color Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Style</em>' containment reference.
   * @see #setColorStyle(UbqColorStyle)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqWidgetStyle_ColorStyle()
   * @model containment="true"
   * @generated
   */
  UbqColorStyle getColorStyle();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getColorStyle <em>Color Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Style</em>' containment reference.
   * @see #getColorStyle()
   * @generated
   */
  void setColorStyle(UbqColorStyle value);

  /**
   * Returns the value of the '<em><b>Font Style Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font Style Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Style Style</em>' containment reference.
   * @see #setFontStyleStyle(UbqFontStyle)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqWidgetStyle_FontStyleStyle()
   * @model containment="true"
   * @generated
   */
  UbqFontStyle getFontStyleStyle();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getFontStyleStyle <em>Font Style Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Style Style</em>' containment reference.
   * @see #getFontStyleStyle()
   * @generated
   */
  void setFontStyleStyle(UbqFontStyle value);

  /**
   * Returns the value of the '<em><b>Border Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Style</em>' containment reference.
   * @see #setBorderStyle(UbqBorderStyle)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqWidgetStyle_BorderStyle()
   * @model containment="true"
   * @generated
   */
  UbqBorderStyle getBorderStyle();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqWidgetStyle#getBorderStyle <em>Border Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Style</em>' containment reference.
   * @see #getBorderStyle()
   * @generated
   */
  void setBorderStyle(UbqBorderStyle value);

} // UbqWidgetStyle
