/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.PROXIMA_STATUS;
import net.sf.ubq.script.ubqt.UbqBounds;
import net.sf.ubq.script.ubqt.UbqEmmitedActions;
import net.sf.ubq.script.ubqt.UbqFiducial;
import net.sf.ubq.script.ubqt.UbqHandledReactions;
import net.sf.ubq.script.ubqt.UbqIncrementableRange;
import net.sf.ubq.script.ubqt.UbqProxima;
import net.sf.ubq.script.ubqt.UbqSlot;
import net.sf.ubq.script.ubqt.UbqtPackage;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Proxima</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getFiducial <em>Fiducial</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getRequiredProximi <em>Required Proximi</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqProximaImpl#getReacted <em>Reacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqProximaImpl extends MinimalEObjectImpl.Container implements UbqProxima
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
   * The cached value of the '{@link #getFiducial() <em>Fiducial</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiducial()
   * @generated
   * @ordered
   */
  protected UbqFiducial fiducial;

  /**
   * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEngine()
   * @generated
   * @ordered
   */
  protected DSLEngineClient engine;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected UbqIncrementableRange range;

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
   * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected static final int RADIUS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected int radius = RADIUS_EDEFAULT;

  /**
   * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected static final int ANGLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected int angle = ANGLE_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final PROXIMA_STATUS STATUS_EDEFAULT = PROXIMA_STATUS.DEACTIVATED;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected PROXIMA_STATUS status = STATUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequiredProximi() <em>Required Proximi</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredProximi()
   * @generated
   * @ordered
   */
  protected EList<UbqProxima> requiredProximi;

  /**
   * The cached value of the '{@link #getSlots() <em>Slots</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlots()
   * @generated
   * @ordered
   */
  protected EList<UbqSlot> slots;

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
  protected UbqProximaImpl()
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
    return UbqtPackage.Literals.UBQ_PROXIMA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqFiducial getFiducial()
  {
    if (fiducial != null && fiducial.eIsProxy())
    {
      InternalEObject oldFiducial = (InternalEObject)fiducial;
      fiducial = (UbqFiducial)eResolveProxy(oldFiducial);
      if (fiducial != oldFiducial)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbqtPackage.UBQ_PROXIMA__FIDUCIAL, oldFiducial, fiducial));
      }
    }
    return fiducial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqFiducial basicGetFiducial()
  {
    return fiducial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFiducial(UbqFiducial newFiducial)
  {
    UbqFiducial oldFiducial = fiducial;
    fiducial = newFiducial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__FIDUCIAL, oldFiducial, fiducial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEngineClient getEngine()
  {
    if (engine != null && engine.eIsProxy())
    {
      InternalEObject oldEngine = (InternalEObject)engine;
      engine = (DSLEngineClient)eResolveProxy(oldEngine);
      if (engine != oldEngine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbqtPackage.UBQ_PROXIMA__ENGINE, oldEngine, engine));
      }
    }
    return engine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLEngineClient basicGetEngine()
  {
    return engine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEngine(DSLEngineClient newEngine)
  {
    DSLEngineClient oldEngine = engine;
    engine = newEngine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__ENGINE, oldEngine, engine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqIncrementableRange getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(UbqIncrementableRange newRange, NotificationChain msgs)
  {
    UbqIncrementableRange oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(UbqIncrementableRange newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__RANGE, newRange, newRange));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__BOUNDS, oldBounds, newBounds);
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
        msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__BOUNDS, null, msgs);
      if (newBounds != null)
        msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__BOUNDS, null, msgs);
      msgs = basicSetBounds(newBounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__BOUNDS, newBounds, newBounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(int newRadius)
  {
    int oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__RADIUS, oldRadius, radius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAngle()
  {
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngle(int newAngle)
  {
    int oldAngle = angle;
    angle = newAngle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__ANGLE, oldAngle, angle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PROXIMA_STATUS getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(PROXIMA_STATUS newStatus)
  {
    PROXIMA_STATUS oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqProxima> getRequiredProximi()
  {
    if (requiredProximi == null)
    {
      requiredProximi = new EObjectResolvingEList<UbqProxima>(UbqProxima.class, this, UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI);
    }
    return requiredProximi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqSlot> getSlots()
  {
    if (slots == null)
    {
      slots = new EObjectResolvingEList<UbqSlot>(UbqSlot.class, this, UbqtPackage.UBQ_PROXIMA__SLOTS);
    }
    return slots;
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
      emitted = new EObjectContainmentEList<UbqEmmitedActions>(UbqEmmitedActions.class, this, UbqtPackage.UBQ_PROXIMA__EMITTED);
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
      reacted = new EObjectContainmentEList<UbqHandledReactions>(UbqHandledReactions.class, this, UbqtPackage.UBQ_PROXIMA__REACTED);
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
      case UbqtPackage.UBQ_PROXIMA__RANGE:
        return basicSetRange(null, msgs);
      case UbqtPackage.UBQ_PROXIMA__BOUNDS:
        return basicSetBounds(null, msgs);
      case UbqtPackage.UBQ_PROXIMA__EMITTED:
        return ((InternalEList<?>)getEmitted()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_PROXIMA__REACTED:
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
      case UbqtPackage.UBQ_PROXIMA__NAME:
        return getName();
      case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
        if (resolve) return getFiducial();
        return basicGetFiducial();
      case UbqtPackage.UBQ_PROXIMA__ENGINE:
        if (resolve) return getEngine();
        return basicGetEngine();
      case UbqtPackage.UBQ_PROXIMA__RANGE:
        return getRange();
      case UbqtPackage.UBQ_PROXIMA__BOUNDS:
        return getBounds();
      case UbqtPackage.UBQ_PROXIMA__RADIUS:
        return getRadius();
      case UbqtPackage.UBQ_PROXIMA__ANGLE:
        return getAngle();
      case UbqtPackage.UBQ_PROXIMA__STATUS:
        return getStatus();
      case UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI:
        return getRequiredProximi();
      case UbqtPackage.UBQ_PROXIMA__SLOTS:
        return getSlots();
      case UbqtPackage.UBQ_PROXIMA__EMITTED:
        return getEmitted();
      case UbqtPackage.UBQ_PROXIMA__REACTED:
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
      case UbqtPackage.UBQ_PROXIMA__NAME:
        setName((String)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
        setFiducial((UbqFiducial)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__ENGINE:
        setEngine((DSLEngineClient)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__RANGE:
        setRange((UbqIncrementableRange)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__BOUNDS:
        setBounds((UbqBounds)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__RADIUS:
        setRadius((Integer)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__ANGLE:
        setAngle((Integer)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__STATUS:
        setStatus((PROXIMA_STATUS)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI:
        getRequiredProximi().clear();
        getRequiredProximi().addAll((Collection<? extends UbqProxima>)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__SLOTS:
        getSlots().clear();
        getSlots().addAll((Collection<? extends UbqSlot>)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__EMITTED:
        getEmitted().clear();
        getEmitted().addAll((Collection<? extends UbqEmmitedActions>)newValue);
        return;
      case UbqtPackage.UBQ_PROXIMA__REACTED:
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
      case UbqtPackage.UBQ_PROXIMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
        setFiducial((UbqFiducial)null);
        return;
      case UbqtPackage.UBQ_PROXIMA__ENGINE:
        setEngine((DSLEngineClient)null);
        return;
      case UbqtPackage.UBQ_PROXIMA__RANGE:
        setRange((UbqIncrementableRange)null);
        return;
      case UbqtPackage.UBQ_PROXIMA__BOUNDS:
        setBounds((UbqBounds)null);
        return;
      case UbqtPackage.UBQ_PROXIMA__RADIUS:
        setRadius(RADIUS_EDEFAULT);
        return;
      case UbqtPackage.UBQ_PROXIMA__ANGLE:
        setAngle(ANGLE_EDEFAULT);
        return;
      case UbqtPackage.UBQ_PROXIMA__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI:
        getRequiredProximi().clear();
        return;
      case UbqtPackage.UBQ_PROXIMA__SLOTS:
        getSlots().clear();
        return;
      case UbqtPackage.UBQ_PROXIMA__EMITTED:
        getEmitted().clear();
        return;
      case UbqtPackage.UBQ_PROXIMA__REACTED:
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
      case UbqtPackage.UBQ_PROXIMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
        return fiducial != null;
      case UbqtPackage.UBQ_PROXIMA__ENGINE:
        return engine != null;
      case UbqtPackage.UBQ_PROXIMA__RANGE:
        return range != null;
      case UbqtPackage.UBQ_PROXIMA__BOUNDS:
        return bounds != null;
      case UbqtPackage.UBQ_PROXIMA__RADIUS:
        return radius != RADIUS_EDEFAULT;
      case UbqtPackage.UBQ_PROXIMA__ANGLE:
        return angle != ANGLE_EDEFAULT;
      case UbqtPackage.UBQ_PROXIMA__STATUS:
        return status != STATUS_EDEFAULT;
      case UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI:
        return requiredProximi != null && !requiredProximi.isEmpty();
      case UbqtPackage.UBQ_PROXIMA__SLOTS:
        return slots != null && !slots.isEmpty();
      case UbqtPackage.UBQ_PROXIMA__EMITTED:
        return emitted != null && !emitted.isEmpty();
      case UbqtPackage.UBQ_PROXIMA__REACTED:
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
    result.append(", radius: ");
    result.append(radius);
    result.append(", angle: ");
    result.append(angle);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //UbqProximaImpl
