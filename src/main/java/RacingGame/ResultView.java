package RacingGame;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.util.StringUtil;

import java.util.List;

public class ResultView {

	/**
	 * 전체 결과 출력 메서드
	 * @param cars
	 */
	public static void printResult(List<Car> cars, List<String> winners) {
		for(Car car : cars){
			printOneResult(car);
		}

		System.out.println(StringUtils.join(winners, ", ") + " 가 최종 우승했습니다.");
	}

	/**
	 * 한개 자동차에 대한 이동 거리 출력 메서드
	 * @param car
	 */
	public static void printOneResult(Car car){
		System.out.print(car.getCarName() + " : ");
		for(int i=0;i<car.getCarPosition();i++){
			System.out.print("-");
		}
		System.out.println("");
	}
}
