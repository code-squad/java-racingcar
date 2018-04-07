package com.codesquad.carracing.app;

import com.codesquad.carracing.domain.CarRacing;
import com.codesquad.carracing.domain.MoveStrategy;
import com.codesquad.carracing.domain.RandomGenerator;
import com.codesquad.carracing.domain.RandomMoveStrategy;
import com.codesquad.carracing.infrastructure.BoundedRandomGenerator;
import com.codesquad.carracing.ui.*;

import java.util.Random;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        final InputView input = ConsoleCarRacingApp.createInputView();

        final int numberOfCars = input.inputNumberOfCars("자동차 대수는 몇 대 인가요?");
        final int numberOfTries = input.inputNumberOfTries("시도 횟수는 몇 회 인가요?");

        final RandomGenerator generator = new BoundedRandomGenerator(10, new Random());
        final MoveStrategy strategy = new RandomMoveStrategy(generator);

        final CarRacing racing = new CarRacing(numberOfCars);

        for (int i = 0; i < numberOfTries; i++) {
            racing.nextTry(strategy);
        }
    }

    public static InputView createInputView() {
        final Writer writer = new ConsoleWriter();
        final Reader reader = new ConsoleReader();
        return new InputView(writer, reader);
    }

//    private static void printCars(final List<Car> cars) {
//        for (final Car car : cars) {
//            ConsoleCarRacingApp.printDistance(car.getPosition());
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    private static void printDistance(final int position) {
//        for (int i = 0; i <= position; i++) {
//            System.out.print("-");
//        }
//    }
}
