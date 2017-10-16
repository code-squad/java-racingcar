package racingcar.service;

import java.util.Random;
import java.util.Scanner;

import racingcar.model.Racing;

public class RacingService {
	public void setRacing(Racing racing) {
		Scanner scan = new Scanner(System.in);
		int carCount;
		int moveCount;
		
		System.out.println("자동차 대수는 몇 대 인가요?");
		carCount = convertScanString(scan.nextLine());		
		racing.setCarCount(carCount);
		
		System.out.println("시도할 회수는 몇 회 인가요?");
		moveCount = convertScanString(scan.next());
		racing.setMoveCount(moveCount);
		
		scan.close();
		
	}
	
	public void startRacing(Racing racing) {
		int carCount = racing.getCarCount();
		int moveCount = racing.getMoveCount();
		
		for(int i=0; i<carCount; i++) {
			printStep(randomMove(moveCount));
		}
		
	}
	
	public int randomMove(int moveCount) {
		int randomMoveCount = 0;
		
		Random random = new Random();
		for(int i=0; i<moveCount; i++) {
			if(random.nextInt(10)>=4) randomMoveCount++;
		}		
		return randomMoveCount;
	}
	
	public void printStep(int moveCount) {
		String printString = "";
		for(int i=0; i<moveCount; i++) {
			printString += "-";
		}
		System.out.println(printString);
	}
	
	//returnValue Exception 처리 잘모르겠음 return 값 처리도 잘못한거같음
	public int convertScanString(String scanString) {
		int returnValue = 0;
		try {
			returnValue = Integer.parseInt(scanString);			
		}catch(Exception e) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		return returnValue;		
	}

}
