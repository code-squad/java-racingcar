package racing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joeylee on 2018-01-08.
 */
public class ResultView {

    public static void printDistanceResultEachCar(String carName, int distance) {
        System.out.print(carName + " : ");
        for(int i=0; i<=distance; i++) {
            System.out.print("-");
        }
    }

    public static void printWinner(String winner) {
        System.out.println(winner + " 가 최종 우승했습니다.");
    }
}
