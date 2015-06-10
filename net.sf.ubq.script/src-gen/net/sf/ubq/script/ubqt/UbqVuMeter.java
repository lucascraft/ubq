/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubq Vu Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqVuMeter#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.UbqVuMeter#getRangeDefinition <em>Range Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqVuMeter()
 * @model
 * @generated
 */
public interface UbqVuMeter extends EObject
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
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqVuMeter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqVuMeter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Range Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Definition</em>' containment reference.
   * @see #setRangeDefinition(UbqIncrementableRange)
   * @see net.sf.ubq.script.ubqt.UbqtPackage#getUbqVuMeter_RangeDefinition()
   * @model containment="true"
   * @generated
   */
  UbqIncrementableRange getRangeDefinition();

  /**
   * Sets the value of the '{@link net.sf.ubq.script.ubqt.UbqVuMeter#getRangeDefinition <em>Range Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Definition</em>' containment reference.
   * @see #getRangeDefinition()
   * @generated
   */
  void setRangeDefinition(UbqIncrementableRange value);

} // UbqVuMeter
