/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtguiFactory.java,v 1.1 2009/08/12 17:18:52 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage
 * @generated
 */
public interface UbqtguiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbqtguiFactory eINSTANCE = net.sf.ubq.interfaces.gui.ubqtgui.impl.UbqtguiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ubqt Gui Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubqt Gui Cmd</em>'.
	 * @generated
	 */
	UbqtGuiCmd createUbqtGuiCmd();

	/**
	 * Returns a new object of class '<em>Ubqt Gui Proxima Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubqt Gui Proxima Cmd</em>'.
	 * @generated
	 */
	UbqtGuiProximaCmd createUbqtGuiProximaCmd();

	/**
	 * Returns a new object of class '<em>Ubqt Gui Widget Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubqt Gui Widget Cmd</em>'.
	 * @generated
	 */
	UbqtGuiWidgetCmd createUbqtGuiWidgetCmd();

	/**
	 * Returns a new object of class '<em>Ubqt Gui Cursor Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubqt Gui Cursor Cmd</em>'.
	 * @generated
	 */
	UbqtGuiCursorCmd createUbqtGuiCursorCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UbqtguiPackage getUbqtguiPackage();

} //UbqtguiFactory
