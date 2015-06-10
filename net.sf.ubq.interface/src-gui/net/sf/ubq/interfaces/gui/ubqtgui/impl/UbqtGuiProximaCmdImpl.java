/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtGuiProximaCmdImpl.java,v 1.1 2009/08/12 17:18:53 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui.impl;

import net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubqt Gui Proxima Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl#getProximaID <em>Proxima ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqtGuiProximaCmdImpl extends UbqtGuiCmdImpl implements UbqtGuiProximaCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqtGuiProximaCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_EVENT getEvent() {
		return (PROXIMA_EVENT)eGet(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(PROXIMA_EVENT newEvent) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProximaID() {
		return (Integer)eGet(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD__PROXIMA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProximaID(int newProximaID) {
		eSet(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD__PROXIMA_ID, newProximaID);
	}

} //UbqtGuiProximaCmdImpl
