package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingCar {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> carPosition = new ArrayList<Integer>();

		System.out.println("자동차 대수는 몇 대 인가요?");
		int carNumber = sc.nextInt();
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int tryNumber = sc.nextInt();

		setCar(carNumber, carPosition);
		goStop(carNumber, tryNumber, carPosition);
		carPosition.clear();
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

	private static void moveCar(int carNumber, Random ran, List<Integer> carPosition) {
		for (int k = 0; k < carNumber; k++) {
			int j = ran.nextInt(10);
			if (j >= 4)
				carPosition.set(k, carPosition.get(k) + 1);
		}
		drawStatus(carNumber, carPosition);
		System.out.println("\n\n");

	}

	public static void drawStatus(int carNumber, List<Integer> carPosition) {
		for (int i = 0; i < carNumber; i++) {
			drawCar(i, carPosition);

		}
	}

	private static void drawCar(int i, List<Integer> carPosition) {
		for (int t = carPosition.get(i); t > 0; t--)
			System.out.print("-");
		System.out.println();
	}
}