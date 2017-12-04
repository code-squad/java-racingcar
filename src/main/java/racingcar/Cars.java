package racingcar;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

	public ArrayList<Car> getCars() {
		return cars;
	}

}