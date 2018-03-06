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

	
	
	public void askNames() {
		Output.printMessage("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분): ");
	}
	
	public void setNames() {		
		String s = Input.takeNames();
		this.names = s.split(",");
	}
	
	
	public void askNumberofMoves() {
		Output.printMessage("시도할 횟수는 몇 인가요?: ");
	}
	
	public void setNumberofMoves() {
		int moves = Input.takeNumberofMoves();
		this.moves = moves;
	}
	
	public void createCarInstances(){
		for(int i = 0; i < names.length; i++) {
			this.cars.add(new Car(names[i]));
		}
	}
	
	public void setRaceParameters() {
		askNames();
		setNames();
		askNumberofMoves();
		setNumberofMoves();
		createCarInstances();
	}
	
	public void startRace() {
		for(Car e : this.cars) {
			e.position = e.countPosition(moves);
		}
	}
	
	public void printResult() {
		for(Car e: this.cars) {
			Output.printMessage(e.name + ": ");
			Output.printDash(e.position);
			System.out.println("");
		}
		findWinner();
		printWinner();
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
	
	public void printWinner() {
		Output.printMessage("The winner is.. " + this.winnerNames + "!");
	}

}
