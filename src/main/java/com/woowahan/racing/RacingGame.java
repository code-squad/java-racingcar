package com.woowahan.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

	private Random random;
	private int time;
	private ArrayList<Car> cars;

	public RacingGame(String[] names, int time) {
		this.random = new Random();
		this.time = time;
		initCars(names);
	}

	public RacingGame(List<String> names, int time) {
		this.random = new Random();
		this.time = time;
		initCars(names);
	}

	public void start() {
		for (int i = 0; i < time; i++) {
			moveCars();
		}
	}

	public void printResult() {
		System.out.println("\n실행 결과");
		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}

	public void printWinners() {
		int maxPosition = getMaxPosition(cars);
		List<Car> winners = getMatchPositionCar(cars, maxPosition);

		StringBuilder stringBuilder = new StringBuilder("\n");
		stringBuilder.append(getCarsName(winners));
		stringBuilder.append("이(가) 최종 우승했습니다.");

		System.out.println(stringBuilder.toString());
	}

	public static String getCarsName(List<Car> cars) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Car winner : cars) {
			stringBuilder.append(winner.getName());
			stringBuilder.append(", ");
		}

		stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

		return stringBuilder.toString();
	}

	public static List<Car> getMatchPositionCar(List<Car> cars, int position) {
		List<Car> matchCars = new ArrayList<>();

		for (Car car : cars) {
			addMatchCar(position, matchCars, car);
		}

		return matchCars;
	}

	public static void addMatchCar(int position, List<Car> matchCars, Car car) {
		if (car.getPosition() == position) {
			matchCars.add(car);
		}
	}

	private void initCars(String[] names) {
		cars = new ArrayList<>();
		for (String name : names) {
			cars.add(new Car(name));
		}
	}

	private void initCars(List<String> names) {
		cars = new ArrayList<>();
		for (String name : names) {
			cars.add(new Car(name));
		}
	}

	private void moveCars() {
		for (Car car : cars) {
			car.move(random.nextInt(10));
		}
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public static int getMaxPosition(List<Car> cars) {
		int maxPosition = 0;

		for (Car car : cars) {
			maxPosition = car.getPosition() > maxPosition ? car.getPosition() : maxPosition;
		}

		return maxPosition;
	}
}
