public class Car {
    private int carPosition = 0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void plusMove(int num) {
        this.carPosition += num;
    }

    public String getName() {
        return this.name;
    }

    public int getCarPosition() {
        return this.carPosition;
    }

}
