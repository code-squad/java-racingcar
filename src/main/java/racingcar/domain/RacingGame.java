package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingGame {
	private List<Rule> rules = new ArrayList<>();
	private List<Car> cars = new ArrayList<>();

	public RacingGame() {
		initRules();
	}
	
	public List<Car> play(int carCount, int roundCount) {
		initCars(prepareCars(carCount));
		IntStream.rangeClosed(1, roundCount)
				.forEach(roundNum -> OutputView.showRoundOutput(roundNum, playRound(cars)));
		return cars;
	}

	public List<Car> play(String[] carNames, int roundCount) {
		initCars(prepareCars(carNames));
		IntStream.rangeClosed(1, roundCount)
				.forEach(roundNum -> OutputView.showRoundOutput(roundNum, playRound(cars)));
		return cars;
	}

	public List<Car> getWinner() {
		int maxTripMeter = cars.stream()
								.mapToInt(car -> car.getTripMeter())
								.max()
								.getAsInt();
		return cars.stream()
				.filter(car -> maxTripMeter == car.getTripMeter())
				.collect(Collectors.toList());
	}
	
	private List<Car> playRound(List<Car> cars) {
		for(Car car : cars) {
			allowCarToPlayByRules(car);
		}
		return cars;
	}
	
	private void allowCarToPlayByRules(Car car) {
		for(Rule rule : rules) {
			car.move(rule);
		}
	}
	
	private boolean initRules() {
		rules.clear();
		return rules.add(new RandomRule());
	}

	private boolean initCars(List<Car> cars) {
		this.cars.clear();
		return cars.stream()
				.map(car -> this.cars.add(car))
				.reduce((aBoolean, aBoolean2) -> aBoolean && aBoolean2)
				.get();
	}
	
	private List<Car> prepareCars(int carCount) {
		return IntStream.range(0, carCount)
				.mapToObj(n -> new Car())
				.collect(Collectors.toList());
	}

	private List<Car> prepareCars(String[] carNames) {
		List<Car> cars = new ArrayList<>();
		Arrays.stream(carNames)
				.forEach(carName -> cars.add(new Car(carName)));
		return cars;
	}
}
