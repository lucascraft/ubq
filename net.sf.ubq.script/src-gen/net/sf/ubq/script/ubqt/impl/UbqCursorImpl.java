/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import net.sf.ubq.script.ubqt.UbqCursor;
import net.sf.ubq.script.ubqt.UbqPoint;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Cursor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqCursorImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqCursorImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqCursorImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqCursorImpl extends MinimalEObjectImpl.Container implements UbqCursor
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
   * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected UbqPoint pos;

  /**
   * The cached value of the '{@link #getDim() <em>Dim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected UbqPoint dim;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqCursorImpl()
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
    return UbqtPackage.Literals.UBQ_CURSOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CURSOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqPoint getPos()
  {
    return pos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPos(UbqPoint newPos, NotificationChain msgs)
  {
    UbqPoint oldPos = pos;
    pos = newPos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CURSOR__POS, oldPos, newPos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPos(UbqPoint newPos)
  {
    if (newPos != pos)
    {
      NotificationChain msgs = null;
      if (pos != null)
        msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_CURSOR__POS, null, msgs);
      if (newPos != null)
        msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_CURSOR__POS, null, msgs);
      msgs = basicSetPos(newPos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CURSOR__POS, newPos, newPos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqPoint getDim()
  {
    return dim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDim(UbqPoint newDim, NotificationChain msgs)
  {
    UbqPoint oldDim = dim;
    dim = newDim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CURSOR__DIM, oldDim, newDim);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDim(UbqPoint newDim)
  {
    if (newDim != dim)
    {
      NotificationChain msgs = null;
      if (dim != null)
        msgs = ((InternalEObject)dim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_CURSOR__DIM, null, msgs);
      if (newDim != null)
        msgs = ((InternalEObject)newDim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_CURSOR__DIM, null, msgs);
      msgs = basicSetDim(newDim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_CURSOR__DIM, newDim, newDim));
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
      case UbqtPackage.UBQ_CURSOR__POS:
        return basicSetPos(null, msgs);
      case UbqtPackage.UBQ_CURSOR__DIM:
        return basicSetDim(null, msgs);
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
      case UbqtPackage.UBQ_CURSOR__NAME:
        return getName();
      case UbqtPackage.UBQ_CURSOR__POS:
        return getPos();
      case UbqtPackage.UBQ_CURSOR__DIM:
        return getDim();
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
      case UbqtPackage.UBQ_CURSOR__NAME:
        setName((String)newValue);
        return;
      case UbqtPackage.UBQ_CURSOR__POS:
        setPos((UbqPoint)newValue);
        return;
      case UbqtPackage.UBQ_CURSOR__DIM:
        setDim((UbqPoint)newValue);
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
      case UbqtPackage.UBQ_CURSOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UbqtPackage.UBQ_CURSOR__POS:
        setPos((UbqPoint)null);
        return;
      case UbqtPackage.UBQ_CURSOR__DIM:
        setDim((UbqPoint)null);
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
      case UbqtPackage.UBQ_CURSOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UbqtPackage.UBQ_CURSOR__POS:
        return pos != null;
      case UbqtPackage.UBQ_CURSOR__DIM:
        return dim != null;
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

} //UbqCursorImpl
