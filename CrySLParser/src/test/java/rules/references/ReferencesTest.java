package rules.references;

import crysl.CrySLParser;
import crysl.parsing.CrySLParserException;
import crysl.rule.CrySLReferenceEntry;
import crysl.rule.CrySLRule;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ReferencesTest {
    private static final String TEST_PATH =
            "."
                    + File.separator
                    + "src"
                    + File.separator
                    + "test"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "referencesRules"
                    + File.separator;

    @Test
    public void testReferences() {
        CrySLRule rule = getRule("ClassWithReferences.crysl");
        Collection<CrySLReferenceEntry> references = rule.getReferences();

        // Test if there is a weakness
        Assert.assertEquals(1, references.size());

        CrySLReferenceEntry entry = references.iterator().next();
        Assert.assertEquals("Name of the Paper", entry.getName());
        Assert.assertEquals("Author", entry.getAuthor());
        Assert.assertEquals("https://example/pages/123.html", entry.getLink());
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9, 10, 11, 15));
        Assert.assertEquals(numbers, entry.getPageNumbers());
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
