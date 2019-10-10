package de.darmstadt.tu.crossing.ui.wizard;

import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.TemplateFileInfo;
import org.eclipse.xtext.ui.wizard.template.WorkspaceFileGenerator;

@FileTemplate(label = "CrySL File wizard", icon = "cognicrypt.png", description = "Create a file with CrySL File Wizard")
public final class CryptSLFile extends AbstractFileTemplate {
	private CryptSLTemplateFileInfo info;
	// store classaName provided by the user.
	private String javaClassName;
	private CryptSLFileContentGenerator fileContentGenerator;

	@Override
	public void generateFiles(IFileGenerator generator) {
		String content = "";
		javaClassName = getCryptoClassName().replaceAll("\\s", "");
		// the directory which will be used to store new generated file
		String folderDir = getFolder() + System.getProperty("file.separator")
				+ CryptSLFileUtil.createPath(javaClassName);
		if (generator instanceof WorkspaceFileGenerator) {
			// create an cryptSLFileContentGenerator object
			fileContentGenerator = new CryptSLFileContentGenerator();
			try {
				// get the java class for given classname
				// if it exists in jvm libraries, e.g: JCA
				Class claz = Class.forName(javaClassName);
				content = fileContentGenerator.generateContent(claz, javaClassName);
				CryptSLFileUtil.generateDirectory(getFolder(), javaClassName);
			} catch (ClassNotFoundException e) {
				// if fail first check project's class path.
				Collection<String> classpath = CryptSLFileUtil.getProjectClassPath(getFolder());
				if (classpath != null && CryptSLFileUtil.getClassMethods(javaClassName, classpath) != null) {
					Class<?> claz = CryptSLFileUtil.getClassMethods(javaClassName, classpath);
					content = fileContentGenerator.generateContent(claz, javaClassName);
					String dir = CryptSLFileUtil.generateDirectory(getFolder(), javaClassName);
				} else {
					// if class not found on project's class path display a messageBox.
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							MessageBox messageBox = new MessageBox(Display.getDefault().getActiveShell(),
									SWT.ICON_ERROR);
							messageBox.setMessage(javaClassName + " not found on project class path.");
							int result = messageBox.open();
						}
					});
					System.err.println("'" + javaClassName + "'" + " not found on project's class path." + e);
					return;

				}
			}
		}
		generator.generate(folderDir + "/" + getName() + ".cryptsl", content);

	}

	void setTemplateInfo(CryptSLTemplateFileInfo info) {
		this.info = info;
	}

	protected TemplateFileInfo getTemplateInfo() {
		return this.info;
	}

	protected String getFolder() {
		return info.getFolder();
	}

	protected String getName() {
		return info.getName();
	}

	protected String getCryptoClassName() {
		return info.getCryptoClassName();
	}
}