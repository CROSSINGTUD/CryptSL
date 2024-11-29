package rules.statemachine;

import crysl.CrySLParser;
import crysl.parsing.CrySLParserException;
import crysl.rule.CrySLRule;
import crysl.rule.StateMachineGraph;
import crysl.rule.TransitionEdge;
import java.io.File;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;

public class StateMachineTest {

    private static final String TEST_PATH =
            "."
                    + File.separator
                    + "src"
                    + File.separator
                    + "test"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "stateMachineRules"
                    + File.separator;
    private static final String CRYSL_FILE = "StateMachineTester.crysl";

    @Test
    public void testOptionalAfterStar() {
        // (Op1?, Op2, Op3)*
        StateMachineGraph smg = getStateMachineGraph("optionalAfterStar");
        Collection<TransitionEdge> edges = smg.getEdges();

        Assert.assertEquals(edges.size(), 7);
        Assert.assertTrue(stateMachineContainsEdge("-1", "0", edges));
        Assert.assertTrue(stateMachineContainsEdge("0", "1", edges));
        Assert.assertTrue(stateMachineContainsEdge("0", "2", edges));
        Assert.assertTrue(stateMachineContainsEdge("1", "2", edges));
        Assert.assertTrue(stateMachineContainsEdge("2", "3", edges));
        Assert.assertTrue(stateMachineContainsEdge("3", "1", edges));
        Assert.assertTrue(stateMachineContainsEdge("3", "2", edges));
    }

    @Test
    public void testOptionalBetweenStar() {
        // (Op1, Op2?, Op3)*
        StateMachineGraph smg = getStateMachineGraph("optionalBetweenStar");
        Collection<TransitionEdge> edges = smg.getEdges();

        Assert.assertEquals(edges.size(), 6);
        Assert.assertTrue(stateMachineContainsEdge("-1", "0", edges));
        Assert.assertTrue(stateMachineContainsEdge("0", "1", edges));
        Assert.assertTrue(stateMachineContainsEdge("1", "2", edges));
        Assert.assertTrue(stateMachineContainsEdge("1", "3", edges));
        Assert.assertTrue(stateMachineContainsEdge("2", "3", edges));
        Assert.assertTrue(stateMachineContainsEdge("3", "1", edges));
        Assert.assertFalse(stateMachineContainsEdge("3", "2", edges));
    }

    private StateMachineGraph getStateMachineGraph(String ruleName) {
        try {
            CrySLParser parser = new CrySLParser();

            CrySLRule rule =
                    parser.parseRuleFromFile(
                            new File(TEST_PATH + ruleName + File.separator + CRYSL_FILE));
            return rule.getUsagePattern();
        } catch (CrySLParserException e) {
            throw new RuntimeException("Unable to find rules for " + ruleName, e);
        }
    }

    private boolean stateMachineContainsEdge(
            String from, String to, Collection<TransitionEdge> edges) {
        for (TransitionEdge edge : edges) {
            if (edge.from().getName().equals(from) && edge.to().getName().equals(to)) {
                return true;
            }
        }
        return false;
    }
}
