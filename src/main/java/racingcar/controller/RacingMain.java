package racingcar.controller;

import racingcar.ResultView;
import racingcar.domain.Car;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;

import java.util.ArrayList;

public class RacingMain {
    public static void main(String[] args) {
        String temporaryName = InputView.input();
        int tryNum = InputView.moveNumber();
        int max = 0;
        ArrayList<Car> cars = new ArrayList<>();

        RacingGame rg = new RacingGame();
        ResultView rv = new ResultView();

        cars = rg.play(temporaryName, tryNum);

        rv.printGame(cars);
        max = rg.winnerComparison(cars);

        rv.winCheck(cars, max);
    }
}

