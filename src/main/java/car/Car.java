package car;

import random.CarRandomUtils;

import java.util.stream.IntStream;

public class Car implements Comparable<Car>{

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int range, int standard) {
        this.position += calculateIsPossibleGoForward(range, standard);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }


    public int calculateIsPossibleGoForward(int range, int isMovablesStandard) {
        return isMovable(CarRandomUtils.makeRandomNumber(range), isMovablesStandard) ? 1 : 0;
    }

    public boolean isMovable(int random, int standard) {
        return random > standard;
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