package de.darmstadt.tu.crossing.scoping;
import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.scoping.IScope;

public class SilencedImportedNamesAdapter extends ImportedNamesAdapter {

	@Override
	public IScope wrap(IScope scope) {
		return new SilentWrappingScope(scope);
	}

	protected class SilentWrappingScope extends WrappingScope {

		SilentWrappingScope(IScope scope) {
			super(scope);
		}

		@Override
		protected void handleNoNameQuery() {
			// NOOP
		}

	}

}