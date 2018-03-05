package car.race;

import java.util.Random;

public class CarRace {
	
	public static int generateRandNum() {
		Random rand = new Random();
		int randNum = rand.nextInt();
		return randNum;
	}
	
	public static void startRace(String[] names, int numMoves) {
		int numCars = names.length;
		for(int car = 0; car < numCars; car++) {
			System.out.println("");
			System.out.print(names[car] + ": ");
			Output.printResult(numMoves);
		}
	}
	
	public static void findWinner() {
		
	}
}
