package racingcar;

import java.util.ArrayList;

public class ResultView {
	
	public static void printResult(StringBuilder sb) {
		System.out.println(sb);
	}
	
	public static void printStatus(ArrayList<Car> cars) {
		StringBuilder sb;
		for (Car car : cars) {
			String carName = car.getName() + " : ";
			sb = getDash(car.getPosition());
			sb.insert(0, carName);
			ResultView.printResult(sb);
		}
		System.out.println();
	}
	
	public static StringBuilder getDash(int position) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < position; i++ ) {
			sb.append("-");
		}
		return sb;
	}
	
	public static void getWinner(Car winner) {
		System.out.println(winner.getName() + "가 우승하였습니다.");
	}
	
	public static void printWinner(ArrayList<Car> winner) {
		for (Car car : winner) {
			getWinner(car);
		}
	}
}
