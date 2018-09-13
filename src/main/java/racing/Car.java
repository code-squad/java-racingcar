package racing;

public class Car implements Comparable<Car>{
    static final char POSITION_IMAGE = '-';
    private String name;
    private int carPosition = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public void move(int distance) {
        carPosition += distance;
    }

    public String getCarDistance() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        for (int i = 0; i < carPosition; i++)
            sb.append(POSITION_IMAGE);

        return sb.toString();
    }

    public String getWinner(Car c) {
        return c.getCarPosition() == carPosition ? name + "," : "";
    }

    @Override
    public int compareTo(Car c) {
        if(carPosition > c.getCarPosition()) return -1;
        else if (carPosition < c.getCarPosition()) return 1;
        else return 0;
    }
}