package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
	private int time;
	private int[] carPositions = {0, 0, 0};

	public int[] move() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int carCount = 0;
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		carCount = sc.nextInt();
		System.out.println("시도할 회수는 몇 회 인가요?");
		time = sc.nextInt();
		
		for(int i=0;i<time;i++){
			totalMoveYn(ran, carCount);
		}

		for(int i=0;i<carPositions.length;i++){
			resultOne(i);
		}
		
		return carPositions;
	}

	private void resultOne(int i) {
		for(int j=0;j<carPositions[i];j++){
			System.out.print("-");
		}
		System.out.println("");
	}

	private void totalMoveYn(Random ran, int carCount) {
		for(int j=0;j<carCount;j++){
			moveYn(ran, j);	
		}
	}

	private void moveYn(Random ran, int j) {
		if(ran.nextInt(10)>=4){
			carPositions[j]++;
		}
	}
	
	public static void main(String[] args){
		RacingGame rg = new RacingGame();
		rg.move();
	}
	
}
