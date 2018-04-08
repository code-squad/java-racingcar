package com.codesquad.carracing.domain;

import java.util.List;

public class RacingResult {
    private final List<Car> cars;

    public RacingResult(final List<Car> racedCars) {
        if (racedCars == null || racedCars.isEmpty()) {
            throw new IllegalArgumentException("레이싱에 참여한 자동차가 없습니다.");
        }

        this.cars = racedCars;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
