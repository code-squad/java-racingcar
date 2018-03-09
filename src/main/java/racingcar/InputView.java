package racingcar;

import java.util.Scanner;

public class InputView {
	public static String[] inputCarNames(Scanner scanner) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String carNames = scanner.nextLine();
		String[] names = carNames.split(",");
		return names;
	}

	public static int inputTryCount(Scanner scanner) {
		System.out.println("시도할 회수는 몇회인가요?");
		int challengeCount = scanner.nextInt();
		return challengeCount;
	}
}
