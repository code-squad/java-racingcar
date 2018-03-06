package car.race;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class CarRace {
	private int moves;
	private String[] names;
	private List<Car> cars = new ArrayList<>();
	private String winnerNames = new String();

	public void setNames(String playerNames) {		
		this.names = playerNames.split(",");
	}
	
	public void setNumberofMoves(int numMoves) {
		this.moves = numMoves;
	}
	
	public void createCarInstances(){
		for(int i = 0; i < names.length; i++) {
			this.cars.add(new Car(names[i]));
		}
	}
	
	public void setRaceParameters(String playerNames, int numMoves) {
		setNames(playerNames);
		setNumberofMoves(numMoves);
		createCarInstances();
	}
	
	public void startRace() {
		for(Car e : this.cars) {
			e.position = e.countPosition(moves);
		}
	}
	
	public void findWinner() {
		List<Integer> positions = new ArrayList<>();
		List<Integer> maxIndex = new ArrayList<>();
		List<String> cars = new ArrayList<>();
		List<String> winner = new ArrayList<>();
		StringJoiner joiner = new StringJoiner(",");
	
		for(Car e : this.cars) {
			positions.add(e.position); cars.add(e.name);
		}
		int maxPosition = Collections.max(positions);
		
		for(int i = 0; i < positions.size(); i++) {
			if(positions.get(i) == maxPosition) {maxIndex.add(i);}
		}
		for(int i : maxIndex) {
			winner.add(cars.get(i));
		}
		for(String name : winner) {
			joiner.add(name);
		}
		this.winnerNames = joiner.toString();
	}
	
	public String getWinnerNames() {
		return this.winnerNames;
	}
	
	public void showResult() {
		for(Car e: this.cars) {
			Result.buildResult(e);
		}
	}
}
