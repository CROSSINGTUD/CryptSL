package de.darmstadt.tu.crossing.crysl.interfaces;

import java.util.List;
import de.darmstadt.tu.crossing.crysl.rules.CrySLMethod;

public interface Transition<State>{
	State from();
	State to();
	List<CrySLMethod> getLabel();
}