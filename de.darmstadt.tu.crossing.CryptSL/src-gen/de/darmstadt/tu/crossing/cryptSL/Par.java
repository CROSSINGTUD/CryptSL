/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Par</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.Par#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPar()
 * @model
 * @generated
 */
public interface Par extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' reference.
   * @see #setVal(de.darmstadt.tu.crossing.cryptSL.Object)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getPar_Val()
   * @model
   * @generated
   */
  de.darmstadt.tu.crossing.cryptSL.Object getVal();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.Par#getVal <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' reference.
   * @see #getVal()
   * @generated
   */
  void setVal(de.darmstadt.tu.crossing.cryptSL.Object value);

} // Par
