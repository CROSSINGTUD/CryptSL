package crysl.rule;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class CrySLCondPredicate extends CrySLPredicate {

    private final Collection<CrySLMethod> conditionalEvents;
    private final Collection<StateNode> conditionalNodes;

    public CrySLCondPredicate(
            ICrySLPredicateParameter baseObj,
            String name,
            List<ICrySLPredicateParameter> parameters,
            Boolean negated,
            Collection<CrySLMethod> conditionalEvents,
            Collection<StateNode> nodes) {
        this(baseObj, name, parameters, negated, conditionalEvents, nodes, null);
    }

    public CrySLCondPredicate(
            ICrySLPredicateParameter baseObj,
            String name,
            List<ICrySLPredicateParameter> parameters,
            Boolean negated,
            Collection<CrySLMethod> conditionalEvents,
            Collection<StateNode> nodes,
            ISLConstraint constraint) {
        super(baseObj, name, parameters, negated, constraint);

        this.conditionalEvents = conditionalEvents;
        this.conditionalNodes = nodes;
    }

    public Collection<CrySLMethod> getConditionalEvents() {
        return conditionalEvents;
    }

    public Collection<StateNode> getConditionalNodes() {
        return conditionalNodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CrySLCondPredicate that = (CrySLCondPredicate) o;
        return Objects.equals(conditionalEvents, that.conditionalEvents)
                && Objects.equals(conditionalNodes, that.conditionalNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conditionalEvents, conditionalNodes);
    }

    @Override
    public String toString() {
        return super.toString() + " after " + conditionalEvents + " (" + conditionalNodes + ")";
    }
}
