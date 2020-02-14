package de.darmstadt.tu.crossing.statemachine.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StatemachineCanonicalEditPolicy;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.policies.StatemachineItemSemanticEditPolicy;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;

/**
 * @generated
 */
public class OrderEditPart extends DiagramEditPart {
	
	View view;
	public static int childcount;

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Order"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public OrderEditPart(View view) {
		super(view);
		this.view = view;
		childcount = this.getModelChildren().size();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StatemachineItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new StatemachineCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						StatemachineVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
