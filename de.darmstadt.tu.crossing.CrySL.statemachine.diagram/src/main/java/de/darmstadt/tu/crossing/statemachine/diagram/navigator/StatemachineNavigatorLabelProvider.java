package de.darmstadt.tu.crossing.statemachine.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.StateEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.StateNameEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.TransitionEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.TransitionNameEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineDiagramEditorPlugin;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineVisualIDRegistry;
import de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes;
import de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineParserProvider;

/**
 * @generated
 */
public class StatemachineNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		StatemachineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		StatemachineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof StatemachineNavigatorItem
				&& !isOwnView(((StatemachineNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof StatemachineNavigatorGroup) {
			StatemachineNavigatorGroup group = (StatemachineNavigatorGroup) element;
			return StatemachineDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof StatemachineNavigatorItem) {
			StatemachineNavigatorItem navigatorItem = (StatemachineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case OrderEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.darmstadt.de/tu/crossing/CrySL?Order", //$NON-NLS-1$
					StatemachineElementTypes.Statemachine_1000);
		case StateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.darmstadt.de/tu/crossing/CrySL?Expression", //$NON-NLS-1$
					StatemachineElementTypes.State_2001);
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.darmstadt.de/tu/crossing/CrySL?Expression", //$NON-NLS-1$
					StatemachineElementTypes.Transition_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = StatemachineDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && StatemachineElementTypes.isKnownElementType(elementType)) {
			image = StatemachineElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof StatemachineNavigatorGroup) {
			StatemachineNavigatorGroup group = (StatemachineNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof StatemachineNavigatorItem) {
			StatemachineNavigatorItem navigatorItem = (StatemachineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case OrderEditPart.VISUAL_ID:
			return getStatemachine_1000Text(view);
		case StateEditPart.VISUAL_ID:
			return getState_2001Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStatemachine_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getState_2001Text(View view) {
		IParser parser = StatemachineParserProvider.getParser(StatemachineElementTypes.State_2001,
				view.getElement() != null ? view.getElement() : view,
				StatemachineVisualIDRegistry.getType(StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StatemachineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = StatemachineParserProvider.getParser(StatemachineElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				StatemachineVisualIDRegistry.getType(TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StatemachineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return OrderEditPart.MODEL_ID.equals(StatemachineVisualIDRegistry.getModelID(view));
	}

}
