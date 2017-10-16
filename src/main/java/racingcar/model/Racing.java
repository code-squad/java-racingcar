package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Racing {
	private List<Car> cars = new ArrayList<>();
	private int moveCount;
	
	public Racing(List<Car> cars, int moveCount) {
		super();
		this.cars = cars;
		this.moveCount = moveCount;
	}
	public List<Car> getCars() {
		return cars;
	}
	public int getMoveCount() {
		return moveCount;
	}

}
