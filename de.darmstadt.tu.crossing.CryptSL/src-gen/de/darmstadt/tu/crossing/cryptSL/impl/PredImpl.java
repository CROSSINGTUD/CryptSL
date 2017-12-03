/**
 * generated by Xtext 2.13.0
 */
package de.darmstadt.tu.crossing.cryptSL.impl;

import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.Pred;
import de.darmstadt.tu.crossing.cryptSL.SuParList;
import de.darmstadt.tu.crossing.cryptSL.SuperType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pred</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.PredImpl#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.PredImpl#getParList <em>Par List</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.impl.PredImpl#getLabelCond <em>Label Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredImpl extends ConstraintImpl implements Pred
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
   * The cached value of the '{@link #getParList() <em>Par List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParList()
   * @generated
   * @ordered
   */
  protected SuParList parList;

  /**
   * The cached value of the '{@link #getLabelCond() <em>Label Cond</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelCond()
   * @generated
   * @ordered
   */
  protected SuperType labelCond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredImpl()
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
    return CryptSLPackage.Literals.PRED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPredName()
  {
    return predName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredName(String newPredName)
  {
    String oldPredName = predName;
    predName = newPredName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.PRED__PRED_NAME, oldPredName, predName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuParList getParList()
  {
    return parList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParList(SuParList newParList, NotificationChain msgs)
  {
    SuParList oldParList = parList;
    parList = newParList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CryptSLPackage.PRED__PAR_LIST, oldParList, newParList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParList(SuParList newParList)
  {
    if (newParList != parList)
    {
      NotificationChain msgs = null;
      if (parList != null)
        msgs = ((InternalEObject)parList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.PRED__PAR_LIST, null, msgs);
      if (newParList != null)
        msgs = ((InternalEObject)newParList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CryptSLPackage.PRED__PAR_LIST, null, msgs);
      msgs = basicSetParList(newParList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.PRED__PAR_LIST, newParList, newParList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType getLabelCond()
  {
    if (labelCond != null && labelCond.eIsProxy())
    {
      InternalEObject oldLabelCond = (InternalEObject)labelCond;
      labelCond = (SuperType)eResolveProxy(oldLabelCond);
      if (labelCond != oldLabelCond)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptSLPackage.PRED__LABEL_COND, oldLabelCond, labelCond));
      }
    }
    return labelCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperType basicGetLabelCond()
  {
    return labelCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelCond(SuperType newLabelCond)
  {
    SuperType oldLabelCond = labelCond;
    labelCond = newLabelCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CryptSLPackage.PRED__LABEL_COND, oldLabelCond, labelCond));
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
      case CryptSLPackage.PRED__PAR_LIST:
        return basicSetParList(null, msgs);
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
      case CryptSLPackage.PRED__PRED_NAME:
        return getPredName();
      case CryptSLPackage.PRED__PAR_LIST:
        return getParList();
      case CryptSLPackage.PRED__LABEL_COND:
        if (resolve) return getLabelCond();
        return basicGetLabelCond();
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
      case CryptSLPackage.PRED__PRED_NAME:
        setPredName((String)newValue);
        return;
      case CryptSLPackage.PRED__PAR_LIST:
        setParList((SuParList)newValue);
        return;
      case CryptSLPackage.PRED__LABEL_COND:
        setLabelCond((SuperType)newValue);
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
      case CryptSLPackage.PRED__PRED_NAME:
        setPredName(PRED_NAME_EDEFAULT);
        return;
      case CryptSLPackage.PRED__PAR_LIST:
        setParList((SuParList)null);
        return;
      case CryptSLPackage.PRED__LABEL_COND:
        setLabelCond((SuperType)null);
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
      case CryptSLPackage.PRED__PRED_NAME:
        return PRED_NAME_EDEFAULT == null ? predName != null : !PRED_NAME_EDEFAULT.equals(predName);
      case CryptSLPackage.PRED__PAR_LIST:
        return parList != null;
      case CryptSLPackage.PRED__LABEL_COND:
        return labelCond != null;
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
    result.append(" (predName: ");
    result.append(predName);
    result.append(')');
    return result.toString();
  }

} //PredImpl
