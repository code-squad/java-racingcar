package racingcar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Car {
	
	Map<String, Integer> input() { // 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.println("자동차 대수는 몇 대 인가요?");
		int carNum = sc.nextInt();
		System.out.println("시도할 횟수는 몇 회 인가요?");
		int runNum = sc.nextInt();

		HashMap<String, Integer> input = new HashMap<>();
		input.put("자동차수", carNum);	
		input.put("횟수", runNum);
		return input;
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

	void resultPrint(int carNum, int[] carPositions) {
		System.out.println("실행 결과");
		for (int i = 0; i < carNum; i++) {
			barPrint(i, carPositions);
			System.out.println();
		}
	}

	void barPrint(int i, int[] carPositions) {
		for (int k = 0; k < carPositions[i]; k++) {
			System.out.print("-");
		}
	}

	public static void main(String[] args) {

		Car car = new Car();
		
		Map<String, Integer> input = car.input();

		int[] carPositions = new int[input.get("자동차수")]; 

		carPositions = car.run(carPositions, input.get("횟수"), input.get("자동차수"));

		car.resultPrint(input.get("자동차수"), carPositions);

	}
}
