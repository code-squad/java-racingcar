package racingcar;

import java.util.Random;

public class MainCar {

	void inputTime(int carNum, int time, Car[] car) {
		for (int k = 0; k < carNum; k++) {
			randFor(k, time, car);
		}
	}

	void randFor(int k, int time, Car[] car) {
		for (int i = 0; i < time; i++) {
			rand(car, k);
		}
	}

	void rand(Car[] car, int k) {
		Random rand = new Random();
		int rNum = rand.nextInt(10);
		if (rNum >= 4) {
			car[k].position = (car[k].getPosition() + 1);
		}
	}

	public static void main(String[] args) {

		CarManager carManager = new CarManager();
		Car[] car = carManager.inputCar();
		int time = carManager.inputTime();

		MainCar mainCar = new MainCar();
		mainCar.inputTime(car.length, time, car);

		CarResult carResult = new CarResult();
		carResult.resultView(car.length, car);
		carResult.winnerView(car.length, car);

	}
}
