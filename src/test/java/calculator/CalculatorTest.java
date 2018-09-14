package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test
    public void getCalculate1() {
        cal.setInput("3 + 4 + 5");
        assertEquals(cal.getCalculate(), 12);
    }

    @Test
    public void getCalculate2() {
        cal.setInput("3 + 4 * 5");
        assertEquals(cal.getCalculate(), 35);
    }

    @Test
    public void getCalculate3() {
        cal.setInput("3 + 4 + 5 / 3");
        assertEquals(cal.getCalculate(), 4);
    }
}