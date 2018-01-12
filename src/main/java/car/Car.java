package car;

import java.util.Random;
import java.util.stream.IntStream;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveCar() {
        move(randomInt());
    }

    public void move(int random) {
        if (random >= 4) {
            position += 1;
        }
    }

    public int randomInt() {
        Random ran = new Random();
        return ran.nextInt(10);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" : ");
        IntStream.range(0, position).forEach(i -> sb.append("&nbsp;"));
        return sb.toString();
    }
}
