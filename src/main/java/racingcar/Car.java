package racingcar;

import java.util.Random;

public class Car {
<<<<<<< HEAD
	private int position = 0;
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void go(int randomNumber) {
		if (randomNumber > 4) {
			position++;
		}
	}
	
	//random number
	public int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);
=======
	
	//random number
	public int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);
	}
	
	//print dash
	public void printDash(int rd) {
		if(rd>=4) {
			System.out.print("-");
		}
	}
	
	//loop for each cars
	public void eachCars(int tryNum) {
		for(int c=0; c< tryNum; c++) {
			int rd = makeRandomNumber();
			printDash(rd);
		}
		System.out.println("");
	}
	
	//loop as many as user want
	public void race(int carNum, int tryNum) {
		for(int i=0; i<carNum; i++) {
			eachCars(tryNum);
		}
>>>>>>> JosephChun
	}
	

}