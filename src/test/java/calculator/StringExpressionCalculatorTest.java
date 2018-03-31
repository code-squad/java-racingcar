package calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class StringExpressionCalculatorTest {

    /*
    Test Case 목록 구현

    계산 => 2 + 3 * 4 / 2 = 10
    숫자만 입력하는 경우
    연산자만 입력한 경우
    0을 나누는 경우
    공백 없이 입력한 경우
    연산자를 먼저 입력한 경우
    null을 입력한 경우
     */

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private StringExpressionCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringExpressionCalculator();
    }

    @Test
    public void 계산() {
        assertThat(calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10);
        assertThat(calculator.calculate("0 / 2")).isEqualTo(0);
        assertThat(calculator.calculate("-1 / 2")).isEqualTo(0);
        assertThat(calculator.calculate("-10 / 2")).isEqualTo(-5);
    }

    @Test
    public void 숫자만_입력() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate("2 3 4 2");
    }

    @Test
    public void 연산자만_입력() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate("+ * /");
    }

    @Test
    public void 영0_나누기() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate("2 + 3 * 4 / 0");
    }

    @Test
    public void 공백_없이_입력() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate("2+3*4/2");
    }

    @Test
    public void 연산자_먼저_입력() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate("- 2 + 3 * 4 / 2");
    }

    @Test
    public void null_입력() {
        thrown.expect(IllegalArgumentException.class);

        calculator.calculate(null);
    }
}