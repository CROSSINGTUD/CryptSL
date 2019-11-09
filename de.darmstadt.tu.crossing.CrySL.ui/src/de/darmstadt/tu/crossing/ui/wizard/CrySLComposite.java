package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.wizard.template.AbstractTemplate;
import org.eclipse.xtext.ui.wizard.template.IParameterPage;
import org.eclipse.xtext.ui.wizard.template.ParameterComposite;

public class CrySLComposite extends ParameterComposite {
	
	public CrySLComposite(Composite parent, int style, AbstractTemplate template, IParameterPage parameterPage) {
		super(parent, style, template, parameterPage);
	}
	
	@Override
	public void validate() {
		super.validate();
	}
}