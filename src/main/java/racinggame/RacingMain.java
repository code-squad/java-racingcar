package racinggame;

import racinggame.domain.RacingGame;
import racinggame.dto.CarDto;
import racinggame.dto.RacingResult;
import racinggame.view.InputView;
import racinggame.view.ResultView;

import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);
        RacingResult result = racingGame.racing(tryNo);

        ResultView.printResult(result);
    }
}
