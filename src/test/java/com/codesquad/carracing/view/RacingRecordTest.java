package com.codesquad.carracing.view;

import com.codesquad.carracing.domain.Car;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingRecordTest {

    @Test
    public void 이름출력() {
        final Car car = new Car("AAA", 0);
        final RacingRecord record = new RacingRecord(car, "#");
        final String name = record.getName();
        assertThat(name).isEqualTo("AAA");
    }

    @Test
    public void 다른이름() {
        final Car car = new Car("BBB", 0);
        final RacingRecord record = new RacingRecord(car, "#");
        final String name = record.getName();
        assertThat(name).isEqualTo("BBB");
    }

    @Test
    public void 이동거리출력() {
        final Car car = new Car("AAA", 5);
        final RacingRecord record = new RacingRecord(car, "#");
        final String distance = record.getLetterDistance();
        assertThat(distance).isEqualTo("#####");
    }

    @Test
    public void 다른이동거리출력() {
        final Car car = new Car("AAA", 3);
        final RacingRecord record = new RacingRecord(car, "**");
        final String distance = record.getLetterDistance();
        assertThat(distance).isEqualTo("******");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 자동차널일때() {
        new RacingRecord(null, "#");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 문자널일때() {
        new RacingRecord(new Car("AAA", 3), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 문자_비었일때() {
        new RacingRecord(new Car("AAA", 3), "");
    }
}
