package model;

import java.util.List;

public class CarService {
	private Cars cars;

	public Cars begin(String names, int turnNum) {
		cars = new Cars();
		cars.makeCars(names);
		return cars;
	}

	public void makeOneTurn() {
		cars.makeOneTurn();
	}
	
	public List<String> getWinner() {
		return cars.getWinner();
	}

}
