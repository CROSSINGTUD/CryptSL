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
public final class CrySLFile extends AbstractFileTemplate {
	private CrySLTemplateFileInfo info;
	// store classaName provided by the user.
	private String javaClassName;
	private CrySLFileContentGenerator fileContentGenerator;

	@Override
	public void generateFiles(IFileGenerator generator) {
		String content = "";
		javaClassName = getCryptoClassName().replaceAll("\\s", "");
		// the directory which will be used to store new generated file
		String folderDir = getFolder() + System.getProperty("file.separator")
				+ CrySLFileUtil.createPath(javaClassName);
		if (generator instanceof WorkspaceFileGenerator) {
			// create an crySLFileContentGenerator object
			fileContentGenerator = new CrySLFileContentGenerator();
			try {
				// get the java class for given classname
				// if it exists in jvm libraries, e.g: JCA
				Class claz = Class.forName(javaClassName);
				content = fileContentGenerator.generateContent(claz, javaClassName);
				CrySLFileUtil.generateDirectory(getFolder(), javaClassName);
			} catch (ClassNotFoundException e) {
				// if fail first check project's class path.
				Collection<String> classpath = CrySLFileUtil.getProjectClassPath(getFolder());
				Class<?> claz = CrySLFileUtil.getClass(javaClassName, classpath);
				content = fileContentGenerator.generateContent(claz, javaClassName);
				CrySLFileUtil.generateDirectory(getFolder(), javaClassName);
			}
		}
		generator.generate(folderDir + "/" + getName() + ".crysl", content);

	}

	void setTemplateInfo(CrySLTemplateFileInfo info) {
		this.info = info;
	}

	protected TemplateFileInfo getTemplateInfo() {
		return this.info;
	}

	protected String getFolder() {
		return info.getFolder();
	}

	protected String getName() {
		if (info.getName().endsWith(".crysl")) {
			return info.getName().replace(".crysl", "");
		}
		return info.getName();
	}

	protected String getCryptoClassName() {
		return info.getCryptoClassName();
	}
}