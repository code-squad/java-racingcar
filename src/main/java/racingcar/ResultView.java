package racingcar;

import java.util.ArrayList;

public class ResultView {
    private static final String COMMA = ",";
    private static final String DASH = "-";
    private static final String ENTER = "\n";

    public static void printResult(ArrayList<Car> cars) {
        System.out.println(ENTER + "실행결과");
        for (Car car : cars) {
            System.out.printf(car.getName() + " : " + printImage(car.getPosition()) + ENTER);
        }
        System.out.println();
    }

    private static String printImage(int position) {
        String totalDash = "";
        for (int i = 0; i < position; i++) {
            totalDash += DASH;
        }
        return totalDash;
    }

    public static void printWinner(ArrayList<String> winners) {
        System.out.printf(String.join(COMMA, winners) + "가 최종우승했습니다.");
    }
}