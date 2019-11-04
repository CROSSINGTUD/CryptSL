package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.TemplateFileInfo;

public class CryptSLTemplateFileInfo extends TemplateFileInfo{

	private String cryptoClassName;
	
	public CryptSLTemplateFileInfo(String folder, String name, String cryptoClassName, AbstractFileTemplate template) {
		super(folder, name, template);
		this.cryptoClassName = cryptoClassName;
	}
	
	public String getCryptoClassName() {
		return cryptoClassName;
	}
}
