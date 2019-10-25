package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider;

public class CryptSLSprayFileTemplateProvider  implements IFileTemplateProvider {

	@Override
	public AbstractFileTemplate[] getFileTemplates() {
		AbstractFileTemplate[] template = new AbstractFileTemplate[1];
		CryptSLFile newFile = new CryptSLFile();
		template[0]=newFile;
		return template;
	}

}