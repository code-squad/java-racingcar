package com.codesquad.carracing.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingResult {
    private final List<Car> cars;

    public RacingResult(final List<Car> racedCars) {
        if (racedCars == null || racedCars.isEmpty()) {
            throw new IllegalArgumentException("레이싱에 참여한 자동차가 없습니다.");
        }

        this.cars = racedCars;
    }

    public static int maxPosition(final List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    public static List<String> getWinners(final List<Car> cars) {
        final int max = maxPosition(cars);
        return cars.stream()
                .filter(car -> car.getPosition() == max)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        return getWinners(this.cars);
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
