/*
* generated by Xtext
*/
package org.xtext.example.hellobuck.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HelloBuckAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/hellobuck/parser/antlr/internal/InternalHelloBuck.tokens");
	}
}
