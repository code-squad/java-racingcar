package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cars {
	private static final Logger log = LoggerFactory.getLogger(Cars.class);
	private List<Car> cars = new ArrayList<>();
	
	public Cars() {
		
	}

	Cars(String[] names) {
		for (String name : names)
			cars.add(new Car(name));
	}
	

	public void add(Car car) {
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}

	public Car getCar(int i) {
		return cars.get(i);
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	public void moveCars(int tryTimes) {
		for (int i = 0; i < tryTimes; i++) {
			this.setCarStatus();
		}
	}

	public void setCarStatus() {
		for (int i = 0; i < cars.size(); i++)
			findCar(i).movePosition(createRanNum());
	}

	private Car findCar(int index) {
		return cars.get(index);
	}

	public int findMaxScore() {
		int num = 0;
		for (Car car : cars) {
			if (num <= car.getPosition())
				num = car.getPosition();
		}
		return num;
	}

	public ArrayList<String> compareWinner(int num) {
		ArrayList<String> winners = new ArrayList<String>();
		for (Car car : cars) {
			if (car.isSameNum(num))
				winners.add(car.getName());
		}
		return winners;
	}

}