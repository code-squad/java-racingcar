package racingcar;

import java.util.Scanner;

public class Race {

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		ResultView rv = new ResultView();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);

		Cars carIns = createCars(carNames);
		carIns.moveCars(tryTimes);
		rv.printWinner(carIns.compareScore(carIns.findMaxScore()));
	}

	private Cars createCars(String[] carNames) {
		Cars cars = new Cars();
		for (int i = 0; i < carNames.length; i++) {
			cars.add(new Car(carNames[i]));
		}
		return cars;
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
