package de.darmstadt.tu.crossing.constraints;

import de.darmstadt.tu.crossing.cryptSL.UnaryOperator;
import de.darmstadt.tu.crossing.cryptSL.impl.LogicalOperatorImpl;

public class CrySLUnaryOperator extends LogicalOperatorImpl {

	private UnaryOperator operator;

	public CrySLUnaryOperator(UnaryOperator op) {
		operator = op;
	}
	
	public String toString() {
		return operator.getNOT();
	}
}
