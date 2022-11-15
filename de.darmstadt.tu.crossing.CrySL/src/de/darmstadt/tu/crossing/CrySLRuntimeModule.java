package de.darmstadt.tu.crossing;

import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.conversion.IValueConverterService;

import de.darmstadt.tu.crossing.scoping.SilencedImportedNamesAdapter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CrySLRuntimeModule extends AbstractCrySLRuntimeModule {

	public Class<? extends ImportedNamesAdapter> bindImportedNamesAdapter() {
		return SilencedImportedNamesAdapter.class;
	}

}
