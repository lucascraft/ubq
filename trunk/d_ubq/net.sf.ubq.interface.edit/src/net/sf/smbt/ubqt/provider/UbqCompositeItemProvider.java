/**
 */
package net.sf.smbt.ubqt.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ubqt.UbqComposite;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.smbt.ubqt.UbqtPackage;

import net.sf.smbt.xcp.XcpFactory;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.engine.EngineFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
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
 * This is the item provider adapter for a {@link net.sf.smbt.ubqt.UbqComposite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqCompositeItemProvider
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
	public UbqCompositeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_UbqComposite_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UbqComposite_name_feature", "_UI_UbqComposite_type"),
				 UbqtPackage.Literals.UBQ_COMPOSITE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UbqtPackage.Literals.UBQ_COMPOSITE__BOUNDS);
			childrenFeatures.add(UbqtPackage.Literals.UBQ_COMPOSITE__LAYOUT);
			childrenFeatures.add(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN);
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
	 * This returns UbqComposite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UbqComposite"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UbqComposite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UbqComposite_type") :
			getString("_UI_UbqComposite_type") + " " + label;
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

		switch (notification.getFeatureID(UbqComposite.class)) {
			case UbqtPackage.UBQ_COMPOSITE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UbqtPackage.UBQ_COMPOSITE__BOUNDS:
			case UbqtPackage.UBQ_COMPOSITE__LAYOUT:
			case UbqtPackage.UBQ_COMPOSITE__CHILDREN:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__BOUNDS,
				 UbqtFactory.eINSTANCE.createUbqBounds()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__LAYOUT,
				 UbqtFactory.eINSTANCE.createUbqLayout()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqSession()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqDisplayMode()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqAction()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqReaction()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqFiducial()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqProxima()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqHandledReactions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqEmmitedActions()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqSlot()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqLayout()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqCursor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqComposite()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqPoint()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqBounds()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqWidget()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqImage()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqButton()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqText()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqMenu()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqMenuItem()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqIncrementableRange()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqVuMeter()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqSpinner()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqSlider()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqKnob()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqWidgetStyle()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqColorStyle()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqFontStyle()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqBorderStyle()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqHsbColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 UbqtFactory.eINSTANCE.createUbqRgbColor()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 XcpFactory.eINSTANCE.createXCPDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 XcpFactory.eINSTANCE.createXCPAddress()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 XcpFactory.eINSTANCE.createXCPDevicesRegistery()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 XcpFactory.eINSTANCE.createServices()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createTx()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createRx()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createCmdPipe()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createEngineClient()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createEngineApplication()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createIXFrameInterpreter()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createAbstractFrameInterpreter()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createCmdEngineActionArg()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createQxTimeRange()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createIOJob()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createInputJob()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createOutputJob()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createSynchronousQxEventHandler()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 EngineFactory.eINSTANCE.createIChannel()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 CmdFactory.eINSTANCE.createCompoundCmd()));

		newChildDescriptors.add
			(createChildParameter
				(UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN,
				 CmdFactory.eINSTANCE.createXCmd()));
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
			childFeature == UbqtPackage.Literals.UBQ_COMPOSITE__BOUNDS ||
			childFeature == UbqtPackage.Literals.UBQ_COMPOSITE__CHILDREN ||
			childFeature == UbqtPackage.Literals.UBQ_COMPOSITE__LAYOUT;

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
