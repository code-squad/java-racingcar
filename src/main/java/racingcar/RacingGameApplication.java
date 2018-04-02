package racingcar;

import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameApplication {
	public static void main(String[] args) {
		String[] carNames = InputView.getCarNames();
		int roundCouunt = InputView.getRoundCount();
		
		OutputView.showGameStart();
		RacingGame.play(carNames, roundCouunt);
	}
}
