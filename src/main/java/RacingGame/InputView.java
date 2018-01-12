package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class InputView {
	// Step2, 자동차 이름 받도록 기능
	public static String getNameOfCar(Scanner sc){
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
		return sc.nextLine();
	}

	// Step1, 자동차 대수를 세는 기능(Step2에서 getNameOfCar Method로 대체)
	public static int getCountOfCar(Scanner sc){
		System.out.println("자동차의 대수는 몇 대인가요??");
		return sc.nextInt();
	}

	public static int getTimeOfMove(Scanner sc){
		System.out.println("시도할 회수는 몇 회 인가요??");
		return sc.nextInt();

	}
}
