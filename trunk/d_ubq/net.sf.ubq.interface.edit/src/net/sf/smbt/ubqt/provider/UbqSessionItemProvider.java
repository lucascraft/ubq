/**
 */
package net.sf.smbt.ubqt.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.smbt.ubqt.UbqtPackage;

import net.sf.xqz.model.engine.EnginePackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ubqt.UbqSession} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqSessionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqSessionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEnginesPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addColorsPropertyDescriptor(object);
			addAddressesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Engines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnginesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_engines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_engines_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__ENGINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_default_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqSession_colors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqSession_colors_feature", "_UI_UbqSession_type"),
				 UbqtPackage.Literals.UBQ_SESSION__COLORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Addresses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqSession_addresses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqSession_addresses_feature", "_UI_UbqSession_type"),
				 UbqtPackage.Literals.UBQ_SESSION__ADDRESSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__DISPLAY_MODE);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__FIDUCIALS);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__ACTIONS);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__REACTIONS);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__EMMITERS);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__HANDLERS);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__SLOTS);
			childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__PROXIMI);
			//childrenFeatures.add(UbqtPackage.Literals.UBQ_SESSION__FINGERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UbqSession.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UbqSession"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UbqSession_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UbqSession.class)) {
			case UbqtPackage.UBQ_SESSION__DISPLAY_MODE:
			case UbqtPackage.UBQ_SESSION__FIDUCIALS:
			case UbqtPackage.UBQ_SESSION__ACTIONS:
			case UbqtPackage.UBQ_SESSION__REACTIONS:
			case UbqtPackage.UBQ_SESSION__EMMITERS:
			case UbqtPackage.UBQ_SESSION__HANDLERS:
			case UbqtPackage.UBQ_SESSION__SLOTS:
			case UbqtPackage.UBQ_SESSION__PROXIMI:
			case UbqtPackage.UBQ_SESSION__FINGERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__DISPLAY_MODE,
				 UbqtFactory.eINSTANCE.createUbqDisplayMode()));
		/*
		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__FIDUCIALS,
				 UbqtFactory.eINSTANCE.createUbqFiducial()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__ACTIONS,
				 UbqtFactory.eINSTANCE.createUbqAction()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__REACTIONS,
				 UbqtFactory.eINSTANCE.createUbqReaction()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__EMMITERS,
				 UbqtFactory.eINSTANCE.createUbqEmmitedActions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__HANDLERS,
				 UbqtFactory.eINSTANCE.createUbqHandledReactions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__SLOTS,
				 UbqtFactory.eINSTANCE.createUbqSlot()));
*/
		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__PROXIMI,
				 UbqtFactory.eINSTANCE.createUbqProxima()));
/*
		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_SESSION__FINGERS,
				 UbqtFactory.eINSTANCE.createUbqCursor()));
				 */
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UbqtEditPlugin.INSTANCE;
	}

}
