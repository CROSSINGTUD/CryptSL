/*
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.ui.tests;

import com.google.inject.Injector;
import de.darmstadt.tu.crossing.CryptSL.ui.internal.CryptSLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CryptSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CryptSLActivator.getInstance().getInjector("de.darmstadt.tu.crossing.CryptSL");
	}

}
