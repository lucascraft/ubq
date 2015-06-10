/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Font Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqFontStyle#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqFontStyle#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqFontStyle#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqFontStyle()
 * @model
 * @generated
 */
public interface UbqFontStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqFontStyle_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqFontStyle#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqFontStyle_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqFontStyle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.FONT_STYLE}.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.FONT_STYLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' attribute list.
	 * @see net.sf.smbt.ubqt.FONT_STYLE
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqFontStyle_Styles()
	 * @model unique="false"
	 * @generated
	 */
	EList<FONT_STYLE> getStyles();

} // UbqFontStyle
