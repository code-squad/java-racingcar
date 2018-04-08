package com.codesquad.carracing.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @Test
    public void 기본생성_위치_0() {
        car = new Car();
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 시작위치_1로_생성() {
        car = new Car(1);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 시작위치_2로_생성() {
        car = new Car(2);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(2);
    }

    @Test
    public void 사본생성_값이같음() {
        final Car srcCar = new Car(2);
        car = new Car(srcCar);
        assertThat(car).isEqualToComparingFieldByField(srcCar);
    }

    @Test
    public void 사본생성_참조값다름() {
        final Car srcCar = new Car(2);
        car = new Car(srcCar);
        assertThat(car).isNotEqualTo(srcCar);
    }

    @Test
    public void 이동() {
        car = new Car(0);
        car.move(() -> true);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 정지() {
        car = new Car(0);
        car.move(() -> false);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 시작위치_9에서_이동() {
        car = new Car(9);
        car.move(() -> true);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(10);
    }

    @Test
    public void 시작위치_9에서_정지() {
        car = new Car(9);
        car.move(() -> false);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(9);
    }
}
