package racinggame;

import java.util.List;
import java.util.Random;

import static java.util.Objects.isNull;

public class RacingGame {

    private final static int MAX_LIMIT = 9;
    private final static int MOVE_CRITERIA = 4;
    private final static String STRING_FORMAT = "-";
    private List<Car> carList;

    RacingGame(List<Car> carList) {
        if (isNull(carList) || carList.isEmpty())
            throw new IllegalArgumentException();

        this.carList = carList;
    }

    void start() {
        carList.forEach(this::move);
    }

    private void move(Car car) {
        if (isMoveAble(getRandomInt()))
            car.move();
    }

    boolean isMoveAble(int num) {
        return num >= MOVE_CRITERIA;
    }

    void printAll() {
        carList.forEach(car->print(car.getPosition()));
        nextLine();
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_LIMIT);
    }

    private void print(int position) {
        for (int i = 0; i < position; i++)
            System.out.print(STRING_FORMAT);
        nextLine();
    }

    private void nextLine() {
        System.out.println();
    }
}
