/**
 */
package net.sf.smbt.ubqt.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.smbt.ubqt.UbqtPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ubqt.UbqProxima} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqProximaItemProvider
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
	public UbqProximaItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addFiducialPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addAnglePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addRequiredProximiPropertyDescriptor(object);
			addSlotsPropertyDescriptor(object);
			addLimitPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addRebangPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_name_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fiducial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiducialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_fiducial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_fiducial_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__FIDUCIAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_radius_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_angle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_angle_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_status_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Proximi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredProximiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_requiredProximi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_requiredProximi_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__REQUIRED_PROXIMI,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_slots_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_slots_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__SLOTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_limit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_limit_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_step_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_step_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__STEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_speed_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_style_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rebang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRebangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_rebang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_rebang_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__REBANG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_role_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_function_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UbqProxima_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqProxima_id_feature", "_UI_UbqProxima_type"),
				 UbqtPackage.Literals.UBQ_PROXIMA__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__RANGE);
//			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__BOUNDS);
//			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__EMITTED);
//			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__REACTED);
//			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__BG_COLOR);
//			childrenFeatures.add(UbqtPackage.Literals.UBQ_PROXIMA__FG_COLOR);
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
	 * This returns UbqProxima.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UbqProxima"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = "" +((UbqProxima)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_UbqProxima_type") :
			getString("_UI_UbqProxima_type") + " #" + label;
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

		switch (notification.getFeatureID(UbqProxima.class)) {
			case UbqtPackage.UBQ_PROXIMA__NAME:
			case UbqtPackage.UBQ_PROXIMA__RADIUS:
			case UbqtPackage.UBQ_PROXIMA__ANGLE:
			case UbqtPackage.UBQ_PROXIMA__STATUS:
			case UbqtPackage.UBQ_PROXIMA__LIMIT:
			case UbqtPackage.UBQ_PROXIMA__STEP:
			case UbqtPackage.UBQ_PROXIMA__SPEED:
			case UbqtPackage.UBQ_PROXIMA__STYLE:
			case UbqtPackage.UBQ_PROXIMA__REBANG:
			case UbqtPackage.UBQ_PROXIMA__ROLE:
			case UbqtPackage.UBQ_PROXIMA__FUNCTION:
			case UbqtPackage.UBQ_PROXIMA__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UbqtPackage.UBQ_PROXIMA__RANGE:
			case UbqtPackage.UBQ_PROXIMA__BOUNDS:
			case UbqtPackage.UBQ_PROXIMA__EMITTED:
			case UbqtPackage.UBQ_PROXIMA__REACTED:
			case UbqtPackage.UBQ_PROXIMA__BG_COLOR:
			case UbqtPackage.UBQ_PROXIMA__FG_COLOR:
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
/*
		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__RANGE,
				 UbqtFactory.eINSTANCE.createUbqIncrementableRange()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__BOUNDS,
				 UbqtFactory.eINSTANCE.createUbqBounds()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__EMITTED,
				 UbqtFactory.eINSTANCE.createUbqEmmitedActions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__REACTED,
				 UbqtFactory.eINSTANCE.createUbqHandledReactions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__BG_COLOR,
				 UbqtFactory.eINSTANCE.createUbqColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__BG_COLOR,
				 UbqtFactory.eINSTANCE.createUbqRgbColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__FG_COLOR,
				 UbqtFactory.eINSTANCE.createUbqColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_PROXIMA__FG_COLOR,
				 UbqtFactory.eINSTANCE.createUbqRgbColor()));
				 */
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UbqtPackage.Literals.UBQ_PROXIMA__BG_COLOR ||
			childFeature == UbqtPackage.Literals.UBQ_PROXIMA__FG_COLOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
