/**
 */
package net.sf.smbt.ubqt.impl;

import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqDisplayMode;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Display Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqDisplayModeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqDisplayModeImpl#getBgColor <em>Bg Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqDisplayModeImpl extends MinimalEObjectImpl.Container implements UbqDisplayMode {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected UbqPoint mode;

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected UbqColor bgColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqDisplayModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_DISPLAY_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqPoint getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(UbqPoint newMode, NotificationChain msgs) {
		UbqPoint oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_DISPLAY_MODE__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(UbqPoint newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_DISPLAY_MODE__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_DISPLAY_MODE__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_DISPLAY_MODE__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor getBgColor() {
		if (bgColor != null && bgColor.eIsProxy()) {
			InternalEObject oldBgColor = (InternalEObject)bgColor;
			bgColor = (UbqColor)eResolveProxy(oldBgColor);
			if (bgColor != oldBgColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR, oldBgColor, bgColor));
			}
		}
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor basicGetBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(UbqColor newBgColor) {
		UbqColor oldBgColor = bgColor;
		bgColor = newBgColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR, oldBgColor, bgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbqtPackage.UBQ_DISPLAY_MODE__MODE:
				return basicSetMode(null, msgs);
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
			case UbqtPackage.UBQ_DISPLAY_MODE__MODE:
				return getMode();
			case UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR:
				if (resolve) return getBgColor();
				return basicGetBgColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UbqtPackage.UBQ_DISPLAY_MODE__MODE:
				setMode((UbqPoint)newValue);
				return;
			case UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR:
				setBgColor((UbqColor)newValue);
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
			case UbqtPackage.UBQ_DISPLAY_MODE__MODE:
				setMode((UbqPoint)null);
				return;
			case UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR:
				setBgColor((UbqColor)null);
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
			case UbqtPackage.UBQ_DISPLAY_MODE__MODE:
				return mode != null;
			case UbqtPackage.UBQ_DISPLAY_MODE__BG_COLOR:
				return bgColor != null;
		}
		return super.eIsSet(featureID);
	}

} //UbqDisplayModeImpl
