package com.codesquad.carracing;

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
    public void 이동() {
        car = new Car(0);
        final MoveStrategy strategy = new FakeMoveStrategy(true);
        car.move(strategy);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 정지() {
        car = new Car(0);
        final MoveStrategy strategy = new FakeMoveStrategy(false);
        car.move(strategy);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 시작위치_9() {
        car = new Car(9);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(9);
    }

    @Test
    public void 시작위치_9에서_이동() {
        car = new Car(9);
        final MoveStrategy strategy = new FakeMoveStrategy(true);
        car.move(strategy);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(10);
    }

    @Test
    public void 시작위치_9에서_정지() {
        car = new Car(9);
        final MoveStrategy strategy = new FakeMoveStrategy(false);
        car.move(strategy);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(9);
    }
}
