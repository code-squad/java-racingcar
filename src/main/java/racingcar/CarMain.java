package racingcar;

import java.util.Scanner;

public class CarMain {
	
	//make Car Array
	public Car[] carArray(String[] name) {
		Car car[] = new Car[name.length];
		for (int i = 0; i < name.length; i++) {
			car[i]=new Car(name[i]);
		}
		return car;
	}
	
	//each car Status
	public static void eachCars(Car[] car) {
		for (int c = 0; c < car.length; c++) {
			Car cars = car[c];
			int rd = cars.makeRandomNumber();
			cars.go(rd);
			String currentDash = addDash(cars);
			System.out.println(car[c].getName() + " : " + currentDash);
		}
	}
	
	//addDash
	public static String addDash(Car cars) {
		String dash = "-";
		for(int i = 0; i<cars.getPosition();i++) {
			dash += "-";
		}
		return dash;
	}
	
	//repeat the games
	public static void repeatGame(int tryNum, Car[] car) {
		for (int i = 0; i < tryNum; i++) {
			eachCars(car);
			System.out.println("");
		}
	}
	
	//winner
	public static int winner(Car[] car) {
		int winner = 0;
		for (int i = 0; i < car.length; i++) {
			if (winner <= car[i].getPosition()) {
				winner = car[i].getPosition();
			}
		}
		return winner;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Inputname = InputView.inputName(scan);
		String[] name = InputView.nameSplit(Inputname);
		
		CarMain carRace = new CarMain();
		Car[] car = carRace.carArray(name);
	
		int tryNum = InputView.tryingNumber(scan);
		repeatGame(tryNum, car);
		
		int Winner = winner(car);
		ResultView.getWinner(car, Winner);
	}
}
