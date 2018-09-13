package racingcar;

import java.util.Random;

public class Car {
    public String name;
    public int position = 0;

    public Car(String name){
        this.name = name;
    }

    public void moveRanCreate(int count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            run(rnd.nextInt(10), i);
        }
    }

    public void run(int move, int i){
        if (move >= 4)
            position += 1;
    }
}
