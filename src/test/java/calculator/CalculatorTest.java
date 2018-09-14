package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        cal = null;
    }

    @Test
    public void add() {
        assertEquals(7, cal.add(3, 4));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(1, cal.subtract(5, 4));
        System.out.println("substract");
    }

    @Test
    public void multiply() {
        assertEquals(6, cal.multiply(2, 3));
        System.out.println("multiply");
    }

    @Test
    public void divide() {
        assertEquals(2, cal.divide(8, 4));
        System.out.println("divide");
    }
}