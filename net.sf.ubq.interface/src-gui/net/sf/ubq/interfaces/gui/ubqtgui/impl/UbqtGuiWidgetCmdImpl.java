/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiWidgetCmdImpl.java,v 1.1 2009/08/12 17:18:53 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui.impl;

import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;
import net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubqt Gui Widget Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl#getWidgetID <em>Widget ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqtGuiWidgetCmdImpl extends UbqtGuiCmdImpl implements UbqtGuiWidgetCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqtGuiWidgetCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtguiPackage.Literals.UBQT_GUI_WIDGET_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WIDGET_EVENT getEvent() {
		return (WIDGET_EVENT)eGet(UbqtguiPackage.Literals.UBQT_GUI_WIDGET_CMD__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(WIDGET_EVENT newEvent) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_WIDGET_CMD__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetID() {
		return (String)eGet(UbqtguiPackage.Literals.UBQT_GUI_WIDGET_CMD__WIDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetID(String newWidgetID) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_WIDGET_CMD__WIDGET_ID, newWidgetID);
	}

} //UbqtGuiWidgetCmdImpl
