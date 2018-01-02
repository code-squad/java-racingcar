package racingcar_step3;

import java.util.Scanner;

public class InputView {

	public String input(Scanner sc) {
		return sc.nextLine(); // 사용자로 부터 값 받기
	}

	public String[] splitNames(String inputNames) {
		return inputNames.split(",");
	}
}
