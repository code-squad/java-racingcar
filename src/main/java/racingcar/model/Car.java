package racingcar.model;

import java.util.Random;

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
	public void move() {
		position++;
	}
	public void randomMove() {		
		Random random = new Random();
		if(random.nextInt(10)>=4) move();
	}
}
