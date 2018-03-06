package racingcar;

public class CarResult {

	private Car[] car;

	public CarResult(Car[] car) {
		this.car = car;
	}

	void resultView(int carNum) {
		System.out.println("실행 결과");
		for (int i = 0; i < carNum; i++) {
			System.out.print(car[i].getName() + " : ");
			resultBar(i);
		}
	}

	void resultBar(int i) {
		for (int k = 0; k < car[i].getPosition(); k++) {
			System.out.print("-");
		}
		System.out.println();
	}

	void winnerView(int carNum) {
		int max = 0;
		max = maxCompare(carNum, max);
		winnerCheck(carNum, max);
		System.out.println("가 최종 우승했습니다.");
	}

	int maxCompare(int carNum, int max) {
		for (int i = 0; i < carNum; i++) {
			max = maxCompareResult(max, i);
		}
		return max;
	}

	int maxCompareResult(int max, int i) {
		if (max < car[i].getPosition()) {
			max = car[i].getPosition();
		}
		return max;
	}

	void winnerCheck(int carNum, int max) {
		for (int i = 0; i < carNum; i++) {
			winnerResult(i, max);
		}
	}

	void winnerResult(int i, int max) {
		if (max == car[i].getPosition()) {
			System.out.print(car[i].getName() + " ");
		}
	}

}
