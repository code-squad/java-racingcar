package car;

import java.util.stream.IntStream;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Car {
    private int move;
    private String name;
    private static final String GO = "-";

    public Car(String name) {
        this.name = name;
    }

    public void randomMove(int randomNumber) {
        if(randomNumber >= 4) { increaseMove(); }
    }

    protected void increaseMove() { move++; }

    public String appendResultString() {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, move).forEach(i -> builder.append(GO));
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }
}
