/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiProximaCmd.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubqt Gui Proxima Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getProximaID <em>Proxima ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiProximaCmd()
 * @model
 * @generated
 */
public interface UbqtGuiProximaCmd extends UbqtGuiCmd {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT
	 * @see #setEvent(PROXIMA_EVENT)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiProximaCmd_Event()
	 * @model
	 * @generated
	 */
	PROXIMA_EVENT getEvent();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(PROXIMA_EVENT value);

	/**
	 * Returns the value of the '<em><b>Proxima ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxima ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxima ID</em>' attribute.
	 * @see #setProximaID(int)
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#getUbqtGuiProximaCmd_ProximaID()
	 * @model
	 * @generated
	 */
	int getProximaID();

	/**
	 * Sets the value of the '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getProximaID <em>Proxima ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxima ID</em>' attribute.
	 * @see #getProximaID()
	 * @generated
	 */
	void setProximaID(int value);
} // UbqtGuiProximaCmd
