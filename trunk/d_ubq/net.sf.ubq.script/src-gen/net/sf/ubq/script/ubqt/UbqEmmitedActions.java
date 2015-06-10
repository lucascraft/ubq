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
 * A representation of the model object '<em><b>Ubq Emmited Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqEmmitedActions#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqEmmitedActions#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqEmmitedActions#getProximiAsRef <em>Proximi As Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqEmmitedActions()
 * @model
 * @generated
 */
public interface UbqEmmitedActions extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqEmmitedActions_Actions()
   * @model
   * @generated
   */
  EList<UbqAction> getActions();

  /**
   * Returns the value of the '<em><b>Events</b></em>' attribute list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UBQ_EVENTS}.
   * The literals are from the enumeration {@link net.sf.ubq.script.ubqt.UBQ_EVENTS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' attribute list.
   * @see net.sf.ubq.script.ubqt.UBQ_EVENTS
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqEmmitedActions_Events()
   * @model unique="false"
   * @generated
   */
  EList<UBQ_EVENTS> getEvents();

  /**
   * Returns the value of the '<em><b>Proximi As Ref</b></em>' reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqProxima}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proximi As Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proximi As Ref</em>' reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqEmmitedActions_ProximiAsRef()
   * @model
   * @generated
   */
  EList<UbqProxima> getProximiAsRef();

} // UbqEmmitedActions
