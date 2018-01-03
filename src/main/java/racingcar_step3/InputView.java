package racingcar_step3;

import java.util.Scanner;

public class InputView {

	public static String input(Scanner scanner) {
		return scanner.nextLine(); // 사용자로 부터 값 받기
	}

	public static String[] splitNames(String inputNames) {
		return inputNames.split(",");
	}
}
