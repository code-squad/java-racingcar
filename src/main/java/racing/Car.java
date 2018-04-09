package racing;

import java.util.Random;

public class Car {

    private String name;

    int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(Car car) {
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void movePosition() {
        if (assertCanGo())
            this.position += 1;
    }

    public static boolean assertCanGo() {
        return generateRandomNumber(9) >= 4;
    }

    public static int generateRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }

}
