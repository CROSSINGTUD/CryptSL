package de.darmstadt.tu.crossing.statemachine.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
//import de.darmstadt.tu.crossing.crySL.Order;
//import de.darmstadt.tu.crossing.crySL.SimpleOrder;
import de.darmstadt.tu.crossing.crySL.Expression;
import de.darmstadt.tu.crossing.crySL.Order;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StatemachineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Expression) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Expression && newEnd instanceof Expression)) {
			return false;
		}
		Expression target = getLink().getRight();
		if (!(getLink().eContainer() instanceof Expression)) {
			return false;
		}
		Order container = (Order) getLink().eContainer();
		return StatemachineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Expression && newEnd instanceof Expression)) {
			return false;
		}
		Expression source = getLink().getLeft();
		if (!(getLink().eContainer() instanceof Expression)) {
			return false;
		}
		Order container = (Order) getLink().eContainer();
		return StatemachineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setLeft(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setRight(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Expression getLink() {
		return (Expression) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Expression getOldSource() {
		return (Expression) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Expression getNewSource() {
		return (Expression) newEnd;
	}

	/**
	 * @generated
	 */
	protected Expression getOldTarget() {
		return (Expression) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Expression getNewTarget() {
		return (Expression) newEnd;
	}
}
