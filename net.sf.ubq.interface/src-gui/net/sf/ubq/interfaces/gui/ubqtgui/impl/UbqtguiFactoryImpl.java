/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtguiFactoryImpl.java,v 1.1 2009/08/12 17:18:53 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui.impl;

import net.sf.ubq.interfaces.gui.ubqtgui.*;
import net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiFactory;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;
import net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqtguiFactoryImpl extends EFactoryImpl implements UbqtguiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbqtguiFactory init() {
		try {
			UbqtguiFactory theUbqtguiFactory = (UbqtguiFactory)EPackage.Registry.INSTANCE.getEFactory("http://ubqtgui/1.0"); 
			if (theUbqtguiFactory != null) {
				return theUbqtguiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UbqtguiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtguiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UbqtguiPackage.UBQT_GUI_CMD: return createUbqtGuiCmd();
			case UbqtguiPackage.UBQT_GUI_PROXIMA_CMD: return createUbqtGuiProximaCmd();
			case UbqtguiPackage.UBQT_GUI_WIDGET_CMD: return createUbqtGuiWidgetCmd();
			case UbqtguiPackage.UBQT_GUI_CURSOR_CMD: return createUbqtGuiCursorCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UbqtguiPackage.PROXIMA_EVENT:
				return createPROXIMA_EVENTFromString(eDataType, initialValue);
			case UbqtguiPackage.WIDGET_EVENT:
				return createWIDGET_EVENTFromString(eDataType, initialValue);
			case UbqtguiPackage.CURSOR_EVENT:
				return createCURSOR_EVENTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UbqtguiPackage.PROXIMA_EVENT:
				return convertPROXIMA_EVENTToString(eDataType, instanceValue);
			case UbqtguiPackage.WIDGET_EVENT:
				return convertWIDGET_EVENTToString(eDataType, instanceValue);
			case UbqtguiPackage.CURSOR_EVENT:
				return convertCURSOR_EVENTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtGuiCmd createUbqtGuiCmd() {
		UbqtGuiCmdImpl ubqtGuiCmd = new UbqtGuiCmdImpl();
		return ubqtGuiCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtGuiProximaCmd createUbqtGuiProximaCmd() {
		UbqtGuiProximaCmdImpl ubqtGuiProximaCmd = new UbqtGuiProximaCmdImpl();
		return ubqtGuiProximaCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtGuiWidgetCmd createUbqtGuiWidgetCmd() {
		UbqtGuiWidgetCmdImpl ubqtGuiWidgetCmd = new UbqtGuiWidgetCmdImpl();
		return ubqtGuiWidgetCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtGuiCursorCmd createUbqtGuiCursorCmd() {
		UbqtGuiCursorCmdImpl ubqtGuiCursorCmd = new UbqtGuiCursorCmdImpl();
		return ubqtGuiCursorCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_EVENT createPROXIMA_EVENTFromString(EDataType eDataType, String initialValue) {
		PROXIMA_EVENT result = PROXIMA_EVENT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROXIMA_EVENTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WIDGET_EVENT createWIDGET_EVENTFromString(EDataType eDataType, String initialValue) {
		WIDGET_EVENT result = WIDGET_EVENT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWIDGET_EVENTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURSOR_EVENT createCURSOR_EVENTFromString(EDataType eDataType, String initialValue) {
		CURSOR_EVENT result = CURSOR_EVENT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCURSOR_EVENTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtguiPackage getUbqtguiPackage() {
		return (UbqtguiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UbqtguiPackage getPackage() {
		return UbqtguiPackage.eINSTANCE;
	}

} //UbqtguiFactoryImpl
