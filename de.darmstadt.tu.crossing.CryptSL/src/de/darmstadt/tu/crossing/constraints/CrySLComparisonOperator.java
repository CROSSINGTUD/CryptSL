package de.darmstadt.tu.crossing.constraints;

import de.darmstadt.tu.crossing.cryptSL.ComparingOperator;
import de.darmstadt.tu.crossing.cryptSL.impl.ComparingOperatorImpl;

public class CrySLComparisonOperator extends ComparingOperatorImpl {
	
	private ComparingOperator operator;

	public CrySLComparisonOperator(ComparingOperator op) {
		operator = op;
	}
	
	public String toString() {
		if (operator.getLESS() != null && !operator.getLESS().isEmpty()) {
			return operator.getLESS();
		} else if (operator.getLESS_OR_EQUAL() != null && !operator.getLESS_OR_EQUAL().isEmpty()) {
			return operator.getLESS_OR_EQUAL();
		} else if (operator.getGREATER_OR_EQUAL() != null && !operator.getGREATER_OR_EQUAL().isEmpty()) {
			return operator.getGREATER_OR_EQUAL();
		} else if (operator.getGREATER() != null && !operator.getGREATER().isEmpty()) {
			return operator.getGREATER();
		} else if (operator.getEQUAL() != null && !operator.getEQUAL().isEmpty()) {
			return operator.getEQUAL();
		} else {
			return operator.getUNEQUAL();
		}
	}
}
