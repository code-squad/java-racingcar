package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Cars {
	private ArrayList<Car> cars = new ArrayList<>();
	private Race race;

	public void add(Car car) {
		cars.add(car);
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	public void setCarStatus() {
		for (int i = 0; i < cars.size(); i++) {
			if (createRanNum() >= 4) {
				cars.get(i).movePosition();
				cars.get(i).appendDash();
			}
			ResultView.printCar(cars.get(i));
		}
	}

}