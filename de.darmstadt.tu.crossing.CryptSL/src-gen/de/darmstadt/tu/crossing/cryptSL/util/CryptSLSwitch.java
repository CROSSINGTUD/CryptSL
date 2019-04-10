/**
 * generated by Xtext 2.17.1
 */
package de.darmstadt.tu.crossing.cryptSL.util;

import de.darmstadt.tu.crossing.cryptSL.Aggregate;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticExpression;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticOperator;
import de.darmstadt.tu.crossing.cryptSL.ArrayElements;
import de.darmstadt.tu.crossing.cryptSL.ComparingOperator;
import de.darmstadt.tu.crossing.cryptSL.ComparisonExpression;
import de.darmstadt.tu.crossing.cryptSL.Constraint;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.DestroysBlock;
import de.darmstadt.tu.crossing.cryptSL.Domainmodel;
import de.darmstadt.tu.crossing.cryptSL.EnforceConsBlock;
import de.darmstadt.tu.crossing.cryptSL.EnsuresBlock;
import de.darmstadt.tu.crossing.cryptSL.Event;
import de.darmstadt.tu.crossing.cryptSL.Expression;
import de.darmstadt.tu.crossing.cryptSL.ForbMethod;
import de.darmstadt.tu.crossing.cryptSL.ForbiddenBlock;
import de.darmstadt.tu.crossing.cryptSL.LitList;
import de.darmstadt.tu.crossing.cryptSL.Literal;
import de.darmstadt.tu.crossing.cryptSL.LiteralExpression;
import de.darmstadt.tu.crossing.cryptSL.LogicalImply;
import de.darmstadt.tu.crossing.cryptSL.LogicalOperator;
import de.darmstadt.tu.crossing.cryptSL.Method;
import de.darmstadt.tu.crossing.cryptSL.ObjectDecl;
import de.darmstadt.tu.crossing.cryptSL.Order;
import de.darmstadt.tu.crossing.cryptSL.Par;
import de.darmstadt.tu.crossing.cryptSL.ParList;
import de.darmstadt.tu.crossing.cryptSL.PreDefinedPredicates;
import de.darmstadt.tu.crossing.cryptSL.Pred;
import de.darmstadt.tu.crossing.cryptSL.ReqPred;
import de.darmstadt.tu.crossing.cryptSL.RequiredBlock;
import de.darmstadt.tu.crossing.cryptSL.RequiresBlock;
import de.darmstadt.tu.crossing.cryptSL.SimpleOrder;
import de.darmstadt.tu.crossing.cryptSL.SuPar;
import de.darmstadt.tu.crossing.cryptSL.SuParList;
import de.darmstadt.tu.crossing.cryptSL.SuperType;
import de.darmstadt.tu.crossing.cryptSL.UnaryOperator;
import de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression;
import de.darmstadt.tu.crossing.cryptSL.UseBlock;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.darmstadt.tu.crossing.cryptSL.CryptSLPackage
 * @generated
 */
