package com.codesquad.carracing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {

    private final List<Car> cars;

    public CarRacing(final int numberOfCars) {
        if (numberOfCars == 0) {
            throw new IllegalArgumentException("최소 1대 이상의 자동차가 필요합니다.");
        }

        cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    private static List<Car> makeClone(final List<Car> srcCars) {
        return srcCars.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private static RacingResult makeRacingResult(final List<Car> racedCars) {
        return new RacingResult(racedCars);
    }

    public RacingResult nextTry(final MoveStrategy strategy) {
        for (final Car car : cars) {
            car.move(strategy);
        }
        return makeRacingResult(makeClone(cars));
    }
}
