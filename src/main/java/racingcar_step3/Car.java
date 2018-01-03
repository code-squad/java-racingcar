package racingcar_step3;

import java.util.Random;

public class Car {
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

	public void move(int randomNumber) {
		if (randomNumber > 4) {
			position++;
		}
	}

	public int makeRandomNumber() {
		Random rd = new Random();
		return rd.nextInt(10);
	}

}
