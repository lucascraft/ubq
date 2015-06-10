/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiCursorCmdImpl.java,v 1.1 2009/08/12 17:18:53 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui.impl;

import net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubqt Gui Cursor Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl#getCursorID <em>Cursor ID</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqtGuiCursorCmdImpl extends UbqtGuiCmdImpl implements UbqtGuiCursorCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqtGuiCursorCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURSOR_EVENT getEvent() {
		return (CURSOR_EVENT)eGet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(CURSOR_EVENT newEvent) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursorID() {
		return (String)eGet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__CURSOR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorID(String newCursorID) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__CURSOR_ID, newCursorID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return (Integer)eGet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return (Integer)eGet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD__Y, newY);
	}

} //UbqtGuiCursorCmdImpl
