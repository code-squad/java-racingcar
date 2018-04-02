package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RacingGame {
	private static List<Rule> rules = new ArrayList<>();
	
	static {
		initRules();
	}
	
	public static void play(int carCount, int roundCount) {
		List<Car> cars = prepareCars(carCount);
		IntStream.rangeClosed(1, roundCount)
				.forEach(roundNum -> OutputView.showRoundOutputView(roundNum, playRound(cars)));
	}
	
	private static List<Car> playRound(List<Car> cars) {
		for(Car car : cars) {
			allowCarToPlayByRules(car);
		}
		return cars;
	}
	
	private static void allowCarToPlayByRules(Car car) {
		for(Rule rule : rules) {
			car.move(rule);
		}
	}
	
	private static boolean initRules() {
		return rules.add(new RandomRule());
	}
	
	private static List<Car> prepareCars(int carCount) {
		List<Car> cars = new ArrayList<>();
		IntStream.range(0, carCount)
				 .forEach(n -> cars.add(new Car()));
		return cars;
	}
}
