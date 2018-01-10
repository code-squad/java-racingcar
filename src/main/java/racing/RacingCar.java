package racing;

public class RacingCar implements Car {

    private final static int MIN_FORWARD_NUMBER = 4;

    private int distance;

    @Override
    public void move(final int randomValue) {
        if (randomValue < MIN_FORWARD_NUMBER) return;
        this.distance++;
    }

    public void printCarDistance() {
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}