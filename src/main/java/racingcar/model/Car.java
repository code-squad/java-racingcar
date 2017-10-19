package racingcar.model;

import java.util.Random;

public class Car {
	private String carName;
	private int position;
	
	public void addCar(String carName) {
		this.carName = carName;
	}
	
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

	public void move() {
		if (getRandomNo() >= 4)
			this.position++;
	}

	public int getRandomNo() {
		Random random = new Random();
		return random.nextInt(10);
	}
}
