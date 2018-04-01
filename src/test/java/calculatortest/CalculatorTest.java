package calculatortest;

import calculator.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    @Test
    public void 더하기() {
        assertThat(Calculator.calculate("2 + 3")).isEqualTo(5);
    }

    @Test
    public void 빼기() {
        assertThat(Calculator.calculate("3 - 1")).isEqualTo(2);
    }

    @Test
    public void 나누기() {
        assertThat(Calculator.calculate("2 / 2")).isEqualTo(1);
    }

    @Test
    public void 곱하기() {
        assertThat(Calculator.calculate("4 * 2")).isEqualTo(8);
    }

    @Test
    public void 테스트() {
        assertThat(Calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void null체크() {
        Calculator.calculate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 빈문자열() {
        Calculator.calculate("");
    }




}
