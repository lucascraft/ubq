/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getParent <em>Parent</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getStyle <em>Style</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getReacted <em>Reacted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqWidget#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget()
 * @model
 * @generated
 */
public interface UbqWidget extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(UbqComposite)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Parent()
	 * @model
	 * @generated
	 */
	UbqComposite getParent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(UbqComposite value);

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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	UbqBounds getBounds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(UbqBounds value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Angle()
	 * @model
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(UbqWidgetStyle)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Style()
	 * @model containment="true"
	 * @generated
	 */
	UbqWidgetStyle getStyle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(UbqWidgetStyle value);

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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Emitted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqEmmitedActions> getEmitted();

	/**
	 * Returns the value of the '<em><b>Reacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reacted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reacted</em>' containment reference.
	 * @see #setReacted(UbqHandledReactions)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Reacted()
	 * @model containment="true"
	 * @generated
	 */
	UbqHandledReactions getReacted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getReacted <em>Reacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reacted</em>' containment reference.
	 * @see #getReacted()
	 * @generated
	 */
	void setReacted(UbqHandledReactions value);

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
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqWidget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqWidget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UbqWidget
