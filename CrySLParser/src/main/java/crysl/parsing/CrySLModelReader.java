package crysl.parsing;

import com.google.inject.Injector;
import crysl.rule.CrySLArithmeticConstraint;
import crysl.rule.CrySLComparisonConstraint;
import crysl.rule.CrySLCondPredicate;
import crysl.rule.CrySLConstraint;
import crysl.rule.CrySLForbiddenMethod;
import crysl.rule.CrySLMethod;
import crysl.rule.CrySLObject;
import crysl.rule.CrySLPredicate;
import crysl.rule.CrySLRule;
import crysl.rule.CrySLSplitter;
import crysl.rule.CrySLValueConstraint;
import crysl.rule.ICrySLPredicateParameter;
import crysl.rule.ISLConstraint;
import crysl.rule.StateMachineGraph;
import crysl.rule.StateNode;
import crysl.rule.TransitionEdge;
import de.darmstadt.tu.crossing.CrySLStandaloneSetup;
import de.darmstadt.tu.crossing.crySL.AlternativeRequiredPredicates;
import de.darmstadt.tu.crossing.crySL.BuiltinPredicate;
import de.darmstadt.tu.crossing.crySL.ConditionalPredicate;
import de.darmstadt.tu.crossing.crySL.Constraint;
import de.darmstadt.tu.crossing.crySL.ConstraintsBlock;
import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.crySL.EnsuresBlock;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.EventsBlock;
import de.darmstadt.tu.crossing.crySL.ForbiddenBlock;
import de.darmstadt.tu.crossing.crySL.ForbiddenMethod;
import de.darmstadt.tu.crossing.crySL.LabeledMethodCall;
import de.darmstadt.tu.crossing.crySL.Literal;
import de.darmstadt.tu.crossing.crySL.LiteralExpression;
import de.darmstadt.tu.crossing.crySL.LiteralList;
import de.darmstadt.tu.crossing.crySL.NegatesBlock;
import de.darmstadt.tu.crossing.crySL.ObjectExpression;
import de.darmstadt.tu.crossing.crySL.ObjectOperation;
import de.darmstadt.tu.crossing.crySL.ObjectReference;
import de.darmstadt.tu.crossing.crySL.ObjectsBlock;
import de.darmstadt.tu.crossing.crySL.Operator;
import de.darmstadt.tu.crossing.crySL.Order;
import de.darmstadt.tu.crossing.crySL.OrderBlock;
import de.darmstadt.tu.crossing.crySL.Predicate;
import de.darmstadt.tu.crossing.crySL.PredicateParameter;
import de.darmstadt.tu.crossing.crySL.RequiredPredicate;
import de.darmstadt.tu.crossing.crySL.RequiresBlock;
import de.darmstadt.tu.crossing.crySL.ThisPredicateParameter;
import de.darmstadt.tu.crossing.crySL.TimedPredicate;
import de.darmstadt.tu.crossing.crySL.WildcardPredicateParameter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrySLModelReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrySLModelReader.class);

    private StateMachineGraph smg = null;
    private JvmTypeReference currentClass;
    private final XtextResourceSet resourceSet;
    private final Injector injector;
    public static final String cryslFileEnding = ".crysl";

    private static final String THIS = "this";
    private static final String NULL = "null";
    private static final String UNDERSCORE = "_";

    /** Creates a CrySLModelReader which creates rules from classes on the run time's classpath. */
    public CrySLModelReader() {
        this(CrySLModelReaderClassPath.JAVA_CLASS_PATH);
    }

    /**
     * Creates a CrySLModelReader which creates rules from classes on the run time's classpath and a
     * given virtual classpath.
     *
     * @param classPath Contains additional classpath elements which are not present on the current
     *     run time's classpath.
     */
    public CrySLModelReader(CrySLModelReaderClassPath classPath) {
        CrySLStandaloneSetup crySLStandaloneSetup = new CrySLStandaloneSetup();
        this.injector = crySLStandaloneSetup.createInjectorAndDoEMFRegistration();
        this.resourceSet = injector.getInstance(XtextResourceSet.class);
        URL[] classpath = classPath.getClassPath();
        URLClassLoader ucl = new URLClassLoader(classpath);
        this.resourceSet.setClasspathURIContext(new URLClassLoader(classpath));
        new ClasspathTypeProvider(ucl, this.resourceSet, null, null);
    }

    /**
     * Reads the content of a CrySL file from an {@link InputStream}, afterward the {@link
     * CrySLRule} will be created.
     *
     * @param stream the {@link InputStream} holds the CrySL file content
     * @param virtualFileName the name needs following structure
     *     [HexHashedAbsoluteZipFilePath][SystemFileSeparator][ZipEntryName]
     * @return the {@link CrySLRule}
     * @throws IllegalArgumentException If the file for the rule cannot be found
     * @throws IOException If there is a problem with reading the file
     * @throws CrySLParserException If the file is not a .crysl file
     */
    public CrySLRule readRule(InputStream stream, String virtualFileName)
            throws IOException, CrySLParserException {
        if (!virtualFileName.endsWith(cryslFileEnding)) {
            throw new CrySLParserException(
                    "The extension of " + virtualFileName + " does not match " + cryslFileEnding);
        }

        URI uri = URI.createURI(virtualFileName);
        Resource resource = resourceSet.getURIResourceMap().get(uri);

        if (resource == null) {
            resource = resourceSet.createResource(uri);
            resource.load(stream, Collections.EMPTY_MAP);
        }

        return createRuleFromResource(resource);
    }

    /**
     * Reads the content of a CrySL file and returns a {@link CrySLRule} object.
     *
     * @param ruleFile the CrySL file
     * @return the {@link CrySLRule} object
     * @throws CrySLParserException If the file is not a .crysl file
     */
    public CrySLRule readRule(File ruleFile) throws CrySLParserException {
        Resource resource =
                resourceSet.getResource(URI.createFileURI(ruleFile.getAbsolutePath()), true);

        return createRuleFromResource(resource);
    }

    private boolean runValidator(Resource resource) {
        Severity report = Severity.WARNING;
        IResourceValidator validator = injector.getInstance(IResourceValidator.class);
        Collection<Issue> issues =
                validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
        boolean errorFound = false;

        for (Issue issue : issues) {
            switch (issue.getSeverity()) {
                case ERROR:
                    if (report.compareTo(issue.getSeverity()) >= 0)
                        LOGGER.error(
                                "{}:{}: {}",
                                resource.getURI(),
                                issue.getLineNumber(),
                                issue.getMessage());
                    errorFound = true;
                    break;
                case WARNING:
                    if (report.compareTo(issue.getSeverity()) >= 0)
                        LOGGER.warn(
                                "{}:{}: {}",
                                resource.getURI(),
                                issue.getLineNumber(),
                                issue.getMessage());
                    errorFound = true;
                    break;
                case INFO:
                    if (report.compareTo(issue.getSeverity()) >= 0)
                        LOGGER.info(
                                "{}:{}: {}",
                                resource.getURI(),
                                issue.getLineNumber(),
                                issue.getMessage());
                    break;
                case IGNORE:
                    break;
            }
        }
        return errorFound;
    }

    private CrySLRule createRuleFromResource(Resource resource) throws CrySLParserException {
        if (resource == null) {
            throw new CrySLParserException(
                    "Internal error creating a CrySL rule: 'resource parameter was null'.");
        }

        if (runValidator(resource)) {
            throw new CrySLParserException(
                    "Skipping rule since it contains errors: " + resource.getURI());
        }

        try {
            return createRuleFromDomainModel((Domainmodel) resource.getContents().get(0));
        } catch (Exception e) {
            throw new CrySLParserException(
                    "An error occurred while reading the rule " + resource.getURI());
        }
    }

    private CrySLRule createRuleFromDomainModel(Domainmodel model) throws CrySLParserException {
        this.currentClass = model.getJavaType();
        String currentClass = this.currentClass.getQualifiedName();

        if (currentClass.equals("void")) {
            throw new CrySLParserException("Class for the rule is not on the classpath.");
        }

        final Collection<Map.Entry<String, String>> objects = getObjects(model.getObjects());

        Collection<CrySLForbiddenMethod> forbiddenMethods =
                getForbiddenMethods(model.getForbidden());

        final EventsBlock eventsBlock = model.getEvents();
        final OrderBlock orderBlock = model.getOrder();
        final Collection<Event> events = changeDeclaringClass(this.currentClass, eventsBlock);
        final Order order = orderBlock == null ? null : orderBlock.getOrder();
        this.smg = StateMachineGraphBuilder.buildSMG(order, events);

        Collection<ISLConstraint> constraints = getConstraints(model.getConstraints());
        Collection<ISLConstraint> requiredPredicates = getRequiredPredicates(model.getRequires());

        // Since 3.0.0: All sections are optional
        final Collection<CrySLMethod> eventMethods = new HashSet<>();
        if (eventsBlock != null) {
            eventMethods.addAll(CrySLReaderUtils.resolveEventsToCryslMethods(events));
            constraints.addAll(ExceptionsReader.getExceptionConstraints(eventsBlock));
        }

        final EnsuresBlock ensuresBlock = model.getEnsures();
        final NegatesBlock negatesBlock = model.getNegates();

        final Collection<CrySLPredicate> predicates =
                new ArrayList<>(getEnsuredPredicates(ensuresBlock));
        final Collection<CrySLPredicate> negatedPredicates =
                new ArrayList<>(getNegatedPredicates(negatesBlock));

        return new CrySLRule(
                currentClass,
                objects,
                forbiddenMethods,
                eventMethods,
                this.smg,
                constraints,
                requiredPredicates,
                predicates,
                negatedPredicates);
    }

    private Collection<Event> changeDeclaringClass(
            JvmTypeReference currentClass, EventsBlock eventsBlock) {
        if (eventsBlock == null) {
            return Collections.emptyList();
        }

        return eventsBlock.getEvents().stream()
                .map(
                        event ->
                                event instanceof LabeledMethodCall
                                        ? changeDeclaringClass(
                                                currentClass, (LabeledMethodCall) event)
                                        : event)
                .collect(Collectors.toList());
    }

    private Event changeDeclaringClass(JvmTypeReference currentClass, LabeledMethodCall event) {
        event.getMethod().getMethod().setDeclaringType((JvmDeclaredType) currentClass.getType());
        return event;
    }

    private Collection<Map.Entry<String, String>> getObjects(final ObjectsBlock objects) {
        if (objects == null) {
            return Collections.emptyList();
        }
        return objects.getDeclarations().parallelStream()
                .map(CrySLReaderUtils::resolveObject)
                .collect(Collectors.toList());
    }

    private Collection<CrySLForbiddenMethod> getForbiddenMethods(final ForbiddenBlock forbidden) {
        if (forbidden == null) {
            return Collections.emptyList();
        }

        Collection<CrySLForbiddenMethod> forbiddenMethods = new ArrayList<>();

        for (final ForbiddenMethod method : forbidden.getForbiddenMethods()) {
            CrySLMethod cryslMethod = CrySLReaderUtils.toCrySLMethod(method);
            Collection<CrySLMethod> alternatives =
                    CrySLReaderUtils.resolveEventToCryslMethods(method.getReplacement());
            forbiddenMethods.add(new CrySLForbiddenMethod(cryslMethod, alternatives));
        }
        return forbiddenMethods;
    }

    private Collection<CrySLPredicate> getEnsuredPredicates(final EnsuresBlock ensures) {
        if (ensures == null) {
            return Collections.emptyList();
        }

        return getTimedPredicates(ensures.getEnsuredPredicates(), false);
    }

    private Collection<CrySLPredicate> getNegatedPredicates(final NegatesBlock negates) {
        if (negates == null) {
            return Collections.emptyList();
        }
        return getTimedPredicates(negates.getNegatedPredicates(), true);
    }

    private Collection<CrySLPredicate> getTimedPredicates(
            final Collection<? extends TimedPredicate> timedPredicates, boolean negate) {
        Collection<CrySLPredicate> predicates = new ArrayList<>(timedPredicates.size());

        for (final TimedPredicate timed : timedPredicates) {
            Predicate predicate = timed.getPredicate();
            ISLConstraint constraint = getPredicateCondition(timed);
            List<ICrySLPredicateParameter> parameters = resolvePredicateParameters(predicate);
            String name = predicate.getName();

            if (timed.getAfter() == null) {
                predicates.add(new CrySLPredicate(null, name, parameters, negate, constraint));
            } else {
                Collection<StateNode> nodes =
                        getStatesForMethods(
                                CrySLReaderUtils.resolveEventToCryslMethods(timed.getAfter()));
                predicates.add(
                        new CrySLCondPredicate(null, name, parameters, negate, nodes, constraint));
            }
        }
        return predicates;
    }

    private List<ICrySLPredicateParameter> resolvePredicateParameters(Predicate predicate) {
        final List<ICrySLPredicateParameter> parameters =
                new ArrayList<>(predicate.getParameters().size());

        for (PredicateParameter parameter : predicate.getParameters()) {
            if (parameter instanceof WildcardPredicateParameter) {
                parameters.add(new CrySLObject(UNDERSCORE, NULL));
            } else if (parameter instanceof ThisPredicateParameter) {
                parameters.add(new CrySLObject(THIS, this.currentClass.getQualifiedName()));
            } else {
                parameters.add(getObjectExpressionValue(parameter.getValue()));
            }
        }
        return parameters;
    }

    private CrySLObject getObjectExpressionValue(ObjectExpression expression) {
        if (expression instanceof ObjectReference) {
            return getObjectExpressionValue((ObjectReference) expression);
        }
        if (expression instanceof ObjectOperation) {
            return getObjectExpressionValue((ObjectOperation) expression);
        }
        return null;
    }

    private CrySLObject getObjectExpressionValue(ObjectReference reference) {
        return CrySLReaderUtils.toCrySLObject(reference.getObject());
    }

    private CrySLObject getObjectExpressionValue(ObjectOperation operation) {
        String type = operation.getObject().getType().getQualifiedName();
        String name = operation.getObject().getName();
        switch (operation.getFn()) {
            case ALG:
                return new CrySLObject(name, type, new CrySLSplitter(0, "/"));
            case MODE:
                return new CrySLObject(name, type, new CrySLSplitter(1, "/"));
            case PAD:
                return new CrySLObject(name, type, new CrySLSplitter(2, "/"));
            case PART:
                int index = Integer.parseInt(operation.getIndex());
                String split = operation.getSplit();
                return new CrySLObject(name, type, new CrySLSplitter(index, split));
            case ELEMENTS: // It does basically nothing
                return CrySLReaderUtils.toCrySLObject(operation.getObject());
            default:
                return null;
        }
    }

    private ISLConstraint getPredicateCondition(ConditionalPredicate predicate) {
        EObject condition = predicate.getCondition();
        if (condition instanceof Constraint) {
            return getConstraint((Constraint) condition);
        }
        if (condition instanceof Predicate) {
            return getPredicate((Predicate) condition);
        }
        return null;
    }

    private CrySLPredicate getPredicate(Predicate predicate) {
        return getPredicate(predicate, false, null);
    }

    private CrySLPredicate getPredicate(
            Predicate predicate, boolean negate, ISLConstraint constraint) {
        final List<ICrySLPredicateParameter> variables = resolvePredicateParameters(predicate);
        return new CrySLPredicate(null, predicate.getName(), variables, negate, constraint);
    }

    private Collection<ISLConstraint> getRequiredPredicates(RequiresBlock requiresBlock) {
        if (requiresBlock == null) {
            return Collections.emptyList();
        }

        final Collection<ISLConstraint> predicates = new ArrayList<>();
        final Collection<AlternativeRequiredPredicates> requiredPredicates =
                requiresBlock.getRequiredPredicates();

        for (AlternativeRequiredPredicates alternativePredicates : requiredPredicates) {
            List<CrySLPredicate> alternatives =
                    alternativePredicates.getAlternatives().parallelStream()
                            .map(this::getRequiredPredicate)
                            .collect(Collectors.toList());
            ISLConstraint predicate = alternatives.get(0);

            for (int i = 1; i < alternatives.size(); i++)
                predicate =
                        new CrySLConstraint(
                                alternatives.get(i), predicate, CrySLConstraint.LogOps.or);
            predicates.add(predicate);
        }
        return predicates;
    }

    private CrySLPredicate getRequiredPredicate(RequiredPredicate predicate) {
        ISLConstraint constraint = getPredicateCondition(predicate);
        boolean negate = predicate.isNegated();
        return getPredicate(predicate.getPredicate(), negate, constraint);
    }

    private Collection<ISLConstraint> getConstraints(ConstraintsBlock constraintsBlock) {
        if (constraintsBlock == null) {
            return Collections.emptyList();
        }
        return constraintsBlock.getConstraints().parallelStream()
                .map(this::getConstraint)
                .collect(Collectors.toList());
    }

    private ISLConstraint getConstraint(final Constraint constraint) {

        if (constraint instanceof LiteralExpression) {
            return getLiteralExpression((LiteralExpression) constraint);
        }

        switch (constraint.getOp()) {
            /* Logical Expressions */
            case NOT:
                // NOT operator was only implemented for Predicates, which were
                // not reachable from the Constraint rule.
                // Add it to LogOps?
                throw new UnsupportedOperationException("The NOT operator is not implemented.");
            case IMPLY:
            case OR:
            case AND:
                {
                    ISLConstraint left = getConstraint(constraint.getLeft());
                    ISLConstraint right = getConstraint(constraint.getRight());
                    CrySLConstraint.LogOps logOp =
                            CrySLReaderUtils.logOpFromOperator(constraint.getOp()).get();
                    return new CrySLConstraint(left, right, logOp);
                }
            /* Comparison Expressions */
            case EQUAL: // LogOps specifies eq as well, but it was not used
            case UNEQUAL:
            case GREATER:
            case GREATER_OR_EQUAL:
            case LESS:
            case LESS_OR_EQUAL:
                {
                    CrySLComparisonConstraint.CompOp compOp =
                            CrySLReaderUtils.compOpFromOperator(constraint.getOp()).get();
                    CrySLArithmeticConstraint left =
                            coerceConstraintToArithmeticConstraint(
                                    getConstraint(constraint.getLeft()));
                    CrySLArithmeticConstraint right =
                            coerceConstraintToArithmeticConstraint(
                                    getConstraint(constraint.getRight()));
                    return new CrySLComparisonConstraint(left, right, compOp);
                }
            /* Arithmetic Expressions */
            case TIMES:
            case DIVIDE:
                // These were specified in Syntax, but not implemented here.
                // Add it to ArithOp?
                throw new UnsupportedOperationException(
                        "The multiplication operators are not implemented.");
            case PLUS:
            case MINUS:
            case MODULO:
                {
                    ISLConstraint left = getConstraint(constraint.getLeft());
                    ISLConstraint right = getConstraint(constraint.getRight());
                    CrySLArithmeticConstraint.ArithOp arithOp =
                            CrySLReaderUtils.arithOpFromOperator(constraint.getOp()).get();
                    return new CrySLArithmeticConstraint(left, right, arithOp);
                }
            /* In Expression */
            case IN:
                {
                    CrySLObject left =
                            constraint.getLeft() instanceof ObjectExpression
                                    ? getObjectExpressionValue(
                                            (ObjectExpression) constraint.getLeft())
                                    : constraint.getLeft() instanceof Literal
                                            ? CrySLReaderUtils.toCrySLObject(
                                                    (Literal) constraint.getLeft())
                                            : null;
                    if (left == null)
                        throw new IllegalArgumentException(
                                "lhs of an IN expression must be an Object or an Operation thereon.");
                    LiteralList right = (LiteralList) constraint.getRight();
                    List<String> values =
                            right.getElements().stream()
                                    .map(Literal::getValue)
                                    .collect(Collectors.toList());
                    return new CrySLValueConstraint(left, values);
                }
        }
        return null;
    }

    private CrySLArithmeticConstraint coerceConstraintToArithmeticConstraint(
            ISLConstraint constraint) {
        if (constraint instanceof CrySLArithmeticConstraint) {
            return (CrySLArithmeticConstraint) constraint;
        }
        if (constraint instanceof CrySLPredicate) {
            return makeArithmeticConstraint(constraint);
        }
        throw new ClassCastException(
                "Cant coerce `" + constraint.toString() + "` into ArithmeticExpression");
    }

    private ISLConstraint getLiteralExpression(LiteralExpression expression) {
        if (expression instanceof BuiltinPredicate) {
            return getBuiltinPredicate((BuiltinPredicate) expression);
        }
        if (expression instanceof Literal) {
            return makeConstraintFromObject(CrySLReaderUtils.toCrySLObject((Literal) expression));
        }
        if (expression instanceof ObjectExpression) {
            return makeConstraintFromObject(
                    getObjectExpressionValue((ObjectExpression) expression));
        }
        return null;
    }

    /** This is weird, but is taken from the original implementation. */
    private ISLConstraint makeConstraintFromObject(ICrySLPredicateParameter object) {
        return makeArithmeticConstraint(object);
    }

    private CrySLArithmeticConstraint makeArithmeticConstraint(ICrySLPredicateParameter object) {
        CrySLObject zero = new CrySLObject("0", "int");
        CrySLArithmeticConstraint.ArithOp plus =
                CrySLReaderUtils.arithOpFromOperator(Operator.PLUS).get();
        return new CrySLArithmeticConstraint(object, zero, plus);
    }

    private Collection<StateNode> getStatesForMethods(final Collection<CrySLMethod> condition) {
        final Collection<StateNode> predicateGenerationNodes = new HashSet<>();
        if (condition.isEmpty()) {
            return predicateGenerationNodes;
        }

        for (final TransitionEdge transition : this.smg.getAllTransitions()) {
            if (transition.getLabel().containsAll(condition)) {
                Collection<StateNode> reachableNodes =
                        getAllReachableNodes(transition.getRight(), new HashSet<>());

                predicateGenerationNodes.addAll(reachableNodes);
            }
        }
        return predicateGenerationNodes;
    }

    private Collection<StateNode> getAllReachableNodes(
            final StateNode startNode, Collection<StateNode> visited) {
        if (visited.contains(startNode)) {
            return visited;
        }

        visited.add(startNode);

        for (TransitionEdge edge : this.smg.getAllOutgoingEdges(startNode)) {
            Collection<StateNode> reachableNodes = getAllReachableNodes(edge.getRight(), visited);

            visited.addAll(reachableNodes);
        }
        return visited;
    }

    private ISLConstraint getBuiltinPredicate(BuiltinPredicate builtinPredicate) {
        String name = builtinPredicate.getPredicate().getLiteral();
        List<ICrySLPredicateParameter> parameters;
        boolean negated = false;

        switch (builtinPredicate.getPredicate()) {
            case NO_CALL_TO:
            case CALL_TO:
                parameters =
                        CrySLReaderUtils.resolveEventToPredicateParameters(
                                builtinPredicate.getEvent());
                break;

            case INSTANCE_OF:
            case NEVER_TYPE_OF:
                parameters =
                        List.of(
                                CrySLReaderUtils.toCrySLObject(builtinPredicate.getObject()),
                                new CrySLObject(
                                        NULL, builtinPredicate.getType().getQualifiedName()));
                break;

            case NOT_HARD_CODED:
            case LENGTH:
                CrySLObject object = CrySLReaderUtils.toCrySLObject(builtinPredicate.getObject());
                parameters = Collections.singletonList(object);
                break;
            default:
                parameters = Collections.emptyList();
        }
        return new CrySLPredicate(null, name, parameters, negated);
    }
}
