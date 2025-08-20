package rules.vulnerabilities;

import crysl.CrySLParser;
import crysl.parsing.CrySLParserException;
import crysl.rule.CrySLRule;
import crysl.rule.CrySLVulnerabilityEntry;
import java.io.File;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

public class VulnerabilitiesTest {
    private static final String TEST_PATH =
            "."
                    + File.separator
                    + "src"
                    + File.separator
                    + "test"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "vulnerabilitiesRules"
                    + File.separator;

    @Test
    public void testVulnerabilities() {
        CrySLRule rule = getRule("ClassWithVulnerabilities.crysl");
        Collection<CrySLVulnerabilityEntry> vulnerabilities = rule.getCves();

        // Test if there is a weakness
        Assert.assertEquals(1, vulnerabilities.size());

        CrySLVulnerabilityEntry entry = vulnerabilities.iterator().next();
        Assert.assertEquals("CVE-2025-8269", entry.getId());
        Assert.assertEquals("https://www.cve.org/CVERecord?id=CVE-2025-8269", entry.getUrl());
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
