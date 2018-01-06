package car;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Car {
    private int move;
    private static final Random RANDOM = new Random();
    private static final String GO = "-";

    public void randomMove() {
        int randomNumber = RANDOM.ints(0, 9).findAny().getAsInt();
        if(checkIsMoreFour(randomNumber)) { increaseMove(); }
    }

    public void increaseMove() { move++; }

    public String print() {
        return appendResultString().toString();
    }

    public boolean checkIsMoreFour(int randomNumber) {
        if(randomNumber >= 4) { return true; }
        return false;
    }

    private StringBuilder appendResultString() {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, move).forEach(i -> builder.append(GO));
        return builder;
    }
}
