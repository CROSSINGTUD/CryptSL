/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.ForbMethod;
import de.darmstadt.tu.crossing.crySL.RequiredBlock;
import de.darmstadt.tu.crossing.crySL.SuperType;
import de.darmstadt.tu.crossing.crySL.impl.ObjectImpl;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CrySLValidator extends AbstractCrySLValidator {
	
	public static final EStructuralFeature INVALID_NAME = null;

	@Check
	public void checkGreetingStartsWithCapital(ForbMethod greeting) {
		
	}
	
	/**
	 * Add error markers for duplicate event labels.
	 * 
	 * @param s of type supertype being checked for duplicity 
	 */
	@Check
	public void checkDuplicateEventLabel(SuperType s) {
		
		if(!(s instanceof ObjectImpl)) {
			for(Event e : ((RequiredBlock) s.eContainer()).getReq_event()) {
				for(Event ev : ((RequiredBlock) s.eContainer()).getReq_event()) {
					if(e instanceof SuperType && ev instanceof SuperType) {
						SuperType es = (SuperType) e;
						SuperType evs = (SuperType) ev;
						if(es != evs && es.getName().equals(evs.getName())) {
							if(s.getName().contentEquals(es.getName()) 
									&& s.getName().contentEquals(evs.getName())) {
								error("Duplicate label", INVALID_NAME);
							}
						}
					}
				}
			}
		}
	}
}