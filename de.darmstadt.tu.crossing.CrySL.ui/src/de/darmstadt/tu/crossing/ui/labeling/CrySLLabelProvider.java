package de.darmstadt.tu.crossing.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import de.darmstadt.tu.crossing.crySL.Object;
import de.darmstadt.tu.crossing.crySL.*;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmTypeReference;

public class CrySLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public CrySLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public String text(Domainmodel e) {
		return "CrySL Rule";
	}

	public String text(ObjectsBlock e) {
		return "OBJECTS";
	}

	public String text(ForbiddenBlock e) {
		return "FORBIDDEN";
	}

	public String text(EventsBlock e) {
		return "EVENTS";
	}

	public String text(OrderBlock e) {
		return "ORDER";
	}

	public String text(ConstraintsBlock e) {
		return "CONSTRAINTS";
	}

	public String text(RequiresBlock e) {
		return "REQUIRES";
	}

	public String text(EnsuresBlock e) {
		return "ENSURES";
	}

	public String text(NegatesBlock e) {
		return "NEGATES";
	}

	public String text(Object e) {
		return e.getName();
	}

	public String text(JvmTypeReference e) {
		return e.getType().getIdentifier();
	}

	public String text(JvmExecutable e) {
		return e.getSimpleName();
	}

	public String text(ForbiddenMethod e) {
		return e.getMethod().getIdentifier();
	}

	public String text(LabeledMethodCall e) {
		return e.getName();
	}

	public String text(Aggregate e) {
		return e.getName();
	}

	public String text(Method e) {
		return e.getMethod().getSimpleName();
	}

	public String text(Primary e) {
		return e.getEvent().getName();
	}

	public String text(Order e) {
		return "`" + e.getOp().getName() + "` Expression";
	}

	public String text(Constraint e) {
		return "`" + e.getOp().getName() + "` Expression";
	}

	public String text(Literal e) {
		return e.getValue();
	}

	public String text(ObjectReference e) {
		return e.getObject().getName();
	}

	public String text(BuiltinPredicate e) {
		return e.getPredicate().getLiteral();
	}

	public String text(ObjectOperation e) {
		return e.getFn().getLiteral();
	}

	public String text(AlternativeRequiredPredicates e) {
		return "Alternatives";
	}

	public String text(RequiredPredicate e) {
		return e.getPredicate().getName();
	}

	public String text(NegatedPredicate e) {
		return e.getPredicate().getName();
	}

	public String text(EnsuredPredicate e) {
		return e.getPredicate().getName();
	}

	public String text(PredicateParameter e) {
			if(e instanceof WildcardPredicateParameter)
				return "_";
			if(e instanceof ThisPredicateParameter)
				return "this";
			return "Parameter";
	}
}
