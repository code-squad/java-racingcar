package com.sangco.racingcar;

import java.util.ArrayList;

public class Cars {
	private ArrayList<Car> groupOfCar = new ArrayList<>();

	public void addCar(String[] carNames) {
		for (int i = 0; i < carNames.length; i++) {
			groupOfCar.add(new Car(carNames[i]));
		}
	}

	public ArrayList<Car> findWinner(int maxNum) {
		ArrayList<Car> winner = new ArrayList<>();
		for (Car car : groupOfCar) {
			if (maxNum == car.getPosition())
				winner.add(car);
		}
		return winner;
	}

	public ArrayList<Car> getGroupOfCar() {
		return groupOfCar;
	}
}