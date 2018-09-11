package racing;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String name;
    private int carPosition = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public void setCarPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    @Override
    public int compareTo(Car c) {
        if(carPosition > c.getCarPosition()) return -1;
        else if (carPosition < c.getCarPosition()) return 1;
        else return 0;
    }
}