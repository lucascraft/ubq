/**
 */
package net.sf.smbt.ubqt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqButton#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqButton#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqButton()
 * @model
 * @generated
 */
public interface UbqButton extends UbqWidget {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqButton_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqButton#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqButton_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqButton#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // UbqButton
