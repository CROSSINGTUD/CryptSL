package de.darmstadt.tu.crossing.rule;

import java.util.List;

public interface ISLConstraint extends ICrySLPredicateParameter {

    List<String> getInvolvedVarNames();
}
