package racingcar;

import java.util.Random;
import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);

	String[] inputCar() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String input = sc.nextLine();
		String[] names = input.split(",");
		return names;
	}

	int input(String names[]) { // 입력받기
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int runNum = sc.nextInt();

		return runNum;
	}

	int[] run(int[] carPositions, int runNum, int carNum) {
		for (int i = 1; i <= runNum; i++) {
			chkCarPosition(carPositions, carNum);
		}
		return carPositions;
	}

	int[] chkCarPosition(int[] carPositions, int carNum) {
		for (int k = 0; k < carNum; k++) {
			carPositions = check(k, carPositions);
		}
		return carPositions;
	}

	int[] check(int k, int[] carPositions) {
		Random rand = new Random();
		int randMove = rand.nextInt(10);

		if (randMove >= 4) {
			carPositions[k] += 1;
		}
		return carPositions;
	}

	void resultPrint(int[] carPositions, String[] names) {
		System.out.println("실행 결과");

		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i]);

			barPrint(i, carPositions);
			System.out.println();

		}

		lastPrint(carPositions, names);

	}

	void lastPrint(int[] carPositions, String[] names) {
		int big = 0;

		big = compareResult(names, big, carPositions);

		winnerList(names, big, carPositions);

		System.out.println("가 최종 우승 하였습니다.");

	}

	int compareResult(String[] names, int big, int[] carPositions) {
		for (int i = 0; i < names.length; i++) {

			if (big < carPositions[i]) {
				big = carPositions[i];
			}
		}

		return big;
	}

	void winnerList(String[] names, int big, int[] carPositions) {
		for (int i = 0; i < names.length; i++) {
			if (big == carPositions[i]) {
				System.out.print(names[i] + " ");
			}
		}
	}

	void barPrint(int i, int[] carPositions) {

		for (int k = 0; k < carPositions[i]; k++) {
			System.out.print("-");
		}
	}

	public static void main(String[] args) {

		Car car = new Car();
		String names[] = car.inputCar();
		int[] carPositions = new int[names.length];

		carPositions = car.run(carPositions, car.input(names), names.length);
		car.resultPrint(carPositions, names);

	}
}
