/**
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing;

import de.darmstadt.tu.crossing.CryptSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CryptSLStandaloneSetup extends CryptSLStandaloneSetupGenerated {
  public static void doSetup() {
    CryptSLStandaloneSetup _cryptSLStandaloneSetup = new CryptSLStandaloneSetup();
    _cryptSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
