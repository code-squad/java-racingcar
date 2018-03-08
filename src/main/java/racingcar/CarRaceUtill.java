package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class CarRaceUtill {
	private ArrayList<Car> cars = new ArrayList<>();
	
	//make Car Array
	public void addCarNames(String[] carNames) {
		for(String names : carNames) {
			cars.add(new Car(names));
		}
	}
	
	//moving car
	public void moveCars(int tryNum) {
		for (int i = 0; i < tryNum; i++) {
			makeCarMove();
			ResultView.printStatus(cars);
		}
	}

	private void makeCarMove() {
		for (Car car : cars) {
			car.go(makeRandomNumber());
		}
	}
	
	//random number
	public int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);	
	}

	
	//winner
	public ArrayList<Car> winner(int topPosition) {
		ArrayList<Car> winner = new ArrayList<>();
		for (Car car : cars) {
			if (topPosition == car.getPosition()) {
				winner.add(car);
			}
		}
		return winner;
	}
	
	//topPosition
	public int topPosition() {
		int top = 0;
		for (Car car : cars) {
			if (top <= car.getPosition()) {
				top = car.getPosition();
			}
		}
		return top;
	}
}
