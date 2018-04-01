package com.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_null() {
        calculator.calculate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_빈문자열() {
        calculator.calculate("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_공백문자열() {
        calculator.calculate(" ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 분해한_식이_짝수() {
        calculator.calculate("1 + 2 + ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 분해한_식이_하나() {
        calculator.calculate("1");
    }

    @Test
    public void 덧셈() {
        final int result = calculator.calculate("1 + 2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void 뺄셈() {
        final int result = calculator.calculate("2 - 1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 곱셈() {
        final int result = calculator.calculate("2 * 3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 나눗셈() {
        final int result = calculator.calculate("4 / 2");
        assertThat(result).isEqualTo(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 피연산자가_숫자가_아닐때() {
        calculator.calculate("a + 1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 사칙연산_이외의_연산자() {
        calculator.calculate("4 % 5");
    }

    @Test
    public void 두번_연산() {
        final int result = calculator.calculate("1 + 2 + 3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 세번_연산() {
        final int result = calculator.calculate("1 + 2 + 3 + 4");
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void 순서대로_연산() {
        final int result = calculator.calculate("1 + 2 * 3 - 1 / 2");
        assertThat(result).isEqualTo(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 숫자0으로_나누기() {
        calculator.calculate("4 / 0");
    }
}
