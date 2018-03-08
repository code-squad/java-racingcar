package racingcar;

import java.util.Random;

public class MainCar {

	private Car[] car;

	public MainCar(Car[] car) {
		this.car = car;
	}

	void checkPosition(int time) {
		for (int k = 0; k < car.length; k++) {
			checkPosition(k, time);
		}
	}

	void checkPosition(int k, int time) {
		for (int i = 0; i < time; i++) {
			Random rand = new Random();
			car[k].updatePosition(rand.nextInt(10));
		}
	}

	public static void main(String[] args) {
		CarManager carManager = new CarManager();
		Car[] car = carManager.makeCarArray(carManager.inputCar());
		MainCar mainCar = new MainCar(car);
		mainCar.checkPosition(carManager.inputTime());

		CarResult carResult = new CarResult(car);
		carResult.printResultView();
		carResult.printWinnerView();
	}
}
