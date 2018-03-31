package calculator;

import org.junit.Before;
import org.junit.Test;
import sun.util.resources.uk.CalendarData_uk;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void 계산하기() {

        assertThat(5).isEqualTo(Calculator.calculate("2 + 3"));
        assertThat(8).isEqualTo(Calculator.calculate("10 - 2"));
        assertThat(24).isEqualTo(Calculator.calculate("6 * 4"));
        assertThat(36).isEqualTo(Calculator.calculate("144 / 4"));

        assertEquals(5,Calculator.calculate("2 + 3"));
        assertEquals(7,Calculator.calculate("3 * 2 + 1"));
        assertEquals(10, Calculator.calculate("2 * 3 + 4"));
        assertEquals(28, Calculator.calculate("2 * 3 * 2 * 4 / 8 + 22"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 예외_테스트하기(){
        Calculator.calculate("");
        Calculator.calculate(null);
    }

}