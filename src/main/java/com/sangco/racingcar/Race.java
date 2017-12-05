package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {

	Cars cars = new Cars();

	private void startGame() {
		Scanner sc = new Scanner(System.in);
		InputView iv = InputView.getInstance();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);

		cars.addCar(carNames);
		moveCars(tryTimes);
		ArrayList<Car> winner = cars.findWinner(findMaxNum());
		doPrintWinner(winner);
	}

	private void moveCars(int tryTimes) {
		for (int i = 0; i < tryTimes; i++) {
			makeCarMove();
			printResult();
			printBlank();
		}
	}

	private void makeCarMove() {
		for (Car car : cars.getGroupOfCar()) {
			car.movePosition(createRanNum());
		}
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	private void printBlank() {
		System.out.println();
	}

	private void printResult() {
		StringBuilder sb;
		for (Car car : cars.getGroupOfCar()) {
			String carName = car.getName() + " : ";
			sb = getEachCarDash(car.getPosition());
			sb.insert(0, carName);
			ResultView.resultPrint(sb);
		}
	}

	private StringBuilder getEachCarDash(int position) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < position; i++) {
			sb.append("-");
		}
		return sb;
	}

	int findMaxNum() {
		int num = 0;
		for (Car car : cars.getGroupOfCar()) {
			if (num <= car.getPosition())
				num = car.getPosition();
		}
		return num;
	}

	private void doPrintWinner(ArrayList<Car> winner) {
		for (Car car : winner) {
			ResultView.printWinner(car.getName());
		}
	}

	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
