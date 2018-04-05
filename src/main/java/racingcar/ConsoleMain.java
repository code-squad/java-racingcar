package racingcar;

import racingcar.domain.RacingGame;
import racingcar.domain.RandomRule;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.stream.IntStream;

public class ConsoleMain {
	public static void main(String[] args) {
		RacingGame racingGame = new RacingGame(new RandomRule(), InputView.showGetCarNamesView());
		
		int playCount = InputView.showGetPlayCountView();
		
		OutputView.showGameStartView();
		IntStream.range(0, playCount)
				.forEach(n -> OutputView.showPlayView(racingGame.play()));
		
		OutputView.showWinnerView(racingGame.getWinner());
	}
}
