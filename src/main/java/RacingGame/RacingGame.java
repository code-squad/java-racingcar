package RacingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingGame {
	// 인스턴스 변수는 최소한으로만 사용해야한다.
	// 메소드 단위로 테스트 코드를 작성하게 되므로 각 메소드 별로 입력과 반환 값을 넣는 것이 좋다.

	private List<Car> cars;

	public RacingGame(){
		cars = new ArrayList<Car>();
	}

	public RacingGame(String carNames){
		cars = new ArrayList<Car>();
		String[] carNameArray = carNames.split(",");

		for(int i=0;i<carNameArray.length;i++){
			cars.add(new Car(carNameArray[i]));
		}
	}

	/**
	 * 자동차들을 이동 시킨 후, 그 자동차의 리스트를 반환하는 메서드
	 * @param time 시도 회수
	 * @return 이동거리를 가진 자동차 List
	 */
	public List<Car> move(int time) {
		for(Car car : cars){
			countOfMove(time, car);
		}

		return cars;
	}

	/**
	 * 우승자 명단을 생성하는 메소드
	 * @return 우승자 명단
	 */
	public List<String> setWinnerList() {
		List<String> winners = new ArrayList<String>();

		for(Car car : cars){
			addWinner(car, winners);
		}

		return winners;
	}

	/**
	 * 해당 자동차의 우승여부를 판단하고 우승자라면 우승자 명단에 추가하는 메소드
	 * @param car
	 * @param winners
	 */
	public void addWinner(Car car, List<String> winners){
		if(car.getCarPosition() == checkWinRecord()){
			winners.add(car.getCarName());
		}
	}

	/**
	 * 우승자의 기록을 생성하는 메소드
	 * @return 우승자 기록
	 */
	public int checkWinRecord(){
		int positionForWin = 0;
		for(Car car : cars){
			positionForWin = max(car.getCarPosition(), positionForWin);
		}
		return positionForWin;
	}

	/**
	 * 입력된 두 값을 비교하는 메소드
	 * @param carPosition
	 * @param curCountOfWin
	 * @return 최대값
	 */
	public int max(int carPosition, int curCountOfWin) {
		if(curCountOfWin <= carPosition){
			return carPosition;
		}
		return curCountOfWin;
	}

	/**
	 * 한개 자동차의 이동거리를 반환하는 메서드
	 * @param time 시도 회수
	 * @param car 자동차
	 * @return 자동차의 이동 거리
	 */
	public void countOfMove(int time, Car car) {
		for (int i = 0; i < time; i++) {
			car.movePosition(getRandom());
		}
	}
	/**
	 * 랜덤값 산출 메서드
	 * @return 0~10 간의 랜덤 값
	 */
	private int getRandom(){
		Random ran = new Random();
		return ran.nextInt(10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carNames = InputView.getNameOfCar(sc);
		int time = InputView.getTimeOfMove(sc);

		RacingGame racingGame = new RacingGame(carNames);
		ResultView.printResult(racingGame.move(time), racingGame.setWinnerList());
	}
}
