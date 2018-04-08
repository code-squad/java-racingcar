package com.codesquad.carracing.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingResultTest {

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱결과_널() {
        new RacingResult(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱결과_자동차없음() {
        final List<Car> racedCars = new ArrayList<>();
        new RacingResult(racedCars);
    }

    @Test
    public void 레이싱결과_조회() {
        final List<Car> racedCars = Arrays.asList(
                new Car(1),
                new Car(2)
        );
        final RacingResult result = new RacingResult(racedCars);

        final List<Car> cars = result.getCars();

        assertThat(cars).isEqualTo(racedCars);
    }
}
