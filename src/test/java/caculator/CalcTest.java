package caculator;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalcTest {

    @Test
    public void name() {
        int result = Calc.input("2 + 3 * 4 / 2");
        assertThat(result).isEqualTo(10);
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
