/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.ubq.script.ubqt.UbqHsbColor;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Hsb Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqHsbColorImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqHsbColorImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqHsbColorImpl#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqHsbColorImpl extends MinimalEObjectImpl.Container implements UbqHsbColor
{
  /**
   * The default value of the '{@link #getHue() <em>Hue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHue()
   * @generated
   * @ordered
   */
  protected static final double HUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getHue() <em>Hue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHue()
   * @generated
   * @ordered
   */
  protected double hue = HUE_EDEFAULT;

  /**
   * The default value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturation()
   * @generated
   * @ordered
   */
  protected static final double SATURATION_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturation()
   * @generated
   * @ordered
   */
  protected double saturation = SATURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrightness()
   * @generated
   * @ordered
   */
  protected static final double BRIGHTNESS_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrightness()
   * @generated
   * @ordered
   */
  protected double brightness = BRIGHTNESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqHsbColorImpl()
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
    return UbqtPackage.Literals.UBQ_HSB_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getHue()
  {
    return hue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHue(double newHue)
  {
    double oldHue = hue;
    hue = newHue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_HSB_COLOR__HUE, oldHue, hue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getSaturation()
  {
    return saturation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSaturation(double newSaturation)
  {
    double oldSaturation = saturation;
    saturation = newSaturation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_HSB_COLOR__SATURATION, oldSaturation, saturation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getBrightness()
  {
    return brightness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrightness(double newBrightness)
  {
    double oldBrightness = brightness;
    brightness = newBrightness;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_HSB_COLOR__BRIGHTNESS, oldBrightness, brightness));
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
      case UbqtPackage.UBQ_HSB_COLOR__HUE:
        return getHue();
      case UbqtPackage.UBQ_HSB_COLOR__SATURATION:
        return getSaturation();
      case UbqtPackage.UBQ_HSB_COLOR__BRIGHTNESS:
        return getBrightness();
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
      case UbqtPackage.UBQ_HSB_COLOR__HUE:
        setHue((Double)newValue);
        return;
      case UbqtPackage.UBQ_HSB_COLOR__SATURATION:
        setSaturation((Double)newValue);
        return;
      case UbqtPackage.UBQ_HSB_COLOR__BRIGHTNESS:
        setBrightness((Double)newValue);
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
      case UbqtPackage.UBQ_HSB_COLOR__HUE:
        setHue(HUE_EDEFAULT);
        return;
      case UbqtPackage.UBQ_HSB_COLOR__SATURATION:
        setSaturation(SATURATION_EDEFAULT);
        return;
      case UbqtPackage.UBQ_HSB_COLOR__BRIGHTNESS:
        setBrightness(BRIGHTNESS_EDEFAULT);
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
      case UbqtPackage.UBQ_HSB_COLOR__HUE:
        return hue != HUE_EDEFAULT;
      case UbqtPackage.UBQ_HSB_COLOR__SATURATION:
        return saturation != SATURATION_EDEFAULT;
      case UbqtPackage.UBQ_HSB_COLOR__BRIGHTNESS:
        return brightness != BRIGHTNESS_EDEFAULT;
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
    result.append(" (hue: ");
    result.append(hue);
    result.append(", saturation: ");
    result.append(saturation);
    result.append(", brightness: ");
    result.append(brightness);
    result.append(')');
    return result.toString();
  }

} //UbqHsbColorImpl
