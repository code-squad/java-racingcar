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

    public static void updatePosition(Car car) {
        Random random = new Random();
        if (random.nextInt(BOUND_RANDOM) >= FORWARD_NUM) {
            car.position++;
        }
    }

    public static int extractPosition(Car car) {
        return car.position;
    }

    public static String extractNameOfCar(Car car) {
        return car.name;
    }

    public static int updateMaxposition(Car car, int max) {
        if (max < car.position) {
            max = car.position;
        }
        return max;
    }

    public static boolean checkWinner(Car car, Car[] cars) {
        if (car.position == RacingGame.extractMaxposition(cars)) {
            return true;
        }
        return false;
    }
}