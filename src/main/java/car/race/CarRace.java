package car.race;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class CarRace {
	private int moves;
	private String[] names;
	
	public CarRace(String playerNames, int numMoves) {
		this.names = playerNames.split(",");
		this.moves = numMoves;	
	}
	
	public List<Car> createCarInstances(){
		List<Car> cars = new ArrayList<>();
		for(int i = 0; i < names.length; i++) {
			cars.add(new Car(names[i]));
		}
		return cars;
	}
	
	public void startRace(List<Car> cars) {
		for(Car e : cars) {
			e.runCar(generateRandNumArray());
		}
	}
	
	public int[] generateRandNumArray() {
		int[] randNums = new int[this.moves];
		Random rand = new Random();
		for(int i = 0; i < this.moves; i++){
			randNums[i] = rand.nextInt(10);
		}
		return randNums;
	}
}
