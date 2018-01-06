package car;

import java.util.stream.IntStream;

import static car.RacingUtils.RESULT_UI;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Car {
    private int move;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void randomMove(int randomNumber) {
        if(randomNumber >= 4) { move++; }
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }

    public String getStatus() {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, move).forEach(i -> builder.append(RESULT_UI));
        return builder.toString();
    }
}