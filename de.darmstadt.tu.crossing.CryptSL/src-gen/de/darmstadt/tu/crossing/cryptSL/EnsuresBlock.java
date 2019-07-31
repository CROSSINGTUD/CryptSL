/**
 * generated by Xtext 2.18.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensures Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.EnsuresBlock#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getEnsuresBlock()
 * @model
 * @generated
 */
public interface EnsuresBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getEnsuresBlock_Pred()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getPred();

} // EnsuresBlock
