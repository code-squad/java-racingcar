package junit.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void add() {
        assertEquals(16, cal.add(12,4));
    }

    @Test
    public void subtract() {
        assertEquals(8, cal.subtract(12,4));
    }

    @Test
    public void multiply() {
        assertEquals(48, cal.multiply(12,4));
    }

    @Test
    public void divide() {
        assertEquals(3, cal.divide(12,4));
    }
}