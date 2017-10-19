package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
	private List<Car> cars = null;

	public Cars() {
		this.cars = new ArrayList<>();
	}

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public void add(Car car) {
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}

	public String getListString() {
		String carsString = "";
		for (Car car : cars) {
			carsString += car.getCarName() + ",";
		}
		return carsString.substring(0, carsString.length() - 1);
	}

	private Car getCar(int listNum) {
		return cars.get(listNum);
	}

	public int getPosition(int listNum) {
		return getCar(listNum).getPosition();
	}

	public int size() {
		return cars.size();
	}
	
	public void sortByPosition() {
		Collections.sort(cars, new PositionDescCompare());
	}
	
	static class PositionDescCompare implements Comparator<Car> {
		@Override
		public int compare(Car car1, Car car2) {
			return car1.getPosition() > car2.getPosition() ? -1 : car1.getPosition() < car2.getPosition() ? 1:0;
		} 
	}
}
