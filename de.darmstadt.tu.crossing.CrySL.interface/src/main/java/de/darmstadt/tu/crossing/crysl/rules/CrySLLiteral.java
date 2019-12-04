package de.darmstadt.tu.crossing.crysl.rules;

import java.io.Serializable;

import boomerang.jimple.Statement;
import de.darmstadt.tu.crossing.crysl.interfaces.ISLConstraint;

public abstract class CrySLLiteral implements ISLConstraint, Serializable {

	private static final long serialVersionUID = 1L;
	private Statement location;

	public void setLocation(Statement location) {
		this.location = location;
	}
	
	public Statement getLocation() {
		return location;
	}

}
