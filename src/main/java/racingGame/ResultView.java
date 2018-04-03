package racingGame;

import java.util.List;

/**
 * Created by hongjong-wan on 2018. 4. 2..
 */
public class ResultView {

    public static void printTrace(List<Car> cars) {
        for(Car car : cars) {
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

    public static void printWinner(List<Car> winnerCars) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(Car car : winnerCars) {
            if(cnt++ > 1) {
                sb.append(", ");
            }
            sb.append(car.getName());
        }
        System.out.println(sb + "가 최종 우승했습니다.");
    }

    private static void printNewLine() {
        System.out.println();
    }
}
