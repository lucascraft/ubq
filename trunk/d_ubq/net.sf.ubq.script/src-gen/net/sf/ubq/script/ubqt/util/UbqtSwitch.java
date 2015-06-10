/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.util;

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.script.ubqt.UbqtPackage
 * @generated
 */
public class UbqtSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UbqtPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqtSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UbqtPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UbqtPackage.UBQ_SESSION:
      {
        UbqSession ubqSession = (UbqSession)theEObject;
        T result = caseUbqSession(ubqSession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.ORCHESTROR_IMPORT:
      {
        OrchestrorImport orchestrorImport = (OrchestrorImport)theEObject;
        T result = caseOrchestrorImport(orchestrorImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.NET_CONF_IMPORT:
      {
        NetConfImport netConfImport = (NetConfImport)theEObject;
        T result = caseNetConfImport(netConfImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_DISPLAY_MODE:
      {
        UbqDisplayMode ubqDisplayMode = (UbqDisplayMode)theEObject;
        T result = caseUbqDisplayMode(ubqDisplayMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_ACTION:
      {
        UbqAction ubqAction = (UbqAction)theEObject;
        T result = caseUbqAction(ubqAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_REACTION:
      {
        UbqReaction ubqReaction = (UbqReaction)theEObject;
        T result = caseUbqReaction(ubqReaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_FIDUCIAL:
      {
        UbqFiducial ubqFiducial = (UbqFiducial)theEObject;
        T result = caseUbqFiducial(ubqFiducial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_PROXIMA:
      {
        UbqProxima ubqProxima = (UbqProxima)theEObject;
        T result = caseUbqProxima(ubqProxima);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_HANDLED_REACTIONS:
      {
        UbqHandledReactions ubqHandledReactions = (UbqHandledReactions)theEObject;
        T result = caseUbqHandledReactions(ubqHandledReactions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_EMMITED_ACTIONS:
      {
        UbqEmmitedActions ubqEmmitedActions = (UbqEmmitedActions)theEObject;
        T result = caseUbqEmmitedActions(ubqEmmitedActions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_SLOT:
      {
        UbqSlot ubqSlot = (UbqSlot)theEObject;
        T result = caseUbqSlot(ubqSlot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_LAYOUT:
      {
        UbqLayout ubqLayout = (UbqLayout)theEObject;
        T result = caseUbqLayout(ubqLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_CURSOR:
      {
        UbqCursor ubqCursor = (UbqCursor)theEObject;
        T result = caseUbqCursor(ubqCursor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_COMPOSITE:
      {
        UbqComposite ubqComposite = (UbqComposite)theEObject;
        T result = caseUbqComposite(ubqComposite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_POINT:
      {
        UbqPoint ubqPoint = (UbqPoint)theEObject;
        T result = caseUbqPoint(ubqPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_BOUNDS:
      {
        UbqBounds ubqBounds = (UbqBounds)theEObject;
        T result = caseUbqBounds(ubqBounds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_WIDGET:
      {
        UbqWidget ubqWidget = (UbqWidget)theEObject;
        T result = caseUbqWidget(ubqWidget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_IMAGE:
      {
        UbqImage ubqImage = (UbqImage)theEObject;
        T result = caseUbqImage(ubqImage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_BUTTON:
      {
        UbqButton ubqButton = (UbqButton)theEObject;
        T result = caseUbqButton(ubqButton);
        if (result == null) result = caseUbqWidget(ubqButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_LABEL:
      {
        UbqLabel ubqLabel = (UbqLabel)theEObject;
        T result = caseUbqLabel(ubqLabel);
        if (result == null) result = caseUbqWidget(ubqLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_CHECKBOX:
      {
        UbqCheckbox ubqCheckbox = (UbqCheckbox)theEObject;
        T result = caseUbqCheckbox(ubqCheckbox);
        if (result == null) result = caseUbqWidget(ubqCheckbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_TEXT:
      {
        UbqText ubqText = (UbqText)theEObject;
        T result = caseUbqText(ubqText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_MENU:
      {
        UbqMenu ubqMenu = (UbqMenu)theEObject;
        T result = caseUbqMenu(ubqMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_MENU_ITEM:
      {
        UbqMenuItem ubqMenuItem = (UbqMenuItem)theEObject;
        T result = caseUbqMenuItem(ubqMenuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_INCREMENTABLE_RANGE:
      {
        UbqIncrementableRange ubqIncrementableRange = (UbqIncrementableRange)theEObject;
        T result = caseUbqIncrementableRange(ubqIncrementableRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_VU_METER:
      {
        UbqVuMeter ubqVuMeter = (UbqVuMeter)theEObject;
        T result = caseUbqVuMeter(ubqVuMeter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_SPINNER:
      {
        UbqSpinner ubqSpinner = (UbqSpinner)theEObject;
        T result = caseUbqSpinner(ubqSpinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_SLIDER:
      {
        UbqSlider ubqSlider = (UbqSlider)theEObject;
        T result = caseUbqSlider(ubqSlider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_KNOB:
      {
        UbqKnob ubqKnob = (UbqKnob)theEObject;
        T result = caseUbqKnob(ubqKnob);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_WIDGET_STYLE:
      {
        UbqWidgetStyle ubqWidgetStyle = (UbqWidgetStyle)theEObject;
        T result = caseUbqWidgetStyle(ubqWidgetStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_COLOR_STYLE:
      {
        UbqColorStyle ubqColorStyle = (UbqColorStyle)theEObject;
        T result = caseUbqColorStyle(ubqColorStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_FONT_STYLE:
      {
        UbqFontStyle ubqFontStyle = (UbqFontStyle)theEObject;
        T result = caseUbqFontStyle(ubqFontStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_BORDER_STYLE:
      {
        UbqBorderStyle ubqBorderStyle = (UbqBorderStyle)theEObject;
        T result = caseUbqBorderStyle(ubqBorderStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_COLOR:
      {
        UbqColor ubqColor = (UbqColor)theEObject;
        T result = caseUbqColor(ubqColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_HSB_COLOR:
      {
        UbqHsbColor ubqHsbColor = (UbqHsbColor)theEObject;
        T result = caseUbqHsbColor(ubqHsbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UbqtPackage.UBQ_RGB_COLOR:
      {
        UbqRgbColor ubqRgbColor = (UbqRgbColor)theEObject;
        T result = caseUbqRgbColor(ubqRgbColor);
        if (result == null) result = caseUbqColor(ubqRgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqSession(UbqSession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orchestror Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orchestror Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrchestrorImport(OrchestrorImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Net Conf Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Net Conf Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetConfImport(NetConfImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Display Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Display Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqDisplayMode(UbqDisplayMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqAction(UbqAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqReaction(UbqReaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Fiducial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Fiducial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqFiducial(UbqFiducial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Proxima</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Proxima</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqProxima(UbqProxima object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Handled Reactions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Handled Reactions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqHandledReactions(UbqHandledReactions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Emmited Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Emmited Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqEmmitedActions(UbqEmmitedActions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Slot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Slot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqSlot(UbqSlot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqLayout(UbqLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Cursor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Cursor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqCursor(UbqCursor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Composite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Composite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqComposite(UbqComposite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqPoint(UbqPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Bounds</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Bounds</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqBounds(UbqBounds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqWidget(UbqWidget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqImage(UbqImage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqButton(UbqButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqLabel(UbqLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqCheckbox(UbqCheckbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqText(UbqText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqMenu(UbqMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqMenuItem(UbqMenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Incrementable Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Incrementable Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqIncrementableRange(UbqIncrementableRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Vu Meter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Vu Meter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqVuMeter(UbqVuMeter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Spinner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Spinner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqSpinner(UbqSpinner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Slider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Slider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqSlider(UbqSlider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Knob</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Knob</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqKnob(UbqKnob object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Widget Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Widget Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqWidgetStyle(UbqWidgetStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Color Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Color Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqColorStyle(UbqColorStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Font Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Font Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqFontStyle(UbqFontStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Border Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Border Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqBorderStyle(UbqBorderStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqColor(UbqColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Hsb Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Hsb Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqHsbColor(UbqHsbColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ubq Rgb Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ubq Rgb Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUbqRgbColor(UbqRgbColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UbqtSwitch
