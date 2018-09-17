package racingcar;

import java.util.ArrayList;

public class ResultView {
    private static final String COMMA = ",";
    private static final String DASH = "-";

    private static int MAX_POSITION = 0;
    private static ArrayList<String> winners = new ArrayList<>();

    public static void printResult(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf(cars.get(i).name + " : ");
            printImage(cars, i);
            System.out.println("");
        }
    }

    private static void printImage(ArrayList<Car> cars, int i) {
        for (int j = 0; j < cars.get(i).position; j++) {
            System.out.printf(DASH);
        }
    }

    public static void printWinner(ArrayList<Car> cars) {
        maxPositionJudge(cars);
        for (int i = 0; i < cars.size(); i++) {
            printWinnerProcess(cars, i);
        }
        System.out.printf(String.join(COMMA, winners) + "가 최종우승했습니다.");
    }

    private static void printWinnerProcess(ArrayList<Car> cars, int i) {
        if (cars.get(i).position == MAX_POSITION) {
            winners.add(cars.get(i).name);
        }
    }

    private static void maxPositionJudge(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            maxPositionJudgeProcess(cars, i);
        }
    }

    private static void maxPositionJudgeProcess(ArrayList<Car> cars, int i) {
        if (cars.get(i).position > MAX_POSITION) {
            MAX_POSITION  = cars.get(i).position;
        }
    }
}
