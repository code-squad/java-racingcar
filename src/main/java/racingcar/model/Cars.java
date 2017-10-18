package racingcar.model;

import java.util.List;

public class Cars {
	private List<Car> carList = null;

	public Cars(List<Car> carList) {
		super();
		this.carList = carList;
	}
	public Car getCar(int listNum) {
		return carList.get(listNum);
	}
	public String getCarName(int listNum) {
		return getCar(listNum).getCarName();
	}
	public int getPosition(int listNum) {
		return getCar(listNum).getPosition();
	}
	public void move(int listNum) {
		getCar(listNum).move();
	}
	public void randomMove(int listNum) {
		getCar(listNum).randomMove();
	}
}
