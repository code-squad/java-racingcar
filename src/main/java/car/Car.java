package car;

import static util.Static.*;

public class Car {
    private int currentPosition;

    public Car() {
        this.currentPosition = 0;
    }

    public void tryMove(int randomNum) {
        if(randomNum >= MOVE_STANDARD_NUM)
            currentPosition++;
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
