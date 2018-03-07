package saru;

import java.util.*;

public class Utils {
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

	static void printCar(Car param) {
		System.out.print(param.getName() + " : ");

		for (int i = 0; i < param.getPosition(); i++) {
			System.out.print("-");
		}

		System.out.println();
	}

	static void printAll(ArrayList<Car> list) {
		for (int i = 0; i < list.size(); i++) {
			printCar(list.get(i));
		}
	}

	static void printResult(ArrayList<Car> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName());
			if (i < list.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(RESULT_FOOTER);
	}
}
