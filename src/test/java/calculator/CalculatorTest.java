package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void 덧셈() {
        Calculator calculator = new Calculator("3 + 4");
        Assert.assertEquals(7, calculator.calculate());
    }

    @Test
    public void 뺄셈() {
        Calculator calculator = new Calculator("3 - 4");
        Assert.assertEquals(-1, calculator.calculate());
    }

    @Test
    public void 곱셈() {
        Calculator calculator = new Calculator("3 * 4");
        Assert.assertEquals(12, calculator.calculate());
    }

    @Test
    public void 나눗셈() {
        Calculator calculator = new Calculator("12 / 4");
        Assert.assertEquals(3, calculator.calculate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void 입력값이_Null_일때() {
        Calculator calculator = new Calculator(null);
        calculator.calculate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 입력값이_비어_있을_일때() {
        Calculator calculator = new Calculator("");
        calculator.calculate();
    }
}