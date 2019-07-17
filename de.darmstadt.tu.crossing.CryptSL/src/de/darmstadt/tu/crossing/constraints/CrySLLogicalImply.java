package de.darmstadt.tu.crossing.constraints;

import de.darmstadt.tu.crossing.cryptSL.LogicalImply;
import de.darmstadt.tu.crossing.cryptSL.impl.LogicalImplyImpl;

public class CrySLLogicalImply extends LogicalImplyImpl {

	private LogicalImply operator;

	public CrySLLogicalImply(LogicalImply op) {
		operator = op;
	}
	
	public String toString() {
		return operator.getIMPLIES();
	}
}
