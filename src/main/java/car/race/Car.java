package car.race;

import java.util.Random;

public class Car {
	String name;
	int position = 0;
	
	public Car(String name) {
		this.name = name;
	}
	
	public int countPosition(int numMoves) {
		
		for(int i = 0; i < numMoves; i++) {
			if(generateRandNum() <= 4) {
				position++;
			}
		}
		return position;
	}
	
	public static int generateRandNum() {
		Random rand = new Random();
		int randNum = rand.nextInt(10);
		return randNum;
	}
}	
