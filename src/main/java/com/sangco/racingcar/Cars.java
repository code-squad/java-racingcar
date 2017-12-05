package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Cars {
	private ArrayList<Car> groupOfCar = new ArrayList<>();
	// groupOfCar에 경우에는 모든 메서드에서 바라보고 있다.
	// 인스턴스 변수로 올리는게 맞다.

	public void addCar(String[] carNames) {
		for (String string : carNames) {
			groupOfCar.add(new Car(string));
		}
	}

	public void moveCars(int tryTimes) {
		for (int i = 0; i < tryTimes; i++) {
			makeCarMove();
			ResultView.printResult(groupOfCar);
		}
	}

	private void makeCarMove() {
		for (Car car : groupOfCar) {
			car.movePosition(createRanNum());
		}
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	public ArrayList<Car> findWinner(int maxNum) {
		ArrayList<Car> winner = new ArrayList<>();
		for (Car car : groupOfCar) {
			if (maxNum == car.getPosition()) {
				winner.add(car);
			}
		}
		return winner;
	}

	public int findMaxNum() {
		int num = 0;
		for (Car car : groupOfCar) {
			if (num <= car.getPosition())
				num = car.getPosition();
		}
		return num;
	}

	public ArrayList<Car> getGroupOfCar() {
		return groupOfCar;
	}
}