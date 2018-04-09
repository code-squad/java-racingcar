package com.codesquad.carracing.view;

import com.codesquad.carracing.domain.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingRecordsTest {
    @Test(expected = IllegalArgumentException.class)
    public void 자동차목록_널일때() {
        RacingRecords.writeRecord(null, "#");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 자동차목록_비었을때() {
        final List<Car> cars = new ArrayList<>();
        RacingRecords.writeRecord(cars, "#");
    }

    @Test
    public void 기록목록조회() {
        final List<Car> cars = new ArrayList<>();
        cars.add(new Car("AAA", 3));
        final RacingRecords records = RacingRecords.writeRecord(cars, "#");
        final RacingRecord record = records.getRecords().get(0);
        final String name = record.getName();

        assertThat(name).isEqualTo("AAA");
    }

    @Test
    public void 두번째차_기록목록조회() {
        final List<Car> cars = Arrays.asList(
                new Car("AAA", 3),
                new Car("BBB", 2)
        );
        final RacingRecords records = RacingRecords.writeRecord(cars, "#");
        final RacingRecord record = records.getRecords().get(1);
        final String name = record.getName();

        assertThat(name).isEqualTo("BBB");
    }
}
