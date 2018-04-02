package calculator;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10);
        Assertions.assertThat(calculator.calculate("2 + 3 * 4")).isEqualTo(20);
    }

    @Test
    public void 숫자를_더한다() {
        Assertions.assertThat(calculator.add(2, 3)).isEqualTo(5);
        Assertions.assertThat(calculator.add(2, 1)).isEqualTo(3);
    }

    @Test
    public void 숫자를_뺀다() {
        Assertions.assertThat(calculator.subtract(5, 3)).isEqualTo(2);
        Assertions.assertThat(calculator.subtract(5, 1)).isEqualTo(4);
    }

    @Test
    public void 숫자를_곱한다() {
        Assertions.assertThat(calculator.multiply(5, 3)).isEqualTo(15);
        Assertions.assertThat(calculator.multiply(5, 1)).isEqualTo(5);
    }
    
    @Test
    public void 숫자를_나눈다() {
        Assertions.assertThat(calculator.divide(6, 3)).isEqualTo(2);
        Assertions.assertThat(calculator.divide(5, 1)).isEqualTo(5);
    }
}