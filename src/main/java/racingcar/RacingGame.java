package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {
	private Car[] cars;
	private ArrayList<String> winners;

	public Car[] getCars() {
		return this.cars;
	}

	public ArrayList<String> getWinners() {
		return this.winners;
	}

	public RacingGame(String[] carNames) {
		this.cars = makeCars(carNames);
		winners = new ArrayList<String>();
	}

	public void racing(int tryCount) {
		this.start(tryCount);
		this.rank();
	}

	/* 원래 한 묶음 시작 */
	public int rank() {
		int winnerScore = 0;
		// 필요할 때 초기화 VS 객체 생성시 생성자에서 초기화
		// 테스트 케이스 작성할 때, findWinners를 테스트 하려면 객체 생성시 초기화를 시켜야
		// winners가 nullPointerException으로 뜨지 않는다.
		// winners = new ArrayList<String>();

		for (Car car : cars) {
			winnerScore = findWinners(car, winnerScore);
		}
		return winnerScore;
	}

	public int findWinners(Car car, int winnerScore) {
		int position = car.getPosition();
		if (winnerScore < position) {
			winnerScore = position;
			winners.clear(); // 이전 고득점자 삭제
			winners.add(car.getName());
		} else if (winnerScore != 0 && winnerScore == position) {
			winners.add(car.getName());
		}
		return winnerScore;
	}
	/* 한 묶음 끝 */

	/* 한 묶음 시작 */
	public void start(int tryCount) {
		for (int i = 0; i < tryCount; i++) {
			this.tryMove();
		}
	}

	public void tryMove() {
		for (int j = 0; j < cars.length; j++) {
			int randomNo = this.getRandomNumber();
			cars[j].move(randomNo);
		}
	}
	/* 한 묶음 끝 */

	public Car[] makeCars(String[] carNames) {
		Car[] cars = new Car[carNames.length];
		for (int i = 0; i < carNames.length; i++) {
			cars[i] = new Car(carNames[i]);
		}
		return cars;
	}

	public int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);
	}
}
