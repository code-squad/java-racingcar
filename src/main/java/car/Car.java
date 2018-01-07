package car;

import util.RandomUtil;

import static util.Static.*;

public class Car {
    private int currentPosition;

    public Car() {
        this.currentPosition = 0;
    }

    public void tryMove() {
        if(isMovable(RandomUtil.nextInt(RANDOM_NUM_BOUND)))
            currentPosition++;
    }

    public boolean isMovable(int randomNum) {
        return randomNum >= MOVE_STANDARD_NUM;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < currentPosition ; ++i)
            sb.append(MOVE_MARK);

        return sb.toString();
    }
}
