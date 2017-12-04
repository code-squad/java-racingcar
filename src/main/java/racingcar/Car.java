package racingcar;

import java.util.List;
import java.util.Random;

public class Car {
	private String name;
	private int initPosition = 1;
	
	public Car(String name){
		this.name = name;
	}
	public static void setCar(int carNumber, List<Integer> carPosition) {
		for (int i = 0; i < carNumber; i++) {
			carPosition.add(1);
		}
	}
	public static void goStop(int carNumber, int tryNumber, List<Integer> carPosition) {
		Random ran = new Random();
		for (int i = 0; i < tryNumber; i++)
			moveCar(carNumber, ran, carPosition);

	}

}
