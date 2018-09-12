package racingcar;

public class Car {
    private String name;

    private int position = 0;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void carInfo() {
        System.out.println(name + " " + position);
    }
}