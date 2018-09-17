package racingcar;

import java.util.ArrayList;

public class ResultView {

    public static final String DASH = "-";
    public static final String COMMA = ",";


    public static void printResult(ArrayList<Car> cars) {
        System.out.println("\n실행결과");
        for (Car car : cars) {
            System.out.print(car.showName() + " : ");
            printMove(car.showPos());
        }
    }

    public static void printMove(int move) {
        for (int i = 0; i < move; i++) {
            System.out.print(DASH);
        }
        System.out.println();
    }

    public static void printWinner(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();

        int highest = Racing.findHigherScore(cars);

        for (Car car : cars) {
            winners.add(car.compareScore(highest));
            removeNullData(winners);
        }
        System.out.println("\n" + String.join(COMMA, winners) + "가 최종 우승했습니다.");
    }

    public static ArrayList removeNullData(ArrayList<String> names) {
        names.remove(null);
        return names;
    }
}
