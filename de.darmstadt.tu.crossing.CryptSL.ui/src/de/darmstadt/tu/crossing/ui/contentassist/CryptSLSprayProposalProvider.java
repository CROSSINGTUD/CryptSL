package de.darmstadt.tu.crossing.ui.contentassist;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import com.google.inject.Inject;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;
import de.darmstadt.tu.crossing.ui.utils.ClassPathSolver;
import de.darmstadt.tu.crossing.ui.utils.ClassLoader;

public class CryptSLSprayProposalProvider extends AbstractCryptSLProposalProvider {
	@Inject
	CryptSLGrammarAccess grammarAccess;
	private static Keyword keyword;

	@Override
	public void completeMethod_MethName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String className = getSelectedClassName(context);
		keyword = grammarAccess.getAggregateAccess().getSemicolonKeyword_1_3();
		try {
			Class c = Class.forName(className);
			addMethodstoProposal(c, context, acceptor);
		}
		catch (ClassNotFoundException e) {
			Collection<String> classpath = getProjectClassPath(context);
			if (classpath != null) {
				Class<?> c = getClassMethods(className, classpath);
				addMethodstoProposal(c, context, acceptor);
			} else {
				System.out.println(className + " is not found");
			}
		}
	}

	@Override
	public void completeAggregate_Lab(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		keyword = grammarAccess.getAggregateAccess().getSemicolonKeyword_1_3();
		context.getRootNode().getChildren().forEach(item -> {
			if (item.getText().equals("EVENTS")) {
				item.getNextSibling().getLeafNodes().forEach(item2 -> {
					if (item2.getText().equals(":") || item2.getText().equals(":=")) {
						String text = null;
						while (item2.getPreviousSibling().getText().equals(" ")) {
							text = item2.getPreviousSibling().getText();
							item2 = (ILeafNode) item2.getPreviousSibling();
						}
						text = item2.getPreviousSibling().getText();
						completeproposal(text, context, acceptor);
					}
				});
			}
		});

	}

	@Override
	public void completeAggregateExpression_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		INode currNode = context.getCurrentNode();
		if (currNode.hasPreviousSibling() && currNode.getPreviousSibling().hasPreviousSibling() && currNode.getPreviousSibling().getPreviousSibling().getText().equals("CONSTRAINTS")) {
			completeAggregateProposal(context, acceptor);
		} else {
			System.out.println("inconstraint");
			super.completeAggregateExpression_Value(model, assignment, context, acceptor);
		}
	}

	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		INode currNode = context.getCurrentNode();
		if (currNode.hasPreviousSibling() && currNode.getPreviousSibling().hasPreviousSibling() && currNode.getPreviousSibling().getPreviousSibling().getText().equals("CONSTRAINTS")) {
			String prevNodeText = currNode.getPreviousSibling().getText();
			if (prevNodeText.length() <= 0 || prevNodeText.charAt(prevNodeText.length() - 1) == ';') {
				completeAggregateProposal(context, acceptor);
				completeConstraintProposal(context, acceptor);
			} else {
				super.completeKeyword(keyword, context, acceptor);
			}
		} else {
			super.completeKeyword(keyword, context, acceptor);
		}
	}

	public void completeConstraintProposal(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Keyword predicate;
		predicate = (Keyword) grammarAccess.getPreDefinedPredicatesAccess().getPredNameCallToKeyword_2_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getPreDefinedPredicatesAccess().getPredNameLengthKeyword_4_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getPreDefinedPredicatesAccess().getPredNameNeverTypeOfKeyword_0_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getPreDefinedPredicatesAccess().getPredNameNoCallToKeyword_1_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getPreDefinedPredicatesAccess().getPredNameNotHardCodedKeyword_3_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getConsPredAccess().getConsPredAlgKeyword_0_0_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getConsPredAccess().getConsPredModeKeyword_0_1_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getConsPredAccess().getConsPredPadKeyword_0_2_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getConsPredAccess().getPartPartKeyword_1_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
		predicate = (Keyword) grammarAccess.getArrayElementsAccess().getElElementsKeyword_0_0_0();
		completeproposal(predicate.getValue(), context, acceptor);
	}

	public void completeproposal(String word, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		ICompletionProposal proposal = createCompletionProposal(word, word, getImage(keyword), contentAssistContext);
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}

	public void completeAggregateProposal(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		context.getRootNode().getChildren().forEach(item -> {
			if (item.getText().equals("OBJECTS")) {
				item.getNextSibling().getLeafNodes().forEach(item2 -> {
					if (item2.getText().equals(";")) {
						String text = null;
						text = item2.getPreviousSibling().getText().substring(1);
						completeproposal(text, context, acceptor);
					}
				});
			}
		});
	}

	public String getSelectedClassName(ContentAssistContext context) {
		String classname = null;
		BidiIterable<INode> childrens = context.getRootNode().getChildren();
		for (INode children : childrens) {
			if (children.getText().equals("SPEC")) {
				classname = children.getNextSibling().getText().replaceAll("\\s+", "");
			}
		}
		return classname;
	}

	public Collection<String> getProjectClassPath(ContentAssistContext context) {
		URI uri = context.getRootModel().eResource().getURI();
		if (uri.isPlatform()) {
			String platformString = uri.toPlatformString(true);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();

			IFile file = root.getFile(new Path(platformString));
			IProject project = file.getProject();
			IJavaProject targetProject;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					targetProject = JavaCore.create(project);
					Collection<String> classpath = ClassPathSolver.getClasspath(targetProject);
					return classpath;
				}

			}
			catch (CoreException e) {
				System.out.println(e.getMessage());
			}

		}
		return null;
	}

	public Class<?> getClassMethods(String classname, Collection<String> classpath) {
		Class<?> c;
		for (String path : classpath) {
			c = ClassLoader.LoadFromJar(classname, path);
			if (c != null) {
				return c;
			}
		}
		return null;
	}

	public void addMethodstoProposal(Class<?> claz, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ArrayList<String> methodList = new ArrayList<>();
		Method[] methods = claz.getDeclaredMethods();
		for (Method method : methods) {
			if (Modifier.isPublic(method.getModifiers())) {
				if (!methodList.contains(method.getName())) {
					methodList.add(method.getName() + "()");
					completeproposal(method.getName() + "()", context, acceptor);
				}
			}
		}
		Constructor constructors[] = claz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			completeproposal(constructor.getName().substring(constructor.getName().lastIndexOf(".") + 1) + "()", context, acceptor);
		}
	}

}
