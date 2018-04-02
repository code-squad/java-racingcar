package com.codesquad.carracingapp;

import com.codesquad.carracing.RandomGenerator;

import java.util.Random;

public class BoundedRandomGenerator implements RandomGenerator {
    private final Random random;
    private final int bound;

    public BoundedRandomGenerator(final int bound) {
        random = new Random();
        this.bound = bound;
    }

    @Override
    public int generate() {
        return random.nextInt(bound);
    }
}
