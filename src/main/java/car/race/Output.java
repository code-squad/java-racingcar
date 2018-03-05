package car.race;

public class Output {
	
	public void printResult(int numMoves) {
		//for each move:
		for(int move = 0; move < numMoves; move++) {
			CarRace.printDash();
		}
	}

}
