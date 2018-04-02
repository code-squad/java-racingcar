package calculator;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void 문자열을_수식을_입력하여_답을_얻는다() {
        Assert.assertThat(calculator.calculate("2 + 3 * 4 / 2"), is(10));
        Assert.assertThat(calculator.calculate("2 + 3 * 4"), is(20));
    }

    @Test
    public void 숫자를_더한다() {
        Assert.assertThat(calculator.add(2, 3), is(5));
        Assert.assertThat(calculator.add(2, 1), is(3));
    }

    @Test
    public void 숫자를_뺀다() {
        Assert.assertThat(calculator.subtract(5, 3), is(2));
        Assert.assertThat(calculator.subtract(5, 1), is(4));
    }

    @Test
    public void 숫자를_곱한다() {
        Assert.assertThat(calculator.multiply(5, 3), is(15));
        Assert.assertThat(calculator.multiply(5, 1), is(5));
    }
    
    @Test
    public void 숫자를_나눈다() {
        Assert.assertThat(calculator.divide(6, 3), is(2));
        Assert.assertThat(calculator.divide(5, 1), is(5));
    }
}