package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Race {

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		InputView iv = new InputView();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);

		ArrayList<Car> carIns = createCar(carNames);
		moveCar(tryTimes, carIns);
		ResultView.printWinner(compareScore(findMaxScore(carIns), carIns));
	}

	private ArrayList<Car> createCar(String[] carNames) {
		ArrayList<Car> cars = new ArrayList<Car>();
		for (int i = 0; i < carNames.length; i++) {
			Car car = new Car(carNames[i]);
			cars.add(i, car);
		}
		return cars;
	}

	private void moveCar(int tryTimes, ArrayList<Car> carIns) {
		for (int i = 0; i < tryTimes; i++) {
			setCarStatus(carIns);
			System.out.println();
		}
	}

	private void setCarStatus(ArrayList<Car> carIns) {
		for (int i = 0; i < carIns.size(); i++) {
			if (createRanNum() >= 4) {
				carIns.get(i).movePosition();
				carIns.get(i).appendDash();
			}
			ResultView.printCar(carIns.get(i));
		}
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	private int findMaxScore(ArrayList<Car> carIns) {
		int num = 0;
		for (int i = 0; i < carIns.size(); i++) {
			if (num <= carIns.get(i).position)
				num = carIns.get(i).position;
		}
		return num;
	}

	private ArrayList<String> compareScore(int num, ArrayList<Car> carIns) {
		ArrayList<String> winners = new ArrayList<String>();
		for (int i = 0; i < carIns.size(); i++) {
			if (num == carIns.get(i).position) 
				winners.add(carIns.get(i).name);
		}
		return winners;
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
