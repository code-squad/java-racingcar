package racing;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class Car {

    private int distance;

    public boolean move(int randomValue) {

        if(randomValue >= 4) {
            this.distance ++;
            return true;
        }
        return false;
    }

    public int getDistance() {
        return distance;
    }


}
