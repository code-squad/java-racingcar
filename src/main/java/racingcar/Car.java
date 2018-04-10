package racingcar;

import java.util.Random;

public class Car {
    private int position;
    private String carName;
    private static Random random = new Random();

    public Car(String carName) {
        this.carName = carName;
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName;
    }


    void addPosition() {
        if(getRandomValue() >= 4)
            position++;
    }

    int getRandomValue() {
        return random.nextInt(10);
    }
}
