package car.race;

public class Car {
	private String name;
	private int position;	
	
	public Car(String name) {
		this.name = name;
	}
	
	public void runCar(int[] randNum) {
		for(int i = 0; i < randNum.length; i++) {
			if(randNum[i] > 4){
				this.position++;
			}
		}
	}
	
	public int getPosition() {
		return this.position;
	}
	public String getName() {
		return this.name;
	}
	
}	
