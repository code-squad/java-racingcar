package racingcar;

import java.util.Random;
import java.util.Scanner;

public class Racing {
	// private int time;
	private int[] carPosition;

	public void start(int challengeCount) {
		for (int i = 0; i < challengeCount; i++) {
			challenge();
		}
	}
	
	public void challenge() {
		for (int i = 0; i < this.carPosition.length; i++) {
			int randomNumber = getRandomNumber();
			assort(randomNumber, i);
		}
	}

	public void go(int index) {
		this.carPosition[index]++;
	}

	public void stop() {
		// System.out.println("this car stopped");
	}

	// go인지 stop인지 분류
	public void assort(int randomNumber, int index) {
		if (randomNumber >= 4) {
			go(index);
		}
		stop();
	}

	public int inputCarCount(Scanner scanner) {
		System.out.println("자동차 대수는 몇 대 인가요?");
		int carCount = scanner.nextInt();
		return carCount;
	}

	public int inputChallengeCount(Scanner scanner) {
		System.out.println("시도할 회수는 몇 회 인가요?");
		int challengeCount = scanner.nextInt();
		return challengeCount;
	}

	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(10); // 0~9까지 난수 생성
		return randomNumber;
	}

	public void result() {
		System.out.println();
		System.out.println("실행결과");
		for (int i = 0; i < this.carPosition.length; i++) {
			output(carPosition[i]);
			System.out.println();
		}
	}

	public void output(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("-");
		}
	}

	public static void main(String[] args) {
		Racing race = new Racing();
		Scanner scanner = new Scanner(System.in);

		int carCount = race.inputCarCount(scanner);
		race.carPosition = new int[carCount];

		int challengeCount = race.inputChallengeCount(scanner);

		race.start(challengeCount);

		race.result();

		scanner.close();
	}
}
