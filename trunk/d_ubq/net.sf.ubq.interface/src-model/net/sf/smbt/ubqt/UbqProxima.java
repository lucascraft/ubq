/**
 */
package net.sf.smbt.ubqt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Proxima</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getFiducial <em>Fiducial</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getRange <em>Range</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getRequiredProximi <em>Required Proximi</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getReacted <em>Reacted</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getFgColor <em>Fg Color</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getLimit <em>Limit</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getStep <em>Step</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getStyle <em>Style</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getRebang <em>Rebang</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getRole <em>Role</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getFunction <em>Function</em>}</li>
 *   <li>{@link net.sf.smbt.ubqt.UbqProxima#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima()
 * @model
 * @generated
 */
public interface UbqProxima extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fiducial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiducial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiducial</em>' reference.
	 * @see #setFiducial(UbqFiducial)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Fiducial()
	 * @model
	 * @generated
	 */
	UbqFiducial getFiducial();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getFiducial <em>Fiducial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiducial</em>' reference.
	 * @see #getFiducial()
	 * @generated
	 */
	void setFiducial(UbqFiducial value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(UbqIncrementableRange)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Range()
	 * @model containment="true"
	 * @generated
	 */
	UbqIncrementableRange getRange();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(UbqIncrementableRange value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(UbqBounds)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	UbqBounds getBounds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(UbqBounds value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Radius()
	 * @model
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(float)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Angle()
	 * @model
	 * @generated
	 */
	float getAngle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.PROXIMA_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_STATUS
	 * @see #setStatus(PROXIMA_STATUS)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Status()
	 * @model
	 * @generated
	 */
	PROXIMA_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PROXIMA_STATUS value);

	/**
	 * Returns the value of the '<em><b>Required Proximi</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqProxima}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Proximi</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Proximi</em>' reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_RequiredProximi()
	 * @model
	 * @generated
	 */
	EList<UbqProxima> getRequiredProximi();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Slots()
	 * @model
	 * @generated
	 */
	EList<UbqSlot> getSlots();

	/**
	 * Returns the value of the '<em><b>Emitted</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqEmmitedActions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitted</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Emitted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqEmmitedActions> getEmitted();

	/**
	 * Returns the value of the '<em><b>Reacted</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ubqt.UbqHandledReactions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reacted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reacted</em>' containment reference list.
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Reacted()
	 * @model containment="true"
	 * @generated
	 */
	EList<UbqHandledReactions> getReacted();

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' containment reference.
	 * @see #setBgColor(UbqColor)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_BgColor()
	 * @model containment="true"
	 * @generated
	 */
	UbqColor getBgColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getBgColor <em>Bg Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' containment reference.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(UbqColor value);

	/**
	 * Returns the value of the '<em><b>Fg Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fg Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fg Color</em>' containment reference.
	 * @see #setFgColor(UbqColor)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_FgColor()
	 * @model containment="true"
	 * @generated
	 */
	UbqColor getFgColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getFgColor <em>Fg Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fg Color</em>' containment reference.
	 * @see #getFgColor()
	 * @generated
	 */
	void setFgColor(UbqColor value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Limit()
	 * @model
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Speed()
	 * @model
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.PROXIMA_STYLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_STYLE
	 * @see #setStyle(PROXIMA_STYLE)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Style()
	 * @model
	 * @generated
	 */
	PROXIMA_STYLE getStyle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_STYLE
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(PROXIMA_STYLE value);

	/**
	 * Returns the value of the '<em><b>Rebang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rebang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rebang</em>' attribute.
	 * @see #setRebang(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Rebang()
	 * @model
	 * @generated
	 */
	int getRebang();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getRebang <em>Rebang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rebang</em>' attribute.
	 * @see #getRebang()
	 * @generated
	 */
	void setRebang(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.PROXIMA_ROLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_ROLE
	 * @see #setRole(PROXIMA_ROLE)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Role()
	 * @model
	 * @generated
	 */
	PROXIMA_ROLE getRole();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_ROLE
	 * @see #getRole()
	 * @generated
	 */
	void setRole(PROXIMA_ROLE value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ubqt.PROXIMA_FUNCTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_FUNCTION
	 * @see #setFunction(PROXIMA_FUNCTION)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Function()
	 * @model
	 * @generated
	 */
	PROXIMA_FUNCTION getFunction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see net.sf.smbt.ubqt.PROXIMA_FUNCTION
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PROXIMA_FUNCTION value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.smbt.ubqt.UbqtPackage#getUbqProxima_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ubqt.UbqProxima#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // UbqProxima
