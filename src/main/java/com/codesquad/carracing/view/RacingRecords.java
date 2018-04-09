package com.codesquad.carracing.view;

import com.codesquad.carracing.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class RacingRecords {

    private final List<RacingRecord> records;

    private RacingRecords(final List<RacingRecord> records) {
        this.records = records;
    }

    public static RacingRecords writeRecord(final List<Car> cars, final String letter) {
        checkBlank(cars);

        final List<RacingRecord> records = cars.stream()
                .map(car -> new RacingRecord(car, letter))
                .collect(Collectors.toList());

        return new RacingRecords(records);
    }

    private static void checkBlank(final List<Car> cars) {
        if (cars == null) {
            throw new IllegalArgumentException("자동차 목록은 널일 수 없습니다.");
        }

        if (cars.isEmpty()) {
            throw new IllegalArgumentException("하나 이상의 자동차 목록이 필요합니다.");
        }
    }

    public List<RacingRecord> getRecords() {
        return records;
    }
}
