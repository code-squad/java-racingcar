package racingcar;

import java.util.Scanner;

public class InputView {
	public static String inputName(Scanner scan) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
		return scan.nextLine();
	}
	public static String[] nameSplit(String names) {
		return names.split(",");
	}
	public static int tryingNumber(Scanner scan) {
		System.out.println("몇 번 하실 건가요?");
		return scan.nextInt();
	}
}
