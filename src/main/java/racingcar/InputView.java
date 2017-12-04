package racingcar;

import java.util.Scanner;

public class InputView {
	public String[] inputName(Scanner sc){
		System.out.println("자동차 이름을 입력해주세요.(쉼표로 구분)");
		String carName = sc.nextLine();
		return carName.split(",");
	}
	
	public int inputTime(Scanner sc){
		System.out.println("시도할 횟수는 몇회입니까?");
		return sc.nextInt();
	}
}
