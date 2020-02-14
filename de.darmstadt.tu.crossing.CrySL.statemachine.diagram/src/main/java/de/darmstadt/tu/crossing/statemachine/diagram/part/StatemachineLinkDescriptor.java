package de.darmstadt.tu.crossing.statemachine.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

/**
 * @generated
 */
public class StatemachineLinkDescriptor extends UpdaterLinkDescriptor {
	/**
	 * @generated
	 */
	public StatemachineLinkDescriptor(EObject source, EObject destination, IElementType elementType, int linkVID) {
		super(source, destination, elementType, linkVID);
	}

	/**
	 * @generated
	 */
	public StatemachineLinkDescriptor(EObject source, EObject destination, EObject linkElement,
			IElementType elementType, int linkVID) {
		super(source, destination, linkElement, elementType, linkVID);
	}

	public void setSource(EObject source) {
		this.setSource(source);
	}

	public EObject getLinkElement() {
		return getLinkElement();
	}

}