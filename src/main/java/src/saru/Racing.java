package saru;

import java.util.*;

public class Racing {
	private int time = 0;
	private int carNum = 0;
	private ArrayList<Integer> carPosition;
	private Scanner scanner;

	Racing() {
		scanner = new Scanner(System.in);
	}

	void listInit() {
		carPosition = new ArrayList<Integer>(carNum);
		for (int i = 0; i < 3; i++) {
			carPosition.add(1);
		}
	}

	int getCarNumber() {
		System.out.println("자동차 대수는 몇 대 인가요?");
		int carNum = scanner.nextInt();
		return carNum;
	}

	int getRunNumber() {
		System.out.println("시도할 회수는 몇 회 인가요?\n");
		int runNum = scanner.nextInt();
		return runNum;
	}

	int getRandNum() {
		Random random = new Random();
		int randNum = random.nextInt(10);
		return randNum;
	}

	boolean moveAhead(int randNum) {
		if (getRandNum() >= 4) {
			return true;
		}

		return false;
	}

	void loopList(int index) {
		for (int i = 0; i < time; i++) {
			int randNum = getRandNum();
			if (moveAhead(randNum)) {
				// 리스트 요소 접근 해서 ++
				int listValue = carPosition.get(index);
				listValue++;
				carPosition.set(index, listValue);
			}
		}
	}
	
	void printCar(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("-");
		}
		
		System.out.println();
	}

	public void run() {
		// TODO 구현
		carNum = getCarNumber();
		time = getRunNumber();

		listInit();

		for (int i = 0; i < carPosition.size(); i++) {
			loopList(i);
		}
	}

	public static void main(String[] args) {
		Racing myRacing = new Racing();
		myRacing.run();

		for (int i = 0; i < myRacing.carPosition.size(); i++) {
			myRacing.printCar(myRacing.carPosition.get(i));
		}
	}
}