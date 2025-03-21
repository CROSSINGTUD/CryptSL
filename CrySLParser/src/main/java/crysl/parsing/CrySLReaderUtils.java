package crysl.parsing;

import crysl.rule.CrySLArithmeticConstraint;
import crysl.rule.CrySLComparisonConstraint;
import crysl.rule.CrySLConstraint;
import crysl.rule.CrySLException;
import crysl.rule.CrySLMethod;
import crysl.rule.CrySLObject;
import crysl.rule.ICrySLPredicateParameter;
import de.darmstadt.tu.crossing.crySL.Aggregate;
import de.darmstadt.tu.crossing.crySL.AnyParameterType;
import de.darmstadt.tu.crossing.crySL.BooleanLiteral;
import de.darmstadt.tu.crossing.crySL.Constraint;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.Exception;
import de.darmstadt.tu.crossing.crySL.ExceptionAggregate;
import de.darmstadt.tu.crossing.crySL.ExceptionDeclaration;
import de.darmstadt.tu.crossing.crySL.ForbiddenMethod;
import de.darmstadt.tu.crossing.crySL.IntLiteral;
import de.darmstadt.tu.crossing.crySL.LabeledMethodCall;
import de.darmstadt.tu.crossing.crySL.Literal;
import de.darmstadt.tu.crossing.crySL.Method;
import de.darmstadt.tu.crossing.crySL.Object;
import de.darmstadt.tu.crossing.crySL.Operator;
import de.darmstadt.tu.crossing.crySL.StringLiteral;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.xtext.common.types.JvmTypeParameter;

public class CrySLReaderUtils {

    public static Collection<CrySLMethod> resolveEventToCryslMethods(final Event event) {
        return resolveEventToCryslMethodsStream(event).collect(Collectors.toList());
    }

    public static List<ICrySLPredicateParameter> resolveEventToPredicateParameters(
            final Event event) {
        return resolveEventToCryslMethodsStream(event).collect(Collectors.toList());
    }

    public static Collection<CrySLMethod> resolveEventsToCryslMethods(
            final Collection<Event> events) {
        return resolveEventsToCryslMethodsStream(events).collect(Collectors.toList());
    }

    public static Stream<CrySLMethod> resolveEventsToCryslMethodsStream(
            final Collection<Event> events) {
        return events.parallelStream().flatMap(CrySLReaderUtils::resolveEventToCryslMethodsStream);
    }

    public static Stream<CrySLMethod> resolveEventToCryslMethodsStream(final Event event) {
        if (event instanceof Aggregate) return resolveEventToCryslMethodsStream((Aggregate) event);
        if (event instanceof LabeledMethodCall)
            return resolveEventToCryslMethodsStream((LabeledMethodCall) event);
        return Stream.empty();
    }

    protected static Stream<CrySLMethod> resolveEventToCryslMethodsStream(
            final Aggregate aggregate) {
        return aggregate.getEvents().parallelStream()
                .flatMap(CrySLReaderUtils::resolveEventToCryslMethodsStream);
    }

    protected static Stream<CrySLMethod> resolveEventToCryslMethodsStream(
            final LabeledMethodCall event) {
        return Stream.of(toCrySLMethod((event.getMethod())));
    }

    public static CrySLMethod toCrySLMethod(final ForbiddenMethod method) {
        String name = method.getMethod().getQualifiedName();
        String declaringClassType = method.getMethod().getDeclaringType().getQualifiedName();
        List<Map.Entry<String, String>> parameters =
                method.getParameters().stream()
                        .map(
                                parameter ->
                                        new SimpleEntry<>(
                                                parameter.getSimpleName(),
                                                parameter.getType().getQualifiedName()))
                        .collect(Collectors.toList());
        return new CrySLMethod(name, declaringClassType, parameters, resolveObject(null));
    }

    public static CrySLMethod toCrySLMethod(final Method method) {
        String name = method.getMethod().getQualifiedName();
        String declaringClassType = method.getMethod().getDeclaringType().getQualifiedName();
        List<Map.Entry<String, String>> parameters =
                method.getParameters().stream()
                        .map(
                                parameter ->
                                        parameter instanceof AnyParameterType
                                                ? new SimpleEntry<>(
                                                        CrySLMethod.NO_NAME, CrySLMethod.ANY_TYPE)
                                                : resolveObject((parameter.getValue())))
                        .collect(Collectors.toList());
        return new CrySLMethod(
                name, declaringClassType, parameters, resolveObject(method.getReturn()));
    }

