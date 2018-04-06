package caculator;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalcTest {

    @Test
    public void calc() {
        assertThat(Calc.input("2 + 3 * 4 / 2")).isEqualTo(10);
        assertThat(Calc.input("2 + 8 * 4 / 2")).isEqualTo(20);
        assertThat(Calc.input("2 + 8 * 4 / 4")).isEqualTo(10);
        assertThat(Calc.input("5 + 10 * 4 / 2")).isEqualTo(30);
    }

    @Test
    public void assertSymbol() {
        assertThat(Calc.assertSymbol("+", 2, 3)).isEqualTo(5);
        assertThat(Calc.assertSymbol("-", 2, 3)).isEqualTo(-1);
        assertThat(Calc.assertSymbol("*", 2, 3)).isEqualTo(6);
        assertThat(Calc.assertSymbol("/", 2, 3)).isEqualTo(2/3);

        assertThat(Calc.assertSymbol("+", 3, 4)).isEqualTo(3 + 4);
        assertThat(Calc.assertSymbol("-", 3, 4)).isEqualTo(3-4);
        assertThat(Calc.assertSymbol("*", 3, 4)).isEqualTo(3*4);
        assertThat(Calc.assertSymbol("/", 3, 4)).isEqualTo(3/4);

    }


}
