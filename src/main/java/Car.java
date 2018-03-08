public class Car implements Comparable<Car> {
    private String name;
    private int position;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void oneRun(int randomValue) {
        if (randomValue >= 4) this.position++;
    }

    public boolean isWinnerPosition(int maxPosition) {
        return this.position == maxPosition;
    }

    @Override
    public int compareTo(Car car) {
        if (this.position > car.position)
            return 1;
        else if (this.position < car.position)
            return -1;
        else
            return 0;
    }
}