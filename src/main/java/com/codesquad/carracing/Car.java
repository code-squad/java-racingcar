package com.codesquad.carracing;

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

//    public void move(final RandomGenerator randomGenerator) {
//        if (willMove(randomGenerator.generate())) {
//            this.position++;
//        }
//    }

//    private boolean willMove(final int value) {
//        return value >= 4 && value < 10;
//    }

    public void move(final MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            this.position++;
        }
    }
}
