package model;

public class Car {
    private int position;
    private String name;

    public Car(String name) {
        position = 0;
        this.name = name;
    }

    public void tryMove(int tryGo) {
        if (tryGo >= 4) {
            position += 1;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() { return this.name; }
}
