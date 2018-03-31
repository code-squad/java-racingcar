package calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class CalculatorTest {

    @Test
    public void sum() {
        int result = Calculator.calculate("1 + 2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void subtract() {
        int result = Calculator.calculate("5 - 3");
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void multiply() {
        int result = Calculator.calculate("5 * 2");
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void divide() {
        int result = Calculator.calculate("6 / 2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void 입력값이_3개() {
        int result = Calculator.calculate("1 + 2 + 3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 복합계산() {
        int result = Calculator.calculate("1 + 2 - 3 + 10 / 2");
        assertThat(result).isEqualTo(5);
    }


}
