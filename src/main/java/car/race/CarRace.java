package car.race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRace {
	private int moves;
	private List<Car> cars;
	
	public CarRace(String playerNames, int numMoves) {
		this.moves = numMoves;

		String[] names = playerNames.split(",");
		cars = new ArrayList<>();
		for(int i = 0; i < names.length; i++) {
			cars.add(new Car(names[i]));
		}
	}

	public void runCar(Car car, int tryNum) {
		for(int i = 0; i < tryNum; i++) {
			car.runOnce(generateRandNum());
		}
	}

	public void startRace() {
		for(Car e : cars) {
			runCar(e, moves);
		}
	}
	
	public static int generateRandNum() {
		Random rand = new Random();
			int randNum = rand.nextInt(10);

		return randNum;
	}

	public List<Car> getCars(){
		return this.cars;
	}
}
