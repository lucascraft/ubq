/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.ubq.script.ubqt.NetConfImport;
import net.sf.ubq.script.ubqt.OrchestrorImport;
import net.sf.ubq.script.ubqt.UbqAction;
import net.sf.ubq.script.ubqt.UbqBorderStyle;
import net.sf.ubq.script.ubqt.UbqBounds;
import net.sf.ubq.script.ubqt.UbqButton;
import net.sf.ubq.script.ubqt.UbqCheckbox;
import net.sf.ubq.script.ubqt.UbqColor;
import net.sf.ubq.script.ubqt.UbqColorStyle;
import net.sf.ubq.script.ubqt.UbqComposite;
import net.sf.ubq.script.ubqt.UbqCursor;
import net.sf.ubq.script.ubqt.UbqDisplayMode;
import net.sf.ubq.script.ubqt.UbqEmmitedActions;
import net.sf.ubq.script.ubqt.UbqFiducial;
import net.sf.ubq.script.ubqt.UbqFontStyle;
import net.sf.ubq.script.ubqt.UbqHandledReactions;
import net.sf.ubq.script.ubqt.UbqHsbColor;
import net.sf.ubq.script.ubqt.UbqImage;
import net.sf.ubq.script.ubqt.UbqIncrementableRange;
import net.sf.ubq.script.ubqt.UbqKnob;
import net.sf.ubq.script.ubqt.UbqLabel;
import net.sf.ubq.script.ubqt.UbqLayout;
import net.sf.ubq.script.ubqt.UbqMenu;
import net.sf.ubq.script.ubqt.UbqMenuItem;
import net.sf.ubq.script.ubqt.UbqPoint;
import net.sf.ubq.script.ubqt.UbqProxima;
import net.sf.ubq.script.ubqt.UbqReaction;
import net.sf.ubq.script.ubqt.UbqRgbColor;
import net.sf.ubq.script.ubqt.UbqSession;
import net.sf.ubq.script.ubqt.UbqSlider;
import net.sf.ubq.script.ubqt.UbqSlot;
import net.sf.ubq.script.ubqt.UbqSpinner;
import net.sf.ubq.script.ubqt.UbqText;
import net.sf.ubq.script.ubqt.UbqVuMeter;
import net.sf.ubq.script.ubqt.UbqWidget;
import net.sf.ubq.script.ubqt.UbqWidgetStyle;
import net.sf.ubq.script.ubqt.UbqtFactory;
import net.sf.ubq.script.ubqt.UbqtPackage;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqtPackageImpl extends EPackageImpl implements UbqtPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqSessionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orchestrorImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netConfImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqDisplayModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqFiducialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqProximaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqHandledReactionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqEmmitedActionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqSlotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqCursorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqCompositeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqBoundsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqImageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqCheckboxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqMenuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqMenuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqIncrementableRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqVuMeterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqSpinnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqSliderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqKnobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqWidgetStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqColorStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqFontStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqBorderStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqHsbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ubqRgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sloT_STATUSEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sloT_KINDEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum proximA_STATUSEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum slotsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ubQ_LAYOUT_KINDEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ubQ_EVENTSEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ubQ_GESTURESEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fonT_STYLEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bordeR_STYLEEEnum = null;

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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UbqtPackageImpl()
  {
    super(eNS_URI, UbqtFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UbqtPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UbqtPackage init()
  {
    if (isInited) return (UbqtPackage)EPackage.Registry.INSTANCE.getEPackage(UbqtPackage.eNS_URI);

    // Obtain or create and register package
    UbqtPackageImpl theUbqtPackage = (UbqtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UbqtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UbqtPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    NetConfPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUbqtPackage.createPackageContents();

    // Initialize created meta-data
    theUbqtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUbqtPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UbqtPackage.eNS_URI, theUbqtPackage);
    return theUbqtPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqSession()
  {
    return ubqSessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Netconfs()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Orchestrors()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_DisplayMode()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Fiducials()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Actions()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Reactions()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Emmiters()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Handlers()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Slots()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Proximi()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSession_Fingers()
  {
    return (EReference)ubqSessionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrchestrorImport()
  {
    return orchestrorImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrchestrorImport_ImportURI()
  {
    return (EAttribute)orchestrorImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetConfImport()
  {
    return netConfImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetConfImport_ImportURI()
  {
    return (EAttribute)netConfImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqDisplayMode()
  {
    return ubqDisplayModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqDisplayMode_Mode()
  {
    return (EReference)ubqDisplayModeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqAction()
  {
    return ubqActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqAction_Name()
  {
    return (EAttribute)ubqActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqAction_ActionIDs()
  {
    return (EAttribute)ubqActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqAction_Args()
  {
    return (EAttribute)ubqActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqReaction()
  {
    return ubqReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqReaction_Name()
  {
    return (EAttribute)ubqReactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqReaction_CmdIDs()
  {
    return (EAttribute)ubqReactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqReaction_Clazz()
  {
    return (EAttribute)ubqReactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqFiducial()
  {
    return ubqFiducialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqFiducial_Name()
  {
    return (EAttribute)ubqFiducialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqFiducial_Fidcode()
  {
    return (EAttribute)ubqFiducialEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqProxima()
  {
    return ubqProximaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqProxima_Name()
  {
    return (EAttribute)ubqProximaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Fiducial()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Engine()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Range()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Bounds()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqProxima_Radius()
  {
    return (EAttribute)ubqProximaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqProxima_Angle()
  {
    return (EAttribute)ubqProximaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqProxima_Status()
  {
    return (EAttribute)ubqProximaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_RequiredProximi()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Slots()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Emitted()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqProxima_Reacted()
  {
    return (EReference)ubqProximaEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqHandledReactions()
  {
    return ubqHandledReactionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqHandledReactions_Reactions()
  {
    return (EReference)ubqHandledReactionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqHandledReactions_ProximiAsRef()
  {
    return (EReference)ubqHandledReactionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqEmmitedActions()
  {
    return ubqEmmitedActionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqEmmitedActions_Actions()
  {
    return (EReference)ubqEmmitedActionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqEmmitedActions_Events()
  {
    return (EAttribute)ubqEmmitedActionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqEmmitedActions_ProximiAsRef()
  {
    return (EReference)ubqEmmitedActionsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqSlot()
  {
    return ubqSlotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSlot_Name()
  {
    return (EAttribute)ubqSlotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSlot_Bounds()
  {
    return (EReference)ubqSlotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSlot_Position()
  {
    return (EAttribute)ubqSlotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSlot_Kind()
  {
    return (EAttribute)ubqSlotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSlot_Status()
  {
    return (EAttribute)ubqSlotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSlot_Emitted()
  {
    return (EReference)ubqSlotEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSlot_Reacted()
  {
    return (EReference)ubqSlotEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqLayout()
  {
    return ubqLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqLayout_Kind()
  {
    return (EAttribute)ubqLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqCursor()
  {
    return ubqCursorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqCursor_Name()
  {
    return (EAttribute)ubqCursorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqCursor_Pos()
  {
    return (EReference)ubqCursorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqCursor_Dim()
  {
    return (EReference)ubqCursorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqComposite()
  {
    return ubqCompositeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqComposite_Name()
  {
    return (EAttribute)ubqCompositeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqComposite_Bounds()
  {
    return (EReference)ubqCompositeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqComposite_Layout()
  {
    return (EReference)ubqCompositeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqComposite_Children()
  {
    return (EReference)ubqCompositeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqPoint()
  {
    return ubqPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqPoint_X()
  {
    return (EAttribute)ubqPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqPoint_Y()
  {
    return (EAttribute)ubqPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqBounds()
  {
    return ubqBoundsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBounds_X()
  {
    return (EAttribute)ubqBoundsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBounds_Y()
  {
    return (EAttribute)ubqBoundsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBounds_Width()
  {
    return (EAttribute)ubqBoundsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBounds_Height()
  {
    return (EAttribute)ubqBoundsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqWidget()
  {
    return ubqWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidget_Parent()
  {
    return (EReference)ubqWidgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidget_Bounds()
  {
    return (EReference)ubqWidgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqWidget_Angle()
  {
    return (EAttribute)ubqWidgetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidget_Style()
  {
    return (EReference)ubqWidgetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidget_Emitted()
  {
    return (EReference)ubqWidgetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidget_Reacted()
  {
    return (EReference)ubqWidgetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqWidget_Name()
  {
    return (EAttribute)ubqWidgetEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqImage()
  {
    return ubqImageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqImage_Name()
  {
    return (EAttribute)ubqImageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqImage_Image()
  {
    return (EAttribute)ubqImageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqButton()
  {
    return ubqButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqButton_Text()
  {
    return (EAttribute)ubqButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqButton_Image()
  {
    return (EAttribute)ubqButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqLabel()
  {
    return ubqLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqLabel_Text()
  {
    return (EAttribute)ubqLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqCheckbox()
  {
    return ubqCheckboxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqCheckbox_Checked()
  {
    return (EAttribute)ubqCheckboxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqText()
  {
    return ubqTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqText_Name()
  {
    return (EAttribute)ubqTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqText_Text()
  {
    return (EAttribute)ubqTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqMenu()
  {
    return ubqMenuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqMenu_Name()
  {
    return (EAttribute)ubqMenuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqMenu_Children()
  {
    return (EReference)ubqMenuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqMenuItem()
  {
    return ubqMenuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqMenuItem_Name()
  {
    return (EAttribute)ubqMenuItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqMenuItem_Title()
  {
    return (EAttribute)ubqMenuItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqMenuItem_Emitted()
  {
    return (EReference)ubqMenuItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqIncrementableRange()
  {
    return ubqIncrementableRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqIncrementableRange_Min()
  {
    return (EAttribute)ubqIncrementableRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqIncrementableRange_Max()
  {
    return (EAttribute)ubqIncrementableRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqIncrementableRange_Val()
  {
    return (EAttribute)ubqIncrementableRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqVuMeter()
  {
    return ubqVuMeterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqVuMeter_Name()
  {
    return (EAttribute)ubqVuMeterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqVuMeter_RangeDefinition()
  {
    return (EReference)ubqVuMeterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqSpinner()
  {
    return ubqSpinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSpinner_Name()
  {
    return (EAttribute)ubqSpinnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSpinner_RangeDefinition()
  {
    return (EReference)ubqSpinnerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqSlider()
  {
    return ubqSliderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqSlider_Name()
  {
    return (EAttribute)ubqSliderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqSlider_RangeDefinition()
  {
    return (EReference)ubqSliderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqKnob()
  {
    return ubqKnobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqKnob_Name()
  {
    return (EAttribute)ubqKnobEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqKnob_RangeDefinition()
  {
    return (EReference)ubqKnobEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqWidgetStyle()
  {
    return ubqWidgetStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidgetStyle_ColorStyle()
  {
    return (EReference)ubqWidgetStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidgetStyle_FontStyleStyle()
  {
    return (EReference)ubqWidgetStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqWidgetStyle_BorderStyle()
  {
    return (EReference)ubqWidgetStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqColorStyle()
  {
    return ubqColorStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqColorStyle_Foreground()
  {
    return (EReference)ubqColorStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUbqColorStyle_Background()
  {
    return (EReference)ubqColorStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqFontStyle()
  {
    return ubqFontStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqFontStyle_Font()
  {
    return (EAttribute)ubqFontStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqFontStyle_Height()
  {
    return (EAttribute)ubqFontStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqFontStyle_Styles()
  {
    return (EAttribute)ubqFontStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqBorderStyle()
  {
    return ubqBorderStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBorderStyle_Tickness()
  {
    return (EAttribute)ubqBorderStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqBorderStyle_Styles()
  {
    return (EAttribute)ubqBorderStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqColor()
  {
    return ubqColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqHsbColor()
  {
    return ubqHsbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqHsbColor_Hue()
  {
    return (EAttribute)ubqHsbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqHsbColor_Saturation()
  {
    return (EAttribute)ubqHsbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqHsbColor_Brightness()
  {
    return (EAttribute)ubqHsbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUbqRgbColor()
  {
    return ubqRgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqRgbColor_Red()
  {
    return (EAttribute)ubqRgbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqRgbColor_Green()
  {
    return (EAttribute)ubqRgbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUbqRgbColor_Blue()
  {
    return (EAttribute)ubqRgbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSLOT_STATUS()
  {
    return sloT_STATUSEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSLOT_KIND()
  {
    return sloT_KINDEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPROXIMA_STATUS()
  {
    return proximA_STATUSEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSLOTS()
  {
    return slotsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUBQ_LAYOUT_KIND()
  {
    return ubQ_LAYOUT_KINDEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUBQ_EVENTS()
  {
    return ubQ_EVENTSEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUBQ_GESTURES()
  {
    return ubQ_GESTURESEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFONT_STYLE()
  {
    return fonT_STYLEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBORDER_STYLE()
  {
    return bordeR_STYLEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqtFactory getUbqtFactory()
  {
    return (UbqtFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ubqSessionEClass = createEClass(UBQ_SESSION);
    createEReference(ubqSessionEClass, UBQ_SESSION__NETCONFS);
    createEReference(ubqSessionEClass, UBQ_SESSION__ORCHESTRORS);
    createEReference(ubqSessionEClass, UBQ_SESSION__DISPLAY_MODE);
    createEReference(ubqSessionEClass, UBQ_SESSION__FIDUCIALS);
    createEReference(ubqSessionEClass, UBQ_SESSION__ACTIONS);
    createEReference(ubqSessionEClass, UBQ_SESSION__REACTIONS);
    createEReference(ubqSessionEClass, UBQ_SESSION__EMMITERS);
    createEReference(ubqSessionEClass, UBQ_SESSION__HANDLERS);
    createEReference(ubqSessionEClass, UBQ_SESSION__SLOTS);
    createEReference(ubqSessionEClass, UBQ_SESSION__PROXIMI);
    createEReference(ubqSessionEClass, UBQ_SESSION__FINGERS);

    orchestrorImportEClass = createEClass(ORCHESTROR_IMPORT);
    createEAttribute(orchestrorImportEClass, ORCHESTROR_IMPORT__IMPORT_URI);

    netConfImportEClass = createEClass(NET_CONF_IMPORT);
    createEAttribute(netConfImportEClass, NET_CONF_IMPORT__IMPORT_URI);

    ubqDisplayModeEClass = createEClass(UBQ_DISPLAY_MODE);
    createEReference(ubqDisplayModeEClass, UBQ_DISPLAY_MODE__MODE);

    ubqActionEClass = createEClass(UBQ_ACTION);
    createEAttribute(ubqActionEClass, UBQ_ACTION__NAME);
    createEAttribute(ubqActionEClass, UBQ_ACTION__ACTION_IDS);
    createEAttribute(ubqActionEClass, UBQ_ACTION__ARGS);

    ubqReactionEClass = createEClass(UBQ_REACTION);
    createEAttribute(ubqReactionEClass, UBQ_REACTION__NAME);
    createEAttribute(ubqReactionEClass, UBQ_REACTION__CMD_IDS);
    createEAttribute(ubqReactionEClass, UBQ_REACTION__CLAZZ);

    ubqFiducialEClass = createEClass(UBQ_FIDUCIAL);
    createEAttribute(ubqFiducialEClass, UBQ_FIDUCIAL__NAME);
    createEAttribute(ubqFiducialEClass, UBQ_FIDUCIAL__FIDCODE);

    ubqProximaEClass = createEClass(UBQ_PROXIMA);
    createEAttribute(ubqProximaEClass, UBQ_PROXIMA__NAME);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__FIDUCIAL);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__ENGINE);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__RANGE);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__BOUNDS);
    createEAttribute(ubqProximaEClass, UBQ_PROXIMA__RADIUS);
    createEAttribute(ubqProximaEClass, UBQ_PROXIMA__ANGLE);
    createEAttribute(ubqProximaEClass, UBQ_PROXIMA__STATUS);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__REQUIRED_PROXIMI);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__SLOTS);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__EMITTED);
    createEReference(ubqProximaEClass, UBQ_PROXIMA__REACTED);

    ubqHandledReactionsEClass = createEClass(UBQ_HANDLED_REACTIONS);
    createEReference(ubqHandledReactionsEClass, UBQ_HANDLED_REACTIONS__REACTIONS);
    createEReference(ubqHandledReactionsEClass, UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF);

    ubqEmmitedActionsEClass = createEClass(UBQ_EMMITED_ACTIONS);
    createEReference(ubqEmmitedActionsEClass, UBQ_EMMITED_ACTIONS__ACTIONS);
    createEAttribute(ubqEmmitedActionsEClass, UBQ_EMMITED_ACTIONS__EVENTS);
    createEReference(ubqEmmitedActionsEClass, UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF);

    ubqSlotEClass = createEClass(UBQ_SLOT);
    createEAttribute(ubqSlotEClass, UBQ_SLOT__NAME);
    createEReference(ubqSlotEClass, UBQ_SLOT__BOUNDS);
    createEAttribute(ubqSlotEClass, UBQ_SLOT__POSITION);
    createEAttribute(ubqSlotEClass, UBQ_SLOT__KIND);
    createEAttribute(ubqSlotEClass, UBQ_SLOT__STATUS);
    createEReference(ubqSlotEClass, UBQ_SLOT__EMITTED);
    createEReference(ubqSlotEClass, UBQ_SLOT__REACTED);

    ubqLayoutEClass = createEClass(UBQ_LAYOUT);
    createEAttribute(ubqLayoutEClass, UBQ_LAYOUT__KIND);

    ubqCursorEClass = createEClass(UBQ_CURSOR);
    createEAttribute(ubqCursorEClass, UBQ_CURSOR__NAME);
    createEReference(ubqCursorEClass, UBQ_CURSOR__POS);
    createEReference(ubqCursorEClass, UBQ_CURSOR__DIM);

    ubqCompositeEClass = createEClass(UBQ_COMPOSITE);
    createEAttribute(ubqCompositeEClass, UBQ_COMPOSITE__NAME);
    createEReference(ubqCompositeEClass, UBQ_COMPOSITE__BOUNDS);
    createEReference(ubqCompositeEClass, UBQ_COMPOSITE__LAYOUT);
    createEReference(ubqCompositeEClass, UBQ_COMPOSITE__CHILDREN);

    ubqPointEClass = createEClass(UBQ_POINT);
    createEAttribute(ubqPointEClass, UBQ_POINT__X);
    createEAttribute(ubqPointEClass, UBQ_POINT__Y);

    ubqBoundsEClass = createEClass(UBQ_BOUNDS);
    createEAttribute(ubqBoundsEClass, UBQ_BOUNDS__X);
    createEAttribute(ubqBoundsEClass, UBQ_BOUNDS__Y);
    createEAttribute(ubqBoundsEClass, UBQ_BOUNDS__WIDTH);
    createEAttribute(ubqBoundsEClass, UBQ_BOUNDS__HEIGHT);

    ubqWidgetEClass = createEClass(UBQ_WIDGET);
    createEReference(ubqWidgetEClass, UBQ_WIDGET__PARENT);
    createEReference(ubqWidgetEClass, UBQ_WIDGET__BOUNDS);
    createEAttribute(ubqWidgetEClass, UBQ_WIDGET__ANGLE);
    createEReference(ubqWidgetEClass, UBQ_WIDGET__STYLE);
    createEReference(ubqWidgetEClass, UBQ_WIDGET__EMITTED);
    createEReference(ubqWidgetEClass, UBQ_WIDGET__REACTED);
    createEAttribute(ubqWidgetEClass, UBQ_WIDGET__NAME);

    ubqImageEClass = createEClass(UBQ_IMAGE);
    createEAttribute(ubqImageEClass, UBQ_IMAGE__NAME);
    createEAttribute(ubqImageEClass, UBQ_IMAGE__IMAGE);

    ubqButtonEClass = createEClass(UBQ_BUTTON);
    createEAttribute(ubqButtonEClass, UBQ_BUTTON__TEXT);
    createEAttribute(ubqButtonEClass, UBQ_BUTTON__IMAGE);

    ubqLabelEClass = createEClass(UBQ_LABEL);
    createEAttribute(ubqLabelEClass, UBQ_LABEL__TEXT);

    ubqCheckboxEClass = createEClass(UBQ_CHECKBOX);
    createEAttribute(ubqCheckboxEClass, UBQ_CHECKBOX__CHECKED);

    ubqTextEClass = createEClass(UBQ_TEXT);
    createEAttribute(ubqTextEClass, UBQ_TEXT__NAME);
    createEAttribute(ubqTextEClass, UBQ_TEXT__TEXT);

    ubqMenuEClass = createEClass(UBQ_MENU);
    createEAttribute(ubqMenuEClass, UBQ_MENU__NAME);
    createEReference(ubqMenuEClass, UBQ_MENU__CHILDREN);

    ubqMenuItemEClass = createEClass(UBQ_MENU_ITEM);
    createEAttribute(ubqMenuItemEClass, UBQ_MENU_ITEM__NAME);
    createEAttribute(ubqMenuItemEClass, UBQ_MENU_ITEM__TITLE);
    createEReference(ubqMenuItemEClass, UBQ_MENU_ITEM__EMITTED);

    ubqIncrementableRangeEClass = createEClass(UBQ_INCREMENTABLE_RANGE);
    createEAttribute(ubqIncrementableRangeEClass, UBQ_INCREMENTABLE_RANGE__MIN);
    createEAttribute(ubqIncrementableRangeEClass, UBQ_INCREMENTABLE_RANGE__MAX);
    createEAttribute(ubqIncrementableRangeEClass, UBQ_INCREMENTABLE_RANGE__VAL);

    ubqVuMeterEClass = createEClass(UBQ_VU_METER);
    createEAttribute(ubqVuMeterEClass, UBQ_VU_METER__NAME);
    createEReference(ubqVuMeterEClass, UBQ_VU_METER__RANGE_DEFINITION);

    ubqSpinnerEClass = createEClass(UBQ_SPINNER);
    createEAttribute(ubqSpinnerEClass, UBQ_SPINNER__NAME);
    createEReference(ubqSpinnerEClass, UBQ_SPINNER__RANGE_DEFINITION);

    ubqSliderEClass = createEClass(UBQ_SLIDER);
    createEAttribute(ubqSliderEClass, UBQ_SLIDER__NAME);
    createEReference(ubqSliderEClass, UBQ_SLIDER__RANGE_DEFINITION);

    ubqKnobEClass = createEClass(UBQ_KNOB);
    createEAttribute(ubqKnobEClass, UBQ_KNOB__NAME);
    createEReference(ubqKnobEClass, UBQ_KNOB__RANGE_DEFINITION);

    ubqWidgetStyleEClass = createEClass(UBQ_WIDGET_STYLE);
    createEReference(ubqWidgetStyleEClass, UBQ_WIDGET_STYLE__COLOR_STYLE);
    createEReference(ubqWidgetStyleEClass, UBQ_WIDGET_STYLE__FONT_STYLE_STYLE);
    createEReference(ubqWidgetStyleEClass, UBQ_WIDGET_STYLE__BORDER_STYLE);

    ubqColorStyleEClass = createEClass(UBQ_COLOR_STYLE);
    createEReference(ubqColorStyleEClass, UBQ_COLOR_STYLE__FOREGROUND);
    createEReference(ubqColorStyleEClass, UBQ_COLOR_STYLE__BACKGROUND);

    ubqFontStyleEClass = createEClass(UBQ_FONT_STYLE);
    createEAttribute(ubqFontStyleEClass, UBQ_FONT_STYLE__FONT);
    createEAttribute(ubqFontStyleEClass, UBQ_FONT_STYLE__HEIGHT);
    createEAttribute(ubqFontStyleEClass, UBQ_FONT_STYLE__STYLES);

    ubqBorderStyleEClass = createEClass(UBQ_BORDER_STYLE);
    createEAttribute(ubqBorderStyleEClass, UBQ_BORDER_STYLE__TICKNESS);
    createEAttribute(ubqBorderStyleEClass, UBQ_BORDER_STYLE__STYLES);

    ubqColorEClass = createEClass(UBQ_COLOR);

    ubqHsbColorEClass = createEClass(UBQ_HSB_COLOR);
    createEAttribute(ubqHsbColorEClass, UBQ_HSB_COLOR__HUE);
    createEAttribute(ubqHsbColorEClass, UBQ_HSB_COLOR__SATURATION);
    createEAttribute(ubqHsbColorEClass, UBQ_HSB_COLOR__BRIGHTNESS);

    ubqRgbColorEClass = createEClass(UBQ_RGB_COLOR);
    createEAttribute(ubqRgbColorEClass, UBQ_RGB_COLOR__RED);
    createEAttribute(ubqRgbColorEClass, UBQ_RGB_COLOR__GREEN);
    createEAttribute(ubqRgbColorEClass, UBQ_RGB_COLOR__BLUE);

    // Create enums
    sloT_STATUSEEnum = createEEnum(SLOT_STATUS);
    sloT_KINDEEnum = createEEnum(SLOT_KIND);
    proximA_STATUSEEnum = createEEnum(PROXIMA_STATUS);
    slotsEEnum = createEEnum(SLOTS);
    ubQ_LAYOUT_KINDEEnum = createEEnum(UBQ_LAYOUT_KIND);
    ubQ_EVENTSEEnum = createEEnum(UBQ_EVENTS);
    ubQ_GESTURESEEnum = createEEnum(UBQ_GESTURES);
    fonT_STYLEEEnum = createEEnum(FONT_STYLE);
    bordeR_STYLEEEnum = createEEnum(BORDER_STYLE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    OrchestrorPackage theOrchestrorPackage = (OrchestrorPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrorPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ubqButtonEClass.getESuperTypes().add(this.getUbqWidget());
    ubqLabelEClass.getESuperTypes().add(this.getUbqWidget());
    ubqCheckboxEClass.getESuperTypes().add(this.getUbqWidget());
    ubqRgbColorEClass.getESuperTypes().add(this.getUbqColor());

    // Initialize classes and features; add operations and parameters
    initEClass(ubqSessionEClass, UbqSession.class, "UbqSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqSession_Netconfs(), this.getNetConfImport(), null, "netconfs", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Orchestrors(), this.getOrchestrorImport(), null, "orchestrors", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_DisplayMode(), this.getUbqDisplayMode(), null, "displayMode", null, 0, 1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Fiducials(), this.getUbqFiducial(), null, "fiducials", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Actions(), this.getUbqAction(), null, "actions", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Reactions(), this.getUbqReaction(), null, "reactions", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Emmiters(), this.getUbqEmmitedActions(), null, "emmiters", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Handlers(), this.getUbqHandledReactions(), null, "handlers", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Slots(), this.getUbqSlot(), null, "slots", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Proximi(), this.getUbqProxima(), null, "proximi", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSession_Fingers(), this.getUbqCursor(), null, "fingers", null, 0, -1, UbqSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orchestrorImportEClass, OrchestrorImport.class, "OrchestrorImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrchestrorImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, OrchestrorImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netConfImportEClass, NetConfImport.class, "NetConfImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetConfImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, NetConfImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqDisplayModeEClass, UbqDisplayMode.class, "UbqDisplayMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqDisplayMode_Mode(), this.getUbqPoint(), null, "mode", null, 0, 1, UbqDisplayMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqActionEClass, UbqAction.class, "UbqAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqAction_ActionIDs(), ecorePackage.getEString(), "actionIDs", null, 0, -1, UbqAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqAction_Args(), ecorePackage.getEString(), "args", null, 0, -1, UbqAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqReactionEClass, UbqReaction.class, "UbqReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqReaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqReaction_CmdIDs(), ecorePackage.getEString(), "cmdIDs", null, 0, -1, UbqReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqReaction_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, UbqReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqFiducialEClass, UbqFiducial.class, "UbqFiducial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqFiducial_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqFiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqFiducial_Fidcode(), ecorePackage.getEInt(), "fidcode", null, 0, 1, UbqFiducial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqProximaEClass, UbqProxima.class, "UbqProxima", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqProxima_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Fiducial(), this.getUbqFiducial(), null, "fiducial", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Engine(), theOrchestrorPackage.getDSLEngineClient(), null, "engine", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Range(), this.getUbqIncrementableRange(), null, "range", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Bounds(), this.getUbqBounds(), null, "bounds", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqProxima_Radius(), ecorePackage.getEInt(), "radius", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqProxima_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqProxima_Status(), this.getPROXIMA_STATUS(), "status", null, 0, 1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_RequiredProximi(), this.getUbqProxima(), null, "requiredProximi", null, 0, -1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Slots(), this.getUbqSlot(), null, "slots", null, 0, -1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Emitted(), this.getUbqEmmitedActions(), null, "emitted", null, 0, -1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqProxima_Reacted(), this.getUbqHandledReactions(), null, "reacted", null, 0, -1, UbqProxima.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqHandledReactionsEClass, UbqHandledReactions.class, "UbqHandledReactions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqHandledReactions_Reactions(), this.getUbqReaction(), null, "reactions", null, 0, -1, UbqHandledReactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqHandledReactions_ProximiAsRef(), this.getUbqProxima(), null, "proximiAsRef", null, 0, -1, UbqHandledReactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqEmmitedActionsEClass, UbqEmmitedActions.class, "UbqEmmitedActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqEmmitedActions_Actions(), this.getUbqAction(), null, "actions", null, 0, -1, UbqEmmitedActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqEmmitedActions_Events(), this.getUBQ_EVENTS(), "events", null, 0, -1, UbqEmmitedActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqEmmitedActions_ProximiAsRef(), this.getUbqProxima(), null, "proximiAsRef", null, 0, -1, UbqEmmitedActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqSlotEClass, UbqSlot.class, "UbqSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqSlot_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSlot_Bounds(), this.getUbqBounds(), null, "bounds", null, 0, 1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqSlot_Position(), this.getSLOTS(), "position", null, 0, 1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqSlot_Kind(), this.getSLOT_KIND(), "kind", null, 0, 1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqSlot_Status(), this.getSLOT_STATUS(), "status", null, 0, 1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSlot_Emitted(), this.getUbqEmmitedActions(), null, "emitted", null, 0, -1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSlot_Reacted(), this.getUbqHandledReactions(), null, "reacted", null, 0, -1, UbqSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqLayoutEClass, UbqLayout.class, "UbqLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqLayout_Kind(), this.getUBQ_LAYOUT_KIND(), "kind", null, 0, 1, UbqLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqCursorEClass, UbqCursor.class, "UbqCursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqCursor_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqCursor_Pos(), this.getUbqPoint(), null, "pos", null, 0, 1, UbqCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqCursor_Dim(), this.getUbqPoint(), null, "dim", null, 0, 1, UbqCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqCompositeEClass, UbqComposite.class, "UbqComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqComposite_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqComposite_Bounds(), this.getUbqBounds(), null, "bounds", null, 0, 1, UbqComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqComposite_Layout(), this.getUbqLayout(), null, "layout", null, 0, 1, UbqComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqComposite_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, UbqComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqPointEClass, UbqPoint.class, "UbqPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, UbqPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UbqPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqBoundsEClass, UbqBounds.class, "UbqBounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqBounds_X(), ecorePackage.getEInt(), "x", null, 0, 1, UbqBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqBounds_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UbqBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqBounds_Width(), ecorePackage.getEInt(), "width", null, 0, 1, UbqBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqBounds_Height(), ecorePackage.getEInt(), "height", null, 0, 1, UbqBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqWidgetEClass, UbqWidget.class, "UbqWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqWidget_Parent(), this.getUbqComposite(), null, "parent", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidget_Bounds(), this.getUbqBounds(), null, "bounds", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqWidget_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidget_Style(), this.getUbqWidgetStyle(), null, "style", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidget_Emitted(), this.getUbqEmmitedActions(), null, "emitted", null, 0, -1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidget_Reacted(), this.getUbqHandledReactions(), null, "reacted", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqImageEClass, UbqImage.class, "UbqImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqImage_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqImage_Image(), ecorePackage.getEString(), "image", null, 0, 1, UbqImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqButtonEClass, UbqButton.class, "UbqButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqButton_Text(), ecorePackage.getEString(), "text", null, 0, 1, UbqButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqButton_Image(), ecorePackage.getEString(), "image", null, 0, 1, UbqButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqLabelEClass, UbqLabel.class, "UbqLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, UbqLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqCheckboxEClass, UbqCheckbox.class, "UbqCheckbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqCheckbox_Checked(), ecorePackage.getEBoolean(), "checked", null, 0, 1, UbqCheckbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqTextEClass, UbqText.class, "UbqText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqText_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqText_Text(), ecorePackage.getEString(), "text", null, 0, 1, UbqText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqMenuEClass, UbqMenu.class, "UbqMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqMenu_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, UbqMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqMenuItemEClass, UbqMenuItem.class, "UbqMenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqMenuItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqMenuItem_Title(), ecorePackage.getEString(), "title", null, 0, 1, UbqMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqMenuItem_Emitted(), this.getUbqEmmitedActions(), null, "emitted", null, 0, -1, UbqMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqIncrementableRangeEClass, UbqIncrementableRange.class, "UbqIncrementableRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqIncrementableRange_Min(), ecorePackage.getEInt(), "min", null, 0, 1, UbqIncrementableRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqIncrementableRange_Max(), ecorePackage.getEInt(), "max", null, 0, 1, UbqIncrementableRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqIncrementableRange_Val(), ecorePackage.getEInt(), "val", null, 0, 1, UbqIncrementableRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqVuMeterEClass, UbqVuMeter.class, "UbqVuMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqVuMeter_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqVuMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqVuMeter_RangeDefinition(), this.getUbqIncrementableRange(), null, "rangeDefinition", null, 0, 1, UbqVuMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqSpinnerEClass, UbqSpinner.class, "UbqSpinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqSpinner_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSpinner_RangeDefinition(), this.getUbqIncrementableRange(), null, "rangeDefinition", null, 0, 1, UbqSpinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqSliderEClass, UbqSlider.class, "UbqSlider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqSlider_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqSlider_RangeDefinition(), this.getUbqIncrementableRange(), null, "rangeDefinition", null, 0, 1, UbqSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqKnobEClass, UbqKnob.class, "UbqKnob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqKnob_Name(), ecorePackage.getEString(), "name", null, 0, 1, UbqKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqKnob_RangeDefinition(), this.getUbqIncrementableRange(), null, "rangeDefinition", null, 0, 1, UbqKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqWidgetStyleEClass, UbqWidgetStyle.class, "UbqWidgetStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqWidgetStyle_ColorStyle(), this.getUbqColorStyle(), null, "colorStyle", null, 0, 1, UbqWidgetStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidgetStyle_FontStyleStyle(), this.getUbqFontStyle(), null, "fontStyleStyle", null, 0, 1, UbqWidgetStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqWidgetStyle_BorderStyle(), this.getUbqBorderStyle(), null, "borderStyle", null, 0, 1, UbqWidgetStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqColorStyleEClass, UbqColorStyle.class, "UbqColorStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUbqColorStyle_Foreground(), this.getUbqColor(), null, "foreground", null, 0, 1, UbqColorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUbqColorStyle_Background(), this.getUbqColor(), null, "background", null, 0, 1, UbqColorStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqFontStyleEClass, UbqFontStyle.class, "UbqFontStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqFontStyle_Font(), ecorePackage.getEString(), "font", null, 0, 1, UbqFontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqFontStyle_Height(), ecorePackage.getEInt(), "height", null, 0, 1, UbqFontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqFontStyle_Styles(), this.getFONT_STYLE(), "styles", null, 0, -1, UbqFontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqBorderStyleEClass, UbqBorderStyle.class, "UbqBorderStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqBorderStyle_Tickness(), ecorePackage.getEInt(), "tickness", null, 0, 1, UbqBorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqBorderStyle_Styles(), this.getBORDER_STYLE(), "styles", null, 0, -1, UbqBorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqColorEClass, UbqColor.class, "UbqColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ubqHsbColorEClass, UbqHsbColor.class, "UbqHsbColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqHsbColor_Hue(), ecorePackage.getEDouble(), "hue", null, 0, 1, UbqHsbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqHsbColor_Saturation(), ecorePackage.getEDouble(), "saturation", null, 0, 1, UbqHsbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqHsbColor_Brightness(), ecorePackage.getEDouble(), "brightness", null, 0, 1, UbqHsbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ubqRgbColorEClass, UbqRgbColor.class, "UbqRgbColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUbqRgbColor_Red(), ecorePackage.getEInt(), "red", null, 0, 1, UbqRgbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqRgbColor_Green(), ecorePackage.getEInt(), "green", null, 0, 1, UbqRgbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUbqRgbColor_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, UbqRgbColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sloT_STATUSEEnum, net.sf.ubq.script.ubqt.SLOT_STATUS.class, "SLOT_STATUS");
    addEEnumLiteral(sloT_STATUSEEnum, net.sf.ubq.script.ubqt.SLOT_STATUS.SELECTED);
    addEEnumLiteral(sloT_STATUSEEnum, net.sf.ubq.script.ubqt.SLOT_STATUS.UNSELECTED);

    initEEnum(sloT_KINDEEnum, net.sf.ubq.script.ubqt.SLOT_KIND.class, "SLOT_KIND");
    addEEnumLiteral(sloT_KINDEEnum, net.sf.ubq.script.ubqt.SLOT_KIND.PUSH);

    initEEnum(proximA_STATUSEEnum, net.sf.ubq.script.ubqt.PROXIMA_STATUS.class, "PROXIMA_STATUS");
    addEEnumLiteral(proximA_STATUSEEnum, net.sf.ubq.script.ubqt.PROXIMA_STATUS.DEACTIVATED);
    addEEnumLiteral(proximA_STATUSEEnum, net.sf.ubq.script.ubqt.PROXIMA_STATUS.ACTIVATED);
    addEEnumLiteral(proximA_STATUSEEnum, net.sf.ubq.script.ubqt.PROXIMA_STATUS.DISABLED);

    initEEnum(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.class, "SLOTS");
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P0);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P23);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P45);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P67);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P90);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P113);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P135);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P157);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P180);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P203);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P225);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P247);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P270);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P293);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P315);
    addEEnumLiteral(slotsEEnum, net.sf.ubq.script.ubqt.SLOTS.P337);

    initEEnum(ubQ_LAYOUT_KINDEEnum, net.sf.ubq.script.ubqt.UBQ_LAYOUT_KIND.class, "UBQ_LAYOUT_KIND");
    addEEnumLiteral(ubQ_LAYOUT_KINDEEnum, net.sf.ubq.script.ubqt.UBQ_LAYOUT_KIND.UBQ_ROW_LAYOUT);
    addEEnumLiteral(ubQ_LAYOUT_KINDEEnum, net.sf.ubq.script.ubqt.UBQ_LAYOUT_KIND.UBQ_FILL_LAYOUT);

    initEEnum(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.class, "UBQ_EVENTS");
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.PROXIMA_ADD);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.PROXIMA_REMOVE);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.PROXIMA_UPDATE);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.CURSOR_ADD);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.CURSOR_REMOVE);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.CURSOR_UPDATE);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_SELECTION);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_DOWN);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_UP);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_DRAG);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_ENTER);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_LEAVE);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.WIDGET_HOVER);
    addEEnumLiteral(ubQ_EVENTSEEnum, net.sf.ubq.script.ubqt.UBQ_EVENTS.INPUT_CMD_ADD);

    initEEnum(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.class, "UBQ_GESTURES");
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_SINGLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_DOUBLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_TRIPLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_SINGLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_DOUBLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_TRIPLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_HOLD);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.THREE_HOLD);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.THREE_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_ONE_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_TWO_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.TWO_HOLD_ONE_DRAG);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_ONE_SINGLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_TWO_SINGLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_ONE_DOUBLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_TWO_DOUBLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_ONE_TRIPLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.ONE_HOLD_TWO_TRIPLE_TAP);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.VALID);
    addEEnumLiteral(ubQ_GESTURESEEnum, net.sf.ubq.script.ubqt.UBQ_GESTURES.DISCARDED);

    initEEnum(fonT_STYLEEEnum, net.sf.ubq.script.ubqt.FONT_STYLE.class, "FONT_STYLE");
    addEEnumLiteral(fonT_STYLEEEnum, net.sf.ubq.script.ubqt.FONT_STYLE.BOLD);
    addEEnumLiteral(fonT_STYLEEEnum, net.sf.ubq.script.ubqt.FONT_STYLE.ITALIC);
    addEEnumLiteral(fonT_STYLEEEnum, net.sf.ubq.script.ubqt.FONT_STYLE.STRIKED);
    addEEnumLiteral(fonT_STYLEEEnum, net.sf.ubq.script.ubqt.FONT_STYLE.NORMAL);

    initEEnum(bordeR_STYLEEEnum, net.sf.ubq.script.ubqt.BORDER_STYLE.class, "BORDER_STYLE");
    addEEnumLiteral(bordeR_STYLEEEnum, net.sf.ubq.script.ubqt.BORDER_STYLE.DASHED);
    addEEnumLiteral(bordeR_STYLEEEnum, net.sf.ubq.script.ubqt.BORDER_STYLE.NORMAL);

    // Create resource
    createResource(eNS_URI);
  }

} //UbqtPackageImpl
