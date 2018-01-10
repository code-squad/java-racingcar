package racinggame;

public class Car {
    private static final int FORWARD_NUM = 4;

    private int position = 0;

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position= position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int move(int number) {
        if (number >= FORWARD_NUM) {
            position++;
        }
        return position;
    }

    public boolean matchPosition(int maxPosition) {
        return this.position >= maxPosition;
    }
}
