/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.FONT_STYLE;
import net.sf.ubq.script.ubqt.UbqFontStyle;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Font Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqFontStyleImpl#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqFontStyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqFontStyleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqFontStyleImpl extends MinimalEObjectImpl.Container implements UbqFontStyle
{
  /**
   * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected static final String FONT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected String font = FONT_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<FONT_STYLE> styles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqFontStyleImpl()
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
    return UbqtPackage.Literals.UBQ_FONT_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont(String newFont)
  {
    String oldFont = font;
    font = newFont;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_FONT_STYLE__FONT, oldFont, font));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_FONT_STYLE__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FONT_STYLE> getStyles()
  {
    if (styles == null)
    {
      styles = new EDataTypeEList<FONT_STYLE>(FONT_STYLE.class, this, UbqtPackage.UBQ_FONT_STYLE__STYLES);
    }
    return styles;
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
      case UbqtPackage.UBQ_FONT_STYLE__FONT:
        return getFont();
      case UbqtPackage.UBQ_FONT_STYLE__HEIGHT:
        return getHeight();
      case UbqtPackage.UBQ_FONT_STYLE__STYLES:
        return getStyles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_FONT_STYLE__FONT:
        setFont((String)newValue);
        return;
      case UbqtPackage.UBQ_FONT_STYLE__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case UbqtPackage.UBQ_FONT_STYLE__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends FONT_STYLE>)newValue);
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
      case UbqtPackage.UBQ_FONT_STYLE__FONT:
        setFont(FONT_EDEFAULT);
        return;
      case UbqtPackage.UBQ_FONT_STYLE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case UbqtPackage.UBQ_FONT_STYLE__STYLES:
        getStyles().clear();
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
      case UbqtPackage.UBQ_FONT_STYLE__FONT:
        return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
      case UbqtPackage.UBQ_FONT_STYLE__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case UbqtPackage.UBQ_FONT_STYLE__STYLES:
        return styles != null && !styles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (font: ");
    result.append(font);
    result.append(", height: ");
    result.append(height);
    result.append(", styles: ");
    result.append(styles);
    result.append(')');
    return result.toString();
  }

} //UbqFontStyleImpl
