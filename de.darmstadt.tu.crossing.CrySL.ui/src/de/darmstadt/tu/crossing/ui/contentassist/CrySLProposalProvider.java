package de.darmstadt.tu.crossing.ui.contentassist;

import java.lang.reflect.Executable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.jdt.core.JavaCore;

import org.eclipse.jface.text.contentassist.ICompletionProposal;

import org.eclipse.xtext.Assignment;

import org.eclipse.xtext.common.types.JvmExecutable;

import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import de.darmstadt.tu.crossing.ui.utils.ClassPathLoader;
import de.darmstadt.tu.crossing.ui.utils.ClassPathSolver;


public class CrySLProposalProvider extends AbstractCrySLProposalProvider {

	private static JvmExecutable jvmExecutable;

	@Override
	public void completeForbiddenMethod_Method(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeForbiddenMethod_Method(model, assignment, context, acceptor);
		completeJvmExecutable(model, assignment, context, acceptor, true);
	}

	@Override
	public void completeMethod_Method(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeMethod_Method(model, assignment, context, acceptor);
		completeJvmExecutable(model, assignment, context, acceptor, false);
	}

	/**
	 * Completes JvmExecutable's by proposing all names of Methods and Constructors
	 * of the rule's class using the signature as displayed name.
	 */
	public void completeJvmExecutable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeJvmExecutable(model, assignment, context, acceptor, false);
	}

	/**
	 * Completes JvmExecutable's by proposing all names or signatures of Methods
	 * and Constructors of the rule's class using the signature as displayed name.
	 * @param withParams Propses the complete signature if true, only the name otherwise
	 */
	public void completeJvmExecutable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor, boolean withParams) {
		String className = getSelectedClassName(context);
		try {
			Class<?> clazz = getClassForName(className, context);
			Stream<Executable> methods = Arrays.stream(clazz.getMethods());
			Stream<Executable> constructors = Arrays.stream(clazz.getDeclaredConstructors());
			Stream.concat(methods, constructors)
				.filter(exectuable -> Modifier.isPublic(exectuable.getModifiers()))
				.forEach(exectuable -> {
					String signature = toSignature(exectuable);
					String proposal = withParams ? signature : exectuable.getName() + "()";
					String displayName = getSimpleName(exectuable) + " : "  + signature;
					acceptor.accept(
							createCompletionProposal(proposal, displayName, getImage(jvmExecutable), context));
				})
				;
		}
		catch (ClassNotFoundException e) {
				System.err.println(className + " class not found: " + e);
		}
	}

	private static String getSimpleName(Executable e) {
		if(e instanceof Constructor)
			return e.getName().substring(e.getDeclaringClass().getName().length()+1);
		return e.getName();
	}

	private static String toSignature(Executable e) {
		String[] parameterNames = Arrays.stream(e.getParameters())
			.map(p -> p.getType().getName())
			.toArray(String[]::new);
		return getSimpleName(e) + "(" + String.join(",", parameterNames) + ")";
	}

	private Class<?> getClassForName(String name, ContentAssistContext context) throws ClassNotFoundException {
		try {
			return Class.forName(name, false, this.getClass().getClassLoader());
		} catch (ClassNotFoundException e) {
			Collection<String> classpath = getProjectClassPath(context);
			for (String path : classpath) {
				Class<?> c = ClassPathLoader.LoadClassFromPath(name, path);
				if(c != null)
					return c;
			}
		}
		throw new ClassNotFoundException();
	}

	private static String getSelectedClassName(ContentAssistContext context) {
		BidiIterable<INode> childrens = context.getRootNode().getChildren();
		for (INode children : childrens) {
			if ("SPEC".equals(children.getText()))
				return children.getNextSibling().getText().replaceAll("\\s+", "");
		}
		return null;
	}

	private static Collection<String> getProjectClassPath(ContentAssistContext context) {
		URI uri = context.getRootModel().eResource().getURI();
		if (uri.isPlatform()) {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getProject();
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					return ClassPathSolver.getClasspath(JavaCore.create(project));
				}
			}
			catch (CoreException e) {
				System.err.println(e);
			}
		}
		return null;
	}

}
