/**
 * generated by Xtext 2.12.0
 */
package de.darmstadt.tu.crossing.cryptSL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmExecutable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forb Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ForbMethod#getJavaMeth <em>Java Meth</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.ForbMethod#getRep <em>Rep</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getForbMethod()
 * @model
 * @generated
 */
public interface ForbMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Java Meth</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Meth</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Meth</em>' reference.
   * @see #setJavaMeth(JvmExecutable)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getForbMethod_JavaMeth()
   * @model
   * @generated
   */
  JvmExecutable getJavaMeth();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ForbMethod#getJavaMeth <em>Java Meth</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Meth</em>' reference.
   * @see #getJavaMeth()
   * @generated
   */
  void setJavaMeth(JvmExecutable value);

  /**
   * Returns the value of the '<em><b>Rep</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rep</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rep</em>' reference.
   * @see #setRep(Event)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getForbMethod_Rep()
   * @model
   * @generated
   */
  Event getRep();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.ForbMethod#getRep <em>Rep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rep</em>' reference.
   * @see #getRep()
   * @generated
   */
  void setRep(Event value);

} // ForbMethod
