/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqAction#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqAction#getActionIDs <em>Action IDs</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqAction#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqAction()
 * @model
 * @generated
 */
public interface UbqAction extends EObject
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqAction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action IDs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action IDs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action IDs</em>' attribute list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqAction_ActionIDs()
   * @model unique="false"
   * @generated
   */
  EList<String> getActionIDs();

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqAction_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

} // UbqAction
