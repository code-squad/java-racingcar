package racingGame;

import java.util.List;

/**
 * Created by hongjong-wan on 2018. 4. 2..
 */
public class ResultView {

    public static void printTrace(List<Car> cars) {
        for (Car car : cars) {
            printCarPosition(car);
        }
        printNewLine();
    }

    private static void printCarPosition(Car car) {

        String carName = car.getName();
        System.out.print(carName + " : ");

        StringBuilder sb = new StringBuilder();
        int position = car.getPosition();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }

    public static void printWinner(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(",");
        }

        System.out.println(sb.substring(0, sb.length()-1) + "가 최종 우승했습니다.");
    }

    private static void printNewLine() {
        System.out.println();
    }
}
