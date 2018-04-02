package com.codesquad.carracing;

public class FakeRandomGenerator implements RandomGenerator {
    private final int value;

    public FakeRandomGenerator(final int value) {
        this.value = value;
    }

    @Override
    public int generate() {
        return this.value;
    }
}
