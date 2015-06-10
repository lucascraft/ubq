/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.ubq.script.ubqt.UbqCheckbox;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Checkbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqCheckboxImpl#isChecked <em>Checked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqCheckboxImpl extends UbqWidgetImpl implements UbqCheckbox
{
  /**
   * The default value of the '{@link #isChecked() <em>Checked</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChecked()
   * @generated
   * @ordered
   */
  protected static final boolean CHECKED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isChecked() <em>Checked</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChecked()
   * @generated
   * @ordered
   */
  protected boolean checked = CHECKED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqCheckboxImpl()
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
    return UbqtPackage.Literals.UBQ_CHECKBOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isChecked()
  {
    return checked;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChecked(boolean newChecked)
  {
    boolean oldChecked = checked;
    checked = newChecked;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CHECKBOX__CHECKED, oldChecked, checked));
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
      case UbqtPackage.UBQ_CHECKBOX__CHECKED:
        return isChecked();
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
      case UbqtPackage.UBQ_CHECKBOX__CHECKED:
        setChecked((Boolean)newValue);
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
      case UbqtPackage.UBQ_CHECKBOX__CHECKED:
        setChecked(CHECKED_EDEFAULT);
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
      case UbqtPackage.UBQ_CHECKBOX__CHECKED:
        return checked != CHECKED_EDEFAULT;
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
    result.append(" (checked: ");
    result.append(checked);
    result.append(')');
    return result.toString();
  }

} //UbqCheckboxImpl
