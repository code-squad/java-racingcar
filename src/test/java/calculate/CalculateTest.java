package calculate;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Before
    public void setUp(){
        System.out.println("setup");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 숫자가아님() {
        Calculator.calculate("# + 10");
    }

    @Test(expected = RuntimeException.class)
    public void 연산기호가잘못됨() {
        Calculator.calculate("9 $ 10");
    }

    @Test
    public void 더하기() {
        String result = Calculator.calculate("9 + 10");
        assertThat(result).isEqualTo("19");
    }

    @Test
    public void 빼기() {
        String result = Calculator.calculate("15 - 10");
        assertThat(result).isEqualTo("5");
    }

    @Test
    public void 곱하기() {
        String result = Calculator.calculate("15 * 10");
        assertThat(result).isEqualTo("150");
    }

    @Test
    public void 나누기() {
        String result = Calculator.calculate("20 / 10");
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void 여러개_더하기() {
        String result = Calculator.calculate("9 + 10 + 10");
        assertThat(result).isEqualTo("29");
    }

    @Test
    public void 여러개_빼기() {
        String result = Calculator.calculate("9 - 10 - 10");
        assertThat(result).isEqualTo("-11");
    }
    @Test
    public void 여러개_곱하기() {
        String result = Calculator.calculate("9 * 10 * 10");
        assertThat(result).isEqualTo("900");
    }
    @Test
    public void 여러개_나누기() {
        String result = Calculator.calculate("900 / 90 / 10");
        assertThat(result).isEqualTo("1");
    }
    @Test
    public void 혼합연산1() {
        String result = Calculator.calculate("900 + 90 * 10");
        assertThat(result).isEqualTo("9900");
    }
    @Test
    public void 혼합연산2() {
        String result = Calculator.calculate("900 - 90 / 10");
        assertThat(result).isEqualTo("81");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown");
    }

}
