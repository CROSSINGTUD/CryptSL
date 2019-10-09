package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider;
import de.darmstadt.tu.crossing.ui.AbstractCryptSLUiModule;

public class CryptSLSprayFileTemplateProvider  implements IFileTemplateProvider {

	@Override
	public AbstractFileTemplate[] getFileTemplates() {
		// TODO Auto-generated method stub
		AbstractFileTemplate[] template = new AbstractFileTemplate[1];
		CryptSLFile newFile = new CryptSLFile();
		template[0]=newFile;
		return template;
	}

}