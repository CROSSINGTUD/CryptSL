package de.darmstadt.tu.crossing.statemachine.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes;

/**
 * @generated
 */
public class StatemachinePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createStatemachine1Group());
	}

	/**
	 * Creates "statemachine" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createStatemachine1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Statemachine1Group_title);
		paletteContainer.setId("createStatemachine1Group"); //$NON-NLS-1$
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.State1CreationTool_title,
				Messages.State1CreationTool_desc, Collections.singletonList(StatemachineElementTypes.State_2001));
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StatemachineElementTypes.getImageDescriptor(StatemachineElementTypes.State_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc,
				Collections.singletonList(StatemachineElementTypes.Transition_4001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StatemachineElementTypes.getImageDescriptor(StatemachineElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
