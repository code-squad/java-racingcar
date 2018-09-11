package racingcar;

import java.util.Random;

public class Car {

    private static final int MAXRANDNUM = 10;
    private static final int MINRANDNUM = 4;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        Random random = new Random();

        int randNum = random.nextInt(MAXRANDNUM);
        if (randNum >= MINRANDNUM) this.position++;
    }

    public boolean isMaxPostion(int maxPosition) {
        return (this.position == maxPosition)? true : false;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

}
