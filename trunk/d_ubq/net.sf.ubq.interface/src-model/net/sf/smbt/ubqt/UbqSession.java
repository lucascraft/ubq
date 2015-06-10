/**
 */
package net.sf.smbt.ubqt;

import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.IConnectedUnit;
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
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getFiducials <em>Fiducials</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getReactions <em>Reactions</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getEmmiters <em>Emmiters</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getProximi <em>Proximi</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getFingers <em>Fingers</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getColors <em>Colors</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSession#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession()
 * @model
 * @generated
 */
public interface UbqSession extends IConnectedUnit {
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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_DisplayMode()
	 * @model containment="true"
	 * @generated
	 */
	UbqDisplayMode getDisplayMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSession#getDisplayMode <em>Display Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Mode</em>' containment reference.
	 * @see #getDisplayMode()
	 * @generated
	 */
	void setDisplayMode(UbqDisplayMode value);

	/**
	 * Returns the value of the '<em><b>Fiducials</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqFiducial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiducials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiducials</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Fiducials()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqFiducial> getFiducials();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqAction> getActions();

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Reactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqReaction> getReactions();

	/**
	 * Returns the value of the '<em><b>Emmiters</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqEmmitedActions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emmiters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emmiters</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Emmiters()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqEmmitedActions> getEmmiters();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqHandledReactions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqHandledReactions> getHandlers();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqSlot> getSlots();

	/**
	 * Returns the value of the '<em><b>Proximi</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqProxima}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proximi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proximi</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Proximi()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqProxima> getProximi();

	/**
	 * Returns the value of the '<em><b>Fingers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqCursor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fingers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingers</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Fingers()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqCursor> getFingers();

	/**
	 * Returns the value of the '<em><b>Colors</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colors</em>' reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Colors()
	 * @model
	 * @generated
	 */
	EList<UbqColor> getColors();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference.
	 * @see #setAddresses(XCPAddress)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSession_Addresses()
	 * @model
	 * @generated
	 */
	XCPAddress getAddresses();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSession#getAddresses <em>Addresses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addresses</em>' reference.
	 * @see #getAddresses()
	 * @generated
	 */
	void setAddresses(XCPAddress value);

} // UbqSession
