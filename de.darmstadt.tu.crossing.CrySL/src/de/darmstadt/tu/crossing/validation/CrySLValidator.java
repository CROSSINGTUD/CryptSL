/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import java.nio.ByteOrder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;

import de.darmstadt.tu.crossing.crySL.CrySLPackage;
import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.crySL.Aggregate;
import de.darmstadt.tu.crossing.crySL.ObjectOperation;
import de.darmstadt.tu.crossing.crySL.ObjectOp;
import de.darmstadt.tu.crossing.crySL.Constraint;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.EventsBlock;
import de.darmstadt.tu.crossing.crySL.Object;
import de.darmstadt.tu.crossing.crySL.ObjectsBlock;
import de.darmstadt.tu.crossing.crySL.Operator;
import de.darmstadt.tu.crossing.crySL.ExceptionDeclaration;
import de.darmstadt.tu.crossing.crySL.ExceptionAggregate;
import de.darmstadt.tu.crossing.crySL.Literal;
import de.darmstadt.tu.crossing.crySL.IntLiteral;
import de.darmstadt.tu.crossing.crySL.StringLiteral;
import de.darmstadt.tu.crossing.crySL.BooleanLiteral;

/** This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CrySLValidator extends AbstractCrySLValidator {

	public static final String WRN_TYPE_PARAMETERS_NOT_SPECIFIED =
		"Type under specification is generic, type parameters should be specified: <%s>";
	public static final String ERR_EXCEPTION_NOT_THROWABLE =
		"%s does not implement java.lang.Throwable";
	public static final String ERR_TYPE_NOT_GENERIC =
		"Type under specification is not generic, but type parameters were specified";
	public static final String ERR_TYPE_PARAMETERS_MISMATCH =
		"Specfied parameters do not match expected parameters: <%s>";
	public static final String ERR_TYPE_PARAMETER_MISMATCH =
		"Specfied parameter does not match expected parameter: %s";
	public static final String ERR_ELEMENTS_OUTSIDE_IN =
		"elements(..) must only be used with an in-Expression";
	public static final String AGGREGATE_INFINITE_RECURSION =
		"Aggregate must not recursively include itself";
	public static final String ERR_DUPLICATE_EVENT =
		"Event already defined";
	public static final String ERR_DUPLICATE_OBJECT =
		"Object already defined";

	/**
	 * Check wether all Exceptions implement {@link java.lang.Throwable}.
	 * */
	@Check
	public void checkExceptions(ExceptionDeclaration exc) {
	try {
			Class<?> e = Class.forName(exc.getException().getType().getIdentifier());
			if(!java.lang.Throwable.class.isAssignableFrom(e))
			warning(String.format(ERR_EXCEPTION_NOT_THROWABLE, e.getName())
					, exc
					, CrySLPackage.Literals.EXCEPTION_DECLARATION__EXCEPTION);
		} catch(ClassNotFoundException e) {}
	}
	/**
	 * Check wether exception aggregate inclusion contains circles.
	 * */
	@Check
	public void checkExceptionAggregate(ExceptionAggregate a) {
		Set<ExceptionAggregate> visited = new HashSet<>();
		LinkedList<ExceptionAggregate> toVisit = new LinkedList<>();
		toVisit.add(a);
		while(!toVisit.isEmpty()) {
			ExceptionAggregate current = toVisit.pop();
			if(visited.contains(current)) {
				error(AGGREGATE_INFINITE_RECURSION, a, CrySLPackage.Literals.EXCEPTION__NAME);
				return;
			}
			visited.add(current);
			current.getExceptions().stream()
				.filter(exception -> exception instanceof ExceptionAggregate)
				.map(exception -> (ExceptionAggregate) exception)
				.forEach(toVisit::push);
		}
	}

	/**
	 * Check wether the specified type parameters match those of the class
	 * under specification.
	 * */
	@Check
	public void checkGenericType(Domainmodel model) {
		if(!(model.getJavaType() instanceof JvmParameterizedTypeReference))
			return;
		if(!(model.getJavaType().getType() instanceof JvmGenericType))
			return;
		JvmGenericType clazz =
			(JvmGenericType) model.getJavaType().getType();
		JvmParameterizedTypeReference spec =
			(JvmParameterizedTypeReference) model.getJavaType();
		List<JvmTypeParameter> expected =
			clazz.getTypeParameters();
		List<JvmTypeReference> actual =
			spec.getArguments();
		String suggestion = expected.stream()
			.map(JvmTypeParameter::getName)
			.collect(Collectors.joining(", "));
		if(actual.size() == 0 && expected.size() != 0)
			warning(String.format(WRN_TYPE_PARAMETERS_NOT_SPECIFIED, suggestion)
					, model
					, CrySLPackage.Literals.DOMAINMODEL__JAVA_TYPE);
		else if(actual.size() != 0 && expected.size() == 0)
			error(ERR_TYPE_NOT_GENERIC
					, model
					, CrySLPackage.Literals.DOMAINMODEL__JAVA_TYPE);
		else if(actual.size() != expected.size())
			error(String.format(ERR_TYPE_PARAMETERS_MISMATCH, suggestion)
					, model
					, CrySLPackage.Literals.DOMAINMODEL__JAVA_TYPE);
		else for(int i = 0; i < expected.size(); i++)
			if(!expected.get(i).equals(actual.get(i).getType()))
				error(String.format(ERR_TYPE_PARAMETER_MISMATCH, expected.get(i).getName())
						, model.getJavaType()
						, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__ARGUMENTS
						, i);
	}

	/**
	 * Check wether the builtin operation `elements(..)` is used as the lhs of an
	 * `in` Expression.
	 * */
	@Check
	public void checkElements(ObjectOperation e) {
		if(e.getFn() != ObjectOp.ELEMENTS) return;
		Constraint parent = (Constraint) e.eContainer();
		if(parent.getOp() == Operator.IN) return;
		EStructuralFeature side = CrySLPackage.Literals.CONSTRAINT__LEFT;
		error(ERR_ELEMENTS_OUTSIDE_IN, parent, side);
	}

	/**
	 * Check wether aggregate inclusion contains circles.
	 * */
	@Check
	public void checkAggregate(Aggregate a) {
		Set<Aggregate> visited = new HashSet<>();
		LinkedList<Aggregate> toVisit = new LinkedList<>();
		toVisit.add(a);
		while(!toVisit.isEmpty()) {
			Aggregate current = toVisit.pop();
			if(visited.contains(current)) {
				error(AGGREGATE_INFINITE_RECURSION, a, CrySLPackage.Literals.EVENT__NAME);
				return;
			}
			visited.add(current);
			current.getEvents().stream()
				.filter(event -> event instanceof Aggregate)
				.map(event -> (Aggregate) event)
				.forEach(toVisit::push);
		}
	}

	/**
	 * Add error markers for duplicate object labels.
	 * 
	 * @param o ObjectsBlock in which to check for duplicity
	 */
	@Check
	public void checkDuplicateEventLabel(ObjectsBlock o) {
		List<Object> objects = o.getDeclarations();
		for(int i = 0; i < objects.size(); i++)
			for(int j = i + 1; j < objects.size(); j++) {
				Object a = objects.get(i);
				Object b = objects.get(j);
				if(a.getName().equals(b.getName()))
					error(ERR_DUPLICATE_OBJECT, b, CrySLPackage.Literals.OBJECT__NAME);
			}
	}

	/**
	 * Add error markers for duplicate event labels.
	 * 
	 * @param e EventsBlock in which to check for duplicity
	 */
	@Check
	public void checkDuplicateEventLabel(EventsBlock e) {
		List<Event> events = e.getEvents();
		for(int i = 0; i < events.size(); i++)
			for(int j = i + 1; j < events.size(); j++) {
				Event a = events.get(i);
				Event b = events.get(j);
				if(a.getName().equals(b.getName()))
					error(ERR_DUPLICATE_EVENT, b, CrySLPackage.Literals.EVENT__NAME);
			}
	}
}
