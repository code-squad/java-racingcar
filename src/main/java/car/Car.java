package java.car;

import java.utils.Seed;

public class Car {
    private final static int MOVE_STANDARD = 4;
    private int movedDistance;

    public Car() {
        movedDistance = 0;
    }

    public void move() {
        //+1이 되었는지 테스트 가능하도록
        if(isMovable(Seed.getRandomValue()))
            movedDistance++;
    }

    private boolean isMovable(int randomValue) {
        return randomValue >= MOVE_STANDARD;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < movedDistance ; ++i)
            sb.append('-');

        return sb.toString();
    }
}
