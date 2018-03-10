package racingcar;

public class ResultView {
	public static void printResult(RacingGame racingGame) {
		System.out.println('\n' + "실행결과");
		for (Car car : racingGame.getCars()) {
			printCarsPosition(car);
		}

		/* printWinners */
		// 다양한 문자열 처리 편의를 위한 외부 패키지가 존재한다.
		String winners = String.join(",", racingGame.getWinners());
		System.out.println(winners + "가 최종 우승했습니다.");
	}

	public static void printCarsPosition(Car car) {
		System.out.print(car.getName() + " :");
		int position = car.getPosition();
		for (int i = 0; i < position; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}