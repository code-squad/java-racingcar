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

    public String getPositionString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < this.position; i++)
            builder.append("&nbsp;");
        return builder.toString();
    }

    public int getPosition() {
        return position;
    }

    public String getName() { return this.name; }
}
