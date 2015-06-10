/**
 */
package net.sf.smbt.ubqt.impl;

import java.util.Collection;

import net.sf.smbt.ubqt.UBQ_EVENTS;
import net.sf.smbt.ubqt.UbqAction;
import net.sf.smbt.ubqt.UbqEmmitedActions;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqtPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Emmited Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl#getProximiAsRef <em>Proximi As Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqEmmitedActionsImpl extends MinimalEObjectImpl.Container implements UbqEmmitedActions {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UbqAction> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<UBQ_EVENTS> events;

	/**
	 * The cached value of the '{@link #getProximiAsRef() <em>Proximi As Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProximiAsRef()
	 * @generated
	 * @ordered
	 */
	protected EList<UbqProxima> proximiAsRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbqEmmitedActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_EMMITED_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqAction> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<UbqAction>(UbqAction.class, this, UbqtPackage.UBQ_EMMITED_ACTIONS__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UBQ_EVENTS> getEvents() {
		if (events == null) {
			events = new EDataTypeEList<UBQ_EVENTS>(UBQ_EVENTS.class, this, UbqtPackage.UBQ_EMMITED_ACTIONS__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqProxima> getProximiAsRef() {
		if (proximiAsRef == null) {
			proximiAsRef = new EObjectResolvingEList<UbqProxima>(UbqProxima.class, this, UbqtPackage.UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF);
		}
		return proximiAsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbqtPackage.UBQ_EMMITED_ACTIONS__ACTIONS:
				return getActions();
			case UbqtPackage.UBQ_EMMITED_ACTIONS__EVENTS:
				return getEvents();
			case UbqtPackage.UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF:
				return getProximiAsRef();
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
			case UbqtPackage.UBQ_EMMITED_ACTIONS__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends UbqAction>)newValue);
				return;
			case UbqtPackage.UBQ_EMMITED_ACTIONS__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends UBQ_EVENTS>)newValue);
				return;
			case UbqtPackage.UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF:
				getProximiAsRef().clear();
				getProximiAsRef().addAll((Collection<? extends UbqProxima>)newValue);
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
			case UbqtPackage.UBQ_EMMITED_ACTIONS__ACTIONS:
				getActions().clear();
				return;
			case UbqtPackage.UBQ_EMMITED_ACTIONS__EVENTS:
				getEvents().clear();
				return;
			case UbqtPackage.UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF:
				getProximiAsRef().clear();
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
			case UbqtPackage.UBQ_EMMITED_ACTIONS__ACTIONS:
				return actions != null && !actions.isEmpty();
			case UbqtPackage.UBQ_EMMITED_ACTIONS__EVENTS:
				return events != null && !events.isEmpty();
			case UbqtPackage.UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF:
				return proximiAsRef != null && !proximiAsRef.isEmpty();
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
		result.append(" (events: ");
		result.append(events);
		result.append(')');
		return result.toString();
	}

} //UbqEmmitedActionsImpl
