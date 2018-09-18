package com.zingoworks.racing;

import java.util.Random;

public class Car {
    private static final int BOUND_RANDOM = 10;
    private static final int FORWARD_NUM = 4;

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void updatePosition() {
        Random random = new Random();
        if (random.nextInt(BOUND_RANDOM) >= FORWARD_NUM) {
            this.position++;
        }
    }

    public int extractPosition() {
        return this.position;
    }

    public String extractNameOfCar() {
        return this.name;
    }

    public int updateMaxposition(int max) {
        if (max < this.position) {
            max = this.position;
        }
        return max;
    }
}