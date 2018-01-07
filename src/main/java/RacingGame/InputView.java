package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class InputView {
	private int time;
	private int[] carPositions;
	private int carCounts;
	
	public void inputData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		this.carCounts = sc.nextInt();
		carPositions = new int[carCounts];
		System.out.println("시도할 회수는 몇 회 인가요?");
		this.time = sc.nextInt();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int[] getCarPositions() {
		return carPositions;
	}

	public void setCarPositions(int[] carPositions) {
		this.carPositions = carPositions;
	}

	public int getCarCounts() {
		return carCounts;
	}

	public void setCarCounts(int carCounts) {
		this.carCounts = carCounts;
	}
}
