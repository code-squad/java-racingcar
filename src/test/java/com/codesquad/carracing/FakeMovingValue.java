package com.codesquad.carracing;

public class FakeMovingValue implements MovingValue {
    private final int value;

    public FakeMovingValue(final int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
