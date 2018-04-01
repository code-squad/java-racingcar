package com.codesquad.carracing;

import java.util.Random;

public class RandomMovingValue implements MovingValue {
    private final Random random;

    public RandomMovingValue() {
        random = new Random();
    }

    @Override
    public int getValue() {
        return random.nextInt(10);
    }
}
