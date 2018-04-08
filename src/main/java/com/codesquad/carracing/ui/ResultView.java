package com.codesquad.carracing.ui;

import com.codesquad.carracing.domain.Car;
import com.codesquad.carracing.domain.RacingResult;

import java.util.List;

public class ResultView {
    private final static String LETTER = "-";

    public static void renderResult(final RacingResult result) {
        final List<Car> cars = result.getCars();
        for (final Car car : cars) {
            printDistance(car);
            System.out.println();
        }
    }

    private static void printDistance(final Car car) {

        final int position = car.getPosition();
        for (int i = 0; i < position; i++) {
            System.out.print(LETTER);
        }
    }
}