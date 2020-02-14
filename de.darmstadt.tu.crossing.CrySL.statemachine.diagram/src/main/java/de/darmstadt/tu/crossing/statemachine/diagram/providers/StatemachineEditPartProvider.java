package de.darmstadt.tu.crossing.statemachine.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPartFactory;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;

/**
 * @generated
 */
public class StatemachineEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public StatemachineEditPartProvider() {
		super(new OrderEditPartFactory(), StatemachineVisualIDRegistry.TYPED_INSTANCE, OrderEditPart.MODEL_ID);
	}

}