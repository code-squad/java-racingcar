package com.codesquad.carracing.app;

import com.codesquad.carracing.domain.*;
import com.codesquad.carracing.infrastructure.BoundedRandomGenerator;
import com.codesquad.carracing.ui.*;

import java.util.Random;

public class ConsoleCarRacingApp {
    public static void main(final String[] args) {
        step2();
    }

    private static void step1() {
        final InputView input = createInputView();

        final int numberOfCars = input.inputNumberOfCars("자동차 대수는 몇 대 인가요?");
        final int numberOfTries = input.inputNumberOfTries("시도 횟수는 몇 회 인가요?");

        final CarRacing racing = new CarRacing(numberOfCars);

        run(numberOfTries, racing);
    }

    private static void step2() {
        final InputView input = createInputView();

        final String[] carNames = input.inputCarNames();

        final int numberOfTries = input.inputNumberOfTries("시도 횟수는 몇 회 인가요?");

        final CarRacing racing = new CarRacing(carNames);

        run(numberOfTries, racing);
    }

    private static void run(final int numberOfTries, final CarRacing racing) {
        final MoveStrategy moveStrategy = createMoveStrategy();

        System.out.println("실행 결과");
        RacingResult racingResult = racing.current();
        ResultView.renderResult(racingResult);

        for (int i = 0; i < numberOfTries; i++) {
            racingResult = racing.nextTry(moveStrategy);
            ResultView.renderResult(racingResult);
        }

        ResultView.renderWinners(racingResult);
    }

    private static InputView createInputView() {
        final Writer writer = new ConsoleWriter();
        final Reader reader = new ConsoleReader();
        return new InputView(writer, reader);
    }

    private static MoveStrategy createMoveStrategy() {
        final RandomGenerator generator = new BoundedRandomGenerator(10, new Random());
        return new RandomMoveStrategy(generator);
    }
}
