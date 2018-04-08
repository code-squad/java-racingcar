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
    public void 레이싱_자동차_1대_생성_() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.getCars();
        assertThat(cars.size()).isEqualTo(1);
    }

    @Test
    public void 레이싱_자동차_10대_생성() {
        final CarRacing racing = new CarRacing(10);
        final List<Car> cars = racing.getCars();
        assertThat(cars.size()).isEqualTo(10);
    }

    @Test
    public void 레이싱_차량_시작위치() {
        final CarRacing racing = new CarRacing(1);
        final int position = racing.getCar(0).getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 이동가능_이동() {
        final CarRacing racing = new CarRacing(1);

        racing.nextTry(() -> true);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 이동불가능_정지() {
        final CarRacing racing = new CarRacing(1);

        racing.nextTry(() -> false);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    public void 랜덤최소값일때_시도() {
        final CarRacing racing = new CarRacing(1);
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MIN);

        racing.nextTry(strategy);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 랜덤최소값보다_작은_범위밖() {
        final CarRacing racing = new CarRacing(1);
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MIN - 1);

        racing.nextTry(strategy);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    public void 랜덤최대값일때_시도() {
        final CarRacing racing = new CarRacing(1);
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MAX);

        racing.nextTry(strategy);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 랜덤최대값보다_큰_범위밖() {
        final CarRacing racing = new CarRacing(1);
        final MoveStrategy strategy = new RandomMoveStrategy(() -> RandomMoveStrategy.MOVABLE_MAX + 1);

        racing.nextTry(strategy);

        final Car car = racing.getCar(0);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    public void 두번째_자동차_이동2회() {
        final CarRacing racing = new CarRacing(2);
        final MoveStrategy strategy = () -> true;
        racing.nextTry(strategy);
        racing.nextTry(strategy);
        final List<Car> cars = racing.getCars();
        assertThat(cars.get(1).getPosition()).isEqualTo(2);
    }
}
