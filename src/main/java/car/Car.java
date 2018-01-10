package car;

import java.util.stream.IntStream;

public class Car implements Comparable<Car>{

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int position) {
        this.position += position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        IntStream.range(0,position).forEach(i->sb.append("-"));
        return sb.toString();
    }

    @Override
    public int compareTo(Car car) {
        return this.position - car.getPosition();
    }
}