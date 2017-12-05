package com.sangco.racingcar;

import java.util.ArrayList;

public class ResultView {
	private ResultView() {
	}

	public static void resultPrint(StringBuilder sb) {
		System.out.println(sb);
	}

	public static void printWinner(Car winnerCar) {
		System.out.println(winnerCar.getName() + ": 가 최종 우승했습니다.");
	}

	public static void printResult(ArrayList<Car> groupOfCar) {
		StringBuilder sb;
		for (Car car : groupOfCar) {
			String carName = car.getName() + " : ";
			sb = getEachCarDash(car.getPosition());
			sb.insert(0, carName);
			ResultView.resultPrint(sb);
		}
		printBlank();
	}

	private static void printBlank() {
		System.out.println();
	}

	private static StringBuilder getEachCarDash(int position) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < position; i++) {
			sb.append("-");
		}
		return sb;
	}
}
