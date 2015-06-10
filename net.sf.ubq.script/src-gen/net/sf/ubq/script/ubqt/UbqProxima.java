/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import net.sf.xqz.engine.script.orchestror.DSLEngineClient;

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
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getFiducial <em>Fiducial</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getRange <em>Range</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getRequiredProximi <em>Required Proximi</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getEmitted <em>Emitted</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqProxima#getReacted <em>Reacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima()
 * @model
 * @generated
 */
public interface UbqProxima extends EObject
{
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getName <em>Name</em>}' attribute.
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Fiducial()
   * @model
   * @generated
   */
  UbqFiducial getFiducial();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getFiducial <em>Fiducial</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fiducial</em>' reference.
   * @see #getFiducial()
   * @generated
   */
  void setFiducial(UbqFiducial value);

  /**
   * Returns the value of the '<em><b>Engine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Engine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Engine</em>' reference.
   * @see #setEngine(DSLEngineClient)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Engine()
   * @model
   * @generated
   */
  DSLEngineClient getEngine();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getEngine <em>Engine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Engine</em>' reference.
   * @see #getEngine()
   * @generated
   */
  void setEngine(DSLEngineClient value);

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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Range()
   * @model containment="true"
   * @generated
   */
  UbqIncrementableRange getRange();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getRange <em>Range</em>}' containment reference.
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Bounds()
   * @model containment="true"
   * @generated
   */
  UbqBounds getBounds();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getBounds <em>Bounds</em>}' containment reference.
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Radius()
   * @model
   * @generated
   */
  int getRadius();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getRadius <em>Radius</em>}' attribute.
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
   * @see #setAngle(int)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Angle()
   * @model
   * @generated
   */
  int getAngle();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getAngle <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' attribute.
   * @see #getAngle()
   * @generated
   */
  void setAngle(int value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.ubq.script.ubqt.PROXIMA_STATUS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see net.sf.ubq.script.ubqt.PROXIMA_STATUS
   * @see #setStatus(PROXIMA_STATUS)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Status()
   * @model
   * @generated
   */
  PROXIMA_STATUS getStatus();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqProxima#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see net.sf.ubq.script.ubqt.PROXIMA_STATUS
   * @see #getStatus()
   * @generated
   */
  void setStatus(PROXIMA_STATUS value);

  /**
   * Returns the value of the '<em><b>Required Proximi</b></em>' reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqProxima}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Proximi</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Proximi</em>' reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_RequiredProximi()
   * @model
   * @generated
   */
  EList<UbqProxima> getRequiredProximi();

  /**
   * Returns the value of the '<em><b>Slots</b></em>' reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqSlot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slots</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slots</em>' reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Slots()
   * @model
   * @generated
   */
  EList<UbqSlot> getSlots();

  /**
   * Returns the value of the '<em><b>Emitted</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqEmmitedActions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Emitted</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Emitted</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Emitted()
   * @model containment="true"
   * @generated
   */
  EList<UbqEmmitedActions> getEmitted();

  /**
   * Returns the value of the '<em><b>Reacted</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.ubq.script.ubqt.UbqHandledReactions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reacted</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reacted</em>' containment reference list.
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqProxima_Reacted()
   * @model containment="true"
   * @generated
   */
  EList<UbqHandledReactions> getReacted();

} // UbqProxima
