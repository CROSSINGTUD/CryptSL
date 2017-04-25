/*
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.serializer;

import com.google.inject.Inject;
import de.darmstadt.tu.crossing.cryptSL.Aggegate;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticExpression;
import de.darmstadt.tu.crossing.cryptSL.ArithmeticOperator;
import de.darmstadt.tu.crossing.cryptSL.ComparingOperator;
import de.darmstadt.tu.crossing.cryptSL.ComparisonExpression;
import de.darmstadt.tu.crossing.cryptSL.Constraint;
import de.darmstadt.tu.crossing.cryptSL.CryptSLPackage;
import de.darmstadt.tu.crossing.cryptSL.Domainmodel;
import de.darmstadt.tu.crossing.cryptSL.Expression;
import de.darmstadt.tu.crossing.cryptSL.ForbMethod;
import de.darmstadt.tu.crossing.cryptSL.LabelMethodCall;
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
import de.darmstadt.tu.crossing.cryptSL.SimpleOrder;
import de.darmstadt.tu.crossing.cryptSL.SuPar;
import de.darmstadt.tu.crossing.cryptSL.SuParList;
import de.darmstadt.tu.crossing.cryptSL.UnaryOperator;
import de.darmstadt.tu.crossing.cryptSL.UnaryPreExpression;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.serializer.XtypeSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class CryptSLSemanticSequencer extends XtypeSemanticSequencer {

	@Inject
	private CryptSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CryptSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CryptSLPackage.AGGEGATE:
				sequence_Aggregate(context, (Aggegate) semanticObject); 
				return; 
			case CryptSLPackage.ARITHMETIC_EXPRESSION:
				sequence_AdditionExpression_MultiplicationExpression(context, (ArithmeticExpression) semanticObject); 
				return; 
			case CryptSLPackage.ARITHMETIC_OPERATOR:
				if (rule == grammarAccess.getAdditionOperatorRule()) {
					sequence_AdditionOperator(context, (ArithmeticOperator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiplicationOperatorRule()) {
					sequence_MultiplicationOperator(context, (ArithmeticOperator) semanticObject); 
					return; 
				}
				else break;
			case CryptSLPackage.COMPARING_OPERATOR:
				if (rule == grammarAccess.getComparingEQNEQOperatorRule()) {
					sequence_ComparingEQNEQOperator(context, (ComparingOperator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getComparingRelOperatorRule()) {
					sequence_ComparingRelOperator(context, (ComparingOperator) semanticObject); 
					return; 
				}
				else break;
			case CryptSLPackage.COMPARISON_EXPRESSION:
				sequence_ComparisonExpression_ComparisonHigherOpExpression(context, (ComparisonExpression) semanticObject); 
				return; 
			case CryptSLPackage.CONSTRAINT:
				if (rule == grammarAccess.getConstraintRule()
						|| rule == grammarAccess.getLogicalImplyExpressionRule()
						|| action == grammarAccess.getLogicalImplyExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getLogicalOrExpressionRule()
						|| action == grammarAccess.getLogicalOrExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getLogicalAndExpressionRule()
						|| action == grammarAccess.getLogicalAndExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getComparisonExpressionRule()
						|| action == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()
						|| rule == grammarAccess.getComparisonHigherOpExpressionRule()
						|| action == grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()
						|| rule == grammarAccess.getArithmeticExpressionRule()
						|| rule == grammarAccess.getAdditionExpressionRule()
						|| action == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()
						|| rule == grammarAccess.getMultiplicationExpressionRule()
						|| action == grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()
						|| rule == grammarAccess.getOperandRule()) {
					sequence_LogicalAndExpression_LogicalImplyExpression_LogicalOrExpression_Pred(context, (Constraint) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPredRule()) {
					sequence_Pred(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case CryptSLPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case CryptSLPackage.EXPRESSION:
				sequence_Primary(context, (Expression) semanticObject); 
				return; 
			case CryptSLPackage.FORB_METHOD:
				sequence_ForbMethod(context, (ForbMethod) semanticObject); 
				return; 
			case CryptSLPackage.LABEL_METHOD_CALL:
				sequence_LabelMethodCall(context, (LabelMethodCall) semanticObject); 
				return; 
			case CryptSLPackage.LIT_LIST:
				sequence_LitList(context, (LitList) semanticObject); 
				return; 
			case CryptSLPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case CryptSLPackage.LITERAL_EXPRESSION:
				if (rule == grammarAccess.getAggregateExpressionRule()) {
					sequence_AggregateExpression(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getConstraintRule()
						|| rule == grammarAccess.getLogicalImplyExpressionRule()
						|| action == grammarAccess.getLogicalImplyExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getLogicalOrExpressionRule()
						|| action == grammarAccess.getLogicalOrExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getLogicalAndExpressionRule()
						|| action == grammarAccess.getLogicalAndExpressionAccess().getConstraintLeftExpressionAction_1_0()
						|| rule == grammarAccess.getComparisonExpressionRule()
						|| action == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()
						|| rule == grammarAccess.getComparisonHigherOpExpressionRule()
						|| action == grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()
						|| rule == grammarAccess.getArithmeticExpressionRule()
						|| rule == grammarAccess.getAdditionExpressionRule()
						|| action == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()
						|| rule == grammarAccess.getMultiplicationExpressionRule()
						|| action == grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()
						|| rule == grammarAccess.getOperandRule()
						|| rule == grammarAccess.getConsRule()) {
					sequence_Cons(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLiteralExpressionRule()
						|| rule == grammarAccess.getConsPredRule()) {
					sequence_LiteralExpression(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case CryptSLPackage.LOGICAL_IMPLY:
				sequence_LogicalImply(context, (LogicalImply) semanticObject); 
				return; 
			case CryptSLPackage.LOGICAL_OPERATOR:
				if (rule == grammarAccess.getLogicalAndRule()) {
					sequence_LogicalAnd(context, (LogicalOperator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLogicalOrRule()) {
					sequence_LogicalOr(context, (LogicalOperator) semanticObject); 
					return; 
				}
				else break;
			case CryptSLPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case CryptSLPackage.OBJECT:
				sequence_Object(context, (de.darmstadt.tu.crossing.cryptSL.Object) semanticObject); 
				return; 
			case CryptSLPackage.OBJECT_DECL:
				sequence_ObjectDecl(context, (ObjectDecl) semanticObject); 
				return; 
			case CryptSLPackage.ORDER:
				sequence_Order_Primary(context, (Order) semanticObject); 
				return; 
			case CryptSLPackage.PAR:
				sequence_Par(context, (Par) semanticObject); 
				return; 
			case CryptSLPackage.PAR_LIST:
				sequence_ParList(context, (ParList) semanticObject); 
				return; 
			case CryptSLPackage.SIMPLE_ORDER:
				sequence_Primary_SimpleOrder(context, (SimpleOrder) semanticObject); 
				return; 
			case CryptSLPackage.SU_PAR:
				sequence_SuPar(context, (SuPar) semanticObject); 
				return; 
			case CryptSLPackage.SU_PAR_LIST:
				sequence_SuParList(context, (SuParList) semanticObject); 
				return; 
			case CryptSLPackage.UNARY_OPERATOR:
				sequence_UnaryPreOperator(context, (UnaryOperator) semanticObject); 
				return; 
			case CryptSLPackage.UNARY_PRE_EXPRESSION:
				sequence_UnaryPreExpression(context, (UnaryPreExpression) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Constraint returns ArithmeticExpression
	 *     LogicalImplyExpression returns ArithmeticExpression
	 *     LogicalImplyExpression.Constraint_1_0 returns ArithmeticExpression
	 *     LogicalOrExpression returns ArithmeticExpression
	 *     LogicalOrExpression.Constraint_1_0 returns ArithmeticExpression
	 *     LogicalAndExpression returns ArithmeticExpression
	 *     LogicalAndExpression.Constraint_1_0 returns ArithmeticExpression
	 *     ComparisonExpression returns ArithmeticExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns ArithmeticExpression
	 *     ComparisonHigherOpExpression returns ArithmeticExpression
	 *     ComparisonHigherOpExpression.ComparisonExpression_1_0 returns ArithmeticExpression
	 *     ArithmeticExpression returns ArithmeticExpression
	 *     AdditionExpression returns ArithmeticExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns ArithmeticExpression
	 *     MultiplicationExpression returns ArithmeticExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_1_0 returns ArithmeticExpression
	 *     Operand returns ArithmeticExpression
	 *
	 * Constraint:
	 *     (
	 *         (leftExpression=AdditionExpression_ArithmeticExpression_1_0 operator=AdditionOperator rightExpression=MultiplicationExpression) | 
	 *         (leftExpression=MultiplicationExpression_ArithmeticExpression_1_1_0 operator=MultiplicationOperator rightExpression=Operand)
	 *     )
	 */
	protected void sequence_AdditionExpression_MultiplicationExpression(ISerializationContext context, ArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionOperator returns ArithmeticOperator
	 *
	 * Constraint:
	 *     (PLUS='+' | MINUS='-')
	 */
	protected void sequence_AdditionOperator(ISerializationContext context, ArithmeticOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AggregateExpression returns LiteralExpression
	 *
	 * Constraint:
	 *     value=[SuperType|ID]
	 */
	protected void sequence_AggregateExpression(ISerializationContext context, LiteralExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.LITERAL_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.LITERAL_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAggregateExpressionAccess().getValueSuperTypeIDTerminalRuleCall_0_0_1(), semanticObject.eGet(CryptSLPackage.Literals.LITERAL_EXPRESSION__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Aggegate
	 *     Aggregate returns Aggegate
	 *
	 * Constraint:
	 *     (name=ID lab+=[Event|ID] lab+=[Event|ID]*)
	 */
	protected void sequence_Aggregate(ISerializationContext context, Aggegate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComparingEQNEQOperator returns ComparingOperator
	 *
	 * Constraint:
	 *     (EQUAL='==' | UNEQUAL='!=')
	 */
	protected void sequence_ComparingEQNEQOperator(ISerializationContext context, ComparingOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComparingRelOperator returns ComparingOperator
	 *
	 * Constraint:
	 *     (LESS='<' | LESS_OR_EQUAL='<=' | GREATER_OR_EQUAL='>=' | GREATER='>')
	 */
	protected void sequence_ComparingRelOperator(ISerializationContext context, ComparingOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns ComparisonExpression
	 *     LogicalImplyExpression returns ComparisonExpression
	 *     LogicalImplyExpression.Constraint_1_0 returns ComparisonExpression
	 *     LogicalOrExpression returns ComparisonExpression
	 *     LogicalOrExpression.Constraint_1_0 returns ComparisonExpression
	 *     LogicalAndExpression returns ComparisonExpression
	 *     LogicalAndExpression.Constraint_1_0 returns ComparisonExpression
	 *     ComparisonExpression returns ComparisonExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns ComparisonExpression
	 *     ComparisonHigherOpExpression returns ComparisonExpression
	 *     ComparisonHigherOpExpression.ComparisonExpression_1_0 returns ComparisonExpression
	 *     ArithmeticExpression returns ComparisonExpression
	 *     AdditionExpression returns ComparisonExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns ComparisonExpression
	 *     MultiplicationExpression returns ComparisonExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_1_0 returns ComparisonExpression
	 *     Operand returns ComparisonExpression
	 *
	 * Constraint:
	 *     (
	 *         (left=ComparisonExpression_ComparisonExpression_1_0 operator=ComparingEQNEQOperator rightExpression=ComparisonHigherOpExpression) | 
	 *         (leftExpression=ComparisonHigherOpExpression_ComparisonExpression_1_0 operator=ComparingRelOperator rightExpression=ArithmeticExpression)
	 *     )
	 */
	protected void sequence_ComparisonExpression_ComparisonHigherOpExpression(ISerializationContext context, ComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns LiteralExpression
	 *     LogicalImplyExpression returns LiteralExpression
	 *     LogicalImplyExpression.Constraint_1_0 returns LiteralExpression
	 *     LogicalOrExpression returns LiteralExpression
	 *     LogicalOrExpression.Constraint_1_0 returns LiteralExpression
	 *     LogicalAndExpression returns LiteralExpression
	 *     LogicalAndExpression.Constraint_1_0 returns LiteralExpression
	 *     ComparisonExpression returns LiteralExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns LiteralExpression
	 *     ComparisonHigherOpExpression returns LiteralExpression
	 *     ComparisonHigherOpExpression.ComparisonExpression_1_0 returns LiteralExpression
	 *     ArithmeticExpression returns LiteralExpression
	 *     AdditionExpression returns LiteralExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns LiteralExpression
	 *     MultiplicationExpression returns LiteralExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_1_0 returns LiteralExpression
	 *     Operand returns LiteralExpression
	 *     Cons returns LiteralExpression
	 *
	 * Constraint:
	 *     ((cons=ConsPred litsleft=LitList) | cons=LiteralExpression)
	 */
	protected void sequence_Cons(ISerializationContext context, LiteralExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     (
	 *         javaType=[JvmType|QualifiedName] 
	 *         object+=ObjectDecl+ 
	 *         method+=ForbMethod* 
	 *         event+=Event+ 
	 *         order=Order 
	 *         req+=Constraint* 
	 *         ens+=Pred*
	 *     )
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForbMethod returns ForbMethod
	 *
	 * Constraint:
	 *     (javaMeth=[JvmOperation|FQN] rep=[Event|ID]?)
	 */
	protected void sequence_ForbMethod(ISerializationContext context, ForbMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns LabelMethodCall
	 *     LabelMethodCall returns LabelMethodCall
	 *
	 * Constraint:
	 *     (name=ID meth=Method)
	 */
	protected void sequence_LabelMethodCall(ISerializationContext context, LabelMethodCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.EVENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.LABEL_METHOD_CALL__METH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.LABEL_METHOD_CALL__METH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelMethodCallAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLabelMethodCallAccess().getMethMethodParserRuleCall_2_0(), semanticObject.getMeth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LitList returns LitList
	 *
	 * Constraint:
	 *     (parameters+=Literal parameters+=Literal*)
	 */
	protected void sequence_LitList(ISerializationContext context, LitList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LiteralExpression returns LiteralExpression
	 *     ConsPred returns LiteralExpression
	 *
	 * Constraint:
	 *     (name=Literal | name=AggregateExpression | (obj+=[Object|ID] type=[JvmType|QualifiedName]))
	 */
	protected void sequence_LiteralExpression(ISerializationContext context, LiteralExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     {Literal}
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *     LogicalImplyExpression returns Constraint
	 *     LogicalImplyExpression.Constraint_1_0 returns Constraint
	 *     LogicalOrExpression returns Constraint
	 *     LogicalOrExpression.Constraint_1_0 returns Constraint
	 *     LogicalAndExpression returns Constraint
	 *     LogicalAndExpression.Constraint_1_0 returns Constraint
	 *     ComparisonExpression returns Constraint
	 *     ComparisonExpression.ComparisonExpression_1_0 returns Constraint
	 *     ComparisonHigherOpExpression returns Constraint
	 *     ComparisonHigherOpExpression.ComparisonExpression_1_0 returns Constraint
	 *     ArithmeticExpression returns Constraint
	 *     AdditionExpression returns Constraint
	 *     AdditionExpression.ArithmeticExpression_1_0 returns Constraint
	 *     MultiplicationExpression returns Constraint
	 *     MultiplicationExpression.ArithmeticExpression_1_1_0 returns Constraint
	 *     Operand returns Constraint
	 *
	 * Constraint:
	 *     (
	 *         (leftExpression=LogicalImplyExpression_Constraint_1_0 operator=LogicalImply rightExpression=LogicalOrExpression) | 
	 *         (leftExpression=LogicalOrExpression_Constraint_1_0 operator=LogicalOr rightExpression=LogicalAndExpression) | 
	 *         (leftExpression=LogicalAndExpression_Constraint_1_0 operator=LogicalAnd rightExpression=ComparisonExpression) | 
	 *         (predName=ID parList=SuParList?)
	 *     )
	 */
	protected void sequence_LogicalAndExpression_LogicalImplyExpression_LogicalOrExpression_Pred(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalAnd returns LogicalOperator
	 *
	 * Constraint:
	 *     AND='&&'
	 */
	protected void sequence_LogicalAnd(ISerializationContext context, LogicalOperator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.LOGICAL_OPERATOR__AND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.LOGICAL_OPERATOR__AND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicalAndAccess().getANDAmpersandAmpersandKeyword_0(), semanticObject.getAND());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LogicalImply returns LogicalImply
	 *
	 * Constraint:
	 *     IMPLIES='=>'
	 */
	protected void sequence_LogicalImply(ISerializationContext context, LogicalImply semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.LOGICAL_IMPLY__IMPLIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.LOGICAL_IMPLY__IMPLIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicalImplyAccess().getIMPLIESEqualsSignGreaterThanSignKeyword_0(), semanticObject.getIMPLIES());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LogicalOr returns LogicalOperator
	 *
	 * Constraint:
	 *     OR='||'
	 */
	protected void sequence_LogicalOr(ISerializationContext context, LogicalOperator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.LOGICAL_OPERATOR__OR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.LOGICAL_OPERATOR__OR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicalOrAccess().getORVerticalLineVerticalLineKeyword_0(), semanticObject.getOR());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (leftSide=[Object|ID]? methName=[JvmOperation|ID] parList=ParList?)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiplicationOperator returns ArithmeticOperator
	 *
	 * Constraint:
	 *     (TIMES='*' | DIVIDE='/')
	 */
	protected void sequence_MultiplicationOperator(ISerializationContext context, ArithmeticOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectDecl returns ObjectDecl
	 *
	 * Constraint:
	 *     (objectType=[JvmType|QualifiedName] objectName=Object)
	 */
	protected void sequence_ObjectDecl(ISerializationContext context, ObjectDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.OBJECT_DECL__OBJECT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.OBJECT_DECL__OBJECT_TYPE));
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.OBJECT_DECL__OBJECT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.OBJECT_DECL__OBJECT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectDeclAccess().getObjectTypeJvmTypeQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(CryptSLPackage.Literals.OBJECT_DECL__OBJECT_TYPE, false));
		feeder.accept(grammarAccess.getObjectDeclAccess().getObjectNameObjectParserRuleCall_2_0(), semanticObject.getObjectName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Object(ISerializationContext context, de.darmstadt.tu.crossing.cryptSL.Object semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.EVENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Order returns Order
	 *     Order.Order_1_0 returns Order
	 *     SimpleOrder returns Order
	 *     SimpleOrder.SimpleOrder_1_0 returns Order
	 *     Primary returns Order
	 *
	 * Constraint:
	 *     (left=Order_Order_1_0 orderop=',' right=SimpleOrder (elementop='+' | elementop='?' | elementop='*')*)
	 */
	protected void sequence_Order_Primary(ISerializationContext context, Order semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParList returns ParList
	 *
	 * Constraint:
	 *     (parameters+=Par parameters+=Par*)
	 */
	protected void sequence_ParList(ISerializationContext context, ParList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Par returns Par
	 *
	 * Constraint:
	 *     val=[Object|ID]?
	 */
	protected void sequence_Par(ISerializationContext context, Par semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pred returns Constraint
	 *
	 * Constraint:
	 *     (predName=ID parList=SuParList?)
	 */
	protected void sequence_Pred(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Order returns Expression
	 *     Order.Order_1_0 returns Expression
	 *     SimpleOrder returns Expression
	 *     SimpleOrder.SimpleOrder_1_0 returns Expression
	 *     Primary returns Expression
	 *
	 * Constraint:
	 *     (orderEv+=[Event|ID] (elementop='+' | elementop='?' | elementop='*')? elementop='+'? ((elementop='?' | elementop='*')? elementop='+'?)*)
	 */
	protected void sequence_Primary(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Order returns SimpleOrder
	 *     Order.Order_1_0 returns SimpleOrder
	 *     SimpleOrder returns SimpleOrder
	 *     SimpleOrder.SimpleOrder_1_0 returns SimpleOrder
	 *     Primary returns SimpleOrder
	 *
	 * Constraint:
	 *     (left=SimpleOrder_SimpleOrder_1_0 orderop='|' right=Primary (elementop='+' | elementop='?' | elementop='*')*)
	 */
	protected void sequence_Primary_SimpleOrder(ISerializationContext context, SimpleOrder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuParList returns SuParList
	 *
	 * Constraint:
	 *     (parameters+=SuPar parameters+=SuPar*)
	 */
	protected void sequence_SuParList(ISerializationContext context, SuParList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuPar returns SuPar
	 *
	 * Constraint:
	 *     val=ConsPred?
	 */
	protected void sequence_SuPar(ISerializationContext context, SuPar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns UnaryPreExpression
	 *     LogicalImplyExpression returns UnaryPreExpression
	 *     LogicalImplyExpression.Constraint_1_0 returns UnaryPreExpression
	 *     LogicalOrExpression returns UnaryPreExpression
	 *     LogicalOrExpression.Constraint_1_0 returns UnaryPreExpression
	 *     LogicalAndExpression returns UnaryPreExpression
	 *     LogicalAndExpression.Constraint_1_0 returns UnaryPreExpression
	 *     ComparisonExpression returns UnaryPreExpression
	 *     ComparisonExpression.ComparisonExpression_1_0 returns UnaryPreExpression
	 *     ComparisonHigherOpExpression returns UnaryPreExpression
	 *     ComparisonHigherOpExpression.ComparisonExpression_1_0 returns UnaryPreExpression
	 *     ArithmeticExpression returns UnaryPreExpression
	 *     AdditionExpression returns UnaryPreExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns UnaryPreExpression
	 *     MultiplicationExpression returns UnaryPreExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_1_0 returns UnaryPreExpression
	 *     UnaryPreExpression returns UnaryPreExpression
	 *     Operand returns UnaryPreExpression
	 *
	 * Constraint:
	 *     (operator=UnaryPreOperator enclosedExpression=Operand)
	 */
	protected void sequence_UnaryPreExpression(ISerializationContext context, UnaryPreExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.CONSTRAINT__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.CONSTRAINT__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.UNARY_PRE_EXPRESSION__ENCLOSED_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorParserRuleCall_1_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_1_0(), semanticObject.getEnclosedExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UnaryPreOperator returns UnaryOperator
	 *
	 * Constraint:
	 *     NOT='!'
	 */
	protected void sequence_UnaryPreOperator(ISerializationContext context, UnaryOperator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CryptSLPackage.Literals.UNARY_OPERATOR__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CryptSLPackage.Literals.UNARY_OPERATOR__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryPreOperatorAccess().getNOTExclamationMarkKeyword_0(), semanticObject.getNOT());
		feeder.finish();
	}
	
	
}
