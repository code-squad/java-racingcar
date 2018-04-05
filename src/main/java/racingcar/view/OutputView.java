package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class OutputView {
	private static final String TRIP_VIEW_UNIT = "　";
	
	public static void showGameStartView() {
		System.out.println("\n실행결과");
	}
	
	public static void showPlayView(List<Car> cars) {
		cars.forEach(car -> {
							System.out.print(car.getName() + " : ");
							IntStream.range(0, car.getTripMeter())
									.forEach(t -> System.out.print("-"));
							System.out.println();
						});
		
		System.out.println();
	}

	public static void showWinnerView(List<Car> winners) {
		System.out.print(winners.stream()
				.map(Car::getName)
				.collect(joining(", ")) + "이(가) 최종 우승했습니다.");
	}
	
	public static String getCarTripView(Car car) {
		StringBuilder builder = new StringBuilder();
		IntStream.range(0, car.getTripMeter())
				.forEach(i -> builder.append(TRIP_VIEW_UNIT));
		return builder.toString();
	}
}
