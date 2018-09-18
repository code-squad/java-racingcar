package racingcar;

import java.util.ArrayList;

import static racingcar.RacingGame.generateWinnerText;

public class ResultView {

    public static final String DASH = "-";

    public static void printResult(RacingGame racinggame) {
        ArrayList<Car> cars = racinggame.getResult();
        printGameResult(cars);
        System.out.println();
        System.out.print(generateWinnerText(RacingGame.findWinners(cars)));
        System.out.println("가 최종 우승했습니다.");
    }

    public static void printGameResult(ArrayList<Car> cars) {
        System.out.println("\n실행 결과");
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printMove(car.getPosition());
        }
    }

    public static void printMove(int move) {
        for (int i=0; i<move; i++) {
            System.out.print(DASH);
        }
        System.out.println();
    }
}
