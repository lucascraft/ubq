/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Cursor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqCursor#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqCursor#getPos <em>Pos</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqCursor#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqCursor()
 * @model
 * @generated
 */
public interface UbqCursor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqCursor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqCursor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos</em>' containment reference.
   * @see #setPos(UbqPoint)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqCursor_Pos()
   * @model containment="true"
   * @generated
   */
  UbqPoint getPos();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqCursor#getPos <em>Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos</em>' containment reference.
   * @see #getPos()
   * @generated
   */
  void setPos(UbqPoint value);

  /**
   * Returns the value of the '<em><b>Dim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' containment reference.
   * @see #setDim(UbqPoint)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqCursor_Dim()
   * @model containment="true"
   * @generated
   */
  UbqPoint getDim();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqCursor#getDim <em>Dim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dim</em>' containment reference.
   * @see #getDim()
   * @generated
   */
  void setDim(UbqPoint value);

} // UbqCursor
