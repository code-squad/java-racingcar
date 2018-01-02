package racingcar_step3;

import java.util.Random;

public class Car {
	String name;
	int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public void move(int randomNumber, Car myCar) {
		if (randomNumber > 4) {
			myCar.position++;
		}
	}

	public int makeRandomNumber() {
		Random rd = new Random();
		return rd.nextInt(10) + 1;
	}

}
