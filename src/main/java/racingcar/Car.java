package racingcar;

import java.util.Random;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        Random random = new Random();

        int randNum = random.nextInt(10);
        if (randNum >= 4) this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

}
