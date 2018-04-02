package racingcar;

import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameApplication {
	public static void main(String[] args) {
		int carCount = InputView.showCarCountInputView();
		int roundCouunt = InputView.showRoundCountInputView();
		
		OutputView.showOuputStartView();
		RacingGame.play(carCount, roundCouunt);
	}
}
