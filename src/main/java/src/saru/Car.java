package saru;

public class Car {
	private String name;
	private int position = 1;

	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, int position) {
		this.name = name;
		this.position = position;
	}

	int getPosition() {
		return this.position;
	}
	
	String getName() {
		return this.name;
	}

	void moveCar() {
		this.position++;
	}
}
