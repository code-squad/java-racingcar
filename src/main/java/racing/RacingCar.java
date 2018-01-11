package racing;

public class RacingCar implements Car, Comparable<RacingCar> {

    private final static int MIN_FORWARD_NUMBER = 4;

    private int distance;
    private String name;

    public RacingCar(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move(final int randomValue) {
        if (randomValue < MIN_FORWARD_NUMBER) return;
        this.distance++;
    }

    public void printCarDistance() {
        System.out.print(String.format("%s : ", name));
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public int compareTo(RacingCar o) {
        return distance - o.distance;
    }
}