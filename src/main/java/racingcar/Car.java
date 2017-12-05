package racingcar;

public class Car {
	public String name;
	public int position = 1;
	public StringBuilder sb = new StringBuilder("-");

	Car(String name) {
		this.name = name;
	}

	public void movePosition() {
		this.position++;
		this.sb.append("-");
	}

	public boolean isSameNum(int num) {
		return this.position == num;
	}

}
