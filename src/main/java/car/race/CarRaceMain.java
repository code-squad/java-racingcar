package car.race;

public class CarRaceMain {

	public static void main(String[] args) {
		CarRace race = new CarRace();
		
		race.askNames();
		String playerNames = Input.takeNames();
		
		race.askNumberofMoves();
		int numMoves = Input.takeNumberofMoves();
		
		race.setRaceParameters(playerNames, numMoves);
		race.startRace();
		race.printResult();

	}		
}
