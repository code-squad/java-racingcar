package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class RacingGame {
	private Rule rule = new RandomRule();
	private List<Car> cars = new ArrayList<>();
	
	public RacingGame(String[] carNames) {
		initCars(carNames);
	}

	public List<Car> play() {
		cars = cars.stream()
				.map(car -> playByRule(car))
				.collect(toList());
		return cars;
	}
	
	public List<Car> getWinner() {
		int maxTripMeter = cars.stream()
				.mapToInt(Car::getTripMeter)
				.max()
				.getAsInt();
		return cars.stream()
				.filter(car -> maxTripMeter == car.getTripMeter())
				.collect(toList());
	}

	private Car playByRule(Car car) {
		if(rule.isValid()) {
			car.move(rule.getMoveMeterForReward());
		}
		return car;
	}
	
	private boolean initCars(String[] carNames) {
		this.cars.clear();
		return Arrays.stream(carNames)
				.map(carName -> cars.add(new Car(carName)))
				.reduce((aBoolean, aBoolean2) -> aBoolean && aBoolean2)
				.get();
	}
}
