package car.race;

public class Output extends CarRace {
	
	public void printResult(int numMoves) {
		//for each move:
		for(int move = 0; move < numMoves; move++) {
			printDash();
		}
		
	}
	public void printDash() {
		int randNumber = generateRandNum();
		if(randNumber > 4) {System.out.print("-");}
	}
}
