/**
 */
package net.sf.smbt.ubqt.impl;

import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Fiducial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqFiducialImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqFiducialImpl#getFidcode <em>Fidcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqFiducialImpl extends MinimalEObjectImpl.Container implements UbqFiducial {
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
	 * The default value of the '{@link #getFidcode() <em>Fidcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidcode()
	 * @generated
	 * @ordered
	 */
	protected static final int FIDCODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFidcode() <em>Fidcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidcode()
	 * @generated
	 * @ordered
	 */
	protected int fidcode = FIDCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqFiducialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_FIDUCIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_FIDUCIAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFidcode() {
		return fidcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFidcode(int newFidcode) {
		int oldFidcode = fidcode;
		fidcode = newFidcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_FIDUCIAL__FIDCODE, oldFidcode, fidcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbqtPackage.UBQ_FIDUCIAL__NAME:
				return getName();
			case UbqtPackage.UBQ_FIDUCIAL__FIDCODE:
				return getFidcode();
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
			case UbqtPackage.UBQ_FIDUCIAL__NAME:
				setName((String)newValue);
				return;
			case UbqtPackage.UBQ_FIDUCIAL__FIDCODE:
				setFidcode((Integer)newValue);
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
			case UbqtPackage.UBQ_FIDUCIAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UbqtPackage.UBQ_FIDUCIAL__FIDCODE:
				setFidcode(FIDCODE_EDEFAULT);
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
			case UbqtPackage.UBQ_FIDUCIAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UbqtPackage.UBQ_FIDUCIAL__FIDCODE:
				return fidcode != FIDCODE_EDEFAULT;
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
		result.append(", fidcode: ");
		result.append(fidcode);
		result.append(')');
		return result.toString();
	}

} //UbqFiducialImpl
