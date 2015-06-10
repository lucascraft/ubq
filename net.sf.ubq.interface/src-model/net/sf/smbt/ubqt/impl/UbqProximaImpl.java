/**
 */
package net.sf.smbt.ubqt.impl;

import java.util.Collection;

import net.sf.smbt.ubqt.PROXIMA_FUNCTION;
import net.sf.smbt.ubqt.PROXIMA_ROLE;
import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.PROXIMA_STYLE;
import net.sf.smbt.ubqt.UbqBounds;
import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqEmmitedActions;
import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqHandledReactions;
import net.sf.smbt.ubqt.UbqIncrementableRange;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSlot;
import net.sf.smbt.ubqt.UbqtPackage;

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
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getFiducial <em>Fiducial</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getRequiredProximi <em>Required Proximi</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getReacted <em>Reacted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getFgColor <em>Fg Color</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getStep <em>Step</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getRebang <em>Rebang</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqProximaImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqProximaImpl extends MinimalEObjectImpl.Container implements UbqProxima {
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
	protected static final float ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected float angle = ANGLE_EDEFAULT;

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
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected UbqColor bgColor;

	/**
	 * The cached value of the '{@link #getFgColor() <em>Fg Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFgColor()
	 * @generated
	 * @ordered
	 */
	protected UbqColor fgColor;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final PROXIMA_STYLE STYLE_EDEFAULT = PROXIMA_STYLE.DISC;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected PROXIMA_STYLE style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRebang() <em>Rebang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebang()
	 * @generated
	 * @ordered
	 */
	protected static final int REBANG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRebang() <em>Rebang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebang()
	 * @generated
	 * @ordered
	 */
	protected int rebang = REBANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final PROXIMA_ROLE ROLE_EDEFAULT = PROXIMA_ROLE.SIN_OSC;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected PROXIMA_ROLE role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PROXIMA_FUNCTION FUNCTION_EDEFAULT = PROXIMA_FUNCTION.KNOB;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PROXIMA_FUNCTION function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqProximaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_PROXIMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
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
	public UbqFiducial getFiducial() {
		if (fiducial != null && fiducial.eIsProxy()) {
			InternalEObject oldFiducial = (InternalEObject)fiducial;
			fiducial = (UbqFiducial)eResolveProxy(oldFiducial);
			if (fiducial != oldFiducial) {
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
	public UbqFiducial basicGetFiducial() {
		return fiducial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiducial(UbqFiducial newFiducial) {
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
	public UbqIncrementableRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(UbqIncrementableRange newRange, NotificationChain msgs) {
		UbqIncrementableRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
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
	public void setRange(UbqIncrementableRange newRange) {
		if (newRange != range) {
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
	public UbqBounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(UbqBounds newBounds, NotificationChain msgs) {
		UbqBounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
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
	public void setBounds(UbqBounds newBounds) {
		if (newBounds != bounds) {
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
	public int getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(int newRadius) {
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
	public float getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(float newAngle) {
		float oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_STATUS getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PROXIMA_STATUS newStatus) {
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
	public EList<UbqProxima> getRequiredProximi() {
		if (requiredProximi == null) {
			requiredProximi = new EObjectResolvingEList<UbqProxima>(UbqProxima.class, this, UbqtPackage.UBQ_PROXIMA__REQUIRED_PROXIMI);
		}
		return requiredProximi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqSlot> getSlots() {
		if (slots == null) {
			slots = new EObjectResolvingEList<UbqSlot>(UbqSlot.class, this, UbqtPackage.UBQ_PROXIMA__SLOTS);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqEmmitedActions> getEmitted() {
		if (emitted == null) {
			emitted = new EObjectContainmentEList<UbqEmmitedActions>(UbqEmmitedActions.class, this, UbqtPackage.UBQ_PROXIMA__EMITTED);
		}
		return emitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqHandledReactions> getReacted() {
		if (reacted == null) {
			reacted = new EObjectContainmentEList<UbqHandledReactions>(UbqHandledReactions.class, this, UbqtPackage.UBQ_PROXIMA__REACTED);
		}
		return reacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBgColor(UbqColor newBgColor, NotificationChain msgs) {
		UbqColor oldBgColor = bgColor;
		bgColor = newBgColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__BG_COLOR, oldBgColor, newBgColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(UbqColor newBgColor) {
		if (newBgColor != bgColor) {
			NotificationChain msgs = null;
			if (bgColor != null)
				msgs = ((InternalEObject)bgColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__BG_COLOR, null, msgs);
			if (newBgColor != null)
				msgs = ((InternalEObject)newBgColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__BG_COLOR, null, msgs);
			msgs = basicSetBgColor(newBgColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__BG_COLOR, newBgColor, newBgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor getFgColor() {
		return fgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFgColor(UbqColor newFgColor, NotificationChain msgs) {
		UbqColor oldFgColor = fgColor;
		fgColor = newFgColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__FG_COLOR, oldFgColor, newFgColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFgColor(UbqColor newFgColor) {
		if (newFgColor != fgColor) {
			NotificationChain msgs = null;
			if (fgColor != null)
				msgs = ((InternalEObject)fgColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__FG_COLOR, null, msgs);
			if (newFgColor != null)
				msgs = ((InternalEObject)newFgColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_PROXIMA__FG_COLOR, null, msgs);
			msgs = basicSetFgColor(newFgColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__FG_COLOR, newFgColor, newFgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_STYLE getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(PROXIMA_STYLE newStyle) {
		PROXIMA_STYLE oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRebang() {
		return rebang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRebang(int newRebang) {
		int oldRebang = rebang;
		rebang = newRebang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__REBANG, oldRebang, rebang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_ROLE getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(PROXIMA_ROLE newRole) {
		PROXIMA_ROLE oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_FUNCTION getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(PROXIMA_FUNCTION newFunction) {
		PROXIMA_FUNCTION oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_PROXIMA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbqtPackage.UBQ_PROXIMA__RANGE:
				return basicSetRange(null, msgs);
			case UbqtPackage.UBQ_PROXIMA__BOUNDS:
				return basicSetBounds(null, msgs);
			case UbqtPackage.UBQ_PROXIMA__EMITTED:
				return ((InternalEList<?>)getEmitted()).basicRemove(otherEnd, msgs);
			case UbqtPackage.UBQ_PROXIMA__REACTED:
				return ((InternalEList<?>)getReacted()).basicRemove(otherEnd, msgs);
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
				return basicSetBgColor(null, msgs);
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
				return basicSetFgColor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbqtPackage.UBQ_PROXIMA__NAME:
				return getName();
			case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
				if (resolve) return getFiducial();
				return basicGetFiducial();
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
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
				return getBgColor();
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
				return getFgColor();
			case UbqtPackage.UBQ_PROXIMA__LIMIT:
				return getLimit();
			case UbqtPackage.UBQ_PROXIMA__STEP:
				return getStep();
			case UbqtPackage.UBQ_PROXIMA__SPEED:
				return getSpeed();
			case UbqtPackage.UBQ_PROXIMA__STYLE:
				return getStyle();
			case UbqtPackage.UBQ_PROXIMA__REBANG:
				return getRebang();
			case UbqtPackage.UBQ_PROXIMA__ROLE:
				return getRole();
			case UbqtPackage.UBQ_PROXIMA__FUNCTION:
				return getFunction();
			case UbqtPackage.UBQ_PROXIMA__ID:
				return getId();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UbqtPackage.UBQ_PROXIMA__NAME:
				setName((String)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
				setFiducial((UbqFiducial)newValue);
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
				setAngle((Float)newValue);
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
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
				setBgColor((UbqColor)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
				setFgColor((UbqColor)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__LIMIT:
				setLimit((Integer)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__STEP:
				setStep((Double)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__SPEED:
				setSpeed((Double)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__STYLE:
				setStyle((PROXIMA_STYLE)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__REBANG:
				setRebang((Integer)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__ROLE:
				setRole((PROXIMA_ROLE)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__FUNCTION:
				setFunction((PROXIMA_FUNCTION)newValue);
				return;
			case UbqtPackage.UBQ_PROXIMA__ID:
				setId((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UbqtPackage.UBQ_PROXIMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
				setFiducial((UbqFiducial)null);
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
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
				setBgColor((UbqColor)null);
				return;
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
				setFgColor((UbqColor)null);
				return;
			case UbqtPackage.UBQ_PROXIMA__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__REBANG:
				setRebang(REBANG_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case UbqtPackage.UBQ_PROXIMA__ID:
				setId(ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UbqtPackage.UBQ_PROXIMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UbqtPackage.UBQ_PROXIMA__FIDUCIAL:
				return fiducial != null;
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
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
				return bgColor != null;
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
				return fgColor != null;
			case UbqtPackage.UBQ_PROXIMA__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__STEP:
				return step != STEP_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__SPEED:
				return speed != SPEED_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__STYLE:
				return style != STYLE_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__REBANG:
				return rebang != REBANG_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__ROLE:
				return role != ROLE_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case UbqtPackage.UBQ_PROXIMA__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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
		result.append(", limit: ");
		result.append(limit);
		result.append(", step: ");
		result.append(step);
		result.append(", speed: ");
		result.append(speed);
		result.append(", style: ");
		result.append(style);
		result.append(", rebang: ");
		result.append(rebang);
		result.append(", role: ");
		result.append(role);
		result.append(", function: ");
		result.append(function);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UbqProximaImpl
