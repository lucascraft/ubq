/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiWidgetCmd.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubqt Gui Widget Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getWidgetID <em>Widget ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiWidgetCmd()
 * @model
 * @generated
 */
public interface UbqtGuiWidgetCmd extends UbqtGuiCmd {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT
	 * @see #setEvent(WIDGET_EVENT)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiWidgetCmd_Event()
	 * @model
	 * @generated
	 */
	WIDGET_EVENT getEvent();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(WIDGET_EVENT value);

	/**
	 * Returns the value of the '<em><b>Widget ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget ID</em>' attribute.
	 * @see #setWidgetID(String)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiWidgetCmd_WidgetID()
	 * @model
	 * @generated
	 */
	String getWidgetID();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getWidgetID <em>Widget ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget ID</em>' attribute.
	 * @see #getWidgetID()
	 * @generated
	 */
	void setWidgetID(String value);
} // UbqtGuiWidgetCmd
