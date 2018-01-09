package RacingGame;

import java.util.List;

public class ResultView {

	/**
	 * 전체 결과 출력 메서드
	 * @param cars
	 */
	public static void printResult(List<Car> cars) {
		for(Car car : cars){
			printOneResult(car);
		}
	}

	/**
	 * 한개 자동차에 대한 이동 거리 출력 메서드
	 * @param car
	 */
	public static void printOneResult(Car car){
		for(int i=0;i<car.getCarPosition();i++){
			System.out.print("-");
		}
		System.out.println("");
	}
}
