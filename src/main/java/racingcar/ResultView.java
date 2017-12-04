package racingcar;

import java.util.ArrayList;

public class ResultView {
	public static void printCar(Car car) {
		System.out.println(car.sb);
	}

	public static void printWinner(ArrayList<String> winners) {
		System.out.println(winners + ": 가 최종 우승하셨습니다");
	}
}
