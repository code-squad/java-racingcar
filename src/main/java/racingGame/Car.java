package racingGame;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public Car move() {
        position += 1;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


}
