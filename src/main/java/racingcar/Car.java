package racingcar;

import java.util.Random;

public class Car {
	
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
	}
	

}