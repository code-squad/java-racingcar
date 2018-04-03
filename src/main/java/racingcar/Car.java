package racingcar;

import java.util.Random;


/**
 * Created by Administrator on 2018-04-02.
 */
public class Car {

    private String name;
    private int position = 0;
    private static final int MOVE_CONDITION = 4;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int randomNumber){
        if(randomNumber >= MOVE_CONDITION){
            position++;
        }
    }
}
