package racingcar;

public class Car {
	// 상수를 정의하지 않으면 코드 이해하는 데 시간이 늘어남.
	// 읽기 쉬운 코드 -> 남이 읽기 쉬우면 나도 읽기 쉽다.
	private static final int FORWARD_NUM = 4;
	private String name;
	private int position;

	public Car(String name) {
		this(name, 0);
	}

	public Car(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public int getPosition() {
		return this.position;
	}

	public String getName() {
		return this.name;
	}

	public boolean move(int randomNo) {
		if (randomNo >= FORWARD_NUM) {
			this.position++;
			return true;
		}
		return false;
	}
}
