/**
 * generated by Xtext 2.28.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getArray <em>Array</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getCollection <em>Collection</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getUsage <em>Usage</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getForbEvent <em>Forb Event</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getReq_events <em>Req events</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getOrder <em>Order</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getReqConstraints <em>Req Constraints</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getRequire <em>Require</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getEnsure <em>Ensure</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getDestroy <em>Destroy</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' reference.
   * @see #setJavaType(JvmType)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_JavaType()
   * @model
   * @generated
   */
  JvmType getJavaType();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getJavaType <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' reference.
   * @see #getJavaType()
   * @generated
   */
  void setJavaType(JvmType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(String)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Array()
   * @model
   * @generated
   */
  String getArray();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #getArray()
   * @generated
   */
  void setArray(String value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' reference.
   * @see #setCollection(JvmGenericType)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Collection()
   * @model
   * @generated
   */
  JvmGenericType getCollection();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getCollection <em>Collection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(JvmGenericType value);

  /**
   * Returns the value of the '<em><b>Usage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' containment reference.
   * @see #setUsage(UseBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Usage()
   * @model containment="true"
   * @generated
   */
  UseBlock getUsage();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getUsage <em>Usage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usage</em>' containment reference.
   * @see #getUsage()
   * @generated
   */
  void setUsage(UseBlock value);

  /**
   * Returns the value of the '<em><b>Forb Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forb Event</em>' containment reference.
   * @see #setForbEvent(ForbiddenBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_ForbEvent()
   * @model containment="true"
   * @generated
   */
  ForbiddenBlock getForbEvent();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getForbEvent <em>Forb Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forb Event</em>' containment reference.
   * @see #getForbEvent()
   * @generated
   */
  void setForbEvent(ForbiddenBlock value);

  /**
   * Returns the value of the '<em><b>Req events</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req events</em>' containment reference.
   * @see #setReq_events(RequiredBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Req_events()
   * @model containment="true"
   * @generated
   */
  RequiredBlock getReq_events();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getReq_events <em>Req events</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req events</em>' containment reference.
   * @see #getReq_events()
   * @generated
   */
  void setReq_events(RequiredBlock value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(Expression)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Order()
   * @model containment="true"
   * @generated
   */
  Expression getOrder();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(Expression value);

  /**
   * Returns the value of the '<em><b>Req Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req Constraints</em>' containment reference.
   * @see #setReqConstraints(EnforceConsBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_ReqConstraints()
   * @model containment="true"
   * @generated
   */
  EnforceConsBlock getReqConstraints();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getReqConstraints <em>Req Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req Constraints</em>' containment reference.
   * @see #getReqConstraints()
   * @generated
   */
  void setReqConstraints(EnforceConsBlock value);

  /**
   * Returns the value of the '<em><b>Require</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Require</em>' containment reference.
   * @see #setRequire(RequiresBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Require()
   * @model containment="true"
   * @generated
   */
  RequiresBlock getRequire();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getRequire <em>Require</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Require</em>' containment reference.
   * @see #getRequire()
   * @generated
   */
  void setRequire(RequiresBlock value);

  /**
   * Returns the value of the '<em><b>Ensure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ensure</em>' containment reference.
   * @see #setEnsure(EnsuresBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Ensure()
   * @model containment="true"
   * @generated
   */
  EnsuresBlock getEnsure();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getEnsure <em>Ensure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ensure</em>' containment reference.
   * @see #getEnsure()
   * @generated
   */
  void setEnsure(EnsuresBlock value);

  /**
   * Returns the value of the '<em><b>Destroy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destroy</em>' containment reference.
   * @see #setDestroy(DestroysBlock)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getDomainmodel_Destroy()
   * @model containment="true"
   * @generated
   */
  DestroysBlock getDestroy();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.Domainmodel#getDestroy <em>Destroy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destroy</em>' containment reference.
   * @see #getDestroy()
   * @generated
   */
  void setDestroy(DestroysBlock value);

} // Domainmodel
