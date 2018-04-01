package com.codesquad.carracing;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeMovingValueTest {
    @Test
    public void 리턴이_3인_시도() {
        final FakeMovingValue mover = new FakeMovingValue(3);
        final int value = mover.getValue();
        assertThat(value).isEqualTo(3);
    }

    @Test
    public void 리턴이_8인_시도() {
        final FakeMovingValue mover = new FakeMovingValue(8);
        final int value = mover.getValue();
        assertThat(value).isEqualTo(8);
    }
}
