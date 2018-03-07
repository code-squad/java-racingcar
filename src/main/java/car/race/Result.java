package car.race;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Result {
	public String winnerNames;
	public int maxPosition;

	private void buildResult(Car e) {
		Output.printMessage(e.getName() + ": ");
		Output.printDash(e.getPosition());
		System.out.println("");
	}
	public void showResult(List<Car> cars) {
		for(Car e: cars) {
			buildResult(e);
		}
	}

	public void findMaxPosition(List<Car> cars) {
		List<Integer> carPositions = new ArrayList<>();
		for(Car e : cars) {
			carPositions.add(e.getPosition());
		}
		this.maxPosition = Collections.max(carPositions);
	}

	public void findWinner(List<Car> cars) {
		List<String> winner = new ArrayList<>();
		StringJoiner joiner = new StringJoiner(",");
		findMaxPosition(cars);
		for(Car e : cars) {
			if(e.getPosition() == this.maxPosition) {
				winner.add(e.getName());}
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
