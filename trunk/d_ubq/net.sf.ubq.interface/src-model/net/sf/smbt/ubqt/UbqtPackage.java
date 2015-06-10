/**
 */
package net.sf.smbt.ubqt;

import net.sf.xqz.model.engine.EnginePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ubqt.UbqtFactory
 * @model kind="package"
 * @generated
 */
public interface UbqtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ubqt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/ubq/script/Ubqt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ubqt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbqtPackage eINSTANCE = net.sf.smbt.ubqt.impl.UbqtPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqSessionImpl <em>Ubq Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqSessionImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSession()
	 * @generated
	 */
	int UBQ_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Display Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__DISPLAY_MODE = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fiducials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__FIDUCIALS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__ACTIONS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__REACTIONS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emmiters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__EMMITERS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__HANDLERS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__SLOTS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Proximi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__PROXIMI = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fingers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__FINGERS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__COLORS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION__ADDRESSES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Ubq Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SESSION_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqDisplayModeImpl <em>Ubq Display Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqDisplayModeImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqDisplayMode()
	 * @generated
	 */
	int UBQ_DISPLAY_MODE = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_DISPLAY_MODE__MODE = 0;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_DISPLAY_MODE__BG_COLOR = 1;

	/**
	 * The number of structural features of the '<em>Ubq Display Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_DISPLAY_MODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqActionImpl <em>Ubq Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqActionImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqAction()
	 * @generated
	 */
	int UBQ_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_ACTION__ACTION_IDS = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_ACTION__ARGS = 2;

	/**
	 * The number of structural features of the '<em>Ubq Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqReactionImpl <em>Ubq Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqReactionImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqReaction()
	 * @generated
	 */
	int UBQ_REACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_REACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmd IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_REACTION__CMD_IDS = 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_REACTION__CLAZZ = 2;

	/**
	 * The number of structural features of the '<em>Ubq Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_REACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqFiducialImpl <em>Ubq Fiducial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqFiducialImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqFiducial()
	 * @generated
	 */
	int UBQ_FIDUCIAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FIDUCIAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fidcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FIDUCIAL__FIDCODE = 1;

	/**
	 * The number of structural features of the '<em>Ubq Fiducial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FIDUCIAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqProximaImpl <em>Ubq Proxima</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqProximaImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqProxima()
	 * @generated
	 */
	int UBQ_PROXIMA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fiducial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__FIDUCIAL = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__RADIUS = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__ANGLE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Required Proximi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__REQUIRED_PROXIMI = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__SLOTS = 8;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__EMITTED = 9;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__REACTED = 10;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__BG_COLOR = 11;

	/**
	 * The feature id for the '<em><b>Fg Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__FG_COLOR = 12;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__LIMIT = 13;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__STEP = 14;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__SPEED = 15;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__STYLE = 16;

	/**
	 * The feature id for the '<em><b>Rebang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__REBANG = 17;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__ROLE = 18;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA__ID = 20;

	/**
	 * The number of structural features of the '<em>Ubq Proxima</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_PROXIMA_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl <em>Ubq Handled Reactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqHandledReactions()
	 * @generated
	 */
	int UBQ_HANDLED_REACTIONS = 6;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HANDLED_REACTIONS__REACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Proximi As Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF = 1;

	/**
	 * The number of structural features of the '<em>Ubq Handled Reactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HANDLED_REACTIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl <em>Ubq Emmited Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqEmmitedActions()
	 * @generated
	 */
	int UBQ_EMMITED_ACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_EMMITED_ACTIONS__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_EMMITED_ACTIONS__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Proximi As Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF = 2;

	/**
	 * The number of structural features of the '<em>Ubq Emmited Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_EMMITED_ACTIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqSlotImpl <em>Ubq Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqSlotImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSlot()
	 * @generated
	 */
	int UBQ_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__KIND = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__EMITTED = 5;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT__REACTED = 6;

	/**
	 * The number of structural features of the '<em>Ubq Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqLayoutImpl <em>Ubq Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqLayoutImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqLayout()
	 * @generated
	 */
	int UBQ_LAYOUT = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LAYOUT__KIND = 0;

	/**
	 * The number of structural features of the '<em>Ubq Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqCursorImpl <em>Ubq Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqCursorImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqCursor()
	 * @generated
	 */
	int UBQ_CURSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CURSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CURSOR__POS = 1;

	/**
	 * The feature id for the '<em><b>Dim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CURSOR__DIM = 2;

	/**
	 * The number of structural features of the '<em>Ubq Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CURSOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqCompositeImpl <em>Ubq Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqCompositeImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqComposite()
	 * @generated
	 */
	int UBQ_COMPOSITE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COMPOSITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COMPOSITE__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COMPOSITE__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COMPOSITE__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Ubq Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COMPOSITE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqPointImpl <em>Ubq Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqPointImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqPoint()
	 * @generated
	 */
	int UBQ_POINT = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Ubq Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqBoundsImpl <em>Ubq Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqBoundsImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqBounds()
	 * @generated
	 */
	int UBQ_BOUNDS = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BOUNDS__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BOUNDS__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BOUNDS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BOUNDS__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Ubq Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqWidgetImpl <em>Ubq Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqWidgetImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqWidget()
	 * @generated
	 */
	int UBQ_WIDGET = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__ANGLE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__STYLE = 3;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__EMITTED = 4;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__REACTED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET__NAME = 6;

	/**
	 * The number of structural features of the '<em>Ubq Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqImageImpl <em>Ubq Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqImageImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqImage()
	 * @generated
	 */
	int UBQ_IMAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_IMAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_IMAGE__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>Ubq Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_IMAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqButtonImpl <em>Ubq Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqButtonImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqButton()
	 * @generated
	 */
	int UBQ_BUTTON = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__PARENT = UBQ_WIDGET__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__BOUNDS = UBQ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__ANGLE = UBQ_WIDGET__ANGLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__STYLE = UBQ_WIDGET__STYLE;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__EMITTED = UBQ_WIDGET__EMITTED;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__REACTED = UBQ_WIDGET__REACTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__NAME = UBQ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__TEXT = UBQ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON__IMAGE = UBQ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ubq Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BUTTON_FEATURE_COUNT = UBQ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqLabelImpl <em>Ubq Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqLabelImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqLabel()
	 * @generated
	 */
	int UBQ_LABEL = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__PARENT = UBQ_WIDGET__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__BOUNDS = UBQ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__ANGLE = UBQ_WIDGET__ANGLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__STYLE = UBQ_WIDGET__STYLE;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__EMITTED = UBQ_WIDGET__EMITTED;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__REACTED = UBQ_WIDGET__REACTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__NAME = UBQ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL__TEXT = UBQ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ubq Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_LABEL_FEATURE_COUNT = UBQ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqCheckboxImpl <em>Ubq Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqCheckboxImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqCheckbox()
	 * @generated
	 */
	int UBQ_CHECKBOX = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__PARENT = UBQ_WIDGET__PARENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__BOUNDS = UBQ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__ANGLE = UBQ_WIDGET__ANGLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__STYLE = UBQ_WIDGET__STYLE;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__EMITTED = UBQ_WIDGET__EMITTED;

	/**
	 * The feature id for the '<em><b>Reacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__REACTED = UBQ_WIDGET__REACTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__NAME = UBQ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX__CHECKED = UBQ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ubq Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_CHECKBOX_FEATURE_COUNT = UBQ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqTextImpl <em>Ubq Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqTextImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqText()
	 * @generated
	 */
	int UBQ_TEXT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_TEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_TEXT__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Ubq Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_TEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqMenuImpl <em>Ubq Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqMenuImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqMenu()
	 * @generated
	 */
	int UBQ_MENU = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU__CHILDREN = 1;

	/**
	 * The number of structural features of the '<em>Ubq Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqMenuItemImpl <em>Ubq Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqMenuItemImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqMenuItem()
	 * @generated
	 */
	int UBQ_MENU_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU_ITEM__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Emitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU_ITEM__EMITTED = 2;

	/**
	 * The number of structural features of the '<em>Ubq Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_MENU_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqIncrementableRangeImpl <em>Ubq Incrementable Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqIncrementableRangeImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqIncrementableRange()
	 * @generated
	 */
	int UBQ_INCREMENTABLE_RANGE = 22;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_INCREMENTABLE_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_INCREMENTABLE_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_INCREMENTABLE_RANGE__VAL = 2;

	/**
	 * The number of structural features of the '<em>Ubq Incrementable Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_INCREMENTABLE_RANGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqVuMeterImpl <em>Ubq Vu Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqVuMeterImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqVuMeter()
	 * @generated
	 */
	int UBQ_VU_METER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_VU_METER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Range Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_VU_METER__RANGE_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Ubq Vu Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_VU_METER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqSpinnerImpl <em>Ubq Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqSpinnerImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSpinner()
	 * @generated
	 */
	int UBQ_SPINNER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SPINNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Range Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SPINNER__RANGE_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Ubq Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SPINNER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqSliderImpl <em>Ubq Slider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqSliderImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSlider()
	 * @generated
	 */
	int UBQ_SLIDER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Range Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLIDER__RANGE_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Ubq Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_SLIDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqKnobImpl <em>Ubq Knob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqKnobImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqKnob()
	 * @generated
	 */
	int UBQ_KNOB = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_KNOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Range Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_KNOB__RANGE_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Ubq Knob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_KNOB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqWidgetStyleImpl <em>Ubq Widget Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqWidgetStyleImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqWidgetStyle()
	 * @generated
	 */
	int UBQ_WIDGET_STYLE = 27;

	/**
	 * The feature id for the '<em><b>Color Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET_STYLE__COLOR_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Font Style Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET_STYLE__FONT_STYLE_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET_STYLE__BORDER_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Ubq Widget Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_WIDGET_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqColorStyleImpl <em>Ubq Color Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqColorStyleImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqColorStyle()
	 * @generated
	 */
	int UBQ_COLOR_STYLE = 28;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR_STYLE__FOREGROUND = 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR_STYLE__BACKGROUND = 1;

	/**
	 * The number of structural features of the '<em>Ubq Color Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqFontStyleImpl <em>Ubq Font Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqFontStyleImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqFontStyle()
	 * @generated
	 */
	int UBQ_FONT_STYLE = 29;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FONT_STYLE__FONT = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FONT_STYLE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FONT_STYLE__STYLES = 2;

	/**
	 * The number of structural features of the '<em>Ubq Font Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_FONT_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqBorderStyleImpl <em>Ubq Border Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqBorderStyleImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqBorderStyle()
	 * @generated
	 */
	int UBQ_BORDER_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Tickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BORDER_STYLE__TICKNESS = 0;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BORDER_STYLE__STYLES = 1;

	/**
	 * The number of structural features of the '<em>Ubq Border Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_BORDER_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqColorImpl <em>Ubq Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqColorImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqColor()
	 * @generated
	 */
	int UBQ_COLOR = 31;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR__B = 2;

	/**
	 * The number of structural features of the '<em>Ubq Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_COLOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqHsbColorImpl <em>Ubq Hsb Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqHsbColorImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqHsbColor()
	 * @generated
	 */
	int UBQ_HSB_COLOR = 32;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HSB_COLOR__HUE = 0;

	/**
	 * The feature id for the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HSB_COLOR__SATURATION = 1;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HSB_COLOR__BRIGHTNESS = 2;

	/**
	 * The number of structural features of the '<em>Ubq Hsb Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_HSB_COLOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.impl.UbqRgbColorImpl <em>Ubq Rgb Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.impl.UbqRgbColorImpl
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqRgbColor()
	 * @generated
	 */
	int UBQ_RGB_COLOR = 33;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__R = UBQ_COLOR__R;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__G = UBQ_COLOR__G;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__B = UBQ_COLOR__B;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__RED = UBQ_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__GREEN = UBQ_COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR__BLUE = UBQ_COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ubq Rgb Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBQ_RGB_COLOR_FEATURE_COUNT = UBQ_COLOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.SLOT_STATUS <em>SLOT STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.SLOT_STATUS
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOT_STATUS()
	 * @generated
	 */
	int SLOT_STATUS = 34;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.SLOT_KIND <em>SLOT KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.SLOT_KIND
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOT_KIND()
	 * @generated
	 */
	int SLOT_KIND = 35;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.PROXIMA_STATUS <em>PROXIMA STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.PROXIMA_STATUS
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_STATUS()
	 * @generated
	 */
	int PROXIMA_STATUS = 36;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.SLOTS <em>SLOTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.SLOTS
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOTS()
	 * @generated
	 */
	int SLOTS = 37;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.UBQ_LAYOUT_KIND <em>UBQ LAYOUT KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.UBQ_LAYOUT_KIND
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_LAYOUT_KIND()
	 * @generated
	 */
	int UBQ_LAYOUT_KIND = 38;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.UBQ_EVENTS <em>UBQ EVENTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.UBQ_EVENTS
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_EVENTS()
	 * @generated
	 */
	int UBQ_EVENTS = 39;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.UBQ_GESTURES <em>UBQ GESTURES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.UBQ_GESTURES
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_GESTURES()
	 * @generated
	 */
	int UBQ_GESTURES = 40;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.FONT_STYLE <em>FONT STYLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.FONT_STYLE
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getFONT_STYLE()
	 * @generated
	 */
	int FONT_STYLE = 41;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.BORDER_STYLE <em>BORDER STYLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.BORDER_STYLE
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getBORDER_STYLE()
	 * @generated
	 */
	int BORDER_STYLE = 42;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.PROXIMA_STYLE <em>PROXIMA STYLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.PROXIMA_STYLE
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_STYLE()
	 * @generated
	 */
	int PROXIMA_STYLE = 43;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.PROXIMA_ROLE <em>PROXIMA ROLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.PROXIMA_ROLE
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_ROLE()
	 * @generated
	 */
	int PROXIMA_ROLE = 44;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ubqt.PROXIMA_FUNCTION <em>PROXIMA FUNCTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ubqt.PROXIMA_FUNCTION
	 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_FUNCTION()
	 * @generated
	 */
	int PROXIMA_FUNCTION = 45;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqSession <em>Ubq Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Session</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession
	 * @generated
	 */
	EClass getUbqSession();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqSession#getDisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Mode</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getDisplayMode()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_DisplayMode();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getFiducials <em>Fiducials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fiducials</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getFiducials()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Fiducials();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getActions()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getReactions()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Reactions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getEmmiters <em>Emmiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emmiters</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getEmmiters()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Emmiters();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getHandlers()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getSlots()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Slots();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getProximi <em>Proximi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proximi</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getProximi()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Proximi();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSession#getFingers <em>Fingers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fingers</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getFingers()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Fingers();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqSession#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colors</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getColors()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Colors();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ubqt.UbqSession#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Addresses</em>'.
	 * @see net.sf.smbt.ubqt.UbqSession#getAddresses()
	 * @see #getUbqSession()
	 * @generated
	 */
	EReference getUbqSession_Addresses();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqDisplayMode <em>Ubq Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Display Mode</em>'.
	 * @see net.sf.smbt.ubqt.UbqDisplayMode
	 * @generated
	 */
	EClass getUbqDisplayMode();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqDisplayMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mode</em>'.
	 * @see net.sf.smbt.ubqt.UbqDisplayMode#getMode()
	 * @see #getUbqDisplayMode()
	 * @generated
	 */
	EReference getUbqDisplayMode_Mode();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ubqt.UbqDisplayMode#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bg Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqDisplayMode#getBgColor()
	 * @see #getUbqDisplayMode()
	 * @generated
	 */
	EReference getUbqDisplayMode_BgColor();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqAction <em>Ubq Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Action</em>'.
	 * @see net.sf.smbt.ubqt.UbqAction
	 * @generated
	 */
	EClass getUbqAction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqAction#getName()
	 * @see #getUbqAction()
	 * @generated
	 */
	EAttribute getUbqAction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqAction#getActionIDs <em>Action IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action IDs</em>'.
	 * @see net.sf.smbt.ubqt.UbqAction#getActionIDs()
	 * @see #getUbqAction()
	 * @generated
	 */
	EAttribute getUbqAction_ActionIDs();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqAction#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see net.sf.smbt.ubqt.UbqAction#getArgs()
	 * @see #getUbqAction()
	 * @generated
	 */
	EAttribute getUbqAction_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqReaction <em>Ubq Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Reaction</em>'.
	 * @see net.sf.smbt.ubqt.UbqReaction
	 * @generated
	 */
	EClass getUbqReaction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqReaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqReaction#getName()
	 * @see #getUbqReaction()
	 * @generated
	 */
	EAttribute getUbqReaction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqReaction#getCmdIDs <em>Cmd IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cmd IDs</em>'.
	 * @see net.sf.smbt.ubqt.UbqReaction#getCmdIDs()
	 * @see #getUbqReaction()
	 * @generated
	 */
	EAttribute getUbqReaction_CmdIDs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqReaction#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see net.sf.smbt.ubqt.UbqReaction#getClazz()
	 * @see #getUbqReaction()
	 * @generated
	 */
	EAttribute getUbqReaction_Clazz();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqFiducial <em>Ubq Fiducial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Fiducial</em>'.
	 * @see net.sf.smbt.ubqt.UbqFiducial
	 * @generated
	 */
	EClass getUbqFiducial();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqFiducial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqFiducial#getName()
	 * @see #getUbqFiducial()
	 * @generated
	 */
	EAttribute getUbqFiducial_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqFiducial#getFidcode <em>Fidcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fidcode</em>'.
	 * @see net.sf.smbt.ubqt.UbqFiducial#getFidcode()
	 * @see #getUbqFiducial()
	 * @generated
	 */
	EAttribute getUbqFiducial_Fidcode();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqProxima <em>Ubq Proxima</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Proxima</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima
	 * @generated
	 */
	EClass getUbqProxima();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getName()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ubqt.UbqProxima#getFiducial <em>Fiducial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fiducial</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getFiducial()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Fiducial();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqProxima#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getRange()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Range();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqProxima#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getBounds()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getRadius()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Radius();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getAngle()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getStatus()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Status();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqProxima#getRequiredProximi <em>Required Proximi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Proximi</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getRequiredProximi()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_RequiredProximi();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqProxima#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slots</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getSlots()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Slots();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqProxima#getEmitted <em>Emitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emitted</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getEmitted()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Emitted();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqProxima#getReacted <em>Reacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reacted</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getReacted()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_Reacted();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqProxima#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bg Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getBgColor()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_BgColor();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqProxima#getFgColor <em>Fg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fg Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getFgColor()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EReference getUbqProxima_FgColor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getLimit()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Limit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getStep()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Step();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getSpeed()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getStyle()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Style();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getRebang <em>Rebang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rebang</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getRebang()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Rebang();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getRole()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getFunction()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Function();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqProxima#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ubqt.UbqProxima#getId()
	 * @see #getUbqProxima()
	 * @generated
	 */
	EAttribute getUbqProxima_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqHandledReactions <em>Ubq Handled Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Handled Reactions</em>'.
	 * @see net.sf.smbt.ubqt.UbqHandledReactions
	 * @generated
	 */
	EClass getUbqHandledReactions();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqHandledReactions#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reactions</em>'.
	 * @see net.sf.smbt.ubqt.UbqHandledReactions#getReactions()
	 * @see #getUbqHandledReactions()
	 * @generated
	 */
	EReference getUbqHandledReactions_Reactions();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqHandledReactions#getProximiAsRef <em>Proximi As Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proximi As Ref</em>'.
	 * @see net.sf.smbt.ubqt.UbqHandledReactions#getProximiAsRef()
	 * @see #getUbqHandledReactions()
	 * @generated
	 */
	EReference getUbqHandledReactions_ProximiAsRef();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqEmmitedActions <em>Ubq Emmited Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Emmited Actions</em>'.
	 * @see net.sf.smbt.ubqt.UbqEmmitedActions
	 * @generated
	 */
	EClass getUbqEmmitedActions();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqEmmitedActions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see net.sf.smbt.ubqt.UbqEmmitedActions#getActions()
	 * @see #getUbqEmmitedActions()
	 * @generated
	 */
	EReference getUbqEmmitedActions_Actions();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqEmmitedActions#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Events</em>'.
	 * @see net.sf.smbt.ubqt.UbqEmmitedActions#getEvents()
	 * @see #getUbqEmmitedActions()
	 * @generated
	 */
	EAttribute getUbqEmmitedActions_Events();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ubqt.UbqEmmitedActions#getProximiAsRef <em>Proximi As Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proximi As Ref</em>'.
	 * @see net.sf.smbt.ubqt.UbqEmmitedActions#getProximiAsRef()
	 * @see #getUbqEmmitedActions()
	 * @generated
	 */
	EReference getUbqEmmitedActions_ProximiAsRef();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqSlot <em>Ubq Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Slot</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot
	 * @generated
	 */
	EClass getUbqSlot();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getName()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EAttribute getUbqSlot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqSlot#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getBounds()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EReference getUbqSlot_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSlot#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getPosition()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EAttribute getUbqSlot_Position();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSlot#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getKind()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EAttribute getUbqSlot_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSlot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getStatus()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EAttribute getUbqSlot_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSlot#getEmitted <em>Emitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emitted</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getEmitted()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EReference getUbqSlot_Emitted();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqSlot#getReacted <em>Reacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reacted</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlot#getReacted()
	 * @see #getUbqSlot()
	 * @generated
	 */
	EReference getUbqSlot_Reacted();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqLayout <em>Ubq Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Layout</em>'.
	 * @see net.sf.smbt.ubqt.UbqLayout
	 * @generated
	 */
	EClass getUbqLayout();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqLayout#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ubqt.UbqLayout#getKind()
	 * @see #getUbqLayout()
	 * @generated
	 */
	EAttribute getUbqLayout_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqCursor <em>Ubq Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Cursor</em>'.
	 * @see net.sf.smbt.ubqt.UbqCursor
	 * @generated
	 */
	EClass getUbqCursor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqCursor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqCursor#getName()
	 * @see #getUbqCursor()
	 * @generated
	 */
	EAttribute getUbqCursor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqCursor#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see net.sf.smbt.ubqt.UbqCursor#getPos()
	 * @see #getUbqCursor()
	 * @generated
	 */
	EReference getUbqCursor_Pos();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqCursor#getDim <em>Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dim</em>'.
	 * @see net.sf.smbt.ubqt.UbqCursor#getDim()
	 * @see #getUbqCursor()
	 * @generated
	 */
	EReference getUbqCursor_Dim();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqComposite <em>Ubq Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Composite</em>'.
	 * @see net.sf.smbt.ubqt.UbqComposite
	 * @generated
	 */
	EClass getUbqComposite();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqComposite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqComposite#getName()
	 * @see #getUbqComposite()
	 * @generated
	 */
	EAttribute getUbqComposite_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqComposite#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see net.sf.smbt.ubqt.UbqComposite#getBounds()
	 * @see #getUbqComposite()
	 * @generated
	 */
	EReference getUbqComposite_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqComposite#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see net.sf.smbt.ubqt.UbqComposite#getLayout()
	 * @see #getUbqComposite()
	 * @generated
	 */
	EReference getUbqComposite_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqComposite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.ubqt.UbqComposite#getChildren()
	 * @see #getUbqComposite()
	 * @generated
	 */
	EReference getUbqComposite_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqPoint <em>Ubq Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Point</em>'.
	 * @see net.sf.smbt.ubqt.UbqPoint
	 * @generated
	 */
	EClass getUbqPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.ubqt.UbqPoint#getX()
	 * @see #getUbqPoint()
	 * @generated
	 */
	EAttribute getUbqPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.ubqt.UbqPoint#getY()
	 * @see #getUbqPoint()
	 * @generated
	 */
	EAttribute getUbqPoint_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqBounds <em>Ubq Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Bounds</em>'.
	 * @see net.sf.smbt.ubqt.UbqBounds
	 * @generated
	 */
	EClass getUbqBounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqBounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.ubqt.UbqBounds#getX()
	 * @see #getUbqBounds()
	 * @generated
	 */
	EAttribute getUbqBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqBounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.ubqt.UbqBounds#getY()
	 * @see #getUbqBounds()
	 * @generated
	 */
	EAttribute getUbqBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqBounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.ubqt.UbqBounds#getWidth()
	 * @see #getUbqBounds()
	 * @generated
	 */
	EAttribute getUbqBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqBounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.ubqt.UbqBounds#getHeight()
	 * @see #getUbqBounds()
	 * @generated
	 */
	EAttribute getUbqBounds_Height();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqWidget <em>Ubq Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Widget</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget
	 * @generated
	 */
	EClass getUbqWidget();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ubqt.UbqWidget#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getParent()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EReference getUbqWidget_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidget#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getBounds()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EReference getUbqWidget_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqWidget#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getAngle()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EAttribute getUbqWidget_Angle();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidget#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getStyle()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EReference getUbqWidget_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqWidget#getEmitted <em>Emitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emitted</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getEmitted()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EReference getUbqWidget_Emitted();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidget#getReacted <em>Reacted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reacted</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getReacted()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EReference getUbqWidget_Reacted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidget#getName()
	 * @see #getUbqWidget()
	 * @generated
	 */
	EAttribute getUbqWidget_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqImage <em>Ubq Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Image</em>'.
	 * @see net.sf.smbt.ubqt.UbqImage
	 * @generated
	 */
	EClass getUbqImage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqImage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqImage#getName()
	 * @see #getUbqImage()
	 * @generated
	 */
	EAttribute getUbqImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see net.sf.smbt.ubqt.UbqImage#getImage()
	 * @see #getUbqImage()
	 * @generated
	 */
	EAttribute getUbqImage_Image();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqButton <em>Ubq Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Button</em>'.
	 * @see net.sf.smbt.ubqt.UbqButton
	 * @generated
	 */
	EClass getUbqButton();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.ubqt.UbqButton#getText()
	 * @see #getUbqButton()
	 * @generated
	 */
	EAttribute getUbqButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqButton#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see net.sf.smbt.ubqt.UbqButton#getImage()
	 * @see #getUbqButton()
	 * @generated
	 */
	EAttribute getUbqButton_Image();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqLabel <em>Ubq Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Label</em>'.
	 * @see net.sf.smbt.ubqt.UbqLabel
	 * @generated
	 */
	EClass getUbqLabel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.ubqt.UbqLabel#getText()
	 * @see #getUbqLabel()
	 * @generated
	 */
	EAttribute getUbqLabel_Text();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqCheckbox <em>Ubq Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Checkbox</em>'.
	 * @see net.sf.smbt.ubqt.UbqCheckbox
	 * @generated
	 */
	EClass getUbqCheckbox();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqCheckbox#isChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see net.sf.smbt.ubqt.UbqCheckbox#isChecked()
	 * @see #getUbqCheckbox()
	 * @generated
	 */
	EAttribute getUbqCheckbox_Checked();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqText <em>Ubq Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Text</em>'.
	 * @see net.sf.smbt.ubqt.UbqText
	 * @generated
	 */
	EClass getUbqText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqText#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqText#getName()
	 * @see #getUbqText()
	 * @generated
	 */
	EAttribute getUbqText_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.ubqt.UbqText#getText()
	 * @see #getUbqText()
	 * @generated
	 */
	EAttribute getUbqText_Text();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqMenu <em>Ubq Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Menu</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenu
	 * @generated
	 */
	EClass getUbqMenu();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqMenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenu#getName()
	 * @see #getUbqMenu()
	 * @generated
	 */
	EAttribute getUbqMenu_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqMenu#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenu#getChildren()
	 * @see #getUbqMenu()
	 * @generated
	 */
	EReference getUbqMenu_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqMenuItem <em>Ubq Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Menu Item</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenuItem
	 * @generated
	 */
	EClass getUbqMenuItem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqMenuItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenuItem#getName()
	 * @see #getUbqMenuItem()
	 * @generated
	 */
	EAttribute getUbqMenuItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqMenuItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenuItem#getTitle()
	 * @see #getUbqMenuItem()
	 * @generated
	 */
	EAttribute getUbqMenuItem_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ubqt.UbqMenuItem#getEmitted <em>Emitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emitted</em>'.
	 * @see net.sf.smbt.ubqt.UbqMenuItem#getEmitted()
	 * @see #getUbqMenuItem()
	 * @generated
	 */
	EReference getUbqMenuItem_Emitted();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqIncrementableRange <em>Ubq Incrementable Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Incrementable Range</em>'.
	 * @see net.sf.smbt.ubqt.UbqIncrementableRange
	 * @generated
	 */
	EClass getUbqIncrementableRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqIncrementableRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see net.sf.smbt.ubqt.UbqIncrementableRange#getMin()
	 * @see #getUbqIncrementableRange()
	 * @generated
	 */
	EAttribute getUbqIncrementableRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqIncrementableRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.sf.smbt.ubqt.UbqIncrementableRange#getMax()
	 * @see #getUbqIncrementableRange()
	 * @generated
	 */
	EAttribute getUbqIncrementableRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqIncrementableRange#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see net.sf.smbt.ubqt.UbqIncrementableRange#getVal()
	 * @see #getUbqIncrementableRange()
	 * @generated
	 */
	EAttribute getUbqIncrementableRange_Val();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqVuMeter <em>Ubq Vu Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Vu Meter</em>'.
	 * @see net.sf.smbt.ubqt.UbqVuMeter
	 * @generated
	 */
	EClass getUbqVuMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqVuMeter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqVuMeter#getName()
	 * @see #getUbqVuMeter()
	 * @generated
	 */
	EAttribute getUbqVuMeter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqVuMeter#getRangeDefinition <em>Range Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Definition</em>'.
	 * @see net.sf.smbt.ubqt.UbqVuMeter#getRangeDefinition()
	 * @see #getUbqVuMeter()
	 * @generated
	 */
	EReference getUbqVuMeter_RangeDefinition();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqSpinner <em>Ubq Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Spinner</em>'.
	 * @see net.sf.smbt.ubqt.UbqSpinner
	 * @generated
	 */
	EClass getUbqSpinner();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSpinner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqSpinner#getName()
	 * @see #getUbqSpinner()
	 * @generated
	 */
	EAttribute getUbqSpinner_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqSpinner#getRangeDefinition <em>Range Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Definition</em>'.
	 * @see net.sf.smbt.ubqt.UbqSpinner#getRangeDefinition()
	 * @see #getUbqSpinner()
	 * @generated
	 */
	EReference getUbqSpinner_RangeDefinition();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqSlider <em>Ubq Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Slider</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlider
	 * @generated
	 */
	EClass getUbqSlider();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqSlider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlider#getName()
	 * @see #getUbqSlider()
	 * @generated
	 */
	EAttribute getUbqSlider_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqSlider#getRangeDefinition <em>Range Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Definition</em>'.
	 * @see net.sf.smbt.ubqt.UbqSlider#getRangeDefinition()
	 * @see #getUbqSlider()
	 * @generated
	 */
	EReference getUbqSlider_RangeDefinition();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqKnob <em>Ubq Knob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Knob</em>'.
	 * @see net.sf.smbt.ubqt.UbqKnob
	 * @generated
	 */
	EClass getUbqKnob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqKnob#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ubqt.UbqKnob#getName()
	 * @see #getUbqKnob()
	 * @generated
	 */
	EAttribute getUbqKnob_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqKnob#getRangeDefinition <em>Range Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Definition</em>'.
	 * @see net.sf.smbt.ubqt.UbqKnob#getRangeDefinition()
	 * @see #getUbqKnob()
	 * @generated
	 */
	EReference getUbqKnob_RangeDefinition();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqWidgetStyle <em>Ubq Widget Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Widget Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidgetStyle
	 * @generated
	 */
	EClass getUbqWidgetStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidgetStyle#getColorStyle <em>Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidgetStyle#getColorStyle()
	 * @see #getUbqWidgetStyle()
	 * @generated
	 */
	EReference getUbqWidgetStyle_ColorStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidgetStyle#getFontStyleStyle <em>Font Style Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font Style Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidgetStyle#getFontStyleStyle()
	 * @see #getUbqWidgetStyle()
	 * @generated
	 */
	EReference getUbqWidgetStyle_FontStyleStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqWidgetStyle#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqWidgetStyle#getBorderStyle()
	 * @see #getUbqWidgetStyle()
	 * @generated
	 */
	EReference getUbqWidgetStyle_BorderStyle();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqColorStyle <em>Ubq Color Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Color Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqColorStyle
	 * @generated
	 */
	EClass getUbqColorStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqColorStyle#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground</em>'.
	 * @see net.sf.smbt.ubqt.UbqColorStyle#getForeground()
	 * @see #getUbqColorStyle()
	 * @generated
	 */
	EReference getUbqColorStyle_Foreground();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ubqt.UbqColorStyle#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see net.sf.smbt.ubqt.UbqColorStyle#getBackground()
	 * @see #getUbqColorStyle()
	 * @generated
	 */
	EReference getUbqColorStyle_Background();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqFontStyle <em>Ubq Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Font Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqFontStyle
	 * @generated
	 */
	EClass getUbqFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqFontStyle#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.ubqt.UbqFontStyle#getFont()
	 * @see #getUbqFontStyle()
	 * @generated
	 */
	EAttribute getUbqFontStyle_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqFontStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.ubqt.UbqFontStyle#getHeight()
	 * @see #getUbqFontStyle()
	 * @generated
	 */
	EAttribute getUbqFontStyle_Height();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqFontStyle#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Styles</em>'.
	 * @see net.sf.smbt.ubqt.UbqFontStyle#getStyles()
	 * @see #getUbqFontStyle()
	 * @generated
	 */
	EAttribute getUbqFontStyle_Styles();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqBorderStyle <em>Ubq Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Border Style</em>'.
	 * @see net.sf.smbt.ubqt.UbqBorderStyle
	 * @generated
	 */
	EClass getUbqBorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqBorderStyle#getTickness <em>Tickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tickness</em>'.
	 * @see net.sf.smbt.ubqt.UbqBorderStyle#getTickness()
	 * @see #getUbqBorderStyle()
	 * @generated
	 */
	EAttribute getUbqBorderStyle_Tickness();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ubqt.UbqBorderStyle#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Styles</em>'.
	 * @see net.sf.smbt.ubqt.UbqBorderStyle#getStyles()
	 * @see #getUbqBorderStyle()
	 * @generated
	 */
	EAttribute getUbqBorderStyle_Styles();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqColor <em>Ubq Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqColor
	 * @generated
	 */
	EClass getUbqColor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqColor#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.ubqt.UbqColor#getR()
	 * @see #getUbqColor()
	 * @generated
	 */
	EAttribute getUbqColor_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqColor#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.ubqt.UbqColor#getG()
	 * @see #getUbqColor()
	 * @generated
	 */
	EAttribute getUbqColor_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqColor#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.ubqt.UbqColor#getB()
	 * @see #getUbqColor()
	 * @generated
	 */
	EAttribute getUbqColor_B();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqHsbColor <em>Ubq Hsb Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Hsb Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqHsbColor
	 * @generated
	 */
	EClass getUbqHsbColor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqHsbColor#getHue <em>Hue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hue</em>'.
	 * @see net.sf.smbt.ubqt.UbqHsbColor#getHue()
	 * @see #getUbqHsbColor()
	 * @generated
	 */
	EAttribute getUbqHsbColor_Hue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqHsbColor#getSaturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturation</em>'.
	 * @see net.sf.smbt.ubqt.UbqHsbColor#getSaturation()
	 * @see #getUbqHsbColor()
	 * @generated
	 */
	EAttribute getUbqHsbColor_Saturation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqHsbColor#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see net.sf.smbt.ubqt.UbqHsbColor#getBrightness()
	 * @see #getUbqHsbColor()
	 * @generated
	 */
	EAttribute getUbqHsbColor_Brightness();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ubqt.UbqRgbColor <em>Ubq Rgb Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubq Rgb Color</em>'.
	 * @see net.sf.smbt.ubqt.UbqRgbColor
	 * @generated
	 */
	EClass getUbqRgbColor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqRgbColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see net.sf.smbt.ubqt.UbqRgbColor#getRed()
	 * @see #getUbqRgbColor()
	 * @generated
	 */
	EAttribute getUbqRgbColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqRgbColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see net.sf.smbt.ubqt.UbqRgbColor#getGreen()
	 * @see #getUbqRgbColor()
	 * @generated
	 */
	EAttribute getUbqRgbColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ubqt.UbqRgbColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see net.sf.smbt.ubqt.UbqRgbColor#getBlue()
	 * @see #getUbqRgbColor()
	 * @generated
	 */
	EAttribute getUbqRgbColor_Blue();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.SLOT_STATUS <em>SLOT STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SLOT STATUS</em>'.
	 * @see net.sf.smbt.ubqt.SLOT_STATUS
	 * @generated
	 */
	EEnum getSLOT_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.SLOT_KIND <em>SLOT KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SLOT KIND</em>'.
	 * @see net.sf.smbt.ubqt.SLOT_KIND
	 * @generated
	 */
	EEnum getSLOT_KIND();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.PROXIMA_STATUS <em>PROXIMA STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROXIMA STATUS</em>'.
	 * @see net.sf.smbt.ubqt.PROXIMA_STATUS
	 * @generated
	 */
	EEnum getPROXIMA_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.SLOTS <em>SLOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SLOTS</em>'.
	 * @see net.sf.smbt.ubqt.SLOTS
	 * @generated
	 */
	EEnum getSLOTS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.UBQ_LAYOUT_KIND <em>UBQ LAYOUT KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UBQ LAYOUT KIND</em>'.
	 * @see net.sf.smbt.ubqt.UBQ_LAYOUT_KIND
	 * @generated
	 */
	EEnum getUBQ_LAYOUT_KIND();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.UBQ_EVENTS <em>UBQ EVENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UBQ EVENTS</em>'.
	 * @see net.sf.smbt.ubqt.UBQ_EVENTS
	 * @generated
	 */
	EEnum getUBQ_EVENTS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.UBQ_GESTURES <em>UBQ GESTURES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UBQ GESTURES</em>'.
	 * @see net.sf.smbt.ubqt.UBQ_GESTURES
	 * @generated
	 */
	EEnum getUBQ_GESTURES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.FONT_STYLE <em>FONT STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FONT STYLE</em>'.
	 * @see net.sf.smbt.ubqt.FONT_STYLE
	 * @generated
	 */
	EEnum getFONT_STYLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.BORDER_STYLE <em>BORDER STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BORDER STYLE</em>'.
	 * @see net.sf.smbt.ubqt.BORDER_STYLE
	 * @generated
	 */
	EEnum getBORDER_STYLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.PROXIMA_STYLE <em>PROXIMA STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROXIMA STYLE</em>'.
	 * @see net.sf.smbt.ubqt.PROXIMA_STYLE
	 * @generated
	 */
	EEnum getPROXIMA_STYLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.PROXIMA_ROLE <em>PROXIMA ROLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROXIMA ROLE</em>'.
	 * @see net.sf.smbt.ubqt.PROXIMA_ROLE
	 * @generated
	 */
	EEnum getPROXIMA_ROLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ubqt.PROXIMA_FUNCTION <em>PROXIMA FUNCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PROXIMA FUNCTION</em>'.
	 * @see net.sf.smbt.ubqt.PROXIMA_FUNCTION
	 * @generated
	 */
	EEnum getPROXIMA_FUNCTION();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UbqtFactory getUbqtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqSessionImpl <em>Ubq Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqSessionImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSession()
		 * @generated
		 */
		EClass UBQ_SESSION = eINSTANCE.getUbqSession();

		/**
		 * The meta object literal for the '<em><b>Display Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__DISPLAY_MODE = eINSTANCE.getUbqSession_DisplayMode();

		/**
		 * The meta object literal for the '<em><b>Fiducials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__FIDUCIALS = eINSTANCE.getUbqSession_Fiducials();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__ACTIONS = eINSTANCE.getUbqSession_Actions();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__REACTIONS = eINSTANCE.getUbqSession_Reactions();

		/**
		 * The meta object literal for the '<em><b>Emmiters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__EMMITERS = eINSTANCE.getUbqSession_Emmiters();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__HANDLERS = eINSTANCE.getUbqSession_Handlers();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__SLOTS = eINSTANCE.getUbqSession_Slots();

		/**
		 * The meta object literal for the '<em><b>Proximi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__PROXIMI = eINSTANCE.getUbqSession_Proximi();

		/**
		 * The meta object literal for the '<em><b>Fingers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__FINGERS = eINSTANCE.getUbqSession_Fingers();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__COLORS = eINSTANCE.getUbqSession_Colors();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SESSION__ADDRESSES = eINSTANCE.getUbqSession_Addresses();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqDisplayModeImpl <em>Ubq Display Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqDisplayModeImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqDisplayMode()
		 * @generated
		 */
		EClass UBQ_DISPLAY_MODE = eINSTANCE.getUbqDisplayMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_DISPLAY_MODE__MODE = eINSTANCE.getUbqDisplayMode_Mode();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_DISPLAY_MODE__BG_COLOR = eINSTANCE.getUbqDisplayMode_BgColor();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqActionImpl <em>Ubq Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqActionImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqAction()
		 * @generated
		 */
		EClass UBQ_ACTION = eINSTANCE.getUbqAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_ACTION__NAME = eINSTANCE.getUbqAction_Name();

		/**
		 * The meta object literal for the '<em><b>Action IDs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_ACTION__ACTION_IDS = eINSTANCE.getUbqAction_ActionIDs();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_ACTION__ARGS = eINSTANCE.getUbqAction_Args();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqReactionImpl <em>Ubq Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqReactionImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqReaction()
		 * @generated
		 */
		EClass UBQ_REACTION = eINSTANCE.getUbqReaction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_REACTION__NAME = eINSTANCE.getUbqReaction_Name();

		/**
		 * The meta object literal for the '<em><b>Cmd IDs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_REACTION__CMD_IDS = eINSTANCE.getUbqReaction_CmdIDs();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_REACTION__CLAZZ = eINSTANCE.getUbqReaction_Clazz();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqFiducialImpl <em>Ubq Fiducial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqFiducialImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqFiducial()
		 * @generated
		 */
		EClass UBQ_FIDUCIAL = eINSTANCE.getUbqFiducial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_FIDUCIAL__NAME = eINSTANCE.getUbqFiducial_Name();

		/**
		 * The meta object literal for the '<em><b>Fidcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_FIDUCIAL__FIDCODE = eINSTANCE.getUbqFiducial_Fidcode();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqProximaImpl <em>Ubq Proxima</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqProximaImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqProxima()
		 * @generated
		 */
		EClass UBQ_PROXIMA = eINSTANCE.getUbqProxima();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__NAME = eINSTANCE.getUbqProxima_Name();

		/**
		 * The meta object literal for the '<em><b>Fiducial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__FIDUCIAL = eINSTANCE.getUbqProxima_Fiducial();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__RANGE = eINSTANCE.getUbqProxima_Range();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__BOUNDS = eINSTANCE.getUbqProxima_Bounds();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__RADIUS = eINSTANCE.getUbqProxima_Radius();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__ANGLE = eINSTANCE.getUbqProxima_Angle();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__STATUS = eINSTANCE.getUbqProxima_Status();

		/**
		 * The meta object literal for the '<em><b>Required Proximi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__REQUIRED_PROXIMI = eINSTANCE.getUbqProxima_RequiredProximi();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__SLOTS = eINSTANCE.getUbqProxima_Slots();

		/**
		 * The meta object literal for the '<em><b>Emitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__EMITTED = eINSTANCE.getUbqProxima_Emitted();

		/**
		 * The meta object literal for the '<em><b>Reacted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__REACTED = eINSTANCE.getUbqProxima_Reacted();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__BG_COLOR = eINSTANCE.getUbqProxima_BgColor();

		/**
		 * The meta object literal for the '<em><b>Fg Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_PROXIMA__FG_COLOR = eINSTANCE.getUbqProxima_FgColor();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__LIMIT = eINSTANCE.getUbqProxima_Limit();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__STEP = eINSTANCE.getUbqProxima_Step();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__SPEED = eINSTANCE.getUbqProxima_Speed();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__STYLE = eINSTANCE.getUbqProxima_Style();

		/**
		 * The meta object literal for the '<em><b>Rebang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__REBANG = eINSTANCE.getUbqProxima_Rebang();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__ROLE = eINSTANCE.getUbqProxima_Role();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__FUNCTION = eINSTANCE.getUbqProxima_Function();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_PROXIMA__ID = eINSTANCE.getUbqProxima_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl <em>Ubq Handled Reactions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqHandledReactionsImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqHandledReactions()
		 * @generated
		 */
		EClass UBQ_HANDLED_REACTIONS = eINSTANCE.getUbqHandledReactions();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_HANDLED_REACTIONS__REACTIONS = eINSTANCE.getUbqHandledReactions_Reactions();

		/**
		 * The meta object literal for the '<em><b>Proximi As Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_HANDLED_REACTIONS__PROXIMI_AS_REF = eINSTANCE.getUbqHandledReactions_ProximiAsRef();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl <em>Ubq Emmited Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqEmmitedActionsImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqEmmitedActions()
		 * @generated
		 */
		EClass UBQ_EMMITED_ACTIONS = eINSTANCE.getUbqEmmitedActions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_EMMITED_ACTIONS__ACTIONS = eINSTANCE.getUbqEmmitedActions_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_EMMITED_ACTIONS__EVENTS = eINSTANCE.getUbqEmmitedActions_Events();

		/**
		 * The meta object literal for the '<em><b>Proximi As Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_EMMITED_ACTIONS__PROXIMI_AS_REF = eINSTANCE.getUbqEmmitedActions_ProximiAsRef();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqSlotImpl <em>Ubq Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqSlotImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSlot()
		 * @generated
		 */
		EClass UBQ_SLOT = eINSTANCE.getUbqSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SLOT__NAME = eINSTANCE.getUbqSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SLOT__BOUNDS = eINSTANCE.getUbqSlot_Bounds();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SLOT__POSITION = eINSTANCE.getUbqSlot_Position();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SLOT__KIND = eINSTANCE.getUbqSlot_Kind();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SLOT__STATUS = eINSTANCE.getUbqSlot_Status();

		/**
		 * The meta object literal for the '<em><b>Emitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SLOT__EMITTED = eINSTANCE.getUbqSlot_Emitted();

		/**
		 * The meta object literal for the '<em><b>Reacted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SLOT__REACTED = eINSTANCE.getUbqSlot_Reacted();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqLayoutImpl <em>Ubq Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqLayoutImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqLayout()
		 * @generated
		 */
		EClass UBQ_LAYOUT = eINSTANCE.getUbqLayout();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_LAYOUT__KIND = eINSTANCE.getUbqLayout_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqCursorImpl <em>Ubq Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqCursorImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqCursor()
		 * @generated
		 */
		EClass UBQ_CURSOR = eINSTANCE.getUbqCursor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_CURSOR__NAME = eINSTANCE.getUbqCursor_Name();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_CURSOR__POS = eINSTANCE.getUbqCursor_Pos();

		/**
		 * The meta object literal for the '<em><b>Dim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_CURSOR__DIM = eINSTANCE.getUbqCursor_Dim();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqCompositeImpl <em>Ubq Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqCompositeImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqComposite()
		 * @generated
		 */
		EClass UBQ_COMPOSITE = eINSTANCE.getUbqComposite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_COMPOSITE__NAME = eINSTANCE.getUbqComposite_Name();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_COMPOSITE__BOUNDS = eINSTANCE.getUbqComposite_Bounds();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_COMPOSITE__LAYOUT = eINSTANCE.getUbqComposite_Layout();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_COMPOSITE__CHILDREN = eINSTANCE.getUbqComposite_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqPointImpl <em>Ubq Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqPointImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqPoint()
		 * @generated
		 */
		EClass UBQ_POINT = eINSTANCE.getUbqPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_POINT__X = eINSTANCE.getUbqPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_POINT__Y = eINSTANCE.getUbqPoint_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqBoundsImpl <em>Ubq Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqBoundsImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqBounds()
		 * @generated
		 */
		EClass UBQ_BOUNDS = eINSTANCE.getUbqBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BOUNDS__X = eINSTANCE.getUbqBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BOUNDS__Y = eINSTANCE.getUbqBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BOUNDS__WIDTH = eINSTANCE.getUbqBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BOUNDS__HEIGHT = eINSTANCE.getUbqBounds_Height();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqWidgetImpl <em>Ubq Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqWidgetImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqWidget()
		 * @generated
		 */
		EClass UBQ_WIDGET = eINSTANCE.getUbqWidget();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET__PARENT = eINSTANCE.getUbqWidget_Parent();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET__BOUNDS = eINSTANCE.getUbqWidget_Bounds();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_WIDGET__ANGLE = eINSTANCE.getUbqWidget_Angle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET__STYLE = eINSTANCE.getUbqWidget_Style();

		/**
		 * The meta object literal for the '<em><b>Emitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET__EMITTED = eINSTANCE.getUbqWidget_Emitted();

		/**
		 * The meta object literal for the '<em><b>Reacted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET__REACTED = eINSTANCE.getUbqWidget_Reacted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_WIDGET__NAME = eINSTANCE.getUbqWidget_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqImageImpl <em>Ubq Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqImageImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqImage()
		 * @generated
		 */
		EClass UBQ_IMAGE = eINSTANCE.getUbqImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_IMAGE__NAME = eINSTANCE.getUbqImage_Name();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_IMAGE__IMAGE = eINSTANCE.getUbqImage_Image();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqButtonImpl <em>Ubq Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqButtonImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqButton()
		 * @generated
		 */
		EClass UBQ_BUTTON = eINSTANCE.getUbqButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BUTTON__TEXT = eINSTANCE.getUbqButton_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BUTTON__IMAGE = eINSTANCE.getUbqButton_Image();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqLabelImpl <em>Ubq Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqLabelImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqLabel()
		 * @generated
		 */
		EClass UBQ_LABEL = eINSTANCE.getUbqLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_LABEL__TEXT = eINSTANCE.getUbqLabel_Text();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqCheckboxImpl <em>Ubq Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqCheckboxImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqCheckbox()
		 * @generated
		 */
		EClass UBQ_CHECKBOX = eINSTANCE.getUbqCheckbox();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_CHECKBOX__CHECKED = eINSTANCE.getUbqCheckbox_Checked();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqTextImpl <em>Ubq Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqTextImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqText()
		 * @generated
		 */
		EClass UBQ_TEXT = eINSTANCE.getUbqText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_TEXT__NAME = eINSTANCE.getUbqText_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_TEXT__TEXT = eINSTANCE.getUbqText_Text();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqMenuImpl <em>Ubq Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqMenuImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqMenu()
		 * @generated
		 */
		EClass UBQ_MENU = eINSTANCE.getUbqMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_MENU__NAME = eINSTANCE.getUbqMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_MENU__CHILDREN = eINSTANCE.getUbqMenu_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqMenuItemImpl <em>Ubq Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqMenuItemImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqMenuItem()
		 * @generated
		 */
		EClass UBQ_MENU_ITEM = eINSTANCE.getUbqMenuItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_MENU_ITEM__NAME = eINSTANCE.getUbqMenuItem_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_MENU_ITEM__TITLE = eINSTANCE.getUbqMenuItem_Title();

		/**
		 * The meta object literal for the '<em><b>Emitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_MENU_ITEM__EMITTED = eINSTANCE.getUbqMenuItem_Emitted();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqIncrementableRangeImpl <em>Ubq Incrementable Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqIncrementableRangeImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqIncrementableRange()
		 * @generated
		 */
		EClass UBQ_INCREMENTABLE_RANGE = eINSTANCE.getUbqIncrementableRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_INCREMENTABLE_RANGE__MIN = eINSTANCE.getUbqIncrementableRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_INCREMENTABLE_RANGE__MAX = eINSTANCE.getUbqIncrementableRange_Max();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_INCREMENTABLE_RANGE__VAL = eINSTANCE.getUbqIncrementableRange_Val();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqVuMeterImpl <em>Ubq Vu Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqVuMeterImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqVuMeter()
		 * @generated
		 */
		EClass UBQ_VU_METER = eINSTANCE.getUbqVuMeter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_VU_METER__NAME = eINSTANCE.getUbqVuMeter_Name();

		/**
		 * The meta object literal for the '<em><b>Range Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_VU_METER__RANGE_DEFINITION = eINSTANCE.getUbqVuMeter_RangeDefinition();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqSpinnerImpl <em>Ubq Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqSpinnerImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSpinner()
		 * @generated
		 */
		EClass UBQ_SPINNER = eINSTANCE.getUbqSpinner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SPINNER__NAME = eINSTANCE.getUbqSpinner_Name();

		/**
		 * The meta object literal for the '<em><b>Range Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SPINNER__RANGE_DEFINITION = eINSTANCE.getUbqSpinner_RangeDefinition();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqSliderImpl <em>Ubq Slider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqSliderImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqSlider()
		 * @generated
		 */
		EClass UBQ_SLIDER = eINSTANCE.getUbqSlider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_SLIDER__NAME = eINSTANCE.getUbqSlider_Name();

		/**
		 * The meta object literal for the '<em><b>Range Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_SLIDER__RANGE_DEFINITION = eINSTANCE.getUbqSlider_RangeDefinition();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqKnobImpl <em>Ubq Knob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqKnobImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqKnob()
		 * @generated
		 */
		EClass UBQ_KNOB = eINSTANCE.getUbqKnob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_KNOB__NAME = eINSTANCE.getUbqKnob_Name();

		/**
		 * The meta object literal for the '<em><b>Range Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_KNOB__RANGE_DEFINITION = eINSTANCE.getUbqKnob_RangeDefinition();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqWidgetStyleImpl <em>Ubq Widget Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqWidgetStyleImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqWidgetStyle()
		 * @generated
		 */
		EClass UBQ_WIDGET_STYLE = eINSTANCE.getUbqWidgetStyle();

		/**
		 * The meta object literal for the '<em><b>Color Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET_STYLE__COLOR_STYLE = eINSTANCE.getUbqWidgetStyle_ColorStyle();

		/**
		 * The meta object literal for the '<em><b>Font Style Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET_STYLE__FONT_STYLE_STYLE = eINSTANCE.getUbqWidgetStyle_FontStyleStyle();

		/**
		 * The meta object literal for the '<em><b>Border Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_WIDGET_STYLE__BORDER_STYLE = eINSTANCE.getUbqWidgetStyle_BorderStyle();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqColorStyleImpl <em>Ubq Color Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqColorStyleImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqColorStyle()
		 * @generated
		 */
		EClass UBQ_COLOR_STYLE = eINSTANCE.getUbqColorStyle();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_COLOR_STYLE__FOREGROUND = eINSTANCE.getUbqColorStyle_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBQ_COLOR_STYLE__BACKGROUND = eINSTANCE.getUbqColorStyle_Background();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqFontStyleImpl <em>Ubq Font Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqFontStyleImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqFontStyle()
		 * @generated
		 */
		EClass UBQ_FONT_STYLE = eINSTANCE.getUbqFontStyle();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_FONT_STYLE__FONT = eINSTANCE.getUbqFontStyle_Font();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_FONT_STYLE__HEIGHT = eINSTANCE.getUbqFontStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_FONT_STYLE__STYLES = eINSTANCE.getUbqFontStyle_Styles();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqBorderStyleImpl <em>Ubq Border Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqBorderStyleImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqBorderStyle()
		 * @generated
		 */
		EClass UBQ_BORDER_STYLE = eINSTANCE.getUbqBorderStyle();

		/**
		 * The meta object literal for the '<em><b>Tickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BORDER_STYLE__TICKNESS = eINSTANCE.getUbqBorderStyle_Tickness();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_BORDER_STYLE__STYLES = eINSTANCE.getUbqBorderStyle_Styles();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqColorImpl <em>Ubq Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqColorImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqColor()
		 * @generated
		 */
		EClass UBQ_COLOR = eINSTANCE.getUbqColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_COLOR__R = eINSTANCE.getUbqColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_COLOR__G = eINSTANCE.getUbqColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_COLOR__B = eINSTANCE.getUbqColor_B();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqHsbColorImpl <em>Ubq Hsb Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqHsbColorImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqHsbColor()
		 * @generated
		 */
		EClass UBQ_HSB_COLOR = eINSTANCE.getUbqHsbColor();

		/**
		 * The meta object literal for the '<em><b>Hue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_HSB_COLOR__HUE = eINSTANCE.getUbqHsbColor_Hue();

		/**
		 * The meta object literal for the '<em><b>Saturation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_HSB_COLOR__SATURATION = eINSTANCE.getUbqHsbColor_Saturation();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_HSB_COLOR__BRIGHTNESS = eINSTANCE.getUbqHsbColor_Brightness();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.impl.UbqRgbColorImpl <em>Ubq Rgb Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.impl.UbqRgbColorImpl
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUbqRgbColor()
		 * @generated
		 */
		EClass UBQ_RGB_COLOR = eINSTANCE.getUbqRgbColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_RGB_COLOR__RED = eINSTANCE.getUbqRgbColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_RGB_COLOR__GREEN = eINSTANCE.getUbqRgbColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBQ_RGB_COLOR__BLUE = eINSTANCE.getUbqRgbColor_Blue();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.SLOT_STATUS <em>SLOT STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.SLOT_STATUS
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOT_STATUS()
		 * @generated
		 */
		EEnum SLOT_STATUS = eINSTANCE.getSLOT_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.SLOT_KIND <em>SLOT KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.SLOT_KIND
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOT_KIND()
		 * @generated
		 */
		EEnum SLOT_KIND = eINSTANCE.getSLOT_KIND();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.PROXIMA_STATUS <em>PROXIMA STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.PROXIMA_STATUS
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_STATUS()
		 * @generated
		 */
		EEnum PROXIMA_STATUS = eINSTANCE.getPROXIMA_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.SLOTS <em>SLOTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.SLOTS
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getSLOTS()
		 * @generated
		 */
		EEnum SLOTS = eINSTANCE.getSLOTS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.UBQ_LAYOUT_KIND <em>UBQ LAYOUT KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.UBQ_LAYOUT_KIND
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_LAYOUT_KIND()
		 * @generated
		 */
		EEnum UBQ_LAYOUT_KIND = eINSTANCE.getUBQ_LAYOUT_KIND();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.UBQ_EVENTS <em>UBQ EVENTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.UBQ_EVENTS
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_EVENTS()
		 * @generated
		 */
		EEnum UBQ_EVENTS = eINSTANCE.getUBQ_EVENTS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.UBQ_GESTURES <em>UBQ GESTURES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.UBQ_GESTURES
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getUBQ_GESTURES()
		 * @generated
		 */
		EEnum UBQ_GESTURES = eINSTANCE.getUBQ_GESTURES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.FONT_STYLE <em>FONT STYLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.FONT_STYLE
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getFONT_STYLE()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFONT_STYLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.BORDER_STYLE <em>BORDER STYLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.BORDER_STYLE
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getBORDER_STYLE()
		 * @generated
		 */
		EEnum BORDER_STYLE = eINSTANCE.getBORDER_STYLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.PROXIMA_STYLE <em>PROXIMA STYLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.PROXIMA_STYLE
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_STYLE()
		 * @generated
		 */
		EEnum PROXIMA_STYLE = eINSTANCE.getPROXIMA_STYLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.PROXIMA_ROLE <em>PROXIMA ROLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.PROXIMA_ROLE
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_ROLE()
		 * @generated
		 */
		EEnum PROXIMA_ROLE = eINSTANCE.getPROXIMA_ROLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ubqt.PROXIMA_FUNCTION <em>PROXIMA FUNCTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ubqt.PROXIMA_FUNCTION
		 * @see net.sf.smbt.ubqt.impl.UbqtPackageImpl#getPROXIMA_FUNCTION()
		 * @generated
		 */
		EEnum PROXIMA_FUNCTION = eINSTANCE.getPROXIMA_FUNCTION();

	}

} //UbqtPackage
