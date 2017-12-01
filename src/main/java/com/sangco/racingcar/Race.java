package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import ch.qos.logback.classic.pattern.MarkerConverter;

public class Race {

	private void startGame() {
		Scanner scanCar = new Scanner(System.in);
		System.out.println("자동차 대수는 몇 대 인가요?");
		int howManyCar = scanCar.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		int howManyTimes = scanCar.nextInt();
		System.out.println();
		
		ArrayList<Car> carList = new ArrayList<>();
		makeCarInstance(howManyCar, carList);
		doRace(howManyTimes, howManyCar, carList);
	}
	
	private void makeCarInstance(int howManyCar, ArrayList<Car> carList) {
		for (int i = 0; i < howManyCar; i++) {
			carList.add(i, new Car());
		}
	}
	
	private void doRace(int howManyTimes, int howManyCar, ArrayList<Car> carList) {
		for (int i = 0; i < howManyTimes; i++) {
			doRaceEachTime(howManyCar, carList);
		}
	}
	
	private void doRaceEachTime(int howManyCar, ArrayList<Car> carList) {
		for (int i = 0; i < howManyCar; i++) {
			int numb = makeRandomNumb();
			Car car = carList.get(i);
			car.goOrNot(numb);
		}
		printBlank();
	}
	
	private int makeRandomNumb() {
		Random random = new Random();
		int numb = random.nextInt();
		return numb;
	}
	
	private void printBlank() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
