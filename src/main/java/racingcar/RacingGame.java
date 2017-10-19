package racingcar;

import racingcar.model.Racing;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingGame {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		Racing racing = inputView.setRacing();

		ResultView resultView = new ResultView();

		for (int i = 0; i < racing.getMoveCount(); i++) {
			racing.carsOnePhaseMove();
			resultView.printOnePhase(racing);
		}
		resultView.printRacingRank(racing);
	}
}