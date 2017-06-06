/*
 * generated by Xtext 2.12.0
 */
package de.darmstadt.tu.crossing.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.darmstadt.tu.crossing.ide.contentassist.antlr.internal.InternalCryptSLParser;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CryptSLParser extends AbstractContentAssistParser {

	@Inject
	private CryptSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCryptSLParser createParser() {
		InternalCryptSLParser result = new InternalCryptSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
					put(grammarAccess.getParAccess().getAlternatives_1(), "rule__Par__Alternatives_1");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getPrimaryAccess().getElementopAlternatives_0_1_0(), "rule__Primary__ElementopAlternatives_0_1_0");
					put(grammarAccess.getPrimaryAccess().getElementopAlternatives_1_3_0(), "rule__Primary__ElementopAlternatives_1_3_0");
					put(grammarAccess.getComparingRelOperatorAccess().getAlternatives(), "rule__ComparingRelOperator__Alternatives");
					put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
					put(grammarAccess.getMultiplicationExpressionAccess().getAlternatives(), "rule__MultiplicationExpression__Alternatives");
					put(grammarAccess.getMultiplicationOperatorAccess().getAlternatives(), "rule__MultiplicationOperator__Alternatives");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getValAlternatives_1_0(), "rule__Literal__ValAlternatives_1_0");
					put(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives(), "rule__ComparingEQNEQOperator__Alternatives");
					put(grammarAccess.getConsAccess().getAlternatives(), "rule__Cons__Alternatives");
					put(grammarAccess.getConsPredAccess().getAlternatives(), "rule__ConsPred__Alternatives");
					put(grammarAccess.getLitListAccess().getAlternatives_1_1(), "rule__LitList__Alternatives_1_1");
					put(grammarAccess.getSuParAccess().getAlternatives_1(), "rule__SuPar__Alternatives_1");
					put(grammarAccess.getJvmTypeReferenceAccess().getAlternatives(), "rule__JvmTypeReference__Alternatives");
					put(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives(), "rule__JvmArgumentTypeReference__Alternatives");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2(), "rule__JvmWildcardTypeReference__Alternatives_2");
					put(grammarAccess.getXImportDeclarationAccess().getAlternatives_1(), "rule__XImportDeclaration__Alternatives_1");
					put(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3(), "rule__XImportDeclaration__Alternatives_1_0_3");
					put(grammarAccess.getDomainmodelAccess().getGroup(), "rule__Domainmodel__Group__0");
					put(grammarAccess.getDomainmodelAccess().getGroup_4(), "rule__Domainmodel__Group_4__0");
					put(grammarAccess.getDomainmodelAccess().getGroup_11(), "rule__Domainmodel__Group_11__0");
					put(grammarAccess.getObjectDeclAccess().getGroup(), "rule__ObjectDecl__Group__0");
					put(grammarAccess.getForbMethodAccess().getGroup(), "rule__ForbMethod__Group__0");
					put(grammarAccess.getForbMethodAccess().getGroup_0(), "rule__ForbMethod__Group_0__0");
					put(grammarAccess.getForbMethodAccess().getGroup_0_1(), "rule__ForbMethod__Group_0_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_2(), "rule__FQN__Group_2__0");
					put(grammarAccess.getFQNAccess().getGroup_2_1(), "rule__FQN__Group_2_1__0");
					put(grammarAccess.getQNAccess().getGroup(), "rule__QN__Group__0");
					put(grammarAccess.getQNAccess().getGroup_1(), "rule__QN__Group_1__0");
					put(grammarAccess.getLabelMethodCallAccess().getGroup(), "rule__LabelMethodCall__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_0(), "rule__Method__Group_0__0");
					put(grammarAccess.getParListAccess().getGroup(), "rule__ParList__Group__0");
					put(grammarAccess.getParListAccess().getGroup_1(), "rule__ParList__Group_1__0");
					put(grammarAccess.getParAccess().getGroup(), "rule__Par__Group__0");
					put(grammarAccess.getAggregateAccess().getGroup(), "rule__Aggregate__Group__0");
					put(grammarAccess.getAggregateAccess().getGroup_1(), "rule__Aggregate__Group_1__0");
					put(grammarAccess.getAggregateAccess().getGroup_1_2(), "rule__Aggregate__Group_1_2__0");
					put(grammarAccess.getAggregateAccess().getGroup_1_2_1(), "rule__Aggregate__Group_1_2_1__0");
					put(grammarAccess.getOrderAccess().getGroup(), "rule__Order__Group__0");
					put(grammarAccess.getOrderAccess().getGroup_1(), "rule__Order__Group_1__0");
					put(grammarAccess.getSimpleOrderAccess().getGroup(), "rule__SimpleOrder__Group__0");
					put(grammarAccess.getSimpleOrderAccess().getGroup_1(), "rule__SimpleOrder__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getLogicalImplyExpressionAccess().getGroup(), "rule__LogicalImplyExpression__Group__0");
					put(grammarAccess.getLogicalImplyExpressionAccess().getGroup_1(), "rule__LogicalImplyExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup(), "rule__ComparisonHigherOpExpression__Group__0");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1(), "rule__ComparisonHigherOpExpression__Group_1__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup(), "rule__AdditionExpression__Group__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup_1(), "rule__AdditionExpression__Group_1__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1(), "rule__MultiplicationExpression__Group_1__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1(), "rule__MultiplicationExpression__Group_1_1__0");
					put(grammarAccess.getUnaryPreExpressionAccess().getGroup(), "rule__UnaryPreExpression__Group__0");
					put(grammarAccess.getUnaryPreExpressionAccess().getGroup_1(), "rule__UnaryPreExpression__Group_1__0");
					put(grammarAccess.getOperandAccess().getGroup_0(), "rule__Operand__Group_0__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup_2(), "rule__LiteralExpression__Group_2__0");
					put(grammarAccess.getAggregateExpressionAccess().getGroup(), "rule__AggregateExpression__Group__0");
					put(grammarAccess.getAggregateExpressionAccess().getGroup_1(), "rule__AggregateExpression__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup(), "rule__Literal__Group__0");
					put(grammarAccess.getConsAccess().getGroup_0(), "rule__Cons__Group_0__0");
					put(grammarAccess.getConsPredAccess().getGroup_0(), "rule__ConsPred__Group_0__0");
					put(grammarAccess.getLitListAccess().getGroup(), "rule__LitList__Group__0");
					put(grammarAccess.getLitListAccess().getGroup_1(), "rule__LitList__Group_1__0");
					put(grammarAccess.getPredAccess().getGroup(), "rule__Pred__Group__0");
					put(grammarAccess.getSuParListAccess().getGroup(), "rule__SuParList__Group__0");
					put(grammarAccess.getSuParListAccess().getGroup_1(), "rule__SuParList__Group_1__0");
					put(grammarAccess.getSuParAccess().getGroup(), "rule__SuPar__Group__0");
					put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0(), "rule__JvmTypeReference__Group_0__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1(), "rule__JvmTypeReference__Group_0_1__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0(), "rule__JvmTypeReference__Group_0_1_0__0");
					put(grammarAccess.getArrayBracketsAccess().getGroup(), "rule__ArrayBrackets__Group__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup(), "rule__XFunctionTypeRef__Group__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0(), "rule__XFunctionTypeRef__Group_0__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1(), "rule__XFunctionTypeRef__Group_0_1__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1(), "rule__XFunctionTypeRef__Group_0_1_1__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup(), "rule__JvmParameterizedTypeReference__Group__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1(), "rule__JvmParameterizedTypeReference__Group_1__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2(), "rule__JvmParameterizedTypeReference__Group_1_2__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4(), "rule__JvmParameterizedTypeReference__Group_1_4__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0(), "rule__JvmParameterizedTypeReference__Group_1_4_0__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0(), "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2(), "rule__JvmParameterizedTypeReference__Group_1_4_2__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2(), "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup(), "rule__JvmWildcardTypeReference__Group__0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0(), "rule__JvmWildcardTypeReference__Group_2_0__0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1(), "rule__JvmWildcardTypeReference__Group_2_1__0");
					put(grammarAccess.getJvmUpperBoundAccess().getGroup(), "rule__JvmUpperBound__Group__0");
					put(grammarAccess.getJvmUpperBoundAndedAccess().getGroup(), "rule__JvmUpperBoundAnded__Group__0");
					put(grammarAccess.getJvmLowerBoundAccess().getGroup(), "rule__JvmLowerBound__Group__0");
					put(grammarAccess.getJvmLowerBoundAndedAccess().getGroup(), "rule__JvmLowerBoundAnded__Group__0");
					put(grammarAccess.getJvmTypeParameterAccess().getGroup(), "rule__JvmTypeParameter__Group__0");
					put(grammarAccess.getJvmTypeParameterAccess().getGroup_1(), "rule__JvmTypeParameter__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getXImportDeclarationAccess().getGroup(), "rule__XImportDeclaration__Group__0");
					put(grammarAccess.getXImportDeclarationAccess().getGroup_1_0(), "rule__XImportDeclaration__Group_1_0__0");
					put(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup(), "rule__QualifiedNameInStaticImport__Group__0");
					put(grammarAccess.getDomainmodelAccess().getJavaTypeAssignment_1(), "rule__Domainmodel__JavaTypeAssignment_1");
					put(grammarAccess.getDomainmodelAccess().getObjectAssignment_3(), "rule__Domainmodel__ObjectAssignment_3");
					put(grammarAccess.getDomainmodelAccess().getMethodAssignment_4_1(), "rule__Domainmodel__MethodAssignment_4_1");
					put(grammarAccess.getDomainmodelAccess().getEventAssignment_6(), "rule__Domainmodel__EventAssignment_6");
					put(grammarAccess.getDomainmodelAccess().getOrderAssignment_8(), "rule__Domainmodel__OrderAssignment_8");
					put(grammarAccess.getDomainmodelAccess().getReqAssignment_10(), "rule__Domainmodel__ReqAssignment_10");
					put(grammarAccess.getDomainmodelAccess().getEnsAssignment_11_1(), "rule__Domainmodel__EnsAssignment_11_1");
					put(grammarAccess.getObjectDeclAccess().getObjectTypeAssignment_0(), "rule__ObjectDecl__ObjectTypeAssignment_0");
					put(grammarAccess.getObjectDeclAccess().getArrayAssignment_1(), "rule__ObjectDecl__ArrayAssignment_1");
					put(grammarAccess.getObjectDeclAccess().getObjectNameAssignment_2(), "rule__ObjectDecl__ObjectNameAssignment_2");
					put(grammarAccess.getForbMethodAccess().getJavaMethAssignment_0_0(), "rule__ForbMethod__JavaMethAssignment_0_0");
					put(grammarAccess.getForbMethodAccess().getRepAssignment_0_1_1(), "rule__ForbMethod__RepAssignment_0_1_1");
					put(grammarAccess.getLabelMethodCallAccess().getNameAssignment_0(), "rule__LabelMethodCall__NameAssignment_0");
					put(grammarAccess.getLabelMethodCallAccess().getMethAssignment_2(), "rule__LabelMethodCall__MethAssignment_2");
					put(grammarAccess.getMethodAccess().getLeftSideAssignment_0_0(), "rule__Method__LeftSideAssignment_0_0");
					put(grammarAccess.getMethodAccess().getMethNameAssignment_1(), "rule__Method__MethNameAssignment_1");
					put(grammarAccess.getMethodAccess().getParListAssignment_3(), "rule__Method__ParListAssignment_3");
					put(grammarAccess.getParListAccess().getParametersAssignment_0(), "rule__ParList__ParametersAssignment_0");
					put(grammarAccess.getParListAccess().getParametersAssignment_1_1(), "rule__ParList__ParametersAssignment_1_1");
					put(grammarAccess.getParAccess().getValAssignment_1_0(), "rule__Par__ValAssignment_1_0");
					put(grammarAccess.getAggregateAccess().getNameAssignment_1_0(), "rule__Aggregate__NameAssignment_1_0");
					put(grammarAccess.getAggregateAccess().getLabAssignment_1_2_0(), "rule__Aggregate__LabAssignment_1_2_0");
					put(grammarAccess.getAggregateAccess().getLabAssignment_1_2_1_1(), "rule__Aggregate__LabAssignment_1_2_1_1");
					put(grammarAccess.getOrderAccess().getOrderopAssignment_1_1(), "rule__Order__OrderopAssignment_1_1");
					put(grammarAccess.getOrderAccess().getRightAssignment_1_2(), "rule__Order__RightAssignment_1_2");
					put(grammarAccess.getSimpleOrderAccess().getOrderopAssignment_1_1(), "rule__SimpleOrder__OrderopAssignment_1_1");
					put(grammarAccess.getSimpleOrderAccess().getRightAssignment_1_2(), "rule__SimpleOrder__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getOrderEvAssignment_0_0(), "rule__Primary__OrderEvAssignment_0_0");
					put(grammarAccess.getPrimaryAccess().getElementopAssignment_0_1(), "rule__Primary__ElementopAssignment_0_1");
					put(grammarAccess.getPrimaryAccess().getElementopAssignment_1_3(), "rule__Primary__ElementopAssignment_1_3");
					put(grammarAccess.getLogicalImplyExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalImplyExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalImplyExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalImplyExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getLogicalImplyAccess().getIMPLIESAssignment(), "rule__LogicalImply__IMPLIESAssignment");
					put(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalOrExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalOrExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getLogicalOrAccess().getORAssignment(), "rule__LogicalOr__ORAssignment");
					put(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalAndExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalAndExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getLogicalAndAccess().getANDAssignment(), "rule__LogicalAnd__ANDAssignment");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparingRelOperatorAccess().getLESSAssignment_0(), "rule__ComparingRelOperator__LESSAssignment_0");
					put(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALAssignment_1(), "rule__ComparingRelOperator__LESS_OR_EQUALAssignment_1");
					put(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALAssignment_2(), "rule__ComparingRelOperator__GREATER_OR_EQUALAssignment_2");
					put(grammarAccess.getComparingRelOperatorAccess().getGREATERAssignment_3(), "rule__ComparingRelOperator__GREATERAssignment_3");
					put(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditionExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AdditionExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getAdditionOperatorAccess().getPLUSAssignment_0(), "rule__AdditionOperator__PLUSAssignment_0");
					put(grammarAccess.getAdditionOperatorAccess().getMINUSAssignment_1(), "rule__AdditionOperator__MINUSAssignment_1");
					put(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1(), "rule__MultiplicationExpression__OperatorAssignment_1_1_1");
					put(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2(), "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2");
					put(grammarAccess.getMultiplicationOperatorAccess().getTIMESAssignment_0(), "rule__MultiplicationOperator__TIMESAssignment_0");
					put(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEAssignment_1(), "rule__MultiplicationOperator__DIVIDEAssignment_1");
					put(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1_0(), "rule__UnaryPreExpression__OperatorAssignment_1_0");
					put(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_1_1(), "rule__UnaryPreExpression__EnclosedExpressionAssignment_1_1");
					put(grammarAccess.getLiteralExpressionAccess().getNameAssignment_0(), "rule__LiteralExpression__NameAssignment_0");
					put(grammarAccess.getLiteralExpressionAccess().getNameAssignment_1(), "rule__LiteralExpression__NameAssignment_1");
					put(grammarAccess.getLiteralExpressionAccess().getObjAssignment_2_1(), "rule__LiteralExpression__ObjAssignment_2_1");
					put(grammarAccess.getLiteralExpressionAccess().getTypeAssignment_2_3(), "rule__LiteralExpression__TypeAssignment_2_3");
					put(grammarAccess.getAggregateExpressionAccess().getValueAssignment_0(), "rule__AggregateExpression__ValueAssignment_0");
					put(grammarAccess.getLiteralAccess().getValAssignment_1(), "rule__Literal__ValAssignment_1");
					put(grammarAccess.getUnaryPreOperatorAccess().getNOTAssignment(), "rule__UnaryPreOperator__NOTAssignment");
					put(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALAssignment_0(), "rule__ComparingEQNEQOperator__EQUALAssignment_0");
					put(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALAssignment_1(), "rule__ComparingEQNEQOperator__UNEQUALAssignment_1");
					put(grammarAccess.getConsAccess().getConsAssignment_0_0(), "rule__Cons__ConsAssignment_0_0");
					put(grammarAccess.getConsAccess().getLitsleftAssignment_0_3(), "rule__Cons__LitsleftAssignment_0_3");
					put(grammarAccess.getConsAccess().getConsAssignment_1(), "rule__Cons__ConsAssignment_1");
					put(grammarAccess.getLitListAccess().getParametersAssignment_0(), "rule__LitList__ParametersAssignment_0");
					put(grammarAccess.getLitListAccess().getParametersAssignment_1_1_0(), "rule__LitList__ParametersAssignment_1_1_0");
					put(grammarAccess.getPredAccess().getPredNameAssignment_0(), "rule__Pred__PredNameAssignment_0");
					put(grammarAccess.getPredAccess().getParListAssignment_2(), "rule__Pred__ParListAssignment_2");
					put(grammarAccess.getSuParListAccess().getParametersAssignment_0(), "rule__SuParList__ParametersAssignment_0");
					put(grammarAccess.getSuParListAccess().getParametersAssignment_1_1(), "rule__SuParList__ParametersAssignment_1_1");
					put(grammarAccess.getSuParAccess().getValAssignment_1_0(), "rule__SuPar__ValAssignment_1_0");
					put(grammarAccess.getObjectAccess().getNameAssignment_1(), "rule__Object__NameAssignment_1");
					put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0");
					put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1");
					put(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2(), "rule__XFunctionTypeRef__ReturnTypeAssignment_2");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0(), "rule__JvmParameterizedTypeReference__TypeAssignment_0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1(), "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1");
					put(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBound__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmLowerBound__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1(), "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmTypeParameterAccess().getNameAssignment_0(), "rule__JvmTypeParameter__NameAssignment_0");
					put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_0(), "rule__JvmTypeParameter__ConstraintsAssignment_1_0");
					put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_1(), "rule__JvmTypeParameter__ConstraintsAssignment_1_1");
					put(grammarAccess.getXImportSectionAccess().getImportDeclarationsAssignment(), "rule__XImportSection__ImportDeclarationsAssignment");
					put(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0(), "rule__XImportDeclaration__StaticAssignment_1_0_0");
					put(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1(), "rule__XImportDeclaration__ExtensionAssignment_1_0_1");
					put(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2(), "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2");
					put(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0(), "rule__XImportDeclaration__WildcardAssignment_1_0_3_0");
					put(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1(), "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1");
					put(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1(), "rule__XImportDeclaration__ImportedTypeAssignment_1_1");
					put(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2(), "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CryptSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CryptSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
