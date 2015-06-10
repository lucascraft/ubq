/**
 * <copyright>
 * </copyright>
 *
 * $Id: UbqtguiPackageImpl.java,v 1.1 2009/08/12 17:18:53 lucascraft Exp $
 */
package net.sf.ubq.interfaces.gui.ubqtgui.impl;

import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiFactory;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqtguiPackageImpl extends EPackageImpl implements UbqtguiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubqtGuiCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubqtGuiProximaCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubqtGuiWidgetCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubqtGuiCursorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum proximA_EVENTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum widgeT_EVENTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cursoR_EVENTEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UbqtguiPackageImpl() {
		super(eNS_URI, UbqtguiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UbqtguiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UbqtguiPackage init() {
		if (isInited) return (UbqtguiPackage)EPackage.Registry.INSTANCE.getEPackage(UbqtguiPackage.eNS_URI);

		// Obtain or create and register package
		UbqtguiPackageImpl theUbqtguiPackage = (UbqtguiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UbqtguiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UbqtguiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUbqtguiPackage.createPackageContents();

		// Initialize created meta-data
		theUbqtguiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUbqtguiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UbqtguiPackage.eNS_URI, theUbqtguiPackage);
		return theUbqtguiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbqtGuiCmd() {
		return ubqtGuiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbqtGuiProximaCmd() {
		return ubqtGuiProximaCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiProximaCmd_Event() {
		return (EAttribute)ubqtGuiProximaCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiProximaCmd_ProximaID() {
		return (EAttribute)ubqtGuiProximaCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbqtGuiWidgetCmd() {
		return ubqtGuiWidgetCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiWidgetCmd_Event() {
		return (EAttribute)ubqtGuiWidgetCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiWidgetCmd_WidgetID() {
		return (EAttribute)ubqtGuiWidgetCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbqtGuiCursorCmd() {
		return ubqtGuiCursorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiCursorCmd_Event() {
		return (EAttribute)ubqtGuiCursorCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiCursorCmd_CursorID() {
		return (EAttribute)ubqtGuiCursorCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiCursorCmd_X() {
		return (EAttribute)ubqtGuiCursorCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbqtGuiCursorCmd_Y() {
		return (EAttribute)ubqtGuiCursorCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPROXIMA_EVENT() {
		return proximA_EVENTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWIDGET_EVENT() {
		return widgeT_EVENTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCURSOR_EVENT() {
		return cursoR_EVENTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtguiFactory getUbqtguiFactory() {
		return (UbqtguiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ubqtGuiCmdEClass = createEClass(UBQT_GUI_CMD);

		ubqtGuiProximaCmdEClass = createEClass(UBQT_GUI_PROXIMA_CMD);
		createEAttribute(ubqtGuiProximaCmdEClass, UBQT_GUI_PROXIMA_CMD__EVENT);
		createEAttribute(ubqtGuiProximaCmdEClass, UBQT_GUI_PROXIMA_CMD__PROXIMA_ID);

		ubqtGuiWidgetCmdEClass = createEClass(UBQT_GUI_WIDGET_CMD);
		createEAttribute(ubqtGuiWidgetCmdEClass, UBQT_GUI_WIDGET_CMD__EVENT);
		createEAttribute(ubqtGuiWidgetCmdEClass, UBQT_GUI_WIDGET_CMD__WIDGET_ID);

		ubqtGuiCursorCmdEClass = createEClass(UBQT_GUI_CURSOR_CMD);
		createEAttribute(ubqtGuiCursorCmdEClass, UBQT_GUI_CURSOR_CMD__EVENT);
		createEAttribute(ubqtGuiCursorCmdEClass, UBQT_GUI_CURSOR_CMD__CURSOR_ID);
		createEAttribute(ubqtGuiCursorCmdEClass, UBQT_GUI_CURSOR_CMD__X);
		createEAttribute(ubqtGuiCursorCmdEClass, UBQT_GUI_CURSOR_CMD__Y);

		// Create enums
		proximA_EVENTEEnum = createEEnum(PROXIMA_EVENT);
		widgeT_EVENTEEnum = createEEnum(WIDGET_EVENT);
		cursoR_EVENTEEnum = createEEnum(CURSOR_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ubqtGuiCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		ubqtGuiProximaCmdEClass.getESuperTypes().add(this.getUbqtGuiCmd());
		ubqtGuiWidgetCmdEClass.getESuperTypes().add(this.getUbqtGuiCmd());
		ubqtGuiCursorCmdEClass.getESuperTypes().add(this.getUbqtGuiCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(ubqtGuiCmdEClass, UbqtGuiCmd.class, "UbqtGuiCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ubqtGuiProximaCmdEClass, UbqtGuiProximaCmd.class, "UbqtGuiProximaCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbqtGuiProximaCmd_Event(), this.getPROXIMA_EVENT(), "event", null, 0, 1, UbqtGuiProximaCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbqtGuiProximaCmd_ProximaID(), ecorePackage.getEInt(), "proximaID", null, 0, 1, UbqtGuiProximaCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubqtGuiWidgetCmdEClass, UbqtGuiWidgetCmd.class, "UbqtGuiWidgetCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbqtGuiWidgetCmd_Event(), this.getWIDGET_EVENT(), "event", null, 0, 1, UbqtGuiWidgetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbqtGuiWidgetCmd_WidgetID(), ecorePackage.getEString(), "widgetID", null, 0, 1, UbqtGuiWidgetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubqtGuiCursorCmdEClass, UbqtGuiCursorCmd.class, "UbqtGuiCursorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbqtGuiCursorCmd_Event(), this.getCURSOR_EVENT(), "event", null, 0, 1, UbqtGuiCursorCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbqtGuiCursorCmd_CursorID(), ecorePackage.getEString(), "cursorID", null, 0, 1, UbqtGuiCursorCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbqtGuiCursorCmd_X(), ecorePackage.getEInt(), "x", null, 0, 1, UbqtGuiCursorCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbqtGuiCursorCmd_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UbqtGuiCursorCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.class, "PROXIMA_EVENT");
		addEEnumLiteral(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.ADD);
		addEEnumLiteral(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.REMOVE);
		addEEnumLiteral(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.ROTATION);
		addEEnumLiteral(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.MOVE);
		addEEnumLiteral(proximA_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT.ACCEL);

		initEEnum(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.class, "WIDGET_EVENT");
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.HOVER);
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.UP);
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.ENTER);
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.DRAG);
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.LEAVE);
		addEEnumLiteral(widgeT_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.WIDGET_EVENT.DOWN);

		initEEnum(cursoR_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT.class, "CURSOR_EVENT");
		addEEnumLiteral(cursoR_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT.MOVE);
		addEEnumLiteral(cursoR_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT.ADD);
		addEEnumLiteral(cursoR_EVENTEEnum, net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT.REMOVE);

		// Create resource
		createResource(eNS_URI);
	}

} //UbqtguiPackageImpl
