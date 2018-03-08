package racingcar;

public class CarResult {

	private Car[] car;

	public CarResult(Car[] car) {
		this.car = car;
	}

	public void printResultView() {
		System.out.println("실행 결과");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getName() + " : ");
			printResultBar(i);
		}
	}

	public void printResultBar(int i) {
		for (int k = 0; k < car[i].getPosition(); k++) {
			System.out.print("-");
		}
		System.out.println();
	}

	void printWinnerView() {
		int max = 0;
		max = maxCompare(max);
		winnerCheck(max);
		System.out.println("가 최종 우승했습니다.");
	}

	public int maxCompare(int max) {
		for (int i = 0; i < car.length; i++) {
			max = maxCompareResult(max, i);
		}
		return max;
	}

	public int maxCompareResult(int max, int i) {
		return car[i].maxPosition(max);
	}

	public void winnerCheck(int max) {
		for (int i = 0; i < car.length; i++) {
			printWinnerResult(i, max);
		}
	}

	public void printWinnerResult(int i, int max) {
		if (max == car[i].getPosition()) {
			System.out.print(car[i].getName() + " ");
		}
	}
}
