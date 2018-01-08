package car;

import java.util.Random;
import java.util.stream.IntStream;

public class Car {
    private int position = 0;

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

    public String getPosition() {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, position).forEach(i -> sb.append("-"));
        return sb.toString();
    }
}
