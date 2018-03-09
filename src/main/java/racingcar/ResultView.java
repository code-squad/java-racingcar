package racingcar;

import java.util.ArrayList;

public class ResultView {
	public static void output(Car[] cars, ArrayList<String> winners) {
		System.out.println('\n' + "실행결과");
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i].getName() + " :");
			int position = cars[i].getPosition();
			scoreResult(position);
			System.out.println();
		}
		System.out.println();
		rankResult(winners);
	}

	private static void scoreResult(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("-");
		}
	}

	private static void rankResult(ArrayList<String> winners) {
		StringBuffer stringBuffer = new StringBuffer();

		String prefix = "";
		for (String winnerName : winners) {
			stringBuffer.append(prefix);
			prefix = ", ";
			stringBuffer.append(winnerName);
		}
		stringBuffer.append("가 최종 우승했습니다.");
		System.out.println(stringBuffer.toString());
	}
}
