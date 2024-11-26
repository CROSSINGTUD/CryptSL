package parser;

import de.darmstadt.tu.crossing.CrySLParser;
import de.darmstadt.tu.crossing.rule.CrySLRule;
import java.io.IOException;
import java.util.Collection;
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
}
