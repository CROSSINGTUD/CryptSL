package de.darmstadt.tu.crossing.statemachine.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import de.darmstadt.tu.crossing.crySL.Expression;
import de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.OrderEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.StateEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.edit.parts.TransitionEditPart;
import de.darmstadt.tu.crossing.statemachine.diagram.providers.StatemachineElementTypes;
import de.darmstadt.tu.crossing.statemachine.diagram.smgbuilder.StateMachineGraph;
import de.darmstadt.tu.crossing.statemachine.diagram.smgbuilder.StateMachineGraphBuilder;
import de.darmstadt.tu.crossing.statemachine.diagram.smgbuilder.StateNode;
import de.darmstadt.tu.crossing.statemachine.diagram.smgbuilder.TransitionEdge;
import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Event;

/**
 * @generated
 */
public class StatemachineDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<StatemachineNodeDescriptor> getSemanticChildren(View view) {
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case OrderEditPart.VISUAL_ID:
			return getStatemachine_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineNodeDescriptor> getStatemachine_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Expression modelElement = (Expression) view.getElement();

		StateMachineGraph smg = buildStateMachineGraph(modelElement);
		LinkedList<StatemachineNodeDescriptor> result = new LinkedList<StatemachineNodeDescriptor>();

		for (StateNode node : smg.getNodes()) {
			int visualID = StatemachineVisualIDRegistry.getNodeVisualID(view, smg.getNodeMap().get(node.getName()));
			if (visualID == StateEditPart.VISUAL_ID) {
				result.add(new StatemachineNodeDescriptor((ExpressionImpl) smg.getNodeMap().get(node.getName()),
						visualID));
				continue;
			}
		}
		Collections.reverse(result);
		return result;
	}

	private static StateMachineGraph buildStateMachineGraph(final Expression order) {
		final StateMachineGraphBuilder smgb = new StateMachineGraphBuilder(order);
		return smgb.buildSMG();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getContainedLinks(View view) {
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case OrderEditPart.VISUAL_ID:
			return getStatemachine_1000ContainedLinks(view);
		case StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getIncomingLinks(View view) {
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getOutgoingLinks(View view) {
		switch (StatemachineVisualIDRegistry.getVisualID(view)) {
		case StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getStatemachine_1000ContainedLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getState_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getTransition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getState_2001IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getState_2001OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<StatemachineLinkDescriptor> getTransition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<StatemachineLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			Expression container) {
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		StateMachineGraph smg = buildStateMachineGraph(container);
		for (TransitionEdge edge : smg.getEdges()) {
			if (TransitionEditPart.VISUAL_ID != StatemachineVisualIDRegistry
					.getLinkWithClassVisualID(edge.getLabel())) {
				continue;
			}
			Expression src = (Expression) smg.getNodeMap().get(edge.getLeft().getName());
			Expression dst = (Expression) smg.getNodeMap().get(edge.getRight().getName());
			result.add(new StatemachineLinkDescriptor(src, dst, edge.getLabel(),
					StatemachineElementTypes.Transition_4001, TransitionEditPart.VISUAL_ID));
		}

		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StatemachineLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(Event target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CrySLPackage.eINSTANCE.getExpression_Elementop()
					|| false == setting.getEObject() instanceof Event) {
				continue;
			}
			Event link = (Event) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != StatemachineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Event src = link;
			result.add(new StatemachineLinkDescriptor(src, target, link, StatemachineElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<StatemachineLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(Event source) {
		Expression container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Expression) {
				container = (Expression) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<StatemachineLinkDescriptor> result = new LinkedList<StatemachineLinkDescriptor>();
		for (Iterator<?> links = container.getOrderEv().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Event) {
				continue;
			}
			Event link = (Event) linkObject;
			if (TransitionEditPart.VISUAL_ID != StatemachineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Event dst = link;
			Event src = link;
			if (src != source) {
				continue;
			}
			result.add(new StatemachineLinkDescriptor(src, dst, link, StatemachineElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<StatemachineNodeDescriptor> getSemanticChildren(View view) {
			return StatemachineDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<StatemachineLinkDescriptor> getContainedLinks(View view) {
			return StatemachineDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<StatemachineLinkDescriptor> getIncomingLinks(View view) {
			return StatemachineDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<StatemachineLinkDescriptor> getOutgoingLinks(View view) {
			return StatemachineDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
