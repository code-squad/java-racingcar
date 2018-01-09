package racing.model;

import racing.DeciderToGo;

public class Car {
    private static final int START_POSITION = 0;

    private String name;
    private int position;

    public static Car newInstance(String name) {
        return new Car(name, START_POSITION);
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(DeciderToGo deciderToGo) {
        if (deciderToGo.isPossibleToGo()) {
            position++;
        }
    }

    public boolean matchPosition(int position) {
        return this.position == position;
    }
}
