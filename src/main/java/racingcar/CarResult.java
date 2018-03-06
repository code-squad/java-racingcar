package racingcar;

public class CarResult {

	private int max = 0;
	private int flag = 0;

	void resultView(int carNum, Car[] car) {

		System.out.println("실행 결과");
		for (int i = 0; i < carNum; i++) {
			System.out.print(car[i].getName() + " : ");
			resultBar(car, i);
		}
	}

	void resultBar(Car[] car, int i) {
		for (int k = 0; k < car[i].getPosition(); k++) {
			System.out.print("-");
		}
		System.out.println();
	}

	void winnerView(int carNum, Car[] car) {
		for (int i = 0; i < 2; i++, flag++) {
			commonFor(carNum, car);
		}
		System.out.println("가 최종 우승했습니다.");
	}

	void check(int carNum, Car[] car, int i) {
		if (flag == 0) {
			maxCompare(car, i);
		} else {
			winnerCheck(car, i);
		}
	}

	void commonFor(int carNum, Car[] car) {
		for (int i = 0; i < carNum; i++) {
			check(carNum, car, i);
		}
	}

	void maxCompare(Car[] car, int i) {
		if (max < car[i].getPosition()) {
			max = car[i].getPosition();
		}
	}

	void winnerCheck(Car[] car, int i) {
		if (max == car[i].getPosition()) {
			System.out.print(car[i].getName() + " ");
		}
	}

}
