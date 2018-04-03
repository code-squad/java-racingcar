package com.codesquad.carracing.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeRandomGeneratorTest {
    @Test
    public void 리턴_3() {
        final FakeRandomGenerator mover = new FakeRandomGenerator(3);
        final int value = mover.generate();
        assertThat(value).isEqualTo(3);
    }

    @Test
    public void 리턴_8() {
        final FakeRandomGenerator mover = new FakeRandomGenerator(8);
        final int value = mover.generate();
        assertThat(value).isEqualTo(8);
    }
}
