package racingcar;

public class Car {
	private String name;
	private int position = 1;

	Car(String name) {
		this.name = name;
	}

	public Car() {
	}

	public void movePosition(int ranNum) {
		if (ranNum >= 4)
			this.position++;
	}

	public int getPosition() {
		return this.position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean isSameNum(int num) {
		return this.position == num;
	}

}
