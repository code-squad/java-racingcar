package saru;

public class Car {
	private static final int GO_AHEAD_NUM = 4;
	private String name;
	private int position = 0;

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
	
	boolean isMatchPosition(int toCheckPosition) {
		return this.position == toCheckPosition;
	}
	
	String getName() {
		return this.name;
	}

	void moveCar() {
		this.position++;
	}
	
	boolean isCanMove(int randNum) {
		if (randNum >= GO_AHEAD_NUM) {
			return true;
		}

		return false;
	}

}
