package car.race;

import java.util.Random;

public class CarRace {
	
	public static int generateRandNum() {
		Random rand = new Random();
		int randNum = rand.nextInt();
		return randNum;
	}
	
	public static void printDash() {
		int randNumber = generateRandNum();
		if(randNumber > 4) {System.out.print("-");}
	}
}
