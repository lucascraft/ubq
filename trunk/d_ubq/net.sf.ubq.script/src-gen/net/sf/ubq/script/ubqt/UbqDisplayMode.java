/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Display Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqDisplayMode#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqDisplayMode()
 * @model
 * @generated
 */
public interface UbqDisplayMode extends EObject
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' containment reference.
   * @see #setMode(UbqPoint)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqDisplayMode_Mode()
   * @model containment="true"
   * @generated
   */
  UbqPoint getMode();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqDisplayMode#getMode <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' containment reference.
   * @see #getMode()
   * @generated
   */
  void setMode(UbqPoint value);

} // UbqDisplayMode
