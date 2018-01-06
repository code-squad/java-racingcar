package racing;

/**
 * Created by Joeylee on 2018-01-06.
 */
public class Car {

    private int distance;

    public void move() {
        this.distance ++;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void showDistance() {
        for(int i=0; i<=this.distance; i++) {
            System.out.print("-");
        }
    }
}
