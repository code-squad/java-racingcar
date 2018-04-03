package com.codesquad.carracing.domain;

public class Car {
    private int position;

    public Car() {
        this.position = 0;
    }

    public Car(final int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(final MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            this.position++;
        }
    }
}
