package car;

import java.util.ArrayList;
import java.util.List;

import static util.Static.*;

public class Car implements Comparable<Car> {
    private String name;
    private int currentPosition;

    public Car(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public static List<Car> createCars(List<String> names) {
        List<Car> cars = new ArrayList<>();

        for(String name : names)
            cars.add(new Car(name));

        return cars;
    }

    public Car setCurrentPosition(int newPosition) {
        currentPosition = newPosition;
        return this;
    }

    public void tryMove(int randomNum) {
        if(randomNum >= MOVE_STANDARD_NUM)
            currentPosition++;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " : ");
        for(int i = 0 ; i < currentPosition ; ++i)
            sb.append(MOVE_MARK);

        return sb.toString();
    }

    @Override
    public int compareTo(Car compareCar) {
        return compareCar.getCurrentPosition() - getCurrentPosition();
    }

    public boolean isMaxPosition(int maxScore) {
        return currentPosition == maxScore;
    }
}
