/**
 * generated by Xtext 2.13.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.ArithmeticOperator;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ArithmeticOperatorImpl#getPLUS <em>PLUS</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ArithmeticOperatorImpl#getMINUS <em>MINUS</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ArithmeticOperatorImpl#getTIMES <em>TIMES</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.ArithmeticOperatorImpl#getDIVIDE <em>DIVIDE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticOperatorImpl extends MinimalEObjectImpl.Container implements ArithmeticOperator
{
  /**
   * The default value of the '{@link #getPLUS() <em>PLUS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPLUS()
   * @generated
   * @ordered
   */
  protected static final String PLUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPLUS() <em>PLUS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPLUS()
   * @generated
   * @ordered
   */
  protected String plus = PLUS_EDEFAULT;

  /**
   * The default value of the '{@link #getMINUS() <em>MINUS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMINUS()
   * @generated
   * @ordered
   */
  protected static final String MINUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMINUS() <em>MINUS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMINUS()
   * @generated
   * @ordered
   */
  protected String minus = MINUS_EDEFAULT;

  /**
   * The default value of the '{@link #getTIMES() <em>TIMES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTIMES()
   * @generated
   * @ordered
   */
  protected static final String TIMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTIMES() <em>TIMES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTIMES()
   * @generated
   * @ordered
   */
  protected String times = TIMES_EDEFAULT;

  /**
   * The default value of the '{@link #getDIVIDE() <em>DIVIDE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDIVIDE()
   * @generated
   * @ordered
   */
  protected static final String DIVIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDIVIDE() <em>DIVIDE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDIVIDE()
   * @generated
   * @ordered
   */
  protected String divide = DIVIDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArithmeticOperatorImpl()
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
    return CryptSLPackage.Literals.ARITHMETIC_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPLUS()
  {
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPLUS(String newPLUS)
  {
    String oldPLUS = plus;
    plus = newPLUS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.ARITHMETIC_OPERATOR__PLUS, oldPLUS, plus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMINUS()
  {
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMINUS(String newMINUS)
  {
    String oldMINUS = minus;
    minus = newMINUS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.ARITHMETIC_OPERATOR__MINUS, oldMINUS, minus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTIMES()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTIMES(String newTIMES)
  {
    String oldTIMES = times;
    times = newTIMES;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.ARITHMETIC_OPERATOR__TIMES, oldTIMES, times));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDIVIDE()
  {
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDIVIDE(String newDIVIDE)
  {
    String oldDIVIDE = divide;
    divide = newDIVIDE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.ARITHMETIC_OPERATOR__DIVIDE, oldDIVIDE, divide));
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
      case CryptSLPackage.ARITHMETIC_OPERATOR__PLUS:
        return getPLUS();
      case CryptSLPackage.ARITHMETIC_OPERATOR__MINUS:
        return getMINUS();
      case CryptSLPackage.ARITHMETIC_OPERATOR__TIMES:
        return getTIMES();
      case CryptSLPackage.ARITHMETIC_OPERATOR__DIVIDE:
        return getDIVIDE();
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
      case CryptSLPackage.ARITHMETIC_OPERATOR__PLUS:
        setPLUS((String)newValue);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__MINUS:
        setMINUS((String)newValue);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__TIMES:
        setTIMES((String)newValue);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__DIVIDE:
        setDIVIDE((String)newValue);
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
      case CryptSLPackage.ARITHMETIC_OPERATOR__PLUS:
        setPLUS(PLUS_EDEFAULT);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__MINUS:
        setMINUS(MINUS_EDEFAULT);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__TIMES:
        setTIMES(TIMES_EDEFAULT);
        return;
      case CryptSLPackage.ARITHMETIC_OPERATOR__DIVIDE:
        setDIVIDE(DIVIDE_EDEFAULT);
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
      case CryptSLPackage.ARITHMETIC_OPERATOR__PLUS:
        return PLUS_EDEFAULT == null ? plus != null : !PLUS_EDEFAULT.equals(plus);
      case CryptSLPackage.ARITHMETIC_OPERATOR__MINUS:
        return MINUS_EDEFAULT == null ? minus != null : !MINUS_EDEFAULT.equals(minus);
      case CryptSLPackage.ARITHMETIC_OPERATOR__TIMES:
        return TIMES_EDEFAULT == null ? times != null : !TIMES_EDEFAULT.equals(times);
      case CryptSLPackage.ARITHMETIC_OPERATOR__DIVIDE:
        return DIVIDE_EDEFAULT == null ? divide != null : !DIVIDE_EDEFAULT.equals(divide);
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
    result.append(" (PLUS: ");
    result.append(plus);
    result.append(", MINUS: ");
    result.append(minus);
    result.append(", TIMES: ");
    result.append(times);
    result.append(", DIVIDE: ");
    result.append(divide);
    result.append(')');
    return result.toString();
  }

} //ArithmeticOperatorImpl
