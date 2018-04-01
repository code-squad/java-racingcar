package com.codesquad.carracingapp;

import com.codesquad.carracing.Car;
import com.codesquad.carracing.CarRacing;
import com.codesquad.carracing.MovingValue;

import java.util.Scanner;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        final String inputNumberOfCar = scanner.nextLine();
        final int numberOfCar = Integer.parseInt(inputNumberOfCar);

        System.out.println("시도할 회수는 몇 회 인가요?");
        final String inputNumberOfTries = scanner.nextLine();
        final int numberOfTries = Integer.parseInt(inputNumberOfTries);

        final MovingValue movingValue = new RandomMovingValue();
        final CarRacing carRacing = new CarRacing(numberOfCar, numberOfTries);

        Car[] cars;

        for (int i = 0; i < numberOfTries; i++) {
            cars = carRacing.getCars();
            ConsoleCarRacingApp.printCars(cars);
            carRacing.nextTry(movingValue);
        }
    }

    private static void printCars(final Car[] cars) {
        for (final Car car : cars) {
            ConsoleCarRacingApp.printDistance(car.getPosition());
            System.out.println();
        }
        System.out.println();
    }

    private static void printDistance(final int position) {
        for (int i = 0; i <= position; i++) {
            System.out.print("-");
        }
    }
}
