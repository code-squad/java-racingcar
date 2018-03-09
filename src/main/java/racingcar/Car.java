package racingcar;

public class Car {

	private String name;
	private int position = 0;
	private static final int refVal = 4;

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
		if (randomValue > refVal) {
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
