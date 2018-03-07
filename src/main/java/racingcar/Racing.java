package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing {
	// private int time;
	private String[] registeredCarNames;
	private Car[] registeredCar;

	private void makeCar(int carCount) {
		this.registeredCar = new Car[carCount];
		for (int i = 0; i < carCount; i++) {
			this.registeredCar[i] = new Car(this.registeredCarNames[i]);
		}
	}

	private void start(int challengeCount) {
		for (int i = 0; i < challengeCount; i++) {
			challenge();
		}
	}

	private void challenge() {
		for (int i = 0; i < this.registeredCar.length; i++) {
			int randomNumber = getRandomNumber();
			assort(randomNumber, i);
		}
	}

	private void go(int index) {
		int position = this.registeredCar[index].getPosition();
		position++;
		this.registeredCar[index].setPosition(position);
	}

	private void stop() {
		// TODO stop된 상태를 log로 표시하기	
		}

	// go인지 stop인지 분류
	private void assort(int randomNumber, int index) {
		if (randomNumber >= 4) {
			go(index);
		}
		stop();
	}

	private int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(10); // 0~9까지 난수 생성
		return randomNumber;
	}

	private ArrayList<String> rank() {
		ArrayList<String> winners = new ArrayList<String>();

		int winnerScore = 0;
		for (int i = 0; i < this.registeredCar.length; i++) {
			int position = this.registeredCar[i].getPosition();
			String winnerName = this.registeredCar[i].getName();

			if (winnerScore < position) {
				winnerScore = position;
				winners.clear(); // ArrayList를 비운다.
				winners.add(winnerName);
			} else if (winnerScore == position) {
				winners.add(winnerName);
			} else if (winnerScore > position) {
				continue;
			}
		}
		return winners;
	}

	public static void main(String[] args) {
		Racing race = new Racing();
		Scanner scanner = new Scanner(System.in);

		race.registeredCarNames = InputView.inputCarNames(scanner);
		int challengeCount = InputView.inputChallengeCount(scanner);
		int carCount = race.registeredCarNames.length;
		race.makeCar(carCount); // 자동차 생성(이름 등록)
		race.start(challengeCount);
		ResultView.output(race.registeredCar, race.rank());
		scanner.close();
	}
}
