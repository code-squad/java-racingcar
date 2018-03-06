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
			e.runCar(this.moves);
		}
	}
	
	public static int generateRandNum() {
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		return randNum;
	}	
	
	public int findMaxPosition(List<Car> cars) {
		List<Integer> carPositions = new ArrayList<>();
		for(Car e : cars) {
			carPositions.add(e.position);
		}
		int maxPosition = Collections.max(carPositions);
		return maxPosition;
	}
	
	public String findWinner(List<Car> cars) {
		List<String> winner = new ArrayList<>();
		StringJoiner joiner = new StringJoiner(",");
		int maxPosition = findMaxPosition(cars);
		
		for(Car e : cars) {
			if(e.position == maxPosition) {winner.add(e.name);}
		}
		for(String name : winner) {
			joiner.add(name);
		}
		String winnerNames = joiner.toString();
		return winnerNames;
	}
	
	public void showResult(List<Car> cars) {
		for(Car e: cars) {
			Result.buildResult(e);
		}
	}
}
