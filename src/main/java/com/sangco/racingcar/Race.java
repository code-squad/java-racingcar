package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {

	private void startGame(){
		Scanner sc = new Scanner(System.in);
		InputView iv = InputView.getInstance();
		String[] carNames = iv.inputName(sc);
		int tryTimes = iv.inputTime(sc);
		
		ArrayList<Car> cars = createCar(carNames);
		cars = moveCar(tryTimes, cars);
		printWinner(compareScore(findMaxNum(cars), cars));
	}
	
	ArrayList<Car> createCar(String[] carNames){
		ArrayList<Car> cars = new ArrayList<>(); 
		for (int i = 0; i < carNames.length; i++) {
			cars.add(new Car(carNames[i]));
		}
		return cars;
	}
	
	private ArrayList<Car> moveCar(int tryTimes, ArrayList<Car> cars){
		for (int i = 0; i < tryTimes; i++) {
			cars = injectNum(cars);
		}
		return cars;
	}
	
	private ArrayList<Car> injectNum(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).movePosition(createRanNum());
		}
		printResult(cars);
		System.out.println();
		return cars;
	}
	
	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	private void printResult(ArrayList<Car> cars) {
		StringBuilder sb;
		for (int i = 0; i < cars.size(); i++) {
			String carName = cars.get(i).getName() + " : ";
			sb = getEachCarDash(cars.get(i).getPosition());
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
	
	private void printWinner(ArrayList<String> winners) {
		for (int i = 0; i < winners.size(); i++) {
			ResultView.printWinner(winners.get(i));
		}
	}
	
	ArrayList<String> compareScore(int maxNum, ArrayList<Car> cars) {
		ArrayList<String> winners = new ArrayList<>();
		for (int i = 0; i < cars.size(); i++) {
			if(maxNum == cars.get(i).getPosition()) {
				winners.add(cars.get(i).getName());
			}
		}
		return winners;
	}
	
	int findMaxNum(ArrayList<Car> cars) {
		int num = 0;
		for (int i = 0; i < cars.size(); i++) {
			if(num <= cars.get(i).getPosition()) num = cars.get(i).getPosition();
		}
		return num;
	}
	
	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
