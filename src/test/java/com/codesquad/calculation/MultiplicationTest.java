package com.codesquad.calculation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationTest {
    private Multiplication multiplication;

    @Before
    public void setup() {
        multiplication = new Multiplication();
    }

    @Test
    public void 계산() {
        final int result = multiplication.calculate(3, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 음수계산() {
        final int result = multiplication.calculate(3, -2);
        assertThat(result).isEqualTo(-6);
    }
}
