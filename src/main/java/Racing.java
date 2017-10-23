import java.util.Random;
import java.util.Scanner;

public class Racing {

	private int time;
	private int[] carPositions = { 1, 1, 1 };
	Random random = new Random();

	public int run(int car) {
		int num = random.nextInt(11);
		if (num >= 4) {
			carPositions[car]++;
		}
		return carPositions[car];
	}

	// 고른 차로 시도하는 메소드
	public void returnCurrCarPositions(int numberOfCar) {
		int currCarValue;
		for (int j = 0; j < numberOfCar; j++) {
			currCarValue = run(j);
			changeTo_(currCarValue);
		}
	}

	public void changeTo_(int value) {
		for (int i = 0; i < value; i++) {
			System.out.print("-");
		}
		System.out.println("\n");
	}

	public void printAllTries(int numberOfCar, int numberOfTry) {
		time = numberOfTry;
		for (int i = 0; i < time; i++) {
			returnCurrCarPositions(numberOfCar);
			System.out.println("\n");
		}
	}
}
