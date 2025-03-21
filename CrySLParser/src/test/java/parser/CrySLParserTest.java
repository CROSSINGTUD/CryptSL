package parser;

import crysl.CrySLParser;
import crysl.rule.CrySLRule;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class CrySLParserTest {

    private static final String emptyZipFilePath = "src/test/resources/parser/empty.zip";
    private static final String jcaRulesetZipFilePath =
            "src/test/resources/parser/JavaCryptographicArchitecture-3.0.1-ruleset.zip";
    private static final String junkRuleSet = "src/test/resources/parser/rulesetWithJunk.zip";

    @Test
    public void testNumberOfRules() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromPath(jcaRulesetZipFilePath);

        Assert.assertEquals(49, rules.size());
    }

    @Test
    public void testRulesZipFile() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromZipArchive(jcaRulesetZipFilePath);

        Assert.assertEquals(49, rules.size());
    }

    @Test
    public void testJunkThrows() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromPath(junkRuleSet);

        Assert.assertEquals(48, rules.size());
    }

    @Test
    public void testFileNoCrySLFiles() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromPath(emptyZipFilePath);

        Assert.assertEquals(0, rules.size());
    }

    @Test(expected = IOException.class)
    public void testFileNotExists() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromPath("notExist");
        Assert.assertEquals(0, rules.size());
    }

    @Test
    public void testRunTwiceSameResult() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules = parser.parseRulesFromPath(jcaRulesetZipFilePath);
        Assert.assertEquals(49, rules.size());

        rules = parser.parseRulesFromPath(jcaRulesetZipFilePath);
        Assert.assertEquals(49, rules.size());
    }

    @Test
    public void testFileIsOnClassPath() throws IOException {
        // Add external classes to classpath
        Path path = Path.of("src/test/resources/parser/classpath/ClassPathExample.jar");

        CrySLParser parser = new CrySLParser(Collections.singleton(path));
        Collection<CrySLRule> rules =
                parser.parseRulesFromPath("src/test/resources/parser/classpath/rules/");

        // Parser should be able to parse the rule because we add the class to the classpath
        // explicitly
        Assert.assertEquals(1, rules.size());
    }

    @Test
    public void testFileIsNotOnClassPath() throws IOException {
        CrySLParser parser = new CrySLParser();
        Collection<CrySLRule> rules =
                parser.parseRulesFromPath("src/test/resources/parser/classpath/rules/");

        // Example is not on the classpath, so the model reader should not be able to resolve the
        // class
        Assert.assertEquals(0, rules.size());
    }
}
