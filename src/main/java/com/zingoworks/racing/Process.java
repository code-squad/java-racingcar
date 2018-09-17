package com.zingoworks.racing;

import java.util.*;

public class Process {
    private static final int BOUND_RANDOM = 10;
    private static final int JUMP = 4;

    public static void doRun(Car[] cars, int trials) {
        for (int i = 0; i < Car.extractNumOfCars(); i++) {
            runByTrials(cars[i], trials);
        }
    }

    private static void runByTrials(Car car, int trials) {
        for (int i = 0; i < trials; i++) {
            run(car);
        }
    }

    private static void run(Car car) {
        Random random = new Random();
        if (random.nextInt(BOUND_RANDOM) >= JUMP) {
            Car.updatePosition(car);
        }
    }
}

