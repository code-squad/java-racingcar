package car.race;

public class CarRaceMain {

	public static void main(String[] args) {
		CarRace race = new CarRace();
		
		race.setRaceParameters();
		race.startRace();
		race.printResult();
	}		
}
