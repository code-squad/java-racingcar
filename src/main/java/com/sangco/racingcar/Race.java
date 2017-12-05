package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		InputView iv = InputView.getInstance();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);

		Cars cars = new Cars();
		cars.addCar(carNames);
		cars.moveCars(tryTimes);
		ArrayList<Car> winner = cars.findWinner(cars.findMaxNum());
		doPrintWinner(winner);
	}

	private void doPrintWinner(ArrayList<Car> winner) {
		for (Car car : winner) {
			ResultView.printWinner(car);
		}
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
