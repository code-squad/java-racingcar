package racingcar.model;

public class Car {
	private String carName;
	private int position;
	
	public Car(String carName) {
		super();
		this.carName = carName;
	}
	public String getCarName() {
		return carName;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
}
