package car.race;

import java.util.ArrayList;
import java.util.List;

public class CarRace {
	private int moves;
	private String[] names;
	private List<Car> cars = new ArrayList<>();
	
	
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
	}
	
	public void printWinner() {
		int maxPosition = 0; String winnerName = new String();
		for(Car e : this.cars) {
			if(e.position > maxPosition) {maxPosition = e.position; winnerName = e.name;}
		}
		Output.printMessage("The winner is.. " + winnerName + "!");
	}

}
