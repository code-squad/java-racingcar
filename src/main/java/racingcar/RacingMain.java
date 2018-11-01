package racingcar;

import racingcar.domain.RacingGame;
import racingcar.dto.RacingGameDto;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingMain {
    public static void main(String[] args) {
        RacingGame racingGame = RacingGame.ofcarName(InputView.getCarNum());
        RacingGameDto result = racingGame.race(InputView.getGameCount());

        ResultView.printResult(result);
    }
}
