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
 * A representation of the model object '<em><b>Ubq Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getNetconfs <em>Netconfs</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getOrchestrors <em>Orchestrors</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getFiducials <em>Fiducials</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getReactions <em>Reactions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getEmmiters <em>Emmiters</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getProximi <em>Proximi</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqSession#getFingers <em>Fingers</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession()
 * @model
 * @generated
 */
public interface UbqSession extends EObject
{
  /**
   * Returns the value of the '<em><b>Netconfs</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.NetConfImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Netconfs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Netconfs</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Netconfs()
   * @model containment="true"
   * @generated
   */
  EList<NetConfImport> getNetconfs();

  /**
   * Returns the value of the '<em><b>Orchestrors</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.OrchestrorImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orchestrors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orchestrors</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Orchestrors()
   * @model containment="true"
   * @generated
   */
  EList<OrchestrorImport> getOrchestrors();

  /**
   * Returns the value of the '<em><b>Display Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Mode</em>' containment reference.
   * @see #setDisplayMode(UbqDisplayMode)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_DisplayMode()
   * @model containment="true"
   * @generated
   */
  UbqDisplayMode getDisplayMode();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqSession#getDisplayMode <em>Display Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Mode</em>' containment reference.
   * @see #getDisplayMode()
   * @generated
   */
  void setDisplayMode(UbqDisplayMode value);

  /**
   * Returns the value of the '<em><b>Fiducials</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqFiducial}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fiducials</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fiducials</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Fiducials()
   * @model containment="true"
   * @generated
   */
  EList<UbqFiducial> getFiducials();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Actions()
   * @model containment="true"
   * @generated
   */
  EList<UbqAction> getActions();

  /**
   * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqReaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactions</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Reactions()
   * @model containment="true"
   * @generated
   */
  EList<UbqReaction> getReactions();

  /**
   * Returns the value of the '<em><b>Emmiters</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqEmmitedActions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Emmiters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Emmiters</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Emmiters()
   * @model containment="true"
   * @generated
   */
  EList<UbqEmmitedActions> getEmmiters();

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqHandledReactions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<UbqHandledReactions> getHandlers();

  /**
   * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqSlot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slots</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Slots()
   * @model containment="true"
   * @generated
   */
  EList<UbqSlot> getSlots();

  /**
   * Returns the value of the '<em><b>Proximi</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqProxima}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proximi</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proximi</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Proximi()
   * @model containment="true"
   * @generated
   */
  EList<UbqProxima> getProximi();

  /**
   * Returns the value of the '<em><b>Fingers</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqCursor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fingers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fingers</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqSession_Fingers()
   * @model containment="true"
   * @generated
   */
  EList<UbqCursor> getFingers();

} // UbqSession
