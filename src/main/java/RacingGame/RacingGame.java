package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
	// 인스턴스 변수는 최소한으로만 사용해야한다.
	// 메소드 단위로 테스트 코드를 작성하게 되므로 각 메소드 별로 입력과 반환 값을 넣는 것이 좋다.

	public int[] move() {
		InputView inputView = new InputView();
		inputView.inputData();		
		ResultView resultView = new ResultView();
		
		for(int i=0;i<inputView.getTime();i++){
			// 시도 횟수만큼 이동여부를 판단해서 배열에 저장
			inputView.setCarPositions(totalMoveCnt(getRandomArray(inputView.getCarCounts()), inputView.getCarCounts(), inputView.getCarPositions()));;
		}

		for(int i=0;i<inputView.getCarCounts();i++){
			// 이동 횟수에 따라 출력
			resultView.printMovement(inputView.getCarPositions()[i]);
		}
		
		return inputView.getCarPositions();
	}

	/**
	 * 전체 자동차들의 이동 횟수를 반환하는 메서드
	 * @param ranNum 1~10 랜덤값
	 * @param carCounts 자동차 대수
	 * @param carPositions 현재 전체 자동차들의 이동 횟수가 담긴 배열
	 * @return 전체 자동차의 이동 횟수가 담긴 배열
	 */
	public int[] totalMoveCnt(int[] randomArray, int carCounts, int[] carPositions) {
		for(int i=0;i<carCounts;i++){
			carPositions[i] = moveYn(randomArray[i], carPositions[i]);	
		}
		return carPositions;
	}

	/**
	 * 자동차의 이동 여부를 판단하는 메서드
	 * @param moveCnt 현재 저장되어있는 이동 횟수
	 * @return 수정된 이동 횟수
	 */
	public int moveYn(int ranNum, int moveCnt) {
		if(ranNum>=4){
			moveCnt++;
		}
		return moveCnt;
	}
	
	/**
	 * 랜덤 배열 산출 메서드
	 * @param carCounts
	 * @return
	 */
	private int[] getRandomArray(int carCounts) {
		int[] randomArray = new int[carCounts];
		for(int j=0;j<carCounts;j++){
			randomArray[j] = getRandom(); 
		}
		return randomArray;
	}	
	
	/**
	 * 랜덤값 산출 메서드
	 * @return 0~10 간의 랜덤 값
	 */
	public int getRandom(){
		Random ran = new Random();
		return ran.nextInt(10);
	}
	
	public static void main(String[] args){
		RacingGame rg = new RacingGame();
		rg.move();
	}
	
}
