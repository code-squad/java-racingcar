package racingcar;

import java.util.Random;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public void run() {
        Random rnd = new Random();
        if (rnd.nextInt(10) >= 4)
            position += 1;
    }

    public String getUserName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
