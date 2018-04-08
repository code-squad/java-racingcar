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
    public void 레이싱_자동차_이름두개로() {
        new CarRacing("pobi,crong", ",");
    }

    @Test
    public void 기본위치() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.current().getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    public void 이름자동차_기본위치_1() {
        final CarRacing racing = new CarRacing("pobi", ",");
        final List<Car> cars = racing.current().getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 두번째이름자동차_기본위치1() {
        final CarRacing racing = new CarRacing("pobi,crong", ",");
        final List<Car> cars = racing.current().getCars();
        final int position = cars.get(1).getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 이름자동차_이동1회_위치2() {
        final CarRacing racing = new CarRacing("pobi", ",");
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isEqualTo(2);
    }

    @Test
    public void 이동1회_위치1() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isEqualTo(1);
    }

    @Test
    public void 이동1회_위치2가아님() {
        final CarRacing racing = new CarRacing(1);
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isNotEqualTo(2);
    }

    @Test
    public void 이동2회_위치2() {
        final CarRacing racing = new CarRacing(1);
        racing.nextTry(() -> true);
        final List<Car> cars = racing.nextTry(() -> true).getCars();
        final int position = cars.get(0).getPosition();
        assertThat(position).isEqualTo(2);
    }

    @Test
    public void 두번째차_이동1회_위치1() {
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

    @Test
    public void 콤마이름분리() {
        final String names = "AAA,BBB";
        final String[] split = CarRacing.split(names, ",");
        assertThat(split).containsExactly("AAA", "BBB");
    }

    @Test
    public void 띄어쓰기이름분리() {
        final String names = "AAA BBB CCC";
        final String[] split = CarRacing.split(names, " ");
        assertThat(split).containsExactly("AAA", "BBB", "CCC");
    }
}
