package com.sangco.racingcar;

public class Car {
	public String name;
	public int position = 1;
	public StringBuilder sb =  new StringBuilder("-");
	
	public Car(String name) {
		this.name = name;
	}
	
	public void movePosition(int ranNum) {
		if(ranNum >= 4) {
			position++;
			sb.append("-");
		}
	}
}
