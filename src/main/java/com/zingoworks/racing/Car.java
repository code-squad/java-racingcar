package com.zingoworks.racing;

import java.util.Scanner;

public class Car {
    private static final int DEFAULT_POSITION = 0;
    private String name;
    private int position;
    public static Car[] cars;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static void setCars() {
        Scanner sc = new Scanner(System.in);
        String[] carName = InputView.setCarsName(sc);
        cars = new Car[carName.length];
        for(int i = 0; i < cars.length; i++) {
            Car car = new Car(carName[i], DEFAULT_POSITION);
            cars[i] = car;
        }
    }

    public static void updatePosition(Car car) {
        car.position++;
    }

    public static int extractPosition(Car car) {
        return car.position;
    }

    public static int extractNumOfCars() {
        return cars.length;
    }

    public static String extractNameOfCar(Car car) {
        return car.name;
    }

    public static int extractMaxposition() {
        int max = 0;
        for (int i = 0; i < Car.extractNumOfCars(); i++) {
            max = updateMaxposition(cars[i], max);
        }
        return max;
    }

    private static int updateMaxposition(Car car, int max) {
        if (max < car.position) {
            max = car.position;
        }
        return max;
    }
}