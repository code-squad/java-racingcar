package racingcar;

public class Car {

    private static final int MIN_RANDNUM = 4;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // test용 생성자
    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }


    public int move(int randNum) {
        if (randNum >= MIN_RANDNUM)
            return ++this.position;
        return this.position;
    }

    public boolean isMaxPostion(int maxPosition) {
        return this.position == maxPosition;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

}
