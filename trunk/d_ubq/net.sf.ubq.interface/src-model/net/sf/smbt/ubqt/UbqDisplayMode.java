/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Display Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqDisplayMode#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqDisplayMode#getBgColor <em>Bg Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqDisplayMode()
 * @model
 * @generated
 */
public interface UbqDisplayMode extends EObject {
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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqDisplayMode_Mode()
	 * @model containment="true"
	 * @generated
	 */
	UbqPoint getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqDisplayMode#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(UbqPoint value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' reference.
	 * @see #setBgColor(UbqColor)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqDisplayMode_BgColor()
	 * @model
	 * @generated
	 */
	UbqColor getBgColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqDisplayMode#getBgColor <em>Bg Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' reference.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(UbqColor value);

} // UbqDisplayMode
