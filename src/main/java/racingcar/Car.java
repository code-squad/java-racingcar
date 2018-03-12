package racingcar;

public class Car {

    private int position = 0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void go(int randomNumber) {
        if (randomNumber >= 4) {
            position++;
        }
    }
}