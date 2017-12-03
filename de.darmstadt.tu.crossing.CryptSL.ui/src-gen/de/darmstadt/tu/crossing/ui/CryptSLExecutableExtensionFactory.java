/*
 * generated by Xtext 2.13.0
 */
package de.darmstadt.tu.crossing.ui;

import com.google.inject.Injector;
import de.darmstadt.tu.crossing.CryptSL.ui.internal.CryptSLActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CryptSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CryptSLActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CryptSLActivator activator = CryptSLActivator.getInstance();
		return activator != null ? activator.getInjector(CryptSLActivator.DE_DARMSTADT_TU_CROSSING_CRYPTSL) : null;
	}

}
