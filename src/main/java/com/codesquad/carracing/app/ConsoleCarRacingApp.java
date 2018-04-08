package com.codesquad.carracing.app;

import com.codesquad.carracing.domain.*;
import com.codesquad.carracing.infrastructure.BoundedRandomGenerator;
import com.codesquad.carracing.ui.*;

import java.util.Random;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        final InputView input = createInputView();

        final int numberOfCars = input.inputNumberOfCars("자동차 대수는 몇 대 인가요?");
        final int numberOfTries = input.inputNumberOfTries("시도 횟수는 몇 회 인가요?");

        final MoveStrategy moveStrategy = createMoveStrategy();

        final CarRacing racing = new CarRacing(numberOfCars);

        System.out.println("실행 결과");
        for (int i = 0; i < numberOfTries; i++) {
            final RacingResult racingResult = racing.nextTry(moveStrategy);
            ResultView.renderResult(racingResult);
            System.out.println();
        }
    }

    private static InputView createInputView() {
        final Writer writer = new ConsoleWriter();
        final Reader reader = new ConsoleReader();
        return new InputView(writer, reader);
    }

    private static MoveStrategy createMoveStrategy() {
        final RandomGenerator generator = new BoundedRandomGenerator(10, new Random());
        final MoveStrategy strategy = new RandomMoveStrategy(generator);

        return strategy;
    }
}
