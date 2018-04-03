package racingGame;

import java.util.List;

/**
 * Created by hongjong-wan on 2018. 4. 2..
 */
public class ResultView {

    public static void printResult(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            printCarPosition(cars.get(i));
            newLineAdd();
        }
        newLineAdd();
    }

    private static void printCarPosition(Car car) {

        int position = car.getPosition();
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }

    private static void newLineAdd() {
        System.out.println();
    }

}