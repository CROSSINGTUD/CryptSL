package de.darmstadt.tu.crossing.statemachine.diagram.edit.policies;


import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes;

/**
 * @generated
 */
public class TransitionItemSemanticEditPolicy extends StatemachineBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransitionItemSemanticEditPolicy() {
		super(StatemachineElementTypes.Transition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
