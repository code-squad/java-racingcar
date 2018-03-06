package racingcar;

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
		// System.out.println("this car stopped");
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
	
	private String[] rank() {
		// TODO position값을 가지고 제일 높은 수(동점자 포함)를 찾아야 한다.
		return null;
	}

	private void output() {
		System.out.println('\n' + "실행결과");
		for (int i = 0; i < this.registeredCar.length; i++) {
			System.out.print(this.registeredCar[i].getName() + " :");
			int position = this.registeredCar[i].getPosition();
			result(position);
			System.out.println();
		}
	}

	private void result(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("-");
		}
	}

	public static void main(String[] args) {
		Racing race = new Racing();
		Scanner scanner = new Scanner(System.in);

		race.registeredCarNames = InputView.inputCarNames(scanner);
		int challengeCount = InputView.inputChallengeCount(scanner);
		int carCount = race.registeredCarNames.length;
		race.makeCar(carCount); // 자동차 생성(이름 등록)
		race.start(challengeCount);
		race.output();
		scanner.close();
	}
}
