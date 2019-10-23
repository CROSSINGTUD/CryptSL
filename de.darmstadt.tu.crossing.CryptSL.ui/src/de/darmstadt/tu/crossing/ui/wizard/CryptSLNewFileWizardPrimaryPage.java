package de.darmstadt.tu.crossing.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.IParameterPage;
import org.eclipse.xtext.ui.wizard.template.Messages;
import org.eclipse.xtext.ui.wizard.template.TemplateFileInfo;
import org.eclipse.xtext.ui.wizard.template.TemplateLabelProvider;
import de.darmstadt.tu.crossing.ui.utils.ClassPathLoader;

/**
 * mirrored from { @see
 * org.eclipse.xtext.ui.wizard.template.NewFileWizardPrimaryPage} to custimize
 * first page of CryptSLNewFileWizard. Allows user to select the source folder,
 * and edit the text fields for className and fileName parameters. Provides a
 * content proposal for className based on the project's class path.
 * 
 */

public class CryptSLNewFileWizardPrimaryPage extends WizardPage implements IParameterPage {
	public static final String label_FileName = "File Name:";
	public static final String label_ClassName = "Class Name:";
	public static final String label_FolderName = "Source Folder:";
	private final AbstractFileTemplate[] templates;
	private final IStructuredSelection selection;

	// Text field for source folder selection
	private Text sourceFolder;
	// Text field for crypto class name
	private Text classText;
	// Text field for naming new cryptsl file
	private Text fileText;

	private CryptSLComposite parameterComposite;

	private ComboViewer templateCombo;
	private TemplateLabelProvider labelProvider;

	protected CryptSLNewFileWizardPrimaryPage(String pageName, AbstractFileTemplate[] templates,
			IStructuredSelection selection, TemplateLabelProvider labelProvider) {
		super(pageName);
		this.templates = templates;
		this.selection = selection;
		this.labelProvider = labelProvider;
	}

	@Override
	public void createControl(Composite parent) {
		setTitle(de.darmstadt.tu.crossing.ui.wizard.Messages.Control_Page_Title);
		if (hasExactlyOneTemplate()) {
			setDescription(getSelectedTemplate().getDescription());
		} else {
			setDescription(de.darmstadt.tu.crossing.ui.wizard.Messages.PrimaryPage_Description);
		}
		Composite main = new Composite(parent, SWT.NONE);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		main.setLayout(new GridLayout(2, false));
		createHeader(main);
		createTemplateWidgets(main);
		setControl(main);
		validateInitial();
	}

