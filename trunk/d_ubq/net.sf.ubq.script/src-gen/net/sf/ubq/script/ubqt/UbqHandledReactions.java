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
 * A representation of the model object '<em><b>Ubq Handled Reactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqHandledReactions#getReactions <em>Reactions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqHandledReactions#getProximiAsRef <em>Proximi As Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqHandledReactions()
 * @model
 * @generated
 */
public interface UbqHandledReactions extends EObject
{
  /**
   * Returns the value of the '<em><b>Reactions</b></em>' reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqReaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reactions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactions</em>' reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqHandledReactions_Reactions()
   * @model
   * @generated
   */
  EList<UbqReaction> getReactions();

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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqHandledReactions_ProximiAsRef()
   * @model
   * @generated
   */
  EList<UbqProxima> getProximiAsRef();

} // UbqHandledReactions
