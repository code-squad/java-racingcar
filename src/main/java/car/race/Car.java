package car.race;

public class Car {
	String name;
	int position = 0;
	
	public Car(String name) {
		this.name = name;
	}
	
	public int countPosition(int numMoves) {
		
		for(int i = 0; i < numMoves; i++) {
			if(CarRace.generateRandNum() <= 4) {
				position++;
			}
		}
		return position;
	}
	
}	
