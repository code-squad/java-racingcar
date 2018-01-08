package car;

import java.util.Random;
import java.util.stream.IntStream;

public class Car {
    private final int RANGE = 9;
    private final int IS_MOVEABLE_STANDARD = 4;
    private int position;

    public void move(int tryNumber){
        this.position = tryForward(tryNumber, RANGE);
    }

    public void printMove() {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, this.position).forEach(i-> sb.append("-"));
        System.out.println(sb.toString());
    }

    public int tryForward(int tryNumber, int range) {
        return IntStream.generate(() -> getCalculatePosition(range, position)).limit(tryNumber).sum();
    }

    private int getCalculatePosition(int range, int position) {
        return getPosition(position, makeRandomNumber(range));
    }

    private int getPosition(int position, int random) {
        return isMovable(random, IS_MOVEABLE_STANDARD)? position+1 : position;
    }

    private boolean isMovable(int random, int standard) {
        return random > standard;
    }

    private int makeRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}
