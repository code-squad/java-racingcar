package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void parseTest() {
        String[] result = calculator.parse("2 + 3 * 4 / 2");
        assertThat(result).isEqualTo(new String[]{"2", "+", "3", "*", "4", "/", "2"});

        result = calculator.parse("");
        assertThat(result).isEqualTo(new String[]{""});
    }

    @Test
    public void calcTest() {
        int result = calculator.calc("2 + 3 * 4 / 2");
        assertThat(result).isEqualTo(10);

        result = calculator.calc("5 + 3 * 4 / 2");
        assertThat(result).isEqualTo(16);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcIsBlankParamTest() {
        calculator.calc("");
    }

    @Test
    public void addTest() {
        int result = calculator.operate("+", 1, 2);
        assertThat(result).isEqualTo(3);

        result = calculator.operate("+",2, 4);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void minusTest() {
        int result = calculator.operate("-", 2, 1);
        assertThat(result).isEqualTo(1);

        result = calculator.operate("-", 10, 21);
        assertThat(result).isEqualTo(-11);
    }

    @Test
    public void multiplicationTest() {
        int result = calculator.operate("*",10, 7);
        assertThat(result).isEqualTo(70);

        result = calculator.operate("*", 2, 9);
        assertThat(result).isEqualTo(18);
    }

    @Test
    public void divisionTest() {
        int result = calculator.operate("/", 10, 5);
        assertThat(result).isEqualTo(2);

        result = calculator.operate("/", 3, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void isOperator() {
        boolean result = calculator.isOperator("+");
        assertThat(result).isTrue();

        result = calculator.isOperator("98");
        assertThat(result).isFalse();
    }
}
