package calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest{

    @Test
    public void runNormalCase() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10.0);
    }

    @Test
    public void run2ParamPlus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 + 3")).isEqualTo(5.0);
    }

    @Test
    public void run2ParamMinus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 - 3")).isEqualTo(-1.0);
    }


    @Test
    public void run2ParamMulti() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 * 3")).isEqualTo(2*3);
    }


    @Test
    public void run2ParamDivide() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate("2 / 3")).isEqualTo(2d/3d);
    }
}