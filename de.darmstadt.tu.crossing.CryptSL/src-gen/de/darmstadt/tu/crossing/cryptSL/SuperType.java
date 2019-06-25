/**
 * generated by Xtext 2.15.0
 */
package de.darmstadt.tu.crossing.cryptSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.SuperType#getName <em>Name</em>}</li>
 *   <li>{@link de.darmstadt.tu.crossing.cryptSL.SuperType#getMeth <em>Meth</em>}</li>
 * </ul>
 *
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getSuperType()
 * @model
 * @generated
 */
public interface SuperType extends Event
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getSuperType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.SuperType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Meth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meth</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meth</em>' containment reference.
   * @see #setMeth(Method)
   * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage#getSuperType_Meth()
   * @model containment="true"
   * @generated
   */
  Method getMeth();

  /**
   * Sets the value of the '{@link de.darmstadt.tu.crossing.cryptSL.SuperType#getMeth <em>Meth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meth</em>' containment reference.
   * @see #getMeth()
   * @generated
   */
  void setMeth(Method value);

} // SuperType
