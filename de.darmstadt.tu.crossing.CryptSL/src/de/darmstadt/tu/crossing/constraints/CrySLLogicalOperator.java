package de.darmstadt.tu.crossing.constraints;

import de.darmstadt.tu.crossing.cryptSL.LogicalOperator;
import de.darmstadt.tu.crossing.cryptSL.impl.LogicalOperatorImpl;

public class CrySLLogicalOperator extends LogicalOperatorImpl {

	private LogicalOperator operator;

	public CrySLLogicalOperator(LogicalOperator op) {
		operator = op;
	}
	
	public String toString() {
		if (operator.getOR() != null && !operator.getOR().isEmpty()) {
			return operator.getOR();
		} else {
			return operator.getAND();
		}
	}
}
