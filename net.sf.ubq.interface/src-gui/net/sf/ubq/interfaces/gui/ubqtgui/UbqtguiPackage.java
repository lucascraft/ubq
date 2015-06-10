/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtguiPackage.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiFactory
 * @model kind="package"
 * @generated
 */
public interface UbqtguiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ubqtgui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ubqtgui/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ubqtgui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbqtguiPackage eINSTANCE = net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCmdImpl <em>Ubqt Gui Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCmdImpl
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiCmd()
	 * @generated
	 */
	int UBQT_GUI_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>Ubqt Gui Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl <em>Ubqt Gui Proxima Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiProximaCmd()
	 * @generated
	 */
	int UBQT_GUI_PROXIMA_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_PROXIMA_CMD__PRIORITY = UBQT_GUI_CMD__PRIORITY;


	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_PROXIMA_CMD__EVENT = UBQT_GUI_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxima ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_PROXIMA_CMD__PROXIMA_ID = UBQT_GUI_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ubqt Gui Proxima Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_PROXIMA_CMD_FEATURE_COUNT = UBQT_GUI_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl <em>Ubqt Gui Widget Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiWidgetCmd()
	 * @generated
	 */
	int UBQT_GUI_WIDGET_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_WIDGET_CMD__PRIORITY = UBQT_GUI_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_WIDGET_CMD__EVENT = UBQT_GUI_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widget ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_WIDGET_CMD__WIDGET_ID = UBQT_GUI_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ubqt Gui Widget Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_WIDGET_CMD_FEATURE_COUNT = UBQT_GUI_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl <em>Ubqt Gui Cursor Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiCursorCmd()
	 * @generated
	 */
	int UBQT_GUI_CURSOR_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD__PRIORITY = UBQT_GUI_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD__EVENT = UBQT_GUI_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD__CURSOR_ID = UBQT_GUI_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD__X = UBQT_GUI_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD__Y = UBQT_GUI_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ubqt Gui Cursor Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQT_GUI_CURSOR_CMD_FEATURE_COUNT = UBQT_GUI_CMD_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT <em>PROXIMA EVENT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getPROXIMA_EVENT()
	 * @generated
	 */
	int PROXIMA_EVENT = 4;

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT <em>WIDGET EVENT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getWIDGET_EVENT()
	 * @generated
	 */
	int WIDGET_EVENT = 5;

	/**
	 * The meta object id for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT <em>CURSOR EVENT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getCURSOR_EVENT()
	 * @generated
	 */
	int CURSOR_EVENT = 6;


	/**
	 * Returns the meta object for class '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCmd <em>Ubqt Gui Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubqt Gui Cmd</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCmd
	 * @generated
	 */
	EClass getUbqtGuiCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd <em>Ubqt Gui Proxima Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubqt Gui Proxima Cmd</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd
	 * @generated
	 */
	EClass getUbqtGuiProximaCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getEvent()
	 * @see #getUbqtGuiProximaCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiProximaCmd_Event();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getProximaID <em>Proxima ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxima ID</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd#getProximaID()
	 * @see #getUbqtGuiProximaCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiProximaCmd_ProximaID();

	/**
	 * Returns the meta object for class '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd <em>Ubqt Gui Widget Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubqt Gui Widget Cmd</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd
	 * @generated
	 */
	EClass getUbqtGuiWidgetCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getEvent()
	 * @see #getUbqtGuiWidgetCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiWidgetCmd_Event();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getWidgetID <em>Widget ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget ID</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd#getWidgetID()
	 * @see #getUbqtGuiWidgetCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiWidgetCmd_WidgetID();

	/**
	 * Returns the meta object for class '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd <em>Ubqt Gui Cursor Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubqt Gui Cursor Cmd</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd
	 * @generated
	 */
	EClass getUbqtGuiCursorCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getEvent()
	 * @see #getUbqtGuiCursorCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiCursorCmd_Event();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getCursorID <em>Cursor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor ID</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getCursorID()
	 * @see #getUbqtGuiCursorCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiCursorCmd_CursorID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getX()
	 * @see #getUbqtGuiCursorCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiCursorCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd#getY()
	 * @see #getUbqtGuiCursorCmd()
	 * @generated
	 */
	EAttribute getUbqtGuiCursorCmd_Y();

	/**
	 * Returns the meta object for enum '{@link net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT <em>PROXIMA EVENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROXIMA EVENT</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT
	 * @generated
	 */
	EEnum getPROXIMA_EVENT();

	/**
	 * Returns the meta object for enum '{@link net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT <em>WIDGET EVENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WIDGET EVENT</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT
	 * @generated
	 */
	EEnum getWIDGET_EVENT();

	/**
	 * Returns the meta object for enum '{@link net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT <em>CURSOR EVENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CURSOR EVENT</em>'.
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT
	 * @generated
	 */
	EEnum getCURSOR_EVENT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UbqtguiFactory getUbqtguiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCmdImpl <em>Ubqt Gui Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCmdImpl
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiCmd()
		 * @generated
		 */
		EClass UBQT_GUI_CMD = eINSTANCE.getUbqtGuiCmd();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl <em>Ubqt Gui Proxima Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiProximaCmdImpl
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiProximaCmd()
		 * @generated
		 */
		EClass UBQT_GUI_PROXIMA_CMD = eINSTANCE.getUbqtGuiProximaCmd();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_PROXIMA_CMD__EVENT = eINSTANCE.getUbqtGuiProximaCmd_Event();

		/**
		 * The meta object literal for the '<em><b>Proxima ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_PROXIMA_CMD__PROXIMA_ID = eINSTANCE.getUbqtGuiProximaCmd_ProximaID();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl <em>Ubqt Gui Widget Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiWidgetCmdImpl
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiWidgetCmd()
		 * @generated
		 */
		EClass UBQT_GUI_WIDGET_CMD = eINSTANCE.getUbqtGuiWidgetCmd();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_WIDGET_CMD__EVENT = eINSTANCE.getUbqtGuiWidgetCmd_Event();

		/**
		 * The meta object literal for the '<em><b>Widget ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_WIDGET_CMD__WIDGET_ID = eINSTANCE.getUbqtGuiWidgetCmd_WidgetID();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl <em>Ubqt Gui Cursor Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtGuiCursorCmdImpl
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getUbqtGuiCursorCmd()
		 * @generated
		 */
		EClass UBQT_GUI_CURSOR_CMD = eINSTANCE.getUbqtGuiCursorCmd();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_CURSOR_CMD__EVENT = eINSTANCE.getUbqtGuiCursorCmd_Event();

		/**
		 * The meta object literal for the '<em><b>Cursor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_CURSOR_CMD__CURSOR_ID = eINSTANCE.getUbqtGuiCursorCmd_CursorID();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_CURSOR_CMD__X = eINSTANCE.getUbqtGuiCursorCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQT_GUI_CURSOR_CMD__Y = eINSTANCE.getUbqtGuiCursorCmd_Y();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT <em>PROXIMA EVENT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getPROXIMA_EVENT()
		 * @generated
		 */
		EEnum PROXIMA_EVENT = eINSTANCE.getPROXIMA_EVENT();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT <em>WIDGET EVENT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getWIDGET_EVENT()
		 * @generated
		 */
		EEnum WIDGET_EVENT = eINSTANCE.getWIDGET_EVENT();

		/**
		 * The meta object literal for the '{@link net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT <em>CURSOR EVENT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT
		 * @see net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiPackageImpl#getCURSOR_EVENT()
		 * @generated
		 */
		EEnum CURSOR_EVENT = eINSTANCE.getCURSOR_EVENT();

	}

} //UbqtguiPackage
