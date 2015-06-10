/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Border Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqBorderStyle#getTickness <em>Tickness</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqBorderStyle#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqBorderStyle()
 * @model
 * @generated
 */
public interface UbqBorderStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Tickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickness</em>' attribute.
	 * @see #setTickness(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqBorderStyle_Tickness()
	 * @model
	 * @generated
	 */
	int getTickness();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqBorderStyle#getTickness <em>Tickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tickness</em>' attribute.
	 * @see #getTickness()
	 * @generated
	 */
	void setTickness(int value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.BORDER_STYLE}.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.BORDER_STYLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' attribute list.
	 * @see net.sf.smbt.ubqt.BORDER_STYLE
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqBorderStyle_Styles()
	 * @model unique="false"
	 * @generated
	 */
	EList<BORDER_STYLE> getStyles();

} // UbqBorderStyle