    public static CrySLObject toCrySLObject(Object object) {
        return new CrySLObject(object.getName(), object.getType().getQualifiedName());
    }

    public static CrySLObject toCrySLObject(Literal literal) {
        String value = literal.getValue();
        String type =
                literal instanceof IntLiteral
                        ? "int"
                        : literal instanceof BooleanLiteral
                                ? "boolean"
                                : literal instanceof StringLiteral
                                        ? String.class.getName()
                                        : "void";
        return new CrySLObject(value, type);
    }

    public static Stream<CrySLException> resolveExceptionsStream(final Exception exception) {
        if (exception instanceof ExceptionDeclaration)
            return resolveExceptionsStream((ExceptionDeclaration) exception);
        if (exception instanceof ExceptionAggregate)
            return resolveExceptionsStream((ExceptionAggregate) exception);
        return Stream.empty();
    }

    protected static Stream<CrySLException> resolveExceptionsStream(
            final ExceptionAggregate exception) {
        return exception.getExceptions().stream()
                .flatMap(CrySLReaderUtils::resolveExceptionsStream);
    }

    protected static Stream<CrySLException> resolveExceptionsStream(
            final ExceptionDeclaration exception) {
        return Stream.of(toCrySLException(exception));
    }

    public static CrySLException toCrySLException(final ExceptionDeclaration exception) {
        return new CrySLException(exception.getException().getIdentifier());
    }

    public static Map.Entry<String, String> resolveObject(final Object o) {
        if (o == null) {
            return new SimpleEntry<>(CrySLMethod.NO_NAME, CrySLMethod.VOID);
        }

        if (o.getType().getType() instanceof JvmTypeParameter) {
            return new SimpleEntry<>(o.getName(), "java.lang.Object");
        } else {
            return new SimpleEntry<>(o.getName(), o.getType().getQualifiedName());
        }
    }

    public static Optional<CrySLArithmeticConstraint.ArithOp> arithOpFromOperator(
            Operator operator) {
        switch (operator) {
            case PLUS:
                return Optional.of(CrySLArithmeticConstraint.ArithOp.p);
            // case TIMES: return Optional.of(ArithOp.t); /* Only in Syntax yet */
            // case DIVIDE: return Optional.of(ArithOp.g); /* Only in Syntax yet */
            case MINUS:
                return Optional.of(CrySLArithmeticConstraint.ArithOp.n);
            case MODULO:
                return Optional.of(CrySLArithmeticConstraint.ArithOp.m);
            default:
                return Optional.empty();
        }
    }

    public static Optional<CrySLConstraint.LogOps> logOpFromOperator(Operator operator) {
        switch (operator) {
            case AND:
                return Optional.of(CrySLConstraint.LogOps.and);
            case OR:
                return Optional.of(CrySLConstraint.LogOps.or);
            case IMPLY:
                return Optional.of(CrySLConstraint.LogOps.implies);
            // case NOT: return Optional.of(LogOps.not); /* Only in Syntax yet */
            // case EQUAL: return Optional.of(LogOps.eq); /* unused enum item */
            default:
                return Optional.empty();
        }
    }

    public static Optional<CrySLComparisonConstraint.CompOp> compOpFromOperator(Operator operator) {
        switch (operator) {
            case EQUAL:
                return Optional.of(CrySLComparisonConstraint.CompOp.eq);
            case UNEQUAL:
                return Optional.of(CrySLComparisonConstraint.CompOp.neq);
            case LESS:
                return Optional.of(CrySLComparisonConstraint.CompOp.l);
            case LESS_OR_EQUAL:
                return Optional.of(CrySLComparisonConstraint.CompOp.le);
            case GREATER:
                return Optional.of(CrySLComparisonConstraint.CompOp.g);
            case GREATER_OR_EQUAL:
                return Optional.of(CrySLComparisonConstraint.CompOp.ge);
            default:
                return Optional.empty();
        }
    }

    public static boolean isArithmeticExpression(Constraint constraint) {
        return arithOpFromOperator(constraint.getOp()).isPresent();
    }

    public static boolean isLogicExpression(Constraint constraint) {
        return logOpFromOperator(constraint.getOp()).isPresent();
    }

    public static boolean isComparisonExpression(Constraint constraint) {
        return compOpFromOperator(constraint.getOp()).isPresent();
    }
}
