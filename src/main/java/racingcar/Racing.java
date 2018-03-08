package racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Racing {
	// private int time;
	// private String[] carsNames;
	// main내 지역변수로 자동차 이름을 받고, 자동차 객체를 만들 때 자동차 이름을 받은 배열을 인자로 넘긴다.
	// 굳이 registered를 붙이지 않아도 충분히 구분 가능하므로 줄이는 게 코드 가독성 높이기에 좋다.
	private Car[] cars;

	public Racing(String[] carNames) {
		this.makeCar(carNames);
	}

	private void makeCar(String[] carNames) {
		this.cars = new Car[carNames.length]; // 무조건 공간을 먼저 확보해야 하는가?
		for (int i = 0; i < cars.length; i++) {
			this.cars[i] = new Car(carNames[i]);
		}
	}

	private void start(int challengeCount) {
		for (int i = 0; i < challengeCount; i++) {
			challenge();
		}
	}

	private void challenge() {
		for (int i = 0; i < this.cars.length; i++) {
			this.cars[i].move(getRandomNumber());
		}
	}

	// go(), stop() 삭제. go, stop은 Car객체의 행동이기 때문에 Car Class로 들어간다.
	// assort() 삭제. go(), stop()은 move()로 묶을 수 있으며, Ture/False로 move의 여부를 판단할 수 있다.

	private int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(10); // 0~9까지 난수 생성
		return randomNumber;
	}

	private ArrayList<String> rank() {
		ArrayList<String> winners = new ArrayList<String>();
		int winnerScore = 0;

		for (int i = 0; i < this.cars.length; i++) {
			winnerScore = this.compare(winners, winnerScore, i);
		}
		return winners;
	}

	public int compare(ArrayList<String> winners, int winnerScore, int index) {
		int position = this.cars[index].getPosition();
		String winnerName = this.cars[index].getName();

		if (winnerScore < position) {
			winnerScore = position;
			winners.clear(); // ArrayList를 비운다.
			winners.add(winnerName);
		} else if (winnerScore != 0 && winnerScore == position) {
			winners.add(winnerName);
		}

		return winnerScore;
	}

	public static void setupRace() {
		Scanner scanner = new Scanner(System.in);
		String[] carNames = InputView.inputCarNames(scanner);
		int challengeCount = InputView.inputChallengeCount(scanner);

		Racing race = new Racing(carNames); // new 하는 순간 heap에 Racing 객체가 만들어지고, 해당 인스턴스의 멤버변수가 생성된다.
		race.start(challengeCount);
		ResultView.output(race.cars, race.rank());

		scanner.close();
	}

	public static void main(String[] args) {
		setupRace();
	}
}
