package saru;

import java.util.*;

public class Utils {
	private Utils() {}
	
	private static final String INPUT_MESSAGE = "이름을 입력하세요(,로 구분) : ";
	private static final String GET_RUN_NUM_MESSAGE = "시도할 회수는 몇 회 인가요?\n";
	private static final String RESULT_FOOTER = "가 우승했습니다";
	
	private static Scanner scanner = new Scanner(System.in);

	static String[] getInputName() {
		System.out.print(INPUT_MESSAGE);

		String multiString = scanner.nextLine();
		String[] splitString = multiString.split(",");
		return splitString;
	}

	static int getRunNumber() {
		System.out.println(GET_RUN_NUM_MESSAGE);
		int runNum = scanner.nextInt();
		return runNum;
	}

	static void printCar(Car carList) {
		System.out.print(carList.getName() + " : ");

		for (int i = 0; i < carList.getPosition(); i++) {
			System.out.print("-");
		}

		System.out.println();
	}

	static void printPositions(ArrayList<Car> carList) {
		for (int i = 0; i < carList.size(); i++) {
			printCar(carList.get(i));
		}
	}
	
	static void printComma(int nowIndex, int size) {
		if (nowIndex < size - 1) {
			System.out.print(", ");
		}
	}

	static void printResult(ArrayList<Car> resultList) {

		for (int i = 0; i < resultList.size(); i++) {
			System.out.print(resultList.get(i).getName());
			printComma(i, resultList.size());
		}
		System.out.print(RESULT_FOOTER);
	}
}
