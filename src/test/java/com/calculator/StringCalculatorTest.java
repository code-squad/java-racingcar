package com.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_null일때() {
        calculator.calculate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_빈문자열일때() {
        calculator.calculate("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 값이_공백문자열일때() {
        calculator.calculate(" ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 피연산자가_두개_미만일때() {
        calculator.calculate("1 + ");
    }
}
