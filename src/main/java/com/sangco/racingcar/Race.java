package com.sangco.racingcar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {

	public ArrayList<String> winners = new ArrayList<>();
	//make for JUNIT Test
	
	private void startGame(){
		Scanner sc = new Scanner(System.in);
		InputView iv = InputView.getInstance();
		String[] carNames = iv.InputName(sc);
		int tryTimes = iv.InputTime(sc);
		
		ArrayList<Car> carIns = new ArrayList<>();
		createCar(carIns, carNames);
		moveCar(tryTimes, carIns, carNames);
	}
	
	public void createCar(ArrayList<Car> carIns, String[] carNames){
	//private -> public : because of the JUNIT Test	
		for (int i = 0; i < carNames.length; i++) {
			Car car = new Car(carNames[i]);
			carIns.add(i, car);
		}
	}
	
	public void moveCar(int tryTimes, ArrayList<Car> carIns, String[] carNames){
	//private -> public : because of the JUNIT Test	
		for (int i = 0; i < tryTimes; i++) {
			injectNum(carNames, carIns);
			System.out.println();
		}
		findMaxNum(carIns);
	}
	
	public void injectNum(String[] carNames, ArrayList<Car> carIns) {
	//private -> public : because of the JUNIT Test	
		for (int i = 0; i < carNames.length; i++) {
			int ranNum = createRanNum();
			carIns.get(i).movePosition(ranNum);
			ResultView.resultPrint(carIns.get(i));
		}
	}
	
	private int createRanNum(){
		Random random = new Random();
		return random.nextInt(10);
	}

	public void findMaxNum(ArrayList<Car> carIns) {
	//private -> public : because of the JUNIT Test	
		int num = 0;
		for (int i = 0; i < carIns.size(); i++) {
			if(num <= carIns.get(i).position) num = carIns.get(i).position;
		}
		compareScore(num, carIns);
	}
	
	public void compareScore(int num, ArrayList<Car> carIns) {
	//private -> public : because of the JUNIT Test	
		for (int i = 0; i < carIns.size(); i++) {
			if(num == carIns.get(i).position) {
				String winner = carIns.get(i).name;
				winners.add(winner);
				ResultView.printWinner(winner);
			}
		}
	}
	
	public static void main(String[] args) {
		Race race = new Race();
		race.startGame();
	}
}
