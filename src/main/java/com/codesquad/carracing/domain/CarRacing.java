package com.codesquad.carracing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {

    public static final int NUMBER_OF_CARS_MIN = 1;
    public static final int NUMBER_OF_TRIES_MIN = 1;

    private final List<Car> cars;

    public CarRacing(final int numberOfCars) {
        validateLessThanMinNumberOfCars(numberOfCars);

        cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    public CarRacing(final String[] carNames) {
        validateLessThanMinNumberOfCars(carNames.length);

        cars = new ArrayList<>();
        for (final String carName : carNames) {
            cars.add(new Car(carName, 1));
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

    private void validateLessThanMinNumberOfCars(final int number) {
        if (number < CarRacing.NUMBER_OF_CARS_MIN) {
            throw new IllegalArgumentException("자동차는 " + Integer.toString(CarRacing.NUMBER_OF_CARS_MIN) + " 이상이 입력되어야 합니다.");
        }
    }

    public RacingResult current() {
        return makeRacingResult(makeClone(this.cars));
    }

    public RacingResult nextTry(final MoveStrategy strategy) {
        for (final Car car : cars) {
            car.move(strategy);
        }
        return makeRacingResult(makeClone(cars));
    }
}
