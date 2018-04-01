package com.codesquad.calculation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisionTest {
    private Division division;

    @Before
    public void setup() {
        division = new Division();
    }

    @Test
    public void 계산() {
        final int result = division.calculate(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 음수계산() {
        final int result = division.calculate(-4, 2);
        assertThat(result).isEqualTo(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 나누기_0() {
        division.calculate(4, 0);
    }
}
