package racingcar;

import java.util.Random;

public class Car {
    static final int RESTRICTNUM = 4;
    static final int RANGE = 10;
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    //랜덤값 받기
    public int getRandNum() {
        Random random = new Random();
        return random.nextInt(RANGE);
    }

    //이동 거리 측정
    public int countMove(int distance, int randNum) {
        if (randNum >= RESTRICTNUM) {
            distance++;
        }
        return distance;
    }

    //자동차 이동하기
    public void moveCar(int tryNum, int distance) {
        for (int i = 0; i < tryNum; i++) {
            distance = countMove(distance, getRandNum());
        }
        this.position = distance;
    }

    public boolean checkMax(int getPos) {
        if (this.position == getPos) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
