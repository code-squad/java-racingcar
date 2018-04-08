package com.codesquad.sequentialcalculator.calculation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setup() {
        addition = new Addition();
    }

    @Test
    public void 계산() {
        final int result = addition.calculate(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void 음수계산() {
        final int result = addition.calculate(-5, 3);
        assertThat(result).isEqualTo(-2);
    }
}