	private void createHeader(Composite parent) {
		Composite main = new Composite(parent, SWT.NONE);
		main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		main.setLayout(new GridLayout(3, false));

		Label projectLabel = new Label(main, SWT.NONE);
		projectLabel.setText(label_FolderName);
		projectLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		sourceFolder = new Text(main, SWT.SINGLE | SWT.BORDER);
		sourceFolder.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button projectBrowseButton = new Button(main, SWT.PUSH);
		projectBrowseButton.setText(Messages.NewFileWizardPrimaryPage_browse_button);
		projectBrowseButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		Label classLabel = new Label(main, SWT.NONE);
		classLabel.setText(label_ClassName);
		classLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		classText = new Text(main, SWT.SINGLE | SWT.BORDER);
		classText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		classText.setFocus();

		Label fileLabel = new Label(main, SWT.NONE);
		fileLabel.setText(label_FileName);
		fileLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		fileText = new Text(main, SWT.SINGLE | SWT.BORDER);
		fileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		fileText.setFocus();

		createNote(parent, true);

		if (getFolderFromSelection() != null) {
			sourceFolder.setText(getFolderFromSelection());
			if (!sourceFolder.getText().trim().isEmpty()) {
				getContentProposal();
			}
		}
		sourceFolder.addModifyListener(a -> validate());
		projectBrowseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CryptSLContainerSelectionDialog dialog = new CryptSLContainerSelectionDialog(
						Display.getDefault().getActiveShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
						Messages.NewFileWizardPrimaryPage_selection_description);
				if (dialog.open() == Window.OK) {
					sourceFolder.setText(getFolderFromPath((IPath) dialog.getResult()[0]));
					getContentProposal();
				}
			}
		});

		classText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				classText.setToolTipText(de.darmstadt.tu.crossing.ui.wizard.Messages.ClassName_ToolTip_Message);
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				setFileName();
			}

		});

		sourceFolder.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				sourceFolder.setToolTipText(de.darmstadt.tu.crossing.ui.wizard.Messages.Select_Project);
			}

			@Override
			public void focusLost(FocusEvent arg0) {
			}

		});

		fileText.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				fileText.setToolTipText(de.darmstadt.tu.crossing.ui.wizard.Messages.FileName_ToolTip_Message);
			}

			@Override
			public void focusLost(FocusEvent arg0) {
			}

		});

		fileText.setText(classText.getText());
		fileText.addModifyListener(e -> {
			validate();
		});

	}

	public String[] getClassses(Collection<String> classpath) {
		List<String> classes = new ArrayList<String>();
		for (String path : classpath) {
			if (!ClassPathLoader.LoadClassListFromPath(path).isEmpty()) {
				classes.addAll(ClassPathLoader.LoadClassListFromPath(path));
			}
		}
		if (!classes.isEmpty()) {
			String[] classArr = new String[classes.size()];
			classArr = classes.toArray(classArr);
			return classArr;
		}
		return null;
	}

	private String getFolderFromSelection() {
		Object element = selection.getFirstElement();
		IContainer container = null;
		if (element instanceof IContainer) {
			container = (IContainer) element;
		} else if (element instanceof IResource) {
			container = ((IResource) element).getParent();
		} else if (element instanceof IAdaptable) {
			IResource adapter = ((IAdaptable) element).getAdapter(IResource.class);
			if (adapter instanceof IContainer) {
				container = (IContainer) adapter;
			} else if (adapter != null) {
				container = adapter.getParent();
			}
		}
		if (container != null) {
			return getFolderStringFromContainer(container);
		}
		return ""; //$NON-NLS-1$
	}

	private String getFolderStringFromContainer(IContainer container) {
		IProject project = container.getProject();
		IContainer src;
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				IResource[] members = project.members();
				for (IResource member : members) {
					if (member instanceof IContainer) {
						src = (IContainer) member;
						// check whether container name is "src", if yes return.
						if ("src".equals(member.getName())) {
							return getFolderFromPath(src.getFullPath());
						}
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String getFolderFromPath(IPath path) {
		String result = path.toOSString();
		if (result.startsWith(File.separator)) {
			return result.substring(File.separator.length());
		}
		return result;
	}

	private void createTemplateWidgets(Composite main) {
		if (hasExactlyOneTemplateWithVariables()) {
			Label seperator = new Label(main, SWT.SEPARATOR | SWT.HORIZONTAL);
			seperator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
			parameterComposite = new CryptSLComposite(main, SWT.NONE, templates[0], this);
			parameterComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		} else if (hasMoreThenOneTempalte()) {
			Label seperator = new Label(main, SWT.SEPARATOR | SWT.HORIZONTAL);
			seperator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
			Label templateLabel = new Label(main, SWT.NONE);
			templateLabel.setText(Messages.NewFileWizardPrimaryPage_template_label);
			templateLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
			templateCombo = new ComboViewer(main);
			templateCombo.setLabelProvider(labelProvider);
			templateCombo.setContentProvider(new ArrayContentProvider());
			templateCombo.setInput(templates);
			templateCombo.setSelection(new StructuredSelection(templates[0]));
			templateCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
			templateCombo.getCombo().setToolTipText(getSelectedTemplate().getDescription());
			templateCombo.addSelectionChangedListener(e -> {
				templateCombo.getCombo().setToolTipText(getSelectedTemplate().getDescription());
				validate();
				getContainer().updateButtons();
			});
		}
	}

	private boolean hasExactlyOneTemplateWithVariables() {
		return hasExactlyOneTemplate() && templates[0].getVariables().size() > 0;
	}

	private boolean hasExactlyOneTemplate() {
		return templates.length == 1;
	}

	private boolean hasMoreThenOneTempalte() {
		return templates.length > 1;
	}

	private void validateInitial() {
		setStatus(null);
		IContainer projectContainer = getFolder(sourceFolder.getText());
		if (sourceFolder.getText().isEmpty()) {
			setStatus(new Status(IStatus.INFO, "NewFileWizard",
					de.darmstadt.tu.crossing.ui.wizard.Messages.Select_Directory));
			return;
		} else if (projectContainer == null || !projectContainer.exists()) {
			setStatus(new Status(IStatus.ERROR, "NewFileWizard",
					de.darmstadt.tu.crossing.ui.wizard.Messages.Project_NotExixst));
			return;
		}
		if (parameterComposite != null) {
			parameterComposite.validate();
		}
		setPageComplete(false);
	}

	private void setFileName() {
		if (classText.getText().contains(".")) {
			String tempFileName = classText.getText().substring(classText.getText().lastIndexOf(".") + 1);
			String fileName = tempFileName.substring(0, 1).toUpperCase() + tempFileName.substring(1).toLowerCase();
			fileText.setText(fileName);
		}
	}

	private void validate() {
		if (fileText.getText().isEmpty()) {
			setFileName();
		}
		setStatus(null);
		IContainer projectContainer = getFolder(sourceFolder.getText());

		if (getSourceFolder().isEmpty()) {
			setStatus(new Status(IStatus.INFO, "NewFileWizard",
					de.darmstadt.tu.crossing.ui.wizard.Messages.Select_Project));
			return;
		} else if (projectContainer == null || !projectContainer.exists()) {
			setStatus(new Status(IStatus.ERROR, "NewFileWizard",
					de.darmstadt.tu.crossing.ui.wizard.Messages.Project_NotExixst));
			return;
		}

		if (classText.getText().trim().isEmpty()) { // $NON-NLS-1$
			setStatus(new Status(IStatus.ERROR, "NewFileWizard", //$NON-NLS-1$
					de.darmstadt.tu.crossing.ui.wizard.Messages.ClassName_Empty));
			return;
		}

		if (fileText.getText().trim().isEmpty()) { // $NON-NLS-1$
			setStatus(new Status(IStatus.ERROR, "NewFileWizard", //$NON-NLS-1$
					de.darmstadt.tu.crossing.ui.wizard.Messages.FileName_Empty));
			return;
		}

		if (parameterComposite != null) {
			parameterComposite.validate();
		}
		if (getErrorMessage() == null) {
			if (getSelectedTemplate() instanceof CryptSLFile) {
				CryptSLFile template = (CryptSLFile) getSelectedTemplate();
				template.setTemplateInfo(getFileInfo());
				PathCollector fileCollector = new PathCollector();
				template.generateFiles(fileCollector);
				for (CharSequence path : fileCollector.getResult()) {
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path.toString()));
					if (file.exists()) {
						path = path.toString().replace("/", "\\");
						setStatus(new Status(IStatus.ERROR, "NewFileWizard", //$NON-NLS-1$
								Messages.NewFileWizardPrimaryPage_file_already_exist_pre + path
										+ Messages.NewFileWizardPrimaryPage_file_already_exist_post));
						return;
					}

				}
			}
		}
	}

	@Override
	public void setStatus(IStatus status) {
		if (status == null || status.getSeverity() == IStatus.OK) {
			setErrorMessage(null);
			setMessage(null);
			setPageComplete(true);
		} else if (status.getSeverity() == IStatus.ERROR) {
			setErrorMessage(status.getMessage());
			setPageComplete(false);
		} else if (status.getSeverity() == IStatus.WARNING) {
			setErrorMessage(null);
			setMessage(status.getMessage(), IMessageProvider.WARNING);
			setPageComplete(true);
		} else {
			setErrorMessage(null);
			setMessage(status.getMessage(), IMessageProvider.INFORMATION);
			setPageComplete(true);
		}
	}

	private IContainer getFolder(String folderText) {
		try {
			return ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path("/" + folderText)); //$NON-NLS-1$
		} catch (IllegalArgumentException e) {
			try {
				return ResourcesPlugin.getWorkspace().getRoot().getProject(folderText);
			} catch (IllegalArgumentException e1) {
				return null;
			}
		}
	}

	public CryptSLTemplateFileInfo getFileInfo() {
		return new CryptSLTemplateFileInfo(getLocation(), getFileName(), getCryptoClassName(), getSelectedTemplate());
	}

	public String getLocation() {
		return sourceFolder.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}

	/**
	 * be sure in the given class name the first later after the last "." is upper
	 * case
	 * 
	 */
	public String getCryptoClassName() {
		String className = classText.getText();
		int index = className.lastIndexOf(".");
		if (className.contains(".")) {
			String temp = className.substring(0, index + 1);
			temp = temp + className.substring(index + 1, index + 2).toUpperCase();
			className = temp + className.substring(index + 2);
			className.toString().trim();
		}
		return className;
	}

	public AbstractFileTemplate getSelectedTemplate() {
		if (templates.length == 1) {
			return templates[0];
		}
		ISelection selection = templateCombo.getSelection();
		if (selection instanceof IStructuredSelection) {
			return (AbstractFileTemplate) ((IStructuredSelection) selection).getFirstElement();
		}
		return null;
	}

	private final class PathCollector implements IFileGenerator {
		private List<CharSequence> result = new ArrayList<>();

		@Override
		public void generate(CharSequence path, CharSequence content) {
			result.add(path);
		}

		public List<CharSequence> getResult() {
			return result;
		}
	}

	/**
	 * provide a contentproposal based on project's claspath. activated by
	 * "ctrl+space" and '.',' ' chars
	 */
	public void getContentProposal() {
		char[] autoActivationCharacters = new char[] { '.', ' ' };
		KeyStroke keyStroke;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
			Collection<String> classpath = CryptSLFileUtil.getProjectClassPath(sourceFolder.getText());
			if (!classpath.isEmpty()) {
				String[] classes = getClassses(classpath);
				if (classes != null) {
					SimpleContentProposalProvider contentProposalProvider = new SimpleContentProposalProvider(classes);
					contentProposalProvider.setFiltering(true);
					ContentProposalAdapter adapter = new ContentProposalAdapter(classText, new TextContentAdapter(),
							contentProposalProvider, keyStroke, autoActivationCharacters);
					adapter.setPropagateKeys(true);
					adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
				}
			}
		} catch (ParseException e1) {
			e1.printStackTrace();

		}
	}

	private Group createNote(final Composite parent, boolean visible) {
		final Group notePanel = new Group(parent, SWT.NONE);
		notePanel.setText("Note:");
		final GridLayout gridLayout = new GridLayout();
		notePanel.setLayout(gridLayout);
		final GridData gridData = new GridData(GridData.FILL, GridData.FILL, true, false);
		gridData.horizontalSpan = 1;
		notePanel.setLayoutData(gridData);
		final Font boldFont = new Font(notePanel.getDisplay(), new FontData("Arial", 9, SWT.BOLD));
		notePanel.setFont(boldFont);
		notePanel.pack();
		setControl(parent);

		StyledText note = new StyledText(notePanel, SWT.MULTI | SWT.WRAP);
		note.setLayoutData(new GridData(GridData.FILL_BOTH));
		String noteText = de.darmstadt.tu.crossing.ui.wizard.Messages.NoteText1;
		noteText = noteText + "\n" + de.darmstadt.tu.crossing.ui.wizard.Messages.NoteText2;
		note.setText(noteText);

		StyleRange style0 = new StyleRange();
		style0.metrics = new GlyphMetrics(0, 0, 40);
		style0.foreground = parent.getDisplay().getSystemColor(SWT.COLOR_BLACK);
		Bullet bullet0 = new Bullet(style0);
		note.setLineBullet(0, 2, bullet0);

		StyleRange style1 = new StyleRange();
		style1.start = 0;
		style1.length = 11;
		style1.font = boldFont;
		note.setStyleRange(style1);

		StyleRange style2 = new StyleRange();
		style2.start = 98;
		style2.length = 11;
		style2.font = boldFont;
		note.setStyleRange(style2);

		note.setLineBackground(0, 2, parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		note.pack();
		note.setBounds(10, 20, 585, 60);
		note.setSize(note.computeSize(585, SWT.DEFAULT));
		setControl(notePanel);
		note.setEditable(false);
		note.setEnabled(true);
		notePanel.setVisible(visible);
		return notePanel;
	}

	public String getSourceFolder() {
		return sourceFolder.getText();
	}

}