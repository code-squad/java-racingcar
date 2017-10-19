package racingcar.view;

import java.util.Scanner;

import racingcar.model.Racing;

public class InputView {

	public Racing setRacing() {
		Scanner scan = new Scanner(System.in);

		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String inputStringValue = scan.nextLine();

		System.out.println("시도할 회수는 몇 회 인가요?");
		int moveCount = convertScanString(scan.nextLine());

		scan.close();
		return new Racing(inputStringValue, moveCount);
	}

	private int convertScanString(String scanString) {
		int returnValue = 0;

		try {
			returnValue = Integer.parseInt(scanString);
		} catch (Exception e) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		return returnValue;
	}
}