public class CryptSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CryptSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CryptSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CryptSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CryptSLPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.USE_BLOCK:
      {
        UseBlock useBlock = (UseBlock)theEObject;
        T result = caseUseBlock(useBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.FORBIDDEN_BLOCK:
      {
        ForbiddenBlock forbiddenBlock = (ForbiddenBlock)theEObject;
        T result = caseForbiddenBlock(forbiddenBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.REQUIRED_BLOCK:
      {
        RequiredBlock requiredBlock = (RequiredBlock)theEObject;
        T result = caseRequiredBlock(requiredBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ENFORCE_CONS_BLOCK:
      {
        EnforceConsBlock enforceConsBlock = (EnforceConsBlock)theEObject;
        T result = caseEnforceConsBlock(enforceConsBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.REQUIRES_BLOCK:
      {
        RequiresBlock requiresBlock = (RequiresBlock)theEObject;
        T result = caseRequiresBlock(requiresBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ENSURES_BLOCK:
      {
        EnsuresBlock ensuresBlock = (EnsuresBlock)theEObject;
        T result = caseEnsuresBlock(ensuresBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.DESTROYS_BLOCK:
      {
        DestroysBlock destroysBlock = (DestroysBlock)theEObject;
        T result = caseDestroysBlock(destroysBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.OBJECT_DECL:
      {
        ObjectDecl objectDecl = (ObjectDecl)theEObject;
        T result = caseObjectDecl(objectDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.FORB_METHOD:
      {
        ForbMethod forbMethod = (ForbMethod)theEObject;
        T result = caseForbMethod(forbMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.SUPER_TYPE:
      {
        SuperType superType = (SuperType)theEObject;
        T result = caseSuperType(superType);
        if (result == null) result = caseEvent(superType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.PAR_LIST:
      {
        ParList parList = (ParList)theEObject;
        T result = caseParList(parList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.PAR:
      {
        Par par = (Par)theEObject;
        T result = casePar(par);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.LOGICAL_IMPLY:
      {
        LogicalImply logicalImply = (LogicalImply)theEObject;
        T result = caseLogicalImply(logicalImply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.LOGICAL_OPERATOR:
      {
        LogicalOperator logicalOperator = (LogicalOperator)theEObject;
        T result = caseLogicalOperator(logicalOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.COMPARING_OPERATOR:
      {
        ComparingOperator comparingOperator = (ComparingOperator)theEObject;
        T result = caseComparingOperator(comparingOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ARITHMETIC_OPERATOR:
      {
        ArithmeticOperator arithmeticOperator = (ArithmeticOperator)theEObject;
        T result = caseArithmeticOperator(arithmeticOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = caseConstraint(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.PRE_DEFINED_PREDICATES:
      {
        PreDefinedPredicates preDefinedPredicates = (PreDefinedPredicates)theEObject;
        T result = casePreDefinedPredicates(preDefinedPredicates);
        if (result == null) result = caseLiteralExpression(preDefinedPredicates);
        if (result == null) result = caseConstraint(preDefinedPredicates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.UNARY_OPERATOR:
      {
        UnaryOperator unaryOperator = (UnaryOperator)theEObject;
        T result = caseUnaryOperator(unaryOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ARRAY_ELEMENTS:
      {
        ArrayElements arrayElements = (ArrayElements)theEObject;
        T result = caseArrayElements(arrayElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.LIT_LIST:
      {
        LitList litList = (LitList)theEObject;
        T result = caseLitList(litList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.PRED:
      {
        Pred pred = (Pred)theEObject;
        T result = casePred(pred);
        if (result == null) result = caseConstraint(pred);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.REQ_PRED:
      {
        ReqPred reqPred = (ReqPred)theEObject;
        T result = caseReqPred(reqPred);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.SU_PAR_LIST:
      {
        SuParList suParList = (SuParList)theEObject;
        T result = caseSuParList(suParList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.SU_PAR:
      {
        SuPar suPar = (SuPar)theEObject;
        T result = caseSuPar(suPar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.AGGREGATE:
      {
        Aggregate aggregate = (Aggregate)theEObject;
        T result = caseAggregate(aggregate);
        if (result == null) result = caseSuperType(aggregate);
        if (result == null) result = caseEvent(aggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ORDER:
      {
        Order order = (Order)theEObject;
        T result = caseOrder(order);
        if (result == null) result = caseExpression(order);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.SIMPLE_ORDER:
      {
        SimpleOrder simpleOrder = (SimpleOrder)theEObject;
        T result = caseSimpleOrder(simpleOrder);
        if (result == null) result = caseExpression(simpleOrder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseConstraint(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.ARITHMETIC_EXPRESSION:
      {
        ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
        T result = caseArithmeticExpression(arithmeticExpression);
        if (result == null) result = caseConstraint(arithmeticExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.UNARY_PRE_EXPRESSION:
      {
        UnaryPreExpression unaryPreExpression = (UnaryPreExpression)theEObject;
        T result = caseUnaryPreExpression(unaryPreExpression);
        if (result == null) result = caseConstraint(unaryPreExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CryptSLPackage.OBJECT:
      {
        de.darmstadt.tu.crossing.cryptSL.Object object = (de.darmstadt.tu.crossing.cryptSL.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseSuperType(object);
        if (result == null) result = caseEvent(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseBlock(UseBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forbidden Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forbidden Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForbiddenBlock(ForbiddenBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredBlock(RequiredBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enforce Cons Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enforce Cons Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnforceConsBlock(EnforceConsBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiresBlock(RequiresBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ensures Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ensures Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnsuresBlock(EnsuresBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destroys Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destroys Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestroysBlock(DestroysBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectDecl(ObjectDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forb Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forb Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForbMethod(ForbMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperType(SuperType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParList(ParList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePar(Par object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Imply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Imply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalImply(LogicalImply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalOperator(LogicalOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparing Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparing Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparingOperator(ComparingOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticOperator(ArithmeticOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Defined Predicates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Defined Predicates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreDefinedPredicates(PreDefinedPredicates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOperator(UnaryOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayElements(ArrayElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lit List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lit List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLitList(LitList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePred(Pred object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Req Pred</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Req Pred</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReqPred(ReqPred object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Su Par List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Su Par List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuParList(SuParList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Su Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Su Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuPar(SuPar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregate(Aggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrder(Order object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Order</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Order</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleOrder(SimpleOrder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticExpression(ArithmeticExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Pre Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Pre Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryPreExpression(UnaryPreExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(de.darmstadt.tu.crossing.cryptSL.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CryptSLSwitch
