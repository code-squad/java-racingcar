import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
    @Test
    public void 더하기() {
        assertThat(Calculator.calculate("1 + 2")).isEqualTo(3);
    }
    @Test
    public void 빼기() {
        assertThat(Calculator.calculate("2 - 1")).isEqualTo(1);
    }
    @Test
    public void 곱하기() {
        assertThat(Calculator.calculate("2 * 4")).isEqualTo(8);
    }
    @Test
    public void 나누기() {
        assertThat(Calculator.calculate("9 / 3")).isEqualTo(3);
    }
}
