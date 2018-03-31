import calculator.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void 덧셈() {
        int result = Calculator.calculate("2 + 3 * 4 / 2");
        assertThat(result).isEqualTo(10);
    }
}
