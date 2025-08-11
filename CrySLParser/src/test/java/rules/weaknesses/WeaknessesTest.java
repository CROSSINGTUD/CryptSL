package rules.weaknesses;

import crysl.CrySLParser;
import crysl.parsing.CrySLParserException;
import crysl.rule.CrySLRule;
import crysl.rule.CrySLWeaknessEntry;
import java.io.File;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

public class WeaknessesTest {

    private static final String TEST_PATH =
            "."
                    + File.separator
                    + "src"
                    + File.separator
                    + "test"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "weaknessesRules"
                    + File.separator;

    @Test
    public void testWeaknesses() {
        CrySLRule rule = getRule("ClassWithWeaknesses.crysl");
        Collection<CrySLWeaknessEntry> weaknesses = rule.getCwes();

        // Test if there is a weakness
        Assert.assertEquals(1, weaknesses.size());

        CrySLWeaknessEntry entry = weaknesses.iterator().next();
        Assert.assertEquals("CWE-17", entry.getId());
        Assert.assertEquals("https://cwe.mitre.org/data/definitions/17.html", entry.getUrl());
    }

    private CrySLRule getRule(String fileName) {
        try {
            CrySLParser parser = new CrySLParser();
            return parser.parseRuleFromFile(new File(TEST_PATH + File.separator + fileName));
        } catch (CrySLParserException e) {
            throw new RuntimeException("Could not read file " + fileName, e);
        }
    }
}
