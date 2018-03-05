package car.race;

public class Output {
	
	public static void printResult(int numMoves) {
		//for each move:
		for(int move = 0; move < numMoves; move++) {
			printDash();
		}
	}
	
	public static void printDash() {
		int randNumber = CarRace.generateRandNum();
		if(randNumber > 4) {System.out.print("-");}
	}
}
