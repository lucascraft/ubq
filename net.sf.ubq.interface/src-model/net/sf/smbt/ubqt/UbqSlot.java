/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqSlot#getReacted <em>Reacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot()
 * @model
 * @generated
 */
public interface UbqSlot extends EObject {
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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSlot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(UbqBounds)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	UbqBounds getBounds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSlot#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(UbqBounds value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.SLOTS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOTS
	 * @see #setPosition(SLOTS)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Position()
	 * @model
	 * @generated
	 */
	SLOTS getPosition();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSlot#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOTS
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(SLOTS value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.SLOT_KIND}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOT_KIND
	 * @see #setKind(SLOT_KIND)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Kind()
	 * @model
	 * @generated
	 */
	SLOT_KIND getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSlot#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOT_KIND
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SLOT_KIND value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.SLOT_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOT_STATUS
	 * @see #setStatus(SLOT_STATUS)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Status()
	 * @model
	 * @generated
	 */
	SLOT_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqSlot#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ubqt.SLOT_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SLOT_STATUS value);

	/**
	 * Returns the value of the '<em><b>Emitted</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqEmmitedActions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitted</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Emitted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqEmmitedActions> getEmitted();

	/**
	 * Returns the value of the '<em><b>Reacted</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqHandledReactions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reacted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reacted</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqSlot_Reacted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqHandledReactions> getReacted();

} // UbqSlot
