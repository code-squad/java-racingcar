package com.codesquad.carracing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    final List<Car> cars;
    
    public CarRacing(final int numberOfCars) {
        if (numberOfCars == 0) {
            throw new IllegalArgumentException("최소 1대 이상의 자동차가 필요합니다.");
        }

        cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void nextTry(final MoveStrategy strategy) {
        for (final Car car : cars) {
            car.move(strategy);
        }
    }
}
