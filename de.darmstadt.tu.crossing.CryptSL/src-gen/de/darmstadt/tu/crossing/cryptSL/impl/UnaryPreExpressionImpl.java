/**
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.Constraint;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Pre Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.UnaryPreExpressionImpl#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryPreExpressionImpl extends ConstraintImpl implements UnaryPreExpression
{
  /**
   * The cached value of the '{@link #getEnclosedExpression() <em>Enclosed Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnclosedExpression()
   * @generated
   * @ordered
   */
  protected Constraint enclosedExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryPreExpressionImpl()
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
    return CryptSLPackage.Literals.UNARY_PRE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getEnclosedExpression()
  {
    return enclosedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnclosedExpression(Constraint newEnclosedExpression, NotificationChain msgs)
  {
    Constraint oldEnclosedExpression = enclosedExpression;
    enclosedExpression = newEnclosedExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression, newEnclosedExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnclosedExpression(Constraint newEnclosedExpression)
  {
    if (newEnclosedExpression != enclosedExpression)
    {
      NotificationChain msgs = null;
      if (enclosedExpression != null)
        msgs = ((InternalEObject)enclosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
      if (newEnclosedExpression != null)
        msgs = ((InternalEObject)newEnclosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
      msgs = basicSetEnclosedExpression(newEnclosedExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION, newEnclosedExpression, newEnclosedExpression));
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
      case CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION:
        return basicSetEnclosedExpression(null, msgs);
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
      case CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION:
        return getEnclosedExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION:
        setEnclosedExpression((Constraint)newValue);
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
      case CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION:
        setEnclosedExpression((Constraint)null);
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
      case CryptSLPackage.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION:
        return enclosedExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //UnaryPreExpressionImpl
