package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.IntStream;

public class OutputView {
	public static void showOuputStartView() {
		System.out.println("\n실행결과");
	}
	
	public static void showRoundOutputView(int currentRoundNum, List<Car> cars) {
		System.out.println("Round " + currentRoundNum);
		
		cars.stream()
			.forEach(car -> {
						System.out.print("|");
						IntStream.range(0, car.getTripMeter())
								.forEach(t -> System.out.print("-"));
						System.out.println();
					});
		
		System.out.println();
	}
}
