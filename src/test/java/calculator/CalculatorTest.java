package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp()  {
        cal = new Calculator();
    }

    @Test
    public void mainTest(){
        cal.start("2 + 3 * 4 / 2");
        assertEquals(10,cal.calculate());
    }

    @After
    public void tearDown() {
        cal = null;
    }


}
