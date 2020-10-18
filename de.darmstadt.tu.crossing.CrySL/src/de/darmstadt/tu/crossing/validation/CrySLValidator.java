/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.validation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.ForbMethod;
import de.darmstadt.tu.crossing.crySL.SuperType;
import de.darmstadt.tu.crossing.crySL.impl.EventImpl;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CrySLValidator extends AbstractCrySLValidator {
	
	// AbstractCrySLValidator registers the EPackages for which this validator introduces constraints
	
	public static final EStructuralFeature INVALID_NAME = null;
	private ArrayList<SuperType> eventNames = null;

	@Check
	public void checkGreetingStartsWithCapital(ForbMethod greeting) {
		System.out.println("bla bla");
	}
	
	// write constraints in a declarative way
	// just have to add the Check annotation to any method and it will be invoked automatically when validation takes place
	
	// unique name validator
	@Check //need fast parameter to run check whenever a file is modified, default is fast
	public void checkDuplicateEventName(/*Event e,*/ SuperType s) {
		System.out.println("-------blub---------");
		/*String m = e.eContainer().toString();
		System.out.println("container content is: " + m);
		System.out.println("event info: " + e.toString());
		System.out.println("event info2: " + e.eContainingFeature().getName());
		System.out.println("event info3: " + e.eClass().getName()); //prints the type
		System.out.println("event info4: " + e.eContents().toString());
		System.out.println("event info5: " + e.eContents());// same as info4
		System.out.println("event info6: " + e.toString().intern());// same as info
		System.out.println("event info7: " + e.toString().trim());// same as info
		System.out.println("event info8: " + e.eResource()); //prints the linked rule KeyGenerator which was open in runtime and validated
		*/
		System.out.println("event info9: " + s.getName()); //works, gives name // each name equally required for check? check that
		System.out.println("event info10: " + s.eClass().getEAllAttributes());
		if(s instanceof SuperType) {
			System.out.println("mimi");
			// from here, nothing is executed
			eventNames.add(s);
			System.out.println("Added " + s + " to arraylist.");
		}
		System.out.println("Check mode is: " + this.getCheckMode());
		System.out.println("current object is: " + this.getCurrentObject());
		System.out.println("current method is: " + this.getCurrentMethod());
		if(s.getName().contentEquals("i4")) {
			//System.out.println("ERROR");
			//error("Label occurs twice.", INVALID_NAME);
			
		}
		for(SuperType i: eventNames) {
			if(i.getName().equals(s.getName())) {
				System.out.println("ERROR");
				error("Label occurs twice.", INVALID_NAME);
			}
		}

		
		//for()
		/*if(e.)) {
			
		}*/
		/*if (getContainerOfType(openCSV, Model).actions.filter(OpenCSV).
			exists[it != openCSV && it.name == openCSV.name]) {
			error("Duplicate csv identifier '" + openCSV.name + "'", CsvPackage::eINSTANCE.openCSV_Name,
				DUPLICATE_OPEN_NAME)
		}*/
	}
	
	// invoke getEPackages
	//addIssue, error
}
