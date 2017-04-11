/**
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getRightExpression <em>Right Expression</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getPredName <em>Pred Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getParList <em>Par List</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expression</em>' containment reference.
   * @see #setLeftExpression(Constraint)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint_LeftExpression()
   * @model containment="true"
   * @generated
   */
  Constraint getLeftExpression();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getLeftExpression <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expression</em>' containment reference.
   * @see #getLeftExpression()
   * @generated
   */
  void setLeftExpression(Constraint value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(EObject)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint_Operator()
   * @model containment="true"
   * @generated
   */
  EObject getOperator();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(EObject value);

  /**
   * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expression</em>' containment reference.
   * @see #setRightExpression(Constraint)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint_RightExpression()
   * @model containment="true"
   * @generated
   */
  Constraint getRightExpression();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getRightExpression <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expression</em>' containment reference.
   * @see #getRightExpression()
   * @generated
   */
  void setRightExpression(Constraint value);

  /**
   * Returns the value of the '<em><b>Pred Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred Name</em>' attribute.
   * @see #setPredName(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint_PredName()
   * @model
   * @generated
   */
  String getPredName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getPredName <em>Pred Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred Name</em>' attribute.
   * @see #getPredName()
   * @generated
   */
  void setPredName(String value);

  /**
   * Returns the value of the '<em><b>Par List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par List</em>' containment reference.
   * @see #setParList(SuParList)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getConstraint_ParList()
   * @model containment="true"
   * @generated
   */
  SuParList getParList();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Constraint#getParList <em>Par List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par List</em>' containment reference.
   * @see #getParList()
   * @generated
   */
  void setParList(SuParList value);

} // Constraint
