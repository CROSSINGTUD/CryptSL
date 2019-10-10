package de.darmstadt.tu.crossing.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ui.util.FileOpener;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider;
import org.apache.log4j.Logger;
import org.eclipse.xtext.ui.wizard.template.Messages;
import org.eclipse.xtext.ui.wizard.template.NewFileWizardPrimaryPage;
import org.eclipse.xtext.ui.wizard.template.TemplateFileInfo;
import org.eclipse.xtext.ui.wizard.template.TemplateLabelProvider;
import org.eclipse.xtext.ui.wizard.template.TemplateNewFileWizard;
import org.eclipse.xtext.ui.wizard.template.TemplateParameterPage;
import org.eclipse.xtext.ui.wizard.template.TemplateVariable;
import org.eclipse.xtext.ui.wizard.template.WorkspaceFileGenerator;

import com.google.inject.Inject;

public class CryptSLNewFileWizard extends Wizard implements INewWizard {
	/**
	 * mirrored from { @see
	 * org.eclipse.xtext.ui.wizard.template.TemplateNewFileWizard} to change new
	 * file wizard primary page.
	 * 
	 */
	private static final String FILE_TEMPLATE_PROVIDER_EXTENSION_POINT_ID = "org.eclipse.xtext.ui.fileTemplate"; //$NON-NLS-1$
	private static final String FILE_TEMPLATE_PROVIDER_ID = "fileTemplateProvider"; //$NON-NLS-1$
	private static final String FILE_TEMPLATE_PROVIDER_GRAMMAR_NAME_ATTRIBUTE = "grammarName"; //$NON-NLS-1$
	private static final String FILE_TEMPLATE_PROVIDER_GRAMMAR_CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$

	private static final Logger logger = Logger.getLogger(TemplateNewFileWizard.class);

	protected IStructuredSelection selection;
	protected CryptSLNewFileWizardPrimaryPage mainPage;
	protected TemplateParameterPage templateParameterPage;

	@Inject
	private TemplateLabelProvider labelProvider;
	@Inject
	private FileOpener fileOpener;
	@Inject
	private IGrammarAccess grammarAccess;

	private IWorkbench workbench;

	private AbstractFileTemplate[] templates;

	public CryptSLNewFileWizard() {
		setNeedsProgressMonitor(true);
		setWindowTitle(de.darmstadt.tu.crossing.ui.wizard.Messages.CryptSL_Wizard_Title);
	}

	/**
	 * {@inheritDoc} 
	 * createMainPage method is changed
	 */
	@Override
	public void addPages() {
		templates = loadTemplatesFromExtensionPoint();
		mainPage = createMainPage("basicNewFilePage"); //$NON-NLS-1$
		addPage(mainPage);
		setForcePreviousAndNextButtons(hasMoreThenOneTemplate());
	}

	/**
	 * creates and returns first page of file wizard
	 */
	protected CryptSLNewFileWizardPrimaryPage createMainPage(String pageName) {
		CryptSLNewFileWizardPrimaryPage newpage = new CryptSLNewFileWizardPrimaryPage(pageName, templates, selection,
				labelProvider);
		return newpage;
	}

	protected String getGrammarName() {
		return grammarAccess.getGrammar().getName();
	}

	protected CryptSLTemplateFileInfo getFileInfo() {
		return mainPage.getFileInfo();
	}

	@Override
	public boolean performFinish() {
		final CryptSLTemplateFileInfo info = getFileInfo();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(info, monitor);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage()); //$NON-NLS-1$
			return false;
		}
		return true;
	}

	protected void doFinish(final CryptSLTemplateFileInfo info, final IProgressMonitor monitor) {
		try {
			CryptSLFile fileTemplate = (CryptSLFile) info.getFileTemplate();
			WorkspaceFileGenerator fileGenerator = new WorkspaceFileGenerator();
			fileTemplate.setTemplateInfo(info);
			fileTemplate.generateFiles(fileGenerator);
			fileGenerator.run(monitor);
			fileOpener.selectAndReveal(fileGenerator.getResult());
			fileOpener.openFileToEdit(getShell(), fileGenerator.getResult());
		} catch (final InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (final InterruptedException e) {
			// cancelled by user, ok
			return;
		}
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof NewFileWizardPrimaryPage && hasMoreThenOneTemplate()) {
			CryptSLFile selectedTemplate = (CryptSLFile) mainPage.getSelectedTemplate();
			List<TemplateVariable> variables = selectedTemplate.getVariables();
			if (variables.isEmpty())
				return null;
			selectedTemplate.setTemplateInfo(getFileInfo());
			TemplateParameterPage parameterPage = new TemplateParameterPage(selectedTemplate);

			parameterPage.setWizard(this);
			templateParameterPage = parameterPage;
			parameterPage.setTitle(page.getTitle());
			parameterPage.setDescription(page.getDescription());
			return parameterPage;
		}
		return super.getNextPage(page);
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		if (page instanceof TemplateParameterPage) {
			templateParameterPage = null;
			return mainPage;
		}
		return super.getPreviousPage(page);
	}

	@Override
	public boolean canFinish() {
		return super.canFinish() && (templateParameterPage == null ? true : templateParameterPage.isPageComplete());
	}

	private boolean hasMoreThenOneTemplate() {
		return templates.length > 1;
	}

	private AbstractFileTemplate[] loadTemplatesFromExtensionPoint() {
		List<AbstractFileTemplate> result = new ArrayList<>();
		for (IConfigurationElement element : Platform.getExtensionRegistry()
				.getConfigurationElementsFor(FILE_TEMPLATE_PROVIDER_EXTENSION_POINT_ID)) {
			if (FILE_TEMPLATE_PROVIDER_ID.equals(element.getName())
					&& getGrammarName().equals(element.getAttribute(FILE_TEMPLATE_PROVIDER_GRAMMAR_NAME_ATTRIBUTE))) {
				try {
					IFileTemplateProvider provider = (IFileTemplateProvider) element
							.createExecutableExtension(FILE_TEMPLATE_PROVIDER_GRAMMAR_CLASS_ATTRIBUTE);
					result.addAll(Arrays.asList(provider.getFileTemplates()));
				} catch (CoreException e) {
					logger.error(
							"Can not instantiate '" //$NON-NLS-1$
									+ element.getAttribute(FILE_TEMPLATE_PROVIDER_GRAMMAR_CLASS_ATTRIBUTE) + "'", //$NON-NLS-1$
							e);
				}
			}
		}
		return result.toArray(new AbstractFileTemplate[0]);
	}

}