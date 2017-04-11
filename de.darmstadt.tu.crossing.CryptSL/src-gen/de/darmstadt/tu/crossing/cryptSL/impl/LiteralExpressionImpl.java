/**
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.LitList;
import de.darmstadt.tu.crossing.cryptSL.LiteralExpression;
import de.darmstadt.tu.crossing.cryptSL.SuperType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.LiteralExpressionImpl#getLitsleft <em>Litsleft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralExpressionImpl extends ConstraintImpl implements LiteralExpression
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EObject name;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected EList<de.darmstadt.tu.crossing.cryptSL.Object> obj;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmType type;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SuperType value;

  /**
   * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCons()
   * @generated
   * @ordered
   */
  protected LiteralExpression cons;

  /**
   * The cached value of the '{@link #getLitsleft() <em>Litsleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLitsleft()
   * @generated
   * @ordered
   */
  protected LitList litsleft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralExpressionImpl()
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
    return CryptSLPackage.Literals.LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(EObject newName, NotificationChain msgs)
  {
    EObject oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(EObject newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.darmstadt.tu.crossing.cryptSL.Object> getObj()
  {
    if (obj == null)
    {
      obj = new EObjectResolvingEList<de.darmstadt.tu.crossing.cryptSL.Object>(de.darmstadt.tu.crossing.cryptSL.Object.class, this, CryptSLPackage.LITERAL_EXPRESSION__OBJ);
    }
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (JvmType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.LITERAL_EXPRESSION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmType newType)
  {
    JvmType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (SuperType)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.LITERAL_EXPRESSION__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SuperType newValue)
  {
    SuperType oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getCons()
  {
    return cons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCons(LiteralExpression newCons, NotificationChain msgs)
  {
    LiteralExpression oldCons = cons;
    cons = newCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__CONS, oldCons, newCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCons(LiteralExpression newCons)
  {
    if (newCons != cons)
    {
      NotificationChain msgs = null;
      if (cons != null)
        msgs = ((InternalEObject)cons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__CONS, null, msgs);
      if (newCons != null)
        msgs = ((InternalEObject)newCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__CONS, null, msgs);
      msgs = basicSetCons(newCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__CONS, newCons, newCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LitList getLitsleft()
  {
    return litsleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLitsleft(LitList newLitsleft, NotificationChain msgs)
  {
    LitList oldLitsleft = litsleft;
    litsleft = newLitsleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, oldLitsleft, newLitsleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLitsleft(LitList newLitsleft)
  {
    if (newLitsleft != litsleft)
    {
      NotificationChain msgs = null;
      if (litsleft != null)
        msgs = ((InternalEObject)litsleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, null, msgs);
      if (newLitsleft != null)
        msgs = ((InternalEObject)newLitsleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, null, msgs);
      msgs = basicSetLitsleft(newLitsleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT, newLitsleft, newLitsleft));
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return basicSetName(null, msgs);
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return basicSetCons(null, msgs);
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return basicSetLitsleft(null, msgs);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return getName();
      case CryptSLPackage.LITERAL_EXPRESSION__OBJ:
        return getObj();
      case CryptSLPackage.LITERAL_EXPRESSION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return getCons();
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return getLitsleft();
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        setName((EObject)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__OBJ:
        getObj().clear();
        getObj().addAll((Collection<? extends de.darmstadt.tu.crossing.cryptSL.Object>)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__TYPE:
        setType((JvmType)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        setValue((SuperType)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        setCons((LiteralExpression)newValue);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        setLitsleft((LitList)newValue);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        setName((EObject)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__OBJ:
        getObj().clear();
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__TYPE:
        setType((JvmType)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        setValue((SuperType)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        setCons((LiteralExpression)null);
        return;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        setLitsleft((LitList)null);
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
      case CryptSLPackage.LITERAL_EXPRESSION__NAME:
        return name != null;
      case CryptSLPackage.LITERAL_EXPRESSION__OBJ:
        return obj != null && !obj.isEmpty();
      case CryptSLPackage.LITERAL_EXPRESSION__TYPE:
        return type != null;
      case CryptSLPackage.LITERAL_EXPRESSION__VALUE:
        return value != null;
      case CryptSLPackage.LITERAL_EXPRESSION__CONS:
        return cons != null;
      case CryptSLPackage.LITERAL_EXPRESSION__LITSLEFT:
        return litsleft != null;
    }
    return super.eIsSet(featureID);
  }

//       public String toString() {
//      return this.getCons().getName().getValue().getName();
//     }
}