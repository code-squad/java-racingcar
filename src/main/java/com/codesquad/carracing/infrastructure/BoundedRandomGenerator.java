package com.codesquad.carracing.infrastructure;

import com.codesquad.carracing.domain.RandomGenerator;

import java.util.Random;

public class BoundedRandomGenerator implements RandomGenerator {
    private final Random random;
    private final int bound;

    public BoundedRandomGenerator(final int bound, final Random random) {
        this.random = random;
        this.bound = bound;
    }

    @Override
    public int generate() {
        return random.nextInt(bound);
    }
}
