package com.codesquad.carracing.domain;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingTest {

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱_자동차_0대_입력() {
        new CarRacing(0, 1);
    }

    @Test
    public void 레이싱_자동차_1대_입력() {
        new CarRacing(1, 1);
    }

    @Test
    public void 레이싱_자동차_10대_입력() {
        new CarRacing(10, 1);
    }

    @Test
    public void 레이싱_자동차_1대_생성_() {
        final CarRacing carRacing = new CarRacing(1, 1);
        final List<Car> cars = carRacing.getCars();
        assertThat(cars.size()).isEqualTo(1);
    }

    @Test
    public void 레이싱_자동차_10대_생성() {
        final CarRacing carRacing = new CarRacing(10, 1);
        final List<Car> cars = carRacing.getCars();
        assertThat(cars.size()).isEqualTo(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 시도_횟수_0번_입력() {
        new CarRacing(10, 0);
    }

    @Test
    public void 시도_횟수_1번_입력() {
        new CarRacing(1, 1);
    }

    @Test
    public void 시도_횟수_10번_입력() {
        new CarRacing(1, 10);
    }

    @Test
    public void 첫번째_자동차_이동1회() {
        final CarRacing carRacing = new CarRacing(1, 1);
        final RandomGenerator generator = new FakeRandomGenerator(4);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        carRacing.nextTry(strategy);
        final List<Car> cars = carRacing.getCars();
        assertThat(cars.get(0).getPosition()).isEqualTo(1);
    }

    @Test
    public void 첫번째_자동차_이동_실패() {
        final CarRacing carRacing = new CarRacing(1, 1);
        final RandomGenerator generator = new FakeRandomGenerator(3);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        carRacing.nextTry(strategy);
        final List<Car> cars = carRacing.getCars();
        assertThat(cars.get(0).getPosition()).isEqualTo(0);
    }

    @Test
    public void 두번째_자동차_이동2회() {
        final CarRacing carRacing = new CarRacing(2, 2);
        final RandomGenerator generator = new FakeRandomGenerator(4);
        final MoveStrategy strategy = new RandomMoveStrategy(generator);
        carRacing.nextTry(strategy);
        carRacing.nextTry(strategy);
        final List<Car> cars = carRacing.getCars();
        assertThat(cars.get(1).getPosition()).isEqualTo(2);
    }
}
