package racing;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class Car {

    private String name;
    private int distance;

    public Car(String name) {
        this.name = name;
    }

    public boolean move(int randomValue) {
        if(randomValue >= 4) {
            this.distance ++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public int getDistance() {
        return distance;
    }
}
