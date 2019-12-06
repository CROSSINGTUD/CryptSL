package de.darmstadt.tu.crossing.crysl.reader;

import java.util.AbstractMap.SimpleEntry;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.google.common.io.Files;

import de.darmstadt.tu.crossing.crySL.Aggregate;
import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.crySL.Method;
import de.darmstadt.tu.crossing.crySL.ObjectDecl;
import de.darmstadt.tu.crossing.crySL.Par;
import de.darmstadt.tu.crossing.crySL.ParList;
import de.darmstadt.tu.crossing.crySL.SuperType;
import de.darmstadt.tu.crossing.crysl.rules.CrySLMethod;
import de.darmstadt.tu.crossing.crysl.rules.CrySLRule;

public class CrySLReaderUtils {
	public static final String outerFileSeparator = System.getProperty("file.separator");
	public static final String innerFileSeparator = "/";
	protected static List<CrySLMethod> resolveAggregateToMethodeNames(final Event leaf) {
		if (leaf instanceof Aggregate) {
			final Aggregate ev = (Aggregate) leaf;
			return dealWithAggregate(ev);
		} else {
			final ArrayList<CrySLMethod> statements = new ArrayList<>();
			CrySLMethod stringifyMethodSignature = stringifyMethodSignature(leaf);
			if (stringifyMethodSignature != null) {
				statements.add(stringifyMethodSignature);
			}
			return statements;
		}
	}
	
	public static enum RuleFormat {
		SOURCE() {
			public String toString() {
				return CrySLModelReader.cryslFileEnding;
			}
		},
	}
	
	protected static List<CrySLMethod> dealWithAggregate(final Aggregate ev) {
		final List<CrySLMethod> statements = new ArrayList<>();

		for (final Event lab : ev.getLab()) {
			if (lab instanceof Aggregate) {
				statements.addAll(dealWithAggregate((Aggregate) lab));
			} else {
				statements.add(stringifyMethodSignature(lab));
			}
		}
		return statements;
	}
	protected static CrySLMethod stringifyMethodSignature(final Event lab) {
		if (!(lab instanceof SuperType)) {
			return null;
		}
		final Method method = ((SuperType) lab).getMeth();
		
		String methodName = method.getMethName().getSimpleName();
		if (methodName == null) {
			methodName = ((de.darmstadt.tu.crossing.crySL.Domainmodel) (method.eContainer().eContainer().eContainer())).getJavaType().getSimpleName();
		}
		final String qualifiedName =
				((de.darmstadt.tu.crossing.crySL.Domainmodel) (method.eContainer().eContainer().eContainer())).getJavaType().getQualifiedName() + "." + methodName; // method.getMethName().getQualifiedName();
		// qualifiedName = removeSPI(qualifiedName);
		final List<Entry<String, String>> pars = new ArrayList<>();
		final de.darmstadt.tu.crossing.crySL.Object returnValue = method.getLeftSide();
		Entry<String, String> returnObject = null;
		if (returnValue != null && returnValue.getName() != null) {
			final ObjectDecl v = ((ObjectDecl) returnValue.eContainer());
			returnObject = new SimpleEntry<>(returnValue.getName(), v.getObjectType().getQualifiedName() + ((v.getArray() != null) ? v.getArray() : ""));
		} else {
			returnObject = new SimpleEntry<>("_", "void");
		}
		final ParList parList = method.getParList();
		if (parList != null) {
			for (final Par par : parList.getParameters()) {
				String parValue = "_";
				if (par.getVal() != null && par.getVal().getName() != null) {
					final ObjectDecl objectDecl = (ObjectDecl) par.getVal().eContainer();
					parValue = par.getVal().getName();
					final String parType = objectDecl.getObjectType().getIdentifier() + ((objectDecl.getArray() != null) ? objectDecl.getArray() : "");
					pars.add(new SimpleEntry<>(parValue, parType));
				} else {
					pars.add(new SimpleEntry<>(parValue, "AnyType"));
				}
			}
		}
		return new CrySLMethod(qualifiedName, pars, new ArrayList<Boolean>(), returnObject);
	}
	
	public static File getResourceFromWithin(final String inputPath) {
		return new File(inputPath);
	}
	
	public static void storeRuletoFile(final CrySLRule rule, final String folderPath) throws IOException {
		File written = new File(folderPath + innerFileSeparator + rule.getClassName().substring(rule.getClassName().lastIndexOf(".") + 1) + CrySLModelReader.cryslFileEnding);
		Files.write(rule.toString(), written, StandardCharsets.UTF_8);
	}

	public static void storeRulesToFile(final List<CrySLRule> rules, final String folder) throws IOException {
		for (CrySLRule rule : rules) {
			storeRuletoFile(rule, folder);
		}
	}
}

