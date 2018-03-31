package CalculatroTest;

import calculator.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
    }

    @Test
    public void 더하기() {
        assertThat(cal.calculate("2 + 3")).isEqualTo(5);
    }

    @Test
    public void 빼기() {
        assertThat(cal.calculate("3 - 1")).isEqualTo(1);
    }

    @Test
    public void 나누기() {
        assertThat(cal.calculate("2 / 2")).isEqualTo(1);
    }

    @Test
    public void 곱하기() {
        assertThat(cal.calculate("4 * 2")).isEqualTo(8);
    }

    @Test
    public void 테스트() {
        assertThat(cal.calculate("2 + 3 * 4 / 2")).isEqualTo(10);
    }

    @Test
    public void null체크() {
//        assertThat(cal.calculate(null))
    }

    @Test
    public void 빈공백() {

    }




}
