package com.codesquad.carracing;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeMoveStrategyTest {
    @Test
    public void 이동가능() {
        final MoveStrategy strategy = new FakeMoveStrategy(true);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(true);
    }

    @Test
    public void 이동불가능() {
        final MoveStrategy strategy = new FakeMoveStrategy(false);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(false);
    }
}
