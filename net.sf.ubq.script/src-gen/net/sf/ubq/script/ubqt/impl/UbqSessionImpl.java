/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.NetConfImport;
import net.sf.ubq.script.ubqt.OrchestrorImport;
import net.sf.ubq.script.ubqt.UbqAction;
import net.sf.ubq.script.ubqt.UbqCursor;
import net.sf.ubq.script.ubqt.UbqDisplayMode;
import net.sf.ubq.script.ubqt.UbqEmmitedActions;
import net.sf.ubq.script.ubqt.UbqFiducial;
import net.sf.ubq.script.ubqt.UbqHandledReactions;
import net.sf.ubq.script.ubqt.UbqProxima;
import net.sf.ubq.script.ubqt.UbqReaction;
import net.sf.ubq.script.ubqt.UbqSession;
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
 * An implementation of the model object '<em><b>Ubq Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getNetconfs <em>Netconfs</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getOrchestrors <em>Orchestrors</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getFiducials <em>Fiducials</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getEmmiters <em>Emmiters</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getProximi <em>Proximi</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqSessionImpl#getFingers <em>Fingers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqSessionImpl extends MinimalEObjectImpl.Container implements UbqSession
{
  /**
   * The cached value of the '{@link #getNetconfs() <em>Netconfs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetconfs()
   * @generated
   * @ordered
   */
  protected EList<NetConfImport> netconfs;

  /**
   * The cached value of the '{@link #getOrchestrors() <em>Orchestrors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrchestrors()
   * @generated
   * @ordered
   */
  protected EList<OrchestrorImport> orchestrors;

  /**
   * The cached value of the '{@link #getDisplayMode() <em>Display Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayMode()
   * @generated
   * @ordered
   */
  protected UbqDisplayMode displayMode;

  /**
   * The cached value of the '{@link #getFiducials() <em>Fiducials</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiducials()
   * @generated
   * @ordered
   */
  protected EList<UbqFiducial> fiducials;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<UbqAction> actions;

  /**
   * The cached value of the '{@link #getReactions() <em>Reactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactions()
   * @generated
   * @ordered
   */
  protected EList<UbqReaction> reactions;

  /**
   * The cached value of the '{@link #getEmmiters() <em>Emmiters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmmiters()
   * @generated
   * @ordered
   */
  protected EList<UbqEmmitedActions> emmiters;

  /**
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<UbqHandledReactions> handlers;

  /**
   * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlots()
   * @generated
   * @ordered
   */
  protected EList<UbqSlot> slots;

  /**
   * The cached value of the '{@link #getProximi() <em>Proximi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProximi()
   * @generated
   * @ordered
   */
  protected EList<UbqProxima> proximi;

  /**
   * The cached value of the '{@link #getFingers() <em>Fingers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFingers()
   * @generated
   * @ordered
   */
  protected EList<UbqCursor> fingers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqSessionImpl()
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
    return UbqtPackage.Literals.UBQ_SESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetConfImport> getNetconfs()
  {
    if (netconfs == null)
    {
      netconfs = new EObjectContainmentEList<NetConfImport>(NetConfImport.class, this, UbqtPackage.UBQ_SESSION__NETCONFS);
    }
    return netconfs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrchestrorImport> getOrchestrors()
  {
    if (orchestrors == null)
    {
      orchestrors = new EObjectContainmentEList<OrchestrorImport>(OrchestrorImport.class, this, UbqtPackage.UBQ_SESSION__ORCHESTRORS);
    }
    return orchestrors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UbqDisplayMode getDisplayMode()
  {
    return displayMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisplayMode(UbqDisplayMode newDisplayMode, NotificationChain msgs)
  {
    UbqDisplayMode oldDisplayMode = displayMode;
    displayMode = newDisplayMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SESSION__DISPLAY_MODE, oldDisplayMode, newDisplayMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayMode(UbqDisplayMode newDisplayMode)
  {
    if (newDisplayMode != displayMode)
    {
      NotificationChain msgs = null;
      if (displayMode != null)
        msgs = ((InternalEObject)displayMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_SESSION__DISPLAY_MODE, null, msgs);
      if (newDisplayMode != null)
        msgs = ((InternalEObject)newDisplayMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_SESSION__DISPLAY_MODE, null, msgs);
      msgs = basicSetDisplayMode(newDisplayMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_SESSION__DISPLAY_MODE, newDisplayMode, newDisplayMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqFiducial> getFiducials()
  {
    if (fiducials == null)
    {
      fiducials = new EObjectContainmentEList<UbqFiducial>(UbqFiducial.class, this, UbqtPackage.UBQ_SESSION__FIDUCIALS);
    }
    return fiducials;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<UbqAction>(UbqAction.class, this, UbqtPackage.UBQ_SESSION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqReaction> getReactions()
  {
    if (reactions == null)
    {
      reactions = new EObjectContainmentEList<UbqReaction>(UbqReaction.class, this, UbqtPackage.UBQ_SESSION__REACTIONS);
    }
    return reactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqEmmitedActions> getEmmiters()
  {
    if (emmiters == null)
    {
      emmiters = new EObjectContainmentEList<UbqEmmitedActions>(UbqEmmitedActions.class, this, UbqtPackage.UBQ_SESSION__EMMITERS);
    }
    return emmiters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqHandledReactions> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<UbqHandledReactions>(UbqHandledReactions.class, this, UbqtPackage.UBQ_SESSION__HANDLERS);
    }
    return handlers;
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
      slots = new EObjectContainmentEList<UbqSlot>(UbqSlot.class, this, UbqtPackage.UBQ_SESSION__SLOTS);
    }
    return slots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqProxima> getProximi()
  {
    if (proximi == null)
    {
      proximi = new EObjectContainmentEList<UbqProxima>(UbqProxima.class, this, UbqtPackage.UBQ_SESSION__PROXIMI);
    }
    return proximi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UbqCursor> getFingers()
  {
    if (fingers == null)
    {
      fingers = new EObjectContainmentEList<UbqCursor>(UbqCursor.class, this, UbqtPackage.UBQ_SESSION__FINGERS);
    }
    return fingers;
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
      case UbqtPackage.UBQ_SESSION__NETCONFS:
        return ((InternalEList<?>)getNetconfs()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__ORCHESTRORS:
        return ((InternalEList<?>)getOrchestrors()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
        return basicSetDisplayMode(null, msgs);
      case UbqtPackage.UBQ_SESSION__FIDUCIALS:
        return ((InternalEList<?>)getFiducials()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__REACTIONS:
        return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__EMMITERS:
        return ((InternalEList<?>)getEmmiters()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__SLOTS:
        return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__PROXIMI:
        return ((InternalEList<?>)getProximi()).basicRemove(otherEnd, msgs);
      case UbqtPackage.UBQ_SESSION__FINGERS:
        return ((InternalEList<?>)getFingers()).basicRemove(otherEnd, msgs);
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
      case UbqtPackage.UBQ_SESSION__NETCONFS:
        return getNetconfs();
      case UbqtPackage.UBQ_SESSION__ORCHESTRORS:
        return getOrchestrors();
      case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
        return getDisplayMode();
      case UbqtPackage.UBQ_SESSION__FIDUCIALS:
        return getFiducials();
      case UbqtPackage.UBQ_SESSION__ACTIONS:
        return getActions();
      case UbqtPackage.UBQ_SESSION__REACTIONS:
        return getReactions();
      case UbqtPackage.UBQ_SESSION__EMMITERS:
        return getEmmiters();
      case UbqtPackage.UBQ_SESSION__HANDLERS:
        return getHandlers();
      case UbqtPackage.UBQ_SESSION__SLOTS:
        return getSlots();
      case UbqtPackage.UBQ_SESSION__PROXIMI:
        return getProximi();
      case UbqtPackage.UBQ_SESSION__FINGERS:
        return getFingers();
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
      case UbqtPackage.UBQ_SESSION__NETCONFS:
        getNetconfs().clear();
        getNetconfs().addAll((Collection<? extends NetConfImport>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__ORCHESTRORS:
        getOrchestrors().clear();
        getOrchestrors().addAll((Collection<? extends OrchestrorImport>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
        setDisplayMode((UbqDisplayMode)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__FIDUCIALS:
        getFiducials().clear();
        getFiducials().addAll((Collection<? extends UbqFiducial>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends UbqAction>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__REACTIONS:
        getReactions().clear();
        getReactions().addAll((Collection<? extends UbqReaction>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__EMMITERS:
        getEmmiters().clear();
        getEmmiters().addAll((Collection<? extends UbqEmmitedActions>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends UbqHandledReactions>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__SLOTS:
        getSlots().clear();
        getSlots().addAll((Collection<? extends UbqSlot>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__PROXIMI:
        getProximi().clear();
        getProximi().addAll((Collection<? extends UbqProxima>)newValue);
        return;
      case UbqtPackage.UBQ_SESSION__FINGERS:
        getFingers().clear();
        getFingers().addAll((Collection<? extends UbqCursor>)newValue);
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
      case UbqtPackage.UBQ_SESSION__NETCONFS:
        getNetconfs().clear();
        return;
      case UbqtPackage.UBQ_SESSION__ORCHESTRORS:
        getOrchestrors().clear();
        return;
      case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
        setDisplayMode((UbqDisplayMode)null);
        return;
      case UbqtPackage.UBQ_SESSION__FIDUCIALS:
        getFiducials().clear();
        return;
      case UbqtPackage.UBQ_SESSION__ACTIONS:
        getActions().clear();
        return;
      case UbqtPackage.UBQ_SESSION__REACTIONS:
        getReactions().clear();
        return;
      case UbqtPackage.UBQ_SESSION__EMMITERS:
        getEmmiters().clear();
        return;
      case UbqtPackage.UBQ_SESSION__HANDLERS:
        getHandlers().clear();
        return;
      case UbqtPackage.UBQ_SESSION__SLOTS:
        getSlots().clear();
        return;
      case UbqtPackage.UBQ_SESSION__PROXIMI:
        getProximi().clear();
        return;
      case UbqtPackage.UBQ_SESSION__FINGERS:
        getFingers().clear();
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
      case UbqtPackage.UBQ_SESSION__NETCONFS:
        return netconfs != null && !netconfs.isEmpty();
      case UbqtPackage.UBQ_SESSION__ORCHESTRORS:
        return orchestrors != null && !orchestrors.isEmpty();
      case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
        return displayMode != null;
      case UbqtPackage.UBQ_SESSION__FIDUCIALS:
        return fiducials != null && !fiducials.isEmpty();
      case UbqtPackage.UBQ_SESSION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case UbqtPackage.UBQ_SESSION__REACTIONS:
        return reactions != null && !reactions.isEmpty();
      case UbqtPackage.UBQ_SESSION__EMMITERS:
        return emmiters != null && !emmiters.isEmpty();
      case UbqtPackage.UBQ_SESSION__HANDLERS:
        return handlers != null && !handlers.isEmpty();
      case UbqtPackage.UBQ_SESSION__SLOTS:
        return slots != null && !slots.isEmpty();
      case UbqtPackage.UBQ_SESSION__PROXIMI:
        return proximi != null && !proximi.isEmpty();
      case UbqtPackage.UBQ_SESSION__FINGERS:
        return fingers != null && !fingers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UbqSessionImpl
