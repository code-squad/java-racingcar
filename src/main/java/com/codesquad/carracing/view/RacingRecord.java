package com.codesquad.carracing.view;

import com.codesquad.carracing.domain.Car;
import com.codesquad.carracing.domain.CarRacing;

public class RacingRecord {
    private final String name;
    private String letterDistance;

    public RacingRecord(final Car car, final String letter) {
        if (car == null) {
            throw new IllegalArgumentException("자동차는 null일 수 없습니다.");
        }

        if (letter == null) {
            throw new IllegalArgumentException("문자는 널일 수 없습니다.");
        }

        if (letter.isEmpty()) {
            throw new IllegalArgumentException("문자가 입력되어야 합니다.");
        }

        this.name = car.getName();
        makeLetterDistance(letter, car.getPosition());
    }

    public String getName() {
        return this.name;
    }

    private void makeLetterDistance(final String letter, final int distance) {
        final StringBuilder sb = new StringBuilder();
        for (int i = CarRacing.DEFAULT_POSITION; i < distance; i++) {
            sb.append(letter);
        }
        this.letterDistance = sb.toString();
    }

    public String getLetterDistance() {
        return this.letterDistance;
    }
}
