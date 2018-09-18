package com.zingoworks.racing;

public class Car {
    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }
//123
    public static void updatePosition(Car car) {
        car.position++;
    }

    public static int extractPosition(Car car) {
        return car.position;
    }

    public static String extractNameOfCar(Car car) {
        return car.name;
    }

    public static int extractMaxposition(Car[] cars) {
        int max = 0;
        for (int i = 0; i < cars.length; i++) {
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