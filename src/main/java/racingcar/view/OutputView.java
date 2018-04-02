package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.IntStream;

public class OutputView {
	public static void showGameStart() {
		System.out.println("\n실행결과");
	}
	
	public static void showRoundOutput(int currentRoundNum, List<Car> cars) {
		System.out.println("Round " + currentRoundNum);
		
		cars.stream()
			.forEach(car -> {
						System.out.print(car.getName() + " : ");
						IntStream.range(0, car.getTripMeter())
								.forEach(t -> System.out.print("-"));
						System.out.println();
					});
		
		System.out.println();
	}

	public static void showWinnerOuput(List<Car> winners) {
		System.out.print(winners.stream()
				.map(winner -> winner.getName())
				.reduce((s, s2) -> s.concat(",").concat(s2))
				.get() + "이(가) 최종 우승했습니다.");
	}
}
