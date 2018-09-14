package racing;

public class Car implements Comparable<Car>{
    static final char POSITION_IMAGE = '-';
    static final int START_STANDARD = 4;
    private String name;
    private int carPosition = 0;

    public Car(String name) {
        this.name = name;
    }

    private int getCarPosition() {
        return carPosition;
    }

    public void move(int distance) {
        carPosition = distance >= START_STANDARD ? carPosition + 1 : carPosition;
    }

    public String getCarDistance() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < carPosition; i++)
            sb.append(POSITION_IMAGE);

        return sb.toString();
    }

    public String checkWinner(Car c) {
        return c.getCarPosition() == this.carPosition ? name : "";
    }

    @Override
    public int compareTo(Car c) {
        if(this.carPosition > c.getCarPosition()) return -1;
        else if (this.carPosition < c.getCarPosition()) return 1;
        else return 0;
    }
}