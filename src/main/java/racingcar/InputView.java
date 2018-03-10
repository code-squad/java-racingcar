package racingcar;

import java.util.Scanner;

public class InputView {
	// 이럴 때에는 scanner.close()를 어디서 해줘야 할까? 
	// memory leak이 날 수 있는 것을 static으로 띄우는 것부터 잘못된 것은 아닐까?
	public static Scanner scanner = new Scanner(System.in);
	
	public static String[] getCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String userInputData = scanner.nextLine();
		String[] carNames = userInputData.split(",");
		return carNames;
	}

	public static int getTryCount() {
		System.out.println("시도할 회수는 몇회인가요?");
		return scanner.nextInt();
	}
}
