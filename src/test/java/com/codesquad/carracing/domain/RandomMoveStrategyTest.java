package com.codesquad.carracing.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomMoveStrategyTest {
    @Test
    public void 최소값_이동가능() {
        final RandomGenerator generator = new FakeRandomGenerator(
                RandomMoveStrategy.MOVABLE_MIN);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(true);
    }

    @Test
    public void 최소값보다_작을때() {
        final RandomGenerator generator = new FakeRandomGenerator(
                RandomMoveStrategy.MOVABLE_MIN - 1);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(false);
    }

    @Test
    public void 최대값_이동가능() {
        final RandomGenerator generator = new FakeRandomGenerator(
                RandomMoveStrategy.MOVABLE_MAX);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(true);
    }

    @Test
    public void 최대값보다_클때() {
        final RandomGenerator generator = new FakeRandomGenerator(
                RandomMoveStrategy.MOVABLE_MAX + 1);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        final boolean isMovable = strategy.isMovable();
        assertThat(isMovable).isEqualTo(false);
    }
}
