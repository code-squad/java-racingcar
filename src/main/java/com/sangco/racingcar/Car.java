package com.sangco.racingcar;

public class Car {
	private String name;
	private int position = 1;

	public Car(String name) {
		this.name = name;
	}

	public void movePosition(int ranNum) {
		if (ranNum >= 4) {
			position++;
		}
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}
}
