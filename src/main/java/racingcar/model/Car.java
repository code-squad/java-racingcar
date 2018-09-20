package racingcar.model;

import java.util.ArrayList;

public class Car {
    private static final int CONDITION = 4;

    private static int MAX_POSITION = 0;

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(int randomNum)  {
        if (randomNum >= CONDITION) {
            this.position++;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void judgeMaxPosition() {
        if(this.position > MAX_POSITION) {
            MAX_POSITION = this.position;
        }
    }

    public void compareMaxPosition(ArrayList<String> winners) {
        if (this.position == MAX_POSITION) {
            winners.add(this.name);
        }
    }

    // CarTest 확인용
    public int getMaxPosition() {
        return MAX_POSITION;
    }
}

