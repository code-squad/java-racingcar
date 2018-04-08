package com.codesquad.carracing.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomMoveStrategyTest {
    @Test
    public void 최소값_이동가능() {
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MIN);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(true);
    }

    @Test
    public void 최소값보다_작을때() {
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MIN - 1);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(false);
    }

    @Test
    public void 최대값_이동가능() {
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MAX);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(true);
    }

    @Test
    public void 최대값보다_클때() {
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MAX + 1);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(false);
    }
}
