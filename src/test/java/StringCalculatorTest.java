import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import stringcalculator.StringCalculator;

public class StringCalculatorTest {
    StringCalculator cal;

    @Before
    public void setUp(){
        cal = new StringCalculator();
    }

    @Test
    public void running(){
        assertEquals(10, cal.run("2 + 3 * 4 / 2"));
    }

    @After
    public void tearDown() {
        cal = null;
    }

}
