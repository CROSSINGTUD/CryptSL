/**
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Pred</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.ReqPred#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.ReqPred#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.ReqPred#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getReqPred()
 * @model
 * @generated
 */
public interface ReqPred extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expression</em>' containment reference.
   * @see #setLeftExpression(ReqPred)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getReqPred_LeftExpression()
   * @model containment="true"
   * @generated
   */
  ReqPred getLeftExpression();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.ReqPred#getLeftExpression <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expression</em>' containment reference.
   * @see #getLeftExpression()
   * @generated
   */
  void setLeftExpression(ReqPred value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(LogicalOperator)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getReqPred_Operator()
   * @model containment="true"
   * @generated
   */
  LogicalOperator getOperator();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.ReqPred#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(LogicalOperator value);

  /**
   * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expression</em>' containment reference.
   * @see #setRightExpression(PredLit)
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getReqPred_RightExpression()
   * @model containment="true"
   * @generated
   */
  PredLit getRightExpression();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.crySL.ReqPred#getRightExpression <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expression</em>' containment reference.
   * @see #getRightExpression()
   * @generated
   */
  void setRightExpression(PredLit value);

} // ReqPred
