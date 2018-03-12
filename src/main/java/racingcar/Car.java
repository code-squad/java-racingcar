package racingcar;

public class Car {

    private int position;
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

    public boolean move(int randomNumber) {
        if (randomNumber >= 4) {
           this.position++;
           return true;
        }
        return false;
    }
}