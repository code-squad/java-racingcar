package racingcar;

public class Car {
	
	private static final int REFVAL = 4;
	private String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void updatePosition(int randomValue) {
		if (randomValue > REFVAL) {
			position++;
		}
	}

	public int maxPosition(int max) {
		if (max < position) {
			return position;
		}
		return max;
	}
}
