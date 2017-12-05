package racingcar;

import java.util.ArrayList;

public class ResultView {
	private StringBuilder sb = new StringBuilder("-");

	public void printCar(Cars cars) {
		for (int i = 0; i < cars.getCars().size(); i++) {
			System.out.print(cars.getCar(i).getName() + ":");
			addDash(cars.getCar(i).getPosition());
		}
	}

	private void addDash(int pos) {
		while (pos > 0) {
			sb.append("-");
			pos--;
		}
		System.out.println(sb);
		sb.replace(0, sb.length(), "-");

	}

	public void printWinner(ArrayList<String> winners) {
		System.out.println(winners + ": 가 최종 우승하셨습니다");
	}
}
