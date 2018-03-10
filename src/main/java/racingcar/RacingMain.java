package racingcar;

public class RacingMain {
	public static void main(String[] args) {
		String[] carNames = InputView.getCarNames();
		int tryCount = InputView.getTryCount();
		
		RacingGame racingGame = new RacingGame(carNames);
		racingGame.racing(tryCount);
		
		ResultView.printResult(racingGame);
	}
}
