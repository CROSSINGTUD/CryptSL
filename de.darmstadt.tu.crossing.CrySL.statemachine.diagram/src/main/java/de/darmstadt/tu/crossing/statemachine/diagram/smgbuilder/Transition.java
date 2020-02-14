package de.darmstadt.tu.crossing.statemachine.diagram.smgbuilder;

import java.util.List;

import de.darmstadt.tu.crossing.crySL.Event;

public interface Transition<State>{
	State from();
	State to();
	Event getLabel();
}
