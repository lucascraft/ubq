/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiCursorCmd.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubqt Gui Cursor Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getCursorID <em>Cursor ID</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getX <em>X</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiCursorCmd()
 * @model
 * @generated
 */
public interface UbqtGuiCursorCmd extends UbqtGuiCmd {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT
	 * @see #setEvent(CURSOR_EVENT)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiCursorCmd_Event()
	 * @model
	 * @generated
	 */
	CURSOR_EVENT getEvent();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(CURSOR_EVENT value);

	/**
	 * Returns the value of the '<em><b>Cursor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor ID</em>' attribute.
	 * @see #setCursorID(String)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiCursorCmd_CursorID()
	 * @model
	 * @generated
	 */
	String getCursorID();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getCursorID <em>Cursor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor ID</em>' attribute.
	 * @see #getCursorID()
	 * @generated
	 */
	void setCursorID(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiCursorCmd_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiCursorCmd_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);
} // UbqtGuiCursorCmd
