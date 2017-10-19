package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars = new ArrayList<Car>();
	
	private int turnNum = 0;
	
	public Cars(String[] carNamesArr) {
		putNames(carNamesArr);
	}

	public List<Car> getCars() {
		return cars;
	}
	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public int getTurnNum() {
		return turnNum;
	}

	public void setTurnNum(int turnNum) {
		this.turnNum = turnNum;
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}
	
	public int getMaxPosition() {
		int maxNum = 0;
		for(Car car : cars) {
			if(maxNum < car.getPosition()) {
				maxNum = car.getPosition();
			}
		}
		return maxNum;
	}	

	public List<String> getWinner() {
		List<String> winner = new ArrayList<String>();
		int maxNum = getMaxPosition();
		for(Car car : cars) {
			if(maxNum == car.getPosition()) {
				winner.add(car.getName());
			}
		}
		return winner;
	}
	
	public void putNames(String[] carNamesArr) {
		for(String carName : carNamesArr) {
			addCar(new Car(carName.trim()));
		}
	}
	
	public void runMore() {
		for(Car car : cars) {
			car.move();
		}
	}
}