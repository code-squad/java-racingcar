package com.codesquad.carracing;

public class FakeMoveStrategy implements MoveStrategy {

    private final boolean willReturn;

    public FakeMoveStrategy(final boolean willReturn) {
        this.willReturn = willReturn;
    }

    @Override
    public boolean isMovable() {
        return this.willReturn;
    }
}
