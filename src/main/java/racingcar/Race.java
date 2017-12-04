package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);
		
		Cars carIns = createCar(carNames);
		moveCar(tryTimes, carIns);
		ResultView.printWinner(compareScore(findMaxScore(carIns), carIns));
	}

	private Cars createCar(String[] carNames) {
		Cars carIns = new Cars();
		for (int i = 0; i < carNames.length; i++) {
			carIns.add(new Car(carNames[i]));
		}
		return carIns;
	}

	private void moveCar(int tryTimes, Cars carIns) {
		for (int i = 0; i < tryTimes; i++) {
			setCarStatus(carIns);
			System.out.println();
		}
	}

	private void setCarStatus(Cars carIns) {
		for (int i = 0; i < carIns.getCars().size(); i++) {
			if (createRanNum() >= 4) {
				carIns.getCars().get(i).movePosition();
				carIns.getCars().get(i).appendDash();
			}
			ResultView.printCar(carIns.getCars().get(i));
		}
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	private int findMaxScore(Cars carIns) {
		int num = 0;
		for (int i = 0; i < carIns.getCars().size(); i++) {
			if (num <= carIns.getCars().get(i).position)
				num = carIns.getCars().get(i).position;
		}
		return num;
	}

	private ArrayList<String> compareScore(int num, Cars carIns) {
		ArrayList<String> winners = new ArrayList<String>();
		for (int i = 0; i < carIns.getCars().size(); i++) {
			if (num == carIns.getCars().get(i).position)
				winners.add(carIns.getCars().get(i).name);
		}
		return winners;
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
