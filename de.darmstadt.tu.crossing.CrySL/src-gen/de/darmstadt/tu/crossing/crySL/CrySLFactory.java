/**
 * generated by Xtext 2.21.0
 */
package de.darmstadt.tu.crossing.crySL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.darmstadt.tu.crossing.crySL.CrySLPackage
 * @generated
 */
public interface CrySLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CrySLFactory eINSTANCE = de.darmstadt.tu.crossing.crySL.impl.CrySLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Use Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Block</em>'.
   * @generated
   */
  UseBlock createUseBlock();

  /**
   * Returns a new object of class '<em>Forbidden Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forbidden Block</em>'.
   * @generated
   */
  ForbiddenBlock createForbiddenBlock();

  /**
   * Returns a new object of class '<em>Required Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Block</em>'.
   * @generated
   */
  RequiredBlock createRequiredBlock();

  /**
   * Returns a new object of class '<em>Enforce Cons Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enforce Cons Block</em>'.
   * @generated
   */
  EnforceConsBlock createEnforceConsBlock();

  /**
   * Returns a new object of class '<em>Requires Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires Block</em>'.
   * @generated
   */
  RequiresBlock createRequiresBlock();

  /**
   * Returns a new object of class '<em>Ensures Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ensures Block</em>'.
   * @generated
   */
  EnsuresBlock createEnsuresBlock();

  /**
   * Returns a new object of class '<em>Destroys Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Destroys Block</em>'.
   * @generated
   */
  DestroysBlock createDestroysBlock();

  /**
   * Returns a new object of class '<em>Object Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Decl</em>'.
   * @generated
   */
  ObjectDecl createObjectDecl();

  /**
   * Returns a new object of class '<em>Jvm Parameterized Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Parameterized Type Ref</em>'.
   * @generated
   */
  JvmParameterizedTypeRef createJvmParameterizedTypeRef();

  /**
   * Returns a new object of class '<em>Jvm Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Type Reference</em>'.
   * @generated
   */
  JvmTypeReference createJvmTypeReference();

  /**
   * Returns a new object of class '<em>Jvm Wildcard Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Wildcard Type Ref</em>'.
   * @generated
   */
  JvmWildcardTypeRef createJvmWildcardTypeRef();

  /**
   * Returns a new object of class '<em>Forb Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forb Method</em>'.
   * @generated
   */
  ForbMethod createForbMethod();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Super Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super Type</em>'.
   * @generated
   */
  SuperType createSuperType();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Par List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par List</em>'.
   * @generated
   */
  ParList createParList();

  /**
   * Returns a new object of class '<em>Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par</em>'.
   * @generated
   */
  Par createPar();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Logical Imply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Imply</em>'.
   * @generated
   */
  LogicalImply createLogicalImply();

  /**
   * Returns a new object of class '<em>Logical Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Operator</em>'.
   * @generated
   */
  LogicalOperator createLogicalOperator();

  /**
   * Returns a new object of class '<em>Comparing Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparing Operator</em>'.
   * @generated
   */
  ComparingOperator createComparingOperator();

  /**
   * Returns a new object of class '<em>Arithmetic Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Operator</em>'.
   * @generated
   */
  ArithmeticOperator createArithmeticOperator();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  LiteralExpression createLiteralExpression();

  /**
   * Returns a new object of class '<em>Pre Defined Predicates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Defined Predicates</em>'.
   * @generated
   */
  PreDefinedPredicates createPreDefinedPredicates();

  /**
   * Returns a new object of class '<em>Jvm Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Type</em>'.
   * @generated
   */
  JvmType createJvmType();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Unary Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operator</em>'.
   * @generated
   */
  UnaryOperator createUnaryOperator();

  /**
   * Returns a new object of class '<em>Array Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Elements</em>'.
   * @generated
   */
  ArrayElements createArrayElements();

  /**
   * Returns a new object of class '<em>Lit List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lit List</em>'.
   * @generated
   */
  LitList createLitList();

  /**
   * Returns a new object of class '<em>Pred</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred</em>'.
   * @generated
   */
  Pred createPred();

  /**
   * Returns a new object of class '<em>Req Pred</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Pred</em>'.
   * @generated
   */
  ReqPred createReqPred();

  /**
   * Returns a new object of class '<em>Pred Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pred Lit</em>'.
   * @generated
   */
  PredLit createPredLit();

  /**
   * Returns a new object of class '<em>Su Par List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Su Par List</em>'.
   * @generated
   */
  SuParList createSuParList();

  /**
   * Returns a new object of class '<em>Su Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Su Par</em>'.
   * @generated
   */
  SuPar createSuPar();

  /**
   * Returns a new object of class '<em>Jvm Wildcard Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Wildcard Type Reference</em>'.
   * @generated
   */
  JvmWildcardTypeReference createJvmWildcardTypeReference();

  /**
   * Returns a new object of class '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate</em>'.
   * @generated
   */
  Aggregate createAggregate();

  /**
   * Returns a new object of class '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order</em>'.
   * @generated
   */
  Order createOrder();

  /**
   * Returns a new object of class '<em>Simple Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Order</em>'.
   * @generated
   */
  SimpleOrder createSimpleOrder();

  /**
   * Returns a new object of class '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Expression</em>'.
   * @generated
   */
  ComparisonExpression createComparisonExpression();

  /**
   * Returns a new object of class '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Expression</em>'.
   * @generated
   */
  ArithmeticExpression createArithmeticExpression();

  /**
   * Returns a new object of class '<em>Unary Pre Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Pre Expression</em>'.
   * @generated
   */
  UnaryPreExpression createUnaryPreExpression();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CrySLPackage getCrySLPackage();

} //CrySLFactory
