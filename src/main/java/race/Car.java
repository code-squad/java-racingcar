package race;

import java.util.*;

public class Car {

    private static final int RANDOM = 10;
    private static final int MOVE = 4;
    Random rnd = new Random();
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void go() {
        if (rnd.nextInt(RANDOM) >= MOVE)
            position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int maxSet(int max) {
        if(max < this.position)
            return position;
        return max;
    }
}
