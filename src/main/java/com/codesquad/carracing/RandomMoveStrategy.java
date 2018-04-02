package com.codesquad.carracing;

public class RandomMoveStrategy implements MoveStrategy {

    static final int MOVABLE_MIN = 4;
    static final int MOVABLE_MAX = 9;


    RandomGenerator generator;

    public RandomMoveStrategy(final RandomGenerator generator) {
        this.generator = generator;
    }

    @Override
    public boolean isMovable() {
        final int generatedNumber = generator.generate();

        if (generatedNumber < RandomMoveStrategy.MOVABLE_MIN) {
            return false;
        }

        if (generatedNumber > RandomMoveStrategy.MOVABLE_MAX) {
            return false;
        }

        return true;
    }
}
