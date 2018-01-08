package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class InputView {
	public int getCountOfCar(Scanner sc){
		System.out.println("자동차의 대수는 몇 대인가요??");
		return sc.nextInt();
	}
	public int getTimeOfMove(Scanner sc){
		System.out.println("시도할 회수는 몇 회 인가요??");
		return sc.nextInt();

	}
}
