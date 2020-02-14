package de.darmstadt.tu.crossing.statemachine.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

import de.darmstadt.tu.crossing.statemachine.diagram.part.Messages;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineDiagramEditorPlugin;

/**
 * Wizard page that allows to select element from model.
 * 
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(StatemachineDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(), pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * 
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
