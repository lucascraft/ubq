/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.SLOTS;
import net.sf.ubq.script.ubqt.SLOT_KIND;
import net.sf.ubq.script.ubqt.SLOT_STATUS;
import net.sf.ubq.script.ubqt.UbqBounds;
import net.sf.ubq.script.ubqt.UbqEmmitedActions;
import net.sf.ubq.script.ubqt.UbqHandledReactions;
import net.sf.ubq.script.ubqt.UbqSlot;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSlotImpl#getReacted <em>Reacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqSlotImpl extends MinimalEObjectImpl.Container implements UbqSlot
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
   * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBounds()
   * @generated
   * @ordered
   */
  protected UbqBounds bounds;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final SLOTS POSITION_EDEFAULT = SLOTS.P0;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected SLOTS position = POSITION_EDEFAULT;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final SLOT_KIND KIND_EDEFAULT = SLOT_KIND.PUSH;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected SLOT_KIND kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final SLOT_STATUS STATUS_EDEFAULT = SLOT_STATUS.SELECTED;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected SLOT_STATUS status = STATUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getEmitted() <em>Emitted</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmitted()
   * @generated
   * @ordered
   */
  protected EList<UbqEmmitedActions> emitted;

  /**
   * The cached value of the '{@link #getReacted() <em>Reacted</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReacted()
   * @generated
   * @ordered
   */
  protected EList<UbqHandledReactions> reacted;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqSlotImpl()
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
    return UbqtPackage.Literals.UBQ_SLOT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqBounds getBounds()
  {
    return bounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBounds(UbqBounds newBounds, NotificationChain msgs)
  {
    UbqBounds oldBounds = bounds;
    bounds = newBounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__BOUNDS, oldBounds, newBounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBounds(UbqBounds newBounds)
  {
    if (newBounds != bounds)
    {
      NotificationChain msgs = null;
      if (bounds != null)
        msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_SLOT__BOUNDS, null, msgs);
      if (newBounds != null)
        msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_SLOT__BOUNDS, null, msgs);
      msgs = basicSetBounds(newBounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__BOUNDS, newBounds, newBounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLOTS getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(SLOTS newPosition)
  {
    SLOTS oldPosition = position;
    position = newPosition == null ? POSITION_EDEFAULT : newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLOT_KIND getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(SLOT_KIND newKind)
  {
    SLOT_KIND oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLOT_STATUS getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(SLOT_STATUS newStatus)
  {
    SLOT_STATUS oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SLOT__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqEmmitedActions> getEmitted()
  {
    if (emitted == null)
    {
      emitted = new EObjectContainmentEList<UbqEmmitedActions>(UbqEmmitedActions.class, this, UbqtPackage.UBQ_SLOT__EMITTED);
    }
    return emitted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqHandledReactions> getReacted()
  {
    if (reacted == null)
    {
      reacted = new EObjectContainmentEList<UbqHandledReactions>(UbqHandledReactions.class, this, UbqtPackage.UBQ_SLOT__REACTED);
    }
    return reacted;
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
      case UbqtPackage.UBQ_SLOT__BOUNDS:
        return basicSetBounds(null, msgs);
      case UbqtPackage.UBQ_SLOT__EMITTED:
        return ((InternalEList<?>)getEmitted()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SLOT__REACTED:
        return ((InternalEList<?>)getReacted()).basicRemove(otherEnd, msgs);
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
      case UbqtPackage.UBQ_SLOT__NAME:
        return getName();
      case UbqtPackage.UBQ_SLOT__BOUNDS:
        return getBounds();
      case UbqtPackage.UBQ_SLOT__POSITION:
        return getPosition();
      case UbqtPackage.UBQ_SLOT__KIND:
        return getKind();
      case UbqtPackage.UBQ_SLOT__STATUS:
        return getStatus();
      case UbqtPackage.UBQ_SLOT__EMITTED:
        return getEmitted();
      case UbqtPackage.UBQ_SLOT__REACTED:
        return getReacted();
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
      case UbqtPackage.UBQ_SLOT__NAME:
        setName((String)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__BOUNDS:
        setBounds((UbqBounds)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__POSITION:
        setPosition((SLOTS)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__KIND:
        setKind((SLOT_KIND)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__STATUS:
        setStatus((SLOT_STATUS)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__EMITTED:
        getEmitted().clear();
        getEmitted().addAll((Collection<? extends UbqEmmitedActions>)newValue);
        return;
      case UbqtPackage.UBQ_SLOT__REACTED:
        getReacted().clear();
        getReacted().addAll((Collection<? extends UbqHandledReactions>)newValue);
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
      case UbqtPackage.UBQ_SLOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UbqtPackage.UBQ_SLOT__BOUNDS:
        setBounds((UbqBounds)null);
        return;
      case UbqtPackage.UBQ_SLOT__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case UbqtPackage.UBQ_SLOT__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case UbqtPackage.UBQ_SLOT__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case UbqtPackage.UBQ_SLOT__EMITTED:
        getEmitted().clear();
        return;
      case UbqtPackage.UBQ_SLOT__REACTED:
        getReacted().clear();
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
      case UbqtPackage.UBQ_SLOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UbqtPackage.UBQ_SLOT__BOUNDS:
        return bounds != null;
      case UbqtPackage.UBQ_SLOT__POSITION:
        return position != POSITION_EDEFAULT;
      case UbqtPackage.UBQ_SLOT__KIND:
        return kind != KIND_EDEFAULT;
      case UbqtPackage.UBQ_SLOT__STATUS:
        return status != STATUS_EDEFAULT;
      case UbqtPackage.UBQ_SLOT__EMITTED:
        return emitted != null && !emitted.isEmpty();
      case UbqtPackage.UBQ_SLOT__REACTED:
        return reacted != null && !reacted.isEmpty();
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
    result.append(", position: ");
    result.append(position);
    result.append(", kind: ");
    result.append(kind);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //UbqSlotImpl
