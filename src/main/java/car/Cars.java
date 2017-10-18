package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	//필드는 다 prviate 으로 하는 게 좋나요?
	private List<Car> cars = new ArrayList<Car>();
	//turn 횟수를 Cars필드로 만들어도 될까요? 객체의 속성에 맞는지?
	
	public List<Car> getCars() {
		return cars;
	}
	
	public void setCars(List<Car> cars) {
		this.cars = cars;
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
}
