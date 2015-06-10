/**
 */
package net.sf.smbt.ubqt.impl;

import net.sf.smbt.ubqt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbqtFactoryImpl extends EFactoryImpl implements UbqtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbqtFactory init() {
		try {
			UbqtFactory theUbqtFactory = (UbqtFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/ubq/script/Ubqt"); 
			if (theUbqtFactory != null) {
				return theUbqtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UbqtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UbqtPackage.UBQ_SESSION: return createUbqSession();
			case UbqtPackage.UBQ_DISPLAY_MODE: return createUbqDisplayMode();
			case UbqtPackage.UBQ_ACTION: return createUbqAction();
			case UbqtPackage.UBQ_REACTION: return createUbqReaction();
			case UbqtPackage.UBQ_FIDUCIAL: return createUbqFiducial();
			case UbqtPackage.UBQ_PROXIMA: return createUbqProxima();
			case UbqtPackage.UBQ_HANDLED_REACTIONS: return createUbqHandledReactions();
			case UbqtPackage.UBQ_EMMITED_ACTIONS: return createUbqEmmitedActions();
			case UbqtPackage.UBQ_SLOT: return createUbqSlot();
			case UbqtPackage.UBQ_LAYOUT: return createUbqLayout();
			case UbqtPackage.UBQ_CURSOR: return createUbqCursor();
			case UbqtPackage.UBQ_COMPOSITE: return createUbqComposite();
			case UbqtPackage.UBQ_POINT: return createUbqPoint();
			case UbqtPackage.UBQ_BOUNDS: return createUbqBounds();
			case UbqtPackage.UBQ_WIDGET: return createUbqWidget();
			case UbqtPackage.UBQ_IMAGE: return createUbqImage();
			case UbqtPackage.UBQ_BUTTON: return createUbqButton();
			case UbqtPackage.UBQ_LABEL: return createUbqLabel();
			case UbqtPackage.UBQ_CHECKBOX: return createUbqCheckbox();
			case UbqtPackage.UBQ_TEXT: return createUbqText();
			case UbqtPackage.UBQ_MENU: return createUbqMenu();
			case UbqtPackage.UBQ_MENU_ITEM: return createUbqMenuItem();
			case UbqtPackage.UBQ_INCREMENTABLE_RANGE: return createUbqIncrementableRange();
			case UbqtPackage.UBQ_VU_METER: return createUbqVuMeter();
			case UbqtPackage.UBQ_SPINNER: return createUbqSpinner();
			case UbqtPackage.UBQ_SLIDER: return createUbqSlider();
			case UbqtPackage.UBQ_KNOB: return createUbqKnob();
			case UbqtPackage.UBQ_WIDGET_STYLE: return createUbqWidgetStyle();
			case UbqtPackage.UBQ_COLOR_STYLE: return createUbqColorStyle();
			case UbqtPackage.UBQ_FONT_STYLE: return createUbqFontStyle();
			case UbqtPackage.UBQ_BORDER_STYLE: return createUbqBorderStyle();
			case UbqtPackage.UBQ_COLOR: return createUbqColor();
			case UbqtPackage.UBQ_HSB_COLOR: return createUbqHsbColor();
			case UbqtPackage.UBQ_RGB_COLOR: return createUbqRgbColor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UbqtPackage.SLOT_STATUS:
				return createSLOT_STATUSFromString(eDataType, initialValue);
			case UbqtPackage.SLOT_KIND:
				return createSLOT_KINDFromString(eDataType, initialValue);
			case UbqtPackage.PROXIMA_STATUS:
				return createPROXIMA_STATUSFromString(eDataType, initialValue);
			case UbqtPackage.SLOTS:
				return createSLOTSFromString(eDataType, initialValue);
			case UbqtPackage.UBQ_LAYOUT_KIND:
				return createUBQ_LAYOUT_KINDFromString(eDataType, initialValue);
			case UbqtPackage.UBQ_EVENTS:
				return createUBQ_EVENTSFromString(eDataType, initialValue);
			case UbqtPackage.UBQ_GESTURES:
				return createUBQ_GESTURESFromString(eDataType, initialValue);
			case UbqtPackage.FONT_STYLE:
				return createFONT_STYLEFromString(eDataType, initialValue);
			case UbqtPackage.BORDER_STYLE:
				return createBORDER_STYLEFromString(eDataType, initialValue);
			case UbqtPackage.PROXIMA_STYLE:
				return createPROXIMA_STYLEFromString(eDataType, initialValue);
			case UbqtPackage.PROXIMA_ROLE:
				return createPROXIMA_ROLEFromString(eDataType, initialValue);
			case UbqtPackage.PROXIMA_FUNCTION:
				return createPROXIMA_FUNCTIONFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UbqtPackage.SLOT_STATUS:
				return convertSLOT_STATUSToString(eDataType, instanceValue);
			case UbqtPackage.SLOT_KIND:
				return convertSLOT_KINDToString(eDataType, instanceValue);
			case UbqtPackage.PROXIMA_STATUS:
				return convertPROXIMA_STATUSToString(eDataType, instanceValue);
			case UbqtPackage.SLOTS:
				return convertSLOTSToString(eDataType, instanceValue);
			case UbqtPackage.UBQ_LAYOUT_KIND:
				return convertUBQ_LAYOUT_KINDToString(eDataType, instanceValue);
			case UbqtPackage.UBQ_EVENTS:
				return convertUBQ_EVENTSToString(eDataType, instanceValue);
			case UbqtPackage.UBQ_GESTURES:
				return convertUBQ_GESTURESToString(eDataType, instanceValue);
			case UbqtPackage.FONT_STYLE:
				return convertFONT_STYLEToString(eDataType, instanceValue);
			case UbqtPackage.BORDER_STYLE:
				return convertBORDER_STYLEToString(eDataType, instanceValue);
			case UbqtPackage.PROXIMA_STYLE:
				return convertPROXIMA_STYLEToString(eDataType, instanceValue);
			case UbqtPackage.PROXIMA_ROLE:
				return convertPROXIMA_ROLEToString(eDataType, instanceValue);
			case UbqtPackage.PROXIMA_FUNCTION:
				return convertPROXIMA_FUNCTIONToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqSession createUbqSession() {
		UbqSessionImpl ubqSession = new UbqSessionImpl();
		return ubqSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqDisplayMode createUbqDisplayMode() {
		UbqDisplayModeImpl ubqDisplayMode = new UbqDisplayModeImpl();
		return ubqDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqAction createUbqAction() {
		UbqActionImpl ubqAction = new UbqActionImpl();
		return ubqAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqReaction createUbqReaction() {
		UbqReactionImpl ubqReaction = new UbqReactionImpl();
		return ubqReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqFiducial createUbqFiducial() {
		UbqFiducialImpl ubqFiducial = new UbqFiducialImpl();
		return ubqFiducial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqProxima createUbqProxima() {
		UbqProximaImpl ubqProxima = new UbqProximaImpl();
		return ubqProxima;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqHandledReactions createUbqHandledReactions() {
		UbqHandledReactionsImpl ubqHandledReactions = new UbqHandledReactionsImpl();
		return ubqHandledReactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqEmmitedActions createUbqEmmitedActions() {
		UbqEmmitedActionsImpl ubqEmmitedActions = new UbqEmmitedActionsImpl();
		return ubqEmmitedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqSlot createUbqSlot() {
		UbqSlotImpl ubqSlot = new UbqSlotImpl();
		return ubqSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqLayout createUbqLayout() {
		UbqLayoutImpl ubqLayout = new UbqLayoutImpl();
		return ubqLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqCursor createUbqCursor() {
		UbqCursorImpl ubqCursor = new UbqCursorImpl();
		return ubqCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqComposite createUbqComposite() {
		UbqCompositeImpl ubqComposite = new UbqCompositeImpl();
		return ubqComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqPoint createUbqPoint() {
		UbqPointImpl ubqPoint = new UbqPointImpl();
		return ubqPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqBounds createUbqBounds() {
		UbqBoundsImpl ubqBounds = new UbqBoundsImpl();
		return ubqBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqWidget createUbqWidget() {
		UbqWidgetImpl ubqWidget = new UbqWidgetImpl();
		return ubqWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqImage createUbqImage() {
		UbqImageImpl ubqImage = new UbqImageImpl();
		return ubqImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqButton createUbqButton() {
		UbqButtonImpl ubqButton = new UbqButtonImpl();
		return ubqButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqLabel createUbqLabel() {
		UbqLabelImpl ubqLabel = new UbqLabelImpl();
		return ubqLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqCheckbox createUbqCheckbox() {
		UbqCheckboxImpl ubqCheckbox = new UbqCheckboxImpl();
		return ubqCheckbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqText createUbqText() {
		UbqTextImpl ubqText = new UbqTextImpl();
		return ubqText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqMenu createUbqMenu() {
		UbqMenuImpl ubqMenu = new UbqMenuImpl();
		return ubqMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqMenuItem createUbqMenuItem() {
		UbqMenuItemImpl ubqMenuItem = new UbqMenuItemImpl();
		return ubqMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqIncrementableRange createUbqIncrementableRange() {
		UbqIncrementableRangeImpl ubqIncrementableRange = new UbqIncrementableRangeImpl();
		return ubqIncrementableRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqVuMeter createUbqVuMeter() {
		UbqVuMeterImpl ubqVuMeter = new UbqVuMeterImpl();
		return ubqVuMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqSpinner createUbqSpinner() {
		UbqSpinnerImpl ubqSpinner = new UbqSpinnerImpl();
		return ubqSpinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqSlider createUbqSlider() {
		UbqSliderImpl ubqSlider = new UbqSliderImpl();
		return ubqSlider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqKnob createUbqKnob() {
		UbqKnobImpl ubqKnob = new UbqKnobImpl();
		return ubqKnob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqWidgetStyle createUbqWidgetStyle() {
		UbqWidgetStyleImpl ubqWidgetStyle = new UbqWidgetStyleImpl();
		return ubqWidgetStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColorStyle createUbqColorStyle() {
		UbqColorStyleImpl ubqColorStyle = new UbqColorStyleImpl();
		return ubqColorStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqFontStyle createUbqFontStyle() {
		UbqFontStyleImpl ubqFontStyle = new UbqFontStyleImpl();
		return ubqFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqBorderStyle createUbqBorderStyle() {
		UbqBorderStyleImpl ubqBorderStyle = new UbqBorderStyleImpl();
		return ubqBorderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqColor createUbqColor() {
		UbqColorImpl ubqColor = new UbqColorImpl();
		return ubqColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqHsbColor createUbqHsbColor() {
		UbqHsbColorImpl ubqHsbColor = new UbqHsbColorImpl();
		return ubqHsbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqRgbColor createUbqRgbColor() {
		UbqRgbColorImpl ubqRgbColor = new UbqRgbColorImpl();
		return ubqRgbColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLOT_STATUS createSLOT_STATUSFromString(EDataType eDataType, String initialValue) {
		SLOT_STATUS result = SLOT_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSLOT_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLOT_KIND createSLOT_KINDFromString(EDataType eDataType, String initialValue) {
		SLOT_KIND result = SLOT_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSLOT_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_STATUS createPROXIMA_STATUSFromString(EDataType eDataType, String initialValue) {
		PROXIMA_STATUS result = PROXIMA_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROXIMA_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLOTS createSLOTSFromString(EDataType eDataType, String initialValue) {
		SLOTS result = SLOTS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSLOTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBQ_LAYOUT_KIND createUBQ_LAYOUT_KINDFromString(EDataType eDataType, String initialValue) {
		UBQ_LAYOUT_KIND result = UBQ_LAYOUT_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUBQ_LAYOUT_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBQ_EVENTS createUBQ_EVENTSFromString(EDataType eDataType, String initialValue) {
		UBQ_EVENTS result = UBQ_EVENTS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUBQ_EVENTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UBQ_GESTURES createUBQ_GESTURESFromString(EDataType eDataType, String initialValue) {
		UBQ_GESTURES result = UBQ_GESTURES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUBQ_GESTURESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FONT_STYLE createFONT_STYLEFromString(EDataType eDataType, String initialValue) {
		FONT_STYLE result = FONT_STYLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFONT_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BORDER_STYLE createBORDER_STYLEFromString(EDataType eDataType, String initialValue) {
		BORDER_STYLE result = BORDER_STYLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBORDER_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_STYLE createPROXIMA_STYLEFromString(EDataType eDataType, String initialValue) {
		PROXIMA_STYLE result = PROXIMA_STYLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROXIMA_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_ROLE createPROXIMA_ROLEFromString(EDataType eDataType, String initialValue) {
		PROXIMA_ROLE result = PROXIMA_ROLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROXIMA_ROLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROXIMA_FUNCTION createPROXIMA_FUNCTIONFromString(EDataType eDataType, String initialValue) {
		PROXIMA_FUNCTION result = PROXIMA_FUNCTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPROXIMA_FUNCTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbqtPackage getUbqtPackage() {
		return (UbqtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UbqtPackage getPackage() {
		return UbqtPackage.eINSTANCE;
	}

} //UbqtFactoryImpl
