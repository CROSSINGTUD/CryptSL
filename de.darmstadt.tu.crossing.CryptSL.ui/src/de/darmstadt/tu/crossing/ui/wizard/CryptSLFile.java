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

@FileTemplate(label="CrySL File wizard", icon="cognicrypt.png", description="Create a file with CrySL File Wizard")
public final class CryptSLFile extends AbstractFileTemplate{
	private CryptSLTemplateFileInfo info;
	private String javaClassName;
	private CryptSLFileContentGenerator fileContentGenerator;
	
	@Override
	public void generateFiles(IFileGenerator generator) {
		String content = "";
		javaClassName = getCryptoClassName().replaceAll("\\s","");
		String folderDir = getFolder() + "/" +CryptSLFileUtil.createPath(javaClassName);
		if(generator instanceof WorkspaceFileGenerator) {
			fileContentGenerator = new CryptSLFileContentGenerator();
			try {
				Class claz = Class.forName(javaClassName);
				content = fileContentGenerator.generateContent(claz,javaClassName);
				CryptSLFileUtil.generateDirectory(getFolder(), javaClassName);
			} catch (ClassNotFoundException e) {
				Collection<String> classpath = CryptSLFileUtil.getProjectClassPath(getFolder());
				if(classpath != null &&  CryptSLFileUtil.getClassMethods(javaClassName,classpath) != null) {
					Class<?> claz =  CryptSLFileUtil.getClassMethods(javaClassName,classpath);
					content = fileContentGenerator.generateContent(claz,javaClassName);
					String dir = CryptSLFileUtil.generateDirectory(getFolder(), javaClassName);
				}else {
					Display.getDefault().asyncExec(new Runnable() {
					    public void run() {
					    	 MessageBox messageBox = new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR);
							 messageBox.setMessage(javaClassName + " not found on project class path.");
							 int result = messageBox.open();
					    }
					});
				 e.printStackTrace();
				 return;
				
				}
			}
		}
		generator.generate(folderDir+"/"+getName()+".cryptsl", content);
		
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