package car.race;

public class Car {
	String name;
	int position;
	
	public Car(String name) {
		this.name = name;
	}
	
	public void runCar(int numMoves) {
		for(int i = 0; i < numMoves; i++) {
			if(CarRace.generateRandNum() <= 4) {this.position++;}
		}
	}
}	
