/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.ubq.script.ubqt.UbqIncrementableRange;
import net.sf.ubq.script.ubqt.UbqVuMeter;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Vu Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqVuMeterImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqVuMeterImpl#getRangeDefinition <em>Range Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqVuMeterImpl extends MinimalEObjectImpl.Container implements UbqVuMeter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRangeDefinition() <em>Range Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeDefinition()
   * @generated
   * @ordered
   */
  protected UbqIncrementableRange rangeDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqVuMeterImpl()
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
    return UbqtPackage.Literals.UBQ_VU_METER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_VU_METER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqIncrementableRange getRangeDefinition()
  {
    return rangeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRangeDefinition(UbqIncrementableRange newRangeDefinition, NotificationChain msgs)
  {
    UbqIncrementableRange oldRangeDefinition = rangeDefinition;
    rangeDefinition = newRangeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION, oldRangeDefinition, newRangeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeDefinition(UbqIncrementableRange newRangeDefinition)
  {
    if (newRangeDefinition != rangeDefinition)
    {
      NotificationChain msgs = null;
      if (rangeDefinition != null)
        msgs = ((InternalEObject)rangeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION, null, msgs);
      if (newRangeDefinition != null)
        msgs = ((InternalEObject)newRangeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION, null, msgs);
      msgs = basicSetRangeDefinition(newRangeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION, newRangeDefinition, newRangeDefinition));
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
      case UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION:
        return basicSetRangeDefinition(null, msgs);
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
      case UbqtPackage.UBQ_VU_METER__NAME:
        return getName();
      case UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION:
        return getRangeDefinition();
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
      case UbqtPackage.UBQ_VU_METER__NAME:
        setName((String)newValue);
        return;
      case UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION:
        setRangeDefinition((UbqIncrementableRange)newValue);
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
      case UbqtPackage.UBQ_VU_METER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION:
        setRangeDefinition((UbqIncrementableRange)null);
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
      case UbqtPackage.UBQ_VU_METER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UbqtPackage.UBQ_VU_METER__RANGE_DEFINITION:
        return rangeDefinition != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //UbqVuMeterImpl
