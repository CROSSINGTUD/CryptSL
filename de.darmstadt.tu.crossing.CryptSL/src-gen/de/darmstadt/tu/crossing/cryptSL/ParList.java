/**
 * generated by Xtext 2.17.1
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Par List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ParList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getParList()
 * @model
 * @generated
 */
public interface ParList extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.darmstadt.tu.crossing.cryptSL.Par}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getParList_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Par> getParameters();

} // ParList
