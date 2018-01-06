import java.util.Random;

/**
 * Created by hoon on 2018. 1. 6..
 */
public class Car {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void move() {
        if(shouldMove(getRandom())) {
            this.position++;
        }
    }

    public boolean shouldMove(int num) {
        return num >= 4;
    }

    public int getRandom() {
        return new Random().nextInt(9);
    }

    public void print() {
        for(int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
