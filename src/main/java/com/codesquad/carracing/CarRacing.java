package com.codesquad.carracing;

public class CarRacing {

    final Car[] cars;
    final int numberOfTries;

    public CarRacing(final int numberOfCars, final int numberOfTries) {
        if (numberOfCars == 0) {
            throw new IllegalArgumentException("최소 1대 이상의 자동차가 필요합니다.");
        }

        if (numberOfTries == 0) {
            throw new IllegalArgumentException("1번 이상의 시도 횟수가 필요합니다.");
        }

        cars = new Car[numberOfCars];
        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = new Car();
        }

        this.numberOfTries = numberOfTries;
    }

    public Car[] getCars() {
        return cars;
    }

    public void nextTry(final MovingValue movingValue) {
        for (final Car car : cars) {
            car.move(movingValue);
        }
    }
}
