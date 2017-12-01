package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingCar {
	private static List<Integer> car_pos;

	static List<Boolean> isMove;
	static int car_num;
	static int try_num;

	static Random ran;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		car_pos = new ArrayList<Integer>();

		System.out.println("자동차 대수는 몇 대 인가요?");
		car_num = sc.nextInt();
		System.out.println("시도할 횟수는 몇 회 인가요?");
		try_num = sc.nextInt();

		setCar();
		goStop();
		car_pos.clear();
	}

	public static void setCar() {
		for (int i = 0; i < car_num; i++) {
			car_pos.add(1);
		}

	}

	public static void goStop() {
		ran = new Random();
		for (int i = 0; i < try_num; i++) {
			for (int k = 0; k < car_num; k++) {
				int j = ran.nextInt(10);
				if (j >= 4)
					car_pos.set(k, car_pos.get(k) + 1);
			}
			drawStatus();
			System.out.println("\n\n");
		}
	}

	public static void drawStatus() {
		for (int i = 0; i < car_num; i++) {
			for (int t = car_pos.get(i); t > 0; t--)
				System.out.print("-");
			System.out.println();
		}
	}
}