import calculator.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void 덧셈() {
        int result = Calculator.calculate("2 + 3");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void 뺄셈() {
        int result = Calculator.calculate("3 - 2");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 곱셈() {
        int result = Calculator.calculate("4 * 8");
        assertThat(result).isEqualTo(32);
    }

    @Test
    public void 나눗셈() {
        int result = Calculator.calculate("4 / 2");
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 예제() {
        int result = Calculator.calculate("2 + 3 * 4 / 2");
    }
}
