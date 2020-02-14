package de.darmstadt.tu.crossing.statemachine.diagram.providers;

import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = StatemachineDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			StatemachineDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
