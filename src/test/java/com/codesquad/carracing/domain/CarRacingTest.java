package com.codesquad.carracing.domain;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingTest {

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱_자동차_0대_입력() {
        new CarRacing(0);
    }

    @Test
    public void 레이싱_자동차_1대_입력() {
        new CarRacing(1);
    }

    @Test
    public void 레이싱_자동차_10대_입력() {
        new CarRacing(10);
    }

    @Test
    public void 이동1회_위치1() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.nextTry(() -> true).getCars();

        assertThat(cars)
                .extracting("position")
                .contains(1);
    }

    @Test
    public void 이동1회_위치2가아님() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.nextTry(() -> true).getCars();

        assertThat(cars)
                .extracting("position")
                .doesNotContain(2);
    }

    @Test
    public void 이동2회_위치2() {
        final CarRacing racing = new CarRacing(1);
        racing.nextTry(() -> true);
        final List<Car> cars = racing.nextTry(() -> true).getCars();

        assertThat(cars)
                .extracting("position")
                .contains(2);
    }

    @Test
    public void 두번째차_위치1() {
        final CarRacing racing = new CarRacing(2);
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(1).getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 두번째차_이동2회_위치2() {
        final CarRacing racing = new CarRacing(2);
        racing.nextTry(() -> true);
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(1).getPosition();
        assertThat(position).isEqualTo(2);
    }
}
