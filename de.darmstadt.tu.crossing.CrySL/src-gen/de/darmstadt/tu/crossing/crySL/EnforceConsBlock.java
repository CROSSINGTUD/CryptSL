/**
 * generated by Xtext 2.28.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforce Cons Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.crySL.EnforceConsBlock#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getEnforceConsBlock()
 * @model
 * @generated
 */
public interface EnforceConsBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Req</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.crySL.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.crySL.CrySLPackage#getEnforceConsBlock_Req()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getReq();

} // EnforceConsBlock
