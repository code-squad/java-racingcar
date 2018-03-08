package racingcar;

public class Car {
	private String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}
	
	public boolean move(int randomNumber) { // go(), stop()을 만드는 것이 아니라 움직였는지 아닌지를 판단하면 move() 하나로 끝낼 수 있다.
		if( randomNumber >= 4 ) {
			this.position++;
			return true;
		}
		return false;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}
}
