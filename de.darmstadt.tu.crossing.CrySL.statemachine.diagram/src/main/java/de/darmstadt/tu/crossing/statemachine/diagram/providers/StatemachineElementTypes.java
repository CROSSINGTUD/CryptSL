package de.darmstadt.tu.crossing.statemachine.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.StateEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.TransitionEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.part.StatemachineDiagramEditorPlugin;

/**
 * @generated
 */
public class StatemachineElementTypes {

	/**
	 * @generated
	 */
	private StatemachineElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			StatemachineDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Statemachine_1000 = getElementType(
			"de.darmstadt.tu.crossing.CrySL.statemachine.diagram.Statemachine_1000");

	/**
	 * @generated
	 */
	public static final IElementType State_2001 = getElementType(
			"de.darmstadt.tu.crossing.CrySL.statemachine.diagram.State_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType(
			"de.darmstadt.tu.crossing.CrySL.statemachine.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Statemachine_1000, CrySLPackage.eINSTANCE.getOrder());

			elements.put(State_2001, CrySLPackage.eINSTANCE.getExpression_Elementop());

			elements.put(Transition_4001, CrySLPackage.eINSTANCE.getExpression_OrderEv());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Statemachine_1000);
			KNOWN_ELEMENT_TYPES.add(State_2001);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case OrderEditPart.VISUAL_ID:
			return Statemachine_1000;
		case StateEditPart.VISUAL_ID:
			return State_2001;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
