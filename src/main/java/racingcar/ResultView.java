package racingcar;

import java.util.ArrayList;

public class ResultView {

	public void printCar(Cars cars) {
		for (int i = 0; i < cars.getCars().size(); i++)
			System.out.println(cars.getCar(i).getName() + ":" + addDash(cars.getCar(i).getPosition()));
	}

	private String addDash(int pos) {
		StringBuilder sb = new StringBuilder("-");
		while (pos > 0) {
			sb.append("-");
			pos--;
		}

		return sb.toString();
	}

	public void printWinner(String[] winners) {
		for (String winner : winners) 
			System.out.println(winner + ": 가 최종 우승하셨습니다");
	}

	public void printResult(Cars carIns) {
		printCar(carIns);
		printWinner(carIns.compareWinner(carIns.findMaxScore()));
	}
}
