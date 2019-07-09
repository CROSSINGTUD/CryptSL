/**
 * generated by Xtext 2.16.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LogicalOperator#getOR <em>OR</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.LogicalOperator#getAND <em>AND</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLogicalOperator()
 * @model
 * @generated
 */
public interface LogicalOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>OR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OR</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OR</em>' attribute.
   * @see #setOR(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLogicalOperator_OR()
   * @model
   * @generated
   */
  String getOR();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LogicalOperator#getOR <em>OR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OR</em>' attribute.
   * @see #getOR()
   * @generated
   */
  void setOR(String value);

  /**
   * Returns the value of the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AND</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AND</em>' attribute.
   * @see #setAND(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getLogicalOperator_AND()
   * @model
   * @generated
   */
  String getAND();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.LogicalOperator#getAND <em>AND</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AND</em>' attribute.
   * @see #getAND()
   * @generated
   */
  void setAND(String value);

} // LogicalOperator
