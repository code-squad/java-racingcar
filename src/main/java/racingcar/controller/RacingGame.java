package racingcar.controller;

import racingcar.model.Racing;
import racingcar.view.InputView;

public class RacingGame {
    public static void main(String[] args) {
        Racing racing = new Racing();
        racing.readyGame(InputView.inputCarsName());
        racing.runGame(InputView.inputTime());
    }
}