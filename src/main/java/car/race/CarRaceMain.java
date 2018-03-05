package car.race;

import java.util.List;

public class CarRaceMain {

	public static void main(String[] args) {
		String[] names = CarRace.askNames();
		int moves = CarRace.askNumberofMoves();
		
		List<Car> cars = CarRace.createCarInstance(names);
		CarRace.incrementPosition(cars, moves);
		
		CarRace.printResult(cars);
	}
}
