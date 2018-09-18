package race;

import java.util.Random;

public class Car {
    private static final int RANDOM = 10;
    private static final int MOVE = 4;
    private static int max = -1;
    static Random rnd = new Random();
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

    public void maxPosition() {
        if (max < position)
            max = position;
    }

    public String victory() {
        if (max == position)
            return name + ",";
        return "";
    }

    public static int getMax(){
        return max;
    }
}
