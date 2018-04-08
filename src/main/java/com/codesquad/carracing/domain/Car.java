package com.codesquad.carracing.domain;

public class Car {
    private final String name;
    private int position;

    public Car() {
        this("", 0);
    }

    public Car(final int position) {
        this("", position);
    }

    public Car(final Car srcCar) {
        this(srcCar.name, srcCar.position);
    }

    public Car(final String name, final int position) {
        this.name = name;
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

    public String getName() {
        return this.name;
    }
}
