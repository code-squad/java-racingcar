package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class RacingGame {
	private Rule rule;
	private List<Car> cars;
	
	public RacingGame(Rule rule, String... carNames) {
		this.rule = rule;
		cars = initCars(carNames);
	}

	public List<Car> play() {
		cars.forEach(car -> car.move(rule));
		return cars;
	}
	
	public List<Car> getWinner() {
		int bestTripMeter = getBestTripMeter();
		return cars.stream()
				.filter(car -> car.isTripMeter(bestTripMeter))
				.collect(toList());
	}
	
	public int getBestTripMeter() {
		return cars.stream()
				.map(Car::getTripMeter)
				.max(Integer::compareTo)
				.get();
	}

	private List<Car> initCars(String[] carNames) {
		return Arrays.stream(carNames)
				.map(carName -> new Car(carName))
				.collect(toList());
	}
}
