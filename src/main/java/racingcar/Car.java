package racingcar;

public class Car{
    static final int MOVE_CAR = 4;

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public void movePosition(int i) {
        if (i >= MOVE_CAR) {
            this.position ++;
        }
    }
    public boolean isMaxPosition(int i) {
        if (this.position == i) {
            return true;
        }
        return false;
    }

    public int compareMaxPosition(int max) {
        return Math.max(this.position, max);
    }

    public void printCarName() {
        System.out.print(this.name);
    }
    public void drawDash() {
        String dash = "";
        for (int i = 0; i < this.position; i++) {
            dash += "-";
        }
        System.out.println(dash);
    }
}