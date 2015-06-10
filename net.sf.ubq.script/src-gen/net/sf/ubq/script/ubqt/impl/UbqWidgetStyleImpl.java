/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.ubq.script.ubqt.UbqBorderStyle;
import net.sf.ubq.script.ubqt.UbqColorStyle;
import net.sf.ubq.script.ubqt.UbqFontStyle;
import net.sf.ubq.script.ubqt.UbqWidgetStyle;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Widget Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqWidgetStyleImpl#getColorStyle <em>Color Style</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqWidgetStyleImpl#getFontStyleStyle <em>Font Style Style</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqWidgetStyleImpl#getBorderStyle <em>Border Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqWidgetStyleImpl extends MinimalEObjectImpl.Container implements UbqWidgetStyle
{
  /**
   * The cached value of the '{@link #getColorStyle() <em>Color Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorStyle()
   * @generated
   * @ordered
   */
  protected UbqColorStyle colorStyle;

  /**
   * The cached value of the '{@link #getFontStyleStyle() <em>Font Style Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontStyleStyle()
   * @generated
   * @ordered
   */
  protected UbqFontStyle fontStyleStyle;

  /**
   * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderStyle()
   * @generated
   * @ordered
   */
  protected UbqBorderStyle borderStyle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqWidgetStyleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UbqtPackage.Literals.UBQ_WIDGET_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqColorStyle getColorStyle()
  {
    return colorStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColorStyle(UbqColorStyle newColorStyle, NotificationChain msgs)
  {
    UbqColorStyle oldColorStyle = colorStyle;
    colorStyle = newColorStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE, oldColorStyle, newColorStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorStyle(UbqColorStyle newColorStyle)
  {
    if (newColorStyle != colorStyle)
    {
      NotificationChain msgs = null;
      if (colorStyle != null)
        msgs = ((InternalEObject)colorStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE, null, msgs);
      if (newColorStyle != null)
        msgs = ((InternalEObject)newColorStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE, null, msgs);
      msgs = basicSetColorStyle(newColorStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE, newColorStyle, newColorStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqFontStyle getFontStyleStyle()
  {
    return fontStyleStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontStyleStyle(UbqFontStyle newFontStyleStyle, NotificationChain msgs)
  {
    UbqFontStyle oldFontStyleStyle = fontStyleStyle;
    fontStyleStyle = newFontStyleStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE, oldFontStyleStyle, newFontStyleStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontStyleStyle(UbqFontStyle newFontStyleStyle)
  {
    if (newFontStyleStyle != fontStyleStyle)
    {
      NotificationChain msgs = null;
      if (fontStyleStyle != null)
        msgs = ((InternalEObject)fontStyleStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE, null, msgs);
      if (newFontStyleStyle != null)
        msgs = ((InternalEObject)newFontStyleStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE, null, msgs);
      msgs = basicSetFontStyleStyle(newFontStyleStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE, newFontStyleStyle, newFontStyleStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqBorderStyle getBorderStyle()
  {
    return borderStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorderStyle(UbqBorderStyle newBorderStyle, NotificationChain msgs)
  {
    UbqBorderStyle oldBorderStyle = borderStyle;
    borderStyle = newBorderStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE, oldBorderStyle, newBorderStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderStyle(UbqBorderStyle newBorderStyle)
  {
    if (newBorderStyle != borderStyle)
    {
      NotificationChain msgs = null;
      if (borderStyle != null)
        msgs = ((InternalEObject)borderStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE, null, msgs);
      if (newBorderStyle != null)
        msgs = ((InternalEObject)newBorderStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE, null, msgs);
      msgs = basicSetBorderStyle(newBorderStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE, newBorderStyle, newBorderStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE:
        return basicSetColorStyle(null, msgs);
      case UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE:
        return basicSetFontStyleStyle(null, msgs);
      case UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE:
        return basicSetBorderStyle(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE:
        return getColorStyle();
      case UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE:
        return getFontStyleStyle();
      case UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE:
        return getBorderStyle();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE:
        setColorStyle((UbqColorStyle)newValue);
        return;
      case UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE:
        setFontStyleStyle((UbqFontStyle)newValue);
        return;
      case UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE:
        setBorderStyle((UbqBorderStyle)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE:
        setColorStyle((UbqColorStyle)null);
        return;
      case UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE:
        setFontStyleStyle((UbqFontStyle)null);
        return;
      case UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE:
        setBorderStyle((UbqBorderStyle)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_WIDGET_STYLE__COLOR_STYLE:
        return colorStyle != null;
      case UbqtPackage.UBQ_WIDGET_STYLE__FONT_STYLE_STYLE:
        return fontStyleStyle != null;
      case UbqtPackage.UBQ_WIDGET_STYLE__BORDER_STYLE:
        return borderStyle != null;
    }
    return super.eIsSet(featureID);
  }

} //UbqWidgetStyleImpl
