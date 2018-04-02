package racingGame;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class Car {
    private int position;

    public Car(int position) {
        this.position = position;
    }

    public Car move() {
        position += 1;
        return this;
    }

    public int getPosition() {
        return position;
    }


}
