package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Cars {
	private ArrayList<Car> cars = new ArrayList<>();

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

	public void moveCars(int tryTimes) {
		for (int i = 0; i < tryTimes; i++) {
			this.setCarStatus();
			System.out.println();
		}
	}

	public void setCarStatus() {
		ResultView rv = new ResultView();
		for (int i = 0; i < cars.size(); i++) {
			if (createRanNum() >= 4) {
				findCar(i).movePosition();
			}
			rv.printCar(findCar(i));
		}
	}

	private Car findCar(int index) {
		return cars.get(index);
	}

	public int findMaxScore() {
		int num = 0;
		for (int i = 0; i < cars.size(); i++) {
			if (num <= findCar(i).position)
				num = findCar(i).position;
		}
		return num;
	}

	public ArrayList<String> compareScore(int num) {
		ArrayList<String> winners = new ArrayList<String>();
		for (Car car : cars) {
			if (car.isSameNum(num))
				winners.add(car.name);
		}
		return winners;
	}

}