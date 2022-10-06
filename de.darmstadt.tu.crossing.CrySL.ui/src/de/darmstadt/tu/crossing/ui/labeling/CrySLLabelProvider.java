package de.darmstadt.tu.crossing.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

public class CrySLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public CrySLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

}
