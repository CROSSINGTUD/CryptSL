package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider;

public class CrySLSprayFileTemplateProvider  implements IFileTemplateProvider {

	@Override
	public AbstractFileTemplate[] getFileTemplates() {
		AbstractFileTemplate[] template = new AbstractFileTemplate[1];
		CrySLFile newFile = new CrySLFile();
		template[0]=newFile;
		return template;
	}

}