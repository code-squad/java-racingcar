package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class CalculatorTest {


    @Test
    public void 덧셈() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.sub(5, 4));
    }

    @Test
    public void 곱셈() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.mul(6, 2));
    }

    @Test
    public void 나눗셈() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.div(6, 2));
    }

    @Test
    public void 계산기() {
        Calculator calculator = new Calculator();
        assertEquals(28, calculator.init("3 + 4 * 4 / 1"));
    }
}
