package com.codesquad.carracing;

public class Car {
    private int position;

    public Car(final int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(final MovingValue movingValue) {
        if (willMove(movingValue.getValue())) {
            this.position++;
        }
    }

    private boolean willMove(final int value) {
        return value >= 4 && value < 10;
    }
}
