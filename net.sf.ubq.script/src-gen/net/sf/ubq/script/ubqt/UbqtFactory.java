/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.ubq.script.ubqt.UbqtPackage
 * @generated
 */
public interface UbqtFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UbqtFactory eINSTANCE = net.sf.ubq.script.ubqt.impl.UbqtFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ubq Session</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Session</em>'.
   * @generated
   */
  UbqSession createUbqSession();

  /**
   * Returns a new object of class '<em>Orchestror Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orchestror Import</em>'.
   * @generated
   */
  OrchestrorImport createOrchestrorImport();

  /**
   * Returns a new object of class '<em>Net Conf Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Conf Import</em>'.
   * @generated
   */
  NetConfImport createNetConfImport();

  /**
   * Returns a new object of class '<em>Ubq Display Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Display Mode</em>'.
   * @generated
   */
  UbqDisplayMode createUbqDisplayMode();

  /**
   * Returns a new object of class '<em>Ubq Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Action</em>'.
   * @generated
   */
  UbqAction createUbqAction();

  /**
   * Returns a new object of class '<em>Ubq Reaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Reaction</em>'.
   * @generated
   */
  UbqReaction createUbqReaction();

  /**
   * Returns a new object of class '<em>Ubq Fiducial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Fiducial</em>'.
   * @generated
   */
  UbqFiducial createUbqFiducial();

  /**
   * Returns a new object of class '<em>Ubq Proxima</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Proxima</em>'.
   * @generated
   */
  UbqProxima createUbqProxima();

  /**
   * Returns a new object of class '<em>Ubq Handled Reactions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Handled Reactions</em>'.
   * @generated
   */
  UbqHandledReactions createUbqHandledReactions();

  /**
   * Returns a new object of class '<em>Ubq Emmited Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Emmited Actions</em>'.
   * @generated
   */
  UbqEmmitedActions createUbqEmmitedActions();

  /**
   * Returns a new object of class '<em>Ubq Slot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Slot</em>'.
   * @generated
   */
  UbqSlot createUbqSlot();

  /**
   * Returns a new object of class '<em>Ubq Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Layout</em>'.
   * @generated
   */
  UbqLayout createUbqLayout();

  /**
   * Returns a new object of class '<em>Ubq Cursor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Cursor</em>'.
   * @generated
   */
  UbqCursor createUbqCursor();

  /**
   * Returns a new object of class '<em>Ubq Composite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Composite</em>'.
   * @generated
   */
  UbqComposite createUbqComposite();

  /**
   * Returns a new object of class '<em>Ubq Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Point</em>'.
   * @generated
   */
  UbqPoint createUbqPoint();

  /**
   * Returns a new object of class '<em>Ubq Bounds</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Bounds</em>'.
   * @generated
   */
  UbqBounds createUbqBounds();

  /**
   * Returns a new object of class '<em>Ubq Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Widget</em>'.
   * @generated
   */
  UbqWidget createUbqWidget();

  /**
   * Returns a new object of class '<em>Ubq Image</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Image</em>'.
   * @generated
   */
  UbqImage createUbqImage();

  /**
   * Returns a new object of class '<em>Ubq Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Button</em>'.
   * @generated
   */
  UbqButton createUbqButton();

  /**
   * Returns a new object of class '<em>Ubq Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Label</em>'.
   * @generated
   */
  UbqLabel createUbqLabel();

  /**
   * Returns a new object of class '<em>Ubq Checkbox</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Checkbox</em>'.
   * @generated
   */
  UbqCheckbox createUbqCheckbox();

  /**
   * Returns a new object of class '<em>Ubq Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Text</em>'.
   * @generated
   */
  UbqText createUbqText();

  /**
   * Returns a new object of class '<em>Ubq Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Menu</em>'.
   * @generated
   */
  UbqMenu createUbqMenu();

  /**
   * Returns a new object of class '<em>Ubq Menu Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Menu Item</em>'.
   * @generated
   */
  UbqMenuItem createUbqMenuItem();

  /**
   * Returns a new object of class '<em>Ubq Incrementable Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Incrementable Range</em>'.
   * @generated
   */
  UbqIncrementableRange createUbqIncrementableRange();

  /**
   * Returns a new object of class '<em>Ubq Vu Meter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Vu Meter</em>'.
   * @generated
   */
  UbqVuMeter createUbqVuMeter();

  /**
   * Returns a new object of class '<em>Ubq Spinner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Spinner</em>'.
   * @generated
   */
  UbqSpinner createUbqSpinner();

  /**
   * Returns a new object of class '<em>Ubq Slider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Slider</em>'.
   * @generated
   */
  UbqSlider createUbqSlider();

  /**
   * Returns a new object of class '<em>Ubq Knob</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Knob</em>'.
   * @generated
   */
  UbqKnob createUbqKnob();

  /**
   * Returns a new object of class '<em>Ubq Widget Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Widget Style</em>'.
   * @generated
   */
  UbqWidgetStyle createUbqWidgetStyle();

  /**
   * Returns a new object of class '<em>Ubq Color Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Color Style</em>'.
   * @generated
   */
  UbqColorStyle createUbqColorStyle();

  /**
   * Returns a new object of class '<em>Ubq Font Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Font Style</em>'.
   * @generated
   */
  UbqFontStyle createUbqFontStyle();

  /**
   * Returns a new object of class '<em>Ubq Border Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Border Style</em>'.
   * @generated
   */
  UbqBorderStyle createUbqBorderStyle();

  /**
   * Returns a new object of class '<em>Ubq Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Color</em>'.
   * @generated
   */
  UbqColor createUbqColor();

  /**
   * Returns a new object of class '<em>Ubq Hsb Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Hsb Color</em>'.
   * @generated
   */
  UbqHsbColor createUbqHsbColor();

  /**
   * Returns a new object of class '<em>Ubq Rgb Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ubq Rgb Color</em>'.
   * @generated
   */
  UbqRgbColor createUbqRgbColor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UbqtPackage getUbqtPackage();

} //UbqtFactory
