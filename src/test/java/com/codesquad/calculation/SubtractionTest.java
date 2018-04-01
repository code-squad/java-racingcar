package com.codesquad.calculation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractionTest {
    private Subtraction subtraction;

    @Before
    public void setup() {
        subtraction = new Subtraction();
    }

    @Test
    public void 계산() {
        final int result = subtraction.calculate(2, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 음수에서빼기() {
        final int result = subtraction.calculate(-5, 3);
        assertThat(result).isEqualTo(-8);
    }
}
