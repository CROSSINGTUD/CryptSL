/*
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CryptSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/darmstadt/tu/crossing/parser/antlr/internal/InternalCryptSL.tokens");
	}
}
