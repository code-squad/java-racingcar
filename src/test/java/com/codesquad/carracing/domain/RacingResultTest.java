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

    @Test
    public void 최대값() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 2),
                new Car("CCC", 3)
        );
        final int maxPosition = RacingResult.maxPosition(cars);

        assertThat(maxPosition).isEqualTo(3);
    }

    @Test
    public void 최대값중복() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 3),
                new Car("CCC", 3)
        );
        final int maxPosition = RacingResult.maxPosition(cars);

        assertThat(maxPosition).isEqualTo(3);
    }

    @Test
    public void 혼자우승_이름() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 3),
                new Car("CCC", 3)
        );
        final List<String> winners = RacingResult.getWinners(cars);

        assertThat(winners).containsExactly("BBB", "CCC");
    }

    @Test
    public void 우승자_아닌_이름() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 3),
                new Car("CCC", 3)
        );
        final List<String> winners = RacingResult.getWinners(cars);

        assertThat(winners).doesNotContain("AAA");
    }

    @Test
    public void 우승자_조회() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 3),
                new Car("CCC", 3)
        );
        final RacingResult result = new RacingResult(cars);
        final List<String> winners = result.getWinners();

        assertThat(winners).containsExactly("BBB", "CCC");
    }

    @Test
    public void 우승자_미포함() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 1),
                new Car("BBB", 3),
                new Car("CCC", 3)
        );
        final RacingResult result = new RacingResult(cars);
        final List<String> winners = result.getWinners();

        assertThat(winners).doesNotContain("AAA");
    }
}
