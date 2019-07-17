package de.darmstadt.tu.crossing.constraints;

import de.darmstadt.tu.crossing.cryptSL.ArithmeticOperator;
import de.darmstadt.tu.crossing.cryptSL.impl.ArithmeticOperatorImpl;

public class CrySLArithmeticOperator extends ArithmeticOperatorImpl {

	private ArithmeticOperator operator;

	public CrySLArithmeticOperator(ArithmeticOperator op) {
		operator = op;
	}
	
	public String toString() {
		if (operator.getPLUS() != null && !operator.getPLUS().isEmpty()) {
			return operator.getPLUS();
		} else if (operator.getMINUS() != null && !operator.getMINUS().isEmpty()) {
			return operator.getMINUS();
		}else if (operator.getMOD() != null && !operator.getMOD().isEmpty()) {
			return operator.getMOD();
		} 
		else if (operator.getTIMES() != null && !operator.getTIMES().isEmpty()) {
			return operator.getTIMES();
		} else {
			return operator.getDIVIDE();
		}
	}
	
}
