package racingcar;

public class Car {
	public String name;
	public int position = 1;
	public StringBuilder sb = new StringBuilder("-");

	Car(String name) {
		this.name = name;
	}

	public void movePosition() { // 두가지 일을 하고있다 안대앵
		position++;
	}


	public void appendDash() {
		sb.append("-");
	}

}
