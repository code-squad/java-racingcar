package com.codesquad.carracing;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setup() {
        car = new Car();
    }

    @Test
    public void 시작위치가_0() {
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 시작위치가_10() {
        car = new Car(10);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(10);
    }

    @Test
    public void 시도값이_9일때_이동() {
        final MovingValue movingValue = new FakeMovingValue(9);
        car.move(movingValue);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 시도값이_4일때_이동() {
        final MovingValue movingValue = new FakeMovingValue(4);
        car.move(movingValue);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 시도값이_3일때_정지() {
        final MovingValue movingValue = new FakeMovingValue(3);
        car.move(movingValue);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 시도값이_0일때_정지() {
        final MovingValue movingValue = new FakeMovingValue(0);
        car.move(movingValue);
        final int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }
}
