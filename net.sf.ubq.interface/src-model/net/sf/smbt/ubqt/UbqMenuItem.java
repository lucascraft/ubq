/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqMenuItem#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqMenuItem#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqMenuItem#getEmitted <em>Emitted</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqMenuItem()
 * @model
 * @generated
 */
public interface UbqMenuItem extends EObject {
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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqMenuItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqMenuItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqMenuItem_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqMenuItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqMenuItem_Emitted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqEmmitedActions> getEmitted();

} // UbqMenuItem
