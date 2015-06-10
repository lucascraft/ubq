/**
 */
package net.sf.smbt.ubqt.impl;

import java.util.Collection;

import net.sf.smbt.ubqt.UbqHandledReactions;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqReaction;
import net.sf.smbt.ubqt.UbqtPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Handled Reactions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl#getProximiAsRef <em>Proximi As Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqHandledReactionsImpl extends MinimalEObjectImpl.Container implements UbqHandledReactions {
	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<UbqReaction> reactions;

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
	protected UbqHandledReactionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbqtPackage.Literals.UBQ_HANDLED_REACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectResolvingEList<UbqReaction>(UbqReaction.class, this, UbqtPackage.UBQ_HANDLED_REACTIONS__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UbqProxima> getProximiAsRef() {
		if (proximiAsRef == null) {
			proximiAsRef = new EObjectResolvingEList<UbqProxima>(UbqProxima.class, this, UbqtPackage.UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF);
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
			case UbqtPackage.UBQ_HANDLED_REACTIONS__REACTIONS:
				return getReactions();
			case UbqtPackage.UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF:
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
			case UbqtPackage.UBQ_HANDLED_REACTIONS__REACTIONS:
				getReactions().clear();
				getReactions().addAll((Collection<? extends UbqReaction>)newValue);
				return;
			case UbqtPackage.UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF:
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
			case UbqtPackage.UBQ_HANDLED_REACTIONS__REACTIONS:
				getReactions().clear();
				return;
			case UbqtPackage.UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF:
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
			case UbqtPackage.UBQ_HANDLED_REACTIONS__REACTIONS:
				return reactions != null && !reactions.isEmpty();
			case UbqtPackage.UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF:
				return proximiAsRef != null && !proximiAsRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UbqHandledReactionsImpl
