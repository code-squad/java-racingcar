package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars = new ArrayList<Car>();

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	//테스트
	public List<Car> makeCars(String nmStr) {
		for(String name : nmStr.split(",")) {
			cars.add(new Car(name.trim()));
		}
		return cars;
	}

	public void makeOneTurn() {
		for(Car car : cars) {
			car.move();
		}
	}

	public int getMaxPosition() {
		int max = 0;
		for (Car car : cars) {
				max = maxPosition(car.getPosition(), max);
		}
		return max;
	}

	public int maxPosition(int carPosition, int max) {
		return carPosition > max ? carPosition : max; 
	}
	
	public int testMaxPosition(List<Car> carList) {
		int max = 0;
		for (Car car : carList) {
			if(car.getPosition() > max) {
				max = car.getPosition();
			}
		}
		return max;
	}

	public List<String> getWinner() {
		List<String> winners = new ArrayList<String>();
		for (Car car : cars) {
			addWinner(car, winners);
		}
		return winners;
	}
	
	public void addWinner(Car car, List<String> winners) {
		//매번 메소드를 부르는 게 나을지 아니면 밖에서 int 변수로 넘겨주는 게 나을지..
		if(getMaxPosition() == car.getPosition()){
			winners.add(car.getName());
		}
	}
	
	public List<String> testWinner(List<Car> carsList) {
		List<String> winner = new ArrayList<String>();
		for (Car car : carsList) {
			if(2 == car.getPosition()){
				winner.add(car.getName());
			}
		}
		return winner;
	}
}
