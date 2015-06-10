/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.ubq.script.ubqt.impl;

import java.util.Collection;

import net.sf.ubq.script.ubqt.UbqAction;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubq Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqActionImpl#getActionIDs <em>Action IDs</em>}</li>
 *   <li>{@link net.sf.ubq.script.ubqt.impl.UbqActionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbqActionImpl extends MinimalEObjectImpl.Container implements UbqAction
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionIDs() <em>Action IDs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionIDs()
   * @generated
   * @ordered
   */
  protected EList<String> actionIDs;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<String> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UbqActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UbqtPackage.Literals.UBQ_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UbqtPackage.UBQ_ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getActionIDs()
  {
    if (actionIDs == null)
    {
      actionIDs = new EDataTypeEList<String>(String.class, this, UbqtPackage.UBQ_ACTION__ACTION_IDS);
    }
    return actionIDs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgs()
  {
    if (args == null)
    {
      args = new EDataTypeEList<String>(String.class, this, UbqtPackage.UBQ_ACTION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_ACTION__NAME:
        return getName();
      case UbqtPackage.UBQ_ACTION__ACTION_IDS:
        return getActionIDs();
      case UbqtPackage.UBQ_ACTION__ARGS:
        return getArgs();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_ACTION__NAME:
        setName((String)newValue);
        return;
      case UbqtPackage.UBQ_ACTION__ACTION_IDS:
        getActionIDs().clear();
        getActionIDs().addAll((Collection<? extends String>)newValue);
        return;
      case UbqtPackage.UBQ_ACTION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UbqtPackage.UBQ_ACTION__ACTION_IDS:
        getActionIDs().clear();
        return;
      case UbqtPackage.UBQ_ACTION__ARGS:
        getArgs().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UbqtPackage.UBQ_ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UbqtPackage.UBQ_ACTION__ACTION_IDS:
        return actionIDs != null && !actionIDs.isEmpty();
      case UbqtPackage.UBQ_ACTION__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", actionIDs: ");
    result.append(actionIDs);
    result.append(", args: ");
    result.append(args);
    result.append(')');
    return result.toString();
  }

} //UbqActionImpl
