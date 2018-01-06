package car;

import java.util.Random;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class Car {
    private int move;
    private static final Random RANDOM = new Random();
    private static final String GO = "-";

    public Car() {
    }

    public Car(int move) {
        this.move = move;
    }

    public void randomMove() {
        int randomNumber = RANDOM.ints(0, 9).findAny().getAsInt();
        if(checkIsMoreFour(randomNumber)) { move++; }
    }

    public String print() {
        return appendResultString(new StringBuilder()).toString();
    }

    public boolean checkIsMoreFour(int randomNumber) {
        if(randomNumber >= 4) { return true; }
        return false;
    }

    private StringBuilder appendResultString(StringBuilder builder) {
        for(int i = 0; i < move; i++) {
            builder.append(GO);
        }
        return builder;
    }
}
