package racingGame;

/**
 * Created by hongjong-wan on 2018. 4. 3..
 */
public class Car {

    private static final int MOVE_CONDITION = 4;
    private String name;
    private int position;


    public Car(String name) {
        this.name = name;
    }

    public void move(int val) {
        if (MOVE_CONDITION <= val) {
            this.position += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


    public boolean matchFarthestPosition(int farthestPosition) {
        return this.position == farthestPosition;
    }

}
