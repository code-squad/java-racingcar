package racingcar;

import java.util.List;

public class ResultView {
	public static void resultPrint(Car car){
		System.out.println(car.sb);
	}
	
	public static void printWinner(String winner) {
		System.out.println(winner + ": 가 최종 우승하셨습니다");
	}
}
