package RacingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingGame {
	// 인스턴스 변수는 최소한으로만 사용해야한다.
	// 메소드 단위로 테스트 코드를 작성하게 되므로 각 메소드 별로 입력과 반환 값을 넣는 것이 좋다.

	private List<Car> cars;

	public RacingGame(int carCounts){
		cars = new ArrayList<Car>();

		for(int i=0;i<carCounts;i++){
			cars.add(new Car());
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
	 * 한개 자동차의 이동거리를 반환하는 메서드
	 * @param time 시도 회수
	 * @param car 자동차
	 * @return 자동차의 이동 거리
	 */
	public void countOfMove(int time, Car car){
		for(int i=0;i<time;i++){
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
		int carCounts = InputView.getCountOfCar(sc);
		int time = InputView.getTimeOfMove(sc);

		RacingGame racingGame = new RacingGame(carCounts);
		List<Car> cars = racingGame.move(time);

		ResultView.printResult(cars);
	}
}
