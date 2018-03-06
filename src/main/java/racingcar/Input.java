package racingcar;

import java.util.Scanner;

public class Input {
	static String[] carName(Scanner scanner) {   // 자동차의 이름을 입력하는 메서드
		String name = scanner.nextLine();
		String[] nameArr = name.split(",");
		return nameArr;
	}
	
	static int tryNum(Scanner scanner) {   // 시도할 횟수를 입력하는 메서드
		int tries = scanner.nextInt();
		return tries;
	}
}
