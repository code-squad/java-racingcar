import java.util.Random;

public class Car {

    private int position;

    public Car() {
        this.position = 0;
    }

    public int move(int rand) {
        if (rand >= 4) {
            ++position;
        }

        return position;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }

}
