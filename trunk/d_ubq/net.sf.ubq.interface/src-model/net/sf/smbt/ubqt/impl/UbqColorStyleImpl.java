/**
 */
package net.sf.smbt.ubqt.impl;

import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqColorStyle;
import net.sf.smbt.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Color Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqColorStyleImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqColorStyleImpl#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqColorStyleImpl extends MinimalEObjectImpl.Container implements UbqColorStyle {
	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected UbqColor foreground;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected UbqColor background;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqColorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_COLOR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeground(UbqColor newForeground, NotificationChain msgs) {
		UbqColor oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND, oldForeground, newForeground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(UbqColor newForeground) {
		if (newForeground != foreground) {
			NotificationChain msgs = null;
			if (foreground != null)
				msgs = ((InternalEObject)foreground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND, null, msgs);
			if (newForeground != null)
				msgs = ((InternalEObject)newForeground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND, null, msgs);
			msgs = basicSetForeground(newForeground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND, newForeground, newForeground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(UbqColor newBackground, NotificationChain msgs) {
		UbqColor oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND, oldBackground, newBackground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(UbqColor newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND, newBackground, newBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND:
				return basicSetForeground(null, msgs);
			case UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND:
				return basicSetBackground(null, msgs);
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
			case UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND:
				return getForeground();
			case UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND:
				return getBackground();
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
			case UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND:
				setForeground((UbqColor)newValue);
				return;
			case UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND:
				setBackground((UbqColor)newValue);
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
			case UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND:
				setForeground((UbqColor)null);
				return;
			case UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND:
				setBackground((UbqColor)null);
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
			case UbqtPackage.UBQ_COLOR_STYLE__FOREGROUND:
				return foreground != null;
			case UbqtPackage.UBQ_COLOR_STYLE__BACKGROUND:
				return background != null;
		}
		return super.eIsSet(featureID);
	}

} //UbqColorStyleImpl
