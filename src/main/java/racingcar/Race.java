package racingcar;

import java.util.Scanner;

public class Race {

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		ResultView rv = new ResultView();
		String[] carNames = InputView.inputName(sc);
		int tryTimes = InputView.inputTime(sc);

		Cars carIns = new Cars(carNames);
		carIns.moveCars(tryTimes);
		rv.printResult(carIns);
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
