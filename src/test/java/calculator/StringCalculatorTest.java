package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class StringCalculatorTest {


    @Test
    public void 덧셈() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.sub(5, 4));
    }

    @Test
    public void 곱셈() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(12, stringCalculator.mul(6, 2));
    }

    @Test
    public void 나눗셈() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.div(6, 2));
    }

    @Test
    public void 계산기() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(28, stringCalculator.init("3 + 4 * 4 / 1"));
    }
}
