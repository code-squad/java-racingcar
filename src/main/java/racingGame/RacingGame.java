package racingGame;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGame {


    private static final int MOVE_CONDITION = 4;
    private List<Car> cars;


    public RacingGame(int carNum) {
        if (carNum < 0) {
            throw new IllegalArgumentException();
        }
        cars = new ArrayList<>();
        initCarPosition(carNum);
    }

    private void initCarPosition(int carNum) {
        for (int i = 0; i < carNum; i++) {
            cars.add(new Car(0));
        }
    }


    public void moveCars(int tryNum) {

        if (tryNum < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < tryNum; i++) {
            makeCarMove();
            printResult();
        }

    }

    private void makeCarMove() {

        for (int i = 0; i < cars.size(); i++) {
            if (MOVE_CONDITION <= RandomGenerator.getRandomNum()) {
                cars.set(i, cars.get(i).move());
            }
        }
    }

    public void printResult() {
        ResultView.printResult(cars);
    }

}