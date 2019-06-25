/**
 * generated by Xtext 2.15.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ArrayElements#getEl <em>El</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ArrayElements#getCons <em>Cons</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getArrayElements()
 * @model
 * @generated
 */
public interface ArrayElements extends EObject
{
  /**
   * Returns the value of the '<em><b>El</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' attribute.
   * @see #setEl(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getArrayElements_El()
   * @model
   * @generated
   */
  String getEl();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ArrayElements#getEl <em>El</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' attribute.
   * @see #getEl()
   * @generated
   */
  void setEl(String value);

  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(LiteralExpression)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getArrayElements_Cons()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getCons();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ArrayElements#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(LiteralExpression value);

} // ArrayElements
