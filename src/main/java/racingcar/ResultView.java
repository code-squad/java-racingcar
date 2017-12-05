package racingcar;

import java.util.ArrayList;

public class ResultView {

	public void printCar(Car car) {
		System.out.print(car.name + " : " + car.sb);
		System.out.println("\n");
	}

	public void printWinner(ArrayList<String> winners) {
		System.out.println(winners + ": 가 최종 우승하셨습니다");
	}
}
