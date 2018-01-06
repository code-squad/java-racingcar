package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class InputView {
	private int time;
	private int[] carPositions;
	
	public void inputData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		carPositions = new int[sc.nextInt()];
		System.out.println("시도할 회수는 몇 회 인가요?");
		time = sc.nextInt();
	}
}
