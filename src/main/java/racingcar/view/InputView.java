package racingcar.view;

import java.util.Scanner;

public class InputView {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String[] getCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉽표(,)를 기준으로 구분).");
		return scanner.nextLine().split(",");
	}
	
	public static int getPlayCount() {
		System.out.println("시도할 회수는 몇 회 인가요? ");
		return scanner.nextInt();
	}
}
