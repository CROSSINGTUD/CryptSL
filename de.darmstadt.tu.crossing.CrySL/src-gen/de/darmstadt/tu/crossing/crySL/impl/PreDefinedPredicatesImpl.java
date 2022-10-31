/**
 * generated by Xtext 2.28.0
 */
package de.darmstadt.tu.crossing.crySL.impl;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.JvmType;
import de.darmstadt.tu.crossing.crySL.PreDefinedPredicates;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Defined Predicates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.PreDefinedPredicatesImpl#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.PreDefinedPredicatesImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.impl.PreDefinedPredicatesImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreDefinedPredicatesImpl extends LiteralExpressionImpl implements PreDefinedPredicates
{
  /**
   * The default value of the '{@link #getPredName() <em>Pred Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredName()
   * @generated
   * @ordered
   */
  protected static final String PRED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredName() <em>Pred Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredName()
   * @generated
   * @ordered
   */
  protected String predName = PRED_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected EList<Event> obj;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreDefinedPredicatesImpl()
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
    return CrySLPackage.Literals.PRE_DEFINED_PREDICATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPredName()
  {
    return predName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredName(String newPredName)
  {
    String oldPredName = predName;
    predName = newPredName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrySLPackage.PRE_DEFINED_PREDICATES__PRED_NAME, oldPredName, predName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getObj()
  {
    if (obj == null)
    {
      obj = new EObjectResolvingEList<Event>(Event.class, this, CrySLPackage.PRE_DEFINED_PREDICATES__OBJ);
    }
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmType newType, NotificationChain msgs)
  {
    JvmType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrySLPackage.PRE_DEFINED_PREDICATES__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(JvmType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrySLPackage.PRE_DEFINED_PREDICATES__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrySLPackage.PRE_DEFINED_PREDICATES__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CrySLPackage.PRE_DEFINED_PREDICATES__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CrySLPackage.PRE_DEFINED_PREDICATES__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CrySLPackage.PRE_DEFINED_PREDICATES__PRED_NAME:
        return getPredName();
      case CrySLPackage.PRE_DEFINED_PREDICATES__OBJ:
        return getObj();
      case CrySLPackage.PRE_DEFINED_PREDICATES__TYPE:
        return getType();
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
      case CrySLPackage.PRE_DEFINED_PREDICATES__PRED_NAME:
        setPredName((String)newValue);
        return;
      case CrySLPackage.PRE_DEFINED_PREDICATES__OBJ:
        getObj().clear();
        getObj().addAll((Collection<? extends Event>)newValue);
        return;
      case CrySLPackage.PRE_DEFINED_PREDICATES__TYPE:
        setType((JvmType)newValue);
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
      case CrySLPackage.PRE_DEFINED_PREDICATES__PRED_NAME:
        setPredName(PRED_NAME_EDEFAULT);
        return;
      case CrySLPackage.PRE_DEFINED_PREDICATES__OBJ:
        getObj().clear();
        return;
      case CrySLPackage.PRE_DEFINED_PREDICATES__TYPE:
        setType((JvmType)null);
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
      case CrySLPackage.PRE_DEFINED_PREDICATES__PRED_NAME:
        return PRED_NAME_EDEFAULT == null ? predName != null : !PRED_NAME_EDEFAULT.equals(predName);
      case CrySLPackage.PRE_DEFINED_PREDICATES__OBJ:
        return obj != null && !obj.isEmpty();
      case CrySLPackage.PRE_DEFINED_PREDICATES__TYPE:
        return type != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (predName: ");
    result.append(predName);
    result.append(')');
    return result.toString();
  }

} //PreDefinedPredicatesImpl
