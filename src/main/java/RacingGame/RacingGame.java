package RacingGame;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
	// 인스턴스 변수는 최소한으로만 사용해야한다.
	// 메소드 단위로 테스트 코드를 작성하게 되므로 각 메소드 별로 입력과 반환 값을 넣는 것이 좋다.

	private int time;
	private int[] carPositions;
	private int carCounts;

	public void initialize(){
		Scanner sc = new Scanner(System.in);
		InputView inputView = new InputView();
		carCounts = inputView.getCountOfCar(sc);
		time = inputView.getTimeOfMove(sc);
		carPositions = new int[carCounts];
	}

	public void setCarPositions(){
		for(int i=0;i<time;i++){
			// 시도 횟수만큼 이동여부를 판단해서 배열에 저장
			carPositions = totalMoveCnt(getRandomArray(carCounts), carCounts, carPositions);
		}
	}

	public void move() {
		ResultView resultView = new ResultView();

		for(int i=0;i<carCounts;i++){
			// 이동 횟수에 따라 출력
			resultView.printMovement(carPositions[i]);
		}
	}

	/**
	 * 전체 자동차들의 이동 횟수를 반환하는 메서드
	 * @param randomArray 1~10 랜덤값
	 * @param carCounts 자동차 대수
	 * @param carPositions 현재 전체 자동차들의 이동 횟수가 담긴 배열
	 * @return 전체 자동차의 이동 횟수가 담긴 배열
	 */
	public int[] totalMoveCnt(int[] randomArray, int carCounts, int[] carPositions) {
		Car car = new Car();
		for(int i=0;i<carCounts;i++){
			carPositions[i] = car.moveYn(randomArray[i], carPositions[i]);
		}
		return carPositions;
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
		rg.initialize();
		rg.setCarPositions();
		rg.move();
	}
	
}
