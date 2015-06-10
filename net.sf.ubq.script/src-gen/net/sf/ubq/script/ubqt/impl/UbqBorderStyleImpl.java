/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.BORDER_STYLE;
import net.sf.ubq.script.ubqt.UbqBorderStyle;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Border Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqBorderStyleImpl#getTickness <em>Tickness</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqBorderStyleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqBorderStyleImpl extends MinimalEObjectImpl.Container implements UbqBorderStyle
{
  /**
   * The default value of the '{@link #getTickness() <em>Tickness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTickness()
   * @generated
   * @ordered
   */
  protected static final int TICKNESS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTickness() <em>Tickness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTickness()
   * @generated
   * @ordered
   */
  protected int tickness = TICKNESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected EList<BORDER_STYLE> styles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqBorderStyleImpl()
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
    return UbqtPackage.Literals.UBQ_BORDER_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTickness()
  {
    return tickness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTickness(int newTickness)
  {
    int oldTickness = tickness;
    tickness = newTickness;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_BORDER_STYLE__TICKNESS, oldTickness, tickness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BORDER_STYLE> getStyles()
  {
    if (styles == null)
    {
      styles = new EDataTypeEList<BORDER_STYLE>(BORDER_STYLE.class, this, UbqtPackage.UBQ_BORDER_STYLE__STYLES);
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
      case UbqtPackage.UBQ_BORDER_STYLE__TICKNESS:
        return getTickness();
      case UbqtPackage.UBQ_BORDER_STYLE__STYLES:
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
      case UbqtPackage.UBQ_BORDER_STYLE__TICKNESS:
        setTickness((Integer)newValue);
        return;
      case UbqtPackage.UBQ_BORDER_STYLE__STYLES:
        getStyles().clear();
        getStyles().addAll((Collection<? extends BORDER_STYLE>)newValue);
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
      case UbqtPackage.UBQ_BORDER_STYLE__TICKNESS:
        setTickness(TICKNESS_EDEFAULT);
        return;
      case UbqtPackage.UBQ_BORDER_STYLE__STYLES:
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
      case UbqtPackage.UBQ_BORDER_STYLE__TICKNESS:
        return tickness != TICKNESS_EDEFAULT;
      case UbqtPackage.UBQ_BORDER_STYLE__STYLES:
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
    result.append(" (tickness: ");
    result.append(tickness);
    result.append(", styles: ");
    result.append(styles);
    result.append(')');
    return result.toString();
  }

} //UbqBorderStyleImpl
