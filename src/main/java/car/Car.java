package car;

import util.RandomUtil;

import static util.Static.*;

public class Car {
    private int currentPosition;

    public Car() {
        this.currentPosition = 0;
    }

    public boolean tryMove() {
        if(RandomUtil.nextInt(RANDOM_NUM_BOUND) < MOVE_STANDARD_NUM)
            return false;

        move();
        return true;
    }

    private void move() {
        currentPosition++;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < currentPosition ; ++i)
            sb.append(MOVE_MARK);

        return sb.toString();
    }
}
