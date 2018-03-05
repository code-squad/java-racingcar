package racingcar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * 초간단 자동차 경주 게임을 구현한다. 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다. 사용자는 몇 대의 자동차로
 * 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다. 전진하는 조건은 0에서 9까지 random 값을 구한 후 random
 * 값이 4이상일 경우이다. 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
 */

public class Car {
	
	Map<Integer, Integer> input() { // 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.println("자동차 대수는 몇 대 인가요?");
		int carNum = sc.nextInt();

		System.out.println("시도할 횟수는 몇 회 인가요?");
		int runNum = sc.nextInt();

		HashMap<Integer, Integer> input = new HashMap<>();
		input.put(1, carNum);	input.put(2, runNum);
		return input;
	}

	int[] run(int[] carPositions, int runNum, int carNum) {
		for (int i = 1; i <= runNum; i++) { // 횟수만큼돌기
			chkCarPosition(carPositions, carNum); //자동차 전진체크및업데이트
		}
		return carPositions;
	}

	int[] chkCarPosition(int[] carPositions, int carNum) {
		for (int k = 0; k < carNum; k++) { // 차대수만큼돌기
			carPositions = check(k, carPositions); // 랜덤돌리고 전진유무체크하기
		}
		return carPositions;
	}

	int[] check(int k, int[] carPositions) {
		Random rand = new Random(); // 랜덤
		int randMove = rand.nextInt(10);

		if (randMove >= 4) { // 랜덤값 4 이상이면 전진 (+1)
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
		Map<Integer, Integer> input = car.input();

		int[] carPositions = new int[input.get(1)]; // 차 위치 배열

		// 시작 및 체크 input.get(1) = carNum //input.get(2) = runNum
		carPositions = car.run(carPositions, input.get(2), input.get(1));

		// 실행 결과 출력
		car.resultPrint(input.get(1), carPositions);

		// main메서드
	}
}
