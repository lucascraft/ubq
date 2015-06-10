/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.util;

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
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.script.ubqt.UbqtPackage
 * @generated
 */
public class UbqtAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UbqtPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqtAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UbqtPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqtSwitch<Adapter> modelSwitch =
    new UbqtSwitch<Adapter>()
    {
      @Override
      public Adapter caseUbqSession(UbqSession object)
      {
        return createUbqSessionAdapter();
      }
      @Override
      public Adapter caseOrchestrorImport(OrchestrorImport object)
      {
        return createOrchestrorImportAdapter();
      }
      @Override
      public Adapter caseNetConfImport(NetConfImport object)
      {
        return createNetConfImportAdapter();
      }
      @Override
      public Adapter caseUbqDisplayMode(UbqDisplayMode object)
      {
        return createUbqDisplayModeAdapter();
      }
      @Override
      public Adapter caseUbqAction(UbqAction object)
      {
        return createUbqActionAdapter();
      }
      @Override
      public Adapter caseUbqReaction(UbqReaction object)
      {
        return createUbqReactionAdapter();
      }
      @Override
      public Adapter caseUbqFiducial(UbqFiducial object)
      {
        return createUbqFiducialAdapter();
      }
      @Override
      public Adapter caseUbqProxima(UbqProxima object)
      {
        return createUbqProximaAdapter();
      }
      @Override
      public Adapter caseUbqHandledReactions(UbqHandledReactions object)
      {
        return createUbqHandledReactionsAdapter();
      }
      @Override
      public Adapter caseUbqEmmitedActions(UbqEmmitedActions object)
      {
        return createUbqEmmitedActionsAdapter();
      }
      @Override
      public Adapter caseUbqSlot(UbqSlot object)
      {
        return createUbqSlotAdapter();
      }
      @Override
      public Adapter caseUbqLayout(UbqLayout object)
      {
        return createUbqLayoutAdapter();
      }
      @Override
      public Adapter caseUbqCursor(UbqCursor object)
      {
        return createUbqCursorAdapter();
      }
      @Override
      public Adapter caseUbqComposite(UbqComposite object)
      {
        return createUbqCompositeAdapter();
      }
      @Override
      public Adapter caseUbqPoint(UbqPoint object)
      {
        return createUbqPointAdapter();
      }
      @Override
      public Adapter caseUbqBounds(UbqBounds object)
      {
        return createUbqBoundsAdapter();
      }
      @Override
      public Adapter caseUbqWidget(UbqWidget object)
      {
        return createUbqWidgetAdapter();
      }
      @Override
      public Adapter caseUbqImage(UbqImage object)
      {
        return createUbqImageAdapter();
      }
      @Override
      public Adapter caseUbqButton(UbqButton object)
      {
        return createUbqButtonAdapter();
      }
      @Override
      public Adapter caseUbqLabel(UbqLabel object)
      {
        return createUbqLabelAdapter();
      }
      @Override
      public Adapter caseUbqCheckbox(UbqCheckbox object)
      {
        return createUbqCheckboxAdapter();
      }
      @Override
      public Adapter caseUbqText(UbqText object)
      {
        return createUbqTextAdapter();
      }
      @Override
      public Adapter caseUbqMenu(UbqMenu object)
      {
        return createUbqMenuAdapter();
      }
      @Override
      public Adapter caseUbqMenuItem(UbqMenuItem object)
      {
        return createUbqMenuItemAdapter();
      }
      @Override
      public Adapter caseUbqIncrementableRange(UbqIncrementableRange object)
      {
        return createUbqIncrementableRangeAdapter();
      }
      @Override
      public Adapter caseUbqVuMeter(UbqVuMeter object)
      {
        return createUbqVuMeterAdapter();
      }
      @Override
      public Adapter caseUbqSpinner(UbqSpinner object)
      {
        return createUbqSpinnerAdapter();
      }
      @Override
      public Adapter caseUbqSlider(UbqSlider object)
      {
        return createUbqSliderAdapter();
      }
      @Override
      public Adapter caseUbqKnob(UbqKnob object)
      {
        return createUbqKnobAdapter();
      }
      @Override
      public Adapter caseUbqWidgetStyle(UbqWidgetStyle object)
      {
        return createUbqWidgetStyleAdapter();
      }
      @Override
      public Adapter caseUbqColorStyle(UbqColorStyle object)
      {
        return createUbqColorStyleAdapter();
      }
      @Override
      public Adapter caseUbqFontStyle(UbqFontStyle object)
      {
        return createUbqFontStyleAdapter();
      }
      @Override
      public Adapter caseUbqBorderStyle(UbqBorderStyle object)
      {
        return createUbqBorderStyleAdapter();
      }
      @Override
      public Adapter caseUbqColor(UbqColor object)
      {
        return createUbqColorAdapter();
      }
      @Override
      public Adapter caseUbqHsbColor(UbqHsbColor object)
      {
        return createUbqHsbColorAdapter();
      }
      @Override
      public Adapter caseUbqRgbColor(UbqRgbColor object)
      {
        return createUbqRgbColorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqSession <em>Ubq Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqSession
   * @generated
   */
  public Adapter createUbqSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.OrchestrorImport <em>Orchestror Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.OrchestrorImport
   * @generated
   */
  public Adapter createOrchestrorImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.NetConfImport <em>Net Conf Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.NetConfImport
   * @generated
   */
  public Adapter createNetConfImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqDisplayMode <em>Ubq Display Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqDisplayMode
   * @generated
   */
  public Adapter createUbqDisplayModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqAction <em>Ubq Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqAction
   * @generated
   */
  public Adapter createUbqActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqReaction <em>Ubq Reaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqReaction
   * @generated
   */
  public Adapter createUbqReactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqFiducial <em>Ubq Fiducial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqFiducial
   * @generated
   */
  public Adapter createUbqFiducialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqProxima <em>Ubq Proxima</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqProxima
   * @generated
   */
  public Adapter createUbqProximaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqHandledReactions <em>Ubq Handled Reactions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqHandledReactions
   * @generated
   */
  public Adapter createUbqHandledReactionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqEmmitedActions <em>Ubq Emmited Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqEmmitedActions
   * @generated
   */
  public Adapter createUbqEmmitedActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqSlot <em>Ubq Slot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqSlot
   * @generated
   */
  public Adapter createUbqSlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqLayout <em>Ubq Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqLayout
   * @generated
   */
  public Adapter createUbqLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqCursor <em>Ubq Cursor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqCursor
   * @generated
   */
  public Adapter createUbqCursorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqComposite <em>Ubq Composite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqComposite
   * @generated
   */
  public Adapter createUbqCompositeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqPoint <em>Ubq Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqPoint
   * @generated
   */
  public Adapter createUbqPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqBounds <em>Ubq Bounds</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqBounds
   * @generated
   */
  public Adapter createUbqBoundsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqWidget <em>Ubq Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqWidget
   * @generated
   */
  public Adapter createUbqWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqImage <em>Ubq Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqImage
   * @generated
   */
  public Adapter createUbqImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqButton <em>Ubq Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqButton
   * @generated
   */
  public Adapter createUbqButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqLabel <em>Ubq Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqLabel
   * @generated
   */
  public Adapter createUbqLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqCheckbox <em>Ubq Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqCheckbox
   * @generated
   */
  public Adapter createUbqCheckboxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqText <em>Ubq Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqText
   * @generated
   */
  public Adapter createUbqTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqMenu <em>Ubq Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqMenu
   * @generated
   */
  public Adapter createUbqMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqMenuItem <em>Ubq Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqMenuItem
   * @generated
   */
  public Adapter createUbqMenuItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqIncrementableRange <em>Ubq Incrementable Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqIncrementableRange
   * @generated
   */
  public Adapter createUbqIncrementableRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqVuMeter <em>Ubq Vu Meter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqVuMeter
   * @generated
   */
  public Adapter createUbqVuMeterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqSpinner <em>Ubq Spinner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqSpinner
   * @generated
   */
  public Adapter createUbqSpinnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqSlider <em>Ubq Slider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqSlider
   * @generated
   */
  public Adapter createUbqSliderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqKnob <em>Ubq Knob</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqKnob
   * @generated
   */
  public Adapter createUbqKnobAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqWidgetStyle <em>Ubq Widget Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqWidgetStyle
   * @generated
   */
  public Adapter createUbqWidgetStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqColorStyle <em>Ubq Color Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqColorStyle
   * @generated
   */
  public Adapter createUbqColorStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqFontStyle <em>Ubq Font Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqFontStyle
   * @generated
   */
  public Adapter createUbqFontStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqBorderStyle <em>Ubq Border Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqBorderStyle
   * @generated
   */
  public Adapter createUbqBorderStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqColor <em>Ubq Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqColor
   * @generated
   */
  public Adapter createUbqColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqHsbColor <em>Ubq Hsb Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqHsbColor
   * @generated
   */
  public Adapter createUbqHsbColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.ubq.script.ubqt.UbqRgbColor <em>Ubq Rgb Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.ubq.script.ubqt.UbqRgbColor
   * @generated
   */
  public Adapter createUbqRgbColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UbqtAdapterFactory
