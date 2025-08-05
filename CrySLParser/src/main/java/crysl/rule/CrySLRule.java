package crysl.rule;

import java.util.Collection;
import java.util.Map;

public class CrySLRule {

    private final String className;

    private final Collection<Map.Entry<String, String>> objects;

    private final Collection<CrySLForbiddenMethod> forbiddenMethods;

    private final Collection<CrySLMethod> events;

    private final StateMachineGraph usagePattern;

    private final Collection<ISLConstraint> constraints;

    private final Collection<ISLConstraint> requiredPredicates;

    private final Collection<CrySLPredicate> predicates;

    private final Collection<CrySLPredicate> negatedPredicates;

    private Collection<CrySLWeaknessEntry> cwes;

    private Collection<CrySLVulnerabilityEntry> cves;

    private final Collection<CrySLReferenceEntry> references;

    public CrySLRule(
            String className,
            Collection<Map.Entry<String, String>> objects,
            Collection<CrySLForbiddenMethod> forbiddenMethods,
            Collection<CrySLMethod> events,
            StateMachineGraph usagePattern,
            Collection<ISLConstraint> constraints,
            Collection<ISLConstraint> requiredPredicates,
            Collection<CrySLPredicate> predicates,
            Collection<CrySLPredicate> negatedPredicates,
            Collection<CrySLWeaknessEntry> cwes,
            Collection<CrySLVulnerabilityEntry> cves,
            Collection<CrySLReferenceEntry> references) {
        this.className = className;
        this.objects = objects;
        this.forbiddenMethods = forbiddenMethods;
        this.events = events;
        this.usagePattern = usagePattern;
        this.constraints = constraints;
        this.requiredPredicates = requiredPredicates;
        this.predicates = predicates;
        this.negatedPredicates = negatedPredicates;
        this.cwes = cwes;
        this.cves = cves;
        this.references = references;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CrySLRule) {
            return ((CrySLRule) obj).getClassName().equals(className);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * className.hashCode();
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @return the objects
     */
    public Collection<Map.Entry<String, String>> getObjects() {
        return objects;
    }

    /**
     * @return the forbiddenMethods
     */
    public Collection<CrySLForbiddenMethod> getForbiddenMethods() {
        return forbiddenMethods;
    }

    /**
     * @return the events
     */
    public Collection<CrySLMethod> getEvents() {
        return events;
    }

    /**
     * @return the usagePattern
     */
    public StateMachineGraph getUsagePattern() {
        return usagePattern;
    }

    /**
     * @return the constraints
     */
    public Collection<ISLConstraint> getConstraints() {
        return constraints;
    }

    /**
     * @return the predicates
     */
    public Collection<CrySLPredicate> getPredicates() {
        return predicates;
    }

    /**
     * @return the negated predicates
     */
    public Collection<CrySLPredicate> getNegatedPredicates() {
        return negatedPredicates;
    }

    /**
     * @return the constraints
     */
    public Collection<ISLConstraint> getRequiredPredicates() {
        return requiredPredicates;
    }

    public Collection<CrySLWeaknessEntry> getCwes() {
        return cwes;
    }

    public void setCwes(Collection<CrySLWeaknessEntry> cwes) {
        this.cwes = cwes;
    }

    public Collection<CrySLVulnerabilityEntry> getCves() {
        return cves;
    }

    public void setCves(Collection<CrySLVulnerabilityEntry> cves) {
        this.cves = cves;
    }

    public Collection<CrySLReferenceEntry> getReferences() {
        return references;
    }

    @Override
    public String toString() {
        StringBuilder outputSB = new StringBuilder();

        outputSB.append(this.className);

        outputSB.append("\nforbiddenMethods:");
        for (CrySLForbiddenMethod forMethSig : this.forbiddenMethods) {
            outputSB.append(forMethSig);
            outputSB.append(", ");
        }

        outputSB.append("\nEvents:");
        for (CrySLMethod method : events) {
            outputSB.append(method);
            outputSB.append(", ");
        }

        outputSB.append("\nUsage Pattern:");
        outputSB.append(this.usagePattern);

        outputSB.append("\nConstraints:");
        for (ISLConstraint constraint : this.constraints) {
            outputSB.append(constraint);
            outputSB.append(", ");
        }

        if (this.predicates != null) {
            outputSB.append("\nPredicates:");
            for (CrySLPredicate predicate : this.predicates) {
                outputSB.append(predicate);
                outputSB.append(", ");
            }
        }

        if (this.negatedPredicates != null) {
            outputSB.append("\nNegated predicates:");
            for (CrySLPredicate predicate : this.negatedPredicates) {
                outputSB.append(predicate);
                outputSB.append(", ");
            }
        }

        if (this.cwes != null) {
            outputSB.append("\nCWEs:");
            for (CrySLWeaknessEntry cwe : this.cwes) {
                outputSB.append(cwe);
                outputSB.append(", ");
            }
        }

        if (this.cves != null) {
            outputSB.append("\nCVEs:");
            for (CrySLVulnerabilityEntry cve : this.cves) {
                outputSB.append(cve);
                outputSB.append(", ");
            }
        }

        if (this.references != null && !this.references.isEmpty()) {
            outputSB.append("\nReferences:");
            for (CrySLReferenceEntry reference : this.references) {
                outputSB.append(reference);
                outputSB.append(", ");
            }
        }

        return outputSB.toString();
    }
}
