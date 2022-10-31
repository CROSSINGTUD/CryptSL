/*
 * generated by Xtext 2.28.0
 */
package de.darmstadt.tu.crossing.ui;

import com.google.inject.Injector;
import de.darmstadt.tu.crossing.CrySL.ui.internal.CrySLActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CrySLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CrySLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CrySLActivator activator = CrySLActivator.getInstance();
		return activator != null ? activator.getInjector(CrySLActivator.DE_DARMSTADT_TU_CROSSING_CRYSL) : null;
	}

}
