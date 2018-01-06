package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDeciderToGoTest {
    private SimpleDeciderToGo simpleDeciderToGo;

    @Before
    public void setUp() throws Exception {
        simpleDeciderToGo = new SimpleDeciderToGo();
    }

    @Test
    public void canWeGo() throws Exception {
        int trueCount = 0;
        int falseCount = 0;

        for (int i=0; i<10000; i++) {
            if (simpleDeciderToGo.canWeGo()) {
                trueCount++;
                continue;
            }

            falseCount++;
        }

        assertTrue(trueCount > 0);
        assertTrue(falseCount > 0);
    }
}