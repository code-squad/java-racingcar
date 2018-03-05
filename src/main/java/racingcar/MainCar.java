package racingcar;

import java.util.Random;
import java.util.Scanner;

public class MainCar {

	void inputTime(int carNum, int time, Car[] car) {
		for (int k = 0; k < carNum; k++) {
			for (int i = 0; i < time; i++) {
				Random rand = new Random();
				int rNum = rand.nextInt(10);

				if (rNum >= 4) {
					car[k].setPosition(car[k].getPosition() + 1);
				}
			}
		}
	}

	void resultView(int carNum, Car[] car) {

		System.out.println("실행 결과");
		for (int i = 0; i < carNum; i++) {
			System.out.print(car[i].getName() + " : ");

			for (int k = 0; k < car[i].getPosition(); k++) {
				System.out.print("-");
			}
			System.out.println();
		}

		int max = 0;
		for (int i = 0; i < carNum; i++) {
			if (max < car[i].getPosition()) {
				max = car[i].getPosition();
			}
		}

		for (int i = 0; i < carNum; i++) {
			if (max == car[i].getPosition()) {
				System.out.print(car[i].getName() + " ");
			}
		}

		System.out.println("가 최종 우승했습니다.");
	}

	public static void main(String[] args) {

		CarManager carManager = new CarManager();
		Car[] car = carManager.inputCar();
		int time = carManager.inputTime();

		MainCar mainCar = new MainCar();
		mainCar.inputTime(car.length, time, car);
		mainCar.resultView(car.length, car);

	}
}
